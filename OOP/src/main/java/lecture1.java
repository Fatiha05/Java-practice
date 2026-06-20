//class declaration
class Teacher {
    String name,gender;
    int age,phone;
}
public class lecture1{
    public static void main(String[] args) {
       Teacher teacher1 = new Teacher();
       teacher1.name = "Fatiha Mahjabin";
       teacher1.gender = "Female";
       teacher1.age = 21;
       teacher1.phone = 1827592139;
       
       System.out.println("Name : "+teacher1.name);
       System.out.println("Gender : "+teacher1.gender);
       System.out.println("Age : "+teacher1.age);
       System.out.println("Phone : "+teacher1.phone);
       
       
       
        Teacher teacher2 = new Teacher();
       teacher2.name = "Tonmoy Chowdhury";
       teacher2.gender = "Male";
       teacher2.age = 24;
       teacher2.phone = 1741262751;
       
       System.out.println("Name : "+teacher2.name);
       System.out.println("Gender : "+teacher2.gender);
       System.out.println("Age : "+teacher2.age);
       System.out.print("Phone : "+teacher2.phone);
       
    }
    
    
}
