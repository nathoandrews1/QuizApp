/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmcq;
import java.util.*;

/**
 *
 * @author Nathan
 */
public class MCQ extends NewMCQ {
        private ArrayList <String> options;
        
        public MCQ(){
            super();
            options = new ArrayList();
        }
        
        public MCQ(String question, String answer, String correctAns, String options, int grade){
            super(question, answer, correctAns, grade);
            this.options.add(options);
        }
    
    public void compute(){
        
    }
}
