class X {
    int data=100;
    void info(){
        System.out.println("Info Method Of Parent....");
    }
            
}
class Y extends X {
    String data="indore";
    void info(){
        System.out.println("Info Method Of Child....");
    }
    void disp(){
        super.info();
        //System.out.println(data);
        //System.out.println(super.data);
    }
}
public class SuperExampleOne {
    public static void main(String[] args) {
        Y ob=new Y();
        ob.disp();
    }
}
