public class Stud {
    private int rno;
    private String name;
    
    public Stud(){}
    public Stud(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    
    public void setPersonalInfo(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public void showPersonalInfo(){
        System.out.println("Roll  Number : "+rno);
        System.out.println("Student Name : "+name);
    }
    public final void result(int per){
        if(per>=33){
            System.out.println("Student Passsed....");
        }else{
            System.out.println("Student Failed....");
        }
    }
}
