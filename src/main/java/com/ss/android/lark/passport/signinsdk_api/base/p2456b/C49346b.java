package com.ss.android.lark.passport.signinsdk_api.base.p2456b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.base.b.b */
public class C49346b<T> implements AbstractC49352d<T> {

    /* renamed from: a */
    private IGetDataCallback f123823a;

    public C49346b(IGetDataCallback iGetDataCallback) {
        this.f123823a = iGetDataCallback;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
    /* renamed from: a */
    public void mo145179a(T t) {
        IGetDataCallback iGetDataCallback = this.f123823a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(t);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
    /* renamed from: a */
    public void mo145178a(NetworkErrorResult networkErrorResult) {
        IGetDataCallback iGetDataCallback = this.f123823a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(C49345a.m194380a(networkErrorResult));
        }
    }
}
