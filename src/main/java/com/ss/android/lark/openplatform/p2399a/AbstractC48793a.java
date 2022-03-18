package com.ss.android.lark.openplatform.p2399a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.webapp.AbstractC13753a;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.bytedance.ee.webapp.C13808i;
import com.bytedance.ee.webapp.Source;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.openapp.BotOpenData;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.a.a */
public interface AbstractC48793a {

    /* renamed from: com.ss.android.lark.openplatform.a.a$a */
    public interface AbstractC48794a {
        /* renamed from: a */
        void mo144967a(Context context);
    }

    /* renamed from: com.ss.android.lark.openplatform.a.a$b */
    public interface AbstractC48795b {
        /* renamed from: a */
        void mo170521a(String str);

        /* renamed from: a */
        void mo170522a(String str, C4145c cVar);
    }

    /* renamed from: com.ss.android.lark.openplatform.a.a$c */
    public interface AbstractC48796c {
        /* renamed from: a */
        String mo144948a();

        /* renamed from: a */
        ArrayList<C25838g> mo144949a(Activity activity, Fragment fragment, AbstractC13794f.AbstractC13797c cVar);

        /* renamed from: a */
        void mo144950a(Activity activity, String str, String str2, String str3, String str4, String str5);

        /* renamed from: a */
        void mo144951a(Context context, String str);

        /* renamed from: a */
        void mo144952a(Context context, String str, String str2);

        /* renamed from: a */
        void mo144953a(String str, AbstractC13753a aVar);

        /* renamed from: a */
        void mo144954a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        boolean mo144955a(String str);

        /* renamed from: b */
        C13808i mo144956b(String str);

        /* renamed from: c */
        void mo144957c(String str);
    }

    /* renamed from: com.ss.android.lark.openplatform.a.a$d */
    public interface AbstractC48797d {
    }

    /* renamed from: com.ss.android.lark.openplatform.a.a$e */
    public interface AbstractC48798e {
        /* renamed from: a */
        int mo144959a(int i);

        /* renamed from: a */
        void mo144960a();

        /* renamed from: a */
        void mo144961a(Context context, String str, Source source);

        /* renamed from: a */
        void mo144962a(Context context, String str, String str2, int i);
    }

    /* renamed from: com.ss.android.lark.openplatform.a.a$f */
    public interface AbstractC48799f {
        /* renamed from: a */
        TabType mo144963a(String str);

        /* renamed from: b */
        void mo144964b(String str);

        /* renamed from: c */
        void mo144965c(String str);

        /* renamed from: d */
        void mo144966d(String str);
    }

    /* renamed from: com.ss.android.lark.openplatform.a.a$g */
    public interface AbstractC48800g {
        /* renamed from: a */
        void mo170523a(WebView webView, Context context, String str, Map<String, String> map);

        /* renamed from: b */
        void mo170524b(WebView webView, Context context, String str, Map<String, String> map);
    }

    void auditInitSdk();

    void auditOpenMiniAppEvent(String str);

    boolean canOpenWorkplace();

    boolean checkToShow(String str);

    void completeGuide(String str);

    String generateUrlWithAction(String str, String str2);

    List<LKPluginConfig> getAllPluginConfigs();

    AbstractC48794a getAppCenterDependency();

    String getAppEnv();

    String getAppVersionName();

    void getBotAppStrategyInfo(String str, AbstractC48795b bVar);

    AbstractC48796c getBrowserDependency();

    View getCardView(Context context, CardContent cardContent);

    Context getContext();

    String getDynamicDomain(DomainSettings.Alias alias);

    boolean getFgValue(String str);

    AbstractC48798e getGadgetDependency();

    Locale getLanguageSetting();

    Activity getLastTopActivity();

    String getLocale();

    AbstractC48799f getMainDependency();

    OpenPlatformModule getModule();

    AbstractC25990b getOkHttpClient();

    String getOpenAppHost();

    String getOpenHost();

    String getSession();

    AbstractC13794f.AbstractC13798d getTenantCertDependency();

    String getTenantId();

    void getTriggerCode(Function1<? super String, Unit> function1);

    AbstractC13794f.AbstractC13799e getUrlIntercepterDependency();

    String getUserId();

    C25830a getWebAppInjector();

    AbstractC13794f.AbstractC13800f getWebLeanModeDependency();

    AbstractC48762d getWebPermissionChecker();

    AbstractC13794f.AbstractC13801g getWebTranslateDependency();

    boolean isDeskTopMode();

    boolean isFeatureOn(String str);

    boolean isOverseaTenantBrand();

    void launchMainWindow(Fragment fragment);

    void monitorOpEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void onContainerCreated(WebAppContainerDelegate webAppContainerDelegate);

    void openAboutActivity(Context context, String str);

    void openApplyVisibleActivity(Context context, String str, String str2);

    void openByAppLinkWithScene(Context context, String str, int i);

    void openGadgetFromPlusMenu(Context context, String str, String str2, boolean z, Function1<String, Void> function1);

    void openWorkplace(Context context);

    void registerWebLifecycleListener(AbstractC48800g gVar);

    void sendEvent(String str, JSONObject jSONObject);

    void sendShareAppV2(Context context, ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType, int i);

    void sendShareCardMessage(ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType, List<String> list, String str, IGetDataCallback<Boolean> iGetDataCallback);

    void startChatActivityByChatterId(Context context, String str);

    void startChatWindowActivityByChatIdAndPos(Context context, String str, int i);

    void startChatWindowByOpenData(BotOpenData bVar);

    void startWebPage(Context context, String str, String str2, boolean z, String str3, String str4);
}
