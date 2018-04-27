package com.example.activitystartmode.activitystartmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by pxl on 16-3-14.
 * Description TODO
 */
public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.activity_name)
    TextView mActivityName;

    @Bind(R.id.bt_standard)
    Button mBtStandard;

    @Bind(R.id.bt_singleTop)
    Button mBtSingleTop;

    @Bind(R.id.bt_singleTask)
    Button mBtSingleTask;

    @Bind(R.id.bt_singleInstance)
    Button mBtSingleInstance;

    /**
     * activity描述
     */
    @Bind(R.id.tv_describe)
    TextView mTvDescribe;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(getLocalClassName(),"onCreate");
        ButterKnife.bind(this);
        init();
        setListener();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(getLocalClassName(),"onNewIntent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(getLocalClassName(),"onDestroy");
    }

    private void init() {
        mActivityName.setText(getName());
        mTvDescribe.setText(getDescribe());
        Log.e(getName(), "  TaskId=" + this.getTaskId());
    }

    public String getDescribe() {
        return "";
    }

    private void setListener() {
        mBtStandard.setOnClickListener(this);
        mBtSingleTop.setOnClickListener(this);
        mBtSingleTask.setOnClickListener(this);
        mBtSingleInstance.setOnClickListener(this);
    }


    public String getName() {
        return getLocalClassName();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_standard:
                StandardActivity.start(this);
                break;
            case R.id.bt_singleTop:
                SingleTopActivity.start(this);
                break;
            case R.id.bt_singleTask:
                SingleTaskActivity.start(this);
                break;
            case R.id.bt_singleInstance:
                SingleInstanceActivity.start(this);
                break;
        }
    }
}
