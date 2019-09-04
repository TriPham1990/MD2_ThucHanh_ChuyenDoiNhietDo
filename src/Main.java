import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. Độ C sang độ F.");
            System.out.println("2. Dộ F sang độ C");
            System.out.println("0. Exit.");
            System.out.println("Nhập vào lựa chọn của bạn :");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Nhập vào độ C :");
                    double doC = scanner.nextDouble();
                    System.out.println("Độ F = " + ChuyenDoiNhietDo.doCSangDoF(doC));
                    break;
                case 2:
                    System.out.println("Nhập vào độ F :");
                    double doF = scanner.nextDouble();
                    System.out.println("Độ C = " + ChuyenDoiNhietDo.doFSangDoC(doF));
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);



    }
}
