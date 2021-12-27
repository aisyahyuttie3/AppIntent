
package com.example.app_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        public void panggil (View view) {
            String nomor = "087881955222" ;
            Intent panggil = new Intent(Intent. ACTION_DIAL) ;
            String scheme;
            String fragment;
            panggil.setData(Uri. fromParts( "tel",nomor,   null));
            startActivity(panggil);
        }
        public void buka(View view) {
            String url = "https://developer.android.com/?hl=id" ;
            Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
            bukabrowser.setData(Uri. parse(url));
            startActivity(bukabrowser);
        }
    }

