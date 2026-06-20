//using method

class Teachers {
    String name,gender;
    int age,phone;
    
    void information(){
         System.out.println("Name : "+name);
       System.out.println("Gender : "+gender);
       System.out.println("Age : "+age);
       System.out.println("Phone : "+phone);
        System.out.println("\n");
    }
}
public class lecture2{
    public static void main(String[] args) {
       Teachers teacher1 = new Teachers();
       teacher1.name = "Fatiha Mahjabin";
       teacher1.gender = "Female";
       teacher1.age = 21;
       teacher1.phone = 1827592139;
       teacher1.information();
       
       
       
       
        Teachers teacher2 = new Teachers();
       teacher2.name = "Tonmoy Chowdhury";
       teacher2.gender = "Male";
       teacher2.age = 24;
       teacher2.phone = 1741262751;
     teacher2.information();
       
    }
    
    
}

