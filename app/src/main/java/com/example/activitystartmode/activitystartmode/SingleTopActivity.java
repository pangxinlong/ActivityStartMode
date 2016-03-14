package com.example.activitystartmode.activitystartmode;

import android.content.Context;
import android.content.Intent;

/**
 * Created by pxl on 16-3-14.
 * Description TODO
 */
public class SingleTopActivity extends BaseActivity {

    @Override
    public String getDescribe() {
        return getResources().getString(R.string.singleTop);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, SingleTopActivity.class);
        context.startActivity(intent);
    }
}
