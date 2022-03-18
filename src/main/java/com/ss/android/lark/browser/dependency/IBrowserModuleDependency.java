package com.ss.android.lark.browser.dependency;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.browser.dto.AbstractC29907a;
import com.ss.android.lark.browser.dto.MainDomainSessionWrapper;
import com.ss.android.lark.browser.dto.Profile;
import com.ss.android.lark.browser.dto.SessionInfo;
import com.ss.android.lark.browser.dto.StepCountInfo;
import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public interface IBrowserModuleDependency {

    public interface ILocationDependency {

        /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$ILocationDependency$a */
        public interface AbstractC29882a {
            void onLocationChange(LarkLocation larkLocation);
        }

        /* renamed from: a */
        boolean mo107636a(AbstractC29882a aVar);

        /* renamed from: a */
        boolean mo107637a(AbstractC29882a aVar, int i);

        /* renamed from: b */
        boolean mo107638b(AbstractC29882a aVar);

        public static class LarkLocation extends Location {

            /* renamed from: a */
            String f74618a;

            /* renamed from: b */
            String f74619b;

            /* renamed from: c */
            String f74620c;

            /* renamed from: d */
            String f74621d;

            /* renamed from: e */
            String f74622e;

            /* renamed from: f */
            String f74623f;

            /* renamed from: g */
            int f74624g;

            /* renamed from: h */
            boolean f74625h;

            /* renamed from: i */
            boolean f74626i;

            /* renamed from: a */
            public String mo107639a() {
                return this.f74618a;
            }

            /* renamed from: b */
            public String mo107643b() {
                return this.f74619b;
            }

            /* renamed from: c */
            public String mo107646c() {
                return this.f74620c;
            }

            /* renamed from: d */
            public String mo107648d() {
                return this.f74621d;
            }

            /* renamed from: e */
            public String mo107650e() {
                return this.f74622e;
            }

            /* renamed from: f */
            public String mo107652f() {
                return this.f74623f;
            }

            /* renamed from: g */
            public int mo107654g() {
                return this.f74624g;
            }

            /* renamed from: h */
            public boolean mo107655h() {
                return this.f74625h;
            }

            /* renamed from: i */
            public boolean mo107656i() {
                return this.f74626i;
            }

            public LarkLocation(Location location) {
                super(location);
            }

            /* renamed from: a */
            public void mo107640a(int i) {
                this.f74624g = i;
            }

            /* renamed from: b */
            public void mo107644b(String str) {
                this.f74619b = str;
            }

            /* renamed from: c */
            public void mo107647c(String str) {
                this.f74620c = str;
            }

            /* renamed from: d */
            public void mo107649d(String str) {
                this.f74621d = str;
            }

            /* renamed from: e */
            public void mo107651e(String str) {
                this.f74622e = str;
            }

            /* renamed from: f */
            public void mo107653f(String str) {
                this.f74623f = str;
            }

            /* renamed from: a */
            public void mo107641a(String str) {
                this.f74618a = str;
            }

            /* renamed from: b */
            public void mo107645b(boolean z) {
                this.f74626i = z;
            }

            /* renamed from: a */
            public void mo107642a(boolean z) {
                this.f74625h = z;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScanFormat {
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$a */
    public interface AbstractC29883a {
        /* renamed from: a */
        int mo107657a();

        /* renamed from: a */
        boolean mo107658a(String str);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$b */
    public interface AbstractC29884b {
        /* renamed from: a */
        String mo107659a(String str, String str2, Map<String, String> map);

        /* renamed from: a */
        Map<String, String> mo107660a();

        /* renamed from: a */
        void mo107661a(boolean z);

        /* renamed from: a */
        boolean mo107662a(Context context, String str, Map<String, String> map);

        /* renamed from: a */
        boolean mo107663a(String str);

        /* renamed from: a */
        boolean mo107664a(String str, Map<String, String> map);

        /* renamed from: b */
        void mo107665b();

        /* renamed from: c */
        boolean mo107666c();
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$c */
    public interface AbstractC29885c {
        /* renamed from: a */
        void mo107667a(Activity activity, String str, String str2, String str3, String str4, String str5);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$d */
    public interface AbstractC29886d {

        /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$d$a */
        public interface AbstractC29887a {
            /* renamed from: a */
            void mo107671a();
        }

        /* renamed from: a */
        String mo107668a(String str, String str2);

        /* renamed from: a */
        void mo107669a(String str, List<String> list);

        /* renamed from: a */
        void mo107670a(String str, List<String> list, AbstractC29887a aVar);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$e */
    public interface AbstractC29888e {
        /* renamed from: a */
        GuideDelegate mo107672a(View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$f */
    public interface AbstractC29889f {
        /* renamed from: a */
        Locale mo107673a();

        /* renamed from: a */
        void mo107674a(Context context);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$g */
    public interface AbstractC29890g {
        /* renamed from: a */
        boolean mo107675a(Context context, String str, UrlParams.Source source);

        /* renamed from: a */
        boolean mo107676a(String str);

        /* renamed from: b */
        void mo107677b(Context context, String str, UrlParams.Source source);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$h */
    public interface AbstractC29891h {

        /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$h$a */
        public interface AbstractC29892a {
        }

        /* renamed from: a */
        void mo107678a(Context context, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo107679a(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        boolean mo107680a();

        /* renamed from: a */
        boolean mo107681a(Context context, int i, AbstractC29892a aVar);

        /* renamed from: b */
        String mo107682b();

        /* renamed from: c */
        HashMap<String, SessionInfo> mo107683c();

        /* renamed from: d */
        String mo107684d();

        /* renamed from: e */
        String mo107685e();

        /* renamed from: f */
        String mo107686f();
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$i */
    public interface AbstractC29893i {
        /* renamed from: a */
        boolean mo107687a(Context context, String str, Map<String, String> map);

        /* renamed from: a */
        boolean mo107688a(String str);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$j */
    public interface AbstractC29894j {
        /* renamed from: a */
        void mo107689a(Context context);

        /* renamed from: b */
        void mo107690b(Context context);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$k */
    public interface AbstractC29895k {
        /* renamed from: a */
        String mo107691a(DomainSettings.Alias alias);

        /* renamed from: a */
        Map<String, String> mo107692a();

        /* renamed from: a */
        void mo107693a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo107694a(IGetDataCallback<Profile> iGetDataCallback);

        /* renamed from: a */
        void mo107695a(String str);

        /* renamed from: a */
        void mo107696a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo107697a(boolean z, long j, int i, int i2, List<Integer> list, Map<String, Object> map);

        /* renamed from: a */
        void mo107698a(int[] iArr, boolean z, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        List<String> mo107699b();

        /* renamed from: b */
        void mo107700b(IGetDataCallback<StepCountInfo> iGetDataCallback);

        /* renamed from: b */
        void mo107701b(String str);

        /* renamed from: b */
        void mo107702b(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: c */
        List<String> mo107703c();

        /* renamed from: c */
        void mo107704c(String str);

        /* renamed from: c */
        void mo107705c(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: d */
        void mo107706d(String str);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$l */
    public interface AbstractC29896l {
        /* renamed from: a */
        boolean mo107707a();

        /* renamed from: a */
        boolean mo107708a(Context context, UrlParams urlParams);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$m */
    public interface AbstractC29897m {
        void itemClicked(int i);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$n */
    public interface AbstractC29898n {
        /* renamed from: a */
        void mo107709a(Context context);

        /* renamed from: a */
        void mo107710a(IGetDataCallback<List<TranslateLanguage>> iGetDataCallback);

        /* renamed from: a */
        void mo107711a(TranslateLanguage translateLanguage, boolean z, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo107712a(String str, String str2, IGetDataCallback<C29953a> iGetDataCallback);

        /* renamed from: a */
        void mo107713a(String str, String str2, String[] strArr, IGetDataCallback<List<String>> iGetDataCallback);

        /* renamed from: a */
        void mo107714a(String str, boolean z, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo107715a(boolean z, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo107716a(String[] strArr, IGetDataCallback<TranslateLanguage> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$o */
    public interface AbstractC29899o {
        /* renamed from: a */
        void mo107717a(Context context, String str);

        /* renamed from: a */
        void mo107718a(Context context, String str, int i);

        /* renamed from: a */
        boolean mo107719a(String str);

        /* renamed from: b */
        boolean mo107720b(Context context, String str, int i);

        /* renamed from: b */
        boolean mo107721b(String str);

        /* renamed from: c */
        boolean mo107722c(Context context, String str, int i);

        /* renamed from: c */
        boolean mo107723c(String str);

        /* renamed from: d */
        boolean mo107724d(String str);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$p */
    public interface AbstractC29900p {
        /* renamed from: a */
        void mo107725a(Dialog dialog);

        /* renamed from: a */
        boolean mo107726a();
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$q */
    public interface AbstractC29901q {
        /* renamed from: a */
        AbstractInjectWebViewDelegate mo107727a();

        /* renamed from: a */
        void mo107728a(Context context);

        /* renamed from: a */
        boolean mo107729a(String str, UrlParams urlParams);
    }

    /* renamed from: com.ss.android.lark.browser.dependency.IBrowserModuleDependency$r */
    public interface AbstractC29902r {
        /* renamed from: a */
        ArrayList<C25838g> mo107730a(Activity activity, Fragment fragment, AbstractC29897m mVar);
    }

    boolean canOpenInternal(Context context, String str, int i);

    AbstractC29883a getAppConfigDependency();

    Context getContext();

    String getDeviceId();

    String getDocMainDomain();

    AbstractC29884b getDocsDependency();

    String getDocsDomain(String str);

    int getEnvType();

    AbstractC29885c getForwardDependency();

    AbstractC29886d getGeckoDependency();

    AbstractC29888e getGuideDependency();

    AbstractC24152a getH5Service();

    AbstractC29902r getKAShareDependency();

    AbstractC29889f getLanguageDependency();

    AbstractC29890g getLittleAppDependency();

    ILocationDependency getLocationDependency();

    AbstractC29891h getLoginDependency();

    AbstractC29893i getMailDependency();

    AbstractC29894j getMainDependency();

    String getMainDomain();

    String getMainDomainForSimple();

    MainDomainSessionWrapper getMainDomainSession();

    AbstractC29895k getManisDependency();

    AbstractC29898n getMineDependency();

    String getOpenApiUrl();

    AbstractC29907a getPerfEnterChatMonitor();

    AbstractC29896l getQuicklyOpenUrlDependency();

    X509Certificate[] getTenantCertCertificate();

    PrivateKey getTenantCertPrivateKey();

    AbstractC29899o getVCDependency();

    AbstractC29900p getWatermarkDependency();

    AbstractC29901q getWebAppDependency();

    boolean isAppLink(Uri uri);

    boolean isFeatureGatingEnable(String str);

    boolean isGooglePlay();

    boolean isInWebLeanMode();

    boolean isMultiProcessStorage();

    boolean isOverseaTenantBrand();

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    boolean onAppIntercept(Context context);

    void openInternal(Context context, String str, int i);

    boolean startFileDetailActivity(Context context, String str, String str2);

    void startPreviewImageV2(Fragment fragment, List<PreviewV2Request> list, int i, AbstractC29554c cVar);
}
