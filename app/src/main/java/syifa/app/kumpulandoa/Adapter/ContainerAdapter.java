package syifa.app.kumpulandoa.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import syifa.app.kumpulandoa.Fragment.HomeFragment;

/**
 * Created by USER on 01/11/2018.
 */

public class ContainerAdapter extends FragmentStatePagerAdapter {
    public List<Fragment> fragments = new ArrayList<>();
    public List<String> labels = new ArrayList<>(); //TODO(bersifat optional)

    public ContainerAdapter (FragmentManager fm){
        super (fm);
    }

    public void addFragment(Fragment fragment, String label){
        // unutk menampung fragmentnya
        fragments.add(fragment);
        // untuk menamakan fragment nya
        labels.add(label);
    }

    // TODO(method ini bersifat optional)
    public String getLabel(int posision){ //jika digunakan harus ada ini
        return labels.get(posision);

    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
