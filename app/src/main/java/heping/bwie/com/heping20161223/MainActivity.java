package heping.bwie.com.heping20161223;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 
 */
public class MainActivity extends AppCompatActivity {
Button button;
private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setTextColor(Color.BLACK);
         String shuai="贺平外号  八维彭于晏";






    }
    public  void start(View view)
    {
           Log.d("TAG","你谁");


    }
}
