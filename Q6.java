import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Q6 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int r = sc.nextInt();

        area(r);
        cir(r);
        sc.close();
    }

static void area(int r ){

    int cal = r*r; 
    System.out.println("area is" + cal);
}
static void cir(int r ){

    double cal = 2 * 2.14 * r;
    System.out.println("cir is " + cal);
}        
}

