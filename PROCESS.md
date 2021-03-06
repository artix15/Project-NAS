# Day 2 (8 Jan)

**Goals**

- [x] **Draft the design document**
- [x] **Look for efficient prototyping tools**: I looked at [Google Prototyping Video's](https://www.youtube.com/watch?v=JMjozqJS44M&t=1s). Also, I found several tools to make prototypes easily (as see in second video) such as [Proto.io](https://proto.io/) and [Adobe XD](https://www.adobe.com/products/xd/ui-design-kits.html). I went for the second because it has UI kits such as [Material Design](https://material.io/) and can partially be converted in Android studio
- [x] **Make a first prototype**: A very quick prototype has been made and a [video](https://www.youtube.com/watch?v=p5YkaQjKWw0&feature=youtu.be) demonstrating the idea
- [x] **Get feedback on prototype**
            6 people gave feedback on my prototype. Main critical points were: it doesn't look good, the sidebar, it's cluttered and there are too many unnecessary option. 
            The book "***Don't make me think***" was recommended.

      New hand drawn drafts for [teacher side](https://github.com/artix15/Project-NAS/blob/master/Prototypes/Zaker%20Adventure%20Prototype/Draft%20Teacher%20side.jpg) and [student side](https://github.com/artix15/Project-NAS/blob/master/Prototypes/Zaker%20Adventure%20Prototype/Draft%20student%20side.jpg) have been made.

      ​

# Day 3 (9 Jan)

- [ ] **Fix GitHub problems**
            Unsolvable! 
- [x] **Read a summary of "*Don't make me think*"**
            The book is more about web design but a lot of the idea's are applicable here.
- [x] **Create a second proper prototype based on feedback and new draft**

      Second prototype [video](https://www.youtube.com/watch?v=dPi2C28WYpQ&feature=youtu.be&fbclid=IwAR1snFk3T4RJoFFlXDoGs7b4SqR7w5wlb-OdB_xoOOzI8z6aajFOlQEQEVU). 

      To simplify the project: 

      - I will only keep 2 sample users and no more.
      - It will be only about **one subject** so as a student you only have quizzes instead of having several courses with quizzes for each course.

# Day 4 (10 Jan)

- [x] Complete the ZAKER prototype by adding teacher functionality: [Video](https://youtu.be/h-DTupYigps). Feedback included that the teacher parts with more pleasing to look it since that background wasn't very cluttered and neat.
- [x] Get a basic overview in App Studio 
- [x] Start with the Image and Text Processing scripts

      ​

 # Day 5 (11 Jan)

- [x] **Get feedback on the design**
         A feedback has been very positive so far and much better than the first prototype.
- [x] **Mentor Meeting and check that my project and proposal are all right.**
- [ ] ~~**Create the Zaker prototype UI interface in Android Studio**~~
            ~~The elements created in Photoshop can be imported as drawable.~~ Feedback was: the design looks good and fun but is not really about an educational app. So I decided to have a blank design for now and  focus on the functionality.
- [x] **Finish the Zaker Prototype in App studio (all the activities, navigation and test functionality)**
            Good progress but not finished

      I have decided to leave out the following for the Alpha Version:

      - Any graphics and UI creation until the functionality is done properly. Not only does it cost time, but feedback about it hasn't been very positive
      - I will have 3 sample quizzes hardcoded for the teacher. In the future it will be data coming from Python scripts that processed images.
      - No API's will be used for now. The teacher will save questions for the quizzes to the Data Base and the student will read them from there.

# Day 6 (14 Jan)

- [x] **Continue on the Zaker Prototype in App studio (all the activities, navigation and test functionality)**

- [x] **Get [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart) to work properly**: [Screenshot of the test](https://github.com/artix15/Project-NAS/blob/master/Documentation/BasicLineChart.png)

- [x] **Create test chart for Student Progress**

- [x] **Question class and adapter for the quizzes**

- [x] **Create Database, save quizzes and read from it**

            ​

# Day 7 (15 Jan)

- [x] **Create 3 sample quizzes a teacher can add**
- [x] **Display word list after being added**
- [x] **Allow the quizzes to be sent to the data base and to read them **
- [x] **On the student side, read the words from the data base**
- [x] **Create a simple True/False quiz with the words**

      ​

# Day 8, 9 (16, 17 Jan)

Nothing new. The code from yesterday is still not working properly. 

      Everything works now; however, from the student side you can't choose from different quizzes anymore, just answers the most recent questions added.

      ​

# Day 10, 11, 12

      Sick

      ​

# Day 13

- [x] Add functions to the data bases to add quizzes, 
- [x] retrieve quizzes, 
- [x] add results,
- [x] Link the tables together
- [x] Create the quizList and its adapter
- [x] Create the wordList and its adapter
- [x] Make sure every quiz contains only the words associated with it (read only that from database)

 # Day 14 (24 Jan)

- [x] Clean up all the code and add proper comments

 # Day 15 (25 Jan)

- [x] Fix created GitHub issues
           Most issues have been fixed.

- [x] Create student visualization as a bar chart for every quiz 

- [x] Create teacher visualization as a line graph with an option to change the student

- [x] Create community version for Teacher

- [x] Create community version for Student

            ​

# Day 16 (26 Jan)

- [x] Code to add words to a quiz
- [x] Allow adding a quiz from scratch
- [x] Group classes and Activities
Organizing code in different packages was done according to [CodePath Guide](https://guides.codepath.com/android/Organizing-your-Source-Files#organize-packages-by-category).
- [x] Allow deleting words (only for teacher)
- [x] Allow deleting quizzes (only for teacher)
- [ ] ~~Publish words to the API~~
- [ ] ~~Publish quizzes to the API~~
- [ ] ~~Publish results to the API~~
I won't create an API like we did in Trivia anymore. All the processing will be done with the local database. For future work, the same will be used only with a Real-time data base like the community function.
- [ ] ~~Allow getting definitions from dictionary API~~  
This will be put as **extra**
- [x] Make nice graphics 

# Day 17 (27 Jan)

- [x] Add rotation functionality 

- [x] Issue #9 Fix onClick Listeners

Having inner classes instead on anonymous classes isn't always better [1](http://tseng-blog.nge-web.net/blog/2009/02/14/implementing-listeners-in-your-android-java-application/). That said, most places now have inner classes but not all of them.  

- [x] Fix Back Navigation for all activities 

      ​

# Day 18 (28 Jan)

- [x] **Test the app on users and gather feedback**
Clicking on chat rooms doesn't always works 
Within a ChatRoom put its name up top
Creating quizzes and adding words isn't completely obvious to non-experienced users

- [x] **Investigate code for any bugs**
            There are still issues with the StudentQuizActivity. Like the number of questions a student gets is hard coded to 6. 

            All bugs have been added as issues on GitHub

# Day 19 (29 Jan)

- [x] Fix the bugs discovered and implement the feedback 
- [x] Import graphics created with Photoshop and Adobe XD 
- [x] Fix themes, colors and design

