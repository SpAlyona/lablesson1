package ru.mirea.spichakav.lablesson1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.ImageView;
//import android.R.color;
//взяла с интернетика потому что шифтр ктрл и о не робили
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView myTextView = (TextView) findViewById(R.id.textView4);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button32);
        button.setText("Hello mirea!");
        CheckBox checkBox = findViewById(R.id.checkBox2);
        checkBox.setChecked(true);
//        TextView myTextView = (TextView) findViewById(R.id.textView7);
//        myTextView.setText("New text in MIREA");
    }
}
