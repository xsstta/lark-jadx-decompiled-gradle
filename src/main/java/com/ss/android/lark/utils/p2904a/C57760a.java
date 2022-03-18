package com.ss.android.lark.utils.p2904a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;

/* renamed from: com.ss.android.lark.utils.a.a */
public class C57760a<Data> implements IGetDataCallback<Data> {

    /* renamed from: a */
    private IGetDataCallback<Data> f142273a;

    public C57760a() {
    }

    public C57760a(IGetDataCallback<Data> iGetDataCallback) {
        this.f142273a = iGetDataCallback;
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(Data data) {
        IGetDataCallback<Data> iGetDataCallback = this.f142273a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(data);
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        int errorCode = errorResult.getErrorCode();
        if (errorCode == 10019 || errorCode == 507) {
            C57761b.m224182a();
        }
        IGetDataCallback<Data> iGetDataCallback = this.f142273a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(errorResult);
        }
    }
}
