import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        hardTask5();
        hardTask6();
        hardTask7();
        hardTask8();


    }


    private static void task1() {


        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника - " +fullName);
    }

    private static void task2() {

        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " +fullName);
    }

    private static void task3() {

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника —  " + fullName);

    }


    private static void hardTask5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String middleName = fullName.substring(0, fullName.indexOf(' '));
        String firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        String lastName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.length());

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + middleName);
        System.out.println("Отчество сотрудника — " + lastName);
    }

    private static void hardTask6() {
        String fullName = "ivanov ivan ivanovich";
        String  newFullName [] = fullName.split(" ");
        String secondName = newFullName[0];
        char [] newSecondName = secondName.toCharArray();
        newSecondName[0] = Character.toUpperCase(newSecondName[0]);

        String firstName = newFullName[1];
        char [] newFirstName = firstName.toCharArray();
        newFirstName[0] = Character.toUpperCase(newFirstName[0]);

        String thirdName = newFullName[2];
        char [] newThirdName = thirdName.toCharArray();
        newThirdName[0] = Character.toUpperCase(newThirdName[0]);
        String finalName = String.valueOf(newSecondName) + " " +String.valueOf(newFirstName) +" "+ String.valueOf(newThirdName);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв —  "+ finalName);

    }

    private static void hardTask7() {
        StringBuilder firstStr = new StringBuilder("135");
        StringBuilder secondStr = new StringBuilder("246");
        StringBuilder thirdStr = new StringBuilder();


        int i = 0;
        while (i<firstStr.length()) {
            thirdStr.append(firstStr.charAt(i));
            thirdStr.append(secondStr.charAt(i));
            i++;
        }
        System.out.println(thirdStr);

    }

    private static void hardTask8() {
        String str = "aaabbcddeeffffffff";
        char ch =0;
        StringBuilder strB = new StringBuilder("");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==str.charAt(i+1)) {
                strB.append(str.charAt(i));
                str = str.replace(str.charAt(i), ' ');

            }
        }
        String newStr = strB.toString();

        newStr=newStr.replaceAll("\\s", "");
        System.out.println(newStr);

    }
}