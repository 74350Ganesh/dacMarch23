class Que21{
   /* Write a program to convert state of Long instance 
   into byte, short, int, long, float and double.*/

    public static void main(String [] args){
        Long l=new Long("123456");

        byte b1=l.byteValue();
        System.out.println("Long instance into byte:"+b1);

        short s1=l.shortValue();
        System.out.println("Long instance into short:"+s1);

        int i1=l.byteValue();
        System.out.println("Long instance into int:"+i1);

        long l1=l.longValue();
        System.out.println("Long instance into long:"+l1);

        float f1=l.floatValue();
        System.out.println("Long instance into float:"+f1);

        double d1=l.doubleValue();
        System.out.println("Long instance into double:"+d1);
        
    }
}