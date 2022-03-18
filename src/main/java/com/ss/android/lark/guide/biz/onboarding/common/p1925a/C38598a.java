package com.ss.android.lark.guide.biz.onboarding.common.p1925a;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a$\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0007"}, d2 = {"wrapWithGetDataCallbackAndAdd", "Lcom/larksuite/framework/callback/IGetDataCallback;", "DATA", "Lcom/larksuite/framework/callback/CallbackManager;", "callback", "wrapWithUIGetDataCallbackAndAdd", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "core_guide_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.common.a.a */
public final class C38598a {
    /* renamed from: a */
    public static final <DATA> IGetDataCallback<DATA> m152201a(CallbackManager callbackManager, IGetDataCallback<DATA> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(callbackManager, "$this$wrapWithGetDataCallbackAndAdd");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CancelableGetDataCallback bVar = new CancelableGetDataCallback(iGetDataCallback);
        callbackManager.addCancelableCallback(bVar);
        return bVar;
    }
}
