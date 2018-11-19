package syifa.app.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import syifa.app.kumpulandoa.Adapter.AdzanAdapter;
import syifa.app.kumpulandoa.Adapter.DoaAdapter;

/**
 * Created by USER on 17/11/2018.
 */

public class DetailActivity extends AppCompatActivity {

    /* praktikum
    private List<DoaAdapter> doas = new ArrayList<>();
    private RecyclerView listDoa;

    public DetailActivity(List<DoaAdapter> doas, RecyclerView listDoa) {
        this.doas = doas;
        this.listDoa = listDoa;
    }

    */
    TextView judulDoa, ayatDoa, ejaanDoa, artiDoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        judulDoa = (TextView)findViewById(R.id.nama_sholat);
        ayatDoa = (TextView)findViewById(R.id.ayat_doa);
        ejaanDoa = (TextView)findViewById(R.id.ejaan_doa);
        artiDoa = (TextView)findViewById(R.id.arti_doa);
    }
}
