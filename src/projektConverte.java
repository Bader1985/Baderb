import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class projektConverte {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Double> rate = new HashMap<>(); // курс валют относительно USD на 23.02.2023
        rate.put(1, 1.00); // USD
        rate.put(2, 4.65); // RON
        rate.put(3, 0.94); // EUR
        rate.put(4, 75.73); // RUB

        Map<Integer, String> names = new HashMap<>(); // названия валют
        names.put(1, "USD"); // USD
        names.put(2, "RON"); // RON
        names.put(3, "EUR"); // EUR
        names.put(4, "RUB"); // RUB
        System.out.println();
        System.out.println("--Конвертер валют--");

        int answer = 1; // ответ для повтора цикла
        do {
            System.out.println();
            System.out.println("Выберите текущую валюту:");
            printMenu(names);
            int currency = readCurrency(rate); // чтение и проверка корректности введенной команды (валюты)
            double n = rate.get(currency); // коэффициент (курс валюты); находим соответствие в Map rate
            // по выбранной команде (валюте)

            System.out.println("Введите сумму в " + names.get(currency) + ": ");
            double value = 0; // сумма для конвертации
            while (value <= 0) { // продолжаем спрашивать, пока не будет введено корректное значение
                try {
                    value = Double.parseDouble(br.readLine()); // ввод суммы
                    if (value <= 0) { // ошибка, если отрицательное число или 0
                        System.out.print("Некорректное значение! Попробуйте еще раз: ");
                    }
                } catch (NumberFormatException e) { //ошибка, если ввели слово
                    System.out.print("Неправильный формат ввода! Попробуйте еще раз: ");
                }
            }

            System.out.println("Выберите валюту вывода:");
            printMenu(names);
            currency = readCurrency(rate); // чтение и проверка корректности введенной команды (валюты)
            double n2 = rate.get(currency); // коэффициент (курс валюты) на выходе; находим соответствие в
            // Map rate по выбранной команде (валюте)

            double result = Math.round(n2 * value / n * 100.0) / 100.0; // формула для расчета итоговой
            // суммы с двумя знаками после запятой
            System.out.println();
            System.out.println("Итоговая сумма: " + result + " " + names.get(currency));

            System.out.println();
            System.out.println("Запустить конвертер снова? [1.Повторить  2.Выйти]: ");
            answer = Integer.parseInt(br.readLine());
        } while (answer == 1); // условие для повтора
    }

    public static void printMenu(Map<Integer, String> names) {
        for (Map.Entry<Integer, String> entry : names.entrySet()) { // цикл печати всех значений из
            // Map с названиями валют
            System.out.print(entry.getKey() + "." + entry.getValue() + "  "); // печать ключа и значения
        }
        System.out.println();
    }

    public static int readCurrency(Map<Integer, Double> rate) throws IOException { //чтение и
        // проверка команды (валюты)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int currency = 0; // значение команды (валюты)
        while (!rate.containsKey(currency)) { // продолжаем спрашивать, пока не будет введено корректное значение
            try {
                currency = Integer.parseInt(br.readLine());
                if (!rate.containsKey(currency)) { // ошибка, если нет такой команды (валюты) - ключа в
                    // Map rate
                    System.out.print("Некорректное значение! Попробуйте еще раз: ");
                }
            } catch (NumberFormatException e) { // ошибка, если ввели слово
                System.out.print("Неправильный формат ввода! Попробуйте еще раз: ");
            }
        }
        return currency;
    }
}

