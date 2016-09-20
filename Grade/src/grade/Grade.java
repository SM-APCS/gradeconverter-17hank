/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

/**
 *
 * @author kad23
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grade = readInt("What is the numerical grade? ");
        if (grade >= 90)
        {
            System.out.println("Your grade is an A");
            
        }
        else if (grade >= 80)
        {
            System.out.println("Your grade is a B");
            
        }
        else if (grade >= 70)
        {
            System.out.println("Your grade is a C");
            
        }
        else
        {
            System.out.println("Your grade is an F");
        }
    }
    
}
