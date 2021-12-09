import java.util.ArrayList;
import java.util.List;

public class Allergy implements Subject{
    protected List<Observer> observers = new ArrayList<Observer>();
    protected String allergyType;
    protected String doctor;

    public Allergy(String allergyType, String doctor) {
        super();
        this.allergyType = allergyType;
        this.doctor = "@" + doctor;
    }

    public String getAllergyType() {
        return allergyType;
    }

    public void setAllergyType(String allergyType) {
        this.allergyType = allergyType;
    }

    public String getDoctor() {
        return doctor;
    }

    public void reminder(String reminder) {
        System.out.printf("\nAllergy: %s, Reminder: %s\n", allergyType, reminder);
        remindPatient(reminder);
    }

    //method untuk menambah pasien
    @Override
    public synchronized void addPatient(Observer observer) {
        observers.add(observer);
    }

    //method untuk menghapus pasien
    @Override
    public synchronized void removePatient(Observer observer) {
        observers.remove(observer);
    }

    //method untuk mengingatkan pasien
    @Override
    public void remindPatient(String reminder) {
        observers.forEach(observer -> observer.reminder(doctor, reminder));
    }
}
