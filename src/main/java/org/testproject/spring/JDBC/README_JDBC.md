## Spring JDBC
While working with the database using plain old JDBC, it becomes cumbersome to write unnecessary code to handle exceptions, opening and closing database connections, etc. However, Spring JDBC Framework takes care of all the low-level details starting from opening the connection, prepare and execute the SQL statement, process exceptions, handle transactions and finally close the connection.

So what you have to do is just define the connection parameters and specify the SQL statement to be executed and do the required work for each iteration while fetching data from the database.

DataSource in the XML file with a piece of code as shown in the following code snippet −

<bean id = "dataSource" 
   class = "org.springframework.jdbc.datasource.DriverManagerDataSource">
   <property name = "driverClassName" value = "com.mysql.jdbc.Driver"/>
   <property name = "url" value = "jdbc:mysql://localhost:3306/TEST"/>
   <property name = "username" value = "root"/>
   <property name = "password" value = "password"/>
</bean>

## Spring - JDBC Batch Update
A JDBC batch update is multiple updates using the same database session. That is, we don't have to open connections multiple times.



It is possible to call SQL stored procedure while using JDBC in Spring.

##Transactions

A database transaction is a sequence of actions that are treated as a single unit of work.

Atomicity − A transaction should be treated as a single unit of operation, which means either the entire sequence of operations is successful or unsuccessful.

Consistency − This represents the consistency of the referential integrity of the database, unique primary keys in tables, etc.

Isolation − There may be many transaction processing with the same data set at the same time. Each transaction should be isolated from others to prevent data corruption.

Durability − Once a transaction has completed, the results of this transaction have to be made permanent and cannot be erased from the database due to system failure.

