package Homework6;

class Dentist extends Doctor {
    public Dentist() {
        super("Елена Васильевна", "Дантист");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Дантист " + getName() + " лечит зубы пациенту " + patient.getName() + ".");
    }
}
