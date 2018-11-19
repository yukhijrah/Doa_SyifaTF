package syifa.app.kumpulandoa.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import syifa.app.kumpulandoa.DetailActivity;
import syifa.app.kumpulandoa.Holder.AdzanHolder;
import syifa.app.kumpulandoa.Holder.DoaHolder;
import syifa.app.kumpulandoa.Model.Doa;
import syifa.app.kumpulandoa.R;


/**
 * Created by USER on 17/11/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    Context context;
    List<Doa>item;

    public DoaAdapter(Context context, List<Doa> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.item_doa, null);
        return new DoaHolder(view);
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.judulDoa.setText(item.get(position).getJudulDoa());
        holder.ayatDoa.setText(item.get(position).getAyatDoa());
        holder.ejaanDoa.setText(item.get(position).getEjaanDoa());
        holder.artiDoa.setText(item.get(position).getArtiDoa());

        holder.cardItemDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("juduldoa", item.get(position).getJudulDoa());
                i.putExtra("ayat doa", item.get(position).getAyatDoa());
                i.putExtra("ejaan doa", item.get(position).getEjaanDoa());
                i.putExtra("arti doa", item.get(position).getArtiDoa());

                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
