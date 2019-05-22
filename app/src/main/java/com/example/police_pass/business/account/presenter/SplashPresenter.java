package com.example.police_pass.business.account.presenter;

import com.example.police_pass.base.mvp.presenter.BasePresenter;
import com.example.police_pass.business.account.contract.SplashContract;

/**
 * @author YangZhaoxin.
 * @since 2019/5/3 19:30.
 * email yangzhaoxin@hrsoft.net.
 */

public class SplashPresenter extends BasePresenter<SplashContract.View> implements SplashContract.Presenter {

    @Override
    public void checkToken() {

//        IDataCallBack<String> callBack = new IDataCallBack<String>() {
//            @Override
//            public void onSuccess(String... data) {
//                CacheUtil.put(CacheKey.TOKEN, data[0]);
//                mView.checkTokenSuccess();
//            }
//
//            @Override
//            public void onFailed(String error) {
//                mView.checkTokenFailed(error);
//            }
//        };
//
//        AccountHelper.getInstance().checkToken(this, callBack);
        mView.checkTokenSuccess();

    }
}
