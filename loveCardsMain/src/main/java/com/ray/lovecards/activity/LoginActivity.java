package com.ray.lovecards.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ray.api.activity.BaseActivity;
import com.ray.lovecards.R;

/**
 * 登录
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
        btnLogin = (Button) findViewById(R.id.btn_login);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnLogin == view) {
            Intent intent = new Intent(mContext, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
