package com.ss.android.lark.meego.wrapper.dependency;

import android.content.Context;
import android.os.Message;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\r\u001a\u00020\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency;", "", "getAppInfo", "", "", "context", "Landroid/content/Context;", "getBrowserDependency", "Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency$IBrowserDependency;", "getContactDependency", "Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency$IContactDependency;", "getContext", "getDeviceId", "getFeatureGatingDependency", "Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency$IFeatureGatingDependency;", "getLanguage", "getSession", "getTenantId", "isBoeEnv", "", "isGooglePlay", "IBrowserDependency", "IContactDependency", "IFeatureGatingDependency", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.b.a */
public interface IMeegoModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency$IBrowserDependency;", "", "openWebUrl", "", "url", "", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.b.a$a */
    public interface IBrowserDependency {
        /* renamed from: a */
        void mo144527a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency$IContactDependency;", "", "openSelectMyGroupPage", "", "context", "Landroid/content/Context;", "message", "Landroid/os/Message;", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.b.a$b */
    public interface IContactDependency {
        /* renamed from: a */
        void mo144526a(Context context, Message message);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/dependency/IMeegoModuleDependency$IFeatureGatingDependency;", "", "isEnable", "", "key", "", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.meego.wrapper.b.a$c */
    public interface IFeatureGatingDependency {
        /* renamed from: a */
        boolean mo144525a(String str);
    }

    Map<String, String> getAppInfo(Context context);

    IBrowserDependency getBrowserDependency();

    IContactDependency getContactDependency();

    Context getContext();

    String getDeviceId();

    IFeatureGatingDependency getFeatureGatingDependency();

    String getLanguage();

    String getSession();

    String getTenantId();

    boolean isBoeEnv();

    boolean isGooglePlay();
}
