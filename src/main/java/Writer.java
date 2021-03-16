import java.io.*;

public class Writer {

    private static FileWriter fileWriter;
    private static BufferedReader reader;

    static {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            fileWriter = new FileWriter(new File("src/main/resources/output.csv"));
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void write(double x, double result, Modules modules) {
        try {
            System.out.println("Вывести значение для модуля " + modules.toString() + "? [y/n]");
            String answer = reader.readLine();
            if (answer == null) return;
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.println("Неверный ответ");
                answer = reader.readLine();
            }
            if (answer.equals("y")) {
                fileWriter.write(x + "," + result + "," + modules.toString() + "\n");
                fileWriter.flush();
            }
        }catch (IOException e) {
            System.out.println("Ошибка при работе с файлом.");
        }
    }

    public static void close() {
        try {
            reader.close();
            fileWriter.close();
        }catch (IOException e) {
            System.out.println("Не удалось закрыть потоки");
        }
    }
}