
public class EngStud extends Stud{

   
    String branch;
    int sem;
   
    public void setEngInfo(String branch, int sem){
        this.branch=branch;
        this.sem=sem;
    }
    public void showEngInfo(){
        System.out.println("Branch       : "+branch);
        System.out.println("Semester     : "+sem);
    }
    public static void main(String[] args) {
        EngStud s=new EngStud();
        s.setPersonalInfo(11001, "ABCD");
        s.setEngInfo("CS", 4);
        s.showPersonalInfo();
        s.showEngInfo();
        s.result(40);
    }
}
