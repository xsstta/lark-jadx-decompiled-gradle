package com.bytedance.ee.bear.document.offline.p318e;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.p085b.AbstractC2220h;
import com.bumptech.glide.load.p085b.C2223j;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.bear.doc.resupdate.C5486o;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.document.C5681c;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.analytic.OfflineAnalytic;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.p315b.C5892a;
import com.bytedance.ee.bear.document.offline.p315b.C5893b;
import com.bytedance.ee.bear.document.offline.remoteres.C5981a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.lark.p414b.AbstractC7995h;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.io.C13674e;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p705h.C13667b;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.e.e */
public class C5927e implements AbstractC5923c {

    /* renamed from: a */
    private String f16601a = "OfflineResourceInterceptor2";

    /* renamed from: b */
    private String f16602b = "mobile_index.html";

    /* renamed from: c */
    private String f16603c;

    /* renamed from: d */
    private ConcurrentHashMap<String, String> f16604d;

    /* renamed from: e */
    private Context f16605e;

    /* renamed from: f */
    private an f16606f;

    /* renamed from: g */
    private NetService f16607g;

    /* renamed from: h */
    private ao f16608h;

    /* renamed from: i */
    private AbstractC5233x f16609i;

    /* renamed from: j */
    private al f16610j;

    /* renamed from: k */
    private C10917c f16611k;

    /* renamed from: l */
    private AbstractC2220h f16612l;

    /* renamed from: m */
    private PersistenceSharedPreference f16613m;

    /* renamed from: n */
    private C5981a f16614n;

    /* renamed from: o */
    private C5892a f16615o;

    /* renamed from: p */
    private boolean f16616p;

    /* renamed from: q */
    private String f16617q;

    /* renamed from: r */
    private boolean f16618r;

    @Override // com.bytedance.ee.bear.document.offline.p318e.AbstractC5923c
    /* renamed from: b */
    public boolean mo23905b() {
        return this.f16618r;
    }

    @Override // com.bytedance.ee.bear.document.offline.p318e.AbstractC5923c
    /* renamed from: a */
    public synchronized void mo23903a() {
        C5486o a = ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21869a("DOC_CHANNEL");
        C5929f fVar = new C5929f(a.mo21913a(), a.mo21914b(), a.mo21915c());
        File a2 = fVar.mo23915a();
        this.f16618r = fVar.mo23917c();
        this.f16614n = new C5981a(this.f16607g, this.f16609i, fVar);
        C5130a.m20994a(fVar.mo23916b());
        boolean b = m23866b(a2);
        this.f16616p = b;
        if (b) {
            ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40251a(a2.getAbsolutePath());
        } else {
            C13479a.m54758a(this.f16601a, "checkOfflineRes(): init fail");
        }
        this.f16603c = C5890a.m23694a(m23867d(this.f16602b));
        String str = this.f16601a;
        C13479a.m54764b(str, "internalCheckOfflineRes() initSuccess = " + this.f16616p + ", resource = " + fVar);
        if (!TextUtils.isEmpty(this.f16603c)) {
            m23868d();
        }
    }

