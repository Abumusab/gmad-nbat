package calculateresult.abumusab.com.myapplication;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(),"ca-app-pub-6106234088501382/6671199889");





        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void numberto(View v){

        Intent i= new Intent(MainActivity.this,num2_edit.class);
        startActivity(i);
    }
    public void numberthree(View v){

        FragmentManager manager=getFragmentManager();
        rsalh1class dl1=new rsalh1class();
        dl1.show(manager,null);

    }
    public void numberfour(View v){
        Intent i= new Intent(MainActivity.this,num4.class);
        startActivity(i);

    }
    public void numberfive(View v){
        Intent i= new Intent(MainActivity.this,num5.class);
        startActivity(i);

    }
    public void numbersix(View v){
        Intent i= new Intent(MainActivity.this,num6.class);
        startActivity(i);

    }
    public void numbersiven(View v){
        Intent i= new Intent(MainActivity.this,num7.class);
        startActivity(i);

    }
    public void numbereight(View v){
        Intent i= new Intent(MainActivity.this,num8.class);
        startActivity(i);

    }
    public void numbernien(View v){
        Intent i= new Intent(MainActivity.this,num9.class);
        startActivity(i);

    }
    public void numberten(View v){
        Intent i= new Intent(MainActivity.this,num10.class);
        startActivity(i);

    }
    public void gmad(View v){
        Intent i= new Intent(MainActivity.this,first_page.class);
        startActivity(i);

    }


}

