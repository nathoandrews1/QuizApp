/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmcq;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Nathan
 */
public abstract class NewMCQ {

    protected String  correctAns;
    protected ArrayList question;
    protected ArrayList answer;
    protected int grade, trigger;
    
    public NewMCQ(){
        answer = new ArrayList();
        correctAns ="";
        grade = 0;
        question = new ArrayList();
        trigger = 3;
    }
    
    public NewMCQ(String question, String answer, String correctAns, int grade){
        this.answer.add(answer);
        this.question.add(question);
        this.correctAns = "";
        this.grade = grade;
        trigger = 3;
    }
    
    public void add(){
        question.add(JOptionPane.showInputDialog(null,"Please enter a new question to add."));
    }
    
    public void add(String x){
        question.add(x);
    }
    
    // 0 = yes, 1 = no, 2 = cancel
    public void delete(){
        trigger = -1;
        
        for (int i=0; i < question.size(); i++){
            trigger = JOptionPane.showConfirmDialog(null, question.get(i) +"\n Would you like to delete this question?");
            if(trigger ==2){
                break;
            }
            else if(trigger == 0){
                trigger = 3;
                trigger = JOptionPane.showConfirmDialog(null, question.get(i) +"\n Are you sure you want to delete this?");
                if(trigger == 0)
                {
                    question.remove(i);
                }
            }
        }
    }
    
    public void print(){
        JOptionPane.showMessageDialog(null, question);
    }
    
    public void search(){
        String search = JOptionPane.showInputDialog(null,"Please enter a text to search");
        for(int i = 0;i<question.size();i++){
            if(question.get(i).equals(search)){
                JOptionPane.showMessageDialog(null,"Found Question! \n" + question.get(i));
            }
        }

    }
    
    
    abstract void compute();
    
}
