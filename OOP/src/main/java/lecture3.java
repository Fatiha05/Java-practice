//using method
//parameterized method

class teachers {
    String name,gender;
    int age,phone;
    
    void setInfo(String n,String m,int a,int ph){
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
public class lecture3{
    public static void main(String[] args) {
       teachers teacher1 = new teachers();
       teacher1.setInfo("Fatiha Mahjabin", "Female",21,1827592139);
       teacher1.information();
       
        teachers teacher2 = new teachers();
        teacher2.setInfo("Tonmoy Chowdhury", "Male",24,1741262751);
        teacher2.information();
       
    }
    
    
}

