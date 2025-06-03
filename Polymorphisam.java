import java.util.*;
class calculator
{
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(5,3));
        System.out.println(calc.add(4.8,6.2));
        System.out.println(calc.add(1,3,5));
    }
}
