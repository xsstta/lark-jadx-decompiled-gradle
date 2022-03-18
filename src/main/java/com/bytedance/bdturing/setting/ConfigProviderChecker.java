package com.bytedance.bdturing.setting;

import android.os.Looper;
import com.bytedance.bdturing.LogUtil;
import com.bytedance.bdturing.net.HttpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0001J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0001J\t\u0010\f\u001a\u00020\rH\u0001J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0001J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0001J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/bytedance/bdturing/setting/ConfigProviderChecker;", "Lcom/bytedance/bdturing/setting/ConfigProvider;", "configProvider", "(Lcom/bytedance/bdturing/setting/ConfigProvider;)V", "getConfigProvider", "()Lcom/bytedance/bdturing/setting/ConfigProvider;", "getAppId", "", "getAppName", "getAppVersion", "getChannel", "getDeviceId", "getHttpClient", "Lcom/bytedance/bdturing/net/HttpClient;", "getInstallId", "getLang", "getRegion", "getSDKVersion", "getServiceInterceptor", "Lcom/bytedance/bdturing/setting/ServiceInterceptor;", "getWorkerLooper", "Landroid/os/Looper;", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.setting.b */
public final class ConfigProviderChecker implements ConfigProvider {

    /* renamed from: a */
    private final ConfigProvider f11288a;

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: a */
    public ServiceInterceptor mo14279a() {
        return this.f11288a.mo14279a();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: b */
    public HttpClient mo14280b() {
        return this.f11288a.mo14280b();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: c */
    public String mo14281c() {
        return this.f11288a.mo14281c();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: d */
    public String mo14282d() {
        return this.f11288a.mo14282d();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: e */
    public String mo14283e() {
        return this.f11288a.mo14283e();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: f */
    public String mo14284f() {
        return this.f11288a.mo14284f();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: g */
    public String mo14285g() {
        return this.f11288a.mo14285g();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: h */
    public String mo14286h() {
        return this.f11288a.mo14286h();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: i */
    public String mo14287i() {
        return this.f11288a.mo14287i();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: j */
    public String mo14288j() {
        return this.f11288a.mo14288j();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: l */
    public Looper mo14290l() {
        return this.f11288a.mo14290l();
    }

    @Override // com.bytedance.bdturing.setting.ConfigProvider
    /* renamed from: k */
    public String mo14289k() {
        String k = this.f11288a.mo14289k();
        if (Intrinsics.areEqual(k, Region.CN.getValue()) || Intrinsics.areEqual(k, Region.SINGAPOER.getValue()) || Intrinsics.areEqual(k, Region.USA_EAST.getValue()) || Intrinsics.areEqual(k, Region.INDIA.getValue()) || Intrinsics.areEqual(k, Region.BOE.getValue()) || !LogUtil.m14896a()) {
            return k;
        }
        throw new RuntimeException("not support this region");
    }

    public ConfigProviderChecker(ConfigProvider aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "configProvider");
        this.f11288a = aVar;
    }
}
