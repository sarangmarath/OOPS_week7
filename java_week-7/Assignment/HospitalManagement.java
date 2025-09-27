class MedicalStaff {
    protected String name;
    public MedicalStaff(String name) { this.name = name; }
    public void shift() { System.out.println(name + " shift started."); }
}

class Doctor extends MedicalStaff {
    public Doctor(String name) { super(name); }
    public void diagnose() { System.out.println(name + " is diagnosing patients."); }
}

class Nurse extends MedicalStaff {
    public Nurse(String name) { super(name); }
    public void administerMedicine() { System.out.println(name + " is administering medicine."); }
}

class Technician extends MedicalStaff {
    public Technician(String name) { super(name); }
    public void operateEquipment() { System.out.println(name + " is operating medical equipment."); }
}

public class HospitalManagement {
    public static void main(String[] args) {
        MedicalStaff[] staff = {
            new Doctor("Dr. Smith"),
            new Nurse("Nurse Amy"),
            new Technician("Tech John")
        };

        for (MedicalStaff m : staff) {
            m.shift(); // Upcasting works
            // m.diagnose(); // ❌ Can't call subclass-specific method
        }
    }
}
