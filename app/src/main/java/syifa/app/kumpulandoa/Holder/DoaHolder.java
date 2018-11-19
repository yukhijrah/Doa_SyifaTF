package syifa.app.kumpulandoa.Holder;

import android.net.wifi.aware.PublishConfig;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import syifa.app.kumpulandoa.R;

/**
 * Created by USER on 18/11/2018.
 */

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView judulDoa;
    public TextView ayatDoa;
    public TextView ejaanDoa;
    public TextView artiDoa;
    public CardView cardItemDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        judulDoa = (TextView) itemView.findViewById(R.id.judul_doa);
        ayatDoa = (TextView) itemView.findViewById(R.id.ayat_doa);
        ejaanDoa = (TextView) itemView.findViewById(R.id.ejaan_doa);
        artiDoa =  (TextView) itemView.findViewById(R.id.arti_doa);
        cardItemDoa = (CardView) itemView.findViewById(R.id.cardItem_Doa);

    }
}
