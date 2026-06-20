//using constructor
//constructor name same as like class name but mo return type

//using method
//parameterized method

class teacherInfo {
    String name,gender;
    int age,phone;
    
   teacherInfo(String n,String m,int a,int ph){
        name = n;
        gender = m;
        age =a;
        phone = ph;
    }
    
    void information(){
         System.out.println("Name : "+name);
       System.out.println("Gender : "+gender);
       System.out.println("Age : "+age);
       System.out.println("Phone : "+phone);
        System.out.println("\n");
    }
}
public class lecture4{
    public static void main(String[] args) {
       teacherInfo teacher1 = new teacherInfo("Fatiha Mahjabin", "Female",21,1827592139);
       teacher1.information();
       
        teacherInfo teacher2 = new teacherInfo("Tonmoy Chowdhury", "Male",24,1741262751);
        teacher2.information();
       
    }
    
    
}

