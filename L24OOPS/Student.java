package L24OOPS;

 class  Value{
    String name;
    int age;

    public void getInfo(){
        System.out.println("the name of this student is "+this.name);
        System.out.println("the age of the student is "+this.age);

    }
}
public class Student{
    public static void main(String[] args) {
        Value S1=new Value();
        S1.name="Harsh";
        S1.age=21;
        S1.getInfo();

        Value s2=new Value();
        s2.name="Shardha";
        s2.age=22;
        s2.getInfo();

    }
    
}
