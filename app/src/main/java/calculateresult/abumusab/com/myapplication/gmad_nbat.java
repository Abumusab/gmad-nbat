package calculateresult.abumusab.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class gmad_nbat extends AppCompatActivity {
    Button bt;
    String a = "أ";
    String b = "ب";
    String c = "ت";
    String d = "ث";
    String e = "ج";
    String f = "ح";
    String g = "خ";
    String h = "د";
    String i = "ذ";
    String j = "ر";
    String k = "ز";
    String l = "س";
    String m = "ش";
    String n = "ص";
    String o = "ض";
    String p = "ط";
    String q = "ظ";
    String r = "ع";
    String s = "غ";
    String t = "ف";
    String u = "ق";
    String v = "ك";
    String w = "ل";
    String x = "م";
    String y = "ن";
    String z = "هـ";
    String ab = "و";
    String ac = "ي";

    Random rr;

    Integer[] abgd = {

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmad_nbat);
        bt = (Button)findViewById(R.id.btn);

        rr = new Random();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
