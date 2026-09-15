package com.tech.selvam.tech2;

public class sinith {
    byte a=4;
    static int c=50;
    
    public sinith(){
        System.out.println("this is explicit constuctor");
    }
    public static void main(String[] args){
       int a1=10;
      
       System.out.println("program start here");
       System.out.println(a1);
       aaa();
       sinith s=new sinith();
       System.out.println(s.a);
       System.out.println(c);
        s.abc();
        s.abc1();
       System.out.println( s.abc3());
       System.out.println("program end here");
    }
    public static void aaa(){
        System.out.println("this is aaa method");
        
    }
    public boolean abc(){
        System.out.println("this is abc method");
        return true;
    }
    public short abc1(){
        System.out.println("this is abc1 method");  
        return 1;
    }
    public float abc3(){
        return 98.68f;
    }
}
