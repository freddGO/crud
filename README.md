crud
====

CRUD operations using ExtJS 4.2, Spring MVC 4 - REST, HIbernate 4.2, TC Server 6, hsqldb, jackson, jdk7, technologies

This example shows how to implement a ExtJS Store component using a REST proxy.

After you have cloned this repository you need to follow the below steps in order to deploy this app,

1) Update the maven depencies.
2) Clean and install the application.
3) Launch the HSQLDB server by executing the following Maven exec plugin:
          exec:java -Dexec.mainClass="org.hsqldb.Server" -Dexec.args="-database.0 file:target/data/CRUD"
4) Set up TC Server v6.
5) To see that records is storing properly, start up the built-in HSQL DB Manager by executing (in terminal);
          java -cp ~/.m2/repository/org/hsqldb/hsqldb-j5/2.2.4/hsqldb-j5-2.2.4.jar org.hsqldb.util.DatabaseManager
5) Enjoy it.

It is worth to mention that I have used Eclipse as IDE.

Regards,
Alfredo Guillen.

  
