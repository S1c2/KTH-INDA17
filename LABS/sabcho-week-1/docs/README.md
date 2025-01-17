If written answers are required, you can add them to this file. Just copy the relevant questions from the root of the repo, preferably in [Markdown](https://guides.github.com/features/mastering-markdown/) format :)

**GITHUB TASK**

**Exercise 0.1**

**What are the two things you need to do to pass an assignment?**

I must attempt to complete all tasks and attend the exercises.

**Exercise 0.2**

**When, at the latest, must your assignment be pushed to KTH GitHub? It may be helpful to use a hypothetical example.**

E.g. If the deadline is 8:15 friday, it means that I have until 8:14 friday to push my assignment to GitHub.

**Exercise 0.3**

**What should you do if you know that you are unable to attend an exercise, or submit the assignments in time?**

I must contact my assistant as soon as possible.

**Exercise 0.4**

**When names/headers of classes and methods are given, should you use them exactly as they are given? Why or why not? Do uppercase and lowercase letters matter?**

I must use them exactly as they are given. Capitalization matters. This is to make it easier for the assistants to correct the assignments.

**Exercise 0.5**

**Is it okay to copy solutions from another student, if you do it just once in a while?**

Copying solutions are absolutely forbidden. If I work too closely with another student on an assignment - I must make a note of this in the source code/question answers.

**Exercise 0.6**

**Give two examples of when it is not okay to copy code from the internet.**

If it essentially solves the whole task and if I do not understand how the code works.

**Exercise 1.31**

**What are the types of the following values?**

*  0 = int
* "Hello" = String
* 101 = int
* -1 = int
* True = boolean
* "33" = String
* 3.1415 = double

**Exercise 1.32**

**What would you have to do to add a new field, for example one called name, to a Circle object?**

In the source code : there is an area where we declare all of our variables/fields. In that area we add : private String name;

public class Circle
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
   **private String name;**
    
**Exercise 1.33**

**Write the signature for a method named send that has one parameter of type String, and does not return a value.**
**Assistant's note: If you feel confused about what a method signature should look like, you are not alone, because the authors of Objects First with Java are too! In the 5th edition, the definition on page 7 is incorrect. This has been fixed in the 6th edition, but they have left out a concrete example and mix it up again later in the book. For the correct definition with example, see Defining Methods from Oracle's Java documentation. Both versions will be accepted, but do note that it is the one from the Oracle documentation that is actually correct.**

Definition: Two of the components of a method declaration comprise the method signature—the method's name and the parameter types.

send(String)

void means that the method does not return a value, however it is not a parameter and so is not included in the method signature

**Exercise 1.34**

**Write the signature for a method named average that has two parameters, both of type int, and returns an intvalue.**

average(int, int)

