/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprograms;
import java.io.*;

/**
 *Write a program to create a directory and Subdirectory..
 * @author SHUBHAM
 */
public class DirectoryCreation{
    public static void main(String[] args) {
     File file = new File("C:\\Users\\SHUBHAM\\OneDrive\\Documents\\NetBeansProjects\\ArrayPrograms\\Directorydemo");
     
    if(!file.exists()){
        if(file.mkdir()){
            System.out.println("Directory is created !!");
         }
        else
        {
            System.out.println("Directory is not created !!");
        }
    }
  
    File file1 = new File("C:\\Users\\SHUBHAM\\OneDrive\\Documents\\NetBeansProjects\\ArrayPrograms\\Directorydemo\\subdirectory");
    if(!file1.exists()){
        if(file1.mkdirs()){
            System.out.println("Subdirectory is Created !!");
        }
        else
        {
            System.out.println("Subdirectory is not created !!");
        }
    }
  }
}
