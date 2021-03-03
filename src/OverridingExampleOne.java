class P {               //parent
    public void display(final int i){
        System.out.println("Initial Value of I : "+i);
       // i++;
        //System.out.println("Incremented Value of I : "+i);
    }
    public void show(){
        System.out.println("Hello From Show Method of Parent...");
    }
}

class C extends P {      //child
    public void show(){
        System.out.println("Hello From Show Method of Child...");
    }
}


public class OverridingExampleOne {

    public static void main(String[] args) {
        C ob=new C();
        //ob.show();
        ob.display(10);
    }
}
