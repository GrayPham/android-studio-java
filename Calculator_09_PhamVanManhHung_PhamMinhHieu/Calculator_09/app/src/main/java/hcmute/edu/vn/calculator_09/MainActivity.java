package hcmute.edu.vn.calculator_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button  bplus,bminus,bmul, bdivide, bdot,btnce, bc, bequal ;
    TextView text1;
    String tinhtoan, pheptoan ="" ;

    boolean checkDot = false, checkBang = false, pheptoan2=false;
    double  num2 = 0, result =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        bc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                tinhtoan = "";
                checkBang =false;
                checkDot = false;
                pheptoan2 = false;
                result = 0;
            }
        });
        b0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "0");
                    num2 = 0;
                }
            }
        });
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){

                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "1");
                    num2 = 1;
                }
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "2");
                    num2 = 2;
                }
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "3");
                    num2 = 3;
                }
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "4");
                    num2 = 4;
                }
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "5");
                    num2=5;
                }
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "6");
                    num2 = 6;
                }
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "7");
                    num2 = 7;
                }
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "8");
                    num2=8;
                }
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    tinhtoan = text1.getText().toString();
                    text1.setText(tinhtoan + "9");
                    num2 = 9;
                }
            }
        });
        bplus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty() ){
                    num2 = 0;
                    tinhtoan ="";
                    pheptoan  ="+";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
                else if(pheptoan2 == true){
                    if(text1.getText() != ""){
                        checkBang = false;
                        checkDot = false;
                        num2 = Double.parseDouble(text1.getText() + "");
                        text1.setText("");
                        mathrun();
                        pheptoan  ="+";
                        num2 =0;
                    }
                }
                else if(!text1.getText().toString().isEmpty()){
                    result = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    tinhtoan ="";
                    pheptoan  ="+";
                    checkDot = false;
                    checkBang = false;pheptoan2 = true;

                }
            }
        });
        bminus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty() ){
                    num2 = 0;
                    tinhtoan ="";
                    pheptoan  ="-";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
                else if(pheptoan2 == true){
                    checkDot = false;
                    num2 = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    mathrun();
                    pheptoan  ="-";
                    pheptoan2 = true;
                    num2 =0;
                }
                else if(!text1.getText().toString().isEmpty()){
                    result = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    tinhtoan ="";
                    pheptoan  ="-";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
            }
        });
        bmul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty() ){
                    num2 = 0;

                    tinhtoan ="";
                    pheptoan  ="*";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
                else if(pheptoan2 == true){
                    checkDot = false;

                    num2 = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    mathrun();
                    pheptoan  ="*";
                    num2 =0;
                }
                else if(!text1.getText().toString().isEmpty()){
                    result = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    tinhtoan ="";
                    pheptoan  ="*";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
            }
        });
        bdivide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty() ){
                    num2 = 0;
                    tinhtoan ="";
                    pheptoan  ="/";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
                else if(pheptoan2 == true){
                    checkDot = false;

                    num2 = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    mathrun();
                    pheptoan  ="/";
                    num2 =0;
                }
                else if(!text1.getText().toString().isEmpty()){
                    result = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    tinhtoan ="";
                    pheptoan  ="/";
                    checkDot = false;
                    checkBang = false;
                    pheptoan2 = true;
                }
            }
        });
        bequal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pheptoan.isEmpty()){
                    text1.setText("");
                }
                else if(checkBang == false){
                    checkDot = false;
                    tinhtoan = text1.getText().toString();
                    num2 = Double.parseDouble(text1.getText() + "");
                    text1.setText("");
                    mathrun();
                    pheptoan2 = false;
                    checkBang = true;
                    text1.setText(result + "");
                }
                if (pheptoan.isEmpty()){
                    text1.setText(result + "");
                }
                pheptoan ="";
                pheptoan2 = false;
            }
        });
        bdot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(!checkBang){
                        if(!checkDot){
                            tinhtoan = text1.getText().toString();
                            text1.setText(tinhtoan+ ".");
                            checkDot = true;
                        }
                    }
            }
        });
        btnce.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    String val = text1.getText().toString();
                    if(!val.isEmpty()){
                        val = val.substring(0,val.length() -1);
                        text1.setText(val);
                    }
                }
            }
        });

    }

    protected void mathrun(){
        if(pheptoan == "+"){
            result = result +  num2;

        }
        else if (pheptoan == "-"){
            result = result - num2 ;

        }
        else if (pheptoan == "*"){
            result =  result * num2;

        }
        else if (pheptoan == "/"){
            result = result / num2;

        }
    }
    protected void anhxa(){
        b0= findViewById(R.id.b0);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b9= findViewById(R.id.b9);
        bdot = findViewById(R.id.bdot);
        text1 = findViewById(R.id.text1);
        bplus = findViewById(R.id.bplus);
        bminus = findViewById(R.id.bminus);
        bmul = findViewById(R.id.bmul);
        bdivide = findViewById(R.id.bdivide);
        bc = findViewById(R.id.bc);
        btnce = findViewById(R.id.btnce);
        bequal = findViewById(R.id.bequal);
    }

}




