package com.bytedance.ies.bullet.service.base.resourceloader.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001c\u0010!\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010\u0013¨\u00061"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "", "accessKey", "", "offlineDir", "loaderDepender", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;", "isRelativePath", "", "loopCheck", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;ZZ)V", "getAccessKey", "()Ljava/lang/String;", "setAccessKey", "(Ljava/lang/String;)V", "appLogMonitor", "getAppLogMonitor", "()Z", "setAppLogMonitor", "(Z)V", "businessVersion", "getBusinessVersion", "setBusinessVersion", "setRelativePath", "getLoaderDepender", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;", "setLoaderDepender", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;)V", "localInfo", "getLocalInfo", "setLocalInfo", "getLoopCheck", "setLoopCheck", "networkImpl", "getNetworkImpl", "()Ljava/lang/Object;", "setNetworkImpl", "(Ljava/lang/Object;)V", "getOfflineDir", "setOfflineDir", "serverMonitor", "getServerMonitor", "setServerMonitor", "updateWhenInit", "getUpdateWhenInit", "setUpdateWhenInit", "useGeckoXV4", "getUseGeckoXV4", "setUseGeckoXV4", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.c */
public final class GeckoConfig {

    /* renamed from: a */
    private boolean f37919a;

    /* renamed from: b */
    private boolean f37920b;

    /* renamed from: c */
    private String f37921c;

    /* renamed from: d */
    private Object f37922d;

    /* renamed from: e */
    private String f37923e;

    /* renamed from: f */
    private String f37924f;

    /* renamed from: g */
    private ILoaderDepender f37925g;

    /* renamed from: h */
    private boolean f37926h;

    /* renamed from: i */
    private boolean f37927i;

    /* renamed from: b */
    public final String mo52728b() {
        return this.f37921c;
    }

    /* renamed from: c */
    public final Object mo52729c() {
        return this.f37922d;
    }

    /* renamed from: d */
    public final String mo52730d() {
        return this.f37923e;
    }

    /* renamed from: e */
    public final String mo52731e() {
        return this.f37924f;
    }

    /* renamed from: f */
    public final ILoaderDepender mo52732f() {
        return this.f37925g;
    }

    /* renamed from: g */
    public final boolean mo52733g() {
        return this.f37926h;
    }

    /* renamed from: a */
    public final boolean mo52727a() {
        return this.f37920b;
    }

    /* renamed from: a */
    public final void mo52726a(Object obj) {
        this.f37922d = obj;
    }

    public GeckoConfig(String str, String str2, ILoaderDepender eVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(str2, "offlineDir");
        Intrinsics.checkParameterIsNotNull(eVar, "loaderDepender");
        this.f37923e = str;
        this.f37924f = str2;
        this.f37925g = eVar;
        this.f37926h = z;
        this.f37927i = z2;
        this.f37919a = true;
        this.f37920b = true;
        this.f37921c = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GeckoConfig(java.lang.String r7, java.lang.String r8, com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0007
            r10 = 1
            r4 = 1
            goto L_0x0008
        L_0x0007:
            r4 = r10
        L_0x0008:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x000f
            r11 = 0
            r5 = 0
            goto L_0x0010
        L_0x000f:
            r5 = r11
        L_0x0010:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig.<init>(java.lang.String, java.lang.String, com.bytedance.ies.bullet.service.base.resourceloader.config.e, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
