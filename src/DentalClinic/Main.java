package DentalClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите вашу Имя");
        String name = br.readLine();
        System.out.println("какой ваша возрост");
        int age = Integer.parseInt(br.readLine());
        System.out.println("выбирайте врача ");


        Map<Integer, String> doctors = new HashMap<>();
        doctors.put(1, "Bader");
        doctors.put(2, "Alesia");
        doctors.put(3, "Alexandr");
        doctors.put(4, "Maria");


        for (Map.Entry<Integer, String> item : doctors.entrySet()) {
            System.out.println(item.getKey()+"- " + item.getValue());
        }
        int D = Integer.parseInt(readDoctor(doctors));

        Map<Integer, String> profession = new HashMap<>();
        profession.put(1, "General dentist");
        profession.put(2, "Surgery");
        profession.put(3, "Orthodontic");
        profession.put(4, "Pediatric");
        System.out.println("Вы выбрали доктора " + doctors.get(D));
        System.out.println("Профессия доктора: " + profession.get(D));


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


