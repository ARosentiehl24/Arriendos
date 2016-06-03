package com.unimagdalena.edu.co.arriendos;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class ArriendosAdapter extends BaseQuickAdapter<Arriendos> {

    public ArriendosAdapter(Context context, List<Arriendos> data) {
        super(context, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Arriendos arriendos) {

    }
}
