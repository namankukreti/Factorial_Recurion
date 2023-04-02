public class Factorial {
    public static void main(String[]args){
        System.out.print(factorial(5));
    }
    static int factorialRecursion(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial(int n){
        int count=1;
        while(n>0){
           count *= n--;
        }
        return count;
    }
}
