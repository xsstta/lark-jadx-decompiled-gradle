package com.larksuite.framework.callback;

import com.larksuite.framework.callback.Entity.ErrorResult;

/* renamed from: com.larksuite.framework.callback.d */
public class C25970d<Data> extends AbstractC25968b<IGetDataCallback<Data>> implements IGetDataCallback<Data> {
    public C25970d(IGetDataCallback iGetDataCallback) {
        super(iGetDataCallback);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        if (this.callback != null) {
            ((IGetDataCallback) this.callback).onError(errorResult);
            cancel();
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(Data data) {
        if (this.callback != null) {
            ((IGetDataCallback) this.callback).onSuccess(data);
            cancel();
        }
    }
}
