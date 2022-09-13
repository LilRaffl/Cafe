package br.com.senac.mycaf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    cafeFragment cafeFragment = new cafeFragment();
    Fragment_cha fragment_cha = new Fragment_cha();
    Fragment_donuts fragment_donuts = new Fragment_donuts();
    Fragment_muffin fragment_muffin = new Fragment_muffin();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavView);
        // carregando do fragmente (home)
        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, cafeFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mCof:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, cafeFragment)
                                .commit();
                        return true;
                    case R.id.mMuffin:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, fragment_muffin)
                                .commit();
                        return true;
                    case R.id.mCha:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,fragment_cha )
                                .commit();

                        return true;
                    case R.id.donuts:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,fragment_donuts )
                                .commit();
                        return true;


                }

                return false;
            }
        });


    }
}