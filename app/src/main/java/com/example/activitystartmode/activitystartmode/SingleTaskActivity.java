package com.example.activitystartmode.activitystartmode;

import android.content.Context;
import android.content.Intent;

/**
 * Created by pxl on 16-3-14.
 * Description TODO
 */
public class SingleTaskActivity extends BaseActivity {

    @Override
    public String getDescribe() {
        return getResources().getString(R.string.singleTask);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, SingleTaskActivity.class);
        context.startActivity(intent);
    }
}
