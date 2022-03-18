package com.ss.android.bytedcert.net.fetch;

import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.net.C28429c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\b8GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ss/android/bytedcert/net/fetch/FetchJSBResponse;", "Lcom/ss/android/bytedcert/net/fetch/BaseResponse;", "response", "Lcom/ss/android/bytedcert/net/BDResponse;", "message", "", "(Lcom/ss/android/bytedcert/net/BDResponse;Ljava/lang/String;)V", "throwable", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "mMessage", "getMessage", "()Ljava/lang/String;", "setMMessage", "mResponse", "getMResponse", "()Lcom/ss/android/bytedcert/net/BDResponse;", "setMResponse", "(Lcom/ss/android/bytedcert/net/BDResponse;)V", "mThrowable", "getThrowable", "()Ljava/lang/Throwable;", "setMThrowable", "(Ljava/lang/Throwable;)V", "byted_cert_core_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.ss.android.bytedcert.net.a.f */
public final class FetchJSBResponse extends C28423b {

    /* renamed from: d */
    private Throwable f71501d;

    /* renamed from: e */
    private String f71502e;

    /* renamed from: f */
    private BDResponse f71503f;

    /* renamed from: c */
    public final Throwable mo101221c() {
        return this.f71501d;
    }

    /* renamed from: d */
    public final String mo101222d() {
        return this.f71502e;
    }

    /* renamed from: e */
    public final BDResponse mo101223e() {
        return this.f71503f;
    }

    public FetchJSBResponse(String str) {
        this.f71502e = str;
    }

    public FetchJSBResponse(Throwable th, String str) {
        this.f71501d = th;
        this.f71502e = str;
    }

    public FetchJSBResponse(BDResponse bDResponse, String str) {
        Intrinsics.checkParameterIsNotNull(bDResponse, "response");
        this.f71503f = bDResponse;
        C28429c cVar = bDResponse.bcResponse;
        Intrinsics.checkExpressionValueIsNotNull(cVar, "response.bcResponse");
        this.f71486c = cVar.mo101228b();
        C28429c cVar2 = bDResponse.bcResponse;
        Intrinsics.checkExpressionValueIsNotNull(cVar2, "response.bcResponse");
        this.f71485b = cVar2.mo101227a();
        this.f71502e = str;
        this.f71484a = true;
    }
}
