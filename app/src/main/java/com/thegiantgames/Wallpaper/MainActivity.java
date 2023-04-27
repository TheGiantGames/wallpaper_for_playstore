package com.thegiantgames.Wallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.thegiantgames.fragments.Favourite;
import com.thegiantgames.fragments.LatestFrag;
import com.thegiantgames.fragments.categoryFrag;
import com.thegiantgames.fragments.homeFrag;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView ;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        bottomNavigationView=  findViewById(R.id.bottom_nav);
        toolbar = findViewById(R.id.toolbar);

        setBottom();
        setSidebar();


    }


    private void setBottom(){

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view , new homeFrag()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = new homeFrag();
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        fragment = new homeFrag();
                        break;
                    case R.id.bottom_category:
                        fragment = new categoryFrag();
                        break;
                    case R.id.bottom_latest:
                        fragment = new LatestFrag();
                        break;
                    case R.id.bottom_favourita:
                        fragment = new Favourite();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view , fragment).commit();

                return true;
            }
        });

    }

    private void setSidebar(){

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this , drawerLayout , toolbar ,R.string.app_name , R.string.app_name);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_share:
                        break;
                    case R.id.nav_rateUs:
                        break;
                    case R.id.nav_pp:
                        break;
                }
                if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START);
            }else{
                super.onBackPressed();
            }


    }
}