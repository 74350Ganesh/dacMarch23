class Que25{
   /* Write a program to convert state of Float instance 
   into byte, short, int, long, float and double.*/

    public static void main(String [] args){
        Float f=new Float("123.456f");

        byte b1=f.byteValue();
        System.out.println("Float instance into byte:"+b1);

        short s1=f.shortValue();
        System.out.println("Float instance into short:"+s1);

        int i1=f.byteValue();
        System.out.println("Float instance into int:"+i1);

        long l1=f.longValue();
        System.out.println("Float instance into long:"+l1);

        float f1=f.floatValue();
        System.out.println("Float instance into float:"+f1);

        double d1=f.doubleValue();
        System.out.println("Float instance into double:"+d1);
        
    }
}