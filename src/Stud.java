public class Stud {
    int rno;
    String name;
    
    public void setPersonalInfo(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public void showPersonalInfo(){
        System.out.println("Roll  Number : "+rno);
        System.out.println("Student Name : "+name);
    }
}
