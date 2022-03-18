package com.ss.android.lark.passport.signinsdk_api.base.network;

import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/base/network/RequestResult;", "", "httpCode", "", "body", "", "(ILjava/lang/String;)V", "getBody", "()Ljava/lang/String;", "headers", "", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getHttpCode", "()I", "passportError", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "getPassportError", "()Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "setPassportError", "(Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;)V", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.signinsdk_api.base.network.f */
public final class RequestResult {

    /* renamed from: a */
    private NetworkErrorResult f123882a;

    /* renamed from: b */
    private Map<String, String> f123883b;

    /* renamed from: c */
    private final int f123884c;

    /* renamed from: d */
    private final String f123885d;

    public RequestResult() {
        this(0, null, 3, null);
    }

    /* renamed from: a */
    public final NetworkErrorResult mo172210a() {
        return this.f123882a;
    }

    /* renamed from: b */
    public final Map<String, String> mo172213b() {
        return this.f123883b;
    }

    /* renamed from: c */
    public final int mo172214c() {
        return this.f123884c;
    }

    /* renamed from: d */
    public final String mo172215d() {
        return this.f123885d;
    }

    /* renamed from: a */
    public final void mo172211a(NetworkErrorResult networkErrorResult) {
        this.f123882a = networkErrorResult;
    }

    /* renamed from: a */
    public final void mo172212a(Map<String, String> map) {
        this.f123883b = map;
    }

    public RequestResult(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "body");
        this.f123884c = i;
        this.f123885d = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestResult(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
