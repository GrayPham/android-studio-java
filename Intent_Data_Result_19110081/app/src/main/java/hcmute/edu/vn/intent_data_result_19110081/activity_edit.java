package hcmute.edu.vn.intent_data_result_19110081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_edit extends AppCompatActivity {
    Button btnConform;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        btnConform = (Button) findViewById(R.id.btnConForm);
        editText = (EditText) findViewById(R.id.editTextPersonName);
        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newName = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("NewName", newName);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}