package com.ss.android.vc.service;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;

@XClass(autoRelease = true, runOnProcess = XProcess.Original)
public abstract class XIGetDataCallback<T> implements IGetDataCallback<T> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.larksuite.framework.callback.IRequestCallback
    public /* bridge */ /* synthetic */ void onError(ErrorResult errorResult) {
        onError((IGetDataCallback) ((ErrorResult) errorResult));
    }
}
