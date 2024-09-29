import java.util.Scanner;
public class TypeCheck {


    public static class NumberTypeChecker {

        public static String determineNumberType(String input) {
            // Удаляем пробелы по краям
            input = input.trim();

            // Проверка на целое число (int или long)
            try {
                Integer.parseInt(input);
                return "int";
            } catch (NumberFormatException ignored) {
                // игнорируем исключение, если это не int
            }

            try {
                Long.parseLong(input);
                return "long";
            } catch (NumberFormatException ignored) {
                // игнорируем исключение, если это не long
            }

            // Проверка на число с плавающей запятой (float или double)
            try {
                Float.parseFloat(input);
                return "float";
            } catch (NumberFormatException ignored) {
                // игнорируем исключение, если это не float
            }

            try {
                Double.parseDouble(input);
                return "double";
            } catch (NumberFormatException ignored) {
                // игнорируем исключение, если это не double
            }

            // Если ни один тип не подошел
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

