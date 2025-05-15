package Homework6;

class Therapist extends Doctor {
    public Therapist() {
        super("Анна Сергеевна", "Терапевт");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Терапевт " + getName() + " проводит общий осмотр пациенту " + patient.getName() + ".");
    }

    // Метод назначения врача
    public void assignDoctor(Patient patient, Doctor surgeon, Doctor dentist) {
        int treatmentPlan = patient.getTreatmentPlan();

        if (treatmentPlan == 1) {
            System.out.println("Назначен хирург.");
            patient.setDoctor(surgeon);
            surgeon.treat(patient);
        } else if (treatmentPlan == 2) {
            System.out.println("Назначен дантист.");
            patient.setDoctor(dentist);
            dentist.treat(patient);
        } else {
            System.out.println("Назначен терапевт.");
            patient.setDoctor(this);
            this.treat(patient);
        }
    }
}