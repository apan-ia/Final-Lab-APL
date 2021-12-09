public class Main {
    public static void main(String[] args) {
        Shape foodRect = new ShapeColorDecorator(new Rectangle(), Color.BLUE);//decorator untuk alergi makanan
        Shape weatherRect = new ShapeColorDecorator(new Rectangle(), Color.RED);//decorator untuk alergi cuaca
        Allergy food = new Allergy("Food", "Raodah");//objek alergi makanan dan nama dokter
        Allergy weather = new Allergy("Weather", "Lukman");//objek alergi cuaca dan nama dokter
   
        //pasien yang terdaftar
        Patient adi = new Patient("Adi");
        Patient mutimah = new Patient("Mutimah");
        Patient samsul = new Patient("Samsul");
        Patient rika = new Patient("Rika");
        Patient salahuddin = new Patient("Salahuddin");

        //pasien yang alergi terhadap makanan
        food.addPatient(adi);
        food.addPatient(mutimah);
        food.addPatient(samsul);

        //pasien yang alergi terhadap cuaca
        weather.addPatient(rika);
        weather.addPatient(salahuddin);

        //memanggil rectangle dan mencetak notifikasi untuk pasien pengidap alergi makanan
        foodRect.draw();
        food.reminder("Jangan Lupa Minum Obat");

        //memanggil rectangle dan mencetak notifikasi untuk pasien pengidap alergi cuaca
        weatherRect.draw();
        weather.reminder("Pakai Jaket Saat Cuaca Dingin");

        //menghapus salah satu pasien dari list alergi makanan
        food.removePatient(adi);

        //kembali memanggil rectangle dan mencetak notifikasi untuk pasien pengidap alergi makanan
        foodRect.draw();
        food.reminder("Makanannya Dijaga");
   }
}
