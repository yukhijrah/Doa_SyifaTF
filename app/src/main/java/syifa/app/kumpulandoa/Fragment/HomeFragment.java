package syifa.app.kumpulandoa.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import syifa.app.kumpulandoa.Adapter.AdzanAdapter;
import syifa.app.kumpulandoa.Model.Adzan;
import syifa.app.kumpulandoa.R;

/**
 * Created by USER on 01/11/2018.
 */

public class HomeFragment extends Fragment {

    private List<Adzan> Adzans = new ArrayList<>();

    RecyclerView listJadwalAdzan;
    LinearLayoutManager linear;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false); // false untuk melakukan apapun yg ingin dilakukan
        listJadwalAdzan = view.findViewById(R.id.list_jadwalAdzan);

        linear = new LinearLayoutManager(getActivity());
        listJadwalAdzan.setLayoutManager(linear);

        AdzanAdapter adapter = new AdzanAdapter(Adzans);
        listJadwalAdzan.setAdapter(adapter);

        jadwalAdzanCollection();
        return view;
    }

    private void jadwalAdzanCollection(){
        Adzans.add(new Adzan("Imsyak","03:55 AM"));
        Adzans.add(new Adzan("Shubuh","04:05 AM"));
        Adzans.add(new Adzan("Terbit","05:24 AM"));
        Adzans.add(new Adzan("Dhuha","05:48 AM"));
        Adzans.add(new Adzan("Dzuhur","11:40 AM"));
        Adzans.add(new Adzan("Ashar","03:02 PM"));
        Adzans.add(new Adzan("Maghrib","05:52 PM"));
        Adzans.add(new Adzan("Isya'","07:06 PM"));
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}
