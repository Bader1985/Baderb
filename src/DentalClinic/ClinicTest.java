package DentalClinic;



import org.junit.jupiter.api.Test;

class ClinicTest {

  @Test
  public void testAddDoctor() {
    Clinic clinic = new Clinic();
    Doctor doctor = new Doctor(1,"name","profession");

  }

  @Test
  public void testAddProfessional() {
    Clinic clinic = new Clinic();


  }

  @Test
  public void testAddComplaint() {
    Clinic clinic = new Clinic();
    


  }

  @Test
  public void buildTimesMap() {
    Clinic clinic = new Clinic();
  }

  @Test
  public void readComplaint() {
    Clinic clinic = new Clinic();

  }

  @Test
  public void readDoctor() {
    Clinic clinic = new Clinic();
  }
}