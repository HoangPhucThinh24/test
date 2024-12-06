package btvn5_5;

public class Patient extends Person {
    private String medicalRecord; // Số bệnh án
    private String admissionDate; // Ngày nhập viện

    public Patient(String name, int age, String medicalRecord, String admissionDate) {
        super(name, age);
        this.medicalRecord = medicalRecord;
        this.admissionDate = admissionDate;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("so benh an: " + medicalRecord);
        System.out.println("ngay nhap vien: " + admissionDate);
    }
}
