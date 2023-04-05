class Que7{
    /* 
    Write a program to perform below operations on byte type to get: 
    a. The number of bits used to represent a byte value 
    b. The number of bytes used to represent a byte value 
    c. The minimum value a byte 
    d. The maximum value a byte
    */
    public static void main(String [] args){

        byte b1= 1;

        System.out.println("The number of bits used to represent a byte value: "+ Byte.SIZE);
        System.out.println("The number of bytes used to represent a byte value: "+ Byte.BYTES);
        System.out.println("The minimum value a byte: "+ Byte.MIN_VALUE);
        System.out.println("The maximum value a byte: "+ Byte.MAX_VALUE);
    }
}