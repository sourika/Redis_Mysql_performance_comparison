# Module_04_Project_JavaRush_Redis_Mysql_performance_comparison
This is a Maven project using technologies such as MySQL, Hibernate, Redis, Docker. The speed of retrieving the same data from MySQL and Redis is compared. We observe an improvement in response performance for a 'sluggish frequent' database query.

**What was done?**

**1. Dependencies were connected**
* for connecting to MySQL databases:
    * mysql: mysql-connector-java-8.0.30  
* for mapping:
    * org.hibernate: hibernate-core-jakarta-5.6.15.Final
* for using Hibernate as the ORM framework:
    * org.hibernate.hql: hibernate-hql-lucene-1.5.0.Final
* Java Redis client for Redis interaction:
    * io.lettuce: lettuce-core-6.2.2.RELEASE
* for debugging and monitoring database interactions:
    * p6spy: p6spy-3.9.1
* for using ObjectMapper for data serialization:
    * com.fasterxml.jackson.core: jackson-databind-2.15.1
    
**2. File spy.properties was created to view queries with parameters that Hibernate executes**

**3. All necessary entity classes were created and their mapping to 'world' schema tables was done**

**4. Started MySQL server and Redis server as docker containers**

**5. A method is written to retrieve all data from MySQL**

**6. A method of data transformation is written (we will only write to Redis the data that is requested frequently)**

**7. Recorded data in Redis**

**8. Methods are written to retrieve data from Redis and from MySQL**

**9. Comparing the speed of retrieving the same data from MySQL and Redis**
