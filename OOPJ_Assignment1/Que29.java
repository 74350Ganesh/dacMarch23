class Que29{
   /* Write a program to convert state of Double instance 
   into byte, short, int, long, float and double.*/

    public static void main(String [] args){
        Double d=new Double("123.456d");

        byte b1=d.byteValue();
        System.out.println("Double instance into byte:"+b1);

        short s1=d.shortValue();
        System.out.println("Double instance into short:"+s1);

        int i1=d.byteValue();
        System.out.println("Double instance into int:"+i1);

        long l1=d.longValue();
        System.out.println("Double instance into long:"+l1);

        float f1=d.floatValue();
        System.out.println("Double instance into float:"+f1);

        double d1=d.doubleValue();
        System.out.println("Double instance into double:"+d1);
        
    }
}