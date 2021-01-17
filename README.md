# glaucusProblem
Solution for the task assigned for the post of java developer

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
    start Jmeter by following running jmeter.bat file present inside bin folder of jmeter package
  
### Step 10
    use the .jmx file present under the 'Extra_Resources' folder of this project
    to import the test plan from this .jmx file in jmeter
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
      
    
  
 
    

