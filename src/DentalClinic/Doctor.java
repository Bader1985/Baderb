package DentalClinic;

public class Doctor extends Human {

  String profession;

  public Doctor(int id, String name, String profession) {
    super(id, name);
    this.profession = profession;
  }

  @Override
  public String toString() {
    return "Doctor{" +
        "profession='" + profession + '\'' +
        ", id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}