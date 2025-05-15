package Homework6;

public class Clinic {

    public static void main(String[] args) {
        // Создаем врачей
        Doctor surgeon = new Surgeon();
        Doctor therapist = new Therapist();
        Doctor dentist = new Dentist();

        // Создаем пациента и назначаем план лечения
        Patient patient = new Patient("Иван", 1); // План лечения = 1
        System.out.println("Пациент: " + patient.getName() + ", План лечения: " + patient.getTreatmentPlan());

        // Назначаем врача согласно плану лечения
        ((Therapist)therapist).assignDoctor(patient, surgeon, dentist);
    }
}

