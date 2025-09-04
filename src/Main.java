import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 //8.5. Напечатать полную таблицу сложения в виде: 1 + 1 = 2 2 + 1 = 3 ... 9 + 1 = 9
/*
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                sum = i + j;
                System.out.print(j + " + " + i + " = " + sum + "       ");
            }
            System.out.println("");
        }

*/


      //  8.6. Напечатать полную таблицу сложения в виде: 1 + 1 = 2 1 + 2 = 3 ... 1 + 9 = 10\
/*
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                sum = i + j;
                System.out.print(i + " + " + j + " = " + sum + "       ");
            }
            System.out.println("");
        }
*/

// 8.7. Напечатать полную таблицу умножения в виде: 1 х 1 = 1 1 х 2 = 2 ... 1 х 9 = 9
/*
        int result = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                result = i * j;
                System.out.print(i + " x " + j + " = " + result + "       ");
            }
            System.out.println("");
        }

*/

        //8.8. Напечатать полную таблицу умножения в виде: 1 х 1 = 1 2 x 1 = 2 ... 9 x 1 = 9

   /*     int result = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                result = i * j;
                System.out.print(j + " x " + i + " = " + result + "       ");
            }
            System.out.println("");
        }
*/


//        Известны оценки каждого из 15 студентов, полученные в сессию на экзаменах
//        по трем предметам
//        Организовать ввод информации по этой таблице и определить:
//        а) количество студентов, сдавших сессию без двоек;
//        б) количество предметов, по которым были получены только оценки "5" и "4";
//        в) количество двоек по каждому предмету.

        Scanner sc = new Scanner(System.in);
        int without2 = 0;
        int countSubject1 = 0, countSubject2 = 0, countSubject3 = 0;
        int x = 0, sum = 0, y = 0, z = 0;


        for (int student = 1; student <= 4; student++) {
            System.out.println(" Студент № " + student + " : ");
            int subject1 = sc.nextInt();
            if (subject1 == 2) {
                countSubject1++;
            }
            if (subject1 > 3) {
                x++;
            } else {
                x--;
            }
            int subject2 = sc.nextInt();
            if (subject2 == 2) {
                countSubject2++;
            }
            if (subject2 > 3) {
                y++;
            } else {
                y--;
            }
            int subject3 = sc.nextInt();
            if (subject3 == 2) {
                countSubject3++;
            }
            if (subject3 > 3) {
                z++;
            } else {
                z--;
            }
            if (subject1 != 2 && subject2 != 2 && subject3 != 2) {
                without2++;
            }

        }
        if (x > 0) {
            sum++;
        }
        if (y > 0) {
            sum++;
        }
        if (z > 0) {
            sum++;
        }
        System.out.println("Без двоек сдали : " + without2 + " студент(а/ов)");
        System.out.println("Количество двоек по каждому предмету : " + "по первому = " + countSubject1 + ", по второму = " +
                countSubject2 + ", по третьему = " + countSubject3);
        System.out.println("количество предметов по которым были получены только оценки 5 и 4: " + sum);


    }
}