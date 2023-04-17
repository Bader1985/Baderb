package DentalClinic;

public class Patient extends Human {

  int phone;

  public Patient(int id, String name, int phone) {
    super(id, name);
    this.phone = phone;
  }

  @Override
  public int getId() {
    return super.getId();
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String toString() {
    return "Patient{" +
        "phone=" + phone +
        ", id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
