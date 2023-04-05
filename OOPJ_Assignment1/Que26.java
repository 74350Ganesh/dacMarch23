class Que26{
   /* Write a program to find minimum and maximum number 
   as well as to add two float numbers using methods of Float.*/

    public static void main(String [] args){
        float num1=1010.1010f;
        float num2=2020.2020f;
        System.out.println("find minimum number: "+Float.min(num1,num2));
        System.out.println("find maximum number: "+Float.max(num1,num2));
        System.out.println("Sum of two float number: "+Float.sum(num1,num2));
    }
}