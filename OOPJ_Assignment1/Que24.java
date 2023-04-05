class Que24{
   /* Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.*/

    public static void main(String [] args){
        float f=111.222f;
        String str=Float.toString(f);

        System.out.println("float value into String :"+str);
        System.out.println("float value into Float instance: "+Float.valueOf(f));

        String str2="333.444";
        System.out.println("String instance into Float instance: "+Float.valueOf(str2));
        System.out.println("float value into hexadecimal string: "+Float.toHexString(f));
    }
}