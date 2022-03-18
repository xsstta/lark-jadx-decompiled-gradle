package com.ss.android.lark.auditsdk;

import android.content.Context;
import com.ss.android.lark.audit.AbstractC29324f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002()J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0007H&J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H&J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H&J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0012\u0010\r\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0012\u0010\u000f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005¨\u0006*"}, d2 = {"Lcom/ss/android/lark/auditsdk/IAuditModuleDependency;", "", "domain", "", "getDomain", "()Ljava/lang/String;", "isLogin", "", "()Z", "session", "getSession", "tenantId", "getTenantId", "userAgent", "getUserAgent", "userId", "getUserId", "getConfig", "name", "getContext", "Landroid/content/Context;", "getDeviceId", "", "callback", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$IGetDeviceIdCallback;", "getLoginAppId", "", "isFeatureEnable", "featureName", "defaultValue", "registerAccountChangeListener", "onAccountChangeListener", "Lcom/ss/android/lark/audit/IAuditDependency$OnAccountChangeListener;", "registerAccountChangedListener", "listener", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$OnAccountChangedListener;", "registerLoginStatusListener", "onLoginStatusListener", "Lcom/ss/android/lark/audit/IAuditDependency$OnLoginStatusListener;", "unRegisterAccountChangedListener", "IGetDeviceIdCallback", "OnAccountChangedListener", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.auditsdk.b */
public interface IAuditModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$IGetDeviceIdCallback;", "", "onError", "", "error", "", "onSuccess", "deviceId", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b$a */
    public interface IGetDeviceIdCallback {
        /* renamed from: a */
        void mo104104a(String str);

        /* renamed from: b */
        void mo104105b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$OnAccountChangedListener;", "", "onAccountChanged", "", "userId", "", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b$b */
    public interface OnAccountChangedListener {
        /* renamed from: a */
        void mo104106a(String str);
    }

    /* renamed from: a */
    Context mo104090a();

    /* renamed from: a */
    String mo104091a(String str);

    /* renamed from: a */
    void mo104092a(AbstractC29324f.AbstractC29327c cVar);

    /* renamed from: a */
    void mo104093a(AbstractC29324f.AbstractC29328d dVar);

    /* renamed from: a */
    void mo104094a(IGetDeviceIdCallback aVar);

    /* renamed from: a */
    void mo104095a(OnAccountChangedListener bVar);

    /* renamed from: a */
    boolean mo104096a(String str, boolean z);

    /* renamed from: b */
    int mo104097b();

    /* renamed from: c */
    String mo104098c();

    /* renamed from: d */
    String mo104099d();

    /* renamed from: e */
    String mo104100e();

    /* renamed from: f */
    String mo104101f();

    /* renamed from: g */
    String mo104102g();

    /* renamed from: h */
    boolean mo104103h();
}
