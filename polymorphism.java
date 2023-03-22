package Polymorphism;
import java.util.*;
class execute{
    static int  add(int a){
        return a*a;
    }
    static double add(int a,int b){  //method overloading
        return a+b;
    }
}
public class polymorphism{
    public static void main(String args[]){
        System.out.println(execute.add(4));
        System.out.println(execute.add(2,4));
    }
}