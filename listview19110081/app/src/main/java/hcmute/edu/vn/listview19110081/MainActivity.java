package hcmute.edu.vn.listview19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    ArrayList<String> mangMonHoc;
    EditText editText;
    Button btnAdd , btnUpdate, btnDel;

    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc =(ListView) findViewById (R.id.listViewMonHoc);
        mangMonHoc = new ArrayList<String>() ;
        editText = (EditText) findViewById(R.id.editText);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnUpdate = (Button)findViewById(R.id.btnUpdate);
        btnDel = (Button) findViewById(R.id.buttonDel);
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

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, mangMonHoc.get(i) + " vi tri "+ i, Toast.LENGTH_SHORT).show();

            }
        });
        lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Ban da xoa: " + mangMonHoc.get(i), Toast.LENGTH_SHORT).show();

                mangMonHoc.remove(i);
                adapter.notifyDataSetChanged();

                return false;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editText.getText().toString().isEmpty()) {
                    String ten = editText.getText().toString();
                    mangMonHoc.add(ten);
                    adapter.notifyDataSetChanged();
                    editText.setText("");
                }
            }
        });
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText.setText((mangMonHoc.get(i)));
                vitri = i;
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!editText.getText().toString().isEmpty()){
                    String name = editText.getText().toString();
                    mangMonHoc.set(vitri,name);
                    adapter.notifyDataSetChanged();
                    editText.setText("");
                    vitri=0;
                }

            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vitri != -1){
                    mangMonHoc.remove(vitri);
                    adapter.notifyDataSetChanged();
                    editText.setText("");
                    vitri = -1;
                }



            }
        });

    }
}