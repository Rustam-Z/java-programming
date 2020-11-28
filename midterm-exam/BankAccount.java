import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 1.2;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 1.2;
        this.dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void withdraw(double amount){
    	if (amount<=0) {
    		throw new RuntimeException("Invalid amount.");
    	}
    	if (amount<=this.balance) {
    		this.setBalance(this.balance-amount);
    	} else {
    		throw new RuntimeException("Not enough funds");
    	}
    }

    public void deposit(double amount){
    	if (amount<=0) {
    		throw new RuntimeException("Invalid amount.");
    	}
    	this.setBalance(this.balance+amount);
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return (this.annualInterestRate / 12) * this.balance;
    }

    public double accept(Visitor visitor){
        return visitor.visit(this);
    }
}


public interface Visitor {
    double visit(Account account);
}

public class TaxCalculator implements Visitor {
    @Override
    public double visit(Account account) {
        return 0.05 * account.getAnnualInterestRate() * account.getBalance();
    }
}

public class DailyInterestCalculator implements Visitor {
    @Override
    public double visit(Account account) {
        return (account.getMonthlyInterestRate() / 30) * account.getBalance();
    }
}

// Problem 3 optional part
public class AccountTest {
    public static void main(String[] args) {
        Visitor v1 = new TaxCalculator();

        Account account = new Account(123, 100);

        double tax = account.accept(v1);
        System.out.printf("Annual tax: %.2f$%n", tax);

        v1 = new DailyInterestCalculator();
        double dailyInterest = account.accept(v1);

        System.out.printf("Daily interest: %.2f$%n", dailyInterest);
    }
}
