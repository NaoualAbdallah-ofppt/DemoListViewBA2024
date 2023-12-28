package aa.bb.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Création de quelques logiciels
        Logiciel.lstLogiciels.add(new Logiciel(R.drawable.access,"Access","Microsoft"));
        Logiciel.lstLogiciels.add(new Logiciel(R.drawable.andr,"Android Studio","Google"));
        Logiciel.lstLogiciels.add(new Logiciel(R.drawable.power,"PowerPoint","Microsoft"));
LV= findViewById(R.id.LVLogiciels);
        LogicielsAdapter BA = new LogicielsAdapter(getApplicationContext());
LV.setAdapter(BA);

    }
}