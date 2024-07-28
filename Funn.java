import java.util.*;

public class Funn {

    public static void main(String[] args) {

        Add();

    }

    static int Add() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);

        return sum;

    }
}