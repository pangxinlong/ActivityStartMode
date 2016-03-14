package com.example.activitystartmode.activitystartmode;

import android.content.Context;
import android.content.Intent;

public class MainActivity extends BaseActivity {
    public static void start(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
