package org.diaspora.android;

import org.diaspora.android.R;
import org.diaspora.helpers.DiasporaActivity;

import android.os.Bundle;

public class Home extends DiasporaActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setDiasporaContentView(R.layout.home);
    }
}