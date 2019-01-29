package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

       //Create a String object using the new operator and
        // initialize it with the value of your full name (first name + last name)
        String myFullNameR = new String();
        myFullNameR = "Nada Mahmoud";

        //Create a second String object and initialize it with the value of your full name in lowercase
        String myFullNameLowerCase = new String();
        myFullNameLowerCase = " nada mahmoud";

        //Use the .equals() and .equalsIgnoreCase() methods to test whether or not
        // your two Strings are equal
        if (myFullNameR.equalsIgnoreCase(myFullNameLowerCase)) {
            System.out.println("They match!");
        } else if (myFullNameLowerCase.equals(myFullNameR))
            System.out.println("They match!");
        else {
            System.out.println("Sorry, no match");
        }


//Use the .length() method to print out the length of your full name
        System.out.println("The length of my name with spaces is: " + myFullNameLowerCase.length());

//Use the .concat() method to concatenate your two Strings together and print out the new concatenated String
        System.out.println(myFullNameR.concat(myFullNameLowerCase));

 //Use the charAt(int index) method to return the index of the fourth letter of your name
        System.out.println("The 4th charcter in my name is: " + myFullNameR.charAt(3));

 //Create (2) String objects, and initialize one with the value of your first name and one with
        // the value of a classmate’s first name
        String myName = new String();
        myName = "Nada Mahmoud";

        String classmatesName = new String();
        classmatesName = "Omar Atcho";

//Use the compareTo(String comparedString) to determine which of your names comes first, alphabetically
        System.out.println("The difference between the letters of my name vs classmate Name is :" + myName.compareTo(classmatesName));

//Use the replace(char find, char replacement)
// method to replace all instances of one letter in your name with the letter ‘z’

        System.out.println("Replace 'a' in my name with 'l' " + "\n");
        System.out.println(myName.replace('a',  'l'));

        //Use the substring(int index) method to return the last 2 letters of your name

        System.out.println("The last 2 later in my name: ");
        System.out.println(myName.substring(10, 12));
    }
}
