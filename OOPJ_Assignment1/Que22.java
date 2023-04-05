class Que22{
   /* Write a program to find minimum and maximum number 
   as well as to add two long numbers using methods of Long.*/

    public static void main(String [] args){
        long num1=10101010;
        long num2=20202020;
        System.out.println("find minimum number: "+Long.min(num1,num2));
        System.out.println("find maximum number: "+Long.max(num1,num2));
        System.out.println("Sum of two long number: "+Long.sum(num1,num2));
    }
}