package com.ss.ugc.effectplatform.bridge.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "", "url", "", "method", "Lcom/ss/ugc/effectplatform/bridge/network/HTTPMethod;", "headers", "", "bodyParams", "contentType", "useCommParam", "", "(Ljava/lang/String;Lcom/ss/ugc/effectplatform/bridge/network/HTTPMethod;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Z)V", "getBodyParams", "()Ljava/util/Map;", "getContentType", "()Ljava/lang/String;", "getHeaders", "getMethod", "()Lcom/ss/ugc/effectplatform/bridge/network/HTTPMethod;", "getUrl", "getUseCommParam", "()Z", "effect_bridge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.network.d */
public final class NetRequest {

    /* renamed from: a */
    private final String f164869a;

    /* renamed from: b */
    private final HTTPMethod f164870b;

    /* renamed from: c */
    private final Map<String, String> f164871c;

    /* renamed from: d */
    private final Map<String, Object> f164872d;

    /* renamed from: e */
    private final String f164873e;

    /* renamed from: f */
    private final boolean f164874f;

    /* renamed from: a */
    public final String mo227740a() {
        return this.f164869a;
    }

    /* renamed from: b */
    public final HTTPMethod mo227741b() {
        return this.f164870b;
    }

    /* renamed from: c */
    public final Map<String, String> mo227742c() {
        return this.f164871c;
    }

    /* renamed from: d */
    public final Map<String, Object> mo227743d() {
        return this.f164872d;
    }

    /* renamed from: e */
    public final String mo227744e() {
        return this.f164873e;
    }

    /* renamed from: f */
    public final boolean mo227745f() {
        return this.f164874f;
    }

    public NetRequest(String str, HTTPMethod hTTPMethod, Map<String, String> map, Map<String, ? extends Object> map2, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(hTTPMethod, "method");
        Intrinsics.checkParameterIsNotNull(str2, "contentType");
        this.f164869a = str;
        this.f164870b = hTTPMethod;
        this.f164871c = map;
        this.f164872d = map2;
        this.f164873e = str2;
        this.f164874f = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NetRequest(java.lang.String r8, com.ss.ugc.effectplatform.bridge.network.HTTPMethod r9, java.util.Map r10, java.util.Map r11, java.lang.String r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L_0x0006
            com.ss.ugc.effectplatform.bridge.network.HTTPMethod r9 = com.ss.ugc.effectplatform.bridge.network.HTTPMethod.GET
        L_0x0006:
            r2 = r9
            r9 = r14 & 4
            r15 = 0
            if (r9 == 0) goto L_0x000f
            r10 = r15
            java.util.Map r10 = (java.util.Map) r10
        L_0x000f:
            r3 = r10
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0017
            r11 = r15
            java.util.Map r11 = (java.util.Map) r11
        L_0x0017:
            r4 = r11
            r9 = r14 & 16
            if (r9 == 0) goto L_0x001e
            java.lang.String r12 = "application/x-www-form-urlencoded"
        L_0x001e:
            r5 = r12
            r9 = r14 & 32
            if (r9 == 0) goto L_0x0026
            r13 = 1
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = r13
        L_0x0027:
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.bridge.network.NetRequest.<init>(java.lang.String, com.ss.ugc.effectplatform.bridge.network.HTTPMethod, java.util.Map, java.util.Map, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
