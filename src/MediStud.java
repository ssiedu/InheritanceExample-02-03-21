
public class MediStud extends Stud {

    int prof;

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
        
    }
}
