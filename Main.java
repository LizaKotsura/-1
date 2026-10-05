import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========================================================================================");
        System.out.println("                            ИНФОРМАЦИЯ О ПРИМИТИВНЫХ ТИПАХ ДАННЫХ                         ");
        System.out.println("=========================================================================================");
        System.out.printf("%-10s | %-12s | %-30s | %-30s%n", "Тип", "Размер (бит)", "Мин. значение", "Макс. значение");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.printf("%-10s | %-12d | %-30d | %-30d%n", "byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n", "short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n", "int", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n", "long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %-30s | %-30s%n", "float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %-30s | %-30s%n", "double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n", "char", Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.printf("%-10s | %-12s | %-30s | %-30s%n", "boolean", "N/A", Boolean.FALSE.toString(), Boolean.TRUE.toString());
        System.out.println("=========================================================================================\n");


        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВОД И КОНВЕРТАЦИЯ ДАННЫХ:");

        try {
            System.out.print("Введите значение типа byte (-128..127): ");
            byte parsedByte = Byte.parseByte(scanner.nextLine());
            System.out.println("Результат byte: " + parsedByte + "\n");

            System.out.print("Введите значение типа short: ");
            short parsedShort = Short.parseShort(scanner.nextLine());
            System.out.println("Результат short: " + parsedShort + "\n");

            System.out.print("Введите значение типа int: ");
            int parsedInt = Integer.parseInt(scanner.nextLine());
            System.out.println("Результат int: " + parsedInt + "\n");

            System.out.print("Введите значение типа long: ");
            long parsedLong = Long.parseLong(scanner.nextLine());
            System.out.println("Результат long: " + parsedLong + "\n");

            System.out.print("Введите значение типа float (например, 3.14): ");
            float parsedFloat = Float.parseFloat(scanner.nextLine());
            System.out.println("Результат float: " + parsedFloat + "\n");

            System.out.print("Введите значение типа double (например, 2.71828): ");
            double parsedDouble = Double.parseDouble(scanner.nextLine());
            System.out.println("Результат double: " + parsedDouble + "\n");

            System.out.print("Введите значение типа boolean (true/false): ");
            boolean parsedBoolean = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Результат boolean: " + parsedBoolean + "\n");

            System.out.print("Введите символ для char: ");
            String inputChar = scanner.nextLine();
            if (!inputChar.isEmpty()) {
                char parsedChar = inputChar.charAt(0);
                System.out.println("Результат char: '" + parsedChar + "'\n");
            }

            System.out.println("Все данные успешно обработаны!");

        } catch (NumberFormatException e) {
            System.err.println("\nОшибка: Введено некорректное число или значение выходит за пределы типа!");
        } finally {
            scanner.close();
        }
    }
}