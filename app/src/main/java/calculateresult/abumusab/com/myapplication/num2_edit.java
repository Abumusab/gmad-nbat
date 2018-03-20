package calculateresult.abumusab.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class num2_edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num2_edit);
    }
    public void ok(View view){
        EditText n2p1=(EditText)findViewById(R.id.n2p1);
        EditText n2p2=(EditText)findViewById(R.id.n2p2);
        EditText n2foz=(EditText)findViewById(R.id.n2foz);


        Intent i= new Intent(this,num2.class);

        i.putExtra("player1",n2p1.getText().toString());
        i.putExtra("player2",n2p2.getText().toString());
        i.putExtra("alfoz",n2foz.getText().toString());
        startActivity(i);
    }
}
