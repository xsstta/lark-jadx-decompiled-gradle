package com.ss.ugc.effectplatform.bridge.network;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/network/NetResponse;", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "bodyStream", "Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;", "contentLength", "", "errorMsg", "", "(ILcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;JLjava/lang/String;)V", "getBodyStream", "()Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;", "setBodyStream", "(Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;)V", "getContentLength", "()J", "setContentLength", "(J)V", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "effect_bridge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.network.e */
public final class NetResponse {

    /* renamed from: a */
    private int f164875a;

    /* renamed from: b */
    private ByteReadStream f164876b;

    /* renamed from: c */
    private long f164877c;

    /* renamed from: d */
    private String f164878d;

    /* renamed from: a */
    public final int mo227746a() {
        return this.f164875a;
    }

    /* renamed from: b */
    public final ByteReadStream mo227747b() {
        return this.f164876b;
    }

    /* renamed from: c */
    public final long mo227748c() {
        return this.f164877c;
    }

    /* renamed from: d */
    public final String mo227749d() {
        return this.f164878d;
    }

    public NetResponse(int i, ByteReadStream aVar, long j, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "bodyStream");
        this.f164875a = i;
        this.f164876b = aVar;
        this.f164877c = j;
        this.f164878d = str;
    }
}
