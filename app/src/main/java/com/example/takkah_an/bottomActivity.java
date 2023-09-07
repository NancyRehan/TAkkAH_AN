package com.example.takkah_an;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.takkah_an.HomeFragment;
import com.example.takkah_an.AccountFragment;
import com.example.takkah_an.NotificationFragment;
import com.example.takkah_an.OrdersFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottomActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;



    HomeFragment homeFragment = new HomeFragment();
    AccountFragment accountFragment = new AccountFragment();
    NotificationFragment notificationFragment = new NotificationFragment();
    OrdersFragment ordersFragment = new OrdersFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        bottomNavigationView  = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();
                    return true;
                case R.id.account:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,accountFragment).commit();
                    return true;
                case R.id.orders:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,ordersFragment).commit();
                    return true;
                case R.id.notification:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,notificationFragment).commit();
                    return true;
            }

            return false;

        });
    }
}