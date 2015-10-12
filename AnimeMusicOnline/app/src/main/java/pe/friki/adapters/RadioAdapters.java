package pe.friki.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pe.friki.animemusiconline.R;
import pe.friki.models.Radios;

/**
 * Created by Fcordova on 02/10/2015.
 */
public class RadioAdapters extends BaseAdapter {

    Context context;
    ArrayList<Radios> listaRadios;

    public RadioAdapters(Context context, ArrayList<Radios> listaRadios) {
        this.context = context;
        this.listaRadios = listaRadios;
    }

    @Override
    public int getCount() {
        return listaRadios.size();
    }

    @Override
    public Object getItem(int position) {
        return listaRadios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaRadios.get(position).getId();
    }


    static class ViewHolder {
        TextView txtRadio;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_listview, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.txtRadio = (TextView) convertView.findViewById(R.id.txtRadio);
            convertView.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.txtRadio.setText(listaRadios.get(position).getNombre());

        return convertView;
    }
}
