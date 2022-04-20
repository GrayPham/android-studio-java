package hcmute.phamvanmanhhung.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnokay = (Button) findViewById(R.id.btnOkay) ;
        //btnokay.setOnClickListener(new Click());
        btnokay.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                TextView textCode =(TextView) findViewById (R.id.textCode);
                textCode.setText("the information ");
            }
        });
        findViewById (R.id.btnReset).setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                TextView textCode = (TextView) findViewById(R.id.textCode);
                textCode.setText("Reset Information");
            }
        });
    }
    private class Click implements View.OnClickListener {
        @Override
        public void onClick(View v){

        }
    }
}