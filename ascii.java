package day000000000;
/*
write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol

 */
public class Symbol {
    public static void main(String[] args) {
        char x ='&';
        if((x>=65&&x<=90)||(x>=97&&x<+122)){
            System.out.println(x+" is an Alphabetic");
        }
        if (x >= 48 && x <= 57) {
            System.out.println(x + " is a Digit");
        }else {
            System.out.println(x + " is a Symbol");
        }
    }
}
