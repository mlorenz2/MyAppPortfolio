package com.kupferwerk.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      ButterKnife.bind(this);
   }

   @OnClick ( { R.id.buildItBigger, R.id.capstone, R.id.goUbiquitous, R.id.makeYourAppMaterial,
         R.id.popularMovies, R.id.stockHawk })
   void onClickButton(View view) {
      switch (view.getId()){
         case R.id.buildItBigger: break;
         case R.id.capstone: break;
         case R.id.goUbiquitous: break;
         case R.id.makeYourAppMaterial: break;
         case R.id.popularMovies: break;
         default:
         case R.id.stockHawk: break;

      }
   }
}
