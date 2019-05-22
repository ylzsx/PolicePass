package com.example.police_pass.business.account.view.activity;

import android.os.Bundle;

import com.example.police_pass.R;
import com.example.police_pass.base.mvp.view.BasePresenterActivity;
import com.example.police_pass.business.account.contract.LoginContract;
import com.example.police_pass.business.account.presenter.LoginPresenter;

public class LoginActivity extends BasePresenterActivity<LoginContract.Presenter> implements LoginContract.View {

    @Override
    protected LoginContract.Presenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void initView() {

    }
}
