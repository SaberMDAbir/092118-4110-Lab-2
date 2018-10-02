/* 
MD Abir A. Choudhury
092118
Calculator - Lab 2
*/

import java.util.Scanner;

class javaCalc {
    public static double errorCheck(double num) {
        Scanner S = new Scanner(System.in);
        if(num < 0 || num > 5) {
            System.out.println("Please input a valid number: ");
            num = S.nextDouble();
            errorCheck(num);
        }
        return num;
    }
    public static void main(String[] args) {
        double userNum = 0;
        double firstNum = 0;
        double secondNum = 0;
        Scanner S = new Scanner(System.in);

        while(userNum != 5) {
            System.out.println("Main Menu:\n" + 
                          "1: Addition\n" +
                          "2: Subtraction\n" +
                          "3: Multiplication\n" +
                          "4: Division\n" +
                          "5: Exit");
            System.out.print("Enter a Choice: ");
            userNum = S.nextDouble();
            if(userNum == 5) {
                break;
            }
            userNum = errorCheck(userNum);

            System.out.print("Enter number 1: ");
            firstNum = S.nextDouble();
            System.out.print("Enter number 2: ");
            secondNum = S.nextDouble();
            
            if(userNum == 1) {
                System.out.println("The answer is: " + (firstNum + secondNum) + "\n"); 
            }
            else if(userNum == 2) {
                System.out.println("The answer is: " + (firstNum - secondNum) + "\n"); 
            }
            else if(userNum == 3) {
                System.out.println("The answer is: " + (firstNum * secondNum) + "\n"); 
            }
            else if(userNum == 4) {
                if(secondNum == 0) {
                    System.out.println("Invalid division. Divison by zero.");
                    System.exit(0);
                }
                System.out.println("The answer is: " + (firstNum / secondNum) + "\n"); 
            }
        }
        S.close();
    }
}