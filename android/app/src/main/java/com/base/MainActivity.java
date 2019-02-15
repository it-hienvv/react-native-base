package com.base;

import com.facebook.react.ReactActivity;
//fb
import android.content.Intent;
//fb

public class MainActivity extends ReactActivity {
    //fb config
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
    }
    //fb config

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */

    @Override
    protected String getMainComponentName() {
        return "base";
    }
}
