public interface Subject {

    public void addPatient(Observer observer);//menambah pasien
    public void removePatient(Observer observer);//menghapus pasien
    public void remindPatient(String reminder);//mengingatkan pasien
    
   }