package Homework6;

class Surgeon extends Doctor {
    public Surgeon() {
        super("Иван Петрович", "Хирург");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Хирург " + getName() + " проводит операцию пациенту " + patient.getName() + ".");
    }
}
