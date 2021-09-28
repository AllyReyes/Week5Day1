package com.company;

import java.util.Scanner;

public class Main //One of my most common Java mistakes forgetting (or accidentally erasing the { error says "
// java: class, interface, enum, or record expected added it back below and it runs
{


        //Changed the public class name from "Main" to "HelloThere" recieved error codes :  java: class HelloThere is public,
    // should be declared in a file named HelloThere.java. The class must match the .java file name.

    public static void main(String[] args) {
        //purposefully inputter scanner with "system.in" versus "System.in" to show importances of capitalization. Error codes read:
//        java: cannot find symbol  - symbol:   variable system - location: class com.company.Main
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you doing?");
        //Accidntally labeled the Scanner as "scanner" but tried to pull it using "input"
        String doingWhat = scanner.nextLine();
        //Paused and ran it here. No error codes but it doesnt work because you have to utilize the scanner in order to use input.

//     Tried this ->  System.out.println("Me too!", whatAreYouDoing); Thinking it might return the input kind of like it would return a first name.
//     Did not happen. Got error : java: no suitable method found for println(java.lang.String,java.lang.String)
//    method java.io.PrintStream.println() is not applicable
//      (actual and formal argument lists differ in length) Fixed it by doing:
        System.out.printf("Me Too -%s!\n", doingWhat); //Also discovered I was doing the wrong print line. I was doing println versus printf
        System.out.println("What kind of drinks after work?");
        String fridayNight = scanner.nextLine();
        System.out.printf("Perfect! Lets meet at the bar on Main for %s !\n", fridayNight);

//  After trying this out to see if it worked I commented out the scanner. Errors read : java: cannot find symbol
//  symbol:   class Scanner
//  location: class com.company.Main
    }
}
