# COM187 - Coursework Three

## Scenario

You are the teacher of a primary school class and you want to have a system that allows you to record which fiction and non-fiction books are lent to your pupils. 
 Your system should have a menu system along the following lines (you can have sub-menus if you deem that to be necessary)  

**1) Add Books**
- The teacher should be able to add relevant details about fiction and non-fiction books available for loan (NB: there is only one copy of a book available for loan).   

**2) Display the books available for loan**
- The system should display the fiction and non-fiction books available for loan  

**3) Display the books currently out on loan**
- The system should display the fiction and non-fiction books that are currently out on loan and which pupil has borrowed them 

**4) Make book loan**
- If a pupil borrows a book, the system should record the date that it is rented, the name of the book is and what the pupil’s name is  
 
**5) Return book**
- Once a pupil returns a book, then the book should be made available for loan  

**6) Write details to file**
- Your system should be able save the details of a loan to file 

## Functional Requirements

Your Java program must have the following:   
- A Book superclass with appropriate properties and methods  (including accessor and mutator)
- A Fiction subclass and a NonFiction subclass – these subclasses will extend the Book superclass and have their own properties and methods
- Appropriate use of arrays of objects (or ArrayLists of objects) that utilise the two subclasses
- Appropriate use of toString methods
- Appropriate use of validation of user entry
- Appropriate use of comments
- An application class that will run the menu described in the scenario

## Non-Functional Requirements   

There will be no extra marks given for the following, but you can implement them for your system if you so choose:   
- Instead of a menu-based system on the console window, you can have a GUI menu system
- Instead of the teacher entering in the details of book available for loan, the items’ details can be read in from text files
- Using the Java Date class to record the dates of loans 

___

[![footer](http://imgserv.mythicalcuddles.xyz/Signature.png)](https://github.com/MythicalCuddles)
