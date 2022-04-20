package hcmute.edu.vn.todolist19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

        adapter = new JobAdapter(this,R.layout.row_job,arrayJobList);
        lvJob.setAdapter(adapter);

        //create database TodoList
        database = new Database(this,"TodoList",null,1);
        //create table Work
        database.QueryData("CREATE TABLE IF NOT EXISTS Work(Id INTEGER PRIMARY KEY AUTOINCREMENT, WorkName VARCHAR(200))");
        //insert data
        //database.QueryData("INSERT INTO Work VALUES(null,'Ghi Chu Cong Viec Hoc C#')");
        GetDataJob();

    }
    public void  DialogXoaCV(String tencv, final int id){
        AlertDialog.Builder dialogXoa = new AlertDialog.Builder(this);
        dialogXoa.setMessage("Do you want to delete this job? "+tencv );
        dialogXoa.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                database.QueryData("DELETE FROM WORK WHERE Id= '"+ id +"'");
                Toast.makeText(MainActivity.this, "Deleted"+ tencv,Toast.LENGTH_SHORT).show();
                GetDataJob();
            }
        });
        dialogXoa.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialogXoa.show();
    }
    public void DialogSuaCongViec(String ten,final int id){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_edit);

        EditText editTenCV = (EditText) dialog.findViewById(R.id.editTextTenCvEdit);
        Button btnXacNhan = (Button) dialog.findViewById(R.id.buttonXacNhan);
        Button btnHuy = (Button ) dialog. findViewById(R.id.buttonHuyEdit);

        editTenCV.setText(ten);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenMoi = editTenCV.getText().toString().trim();
                database.QueryData("UPDATE Work SET WorkName = '" + tenMoi + "' WHERE Id = '" + id + "'");
                Toast.makeText(MainActivity.this, "Da cap nhat", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
                GetDataJob();
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    private void GetDataJob(){
        //select data
        Cursor TodoListData = database.GetData("SELECT * FROM Work");
        arrayJobList.clear();
        while (TodoListData.moveToNext()){
            String name = TodoListData.getString(1);
            int id = TodoListData.getInt(0);
            arrayJobList.add(new Job(id, name));
        }

        adapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate (R.menu.add_congviec, menu);
        return super.onCreateOptionsMenu (menu);
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {

        if(item.getItemId () == R.id.menuAdd) {
            DialogThem();
        }

        return super.onOptionsItemSelected (item);
    }
    private void DialogThem () {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_add_job);

        EditText edtTen = (EditText) dialog.findViewById(R.id.editTextTenCV);
        Button btnThem = (Button) dialog.findViewById(R.id.buttonAdd );
        Button btnHuy = (Button) dialog.findViewById(R.id.buttonDel);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tencv = edtTen.getText().toString();
                if (tencv.equals("")) {
                    Toast.makeText (MainActivity. this, "Enter your name job", Toast. LENGTH_SHORT).show();
                }else
                {
                    database.QueryData("INSERT INTO Work VALUES(null,'"+ tencv +"')");
                    Toast.makeText (MainActivity. this, "Add successful", Toast. LENGTH_SHORT).show();
                    dialog.dismiss();
                    GetDataJob();
                }
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}