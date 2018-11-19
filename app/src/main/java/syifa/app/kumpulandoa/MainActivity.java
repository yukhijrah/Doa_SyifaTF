package syifa.app.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import syifa.app.kumpulandoa.Adapter.ContainerAdapter;
import syifa.app.kumpulandoa.Fragment.DoaFragment;
import syifa.app.kumpulandoa.Fragment.HomeFragment;
import syifa.app.kumpulandoa.Fragment.ProfileFragment;

/**
 * Created by USER on 01/11/2018.
 */

public class MainActivity extends AppCompatActivity {

    private ViewPager vpMain;
    private Button btnHome, btnDoa, btnProfile;

    private ContainerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // casting object (view)
        vpMain = (ViewPager) findViewById(R.id.view_pager_main);
        btnHome = (Button) findViewById(R.id.btn_home);
        btnDoa = (Button) findViewById(R.id.btn_doa);
        btnProfile = (Button) findViewById(R.id.btn_profile);

        setContainerPrepared(); // panggil method untuk preparing fragment container
        onButtonsClicked(); // panggil method ini biar buttonnya bisa di klik
    }

    private void setContainerPrepared() {
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getString(R.string.menu_home_adzan));
        adapter.addFragment(new DoaFragment(), getString(R.string.menu_doa));
        //adapter.addFragment(new ProfileFragment(), getString(R.string.menu_profile));
        vpMain.setAdapter(adapter);
    }

    private void onButtonsClicked () {

        // ini untuk hadle click button pd btnHome
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vpMain.setCurrentItem(0);

            }
        });

        // ini untuk hadle click button pd btnDoa
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vpMain.setCurrentItem(1);
            }
        });

        // ini untuk hadle click button pd btnProfile
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vpMain.setCurrentItem(2);
            }
        });
    }
}
