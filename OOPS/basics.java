public class basics {

    //static varaiable
    static String Employee_name;
    static float Employee_salary;
    
    //static method (set)

   static void set(String n , float p){
    Employee_name = n;
    Employee_salary = p;
   }

   //get method
   static void get (){
    System.out.println("Name - " + Employee_name);
    System.out.println("Salary is - " + Employee_salary);
   }

    public static void main(String[] args) {

        basics.set("Sanjay", 790000f);
        basics.get();
        

    }
}