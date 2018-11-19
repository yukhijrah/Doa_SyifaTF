package syifa.app.kumpulandoa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import syifa.app.kumpulandoa.DetailActivity;
import syifa.app.kumpulandoa.Holder.AdzanHolder;
import syifa.app.kumpulandoa.Model.Adzan;
import syifa.app.kumpulandoa.R;

/**
 * Created by USER on 17/11/2018.
 */

public class AdzanAdapter extends RecyclerView.Adapter<AdzanHolder> {

    Context context;
    List<Adzan>item;

    public AdzanAdapter(Context context, List<Adzan> item) {
        this.context = context;
        this.item = item;
    }

    public AdzanAdapter(List<Adzan> adzans) {

    }

    @Override
    public AdzanHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adzan, null);
        return new AdzanHolder(view);
    }

    @Override
    public void onBindViewHolder(AdzanHolder holder, final int position) {
        holder.namaSholat.setText(item.get(position).getNama_sholat());
        holder.Waktu.setText(item.get(position).getWaktu());

        holder.cardItemAdzan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("nama_sholat", item.get(position).getNama_sholat());
                i.putExtra("waktu", item.get(position).getWaktu());

                view.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
