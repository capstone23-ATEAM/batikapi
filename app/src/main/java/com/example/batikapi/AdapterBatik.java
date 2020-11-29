package com.example.batikapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBatik extends RecyclerView.Adapter<AdapterBatik.ViewHolder> {
    private List<ResultsItem> list;
    private Context context;

    public AdapterBatik(Context context, List<ResultsItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterBatik.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBatik.ViewHolder holder, int position) {
        final ResultsItem ri = list.get( position );
        holder.tvNamaBatik.setText(ri.getNamaBatik());
        holder.tvDaerahBatik.setText(ri.getDaerahBatik());

        holder.cvklik.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( context, DetailActivity.class );
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // biar bisa muncul 
                i.putExtra("nama_batik", ri.getNamaBatik());
                i.putExtra( "daerah_batik", ri.getDaerahBatik());
                i.putExtra("makna_batik", ri.getMaknaBatik());
                i.putExtra("harga_rendah", String.valueOf(ri.getHargaRendah()));
                i.putExtra("harga_tinggi", String.valueOf(ri.getHargaTinggi()));
                i.putExtra("link_batik", ri.getLinkBatik());
                context.startActivity(i);
            }
        } );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNamaBatik;
        private TextView tvDaerahBatik;
        private CardView cvklik;
        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaBatik = itemView.findViewById(R.id.tv_nama_batik);
            tvDaerahBatik = itemView.findViewById(R.id.tv_daerah_batik);
            cvklik = itemView.findViewById(R.id.cv_klik);
        }
    }
}
