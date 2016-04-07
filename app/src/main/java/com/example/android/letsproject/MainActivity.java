package com.example.android.letsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.letsproject.MainFragments.EditMyProfileFragment;
import com.example.android.letsproject.MainFragments.NotificationsFragment;
import com.example.android.letsproject.MainFragments.PCategoriesFragment;
import com.example.android.letsproject.MainFragments.ProfilesFragment;

public class MainActivity extends AppCompatActivity {

    int backCount = 0;
    public DrawerLayout drawerLayout;
    public NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        drawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        if(navigationView == null){
            setupNavigationDrawerContent(navigationView);
        }

        setupNavigationDrawerContent(navigationView);

        //First fragment
        setFragment(0);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                drawerLayout.openDrawer(GravityCompat.START);
//                return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    private void setupNavigationDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener( new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.item_navigation_drawer_projects:
                        item.setChecked(true);
                        setFragment(0);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.item_navigation_drawer_profiles:
                        item.setChecked(true);
                        setFragment(1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.item_navigation_drawer_notifications:
                        item.setChecked(true);
                        setFragment(2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.item_navigation_drawer_my_profile:
                        item.setChecked(true);
                        setFragment(3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
//
//                    case R.id.item_navigation_drawer_settings:
//                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.item_navigation_drawer_help_and_feedback:
//                        item.setChecked(true);
//                        Toast.makeText(MainActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
                }

                return true;
            }
        });
    }

    public void setFragment(int position) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (position) {

            case 0:
                PCategoriesFragment pCategoriesFragment = new PCategoriesFragment();
                fragmentTransaction.replace(R.id.fragment, pCategoriesFragment);
//                backCount = 0;
                break;

            case 1:
                ProfilesFragment profilesFragment = new ProfilesFragment();
                fragmentTransaction.replace(R.id.fragment, profilesFragment);
                backCount = 0;
                break;

            case 2:
                NotificationsFragment notificationsFragment = new NotificationsFragment();
                fragmentTransaction.replace(R.id.fragment, notificationsFragment);
                backCount = 0;
                break;

            case 3:
                EditMyProfileFragment editMyProfileFragment = new EditMyProfileFragment();
                fragmentTransaction.replace(R.id.fragment, editMyProfileFragment);
                backCount = 0;
                break;

        }

        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {

        if(backCount < 1){
            backCount++;
            navigationView.getMenu().getItem(0).setChecked(true);
            setFragment(0);
            drawerLayout.closeDrawer(GravityCompat.START);
            return;
        }
        super.onBackPressed();
    }
}
