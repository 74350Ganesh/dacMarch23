class Que17{
   /* Write a program to convert state of Integer instance 
   into byte, short, int, long, float and double..*/

    public static void main(String [] args){
        Integer num=new Integer("12345");

        byte b1=num.byteValue();
        System.out.println("Integer instance into byte:"+b1);

        short s1=num.shortValue();
        System.out.println("Integer instance into short:"+s1);

        int i1=num.byteValue();
        System.out.println("Integer instance into int:"+i1);

        long l1=num.longValue();
        System.out.println("Integer instance into long:"+l1);

        float f1=num.floatValue();
        System.out.println("Integer instance into float:"+f1);

        double d1=num.doubleValue();
        System.out.println("Integer instance into double:"+d1);
        
    }
}