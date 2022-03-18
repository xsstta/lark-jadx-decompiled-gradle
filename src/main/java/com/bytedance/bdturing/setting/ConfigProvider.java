package com.bytedance.bdturing.setting;

import android.os.Looper;
import com.bytedance.bdturing.net.HttpClient;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/bytedance/bdturing/setting/ConfigProvider;", "", "getAppId", "", "getAppName", "getAppVersion", "getChannel", "getDeviceId", "getHttpClient", "Lcom/bytedance/bdturing/net/HttpClient;", "getInstallId", "getLang", "getRegion", "getSDKVersion", "getServiceInterceptor", "Lcom/bytedance/bdturing/setting/ServiceInterceptor;", "getWorkerLooper", "Landroid/os/Looper;", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.setting.a */
public interface ConfigProvider {
    /* renamed from: a */
    ServiceInterceptor mo14279a();

    /* renamed from: b */
    HttpClient mo14280b();

    /* renamed from: c */
    String mo14281c();

    /* renamed from: d */
    String mo14282d();

    /* renamed from: e */
    String mo14283e();

    /* renamed from: f */
    String mo14284f();

    /* renamed from: g */
    String mo14285g();

    /* renamed from: h */
    String mo14286h();

    /* renamed from: i */
    String mo14287i();

    /* renamed from: j */
    String mo14288j();

    /* renamed from: k */
    String mo14289k();

    /* renamed from: l */
    Looper mo14290l();
}
