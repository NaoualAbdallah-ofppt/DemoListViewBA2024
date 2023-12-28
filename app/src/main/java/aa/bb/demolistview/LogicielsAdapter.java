package aa.bb.demolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LogicielsAdapter
extends BaseAdapter {
    private Context C;

    public LogicielsAdapter(Context c) {
        C = c;
    }

    public int getCount() {
        return Logiciel.lstLogiciels.size();
    }

    @Override
    public Object getItem(int i) {
        return Logiciel.lstLogiciels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(C).
                    inflate(R.layout.lv_item,viewGroup, false);

        ImageView img = view.findViewById(R.id.imgLogo);
        TextView txtNom=view.findViewById(R.id.lblLogiciel);
        TextView txtEdit=view.findViewById(R.id.lblEditeur);
        Logiciel L = Logiciel.lstLogiciels.get(i); // i position sélectionnée
        //dans le listview
        img.setImageResource(L.getLogo());
        txtNom.setText(L.getNom());
        txtEdit.setText(L.getEditeur());





        return view;
    }
}
