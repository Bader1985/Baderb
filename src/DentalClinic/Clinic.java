package DentalClinic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Clinic {

  public static Map<Integer, String> Complaints() {
    Map<Integer, String> complaint = new HashMap<>();
    complaint.put(1, "control examination");
    complaint.put(2, "Professional tooth cleaning");
    complaint.put(3, "Check-up + professional teeth cleaning");
    complaint.put(4, "pain or discomfort");
    complaint.put(5, "Advice on dentures");
    complaint.put(6, "Orthodontic consultation");
    complaint.put(7, "Implant");

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

  enum Time {
    MORNING,
    EVENING,

  }

  public static Map<Time, String> buildTimesMap() {
    Map<Time, String> times = new HashMap<>();
    times.put(Time.MORNING, "9-12");
    times.put(Time.EVENING, "14-17");
    return times;
  }
}







