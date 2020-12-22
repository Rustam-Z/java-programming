# MySQL

- How to open MySQL command line: https://www.tutorialspoint.com/how-to-open-mysql-command-line-on-windows10

- Key points:
    - Connection between application and database
    - How to retrieve the data from database
    - How to insert data into database

- JBDC - Java Database Connectivity

- `set path=%path%;C:\mysql-connector-java-5.1.49;`

- `javac -cp "C:\mysql-connector-java-5.1.49\mysql-connector-java-5.1.49-bin.jar;" JDBCExample.java`

- `executeUpdate() `: This method is used for execution of DML statement(INSERT, UPDATE and DELETE) which is return int value, count of the affected rows. 

- `executeQuery()` : This method is used to retrieve data from database using SELECT query.
