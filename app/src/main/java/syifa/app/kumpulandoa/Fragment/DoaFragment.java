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
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import syifa.app.kumpulandoa.Model.Doa;
import syifa.app.kumpulandoa.R;

/**
 * Created by USER on 01/11/2018.
 */

public class DoaFragment extends Fragment {

    private List<Doa> doas = new ArrayList<>();
    RecyclerView listDoa;

    LinearLayoutManager linear;

    private Button btnHome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        listDoa = view.findViewById(R.id.list_doa);

        linear = new LinearLayoutManager(getActivity());
        listDoa.setLayoutManager(linear);

        doaCollection();

        return view;
    }

    private void doaCollection(){
        doas.add(new Doa("Do'a sebelum tidur","اللّهُمَّ اَحْيَا بِسْمِكَ وَ بِسْمِكَ اَمُوْتُ","Allahumma ahya wa bismika aamut","Dengan menyebut Namamu Ya Allah Aku Hidup dan dengan menyebut Namamu Aku Mati"));
        doas.add(new Doa("Do'a bangun tidur","Alhamdulillahilladzi ba'dama amatana wailaihinnusyur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Segala puji bagi Allah Dzat yang menghidupkan kami setelah kami mati (tidur) dan kepadanyalah kami kembali"));
        doas.add(new Doa("Do'a Masuk masjid","اَللّهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ.","Allahummaf tahlii abwaaba rohmatik","Wahai Tuhanku, bukakanlah untukku pintu-pintu rahmat-Mu"));
        doas.add(new Doa("Do'a keluar masjid","اَللّهُمَّ اِنِّيْ أسْأَلُكَ مِنْ فَضْلِكَ","Allahumma innii asaluka min fadlik","Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu"));
        doas.add(new Doa("Do'a sebelum belajar","رَضِتُ بِااللهِ رَبَا وَبِالْاِسْلاَمِ دِيْنَا وَبِمُحَمَّدٍ نَبِيَا وَرَسُوْلاَ رَبِّ زِدْ نِيْ عِلْمًـاوَرْزُقْنِـيْ فَهْمًـاٍ","Rodlittu billahirobba, wabi islamidina, wabimuhammadin nabiyyaw warasulla ,robbi zidnii ilmaa warzuqnii fahmaa","Kami ridho Allah Swt sebagai Tuhanku, Islam sebagai agamaku, dan Nabi Muhammad sebagai Nabi dan Rasul, Ya Allah, tambahkanlah kepadaku ilmu dan berikanlah aku pengertian yang baik"));
        doas.add(new Doa("Do'a setelah belajar","اَللّٰهُمَّ اخْرِجْنَا مِنْ ظُلُمَاتِ الْوَهْمِ وَاَكْرِمْنَا بِنُوْرِالْفَهْمِ وَافْتَحْ عَلَيْنَا بِمَعْرِفَتِكَوَسَهِّلْ لَنَآ اَبْوَابَ فَضْلِكَ يَآ اَرْحَمَ الرَّاحِمِيْنَ","Allaahumma innii istaudi'uka maa 'allamtaniihi fardud-hu ilayya 'inda haajatii wa laa tansaniihi yaa robbal 'alamiin","Ya Allah, keluarkanlah kami dari kegelapan prasangka muliakanlah kami dengan cahaya kepahaman, bukakanlah pengertian ilmu pada kami dan bukakanlah untuk kami pintu-pintu anugerah-Mu, wahai Dzat yang paling penyayang"));
        doas.add(new Doa("Do'a masuk rumah","بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا ، وَعَلَى اللهِ رَبَّنَا تَوَكَّلْنَا","Bismillahi walajnaa wa bismillahi kharajnaa wa-alallaahi rabbina tawak-kalnaa","Dengan nama Allah kami masuk rumah,dengan nama Allah aku keluar rumah, serta kepada-Nya aku berserah diri"));
        doas.add(new Doa("Do'a keluar rumah","بِسْمِ اللَّهِ ، تَوَكَّلْتُ عَلَى اللَّهِ ، وَلا حَوْلَ وَلا قُوَّةَ إِلاَّ بِاللَّه","Bismilaahi tawakkaltu 'alallahi wa laa hawla wa laa quwwata illaa billaahi","Dengan menyebut nama Allah, aku menyerahkan diriku pada Allah dan tidak ada daya dan kekuatan selain dengan Allah saja"));
        doas.add(new Doa("Do'a untuk orang tua","اَللهُمَّ اغْفِرْلِىْ ذُنُوْبِىْ وَلِوَالِدَىَّ وَارْحَمْهُمَا كَمَا رَبَّيَانِىْ صَغِيْرًا","Alloohummaghfirlii waliwaalidayya warham humma kamaa rabbayaa nii shaghiiraa","Ya Allah, berikanlah ampunan kepadaku atas dosa-dosaku dan dosa-dosa kedua orang tuaku, dan kasihanilah keduanya itu sebagaimana beliau berdua merawatku ketika aku masih kecil"));
        doas.add(new Doa("Do'a sukses dunia akhirat","رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي الآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ","Robbana atina fiddunya hasanah wafil akhiroti hasanah waqina adzabannar","Ya Tuhan Kami, berilah Kami kebaikan di dunia dan kebaikan di akhirat dan peliharalah Kami dari siksa neraka"));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {  // fungsi ini untuk melakukan casting apapun
        super.onViewCreated(view, savedInstanceState);
        btnHome = (Button) view.findViewById(R.id.btn_home);
    }
}
