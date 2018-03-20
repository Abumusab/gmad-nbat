package calculateresult.abumusab.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class first_page extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-6106234088501382/6671199889");
        setContentView(R.layout.activity_first_page);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void asq(View v){
        Intent i=new Intent(first_page.this,num9.class);
        startActivity(i);
    }
    public void gmadnbat(View v ){
        Intent i = new Intent(first_page.this,num9.class);
        startActivity(i);
    }
    public void a7sb(View v ){
        Intent i = new Intent(first_page.this,MainActivity.class);
        startActivity(i);
    }



}
