package com.ray.lovecards.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.ray.api.activity.BaseActivity;
import com.ray.api.utils.ToastUtil;
import com.ray.api.view.BottomDialog;
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
//            Intent intent = new Intent(mContext, MainActivity.class);
//            startActivity(intent);
//            finish();

            BottomDialog.Builder dia = new BottomDialog.Builder(this);
            dia.setTopButton("Top", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    ToastUtil.getInstance(mContext).showToast("top");
                }
            });
            dia.setCenterButton("Center", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    ToastUtil.getInstance(mContext).showToast("center");
                }
            });

            dia.setBottomButton("Bottom", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    ToastUtil.getInstance(mContext).showToast("bottom");
                }
            });
            dia.show();
        }
    }
}
