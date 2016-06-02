package com.unimagdalena.edu.co.arriendos;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ArriendosAdapter extends RecyclerView.Adapter<ArriendosAdapter.ViewHolder> {

    private Activity activity;
    private ArrayList<Arriendos> arriendos;

    public ArriendosAdapter(Activity activity, ArrayList<Arriendos> arriendos) {
        this.activity = activity;
        this.arriendos = arriendos;
    }

    @Override
    public ArriendosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        View arriendos = LayoutInflater.from(context).inflate(R.layout.arriendos_list_item_row, parent, false);

        return new ViewHolder(arriendos);
    }

    @Override
    public void onBindViewHolder(ArriendosAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arriendos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
