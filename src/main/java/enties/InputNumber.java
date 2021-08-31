package enties;

import java.util.Scanner;

public class InputNumber {
    public void inputNumber() {

        int month;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào một số bất kỳ: ");
            month = scanner.nextInt();
        } while (month <= 0);
        if (month == 2) {
            System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 30 ngày");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng " + month + " có 31 ngày");
        } else {
            System.out.println("Số bạn nhập không phải là 1 tháng trong năm");
        }
        {
            System.out.println("Bạn cần nhập vào một số");
        }
    }
}
