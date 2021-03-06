package com.scan.qrscanner.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public boolean scan(String img){
        //img stores the name of image to decode
        Bitmap thumbnail = null;
        File Image = new File("/sdcard/images/"+img+".jpg");

        try {
//            File filePath = context.getFileStreamPath(img);
//            FileInputStream fi = new FileInputStream(filePath);
//            thumbnail = BitmapFactory.decodeStream(fi);
            Bitmap b = BitmapFactory.decodeFile(getFilesDir().getAbsolutePath() + "/myimage.png");
            if(Bitmap == null){
                Log.e(TAG, "uri is not a bitmap," + uri.toString());
                return null;
            }
            int duration = Toast.LENGTH_SHORT;
            Toast toast = new Toast(getApplicationContext(), Bitmap, duration);
            toast.show();

        } catch (Exception ex) {
            Log.e("getThumbnail()", ex.getMessage());
        }
        if(Image.exists()){
            return true;
        }
        return false;
    }
}