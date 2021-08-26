package com.geektech.and1hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    private ArrayList<Music> list;
    private OnClick onClick;

    public void setList(ArrayList<Music> list, OnClick onClick) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        this.onClick = onClick;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, author, time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_music);
            author = itemView.findViewById(R.id.tv_author);
            time = itemView.findViewById(R.id.tv_time);

        }

        public void onBind(Music music) {
            name.setText(music.getName());
            author.setText(music.getAuthor());
            time.setText(music.getTime());
            itemView.setOnClickListener(v ->{
                onClick.onItemClick(music);
            });

        }
    }

    public interface OnClick{
        void onItemClick(Music music);
    }
}
