/*
  Create a Java program that acts as a basic calculator. It should prompt the user to enter two numbers and choose an operation (addition, subtraction, multiplication, division). Then, it should perform the selected operation and display the result to the user.
*/

import java.util.Scanner;
 public class SimpleCalculator{
    public static void main(String[] args) {
        try(Scanner keyPad=new Scanner(System.in)){
            System.out.print("Enter any number:");
            double num1=keyPad.nextDouble();
            double num2=keyPad.nextDouble();
            System.out.print("Enter the operation to be performed:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Exit:");
            int choice=keyPad.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f\n",num1,num2,num1+num2);
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f\n",num1,num2,num1-num2);
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f\n",num1,num2,num1*num2);
                    break;
                case 4:
                    System.out.printf("%.2f / %.2f = %.2f\n",num1,num2,num1/num2);
                    break;  

            }
        }
        catch(Exception e){
            
            if(e.getClass().getSimpleName().equals("InputMismatchException")){
                System.out.println("\n Please Check the input values\n Only Numbers are allowed");
                 e.printStackTrace();
            }
            else if(e.getClass().getSimpleName().equals("ArithmeticException")){
                System.out.println("\n Please Check the input values\n Divison by 0 is not allowed!");
                e.printStackTrace();
            }
            else{
                System.out.println("\n Raise an issue:\n");
                e.printStackTrace();
            }
        }


    }



 }