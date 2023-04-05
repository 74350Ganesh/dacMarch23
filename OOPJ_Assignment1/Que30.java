class Que30{
   /* Write a program to find minimum and maximum number 
   as well as to add two double numbers using methods of Double.*/

    public static void main(String [] args){
        double num1=1010.1010;
        double num2=2020.2020d;
        System.out.println("find minimum number: "+Double.min(num1,num2));
        System.out.println("find maximum number: "+Double.max(num1,num2));
        System.out.println("Sum of two double number: "+Double.sum(num1,num2));
    }
}