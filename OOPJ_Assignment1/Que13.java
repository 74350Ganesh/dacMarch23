class Que13{
   /* Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.*/

    public static void main(String [] args){
        short sh=2;
        String str=Short.toString(sh);
        System.out.println("short value into String:"+str);
        System.out.println("short value into Short instance:"+Short.valueOf(sh));
        String str2= "1255";
        System.out.println("The maximum value a short:"+Short.valueOf(str2));
        
    }
}