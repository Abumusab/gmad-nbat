package calculateresult.abumusab.com.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class num2 extends AppCompatActivity {
    private AdView mAdView;

    Button p1zaed;
    Button p1na89;
    Button p2zaed;
    Button p2na89;



    EditText p1setnumber;
    EditText p2setnumber;


    TextView al2sm1;
    TextView al2sm2;
    TextView p1num;
    TextView p2num;
    TextView t7ded_asm_alfaez;
    TextView alfoz_mn;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num2);
        MobileAds.initialize(getApplicationContext(),"ca-app-pub-6106234088501382/6671199889");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        al2sm1 = (TextView) findViewById(R.id.num2name1);
        al2sm2 = (TextView) findViewById(R.id.num2name2);
        alfoz_mn = (TextView) findViewById(R.id.num2alfoz);
        p1zaed = (Button) findViewById(R.id.p1zaed);
        p1na89 = (Button) findViewById(R.id.p1na89);
        p1setnumber = (EditText) findViewById(R.id.p1numktabh);
        p1num = (TextView) findViewById(R.id.player1num);

        p2zaed = (Button) findViewById(R.id.p2zaed);
        p2na89 = (Button) findViewById(R.id.p2na89);
        p2setnumber = (EditText) findViewById(R.id.p2numktabh);
        p2num = (TextView) findViewById(R.id.player2num);
        t7ded_asm_alfaez = (TextView) findViewById(R.id.alfaez);

        al2sm1.setText(getIntent().getStringExtra("player1"));
        al2sm2.setText(getIntent().getStringExtra("player2"));
        alfoz_mn.setText(getIntent().getStringExtra("alfoz"));


            p1zaed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int alfoz = Integer.parseInt(alfoz_mn.getText().toString());
                    int x = Integer.parseInt(p1setnumber.getText().toString());
                    int y = Integer.parseInt(p1num.getText().toString());
                    int z = x + y;
                    p1num.setText(Integer.toString(z));

                    if (z >= alfoz){
                        t7ded_asm_alfaez.setText("الفائز اللاعب "+al2sm2.getText());
                        gamefinsh();

                    }

                }

            });

        p1na89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(p1setnumber.getText().toString());
                int y = Integer.parseInt(p1num.getText().toString());
                int z = y-x;
                p1num.setText(Integer.toString(z));

            }
        });

        p2zaed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int alfoz = Integer.parseInt(alfoz_mn.getText().toString());
                int x =Integer.parseInt(p2setnumber.getText().toString());
                int y = Integer.parseInt(p2num.getText().toString());
                int z = x+y;
                p2num.setText(Integer.toString(z));

                if (z >= alfoz){
                    t7ded_asm_alfaez.setText("الفائز اللاعب "+al2sm1.getText());
                    gamefinshs();


                }

            }
        });

        p2na89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(p2setnumber.getText().toString());
                int y = Integer.parseInt(p2num.getText().toString());
                int z = y-x;
                p2num.setText(Integer.toString(z));

            }
        });


    }
    private void gamefinsh(){

         AlertDialog.Builder game=new AlertDialog.Builder(num2.this);

        game

                .setMessage("فاز اللاعب "+al2sm2.getText())
                .setCancelable(false)
                .setPositiveButton("اللعب مرة أخرى",
                        new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(getApplicationContext(),num2_edit.class));
            }

        })
                .setNegativeButton("استمرار",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
        AlertDialog aleratDialog = game.create();
        aleratDialog.show();
    }
    private void gamefinshs(){

        AlertDialog.Builder game=new AlertDialog.Builder(num2.this);

        game

                .setMessage("فاز اللاعب "+al2sm1.getText())
                .setCancelable(false)
                .setPositiveButton("اللعب مرة أخرى",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),num2_edit.class));
                            }

                        })
                .setNegativeButton("استمرار",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
        AlertDialog aleratDialog = game.create();
        aleratDialog.show();
    }


}
