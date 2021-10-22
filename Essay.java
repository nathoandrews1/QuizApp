/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmcq;

/**
 *
 * @author Nathan
 */
public class Essay extends NewMCQ {
    
    int maxWordCount;
    
    public Essay(){
        maxWordCount = 0;
    }
    
    public Essay(String question, String answer, String correctAns, int grade, int maxWordCount){
        super(question, answer, correctAns,grade);
        this.maxWordCount = maxWordCount;
    }
    
    public void compute(){
        
    }
    
}
