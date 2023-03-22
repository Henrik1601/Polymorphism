package Polymorphism;
class change{
    static void convertingType(int a,long b){  //Type Promotion
        System.out.println(a+b);
    }
}
public class polymorphismTypePromotion {
    public static void main(String args[]){
       change.convertingType(5, 5);
    }
}
