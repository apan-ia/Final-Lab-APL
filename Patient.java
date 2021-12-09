public class Patient implements Observer{
    protected String allergyType;
    public Patient(String allergyType) {
        super();
        this.allergyType = allergyType;
    }
    
    //method reminder dioverride dari class Observer
    @Override
    public void reminder(String doctor, String reminder) {
        System.out.printf("'%s' received notification from '%s', Reminder: '%s'\n", allergyType, doctor, reminder);
    } 
}
