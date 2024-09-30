import java.util.Scanner;
public class TypeCheck {


    public static class NumberTypeChecker {

        public static String determineNumberType(String input) {
            input = input.trim();

            try {
                Integer.parseInt(input);
                return "int";
            } catch (NumberFormatException ignored) {
            }

            try {
                Long.parseLong(input);
                return "long";
            } catch (NumberFormatException ignored) {
            }

            try {
                Float.parseFloat(input);
                return "float";
            } catch (NumberFormatException ignored) {
            }

            try {
                Double.parseDouble(input);
                return "double";
            } catch (NumberFormatException ignored) {
            }

            return "неизвестный тип";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число: ");
            String input = scanner.nextLine();

            String type = determineNumberType(input);
            System.out.println("Тип числа: " + type);


        }
    }
}

