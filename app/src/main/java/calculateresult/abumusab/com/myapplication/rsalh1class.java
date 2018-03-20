package calculateresult.abumusab.com.myapplication;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by asa93 on 22/12/17.
 */

public class rsalh1class extends DialogFragment implements View.OnClickListener{

    View form;
    Button ok;
    EditText a5tearalfoz;
    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveIntstanceState){
       form=inflater.inflate(R.layout.rsalh1,container,false);
         ok=(Button)form.findViewById(R.id.ok);
        a5tearalfoz=(EditText)form.findViewById(R.id.alfozmn);
         ok.setOnClickListener(this);
        return form;
    }

    public void onClick(View view){
        Button bu=(Button)view;
        bu.getText().toString().equals("ok");
            this.dismiss();

    }
}
