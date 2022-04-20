package hcmute.edu.vn.listviewadapterimage19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> mangMonAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonAn = (ListView) findViewById(R.id.ListViewMonAn);
        mangMonAn = new ArrayList<MonAn>();
        mangMonAn.add(new MonAn("Mon An 1", 10000, R.drawable.monan1));
        mangMonAn.add(new MonAn("Mon An 2", 20000, R.drawable.monan2));
        mangMonAn.add(new MonAn("Mon An 3", 50000, R.drawable.monan3));
        mangMonAn.add(new MonAn("Mon An 4", 23000, R.drawable.monan4));
        mangMonAn.add(new MonAn("Mon An 5", 14000, R.drawable.monan5));

        MonAnAdapter adapter = new MonAnAdapter(
                MainActivity.this,
                R.layout.dong_mon_an,
                mangMonAn
        );

        lvMonAn.setAdapter(adapter);
    }
}