 import java.util.*; 
 class MethodOverloading { 
 int add(int a, int b) { 
 return a + b; 
    } 
    double add(double a, double b) { 
  return a + b; 
    } 
   int add(int a, int b, int c) { 
   return a + b + c; 
    } 
    public static void main(String[] args) { 
        MethodOverloading obj = new MethodOverloading(); 
        System.out.println(obj.add(10, 20)); 
        System.out.println(obj.add(5.5, 4.5)); 
        System.out.println(obj.add(1, 2, 3)); 
    } 
}