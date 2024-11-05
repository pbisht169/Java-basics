package Pawan;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        {
            a = 100; // Already initialized outside the block, so we are referencing to same 'a' Object.
            int c = 300; // New Variable initialized in Block scope
            System.out.println(a); //
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println(a);  //
        System.out.println(b);
//        System.out.println(c); // Can't access to the variable outside the block scope.
    }
}
