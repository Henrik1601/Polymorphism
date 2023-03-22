class rideIt{
    public void riding(){
        System.out.println("1st move");
    }
}
class rideIt2 extends rideIt{
    public void riding(){
        System.out.println("2nd move");
    }
}
public class methodOverRiding{
    public static  void main(String args[]){
        rideIt r1 = new rideIt2();
        r1.riding();
    }
}
