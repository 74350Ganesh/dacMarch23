class Que16{
   /* Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.*/

    public static void main(String [] args){
        int i=27;
        String str=Integer.toString(i);

        System.out.println("int value into String :"+str);
        System.out.println("int value into Integer instance: "+Integer.valueOf(i));

        String str2="1234";
        System.out.println("String instance into Integer instance: "+Integer.valueOf(str2));
        System.out.println("int value into binary: "+Integer.toBinaryString(i));
        System.out.println("int value into octal: "+Integer.toOctalString(i));
        System.out.println("int value into hexadecimal: "+Integer.toHexString(i));
    }
}