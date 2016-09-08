package com.kupferwerk.myappportfolio;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

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
      switch (view.getId()) {
         case R.id.buildItBigger:
            showToast(R.string.build_it_bigger);
            break;
         case R.id.capstone:
            showToast(R.string.capstone);
            break;
         case R.id.goUbiquitous:
            showToast(R.string.go_ubiquitous);
            break;
         case R.id.makeYourAppMaterial:
            showToast(R.string.make_your_app_material);
            break;
         case R.id.popularMovies:
            showToast(R.string.popular_movies);
            break;
         default:
         case R.id.stockHawk:
            showToast(R.string.stock_hawk);
            break;
      }
   }

   private void showToast(@StringRes int projectNameRes) {
      Toast.makeText(this,
            String.format(getString(R.string.show_toast), getString(projectNameRes).toLowerCase()),
            Toast.LENGTH_SHORT)
            .show();
   }
}
