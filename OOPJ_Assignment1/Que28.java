
class Que28{
   /* Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
(Note: Here you can use doubleToLongBits() method along with methods of Long class).
*/

    public static void main(String [] args){
        double d=1010.2020d;
        String str=Double.toString(d);

        System.out.println("double value into String :"+str);
        System.out.println("double value into Double instance.: "+Double.valueOf(d));

        String str2="1234.5678d";
        System.out.println("String instance into double instance: "+Double.valueOf(str2));
        //System.out.println("double value into binary: "+Double.toBinaryString(d));
        //System.out.println("double value into octal: "+Double.toOctalString(d));
        System.out.println("double value into hexadecimal: "+Double.toHexString(d));
        System.out.println("double value into long: "+Double.doubleToLongBits(d));
    }
}