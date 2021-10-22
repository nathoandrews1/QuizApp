/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmcq;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Nathan
 */
public class AppClass {
    boolean test;
    public static void main(String[] args){
        MCQ testClass = new MCQ();
        
        
        testClass.add(); //This is another method but asks the user to input it with a GUI JOptionPane
        testClass.add("This is another question added manually");
        testClass.add("This is Question 3");
        testClass.add("This is Question 4");
        System.out.println("Before delete \n" + testClass.question);
        testClass.delete();
        System.out.println("After delete \n" + testClass.question);
        testClass.search();
      
    }
}
