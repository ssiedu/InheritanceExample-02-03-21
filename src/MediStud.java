
public class MediStud extends Stud {

    int prof;

    /*
    public void result(int per){
        if(per>=50){
            System.out.println("Medical Student Passed...");
        }else{
            System.out.println("Medical Student Failed...");
        }
    }
    */
    public void setMediInfo(int prof) {
        this.prof = prof;
    }

    public void showMediInfo() {
        System.out.println("Prof        : " + prof);
    }

    public static void main(String[] args) {

        MediStud s=new MediStud();
        s.setPersonalInfo(2001, "PQRS");
        s.setMediInfo(2);
        s.showPersonalInfo();
        s.showMediInfo();
        s.result(45);
        
    }
}
