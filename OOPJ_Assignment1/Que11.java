class Que11
{
    /* 
    Accept character from command line and perform below operations. 
    Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. 
If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into upper case and print it well as its code point. 
If it is in uppercase then convert it into lower case and print it well as its code point.
    */
    public static void main(String [] args)
    {
        int codePoint=args[0].codePointAt(0);
        char ch = args[0].charAt(0);
        //boolean flag = Character.isDigit(ch);

        if (Character.isDigit(ch)){
            System.out.println("You have entered a digit "+ch);
            System.out.println("Code point is: "+codePoint);
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("You have entered a Character "+Character.toUpperCase(ch));
            System.out.println("Code point is: "+codePoint);
        }
        else{
            System.out.println("You have entered a Character "+Character.toLowerCase(ch));
            System.out.println("Code point is: "+codePoint);
            }

        
    }
}