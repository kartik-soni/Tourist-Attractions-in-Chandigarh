package com.example.kartik.tourguide;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        mDrawerLayout = findViewById((R.id.drawer_layout));
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Info> info = new ArrayList<>();
        info.add(new Info(getString(R.string.tgif_name), getString(R.string.tgif_address), -1));
        info.add(new Info(getString(R.string.bq_name), getString(R.string.bq_address), -1));
        InfoAdapter adapter = new InfoAdapter(this, info);

        ListView listView = findViewById(R.id.info_list);

        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void mallsIntent(MenuItem mall) {
        Intent mallIntent = new Intent(RestaurantActivity.this, MallsActivity.class);
        startActivity(mallIntent);
    }

    public void hotelsIntent(MenuItem hotel) {
        Intent hotelIntent = new Intent(RestaurantActivity.this, HotelActivity.class);
        startActivity(hotelIntent);
    }

    public void restaurantsIntent(MenuItem restaurant) {
        Intent restaurantIntent = new Intent(RestaurantActivity.this, RestaurantActivity.class);
        startActivity(restaurantIntent);
    }

    public void touristIntent(MenuItem tourist) {
        Intent touristsIntent = new Intent(RestaurantActivity.this, MainActivity.class);
        startActivity(touristsIntent);
    }
}