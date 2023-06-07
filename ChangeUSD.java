import java.util.Scanner;

public class ChangeUSD {
    public static void main(String[] args) {
        double rate = 23000;
        double u;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuyen doi tien te tu USD sang VND");
        System.out.println("Nhap so tien USD:");
        u = scanner.nextDouble();
        System.out.println("Chuyen doi sang VND: " + (u * rate) + " VND");

    }
}