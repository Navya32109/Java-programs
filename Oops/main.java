class Teacher {
    String name;
    String subject;
    int patiencelevel;
Teacher(String name,String subject,int patiencelevel){
    this.name=name;
    this.subject=subject;
    this.patiencelevel=patiencelevel;
   }
void teachingskill(){
    if(patiencelevel<5){
        System.out.println("The teacher has no good teaching skill");
    }
    else{
        System.out.println("The tearcher has good teaching skill");
    }
}
void assignments(){
    System.out.println("The teacher has given assignment in"+subject+"subject");
}
}
public class main{
    public static void Teacher(String[] args){
        Teacher t1=new Teacher("Navya","math",4);
        t1.teachingskill();
        t1.assignments();
    }
}
