import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String nameClass = scanner.nextLine();
        Pattern pattern = Pattern.compile("[CAP]\\d{4}[GHIKLM]");
        Matcher matcher = pattern.matcher(nameClass);
        System.out.println(matcher.matches());
    }

}
