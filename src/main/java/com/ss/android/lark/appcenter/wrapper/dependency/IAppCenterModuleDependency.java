package com.ss.android.lark.appcenter.wrapper.dependency;

import android.content.Context;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.business.activity.appsetting.LittleAppPermissionData;
import com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b;
import com.tt.refer.common.base.AppType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public interface IAppCenterModuleDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScanFormat {
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$a */
    public interface AbstractC29130a {
        /* renamed from: a */
        void mo103372a();
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$b */
    public interface AbstractC29131b {
        /* renamed from: a */
        void mo103373a(Context context, String str);

        /* renamed from: a */
        void mo103374a(Context context, String str, String str2);

        /* renamed from: b */
        void mo103375b(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$c */
    public interface AbstractC29132c {
        /* renamed from: a */
        boolean mo103376a(String str);
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$d */
    public interface AbstractC29133d {
        /* renamed from: a */
        void mo103377a(String str);

        /* renamed from: b */
        boolean mo103378b(String str);
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$e */
    public interface AbstractC29134e {
        /* renamed from: a */
        List<LittleAppPermissionData> mo103379a(Context context, String str, AppType appType);

        /* renamed from: a */
        void mo103380a();

        /* renamed from: a */
        void mo103381a(Context context, int i);

        /* renamed from: a */
        void mo103382a(Context context, String str);

        /* renamed from: a */
        void mo103383a(Context context, String str, String str2);

        /* renamed from: a */
        void mo103384a(Context context, String str, String str2, AppType appType, AbstractC13298i iVar);

        /* renamed from: a */
        void mo103385a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num);

        /* renamed from: b */
        void mo103386b();

        /* renamed from: b */
        void mo103387b(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$f */
    public interface AbstractC29135f {
        /* renamed from: a */
        String mo103388a();

        /* renamed from: b */
        String mo103389b();

        /* renamed from: c */
        String mo103390c();

        /* renamed from: d */
        void mo103391d();

        /* renamed from: e */
        void mo103392e();

        /* renamed from: f */
        String mo103393f();
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$g */
    public interface AbstractC29136g {
        /* renamed from: a */
        void mo103394a(String str, String str2, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$h */
    public interface AbstractC29137h {
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$i */
    public interface AbstractC29138i {
        /* renamed from: a */
        void mo103395a(String str, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency$j */
    public interface AbstractC29139j {
        /* renamed from: a */
        boolean mo103396a(String str, Context context);
    }

    boolean canOpenByAppLink(Context context, String str);

    void enterBotChat(String str);

    AbstractC29130a getBrowserDependency();

    AbstractC29131b getChatDependency();

    Context getContext();

    String getDeviceId();

    String getDynamicDomain(DomainSettings.Alias alias);

    AbstractC29132c getFeatureGatingDependency();

    AbstractC29133d getGuideDependency();

    Locale getLanguageSetting();

    AbstractC29134e getLittleAppDependency();

    AbstractC29135f getLoginDependency();

    AbstractC29136g getOnCallDependency();

    String getOpenHost();

    AbstractC29138i getProfileDependency();

    void initBytecertSdk();

    boolean isGooglePlay();

    boolean isReportFeatureOn();

    boolean isStagingEnv();

    boolean isTabEnable(String str);

    void launchMainWindow(Context context, String str);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void notifyBootMileStoneFirstContentDraw(String str);

    void notifyBootMileStoneFirstDataLoaded(String str);

    void notifyBootMileStoneFirstFrameDraw(String str);

    void notifyMainTabFragmentContentDraw();

    void openByAppLink(Context context, String str);

    void openLarkAboutPage(Context context);

    void openSearchMainPageFromAppCenter(Context context, String str, String str2, int i);

    void registerDrawerListener(AbstractC29129b bVar);

    void registerWebLifecycleListener();

    void showShareComponent(Context context, String str, String str2, String str3, String str4, String str5);

    void startMiniProgramActivity(Context context, String str, int i);

    void startWebPageActivity(Context context, String str, String str2, boolean z, String str3, String str4);

    void unregisterDrawerListener(AbstractC29129b bVar);
}
