# glaucusProblem
Solution for the task assigned for the post of java developer

    Task
        {
        The task is to consistently increment a number in a database when parallel threads are racing to increment the number.
        Create a table Number in MySQL database with one integer type field.
        Create a RESTful API using Spring MVC architecture that increments this number.
        Use Jmeter (Do not use postman because it does not send parallel requests) to call this API with 5000 users so that a lot of parallel requests are sent to server to             increment the number.
        Now set the initial value of Number to 0.
        After the execution of Jmeter, the value of the number in the database shall be 5000. (Try the same with a bigger number 100000)
        The API should be scalable i.e. if deployed on multiple machines with same database, the result should be consistent.
        }
        

## API Documentation
Visit this link for the API documentation
https://atikash.github.io/glaucusProblem/javadoc/

## Steps to test
###  Step 1
    Download and install MySql.
    
###  Step 2
    either use the .sql file present inside the 'Extra_Resources' folder or simply run each command present in the file one by one to setup the database.
    
### Step 3
    use 'select * from number;' to verify that there is only one entry in the table with id=0 & number=0.
    
### Step 4
    Checkout the code and build the maven project locally.
    
### Step 5
    in the application.properties files please make changes for the below fields
    
       spring.datasource.url=jdbc:mysql://{host}:3306/glaucusproblem     
              replace {host} with the ip of the machine where MySql is running (in case of loal machine use 'localhost')
              
       spring.datasource.username={username}
              replace {username} by the username of the MySql
              
       spring.datasource.password={password}
              replace {password} by the password of the MySql for the above username.
              
### Step 6
    start the springboot application ( Run com.glaucus.problem.ProblemApplication.java )
    
### Step 7
    verify that the server has started and it is up and running.
    
### Step 8
    Download and install Jmeter.
    
### Step 9
    start Jmeter  
### Step 10
    use the .jmx file present under the 'Extra_Resources' folder of this project.
    To import the test plan from this .jmx file in jmeter
      go to File->open
     and browse to the  location of the .jmx file in your local machine.
     
     {note- in case an error message pops up please ignore it}
     
### Step 11
    you can modify the number of threads and no of loops to execute the test in the 'Test Plan-> Thread Group' of the test plan
    you can change the URL in the 'Test Plan-> Thread Group-> HTTP Request'
    
### Step 12
    Run the test plan by clicking on run icon

### Step 13
    to view test result use 
    Test Plan-> Thread Group-> HTTP Request -> Summary Report
                                            -> View Results Tree
                                            -> Response Time Graph
      
    
  
 
    

