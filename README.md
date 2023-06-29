# Springboot_CRUD
This is the Springboot application for the CRUD operations using the H2 database.

# Creating the Sping boot aplication 
1 initilise the application uisng the spring initializr start.spring.io
	you can set the project : Mevan
	group: com.Rakesh 
	artificate : CRUD
	select the dependencies JPA, H2, web
 <img width="1650" alt="Screenshot 2023-06-29 at 2 53 44 PM" src="https://github.com/Rakesh-vk/Springboot_CRUD/assets/83536408/42eb1a84-fe5d-4b1c-a3d5-b52a6072bbb8">

2 generate the file.

#open the application using the eclipse or Intelij or Spring tool suite(Windows).
# test the database connection 
1 the connections can be tested before making farther implementation.
2 to test the connection make change in the /src/main/resource/applicaion.properties file


# Creating the model 
the model is file where we define the veriables to be used.

1 create a folder in the src/main/java/com/Rakesh/CRUD/model as user.java for the user realted veriables.
different model can be created for the different models


# Creating the Service 
the service is the file where the process takes place and the code for the specific function is written

1 create a folder in the src/main/java/com/Rakesh/CRUD/service as userServiceImpl.java and userService.java.
2 userService.java is a interface to define the functions being used.
3 userServiceImpl.java is a java class to write the function body.


# create the Repository
the repository is the conection between the service layer and the database.
1 creating the userRepository.java interface to extend the JpaRepository<"primary Key",datatype>

#create a controller
the controller is the entry point for any web request all the web request come to the controller first and then it is transfered for the specific service function.
1 create the userController.java 

one of the disadvantage of using the H2 database is that the data will be ereased once the program terminates the data will be ereased.
we can use the commandlinerunner to insert some value in the database at the start of the application.
and one of the advantage of the H2 dataase is that there is no need to setup any database server.
, this is very handy when we start with the CRUD operation learning.

