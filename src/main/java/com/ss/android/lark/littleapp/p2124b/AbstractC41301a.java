package com.ss.android.lark.littleapp.p2124b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.b.a */
public interface AbstractC41301a {

    /* renamed from: com.ss.android.lark.littleapp.b.a$a */
    public interface AbstractC41302a {
        /* renamed from: a */
        void mo144238a();
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$b */
    public interface AbstractC41303b {
        /* renamed from: a */
        void mo148748a(int i);

        /* renamed from: a */
        void mo148749a(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$c */
    public interface AbstractC41304c {
        /* renamed from: a */
        boolean mo144237a();
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$d */
    public interface AbstractC41305d {
        /* renamed from: a */
        void mo148750a(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$e */
    public interface AbstractC41306e {
        /* renamed from: a */
        String mo144246a();

        /* renamed from: b */
        String mo144247b();

        /* renamed from: c */
        String mo144248c();

        /* renamed from: d */
        boolean mo144249d();

        /* renamed from: e */
        String mo144250e();

        /* renamed from: f */
        String mo144251f();
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$f */
    public interface AbstractC41307f {
        /* renamed from: a */
        Intent mo144240a(Context context, Bundle bundle, int i);

        /* renamed from: a */
        TabType mo144241a(String str);

        /* renamed from: b */
        void mo144242b(String str);

        /* renamed from: c */
        void mo144243c(String str);

        /* renamed from: d */
        void mo144244d(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$g */
    public interface AbstractC41308g {
        /* renamed from: a */
        AbstractNotification.AbstractC48496c<Notice> mo144232a();

        /* renamed from: a */
        boolean mo144233a(int i);

        /* renamed from: b */
        boolean mo144234b(int i);

        /* renamed from: c */
        String mo144235c(int i);
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$h */
    public interface AbstractC41309h {
        /* renamed from: a */
        boolean mo144236a(boolean z);
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$j */
    public interface AbstractC41311j {
        /* renamed from: a */
        void mo148751a(C41310i iVar);
    }

    /* renamed from: com.ss.android.lark.littleapp.b.a$k */
    public interface AbstractC41312k {
        /* renamed from: a */
        MessageTriggerInfo mo144239a(String str, String str2);
    }

    void addAccountListener();

    void addLanAndEnvListener();

    void auditOpenMiniAppEvent(String str);

    boolean canOpen(String str);

    boolean canOpenCloudFile(String str);

    void checkInitMainGadget();

    boolean checkToShow(String str);

    void chooseLocation(Activity activity, String str);

    void completeGuide(String str);

    <T> T getAbTestValue(Class<? extends AbstractC28490a> cls, boolean z);

    List<AbstractC25558a> getAllBizWorkerProviders();

    <T extends AbstractNativeComponent> Map<String, Class<T>> getAllNativeComponentType();

    void getAppState(String str, AbstractC41303b bVar);

    AbstractC41304c getAppStateDependency();

    void getAppStrategyInfo(String str, AbstractC41305d dVar);

    double getBlankRate(String str);

    AbstractC41302a getBrowserDependency();

    void getChatAvatar(List<String> list, AbstractC13322k.AbstractC13323a aVar);

    ChatModel getChatByTriggerCode(String str);

    Context getContext();

    int getCurNetworkLevel();

    String getDeviceId();

    String getDynamicDomain(DomainSettings.Alias alias);

    int getEnvType();

    boolean getFgValue(String str);

    ILittleAppService.AbstractC41416a getInnerDependency();

    Locale getLanguageSetting();

    int getLarkAppId();

    void getLocationInfo(Context context, String str, float f, long j, String str2, long j2, AbstractC67724a.AbstractC67726b bVar);

    AbstractC41306e getLoginDependency();

    AbstractC41307f getMainDependency();

    String getMiraPluginNativeDir(String str);

    String getMiraPluginSoureFile(String str);

    C67856a getNetworkQuality();

    AbstractC41308g getNotificationDependency();

    AbstractC41312k getOpenPlatformDependency();

    long getProcessStartTime();

    long getServerTime();

    AbstractC41309h getSettingDependency();

    int getTTNetworkQualityType();

    String getTTWebViewSoVersion();

    void initAuditSdk();

    void installMiraClassLoader(String str);

    boolean isAotRunning();

    boolean isGooglePlay();

    boolean isMiraPluginInstalled(String str);

    boolean isMiraPluginLoaded(String str);

    boolean isOverseaTenantBrand();

    boolean isP0MergeToMainProc();

    boolean isUsingTTWebView();

    void loadMiraPlugin(String str);

    <V> void logBoostTracer(String str, V v);

    void monitorOpEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    boolean onAppIntercept(Context context);

    void onCreateWebView(WebView webView);

    void onGadgetCheckUpdateDone(String str, boolean z, String str2, String str3);

    void onGadgetDownloadFailed(String str);

    void onGadgetDownloadFinish(String str, String str2);

    void openBrowser(Activity activity, String str, String str2);

    void openLarkPhotoPicker(Activity activity, int i, boolean z, boolean z2, boolean z3);

    void openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3);

    boolean openUrlByLark(Context context, String str);

    void previewCard(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar);

    void previewCard(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar);

    void registerLarkNetQualityListener(AbstractC67854b bVar);

    List<AbstractC13322k.C13325c> sendTextMessage(List<String> list, String str);

    void startChatterWindowActivityByChatterId(Context context, String str, String str2, boolean z);

    void startDocSelectActivity(Activity activity, int i, int i2, String str, String str2);

    boolean startDriveSDKActivity(Context context, String str, String str2, String str3, boolean z);

    boolean startFileDetailActivity(Context context, String str, String str2, boolean z);

    void startFilePickerActivity(Activity activity, int i, int i2, String str, String str2);

    boolean startPasswordVerifyActivity(Context context, ILittleAppService.AbstractC41419d dVar);

    void unRegisterLarkNetQualityListener(AbstractC67854b bVar);

    /* renamed from: com.ss.android.lark.littleapp.b.a$i */
    public static class C41310i {

        /* renamed from: a */
        int f105088a;

        /* renamed from: b */
        private double f105089b;

        /* renamed from: c */
        private double f105090c;

        public C41310i(double d, double d2, int i) {
            this.f105089b = d;
            this.f105090c = d2;
            this.f105088a = i;
        }
    }
}
