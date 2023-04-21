package DentalClinic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Clinic {

  public static Map<Integer, String> Doctors() {
    Map<Integer, String> doctors = new HashMap<>();
    doctors.put(1, "Bader");
    doctors.put(2, "Alesia");
    doctors.put(3, "Alexandr");
    doctors.put(4, "Maria");
    return doctors;

  }

  public static Map<Integer, String> Professional() {
    Map<Integer, String> profession = new HashMap<>();
    profession.put(1, "General dentist");
    profession.put(2, "Surgery");
    profession.put(3, "Orthodontic");
    profession.put(4, "Pediatric");
    return profession;
  }

  public static Map<Integer, String> Complaints() {
    Map<Integer, String> complaint = new HashMap<>();
    complaint.put(1, "control examination");
    complaint.put(2, "Professional tooth cleaning");
    complaint.put(3, "Check-up + professional teeth cleaning");
    complaint.put(4, "pain or discomfort");
    complaint.put(5, "Advice on dentures");
    complaint.put(6, "Orthodontic consultation");
    complaint.put(7, "Implant");
    return complaint;
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

  public static String readComplaint(Map<Integer, String> complaint) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String m = null;
    while (m == null || !complaint.containsKey(Integer.parseInt(m))) {
      try {
        m = br.readLine();
      } catch (NumberFormatException e) {
        System.out.println("Ошибка: введите целое число");
      }
      if (m != null && !complaint.containsKey(Integer.parseInt(m))) {
        System.out.println("Ошибка: неверный выбор врача");
      }
    }
    return m;
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







