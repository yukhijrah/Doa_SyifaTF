package syifa.app.kumpulandoa.Holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import syifa.app.kumpulandoa.R;

/**
 * Created by USER on 18/11/2018.
 */

public class AdzanHolder extends RecyclerView.ViewHolder {

    public TextView namaSholat;
    public TextView Waktu;
    public CardView cardItemAdzan;

    public AdzanHolder(View itemView) {
        super(itemView);
        namaSholat= (TextView) itemView.findViewById(R.id.nama_sholat);
        Waktu = (TextView) itemView.findViewById(R.id.waktu_sholat);
        cardItemAdzan = (CardView) itemView.findViewById(R.id.cardItem_Adzan);
    }

}
