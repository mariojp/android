package com.example.exemplo5.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.exemplo5.R;
import com.example.exemplo5.model.Item;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private List<Item> itens;
    private Context context;

    public ItemAdapter(Context context, List<Item> lista){
        this.itens = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_list_item,viewGroup,false);
        }


        return view;
    }
}
