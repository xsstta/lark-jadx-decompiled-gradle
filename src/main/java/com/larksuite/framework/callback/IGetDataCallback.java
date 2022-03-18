package com.larksuite.framework.callback;

import com.larksuite.framework.callback.Entity.ErrorResult;

public interface IGetDataCallback<Data> extends IRequestCallback<Data, ErrorResult> {

    /* renamed from: com.larksuite.framework.callback.IGetDataCallback$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onError(ErrorResult errorResult);

    @Override // com.larksuite.framework.callback.IRequestCallback
    void onSuccess(Data data);
}
