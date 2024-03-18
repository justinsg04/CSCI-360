/*
 * The purpose of this class is to 
 * 
 * 1. Use the built-in PrintWriter class to create new files.
 * 2. Use the built-in Scanner class to read the content of files.
 * 3. Use the built-in StringTokenizer class to access all the tokens
 * 	  we need. A delimiter is needed to separate the tokens 
 * 
 */

 import java.io.*;
 import java.util.*;
 
 public class FileInputAndOutput {
 
     public static void main(String[] args) throws IOException {
 
         // create an empty file object (PrintWriter object): 
         // outFile, right away.
         PrintWriter outFile = new PrintWriter("default.txt");
         
         // put some information into the file
         outFile.println("This is the default file!!!!!!!!!!!!!!");
         outFile.println("This is the default file!!!!!!!!!!!!!!");
         outFile.println("This is the default file!!!!!!!!!!!!!!");
         
         // need close the file
         outFile.close();
         
         // create another file to hold date information
         try {
             outFile = new PrintWriter("Dates.txt");
         } catch(IOException exc) {
             System.out.println(exc.getMessage());
         }
         
         System.out.println("Before the nested loop:");
         // next, put date information in this file
         for(int m = 1; m <= 12; m++) {
             for(int d = 1; d <= 30; d++) {
                 // create a Date object by calling its constructor
                 Date tempDate = new Date(m, d, 2023);
                 System.out.println(tempDate); // display all the dates
                 
                 // put the date information into the file: Dates.txt
                 outFile.println(tempDate);	
             } // end of inner loop
         } // end of outer loop
         
         // have to close the file, then the info will stay
         outFile.close();
         
         System.out.println("Below we read the content of a file");
         // Show how to read the content of a file into our project
         // Need the built-in Scanner class
         Scanner input = new Scanner( new File("default.txt"));
         // read each line of the file
         while(input.hasNext()) {
             String tempString = input.nextLine(); // use tempString to hold the line
             System.out.println(tempString);
         }
         
         // Read the content of Dates.txt
         input = new Scanner( new File("Dates.txt") );
         // read each line of the file
         while(input.hasNext()) {
             String tempString = input.nextLine(); // use tempString to hold the line
             StringTokenizer stnizer = new StringTokenizer(tempString, "/");
             
             // another while loop to go through the line
             while(stnizer.hasMoreTokens()) {
                 String temp = stnizer.nextToken();
                 System.out.println("The token is: " + temp);
             }
             // System.out.println(tempString);
         }
         input.close();
     }
 
 }