 --To Start Database Manager from HSQL DATA BASE MANAGER
 --java -cp ~/.m2/repository/org/hsqldb/hsqldb-j5/2.2.4/hsqldb-j5-2.2.4.jar org.hsqldb.util.DatabaseManager

--To see if App created a User table
SELECT TABLE_NAME, COLUMN_NAME, TYPE_NAME, COLUMN_SIZE, DECIMAL_DIGITS, IS_NULLABLE FROM INFORMATION_SCHEMA.SYSTEM_COLUMNS WHERE TABLE_NAME NOT LIKE 'SYSTEM_%'
select * from CUSTOMER