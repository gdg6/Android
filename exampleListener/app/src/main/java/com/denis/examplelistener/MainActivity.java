package com.denis.examplelistener;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btnLeft;
    private Button btnSpace;
    private Button btnRight;
    private TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnSpace = (Button) findViewById(R.id.btnSpace);
        btnRight = (Button) findViewById(R.id.btnRight);
        textView = (TextView) findViewById(R.id.textView);

        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);
        btnSpace.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLeft:
                textView.setText("Click left!");
                break;
            case R.id.btnRight:
                textView.setText("Click Right!");
                break;
            case R.id.btnSpace:
                textView.setText("Click Space!");
                break;
        }
    }
}
