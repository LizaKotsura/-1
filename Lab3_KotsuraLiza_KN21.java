import java.util.Scanner;

public class Lab3_LastName_Group {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть ціле число (int): ");
        int intVal = scanner.nextInt();

        System.out.print("Введіть число з плаваючою крапкою (double): ");
        double doubleVal = scanner.nextDouble();

        scanner.nextLine(); // Очищення буфера після nextDouble()

        System.out.print("Введіть рядок (String): ");
        String strVal = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean boolVal = scanner.nextBoolean();

        System.out.println("\n================ РЕЗУЛЬТАТИ ФОРМАТУВАННЯ ================\n");



        System.out.printf("1. [printf] Базовий: int=%d, double=%f, str=%s, bool=%b%n", 
                          intVal, doubleVal, strVal, boolVal);


        System.out.printf("2. [printf] Число %d у HEX: %X, у OCT: %o%n", 
                          intVal, intVal, intVal);


        System.out.printf("3. [printf] Double (2 знаки): %.2f | Обрізаний рядок (3 симв.): %.3s%n", 
                          doubleVal, strVal);


        System.out.printf("4. [printf] Ширина поля 10: Int=[%10d], Str ліворуч=[%-10s]%n", 
                          intVal, strVal);


        System.out.printf("5. [printf] Заповнення нулями: [%08d] | Науковий формат: %e%n", 
                          intVal, doubleVal);





        String format6 = "6. [Конкатенація] Значення: " + intVal + " | " + doubleVal + " | " + strVal + " | " + boolVal;
        System.out.println(format6);


        String format7 = "7. [String.format] З розділювачем тисяч: " + String.format("%,d", intVal) + 
                         ", з знаком: " + String.format("%+f", doubleVal);
        System.out.println(format7);


        String format8 = "8. [Конкатенація] Рядок у UPPERCASE: " + strVal.toUpperCase() + 
                         ", Boolean u UPPERCASE: " + String.format("%B", boolVal);
        System.out.println(format8);



        String format9 = """
                9. [formatted()] Текстовий блок:
                   • Ціле число (HEX): 0x%x
                   • Дійсне (проценти): %.1f%%
                   • Рядок: '%s'
                """.formatted(intVal, doubleVal * 100, strVal);
        System.out.print(format9);


        String format10 = "10. [formatted()] Компактно: [Int: %+d | Double: %10.3f | Bool: %b]".formatted(intVal, doubleVal, boolVal);
        System.out.println(format10);

        scanner.close();
    }
}