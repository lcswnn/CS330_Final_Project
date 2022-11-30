# CS330_Final_Project

**HOW IT WORKS**

This programming assignment has the ability to "lock and unlock" a mechanism and uses an already set sequence of numbers as the locking and unlocking codes. These codes are the last 5 digits of an A number, followed by a 1 to unlock and a 4 to lock. This program first guesses a random number, and does so until the number it comes up with contains the locking or the unlocking code preset by the programmer. It then will tell you how long it took to find a number that locked/unlocked a code. To follow the criteria of testing, the locking code was commented out, and the system was tested to see how fast it can guess a number that contains the codes.

**HOW TO BUILD AN EXECUTABLE**

Buidling an executable is a somewhat annoying process on MacOS. First, you have to create new folders in the finder and then create new 'classes' and 'sources' folders. You then drag the .java files into the 'sources' folder. You then go into your terminal and type some terminal commands to create .class files of your .java files. After that, you create your manifest.txt files and also save that into your 'classes' folder. After that, you have to use more terminal commands and then you end up with an executable file you can send to others. 

**HOW TO RUN THE EXECUTABLE**

To run the executable, you need to clone the git repository in a terminal and go to the directory where the cloned repository is located. You then can go into the repository (using **cd CS_330_Final_Project**). Once in the repository you can type in the terminal: **java -jar KeyPadGUI.jar**. This should run the executable file and an interface with a button should pop up. When you press the button, it will give the status of the lock, how long it took the program to run, and how long it would take a hacker to hack the code if given 1 second per guess. (Finding how long it takes the lock to unlock, the status will always say unlocked. This is because it finds how long it would take for a program like this to find the codes.)

**HOW TO GENERATE UNIT TEST COVERAGE**

Unit test coverage in this program is generated by the JUnit Testing in java. The unit test coverage would come from the pop-up window that the JUnit testing would be found in. The testing window would turn green when the tests all pass, and red if the tests all fail. You can also find if something is not used in the program. This is found by looking at if anyting in the program is underlined yellow. If so, then it is not used in the program and therefore is not used or covered. 

**PLATFORM BEING TESTED ON**

All of this is being coded on Eclipse IDE.
Tested .jar files on MacOS and Windows 11.
Files uploaded to GitHub.
