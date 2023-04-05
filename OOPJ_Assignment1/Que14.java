class Que14{
   /* Write a program to convert state of Short instance 
   into byte, short, int, long, float and double.*/

    public static void main(String [] args){
        Short sh = new Short("2");

        byte b1= sh.byteValue();
        System.out.println("Short instance into byte: "+b1);
        
        short s1= sh.shortValue();
        System.out.println("Short instance into short: "+s1);
        
        int i1= sh.intValue();
        System.out.println("Short instance into int: "+i1);

        long l1= sh.longValue();
        System.out.println("Short instance into long: "+l1);

        float f1= sh.floatValue();
        System.out.println("Short instance into float: "+f1);

        double d1= sh.doubleValue();
        System.out.println("Short instance into double: "+d1);
    }
}