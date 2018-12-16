package com.example.tecinfo.apk_final_tecinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ListView> {

    private final Context context;
    private final ArrayList<ListView> elementos;
    public ListViewAdapter(Context context, ArrayList<ListView> elementos) {
        super(context, R.layout.listview, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView= inflater.inflate(R.layout.listview, parent, false);
        TextView nomeList = (TextView) rowView.findViewById(R.id.txt_Nome);
        TextView enderecoList = (TextView) rowView.findViewById(R.id.txt_Endereco);
        TextView cidadeList = (TextView) rowView.findViewById(R.id.txt_Cidade);

        ImageView imagemList = (ImageView) rowView.findViewById(R.id.imagem);
        ImageView stat1List = (ImageView) rowView.findViewById(R.id.stat1);
        ImageView stat2List = (ImageView) rowView.findViewById(R.id.stat2);
        ImageView stat3List = (ImageView) rowView.findViewById(R.id.stat3);
        ImageView stat4List = (ImageView) rowView.findViewById(R.id.stat4);
        ImageView stat5List = (ImageView) rowView.findViewById(R.id.stat5);

        nomeList.setText(elementos.get(position).getNome());
        enderecoList.setText(elementos.get(position).getEndereco());
        cidadeList.setText(elementos.get(position).getCidade());
        imagemList.setImageResource(elementos.get(position).getImagen());
        stat1List.setImageResource(elementos.get(position).getStat1());
        stat2List.setImageResource(elementos.get(position).getStat2());
        stat3List.setImageResource(elementos.get(position).getStat3());
        stat4List.setImageResource(elementos.get(position).getStat4());
        stat5List.setImageResource(elementos.get(position).getStat5());

        return rowView;
    }
}
