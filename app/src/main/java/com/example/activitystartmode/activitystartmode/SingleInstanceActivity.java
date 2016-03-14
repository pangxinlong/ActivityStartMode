package com.example.activitystartmode.activitystartmode;

import android.content.Context;
import android.content.Intent;

/**
 * Created by pxl on 16-3-14.
 * Description TODO
 */
public class SingleInstanceActivity extends BaseActivity{

    @Override
    public String getDescribe() {
        return getResources().getString(R.string.singleInstance);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, SingleInstanceActivity.class);
        context.startActivity(intent);
    }
}
