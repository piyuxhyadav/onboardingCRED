### Problem Statement:
1. Create an user in the system
2. Fetch the user details by user id
3. Edit/Modify the user details
4. Delete the user (soft delete)


#### User:
Defined a user class having the following attributes:
* user_id: Integer, auto generated primary key for the mySQL DB
* firstName: String, First name of the user
* lastName: String, Last name of the user
* phoneNumber: String, phone number of the user
* softDelete: String, whether the user is soft deleted or not.


### API Calls:

1. GET: "/users" => will provide all the users
2. GET: "/users/{id}" => will provide the user with the provided id.
3. GET: "/users" provided with the parameters prefix and prefixType will provide a list of users with the prefix of the prefix type, for eg: if prefix="P" and prefixType="FIRST_NAME" it will provide us all the users whos first name starts with P.
4. POST: "/users" can add user to the users table in mySQL.
5. PUT: "users/{id}" will update the details of the user with the provided user_id.
6. DELETE: "/users/{id}/softDelete" will soft delete the user with the provided user_id.
7. DELETE: "/users/{id}" will delete the user with the provided user_id.
