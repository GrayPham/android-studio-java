package hcmute.edu.vn.intent_data_result_19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnEdit;
    TextView txtName;
    int REQUSET_CODE_EDIT = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEdit = (Button) findViewById(R.id.btnEdit);
        txtName = (TextView) findViewById(R.id.textView);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_edit.class);
                startActivityForResult(intent, REQUSET_CODE_EDIT);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode== REQUSET_CODE_EDIT && resultCode == RESULT_OK && data != null){


            String ten = data.getStringExtra("NewName");
            txtName.setText(ten);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}