    /* renamed from: f */
    private void m23870f() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f16604d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.p318e.AbstractC5923c
    /* renamed from: c */
    public void mo23906c() {
        C13479a.m54764b(this.f16601a, "destroy");
        m23870f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.offline.e.e$1 */
    public static /* synthetic */ class C59281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16619a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.larksuite.component.ui.display.manager.ZoomLevel[] r0 = com.larksuite.component.ui.display.manager.ZoomLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.offline.p318e.C5927e.C59281.f16619a = r0
                com.larksuite.component.ui.display.manager.ZoomLevel r1 = com.larksuite.component.ui.display.manager.ZoomLevel.SMALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.offline.p318e.C5927e.C59281.f16619a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.ui.display.manager.ZoomLevel r1 = com.larksuite.component.ui.display.manager.ZoomLevel.LARGE1     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.document.offline.p318e.C5927e.C59281.f16619a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.ui.display.manager.ZoomLevel r1 = com.larksuite.component.ui.display.manager.ZoomLevel.LARGE2     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.document.offline.p318e.C5927e.C59281.f16619a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.ui.display.manager.ZoomLevel r1 = com.larksuite.component.ui.display.manager.ZoomLevel.LARGE3     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.document.offline.p318e.C5927e.C59281.f16619a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.larksuite.component.ui.display.manager.ZoomLevel r1 = com.larksuite.component.ui.display.manager.ZoomLevel.LARGE4     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.offline.p318e.C5927e.C59281.<clinit>():void");
        }
    }

    /* renamed from: e */
    private String m23869e() {
        int i = C59281.f16619a[LKUIDisplayManager.m91870a().ordinal()];
        if (i == 1) {
            return "S";
        }
        if (i == 2) {
            return "L";
        }
        if (i == 3) {
            return "XL";
        }
        if (i == 4) {
            return "2XL";
        }
        if (i != 5) {
            return "M";
        }
        return "3XL";
    }

    /* renamed from: d */
    private void m23868d() {
        String str;
        String str2;
        String str3;
        AccountService.Account d = this.f16606f.mo16406d();
        if (d != null) {
            String str4 = this.f16603c;
            String str5 = "";
            if (d.f14584a == null) {
                str3 = str5;
            } else {
                str3 = d.f14584a;
            }
            String replace = str4.replace("{{ user_id }}", str3);
            this.f16603c = replace;
            if (d.f14592i != null) {
                str5 = d.f14592i;
            }
            this.f16603c = replace.replace("{{ tenant_id }}", str5);
        }
        String a = C13667b.m55444a(this.f16608h.mo17253d().getCountry(), this.f16608h.mo17252c());
        String replace2 = this.f16603c.replace("{{lang_cdn}}", "//sf3-scmcdn2-cn.feishucdn.com/eesz/resource/bear/lang/" + a + ".js");
        this.f16603c = replace2;
        this.f16603c = replace2.replace("{{ language }}", this.f16608h.mo17252c());
        String str6 = "{}";
        this.f16603c = this.f16603c.replace("\"{{ app_config }}\"", (String) C4211a.m17514a().mo16533a("app_config", str6));
        String h = DocOpenConfig.m22767h();
        this.f16603c = this.f16603c.replace("\"{{ domain_characteristic_config }}\"", h);
        C13479a.m54764b(this.f16601a, "replaceTemplateInfos()...lan = " + a + ", domainCharacteristicConfig = " + h);
        this.f16603c = this.f16603c.replace("\"{{ app_debug_config }}\"", "{\"isDebug\":" + this.f16613m.mo34038b("isDebug", Boolean.FALSE) + "}");
        if (this.f16607g.mo20123c()) {
            str = "staging";
        } else {
            str = "prod";
        }
        String replace3 = this.f16603c.replace("{{navigator_env}}", str);
        this.f16603c = replace3;
        this.f16603c = replace3.replace("{{navigator_path_prefix}}", C6313i.m25327a().mo25390c());
        this.f16603c = this.f16603c.replace("{{navigator_api_prefix}}", "https://" + C6313i.f17510b + "/" + C6313i.m25327a().mo25387b());
        if (this.f16610j.mo17353N()) {
            this.f16603c = this.f16603c.replace("{{ anonymous_access }}", "True");
        } else {
            this.f16603c = this.f16603c.replace("{{ anonymous_access }}", "False");
        }
        for (String str7 : C5919a.f16572b) {
            this.f16603c = this.f16603c.replace(str7, "null");
        }
        this.f16603c = this.f16603c.replace("{{ enable_et_test }}", ((Boolean) this.f16613m.mo34038b("enable_frontend_et_test", Boolean.FALSE)).toString());
        String b = ((AbstractC7995h) KoinJavaComponent.m268610a(AbstractC7995h.class)).mo30995b("suite_hybrid_config");
        if (!TextUtils.isEmpty(b)) {
            str6 = b;
        }
        this.f16603c = this.f16603c.replace("\"{{ globalKaConfig }}\"", str6);
        String e = m23869e();
        C13479a.m54764b(this.f16601a, "currentBaseFontSize = " + e);
        String replace4 = this.f16603c.replace("\"{{ device_info }}\"", String.format("{\"baseFontSize\": \"%s\"}", e));
        this.f16603c = replace4;
        if (UDUiModeUtils.m93319a(C13615c.f35773a)) {
            str2 = "\"dark\"";
        } else {
            str2 = "\"light\"";
        }
        this.f16603c = replace4.replace("\"{{ theme }}\"", str2);
        if (C4211a.m17514a().mo16536a("ccm.theme.mobile_darkmode_enable", false)) {
            this.f16603c = this.f16603c.replace("{{ darkmode_enable }}", "True");
        } else {
            this.f16603c = this.f16603c.replace("{{ darkmode_enable }}", "False");
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.p318e.AbstractC5923c
    /* renamed from: a */
    public void mo23904a(String str) {
        String str2 = this.f16601a;
        C13479a.m54764b(str2, "setPreloadUrl()... preloadUrl = " + str);
        this.f16617q = str;
    }

    /* renamed from: a */
    private Pair<InputStream, Pair<String, Long>> m23857a(File file) {
        Pair<InputStream, Pair<String, Long>> pair = new Pair<>(null, new Pair("0", -1L));
        if (file == null || !file.exists()) {
            return pair;
        }
        try {
            return new Pair<>(new FileInputStream(file), new Pair("0", Long.valueOf(file.length())));
        } catch (FileNotFoundException unused) {
            C13479a.m54758a(this.f16601a, "File not found");
            return pair;
        }
    }

    /* renamed from: b */
    private boolean m23866b(File file) {
        if (file != null && file.exists()) {
            m23870f();
            HashMap hashMap = new HashMap();
            m23861a(file, hashMap, file.getParentFile().getAbsolutePath().length());
            this.f16604d.putAll(hashMap);
        }
        return !TextUtils.isEmpty(this.f16604d.get(this.f16602b));
    }

    /* renamed from: b */
    private void m23865b(Map<String, String> map) {
        AccountService.Account d = this.f16606f.mo16406d();
        if (d != null && d.mo19677a()) {
            C2223j.C2224a aVar = new C2223j.C2224a();
            if (map == null || map.size() <= 0) {
                C13479a.m54775e(this.f16601a, "initHeaders: headers is null");
            } else {
                for (String str : map.keySet()) {
                    aVar.mo10586a(str, map.get(str));
                }
            }
            this.f16612l = aVar.mo10587a();
        }
    }

    /* renamed from: c */
    public InputStream mo23914c(String str) {
        InputStream openInputStream;
        C5937c e = C5955d.m24025b().mo24099e(str);
        if (e == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(e.mo23961d())) {
                File file = new File(e.mo23961d());
                if (!file.exists()) {
                    return null;
                }
                openInputStream = new FileInputStream(file);
            } else if (TextUtils.isEmpty(e.mo23973j())) {
                return null;
            } else {
                openInputStream = this.f16605e.getContentResolver().openInputStream(Uri.parse(e.mo23973j()));
            }
            return openInputStream;
        } catch (Exception e2) {
            C13479a.m54761a(this.f16601a, e2);
            return null;
        }
    }

    /* renamed from: d */
    private InputStream m23867d(String str) {
        String str2 = this.f16604d.get(str);
        if (!TextUtils.isEmpty(str2)) {
            InputStream inputStream = (InputStream) m23858a(str2, (String) null).first;
            if (inputStream != null) {
                try {
                    int available = inputStream.available();
                    if (available > 0) {
                        String str3 = this.f16601a;
                        C13479a.m54764b(str3, "getFileStreamByName()... mFileStreamCacheMap fileName = " + str + " inputStream size: " + available);
                        return inputStream;
                    }
                    String str4 = this.f16601a;
                    C13479a.m54764b(str4, "getFileStreamByName()..11.. fileName = " + str);
                } catch (Exception e) {
                    String str5 = this.f16601a;
                    C13479a.m54764b(str5, "getFileStreamByName()..33.. fileName = " + str + "   ===== e = " + e);
                }
            } else {
                String str6 = this.f16601a;
                C13479a.m54764b(str6, "getFileStreamByName()..22.. fileName = " + str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public InputStream mo23913b(String str) {
        String str2;
        C5937c d = C5955d.m24025b().mo24097d(C13721c.m55643a(str));
        String str3 = "";
        if (d != null) {
            str3 = d.mo23961d();
            str2 = d.mo23973j();
        } else {
            str2 = str3;
        }
        String str4 = this.f16601a;
        C13479a.m54772d(str4, "path = " + str3 + "---uri = " + str2);
        try {
            if (TextUtils.isEmpty(str3)) {
                if (TextUtils.isEmpty(str2)) {
                    C13479a.m54764b(this.f16601a, "internalGetLocalImageStream()... end  cannot find fileModel by ");
                    return null;
                }
            }
            InputStream inputStream = (InputStream) m23858a(str3, str2).first;
            if (inputStream == null) {
                C13479a.m54775e(this.f16601a, "internalGetLocalImageStream()... end  inputStream is null ");
                return null;
            } else if (inputStream.available() > 0) {
                return inputStream;
            } else {
                inputStream.close();
                return null;
            }
        } catch (IOException e) {
            String str5 = this.f16601a;
            C13479a.m54758a(str5, "internalGetLocalImageStream: " + e);
            return null;
        }
    }

    /* renamed from: a */
    private void m23862a(Map<String, String> map) {
        if (map != null && map.containsKey("Origin")) {
            map.put("access-control-allow-credentials", "true");
            map.put("access-control-allow-methods", "POST, GET, OPTIONS, PUT, DELETE");
            map.put("access-control-allow-origin", map.get("Origin"));
        }
    }

    /* renamed from: a */
    private Pair<InputStream, Long> m23858a(String str, String str2) {
        Exception e;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            try {
                if (file.exists()) {
                    inputStream = new FileInputStream(file);
                } else {
                    inputStream = this.f16605e.getAssets().open(str);
                }
                try {
                    return new Pair<>(inputStream, Long.valueOf(file.length()));
                } catch (Exception e2) {
                    inputStream2 = inputStream;
                    e = e2;
                    C13479a.m54759a(this.f16601a, "readResponseStream... err happens", e);
                    return new Pair<>(inputStream2, -1L);
                }
            } catch (Exception e3) {
                e = e3;
                C13479a.m54759a(this.f16601a, "readResponseStream... err happens", e);
                return new Pair<>(inputStream2, -1L);
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    inputStream2 = this.f16605e.getContentResolver().openInputStream(Uri.parse(str2));
                } catch (FileNotFoundException e4) {
                    C13479a.m54759a(this.f16601a, "readResponseStream from uri... err", e4);
                }
            } else {
                C13479a.m54758a(this.f16601a, "readResponseStream... empty file path and uri");
            }
            return new Pair<>(inputStream2, -1L);
        }
    }

    /* renamed from: a */
    private Pair<InputStream, Pair<String, Long>> m23859a(String str, Map<String, String> map) {
        try {
            C5937c e = C5955d.m24025b().mo24099e(C6313i.m25327a().mo25400h(Uri.parse(C13721c.m55643a(str)).getPath()));
            String str2 = this.f16601a;
            C13479a.m54764b(str2, "internalGetDriveCoverImageStream()... end url = , path =" + e);
            if (e == null || TextUtils.isEmpty(e.mo23961d())) {
                return m23857a(m23864b(str, str, map));
            }
            Pair<InputStream, Long> a = m23858a(e.mo23961d(), e.mo23973j());
            InputStream inputStream = (InputStream) a.first;
            if (inputStream != null && inputStream.available() > 0) {
                return new Pair<>(inputStream, new Pair("1", a.second));
            }
            if (inputStream != null) {
                inputStream.close();
            }
            String str3 = this.f16601a;
            C13479a.m54764b(str3, "internalGetNetImageStream()... local file not valid, re-download it, path =" + e);
            return m23857a(m23864b(str, str, map));
        } catch (IOException unused) {
            C13479a.m54758a(this.f16601a, "IOException e");
            return new Pair<>(null, new Pair("0", -1L));
        }
    }

    /* renamed from: b */
    private Pair<InputStream, Pair<String, Long>> m23863b(String str, Map<String, String> map) {
        try {
            String a = C13721c.m55643a(str);
            String str2 = Uri.parse(a).getScheme() + "://" + C6313i.f17510b + C6313i.m25327a().mo25400h(Uri.parse(a).getPath());
            C5937c e = C5955d.m24025b().mo24099e(a);
            C13479a.m54764b(this.f16601a, "internalGetNetImageStream()... end url = , path =" + e);
            if (e == null || TextUtils.isEmpty(e.mo23961d())) {
                return m23857a(m23864b(a, str2, map));
            }
            Pair<InputStream, Long> a2 = m23858a(e.mo23961d(), e.mo23973j());
            InputStream inputStream = (InputStream) a2.first;
            if (inputStream != null && inputStream.available() > 0) {
                return new Pair<>(inputStream, new Pair("1", a2.second));
            }
            if (inputStream != null) {
                inputStream.close();
            }
            C13479a.m54764b(this.f16601a, "internalGetNetImageStream()... local file not valid, re-download it, path =" + e);
            return m23857a(m23864b(a, str2, map));
        } catch (IOException unused) {
            C13479a.m54758a(this.f16601a, "IOException e");
            return new Pair<>(null, new Pair("0", -1L));
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo23911a(String str, InputStream inputStream, Map<String, String> map) {
        return mo23912b(C5890a.m23711c(str), inputStream, map);
    }

    /* renamed from: b */
    public WebResourceResponse mo23912b(String str, InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            if (inputStream.available() <= 0) {
                return null;
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, C5919a.f16571a, inputStream);
            m23862a(map);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (IOException unused) {
            C13479a.m54758a(this.f16601a, "  internalGetImageResponse(): ");
            return null;
        }
    }

    public C5927e(Context context, C10917c cVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f16601a += "_" + str;
        }
        this.f16605e = context;
        this.f16611k = cVar;
        this.f16606f = (an) KoinJavaComponent.m268610a(an.class);
        this.f16607g = (NetService) KoinJavaComponent.m268610a(NetService.class);
        this.f16609i = C5234y.m21391b();
        this.f16608h = C4484g.m18494b();
        this.f16610j = C4511g.m18594d();
        this.f16604d = new ConcurrentHashMap<>();
        this.f16613m = new PersistenceSharedPreference("debug_config");
        this.f16615o = new C5892a();
    }

    /* renamed from: b */
    private File m23864b(String str, String str2, Map<String, String> map) {
        try {
            m23865b(map);
            File file = (File) ComponentCallbacks2C2115c.m9151c(this.f16605e).mo10414a(new C13664a(str2, this.f16612l)).mo10405b(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            if (C13674e.m55485b(file)) {
                C5937c cVar = new C5937c();
                cVar.mo23956a(file.getName() + "_" + System.currentTimeMillis());
                if (C5890a.m23707b() != null) {
                    cVar.mo23958b(C5890a.m23707b());
                    cVar.mo23960c(C5890a.m23707b());
                } else {
                    cVar.mo23958b(str);
                    cVar.mo23960c(str);
                }
                cVar.mo23962d(C5955d.m24032i(file.getAbsolutePath()));
                cVar.mo23955a(Long.valueOf(C13675f.m55541k(file)));
                cVar.mo23966f(C6313i.m25327a().mo25400h(Uri.parse(C13721c.m55643a(str)).getPath()));
                C5955d.m24025b().mo24071a(cVar);
                return file;
            }
            C13479a.m54775e(this.f16601a, "internalGetNetImageStream isImage not: ");
            return null;
        } catch (Exception e) {
            C13479a.m54759a(this.f16601a, "internalGetNetImageStream: downloadImage failed", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m23861a(File file, Map<String, String> map, int i) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.getName() == null || file2.getAbsolutePath() == null) {
                    C13606d.m55245a(this.f16601a, new RuntimeException("name = " + file2.getName() + " path = " + file2.getAbsolutePath() + " file = " + file2.toString() + " dir = " + file.toString()));
                } else {
                    if (new File(file2.getAbsolutePath()).isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (absolutePath.endsWith(this.f16602b)) {
                            map.put(this.f16602b, absolutePath);
                        } else {
                            map.put(absolutePath.substring(i), absolutePath);
                        }
                    }
                    m23861a(file2, map, i);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.p318e.AbstractC5923c
    /* renamed from: a */
    public WebResourceResponse mo23902a(String str, String str2, Map<String, String> map) {
        DownloadRequestInfo.DownloadType downloadType;
        if ("options".equalsIgnoreCase(str2)) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            if (TextUtils.equals(str, this.f16617q)) {
                String str3 = this.f16601a;
                C13479a.m54764b(str3, "shouldInterceptRequest()... mPreloadUrl = " + this.f16617q);
                if (!this.f16616p || TextUtils.isEmpty(this.f16603c)) {
                    String str4 = this.f16601a;
                    C13479a.m54758a(str4, "shouldInterceptRequest()... mResponseContent initSuccess = " + this.f16616p + " mResponseContent: " + this.f16603c);
                } else {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f16603c.getBytes(C5919a.f16571a));
                    if (byteArrayInputStream.available() > 0) {
                        C13479a.m54764b(this.f16601a, "shouldInterceptRequest() mResponseContent replace html... ");
                        WebResourceResponse webResourceResponse = new WebResourceResponse(C5890a.m23711c(str), C5919a.f16571a, byteArrayInputStream);
                        map.put("codecache-optimize", "true");
                        map.put("memcache-optimize", "true");
                        map.put("readonce-optimize", "true");
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    C13479a.m54758a(this.f16601a, "shouldInterceptRequest()... mResponseContent inputstream is invalid end");
                }
                return null;
            }
            if (C5627ab.m22839c(str)) {
                if (this.f16615o.mo23805a(str, C13749l.m55736a() - (C13749l.m55738a(26) * 2), C5892a.f16489a)) {
                    downloadType = DownloadRequestInfo.DownloadType.COVER;
                } else {
                    downloadType = DownloadRequestInfo.DownloadType.IMG;
                }
                C5893b.C5896a a = C5893b.m23724a().mo23807a(str, downloadType, C5890a.m23707b(), C5890a.m23710c());
                if (a.mo23812a() != null) {
                    WebResourceResponse b = mo23912b("image/*", a.mo23812a(), map);
                    OfflineAnalytic.m23717a(a.mo23818c(), uptimeMillis, a.mo23819d(), a.mo23820e(), "customSchemeDrive", downloadType.getValue());
                    return b;
                }
                OfflineAnalytic.m23716a(uptimeMillis, a.mo23820e(), "customSchemeDrive", downloadType.getValue());
            } else if (C5627ab.m22840d(str)) {
                return m23860a(str, map, uptimeMillis, m23859a(str, map));
            } else {
                if (C5627ab.m22836a(str)) {
                    return mo23911a(str, mo23913b(str), map);
                }
                if (C5681c.m23038a(str)) {
                    return m23860a(str, map, uptimeMillis, m23863b(str, map));
                }
                if (C5627ab.m22838b(str)) {
                    return mo23912b(str, mo23914c(str), map);
                }
                if (!TextUtils.isEmpty(str)) {
                    String path = Uri.parse(str).getPath();
                    if (!TextUtils.isEmpty(path)) {
                        InputStream d = m23867d(path);
                        if (d != null) {
                            WebResourceResponse webResourceResponse2 = new WebResourceResponse(C5890a.m23711c(str), C5919a.f16571a, d);
                            try {
                                if (!TextUtils.isEmpty(this.f16604d.get(path))) {
                                    File file = new File(this.f16604d.get(path));
                                    if (file.exists()) {
                                        map.put("x-ttwebview-response-update-time", String.valueOf(file.lastModified()));
                                        webResourceResponse2.setResponseHeaders(map);
                                    }
                                }
                            } catch (Throwable th) {
                                C13479a.m54759a(this.f16601a, "ttwebview-response-update-time ", th);
                            }
                            return webResourceResponse2;
                        }
                        C5981a aVar = this.f16614n;
                        if (aVar != null && aVar.mo24201a(str)) {
                            return this.f16614n.mo24202b(str);
                        }
                    }
                }
            }
            String str5 = this.f16601a;
            StringBuilder sb = new StringBuilder();
            sb.append("internalGetSubResponseStream... not InterceptRequest ");
            if (str == null || (!str.endsWith(".js") && !str.endsWith(".css"))) {
                str = "";
            }
            sb.append(str);
            C13479a.m54764b(str5, sb.toString());
            return null;
        } catch (Exception e) {
            C13479a.m54759a(this.f16601a, "internalGetSubResponseStream ", e);
        }
    }

    /* renamed from: a */
    private WebResourceResponse m23860a(String str, Map<String, String> map, long j, Pair<InputStream, Pair<String, Long>> pair) {
        InputStream inputStream = (InputStream) pair.first;
        if (inputStream != null) {
            WebResourceResponse a = mo23911a(str, inputStream, map);
            Pair pair2 = (Pair) pair.second;
            if (pair2 != null) {
                OfflineAnalytic.m23717a((String) pair2.first, j, ((Long) pair2.second).longValue(), 0, "customSchemeDocs", -1);
            }
            return a;
        }
        OfflineAnalytic.m23716a(j, -1, "customSchemeDocs", -1);
        return null;
    }
}
