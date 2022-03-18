package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000J\b\u0010@\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001a\u00108\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001a\u0010;\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.¨\u0006A"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "", "accessKey", "", "(Ljava/lang/String;)V", "getAccessKey", "()Ljava/lang/String;", "setAccessKey", "bundle", "getBundle", "setBundle", "cdnUrl", "getCdnUrl", "setCdnUrl", "channel", "getChannel", "setChannel", "dynamic", "", "getDynamic", "()I", "setDynamic", "(I)V", "group", "getGroup", "setGroup", "loadRetryTimes", "getLoadRetryTimes", "setLoadRetryTimes", "loadTimeOut", "", "getLoadTimeOut", "()J", "setLoadTimeOut", "(J)V", "loaderConfig", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/CustomLoaderConfig;", "getLoaderConfig", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/CustomLoaderConfig;", "setLoaderConfig", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/CustomLoaderConfig;)V", "onlyLocal", "", "getOnlyLocal", "()Z", "setOnlyLocal", "(Z)V", "serviceToken", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "getServiceToken", "()Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "setServiceToken", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;)V", "useAssetsLoader", "getUseAssetsLoader", "setUseAssetsLoader", "useCdnLoader", "getUseCdnLoader", "setUseCdnLoader", "useGeckoLoader", "getUseGeckoLoader", "setUseGeckoLoader", "from", "config", "toString", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.j */
public final class TaskConfig {

    /* renamed from: a */
    private CustomLoaderConfig f37941a;

    /* renamed from: b */
    private int f37942b;

    /* renamed from: c */
    private long f37943c;

    /* renamed from: d */
    private int f37944d;

    /* renamed from: e */
    private boolean f37945e;

    /* renamed from: f */
    private String f37946f;

    /* renamed from: g */
    private String f37947g;

    /* renamed from: h */
    private String f37948h;

    /* renamed from: i */
    private String f37949i;

    /* renamed from: j */
    private boolean f37950j;

    /* renamed from: k */
    private boolean f37951k;

    /* renamed from: l */
    private boolean f37952l;

    /* renamed from: m */
    private IServiceToken f37953m;

    /* renamed from: n */
    private String f37954n;

    public TaskConfig() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public final CustomLoaderConfig mo52748a() {
        return this.f37941a;
    }

    /* renamed from: b */
    public final int mo52753b() {
        return this.f37942b;
    }

    /* renamed from: c */
    public final long mo52755c() {
        return this.f37943c;
    }

    /* renamed from: d */
    public final int mo52757d() {
        return this.f37944d;
    }

    /* renamed from: e */
    public final boolean mo52759e() {
        return this.f37945e;
    }

    /* renamed from: f */
    public final String mo52760f() {
        return this.f37946f;
    }

    /* renamed from: g */
    public final String mo52761g() {
        return this.f37947g;
    }

    /* renamed from: h */
    public final String mo52762h() {
        return this.f37949i;
    }

    /* renamed from: i */
    public final boolean mo52763i() {
        return this.f37950j;
    }

    /* renamed from: j */
    public final boolean mo52764j() {
        return this.f37951k;
    }

    /* renamed from: k */
    public final boolean mo52765k() {
        return this.f37952l;
    }

    /* renamed from: l */
    public final IServiceToken mo52766l() {
        return this.f37953m;
    }

    /* renamed from: m */
    public final String mo52767m() {
        return this.f37954n;
    }

    public String toString() {
        return "[accessKey=" + this.f37954n + ", loaderConfig=" + this.f37941a + ", dynamic=" + this.f37944d + ',' + "onlyLocal=" + this.f37945e + ", channel=" + this.f37946f + ',' + "bundle=" + this.f37947g + ", group=" + this.f37948h + ", useCdnLoader=" + this.f37950j + ",cdnUrl=" + this.f37949i + ']';
    }

    /* renamed from: a */
    public final void mo52749a(int i) {
        this.f37944d = i;
    }

    /* renamed from: b */
    public final void mo52754b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37947g = str;
    }

    /* renamed from: c */
    public final void mo52756c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37949i = str;
    }

    /* renamed from: d */
    public final void mo52758d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37954n = str;
    }

    /* renamed from: a */
    public final void mo52750a(IServiceToken jVar) {
        this.f37953m = jVar;
    }

    /* renamed from: a */
    public final void mo52751a(CustomLoaderConfig aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f37941a = aVar;
    }

    public TaskConfig(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        this.f37954n = str;
        this.f37941a = new CustomLoaderConfig(false);
        this.f37943c = 1000;
        this.f37946f = "";
        this.f37947g = "";
        this.f37949i = "";
        this.f37950j = true;
        this.f37951k = true;
        this.f37952l = true;
    }

    /* renamed from: a */
    public final void mo52752a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f37946f = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaskConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
