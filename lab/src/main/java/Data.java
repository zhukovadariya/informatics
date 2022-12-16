//Создать регулярные выражения проверки вводимой даты в форматах:
//дд.мм.гггг
//дд.мм.гггг или дд.мм.гг
//гггг-мм-дд
//дд/ММ/гггг - ММ - обозначение римскими цифрами

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату: "); //вводим изначальное значание даты
        String str = sc.next();

        int proverka = 0;
// matches() возвращает значение true, если, и только в том случае,
// если эта строка соответствует заданному регулярному выражению regex
        if (str.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$")) {
            System.out.println("гггг-мм-дд");
            proverka += 1;
        }
        if (str.matches("^(0[1-9]|[1-2][0-9]|3[0-1]).(0[1-9]|1[0-2]).\\d{4}$")) {
            System.out.println("дд.мм.гггг");
            proverka += 1;

        }
        if (str.matches("^(0[1-9]|[1-2][0-9]|3[0-1]).(0[1-9]|1[0-2]).\\d{4}$|^(0[1-9]|[1-2][0-9]|3[0-1]).(0[1-9]|1[0-2]).\\d{2}$")) {
            System.out.println("дд.мм.гггг или дд.мм.гг");
            proverka += 1;

        }
        if (str.matches("^(0[1-9]|[1-2][0-9]|3[0-1])/((I{1,3})|IV|(V(I{0,3})|IX|X|(X(I{0,2}))))/\\d{4}$")) {
            System.out.println("дд/ММ/гггг");
            proverka += 1;

        }
        if(proverka == 0) {
            System.out.println("Вы ввели неверный формат");
        }
    }
}


