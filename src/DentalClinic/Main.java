package DentalClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        System.out.println(ANSI_RED + "\uD83E\uDDB7" + "BADER-CLINIC" + "\uD83E\uDDB7");
        System.out.println(ANSI_PURPLE + "введите вашу Имя");
        String name = br.readLine();
        System.out.println(ANSI_BLACK + "какой ваша возрост");
        int age = Integer.parseInt(br.readLine());
        System.out.println(ANSI_PURPLE + "выбирайте врача ");

        Map<Integer, String> doctors = new HashMap<>();
        doctors.put(1, "Bader");
        doctors.put(2, "Alesia");
        doctors.put(3, "Alexandr");
        doctors.put(4, "Maria");


        for (Map.Entry<Integer, String> item : doctors.entrySet()) {
            System.out.println(ANSI_BLUE + item.getKey() + "- " + item.getValue());
        }
        int D = Integer.parseInt(readDoctor(doctors));

        Map<Integer, String> profession = new HashMap<>();
        profession.put(1, "General dentist");
        profession.put(2, "Surgery");
        profession.put(3, "Orthodontic");
        profession.put(4, "Pediatric");
        System.out.println("Вы выбрали доктора " + ANSI_RESET + doctors.get(D));
        System.out.println("Профессия доктора: " + ANSI_CYAN + profession.get(D));


    }

    public static String readDoctor(Map<Integer, String> profession) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String D = null;
        while (D == null || !profession.containsKey(Integer.parseInt(D))) {
            try {
                D = br.readLine();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число");
            }
            if (D != null && !profession.containsKey(Integer.parseInt(D))) {
                System.out.println("Ошибка: неверный выбор врача");
            }
        }
        return D;
    }
}

