package com.ss.android.lark.guide.biz.onboarding.common.util;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.AbstractC25972f;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/common/util/CancelableGetDataCallback;", "DATA", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/framework/callback/ICancelableCallback;", "callback", "(Lcom/larksuite/framework/callback/IGetDataCallback;)V", "isCanceled", "", "cancel", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.common.a.b */
public final class CancelableGetDataCallback<DATA> implements IGetDataCallback<DATA>, AbstractC25972f {

    /* renamed from: a */
    private boolean f99149a;

    /* renamed from: b */
    private IGetDataCallback<DATA> f99150b;

    @Override // com.larksuite.framework.callback.AbstractC25971e
    public boolean isCanceled() {
        return this.f99149a;
    }

    @Override // com.larksuite.framework.callback.AbstractC25971e
    public void cancel() {
        this.f99149a = true;
        this.f99150b = null;
    }

    public CancelableGetDataCallback(IGetDataCallback<DATA> iGetDataCallback) {
        this.f99150b = iGetDataCallback;
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(DATA data) {
        IGetDataCallback<DATA> iGetDataCallback = this.f99150b;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(data);
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        IGetDataCallback<DATA> iGetDataCallback = this.f99150b;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(errorResult);
        }
    }
}
