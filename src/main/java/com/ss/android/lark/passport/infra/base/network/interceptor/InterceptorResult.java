package com.ss.android.lark.passport.infra.base.network.interceptor;

import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "(Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;)V", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "getError", "()Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "setError", "(Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;)V", "getRequest", "()Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.h */
public final class InterceptorResult {

    /* renamed from: a */
    private NetworkErrorResult f123271a;

    /* renamed from: b */
    private final IRequest f123272b;

    /* renamed from: a */
    public final NetworkErrorResult mo171343a() {
        return this.f123271a;
    }

    /* renamed from: b */
    public final IRequest mo171345b() {
        return this.f123272b;
    }

    /* renamed from: a */
    public final void mo171344a(NetworkErrorResult networkErrorResult) {
        this.f123271a = networkErrorResult;
    }

    public InterceptorResult(IRequest eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        this.f123272b = eVar;
    }
}
