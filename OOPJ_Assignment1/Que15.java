class Que15{
   /* Write a program to perform below operations on int type to get: 
   a. The number of bits used to represent a integer value 
   b. The number of bytes used to represent a integer value 
   c. The minimum value a integer 
   d. The maximum value a integer*/

    public static void main(String [] args){
        int i=27;

        System.out.println("The number of bits used to represent a integer value :"+Integer.SIZE);
        System.out.println("The number of bytes used to represent a integer value: "+Integer.BYTES);
        System.out.println("The minimum value a integer: "+Integer.MIN_VALUE);
        System.out.println("The maximum value a integer: "+Integer.MAX_VALUE);
    }
}