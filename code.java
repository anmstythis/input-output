import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class code {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in); // вызов класса для сканирования переменных
        System.out.print("Введите имя студента: ");
        String str = scan.nextLine(); // ввод и сканирование имени студента
        System.out.print("Введите возраст студента: ");
        int age = scan.nextInt(); // ввод и сканирование возраста студента
        if (age < 0){ // онулирование возраста, если введено число меньше 0
            age = 0;
        }
        System.out.print("Введите средний балл студента: ");
        double grade = scan.nextDouble(); // ввод и сканирование среднего балла студента
        if (grade > 5 || grade < 0) { // онулирование баллов, если введено число больше 5 или меньше 0
            grade = 0;
        }

        FileWriter file = new FileWriter("students.txt"); // вызов класса для записи значения переменных в файл
        file.write("Имя: " + str + "\n" + "Возраст: " + age + "\n" + "Средний балл: " + grade); // запись переменных
        file.close(); // закрытие файла, прекращение его работы
    }
}