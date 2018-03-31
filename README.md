# UserDetails Version 2
SpringBoot Application to store user details


## Use a PostgreSQL database in a Spring Boot Web Application through Hibernate


### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions with the database:
  
  * URL: /api/user`
	Method Type:Post
	Input Request:
		{
			"user":
			{
				"firstName":" Enter firstname here",
				"lastName":"Enter lastName here",
				"emailId":"Enter emailId here"
			}
		}
	Description:
				Creates a new user with an auto-generated id and email and name as passed values.
				
	
  * URL: /api/user/{userId}`
	Method Type:GET
	Description:
				Retrives user details based on given user id.
				

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for the
database connection.

#### Prerequisites

- Java 7


#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.
