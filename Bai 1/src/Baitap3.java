import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số:");
        int number = sc.nextInt();
        String num = "";
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number == 0) {
            System.out.println("zero");
        }
        int hundreds = number / 100;
        int result = number % 100;
        switch (hundreds) {
            case 1:
                num += " One hundreds ";
                break;
            case 2:
                num += " Two hundreds ";
                break;
            case 3:
                num += " Three hundreds ";
                break;
            case 4:
                num += " Four hundreds ";
                break;
            case 5:
                num += " Five hundreds";
                break;
            case 6:
                num += " Six hundreds ";
                break;
            case 7:
                num += " Seven hundreds ";
                break;
            case 8:
                num+= " Eight hundreds ";
                break;
            case 9:
                num+= " Night hundreds ";
                break;
        }
        if (result != 0) {
            int tens = result / 10;
            int ones = result % 10;
            switch (tens) {
                case 1:
                    switch (result) {
                        case 11:
                            num += "Eleven";
                            break;
                        case 12:
                            num += "Twelve";
                            break;
                        case 13:
                            num += "Thirteen";
                            break;
                        case 14:
                            num += "Fourteen";
                            break;
                        case 15:
                            num += "Fifteen";
                            break;
                        case 16:
                            num += "Sixteen";
                            break;
                        case 17:
                            num += "Seventeen";
                            break;
                        case 18:
                            num += "Eighteen";
                            break;
                        case 19:
                            num += "Nineteen";
                            break;
                    }
                case 2:
                    num += "twenty";
                    break;
                case 3:
                    num += "thrity";
                    break;
                case 4:
                    num += "fourty";
                    break;
                case 5:
                    num += "fifty";
                    break;
                case 6:
                    num += "sixty";
                    break;
                case 7:
                    num += "seventy";
                    break;
                case 8:
                    num += "eighty";
                    break;
                case 9:
                    num += "nighty";
                    break;
                default:
            }
            if (tens != 1) {
                switch (ones) {
                    case 1:
                        num += " one";
                        break;
                    case 2:
                        num += " two";
                        break;
                    case 3:
                        num += " three";
                        break;
                    case 4:
                        num += " four";
                        break;
                    case 5:
                        num += " five";
                        break;
                    case 6:
                        num += " six";
                        break;
                    case 7:
                        num += " seven";
                        break;
                    case 8:
                        num += " eight";
                        break;
                    case 9:
                        num += " night";
                        break;
                }
            }
        }
        System.out.println(num);
    }
}
