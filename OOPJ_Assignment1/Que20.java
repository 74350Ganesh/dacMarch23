class Que20{
   /* Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.*/

    public static void main(String [] args){
        long l=999999999;
        String str=Long.toString(l);

        System.out.println("long value into String :"+str);
        System.out.println("long value into Integer instance: "+Long.valueOf(l));

        String str2="123456789";
        System.out.println("String instance into long instance: "+Long.valueOf(str2));
        System.out.println("long value into binary: "+Long.toBinaryString(l));
        System.out.println("long value into octal: "+Long.toOctalString(l));
        System.out.println("long value into hexadecimal: "+Long.toHexString(l));
    }
}