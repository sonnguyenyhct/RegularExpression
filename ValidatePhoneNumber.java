import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String nameClass = scanner.nextLine();
        Pattern pattern = Pattern.compile("[(]\\d{2}[)][-][(][0]\\d{9}[)]");
        Matcher matcher = pattern.matcher(nameClass);
        System.out.println(matcher.matches());
    }

}
