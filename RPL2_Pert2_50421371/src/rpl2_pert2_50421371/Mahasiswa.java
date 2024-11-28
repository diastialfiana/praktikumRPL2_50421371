package rpl2_pert2_50421371;

public class Mahasiswa extends Student {
    
    public Mahasiswa(){
        super();
    }
    
    @Override
    public String toString(){
        return "Nama = " + getName() + "\n" +
                "NPM = " + getNpm() + "\n" +
                "Kelas = " + getClassNumber() + "\n" +
                "Tahun Lahir = " + getBirthYear() + "\n" +
                "Umur = " + calculateAge() + "\n" +
                "Alamat = " + getAlamat();
    }
}
