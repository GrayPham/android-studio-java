package hcmute.edu.vn.PhamVanManhHung_19110081_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Database database;
    ListView lvJob;
    ArrayList<Job> arrayJobList;
    JobAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvJob = (ListView) findViewById(R.id.listviewJob);
        arrayJobList = new ArrayList<>();

        adapter = new JobAdapter(this,R.layout.job_row,arrayJobList);
        lvJob.setAdapter(adapter);

        //create database TodoList
        database = new Database(this,"TodoList",null,1);
        //create table Work
        database.QueryData("CREATE TABLE IF NOT EXISTS Work(Id INTEGER PRIMARY KEY AUTOINCREMENT, WorkName VARCHAR(200))");
        //insert data
        //database.QueryData("INSERT INTO Work VALUES(null,'Viet ung dung ghi chu!')");

        //select data (Con tro hung du lieu)
        Cursor dataGhiChu = database.GetData("SELECT * FROM Work");
        while (dataGhiChu.moveToNext()){
            String name = dataGhiChu.getString(1);
            int id = dataGhiChu.getInt(0);
            arrayJobList.add(new Job(id, name));
        }

        adapter.notifyDataSetChanged();
    }
}