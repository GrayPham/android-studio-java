package hcmute.phamvanmanhhung.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAA", "onCreate SecondActivity");
    }

    public SecondActivity() {
        super();
        Log.d("AAA", "onCreate SecondActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume SecondActivity");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("AAA", "onPostResume SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy SecondActivity");
    }
}
