package hcmute.phamvanmanhhung.readandwriteactivitystate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG ="UIElementsPracticeLog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((v) -> {
            EditText myEditText = (EditText)findViewById(R.id.editTextTextEmailAddress);
            Log.i(LOG_TAG,myEditText.getText().toString());
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(LOG_TAG, "In Saved Instance State");
        EditText editText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        CharSequence writtenDate = editText.getText();
        outState.putCharSequence("MySavedData",writtenDate);
        // our data is stored when event will be called back
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //call function to restore when i use portrain mode
        Log.i(LOG_TAG, "In Stored Instance State");

        CharSequence storeddata = savedInstanceState.getCharSequence("MySavedData");
        EditText myEditText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        myEditText.setText(storeddata);
    }
}