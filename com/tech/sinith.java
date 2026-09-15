package com.tech;

public class sinith {
    static int a1=10;
    byte s2=30;
     public sinith(){
        System.out.println("this is explicit constuctor");
}
public static void main(String[] args) {
        int a2=10; //local variable
        System.out.println("program start here");
        System.out.println(a2);
        System.out.println(a1);
        sinith s=new sinith();
        System.out.println(s.s2);
         shailja();
        s.abcd();
       System.out.println( s.abcd1());
       System.out.println("program end here");

    }
    public static void shailja(){
        System.out.println("this is shailja method");

        }
        public boolean abcd(){
            System.out.println("this is abcd method");
            return true;
        }
        public short abcd1(){
            return 1;
        }

}
