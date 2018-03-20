package calculateresult.abumusab.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class num5 extends AppCompatActivity {
    private AdView mAdView;
    private int p1re = 0;
    private int p2re = 0;
    private int p3re = 0;
    private int p4re = 0;
    private int p5re = 0;


    Button p1ad1;
    Button p1ad5;
    Button p1ad10;
    Button p1su1;
    Button p1su5;
    Button p1su10;


    Button p2ad1;
    Button p2ad5;
    Button p2ad10;
    Button p2su1;
    Button p2su5;
    Button p2su10;

    Button p3ad1;
    Button p3ad5;
    Button p3ad10;
    Button p3su1;
    Button p3su5;
    Button p3su10;

    Button p4ad1;
    Button p4ad5;
    Button p4ad10;
    Button p4su1;
    Button p4su5;
    Button p4su10;

    Button p5ad1;
    Button p5ad5;
    Button p5ad10;
    Button p5su1;
    Button p5su5;
    Button p5su10;

    TextView p1num;
    TextView p2num;
    TextView p3num;
    TextView p4num;
    TextView p5num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num5);
        MobileAds.initialize(getApplicationContext(),"ca-app-pub-6106234088501382/6671199889");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        p1ad1 = (Button) findViewById(R.id.p1addone);
        p1ad5 = (Button) findViewById(R.id.p1addfive);
        p1ad10 = (Button) findViewById(R.id.p1addten);
        p1su1 = (Button) findViewById(R.id.p1subone);
        p1su5 = (Button) findViewById(R.id.p1subfive);
        p1su10 = (Button) findViewById(R.id.p1subten);
        p1num = (TextView) findViewById(R.id.player1num);

        p2ad1 = (Button) findViewById(R.id.p2addone);
        p2ad5 = (Button) findViewById(R.id.p2addfive);
        p2ad10 = (Button) findViewById(R.id.p2addten);
        p2su1 = (Button) findViewById(R.id.p2subone);
        p2su5 = (Button) findViewById(R.id.p2subfive);
        p2su10 = (Button) findViewById(R.id.p2subten);
        p2num = (TextView) findViewById(R.id.player2num);

        p3ad1 = (Button) findViewById(R.id.p3addone);
        p3ad5 = (Button) findViewById(R.id.p3addfive);
        p3ad10 = (Button) findViewById(R.id.p3addten);
        p3su1 = (Button) findViewById(R.id.p3subone);
        p3su5 = (Button) findViewById(R.id.p3subfive);
        p3su10 = (Button) findViewById(R.id.p3subten);
        p3num = (TextView) findViewById(R.id.player3num);

        p4ad1 = (Button) findViewById(R.id.p4addone);
        p4ad5 = (Button) findViewById(R.id.p4addfive);
        p4ad10 = (Button) findViewById(R.id.p4addten);
        p4su1 = (Button) findViewById(R.id.p4subone);
        p4su5 = (Button) findViewById(R.id.p4subfive);
        p4su10 = (Button) findViewById(R.id.p4subten);
        p4num = (TextView) findViewById(R.id.player4num);

        p5ad1 = (Button) findViewById(R.id.p5addone);
        p5ad5 = (Button) findViewById(R.id.p5addfive);
        p5ad10 = (Button) findViewById(R.id.p5addten);
        p5su1 = (Button) findViewById(R.id.p5subone);
        p5su5 = (Button) findViewById(R.id.p5subfive);
        p5su10 = (Button) findViewById(R.id.p5subten);
        p5num = (TextView) findViewById(R.id.player5num);






        p1ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1re++;
                p1num.setText(Integer.toString(p1re));

            }


        });
        p1ad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1num.setText(Integer.toString(p1re));


            }


        });
        p1ad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1re++;
                p1num.setText(Integer.toString(p1re));
            }


        });
        p1su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1re--;
                p1num.setText(Integer.toString(p1re));

            }


        });
        p1su5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1num.setText(Integer.toString(p1re));

            }


        });
        p1su10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1re--;
                p1num.setText(Integer.toString(p1re));

            }


        });

        p2ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2re++;
                p2num.setText(Integer.toString(p2re));

            }


        });
        p2ad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2num.setText(Integer.toString(p2re));

            }


        });
        p2ad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2re++;
                p2num.setText(Integer.toString(p2re));

            }


        });
        p2su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2re--;
                p2num.setText(Integer.toString(p2re));

            }


        });
        p2su5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2num.setText(Integer.toString(p2re));

            }


        });
        p2su10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2re--;
                p2num.setText(Integer.toString(p2re));

            }


        });
        p3ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3re++;
                p3num.setText(Integer.toString(p3re));

            }


        });
        p3ad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3num.setText(Integer.toString(p3re));

            }


        });
        p3ad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3re++;
                p3num.setText(Integer.toString(p3re));

            }


        });
        p3su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3re--;
                p3num.setText(Integer.toString(p3re));

            }


        });
        p3su5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3num.setText(Integer.toString(p3re));

            }


        });
        p3su10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3re--;
                p3num.setText(Integer.toString(p3re));

            }


        });

        p4ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4re++;
                p4num.setText(Integer.toString(p4re));

            }


        });
        p4ad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4num.setText(Integer.toString(p4re));

            }


        });
        p4ad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4re++;
                p4num.setText(Integer.toString(p4re));

            }


        });
        p4su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4re--;
                p4num.setText(Integer.toString(p4re));

            }


        });
        p4su5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4num.setText(Integer.toString(p4re));

            }


        });
        p4su10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4re--;
                p4num.setText(Integer.toString(p4re));

            }


        });

        p5ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5re++;
                p5num.setText(Integer.toString(p5re));

            }


        });
        p5ad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5num.setText(Integer.toString(p5re));

            }


        });
        p5ad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5re++;
                p5num.setText(Integer.toString(p5re));

            }


        });
        p5su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5re--;
                p5num.setText(Integer.toString(p5re));

            }


        });
        p5su5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5num.setText(Integer.toString(p5re));

            }


        });
        p5su10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5re--;
                p5num.setText(Integer.toString(p5re));

            }


        });


    }

}