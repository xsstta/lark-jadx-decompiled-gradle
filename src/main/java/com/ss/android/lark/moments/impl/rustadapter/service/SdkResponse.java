package com.ss.android.lark.moments.impl.rustadapter.service;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/service/SdkResponse;", "T", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Ljava/lang/Object;Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErr", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.b.c */
public final class SdkResponse<T> {

    /* renamed from: a */
    private final T f120178a;

    /* renamed from: b */
    private final ErrorResult f120179b;

    /* renamed from: a */
    public final T mo167291a() {
        return this.f120178a;
    }

    /* renamed from: b */
    public final ErrorResult mo167292b() {
        return this.f120179b;
    }

    public SdkResponse(T t, ErrorResult errorResult) {
        this.f120178a = t;
        this.f120179b = errorResult;
    }
}
