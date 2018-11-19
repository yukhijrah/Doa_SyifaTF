package syifa.app.kumpulandoa.Model;

/**
 * Created by USER on 18/11/2018.
 */

public class Adzan {
    private String nama_sholat;
    private String waktu;

    public Adzan(String nama_sholat, String waktu) {
        this.nama_sholat = nama_sholat;
        this.waktu = waktu;
    }

    public String getNama_sholat() {
        return nama_sholat;
    }

    public String getWaktu() {
        return waktu;
    }
}
