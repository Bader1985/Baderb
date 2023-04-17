package DentalClinic;

public class Human {

  int id;
  String name;

  public Human(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Human{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
