package com.zero.haris.simplecrudonline;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Haris on 12/24/2016.
 */

public class MahasiswaAdapter extends BaseAdapter {
    private Activity activity;
    //private ArrayList<HashMap<String, String>> data;
    private ArrayList<Mahasiswa> data_mhs=new ArrayList<Mahasiswa>();

    private static LayoutInflater inflater = null;

    public MahasiswaAdapter(Activity a, ArrayList<Mahasiswa> d) {
        activity = a; data_mhs = d;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public int getCount() {
        return data_mhs.size();
    }
    public Object getItem(int position) {
        return data_mhs.get(position);
    }
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.list_item_mhs, null);
        TextView id_mhs = (TextView) vi.findViewById(R.id.id_mhs);
        TextView nama_mhs = (TextView) vi.findViewById(R.id.nama_mhs);
        TextView nim_mhs = (TextView) vi.findViewById(R.id.nim_mhs);

        Mahasiswa daftar_mhs = data_mhs.get(position);
        id_mhs.setText(daftar_mhs.getMhsId());
        nama_mhs.setText(daftar_mhs.getMhsName());
        nim_mhs.setText(daftar_mhs.getMhsNIM());

        return vi;
    }
}
