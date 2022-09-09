package br.com.senac.mycaf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    cafeFragment cafeFragment = new cafeFragment();
    Fragment_cha fragment_cha = new Fragment_cha();
    Fragment_donuts fragment_donuts = new Fragment_donuts();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}