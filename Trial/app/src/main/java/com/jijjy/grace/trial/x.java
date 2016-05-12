package com.jijjy.grace.trial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * Created by grace on 5/12/16.
 */
public class x extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(getApplicationContext(), x.class);
            startActivity(intent);

            Toast.makeText(x.this, "Moving to Camera!", Toast.LENGTH_SHORT).show();
//             Handle the camera action
        } else if (id == R.id.nav_gallery) {

            Toast.makeText(x.this, "Moving to Gallery!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_slideshow) {

            Toast.makeText(x.this, "Moving to Slideshow!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_manage) {

            Toast.makeText(x.this, "Moving to Tools!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {

            Toast.makeText(x.this, "Starting to Share!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_send) {

            Toast.makeText(x.this, "Starting Send!", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
