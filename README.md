# Employee CSV Project

Group project to read employee information form a CSV file and store it on a database

# Table of Contents

* [Importing Employee Data from a CSV file](#Importing Employee Data from a CSV file)
* [Storing Employee Data](#Storing Employee Data)
* [Sending Employee Data to a Database](#Sending Employee Data to a Database)
* [Logging](#Logging)
* [Test](#Tests)
* [Contributors](#Contributors)


## Importing Employee Data from a CSV file

## Storing Employee Data 
THIS CLASS IS MADE SPECIFICALLY FOR THE USE/FORMAT OF THE INCLUDED "EmployeeRecords.csv" FILE
<br /> <br />
The Employee class within the model directory is used to store all the fields from the EmployeeRecords.csv file
as their own separate values.
<br />
The class does this through its constructor (shown below)
```
public Employee(String[] employeeData) {
this.setEmpId(Integer.parseInt(employeeData[0]));
this.setNamePrefix(employeeData[1]);
this.setFirstName(employeeData[2]);
this.setMiddleInitial(employeeData[3]);
this.setLastName(employeeData[4]);
this.setGender(employeeData[5]);
this.setEmail(employeeData[6]);
this.setDob(employeeData[7]);
this.setDateOfJoining(employeeData[8]);
this.setSalary(Integer.parseInt(employeeData[9]));
}
```
The constructor takes a string array as a parameter then sets the values in the class using its private setter functions.
<br />
The class has public getter functions for all fields of data and all share the same name as their setters. 

## Sending Employee Data to a Database

## Logging

## Tests

## Contributors

* George Gregory
* Michael Makam
* Tony Parsons
* Reshman Siva