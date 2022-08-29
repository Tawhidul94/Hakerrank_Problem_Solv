import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area;
        if(a > 0 && b > 0){
            area = a*b;
            System.out.println(area);
        }else{
            System.out.println("java.lang.Exception:" +" Breadth and height must be positive ");
        }
    }
}
