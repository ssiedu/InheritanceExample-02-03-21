
public class EngStud extends Stud{

    private String branch;
    private int sem;
   
    public EngStud(int rno, String name, String branch, int sem){
        //this.rno=rno;
        //this.name=name;
        super(rno,name);
        this.branch=branch;
        this.sem=sem;
    }
    public void setEngInfo(String branch, int sem){
        this.branch=branch;
        this.sem=sem;
    }
    public void showEngInfo(){
        System.out.println("Branch       : "+branch);
        System.out.println("Semester     : "+sem);
    }
    public static void main(String[] args) {
        EngStud s=new EngStud(111,"AAA","CS",3);
        /*
        EngStud s=new EngStud();
        s.setPersonalInfo(11001, "ABCD");
        s.setEngInfo("CS", 4);
        */
        s.showPersonalInfo();
        s.showEngInfo();
        s.result(40);
    }
}
