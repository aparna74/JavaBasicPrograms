package basic_numeric_operations;



public class Addtion_Of_twoNumbers {
   public static  int add(int i,int j){
       return(i+j) ;
   }
   public static float add(float i,float j){
       return(i+j);

   }
   public static  double add(double i,double j){
       return(i+j);
   }
   public static long add(long i,long j){
       return(i+j);
   }
   public static String add(double real,double imaginary,double real2,double imaginary2){
       double temp_real = real+real2;
       double temp_img = imaginary+imaginary2;
       return(""+temp_real+"+"+temp_img+"i");
   }

}
