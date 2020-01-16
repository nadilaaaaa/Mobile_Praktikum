package com.example.pertemuan6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HimaAdapter extends RecyclerView.Adapter<HimaAdapter.HimaViewHolder> {

    private Context context;

    private List<Hima> himaList;

    public HimaAdapter(Context context) {
        this.context = context;
    }

    public List<Hima> getHimaList() {
        return himaList;
    }

    public void setHimaList(List<Hima> himaList) {
        this.himaList = himaList;
    }

    @NonNull
    @Override
    public HimaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_model, parent, false);
        ButterKnife.bind(this, view);
        return new HimaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HimaViewHolder holder, int position) {
        Hima hima = himaList.get(position);
        Glide.with(context).load(hima.getUrlimg()).into(holder.imgHima);
        holder.tvNama.setText(hima.getNamahm());
        holder.tvDesc.setText(hima.getDeschm());
    }

    @Override
    public int getItemCount() {
        return himaList.size();
    }

    public class HimaViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_hima)
        ImageView imgHima;
        @BindView(R.id.tv_name)
        TextView tvNama;
        @BindView(R.id.tv_desc)
        TextView tvDesc;


        public HimaViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
