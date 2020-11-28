import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;


    public Account() {}

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    double getMonthlyInterest() {
        return (annualInterestRate/12)*balance;
    }

}

interface Visitor {
    double visit(Account account);
}

class TaxCalculator implements Visitor {

    @Override
    public double visit(Account account) {
        return null;
    }
}

class DailyInterestCalculator implements Visitor {

    @Override
    public double visit(Account account) {
        return null;
    }
}
