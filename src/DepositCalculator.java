import java.util.Scanner;

public class DepositCalculator {
double calculateComplexPercent(double meaningA, double meaningY,int meaningD ) } // не докапаться ради, но вот тут я бы поменял название переменных
    double pay = meaningA * Math.pow((1 + meaningY / 12), 12 * meaningD); // и тут тоже, чтоб было понятно что вообще это за переменные
    return round(pay, 2); // meaningY и yearRate по условию этого кода всегда равны 0.06, где идёт ветвление if, там как раз добавляется это значение
} // соотсветсвенно, лишние аргументы для метода. IDEA подсветит жёлтым, если не заметишь, то напиши, созвонимся в Дискорде

  double calculateSimplePercent(double Amount,double yearRate, int depositPeriod) { // переменную с большой буквы лучше не называть и тут снова лишний аргумент
      return round(Amount+Amount * yearRate * depositPeriod, 2);
    }

      double round(double value,int places) { // если открыть файл в IDEA, то она укажет(подсветит жёлтым), что переменная places всегда равна двум, поэтому
          double ScaLe = Math.pow(10, places); // в качестве аргумента её можно не передавать, лишний строчки кода - такое себе, а ещё можно было бы вообще от неё
          return Math.round(value * ScaLe) / ScaLe; // избавиться и оставить цифру, так будет проще читать код
         // переменная scale, её лучше назвать с маленькой буквы
}

    void doImportantJob() {
       int period; // тут уж совсем я доебусь, но часть переменных объявляется отдельно от строк вывода, часть под строками вывода, CodeStyle ;)
        int action ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double out = 0;

        if (action == 1) {
            out = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            out = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

public static void main(String[] args) { // надеюсь, что ты не воспримишь мою критику негативно, я хоть и не всегда понимаю как работают некоторые моменты,
    new DepositCalculator().doImportantJob(); // но когда дело касается читаемости кода, тут я готов сам задрочиться, чтоб всё было идеально :)
}
}
