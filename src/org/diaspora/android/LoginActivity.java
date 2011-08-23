package org.diaspora.android;

import org.diaspora.helpers.DiasporaActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends DiasporaActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setDiasporaContentView(R.layout.login);
        
        final Button loginButton = (Button)findViewById(R.id.signin);
        final EditText inputPassword = (EditText) findViewById(R.id.diaspora_id);
        loginButton.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View arg0) {
    			//Intent i = new Intent(LoginActivity.this,MainActivity.class);
    			//startActivity(i);
    			
    			if(inputPassword.getText().length() != 0) {
                    final ImageView asteriskImage = (ImageView) findViewById(R.id.login_asterisk_image);
                    final Animation loginAsteriskRotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.login_asterisk_rotator);
                    asteriskImage.startAnimation(loginAsteriskRotation);
                    
                    // TODO Replace nonsense with working login/auth. ;)
                    loginAsteriskRotation.setAnimationListener(new AnimationListener() {
                        @Override
                        public void onAnimationEnd(Animation animation) {
                            Intent i = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(i);
                        }
    
                        @Override
                        public void onAnimationRepeat(Animation animation) {}
                        
                        @Override
                        public void onAnimationStart(Animation animation) {}
                    });
                } else {
                    inputPassword.setError(getString(R.string.login_diaspora_id_empty_error));
                }
    			
    		}
    	});
        
        Button cancel = (Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View arg0) {
    			finish();
    		}
    	});
        
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.login_menu, menu);
		return true;
	}
}