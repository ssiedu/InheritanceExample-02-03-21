abstract class M {
    final void m1(){System.out.println("Hello From M1 Method of M class...");}
    void m2(){System.out.println("Hello From M2 Method of M class...");}
    abstract void m3();
    abstract void m4();
}

class N extends M {
    
    void m3(){
        System.out.println("Hello From M3 Method of N class...");      
    }
    void m4(){
        System.out.println("Hello From M4 Method of N class....");
    }
}


public class AbstractExampleOne {

    public static void main(String[] args) {

       N ob=new N();
       ob.m1(); //M
       ob.m2(); //M
       ob.m3(); //N
       ob.m4(); //N
    }
}
