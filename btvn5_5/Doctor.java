package btvn5_5;

public class Doctor extends Person {
    private String specialty;
    private int workingHours;

    public Doctor(String name, int age, String speciality, int workingHours) {
        super(name, age);
        this.specialty = speciality;
        this.workingHours = workingHours;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("chuyen khoa: " + specialty);
        System.out.println("gio lam viec: " + workingHours);
    }
}
