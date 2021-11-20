package com.solocrew.android_toast;

import android.content.Context;
import android.widget.Toast;

public class AndroToast {

    public void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

}
