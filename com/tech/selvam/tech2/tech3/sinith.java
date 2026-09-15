package com.tech.selvam.tech2.tech3;

public class sinith {
    byte k=8;
    static int s1 =89;
 
    public sinith(){
        System.out.println("this is explicit constuctor");
    }
    public static void main(String[] args){
        int i=8;
        System.out.println("program start here");
        System.out.println(i);
        ambu();
        sinith s=new sinith();
        s.pass();
       System.out.println( s.ambika());
        System.out.println(s.k);
         System.out.println(s1);
       System.out.println("program end here");
    }
    public boolean pass(){
        System.out.println("this is pass method");
        return true;
  }
  public short ambika(){
    return 98;
  }
  public static void ambu(){
    System.out.println("these are static method");
  }

}
