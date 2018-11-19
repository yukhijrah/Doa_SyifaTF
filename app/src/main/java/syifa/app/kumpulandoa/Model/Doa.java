package syifa.app.kumpulandoa.Model;

/**
 * Created by USER on 18/11/2018.
 */

public class Doa {
    private String judulDoa;
    private String ayatDoa;
    private String ejaanDoa;
    private String artiDoa;

    public Doa(String judulDoa, String ayatDoa, String ejaanDoa, String artiDoa) {
        this.judulDoa = judulDoa;
        this.ayatDoa = ayatDoa;
        this.ejaanDoa = ejaanDoa;
        this.artiDoa = artiDoa;
    }

    public String getJudulDoa() {
        return judulDoa;
    }

    public String getAyatDoa() {
        return ayatDoa;
    }

    public String getEjaanDoa() {
        return ejaanDoa;
    }

    public String getArtiDoa() {
        return artiDoa;
    }
}
