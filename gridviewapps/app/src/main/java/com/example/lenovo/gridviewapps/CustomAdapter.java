package com.example.lenovo.gridviewapps;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

class CustomAdapter extends BaseAdapter {
    Context context;
    int logos[];
    LayoutInflater inflater;
    public CustomAdapter(Context context, int[] logosarray) {
        Log.d("customadapter","inside");
  this.context= context;
  logos=logosarray;
  inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.adapter,null);
       ImageView image=(ImageView)view.findViewById(R.id.imageVie);
       image.setImageResource(logos[i]);
        Log.d("logos","logos"+logos[i]);
        return view;
    }
}
