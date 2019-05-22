package com.example.police_pass.business.account.model;

import com.example.police_pass.base.mvp.impl.IBaseContract;
import com.example.police_pass.base.mvp.model.BaseModel;
import com.example.police_pass.base.mvp.model.IDataCallBack;
import com.example.police_pass.network.NetWorkFactory;
import com.example.police_pass.network.response.ApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author YangZhaoxin.
 * @since 2019/5/3 19:58.
 * email yangzhaoxin@hrsoft.net.
 */

public class AccountHelper extends BaseModel {

    private AccountHelper() {

    }

    private static class AccountHelperHolder {
        private static final AccountHelper INSTANCE = new AccountHelper();
    }

    /**
     * 获得实例，同时保证单例，线程安全
     * @return
     */
    public static AccountHelper getInstance() {
        return AccountHelperHolder.INSTANCE;
    }

    public void checkToken(final IBaseContract.IBasePresenter presenter, final IDataCallBack<String> callBack) {

        NetWorkFactory.getService().checkToken().enqueue(new Callback<ApiResponse<String>>() {
            @Override
            public void onResponse(Call<ApiResponse<String>> call, Response<ApiResponse<String>> response) {
                callBack.onSuccess(response.body().getData());
            }

            @Override
            public void onFailure(Call<ApiResponse<String>> call, Throwable t) {
                callBack.onFailed(t.getMessage());
            }
        });
    }
}
