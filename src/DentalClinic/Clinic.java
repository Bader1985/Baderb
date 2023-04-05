package DentalClinic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Clinic {

  public static Map<Integer, String> Treat() {
    Map<Integer, String> treatment = new HashMap<>();
    treatment.put(1, "Karies");
    treatment.put(2, "Pulpit");
    treatment.put(3, "Periodontal");
    treatment.put(4, "Remove Tooth");
    treatment.put(5, "Implant");
    treatment.put(6, "Scaler");
    for (Map.Entry<Integer, String> item1 : treatment.entrySet()) {
      System.out.println(item1.getKey() + "-" + item1.getValue());

    }
    return treatment;
  }

  public static Map<Integer, String> Complaints() {
    Map<Integer, String> complaint = new HashMap<>();
    complaint.put(1, "consultation");
    complaint.put(2, "aching pain");
    complaint.put(3, "abscess");
    complaint.put(4, "acute pain");
    for (Map.Entry<Integer, String> item1 : complaint.entrySet()) {
      System.out.println(item1.getKey() + "-" + item1.getValue());

    }
    return complaint;
  }

  public static String readcomplaint(Map<Integer, String> complaint) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n = null;
    while (n == null || !complaint.containsKey(Integer.parseInt(n))) {
      try {
        n = br.readLine();
      } catch (NumberFormatException e) {
        System.out.println("Ошибка: введите целое число");
      }
      if (n != null && !complaint.containsKey(Integer.parseInt(n))) {
        System.out.println("Ошибка: неверный выбор врача");
      }
    }
    return n;
  }

  public static String readTreatment(Map<Integer, String> complaint) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n = null;
    while (n == null || !complaint.containsKey(Integer.parseInt(n))) {
      try {
        n = br.readLine();
      } catch (NumberFormatException e) {
        System.out.println("Ошибка: введите целое число");
      }
      if (n != null && !complaint.containsKey(Integer.parseInt(n))) {
        System.out.println("Ошибка: неверный выбор врача");
      }
    }
    return n;
  }
}







