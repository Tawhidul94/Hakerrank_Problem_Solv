import java.util.Scanner;

public class StringREverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer buffer = new StringBuffer(A);
        buffer.reverse();
        String data = buffer.toString();
        if(A.equals(data)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
