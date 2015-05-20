package com.ray.lovecards.activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.ray.api.activity.BaseActivity;
import com.ray.api.view.SlidingMenu;
import com.ray.bitmap.RayBitmap;
import com.ray.lovecards.R;

public class MainActivity extends BaseActivity {

    private SlidingMenu mLeftMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mLeftMenu = (SlidingMenu) findViewById(R.id.id_menu);
        RayBitmap bitmp = RayBitmap.openBitmap(mContext);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();


    }

    public void toggleMenu(View view) {
        mLeftMenu.toggle();
    }

}
