import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        int x;
        Scanner sca = new Scanner(System.in);
        System.out.println("Bang cuu chuong : ");
        x= sca.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(x+" * "+i +" = "+(x*i));
        }

    }
}
