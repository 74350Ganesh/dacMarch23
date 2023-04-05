class Que9{
    /* 
    Write a program to convert state of Byte instance into byte, short, int. long, float and double.
    */
    public static void main(String [] args){

        Byte byteVal = new Byte("35");

        byte b = byteVal.byteValue();
        System.out.println(b);

        short shortvalue = byteVal.shortValue();
        System.out.println(shortvalue);

        int intvalue = byteVal.intValue();
        System.out.println(intvalue);

        long longvalue = byteVal.longValue();
        System.out.println(longvalue);

        float floatvalue = byteVal.floatValue();
        System.out.println(floatvalue);

        double doublevalue = byteVal.doubleValue();
        System.out.println(doublevalue);
    }
}