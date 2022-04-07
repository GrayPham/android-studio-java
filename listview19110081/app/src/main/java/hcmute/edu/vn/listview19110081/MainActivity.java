package hcmute.edu.vn.listview19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    ArrayList<String> mangMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc =(ListView) findViewById (R.id.listViewMonHoc);
        mangMonHoc = new ArrayList<String>() ;

        mangMonHoc.add ("Android");
        mangMonHoc.add ("ioS");
        mangMonHoc.add ("PHP");
        mangMonHoc.add ("Cocos");
        mangMonHoc.add ("Unity");
        mangMonHoc.add ("Laravel");
        mangMonHoc.add ("ASP.NET");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                mangMonHoc
        );
        lvMonHoc.setAdapter(adapter);
    }
}