package com.bytedance.ies.bullet.service.base.resourceloader.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0012J\b\u00105\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016¨\u00066"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;", "", "host", "", "region", "prefix", "", "appId", "appVersion", "did", "dftGeckoCfg", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "geckoConfigs", "", "downloadDepender", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ICdnDownloadDepender;", "geckoNetworkImpl", "geckoXNetworkImpl", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;Ljava/util/Map;Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ICdnDownloadDepender;Ljava/lang/Object;Ljava/lang/Object;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getAppVersion", "setAppVersion", "getDftGeckoCfg", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "setDftGeckoCfg", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;)V", "getDid", "setDid", "getDownloadDepender", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ICdnDownloadDepender;", "setDownloadDepender", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ICdnDownloadDepender;)V", "getGeckoConfigs", "()Ljava/util/Map;", "setGeckoConfigs", "(Ljava/util/Map;)V", "getGeckoNetworkImpl", "()Ljava/lang/Object;", "setGeckoNetworkImpl", "(Ljava/lang/Object;)V", "getGeckoXNetworkImpl", "setGeckoXNetworkImpl", "getHost", "setHost", "getPrefix", "()Ljava/util/List;", "setPrefix", "(Ljava/util/List;)V", "getRegion", "setRegion", "toString", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.i */
public final class ResourceLoaderConfig {

    /* renamed from: a */
    private String f37930a;

    /* renamed from: b */
    private String f37931b;

    /* renamed from: c */
    private List<String> f37932c;

    /* renamed from: d */
    private String f37933d;

    /* renamed from: e */
    private String f37934e;

    /* renamed from: f */
    private String f37935f;

    /* renamed from: g */
    private GeckoConfig f37936g;

    /* renamed from: h */
    private Map<String, GeckoConfig> f37937h;

    /* renamed from: i */
    private ICdnDownloadDepender f37938i;

    /* renamed from: j */
    private Object f37939j;

    /* renamed from: k */
    private Object f37940k;

    /* renamed from: a */
    public final String mo52736a() {
        return this.f37930a;
    }

    /* renamed from: b */
    public final String mo52737b() {
        return this.f37931b;
    }

    /* renamed from: c */
    public final List<String> mo52738c() {
        return this.f37932c;
    }

    /* renamed from: d */
    public final String mo52739d() {
        return this.f37933d;
    }

    /* renamed from: e */
    public final String mo52740e() {
        return this.f37934e;
    }

    /* renamed from: f */
    public final String mo52741f() {
        return this.f37935f;
    }

    /* renamed from: g */
    public final GeckoConfig mo52742g() {
        return this.f37936g;
    }

    /* renamed from: h */
    public final Map<String, GeckoConfig> mo52743h() {
        return this.f37937h;
    }

    /* renamed from: i */
    public final ICdnDownloadDepender mo52744i() {
        return this.f37938i;
    }

    /* renamed from: j */
    public final Object mo52745j() {
        return this.f37939j;
    }

    /* renamed from: k */
    public final Object mo52746k() {
        return this.f37940k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{[host]=");
        sb.append(this.f37930a);
        sb.append(",[region]=");
        sb.append(this.f37931b);
        sb.append(",[prefix]=");
        Object[] array = this.f37932c.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            sb.append(',');
            sb.append("[appId]=");
            sb.append(this.f37933d);
            sb.append(",[appVersion]=");
            sb.append(this.f37934e);
            sb.append(",[did]=");
            sb.append(this.f37935f);
            sb.append('}');
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public ResourceLoaderConfig(String str, String str2, List<String> list, String str3, String str4, String str5, GeckoConfig cVar, Map<String, GeckoConfig> map, ICdnDownloadDepender dVar, Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "region");
        Intrinsics.checkParameterIsNotNull(list, "prefix");
        Intrinsics.checkParameterIsNotNull(str3, "appId");
        Intrinsics.checkParameterIsNotNull(str4, "appVersion");
        Intrinsics.checkParameterIsNotNull(str5, "did");
        Intrinsics.checkParameterIsNotNull(cVar, "dftGeckoCfg");
        Intrinsics.checkParameterIsNotNull(map, "geckoConfigs");
        Intrinsics.checkParameterIsNotNull(dVar, "downloadDepender");
        this.f37930a = str;
        this.f37931b = str2;
        this.f37932c = list;
        this.f37933d = str3;
        this.f37934e = str4;
        this.f37935f = str5;
        this.f37936g = cVar;
        this.f37937h = map;
        this.f37938i = dVar;
        this.f37939j = obj;
        this.f37940k = obj2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResourceLoaderConfig(java.lang.String r15, java.lang.String r16, java.util.List r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig r21, java.util.Map r22, com.bytedance.ies.bullet.service.base.resourceloader.config.ICdnDownloadDepender r23, java.lang.Object r24, java.lang.Object r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x000f
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            r10 = r1
            goto L_0x0011
        L_0x000f:
            r10 = r22
        L_0x0011:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0018
            r12 = r2
            goto L_0x001a
        L_0x0018:
            r12 = r24
        L_0x001a:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0020
            r13 = r2
            goto L_0x0022
        L_0x0020:
            r13 = r25
        L_0x0022:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ies.bullet.service.base.resourceloader.config.c, java.util.Map, com.bytedance.ies.bullet.service.base.resourceloader.config.d, java.lang.Object, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
