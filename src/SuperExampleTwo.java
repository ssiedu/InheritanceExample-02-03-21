class Demo {
    /*
    Demo(){
        System.out.println("Demo-0");
    }
    */
    Demo(int x){
        System.out.println("Demo-1");
    }
    Demo(int x, int y){
        System.out.println("Demo-2");
    }
}

class Test extends Demo {
    Test(){
        super(1,2); //calling 2 int arg constructor of parent
        System.out.println("Test-0");
    }
    Test(int x, int y){
        super(1);   //calling 1 int arg constructor of parent
        System.out.println("Test-2");
    }
    Test(int x, int y, int z){
        super(1);   //calling 1 int arg constructor of parent
        System.out.println("Test-3");
    }
}


public class SuperExampleTwo {
    public static void main(String[] args) {
        
        Test t=new Test(10,20,30);
        
        
        
        
        
        
        
        
    }
}
