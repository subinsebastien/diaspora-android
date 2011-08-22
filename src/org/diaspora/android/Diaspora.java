package org.diaspora.android;

import org.diaspora.helpers.DiasporaActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diaspora extends DiasporaActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setDiasporaContentView(R.layout.login);
        
        Button sign_in = (Button)findViewById(R.id.signin);
        sign_in.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View arg0) {
    			//new RequestTask().execute("http://stackoverflow.com");
    			Intent i = new Intent(Diaspora.this,Home.class);
    			startActivity(i);
    		}
    	});
        
        Button cancel = (Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View arg0) {
    			finish();
    		}
    	});
        
    }
}