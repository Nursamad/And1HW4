package com.geektech.and1hw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;
    private MusicAdapter adapter;
    private ArrayList<Music> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
        createList();
        initListener();
    }

    private void initListener() {

    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Music("А мне бы просто тепла родных", "Santiz", "3:28"));
        list.add(new Music("Забытый бала", "Santiz", "2:38"));
        list.add(new Music("Второй дом", "Santiz", "4:29"));
        list.add(new Music("Rastafari", "Santiz", "2:30"));
        list.add(new Music("Музе", "Santiz", "4:03"));
        list.add(new Music("52 Герца", "Santiz", "3:33"));
        list.add(new Music("Paradise", "Santiz", "2:56"));
        list.add(new Music("За плохое , за хорошее", "Santiz", "4:50"));
        list.add(new Music("Tgg", "Santiz", "3:08"));
        list.add(new Music("За закатом", "Santiz", "2:37"));
    }



    private void initRecycler(View view) {
        recyclerView = view .findViewById(R.id.recycler_view);
        adapter = new MusicAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}