package com.rohan.beck;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class InfoTemplate extends AppCompatActivity {

    private void displayInfo(){
        Intent intent = getIntent();
        String name = intent.getStringExtra("code");
        TextView toolbar_title = (TextView) this.findViewById(R.id.toolbar_title);
        TextView info_text = (TextView) this.findViewById(R.id.infotext);
        switch(name){
            case "missionInfo":
                toolbar_title.setText("Our Mission");
                info_text.setText("The distinctive mission of the University is:to serve society as a center of higher learning, providing long-term societal benefits through transmitting advanced knowledge, discovering new knowledge and functioning as an active working repository of organized knowledge, to take leadership role by providing need based programs in engineering and technology, applied sciences, management, humanities, architecture, pharmacy, retail and fashion design, mass-communication, agriculture and other employable courses in emerging areas");
                break;

            case "visionInfo":
                toolbar_title.setText("Our Vision");
                info_text.setText("To facilitate and promote studies, research, technology incubation, product innovation and extension work in Science, Technology and Management Education, and also to achieve excellence in higher technical education");
                break;
            case "campusLocation":
                toolbar_title.setText("Campus and Location");
                info_text.setText("As you enter its gate, the first sight that greets you is the colour green. Malaviya's wooded acreages, a mere seven kilometers away from the holy city of Gorakhpur, provide the perfect element for the perfect engineer. The University is located on Gorakhpur - Deoria road, about 9 Kilometers from Gorakhpur Railway Station as well as from main Gorakhpur Roadways bus-station.");
                break;
            case "contact":
                toolbar_title.setText("Contact Us");
                info_text.setText("Phone: +91-551-2273958, +91-551-6050001 ,Fax: 0551-2270011 P.A. to Vice-Chancellor: Sri Srikant ,Email: patovc@mmmut.ac.in,Phone:+91-9235500502(during office hours Phone(Information-Cum-Reception Center): 0551-6050015,Admission Enquiry: 0551-6050037");
                break;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_template);
        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbarTop);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        displayInfo();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle app bar item clicks here. The app bar
        // automatically handles clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public InfoTemplate(){
    }


}
