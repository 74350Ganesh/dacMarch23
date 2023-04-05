class Que8{
    /* 
    8.Write a program to convert:
    a. byte value into String
    b. byte value into Byte instance.
    c. String instance into Byte instance.
    */
    public static void main(String [] args){

        byte b1= 1;
        String str=Byte.toString(b1);

        System.out.println("byte value into String: "+str);
        System.out.println("byte value into Byte instance.: "+ Byte.valueOf(b1));
        System.out.println("String instance into Byte instance.: "+ Byte.valueOf(str));
       
    }
}