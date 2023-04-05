class Que6{
    /*
    Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance. */

    public static void main(String [] args){

        boolean bool=true;
        String str1=Boolean.toString(bool);
        String str2="false";
        
       //a. boolean value into String
        System.out.println("boolean value into String:"+str1);
        //b. boolean value into Boolean instance.
        System.out.println("boolean value into Boolean instance:"+ Boolean.valueOf(bool));
        //c. String value into boolean value
        System.out.println("String value into boolean:"+ Boolean.parseBoolean(str2));
        //d. String value into Boolean instance.
        System.out.println("String value into boolean:"+ Boolean.valueOf(str2));

    }
}