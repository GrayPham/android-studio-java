package hcmute.edu.vn.listviewcustomadapter19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvSinhVien;
    ArrayList<SinhVien> mangSinhVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSinhVien =  (ListView) findViewById (R.id. listViewSinhVien) ;
        mangSinhVien = new ArrayList<SinhVien>();

        mangSinhVien.add (new SinhVien ( "Nguyễn Văn A", 1990));
        mangSinhVien.add (new SinhVien("Nguyễn Văn B", 1991) );
        mangSinhVien.add (new SinhVien ("Nguyễn Văn C", 1992));
        mangSinhVien.add (new SinhVien ("Nguyễn Văn D", 1993));
        mangSinhVien.add (new SinhVien ("Nguyễn Văn E", 1994));

        SinhVienAdapter adapter = new SinhVienAdapter(
                MainActivity.this,
                R.layout.dong_sinh_vien,
                mangSinhVien
        );
        lvSinhVien.setAdapter(adapter);

    }


}