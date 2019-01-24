package com.example.habilmahendri.mynotesapp;

import android.view.View;
import android.widget.AdapterView;

public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }


    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicled(v, position);
    }

    public interface OnItemClickCallback {
        void onItemClicled(View view, int position);
    }
}
