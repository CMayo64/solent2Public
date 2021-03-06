<<<<<<< HEAD
# Week 7 - Using JPA or JDBC for model persistance


# Exercises for week 7

## Set up
1. remember to merge your project with the upstream project
2. create a new 'week7' folder under your myPracticeCouseWork folder.
3. copy the contents of week7 into this folder and modify or add to the code here as needed. (NB only change any code in myPracticeCouseWork).

## Exercise 1 MOCK TCA

This week we will be doing a mock Time Constrained Assessment.
This will last 2 hours from when we start. 
The TCA is here

[mocktca](../week7/mocktca) 

## Exercise 2 project

Last week you worked on jpaExample1 which introduced you to modelling some objects which will be of use in your project.


You were asked to complete a use case and robustness diagram for the following scenario. 

A doctors surgery has a number of doctors and patients. 
The receptionist needs to be able to add, delete and modify patients in the system
She also needs need to be able to book modify and cancel appointments with particular doctors for particular patients.

You were also asked that given the two Patient and Appointment DAO's you now have, what methods should a serviceFacade provide to enable the upper layers?

you were also asked to write a test class for the model to ensure objects can be marshalled and unmarshalled using JAXB 
Remember you will need a jaxb.index file in each package.

This week I have refactored the jpaExample1 code into a larger project which you can choose to uses to start your implementation of your assessment.

This template is here: [project](../week7/project)
It provides the basic structure and working example classes for you to begin to get your application working.

I will provide you with other options for implementation later in the course but for now, this JPA based project will be a good start.

You need now to compare your jpaExample1 model with the model in [project](../week7/project) and begin to think how thsi project can be used as a starting point for your implementation.
=======
# Template Ticket Machine project

This 1.3 version of the template project has the following features

1. removed all old com406 code not needed

2. added JAXB based daos to load station and charging details

3. added JPA based DAOs to persist Stations and Ticket Machines in controller

4. added jsp's in client and controller to display stations 

5. updated the UML claoss idagram to reflect new classes


you will need to

* write out some clear usecases to understand what you need to implement above hat has been done for you
* look at the tests to see how the charging DAO's are used
* create station controller JSP's to modify stations and add gates to stations
* complete ReST code to generate stationconfig

* create ticket machine code to generate and for a gate to validate a ticket 
* create code for the ticket machine to load it's config - you could use a button on a JSP to force a reload or use a timer to regularly update configuration.

>>>>>>> upstream/master
