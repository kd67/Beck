package com.rohan.beck;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //custom toolbar to be added on top of every activity
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.home));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.download));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.search));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.activity));
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //for(int i=0;i <tabLayout.getTabCount(); i++){
          //  tabLayout.getTabAt(i).setIcon(R.drawable.home3);
        //}


        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter (getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#FF6F00"), PorterDuff.Mode.SRC_ATOP);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                tab.getIcon().setColorFilter(Color.parseColor("#FF6F00"), PorterDuff.Mode.SRC_ATOP);
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.MULTIPLY);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gotonew(View view){
        Intent intent;
        intent = new Intent(view.getContext(), Test_l.class);
        startActivity(intent);
    }

    /*public void login(View view){
        EditText r = new TabFragment1().getRollNumber();
        TextView result = new TabFragment1().getResult();

        System.out.print("rollnumber = " + r);
        String roll = r.toString();
        //method.setText("Post Method");
        String res;
        Check c = new Check();
        //res = c.execute(roll);

    }*/
    public void missionInfo(View view){
        Intent intent = new Intent(this, InfoTemplate.class);
        String message = "missionInfo";
        intent.putExtra("code", message);
        startActivity(intent);
    }
    public void visionInfo(View view){
        Intent intent = new Intent(this, InfoTemplate.class);
        String message = "visionInfo";
        intent.putExtra("code", message);
        startActivity(intent);
    }
    public void campusLocation(View view){
        Intent intent = new Intent(this, InfoTemplate.class);
        String message = "campusLocation";
        intent.putExtra("code", message);
        startActivity(intent);
    }

    public void contact(View view){
        Intent intent = new Intent(this, InfoTemplate.class);
        String message = "contact";
        intent.putExtra("code", message);
        startActivity(intent);
    }

}