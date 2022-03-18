package com.bytedance.ee.bear.document;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.NetworkType;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.C6306d;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;

public class DocOpenConfig {

    /* renamed from: a */
    public static final AtomicBoolean f15894a = new AtomicBoolean(true);

    /* renamed from: b */
    private static final AtomicBoolean f15895b = new AtomicBoolean();

    /* renamed from: c */
    private static PreloadJSModuleConfigs f15896c;

    /* renamed from: d */
    private static OpenDocTimeOutConfigs f15897d = new OpenDocTimeOutConfigs();

    /* renamed from: e */
    private static long f15898e;

    /* renamed from: f */
    private static boolean f15899f;

    /* renamed from: g */
    private static boolean f15900g;

    /* renamed from: h */
    private static boolean f15901h;

    /* renamed from: i */
    private static boolean f15902i;

    /* renamed from: j */
    private static boolean f15903j;

    /* renamed from: k */
    private static boolean f15904k;

    /* renamed from: l */
    private static boolean f15905l;

    /* renamed from: i */
    public static boolean m22768i() {
        return f15901h;
    }

    /* renamed from: j */
    public static boolean m22769j() {
        return f15902i;
    }

    /* renamed from: k */
    public static long m22770k() {
        return f15898e;
    }

    /* renamed from: l */
    public static boolean m22771l() {
        return f15899f;
    }

    /* renamed from: m */
    public static boolean m22772m() {
        return f15900g;
    }

    /* renamed from: n */
    public static boolean m22773n() {
        return f15903j;
    }

    /* renamed from: o */
    public static boolean m22774o() {
        return f15904k;
    }

    /* renamed from: p */
    public static boolean m22775p() {
        return f15905l;
    }

    /* renamed from: c */
    public static int m22762c() {
        m22776q();
        return f15897d.clientvar_length;
    }

    /* renamed from: d */
    public static int m22763d() {
        m22776q();
        return f15897d.reload_max_num;
    }

    /* renamed from: e */
    public static boolean m22764e() {
        m22776q();
        return f15897d.service_worker_enable;
    }

    /* renamed from: f */
    public static boolean m22765f() {
        m22776q();
        return f15897d.preload_view_cache;
    }

    @AppConfig(key = "open_doc_timeout")
    public static class OpenDocTimeOutConfigs implements NonProguard {
        @JSONField(name = "4G")
        public int carrierTimeout = CalendarSearchResultRv.f82652c;
        public int clientvar_length;
        public boolean preload_view_cache = true;
        public int reload_max_num = 10;
        public boolean service_worker_enable = true;
        @JSONField(name = "WI-FI")
        public int wifiTimeout = CalendarSearchResultRv.f82652c;

        public int getCarrierTimeout() {
            int i = this.carrierTimeout;
            if (i < 1000) {
                return 1000;
            }
            return i;
        }

        public int getWifiTimeout() {
            int i = this.wifiTimeout;
            if (i < 1000) {
                return 1000;
            }
            return i;
        }

        public String toString() {
            return "OpenDocTimeOutConfigs{wifiTimeout=" + this.wifiTimeout + ", carrierTimeout=" + this.carrierTimeout + ", clientvar_length=" + this.clientvar_length + ", reload_max_num=" + this.reload_max_num + ", service_worker_enable=" + this.service_worker_enable + ", preload_view_cache=" + this.preload_view_cache + '}';
        }
    }

    /* renamed from: b */
    public static int m22761b() {
        m22776q();
        if (C4974b.m20619a() == null || C4974b.m20619a() != NetworkType.NETWORK_WIFI) {
            return f15897d.getCarrierTimeout();
        }
        return f15897d.getWifiTimeout();
    }

    /* renamed from: g */
    public static PreloadJSModuleConfigs m22766g() {
        if (f15896c == null) {
            f15896c = (PreloadJSModuleConfigs) C4211a.m17514a().mo16532a("preload_jsmodule_config", PreloadJSModuleConfigs.class, new PreloadJSModuleConfigs());
        }
        return f15896c;
    }

    /* renamed from: h */
    public static String m22767h() {
        return (String) new PersistenceSharedPreference(C6306d.f17467a).mo34038b(C6306d.f17468b, "{}");
    }

    /* renamed from: q */
    private static void m22776q() {
        if (f15897d == null) {
            f15897d = (OpenDocTimeOutConfigs) C4211a.m17514a().mo16532a("open_doc_timeout", OpenDocTimeOutConfigs.class, new OpenDocTimeOutConfigs());
        }
    }

    @AppConfig(key = "preload_jsmodule_config")
    public static class PreloadJSModuleConfigs implements NonProguard {
        public boolean bitable = true;
        public boolean doc = true;
        public boolean docx;
        public boolean mindnote;
        public boolean sheet = true;
        public boolean slide;
        public boolean wiki;

        public String toString() {
            return "PreloadJSModuleConfigs{doc=" + this.doc + ", sheet=" + this.sheet + ", bitable=" + this.bitable + ", docx=" + this.docx + ", wiki=" + this.wiki + ", mindnote=" + this.mindnote + ", slide=" + this.slide + '}';
        }
    }

    /* renamed from: a */
    public static void m22760a() {
        if (f15894a.compareAndSet(true, false)) {
            C13479a.m54764b("DocOpenConfig", "preload DocOpenConfig");
            f15897d = (OpenDocTimeOutConfigs) C4211a.m17514a().mo16532a("open_doc_timeout", OpenDocTimeOutConfigs.class, new OpenDocTimeOutConfigs());
            f15896c = (PreloadJSModuleConfigs) C4211a.m17514a().mo16532a("preload_jsmodule_config", PreloadJSModuleConfigs.class, new PreloadJSModuleConfigs());
            f15904k = C4511g.m18594d().mo17345F();
            f15903j = C4211a.m17514a().mo16536a("spacekit.mobile.feed.init.immediate", false);
            f15898e = (long) ((Integer) C4211a.m17514a().mo16533a("loading_delay_time", (Object) 0)).intValue();
            f15899f = C4211a.m17514a().mo16536a("ccm.docx.ssr_mobile_app", false);
            f15900g = C4211a.m17514a().mo16536a("spacekit.mobile.webview_kill_render_process", false);
            f15901h = C4211a.m17514a().mo16536a("spacekit.mobile.doc_block_equation_enable", false);
            f15902i = C4211a.m17514a().mo16536a("spacekit.mobile.doc_new_cover", false);
            f15905l = C4211a.m17514a().mo16536a("spacekit.mobile.document.joint_clientvars_as_object", false);
        }
        if (f15895b.compareAndSet(false, true)) {
            ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(new BinderAccountChangeCallback.Stub() {
                /* class com.bytedance.ee.bear.document.DocOpenConfig.BinderC56071 */

                @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
                public void onChange(AccountService.Account account) {
                    DocOpenConfig.f15894a.set(true);
                }
            });
        }
    }
}
