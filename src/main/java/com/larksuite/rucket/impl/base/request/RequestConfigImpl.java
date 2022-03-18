package com.larksuite.rucket.impl.base.request;

import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.C53253l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/larksuite/rucket/impl/base/request/RequestConfigImpl;", "", "()V", "contextId", "", "getContextId", "()Ljava/lang/String;", "setContextId", "(Ljava/lang/String;)V", "requestParams", "Lcom/ss/android/lark/sdk/RequestParams;", "getRequestParams", "()Lcom/ss/android/lark/sdk/RequestParams;", "strategy", "Lcom/larksuite/rucket/impl/base/request/RequestStrategy;", "getStrategy", "()Lcom/larksuite/rucket/impl/base/request/RequestStrategy;", "setStrategy", "(Lcom/larksuite/rucket/impl/base/request/RequestStrategy;)V", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.base.request.b */
public final class RequestConfigImpl {

    /* renamed from: a */
    private RequestStrategy f64989a = RequestStrategy.NONE;

    /* renamed from: b */
    private String f64990b;

    /* renamed from: c */
    private final C53253l f64991c;

    /* renamed from: a */
    public final RequestStrategy mo93472a() {
        return this.f64989a;
    }

    /* renamed from: b */
    public final String mo93473b() {
        return this.f64990b;
    }

    /* renamed from: c */
    public final C53253l mo93474c() {
        return this.f64991c;
    }

    public RequestConfigImpl() {
        String a = C53234a.m205877a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
        this.f64990b = a;
        this.f64991c = new C53253l();
    }
}
