import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
        if(i >= 0 && i <= 255){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if(i >= -32768 && i <= 32767){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}