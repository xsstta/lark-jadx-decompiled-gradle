package com.bytedance.ttnet.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.frameworks.baselib.network.connectionclass.C13949b;
import com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality;
import com.bytedance.frameworks.baselib.network.dispatcher.C13961e;
import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13994c;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.exception.NotAllowApiHttpException;
import com.bytedance.frameworks.baselib.network.http.impl.C14003a;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14028g;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o;
import com.bytedance.frameworks.baselib.network.http.p741a.C13979a;
import com.bytedance.frameworks.baselib.network.http.p741a.C13981b;
import com.bytedance.frameworks.baselib.network.http.p742b.C13984b;
import com.bytedance.frameworks.baselib.network.http.parser.StreamParser;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.frameworks.baselib.network.p740a.C13939c;
import com.bytedance.frameworks.core.p747a.C14092a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.ttnet.C20741b;
import com.bytedance.ttnet.HttpClient;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p911b.C20742a;
import com.bytedance.ttnet.p913d.C20766b;
import com.bytedance.ttnet.tnc.TNCManager;
import com.bytedance.ttnet.utils.C20786a;
import com.bytedance.ttnet.utils.C20790c;
import com.bytedance.ttnet.utils.C20793d;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.config.a */
public class C20748a implements WeakHandler.IHandler, C13949b.AbstractC13951b, NetworkParams.CdnConnectionQualitySamplerHook, NetworkParams.AbstractC13969c, NetworkParams.AbstractC13972f, NetworkParams.AbstractC13973g, C13998f.AbstractC13999a, C13998f.AbstractC14000b, C14092a.AbstractC14093a, HttpClient.AbstractC20719b {

    /* renamed from: H */
    private static int f50791H = -1;

    /* renamed from: I */
    private static int f50792I = -1;

    /* renamed from: N */
    private static ArrayList<String> f50793N;

    /* renamed from: O */
    private static boolean f50794O = false;

    /* renamed from: P */
    private static boolean f50795P = false;

    /* renamed from: Q */
    private static boolean f50796Q = false;

    /* renamed from: a */
    public static String f50797a;

    /* renamed from: d */
    static boolean f50798d;

    /* renamed from: e */
    static boolean f50799e;

    /* renamed from: f */
    static boolean f50800f = false;

    /* renamed from: g */
    private static C20748a f50801g;

    /* renamed from: A */
    private int f50802A = 1;

    /* renamed from: B */
    private int f50803B = 1;

    /* renamed from: C */
    private int f50804C = 1;

    /* renamed from: D */
    private String f50805D = "";

    /* renamed from: E */
    private List<String> f50806E = new CopyOnWriteArrayList();

    /* renamed from: F */
    private int f50807F = 0;

    /* renamed from: G */
    private List<String> f50808G = new CopyOnWriteArrayList();

    /* renamed from: J */
    private volatile int f50809J;

    /* renamed from: K */
    private String f50810K = "";

    /* renamed from: L */
    private AtomicInteger f50811L = new AtomicInteger(10800);

    /* renamed from: M */
    private List<String> f50812M = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Context f50813b;

    /* renamed from: c */
    final WeakHandler f50814c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: h */
    private final boolean f50815h;

    /* renamed from: i */
    private AtomicLong f50816i = new AtomicLong(0);

    /* renamed from: j */
    private AtomicBoolean f50817j = new AtomicBoolean(false);

    /* renamed from: k */
    private final Object f50818k = new Object();

    /* renamed from: l */
    private volatile boolean f50819l = false;

    /* renamed from: m */
    private String f50820m = "";

    /* renamed from: n */
    private int f50821n = 0;

    /* renamed from: o */
    private int f50822o = 0;

    /* renamed from: p */
    private volatile int f50823p = -1;

    /* renamed from: q */
    private long f50824q = 0;

    /* renamed from: r */
    private int f50825r = 0;

    /* renamed from: s */
    private int f50826s = 0;

    /* renamed from: t */
    private int f50827t = 1;

    /* renamed from: u */
    private int f50828u = 1;

    /* renamed from: v */
    private int f50829v = 0;

    /* renamed from: w */
    private int f50830w = 0;

    /* renamed from: x */
    private int f50831x = 1;

    /* renamed from: y */
    private int f50832y = 1;

    /* renamed from: z */
    private int f50833z = 1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ttnet.config.a$a */
    public static final class C20752a extends BroadcastReceiver {
        C20752a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                new ThreadPlus("SyncMainProcessConfig") {
                    /* class com.bytedance.ttnet.config.C20748a.C20752a.C207531 */

                    @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                    public void run() {
                        C20758e.m75635g().mo70038h();
                    }
                }.start();
            }
        }
    }

    /* renamed from: l */
    public String mo70032l() {
        return this.f50805D;
    }

    /* renamed from: m */
    public List<String> mo70033m() {
        return this.f50812M;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13972f
    /* renamed from: a */
    public boolean mo51376a(String str) {
        if (StringUtils.isEmpty(str) || this.f50833z <= 0) {
            return false;
        }
        try {
            URI a = C14091i.m57053a(str);
            if (a == null) {
                return false;
            }
            String host = a.getHost();
            if (!StringUtils.isEmpty(host) && host.endsWith(C20741b.m75547a())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean mo70023a(Object obj, TNCManager.TNCUpdateSource tNCUpdateSource, long j) throws Exception {
        JSONObject jSONObject;
        int i;
        int i2;
        int i3;
        String string;
        JSONObject jSONObject2;
        String[] strArr;
        JSONObject jSONObject3;
        JSONObject jSONObject4 = new JSONObject();
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isEmpty(str)) {
                m75597a(jSONObject4, "empty response.");
                return false;
            }
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            m75597a(jSONObject4, "object is null.");
            return false;
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C20759f.m75646a(this.f50813b).mo70040a(jSONObject5);
        f50791H = jSONObject5.optInt("use_http_dns", -1);
        f50792I = jSONObject5.optInt("collect_recent_page_info_enable", -1);
        int optInt = jSONObject5.optInt("ok_http_open", 0);
        int optInt2 = jSONObject5.optInt("ok_http3_open", 0);
        int optInt3 = jSONObject5.optInt("cronet_version", 0);
        int optInt4 = jSONObject5.optInt("http_dns_enabled", 0);
        int optInt5 = jSONObject5.optInt("detect_open", 0);
        int optInt6 = jSONObject5.optInt("detect_native_page", 1);
        int optInt7 = jSONObject5.optInt("collect_recent_page_info_enable", 1);
        int optInt8 = jSONObject5.optInt("add_ss_queries_open", 0);
        int optInt9 = jSONObject5.optInt("add_ss_queries_header_open", 0);
        int optInt10 = jSONObject5.optInt("add_ss_queries_plaintext_open", 1);
        int optInt11 = jSONObject5.optInt("add_device_fingerprint_open", 1);
        int optInt12 = jSONObject5.optInt("image_ttnet_enabled", 1);
        int optInt13 = jSONObject5.optInt("sample_band_width_enabled", 1);
        int optInt14 = jSONObject5.optInt("cdn_sample_band_width_enabled", 1);
        int optInt15 = jSONObject5.optInt("dynamic_adjust_threadpool_size_open", 1);
        int optInt16 = jSONObject5.optInt("http_show_hijack", 1);
        int optInt17 = jSONObject5.optInt("http_verify_sign", 1);
        int optInt18 = jSONObject5.optInt("tnc_update_interval", -1);
        if (optInt18 > 0) {
            this.f50811L.set(optInt18);
        }
        JSONArray optJSONArray = jSONObject5.optJSONArray("send_tnc_host_arrays");
        if (optJSONArray != null) {
            this.f50812M.clear();
            i = optInt17;
            int i4 = 0;
            while (i4 < optJSONArray.length()) {
                if (!TextUtils.isEmpty(optJSONArray.optString(i4))) {
                    jSONObject3 = jSONObject5;
                    this.f50812M.add(optJSONArray.optString(i4));
                } else {
                    jSONObject3 = jSONObject5;
                }
                i4++;
                jSONObject5 = jSONObject3;
            }
        } else {
            i = optInt17;
        }
        synchronized (this) {
            this.f50821n = optInt;
            this.f50822o = optInt2;
            this.f50807F = optInt3;
            this.f50825r = optInt4;
            this.f50826s = optInt5;
            this.f50827t = optInt6;
            this.f50828u = optInt7;
            this.f50829v = optInt8;
            this.f50830w = optInt9;
            this.f50831x = optInt10;
            this.f50803B = optInt11;
            this.f50804C = optInt15;
            this.f50832y = optInt12;
            this.f50833z = optInt13;
            this.f50802A = optInt14;
        }
        C13961e.m56473a(optInt15 > 0);
        C20790c.m75738a(jSONObject5.optInt("enable_req_ticket", 1) > 0);
        C20786a.C20787a a = C20786a.m75717a(jSONObject5);
        if (this.f50829v > 0 || this.f50830w > 0) {
            C20766b.m75669a(true);
        }
        StreamParser.onServerConfigUpdate(jSONObject5);
        C13998f.m56637a(jSONObject5);
        String optString = jSONObject5.optString("frontier_urls", "");
        String optString2 = jSONObject5.optString("share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().mo69989a(optString2);
        String optString3 = jSONObject5.optString("api_http_host_list", "");
        String optString4 = jSONObject5.optString("concurrent_request_config", "");
        C13994c.m56604a().mo51533a(optString4);
        String optString5 = jSONObject5.optString("add_common_params", "");
        C13979a b = C13981b.m56538a().mo51399b();
        if (b != null) {
            b.mo51384a(optString5);
        }
        String optString6 = jSONObject5.optString("L0_params", "");
        C13939c.m56420a().mo51301b(optString6);
        int optInt19 = jSONObject5.optInt("query_filter_enabled", Integer.MIN_VALUE);
        String optString7 = jSONObject5.optString("query_filter_actions");
        if (optInt19 != Integer.MIN_VALUE) {
            C13939c.m56420a().mo51300a(optInt19 > 0);
            C13939c.m56420a().mo51299a(optString7);
        }
        C13984b.m56548a().mo51418a(jSONObject5.optInt("disable_store_region_v2", 0) > 0);
        this.f50809J = jSONObject5.optInt("disable_encrypt_switch", 0);
        this.f50805D = jSONObject5.optString("cronet_so_path", "");
        if (this.f50809J == 2) {
            i2 = optInt19;
            i3 = 0;
            SharedPreferences.Editor edit = this.f50813b.getSharedPreferences("app_log_encrypt_switch_count", 0).edit();
            edit.putInt("app_log_encrypt_faild_count", 0);
            SharedPrefsEditorCompat.apply(edit);
        } else {
            i2 = optInt19;
            i3 = 0;
        }
        int optInt20 = jSONObject5.optInt("disable_framed_transport", i3);
        if (optInt20 > 0) {
            try {
                C14028g.m56766a(optInt20);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        synchronized (this) {
            SharedPreferences sharedPreferences = this.f50813b.getSharedPreferences("ss_app_config", 0);
            string = sharedPreferences.getString("share_cookie_host_list", "");
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString("ttnet_response_verify", a.f50953b);
            edit2.putInt("ttnet_response_verify_enabled", a.f50952a);
            StreamParser.onSaveConfigToSP(edit2);
            C13998f.m56627a(edit2);
            edit2.putInt("ok_http_open", optInt);
            edit2.putInt("ok_http3_open", optInt2);
            edit2.putInt("cronet_version", optInt3);
            edit2.putInt("http_dns_enabled", optInt4);
            edit2.putInt("detect_open", optInt5);
            edit2.putInt("detect_native_page", optInt6);
            edit2.putInt("collect_recent_page_info_enable", optInt7);
            edit2.putInt("add_ss_queries_open", optInt8);
            edit2.putInt("add_ss_queries_header_open", optInt9);
            edit2.putInt("add_ss_queries_plaintext_open", optInt10);
            edit2.putInt("add_device_fingerprint_open", optInt11);
            edit2.putInt("dynamic_adjust_threadpool_size_open", optInt15);
            edit2.putInt("image_ttnet_enabled", optInt12);
            edit2.putInt("use_http_dns", f50791H);
            edit2.putInt("use_http_dns_refetch_on_expire", f50792I);
            edit2.putInt("http_show_hijack", optInt16);
            edit2.putInt("http_verify_sign", i);
            edit2.putString("frontier_urls", optString);
            edit2.putString("cronet_so_path", this.f50805D);
            edit2.putString("share_cookie_host_list", optString2);
            jSONObject4.put("oldShareCookieHosts", string);
            jSONObject4.put("newShareCookieHosts", optString2);
            if (!TextUtils.isEmpty(optString2)) {
                this.f50806E.clear();
                C20793d.m75747b(optString2, this.f50806E);
            }
            String g = TTNetInit.getTTNetDepend().mo69996g();
            if (!StringUtils.isEmpty(g) && !C20793d.m75745a(g, this.f50806E)) {
                this.f50806E.add(g);
            }
            edit2.putString("api_http_host_list", optString3);
            edit2.putString("concurrent_request_config", optString4);
            edit2.putString("add_common_params", optString5);
            edit2.putString("query_filter_actions", optString7);
            edit2.putString("L0_params", optString6);
            edit2.putInt("query_filter_enabled", i2);
            String[] split = optString3.split(",");
            int i5 = 0;
            for (int length = split.length; i5 < length; length = length) {
                String str2 = split[i5];
                if (!StringUtils.isEmpty(str2)) {
                    strArr = split;
                    if (!C20793d.m75745a(str2, this.f50808G)) {
                        this.f50808G.add(str2.trim());
                    }
                } else {
                    strArr = split;
                }
                i5++;
                split = strArr;
            }
            edit2.putInt("android_log_encrypt_switch", this.f50809J);
            edit2.putInt("image_ttnet_enabled", this.f50832y);
            edit2.putInt("sample_band_width_enabled", this.f50833z);
            edit2.putInt("cdn_sample_band_width_enabled", this.f50802A);
            edit2.putInt("disable_framed_transport", optInt20);
            edit2.putInt("tnc_update_interval", this.f50811L.get());
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < this.f50812M.size(); i6++) {
                sb.append(this.f50812M.get(i6));
                if (i6 != this.f50812M.size()) {
                    sb.append(',');
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                edit2.putString("send_tnc_host_arrays", sb2);
            }
            SharedPrefsEditorCompat.apply(edit2);
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!StringUtils.isEmpty(optString) && !optString.equals(this.f50820m)) {
                    this.f50820m = optString;
                    linkedHashMap.put("frontier_urls", optString);
                }
                linkedHashMap.put("http_dns_enabled", Integer.valueOf(optInt4));
                linkedHashMap.put("add_ss_queries_open", Integer.valueOf(optInt8));
                linkedHashMap.put("add_ss_queries_header_open", Integer.valueOf(optInt9));
                linkedHashMap.put("add_ss_queries_plaintext_open", Integer.valueOf(optInt10));
                linkedHashMap.put("share_cookie_host_list", optString2);
                linkedHashMap.put("disable_framed_transport", Integer.valueOf(optInt20));
                linkedHashMap.put("query_filter_actions", optString7);
                linkedHashMap.put("L0_params", optString6);
                linkedHashMap.put("query_filter_enabled", Integer.valueOf(i2));
                TTNetInit.getTTNetDepend().mo69987a(this.f50813b, linkedHashMap);
                Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                if (!TextUtils.isEmpty(f50797a)) {
                    intent.setPackage(f50797a);
                }
                this.f50813b.sendBroadcast(intent);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (!StringUtils.isEmpty(optString2)) {
            C20756d.m75629a().mo70036a(string, optString2);
        }
        if (ImageStrategyController.getInstance() != null) {
            jSONObject2 = jSONObject5;
            ImageStrategyController.getInstance().updateConfig(jSONObject2);
        } else {
            jSONObject2 = jSONObject5;
        }
        if (TNCManager.m75687b().mo70058d() != null) {
            TNCManager.m75687b().mo70058d().mo70064a(jSONObject2, tNCUpdateSource, this.f50810K, "", j);
        }
        m75597a(jSONObject4, "return true");
        return true;
    }

    @Override // com.bytedance.frameworks.core.p747a.C14092a.AbstractC14093a
    /* renamed from: c */
    public boolean mo51824c() {
        if (!f50795P && this.f50829v <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.frameworks.core.p747a.C14092a.AbstractC14093a
    /* renamed from: d */
    public boolean mo51825d() {
        if (!f50795P && this.f50830w > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.core.p747a.C14092a.AbstractC14093a
    /* renamed from: e */
    public boolean mo51826e() {
        if (!f50795P && this.f50831x <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.AbstractC14000b
    /* renamed from: b */
    public boolean mo51562b() {
        if (!f50794O && this.f50825r > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public String[] mo70030j() {
        String[] d = TTNetInit.getTTNetDepend().mo69993d();
        if (d == null || d.length <= 0) {
            return new String[0];
        }
        return d;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f50793N = arrayList;
        arrayList.add("MI PAD 2");
        f50793N.add("YT3-X90L");
        f50793N.add("YT3-X90F");
        f50793N.add("GT-810");
    }

    @Override // com.bytedance.ttnet.HttpClient.AbstractC20719b
    /* renamed from: f */
    public boolean mo69956f() {
        if (f50799e) {
            C14055o.m56892a(0);
            return false;
        } else if (f50800f) {
            C14055o.m56892a(8);
            return false;
        } else if (m75599i()) {
            return false;
        } else {
            if (!f50798d && this.f50823p > 5) {
                C14055o.m56892a(3);
                Logger.m15170e("AppConfig", "After five consecutive crashes of cronet, you must reinstall app to enable cronet, or wait until several hours");
                return false;
            } else if (TTNetInit.getTTNetDepend().mo69991b()) {
                return true;
            } else {
                C14055o.m56892a(6);
                return false;
            }
        }
    }

    /* renamed from: i */
    public static boolean m75599i() {
        String str;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                str = Build.SUPPORTED_ABIS[0];
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if ("x86".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str)) {
                if (C20742a.m75550a()) {
                    Logger.m15167d("AppConfig", "x86 support");
                    return false;
                }
                Logger.m15181w("AppConfig", "Cronet unsupported CPU arch: " + str);
                C14055o.m56892a(2);
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: n */
    private boolean m75600n() {
        List<String> list;
        if (mo70030j() != null && mo70030j().length >= 1) {
            String str = mo70030j()[0];
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String str2 = "https://" + str + "/get_domains/v5/";
            String addCommonParams = NetworkParams.addCommonParams(str2, true);
            if (str2.equals(addCommonParams)) {
                return true;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                UrlUtils.parseUrlWithValueList(addCommonParams, linkedHashMap);
                if (!linkedHashMap.containsKey("device_id") || (list = (List) linkedHashMap.get("device_id")) == null) {
                    return true;
                }
                for (String str3 : list) {
                    if (!str3.equals("0")) {
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo70028g() {
        if (System.currentTimeMillis() - this.f50816i.get() > ((long) this.f50811L.get()) * 1000) {
            this.f50816i.set(System.currentTimeMillis());
            try {
                int a = TTNetInit.getTTNetDepend().mo69983a(this.f50813b, "disable_framed_transport", 0);
                if (a > 0) {
                    try {
                        C14028g.m56766a(a);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (TNCManager.m75687b().mo70058d() != null) {
                    TNCManager.m75687b().mo70058d().mo70065b(this.f50816i.get());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    public void mo70031k() {
        try {
            SharedPreferences sharedPreferences = this.f50813b.getSharedPreferences("ss_app_config", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("chromium_boot_failures", 0);
            if (Logger.debug()) {
                Logger.m15167d("AppConfig", "KEY_CHROMIUM_BOOT_FAILURES set 0");
            }
            SharedPrefsEditorCompat.apply(edit);
            this.f50823p = sharedPreferences.getInt("chromium_boot_failures", 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.f50823p));
            TTNetInit.getTTNetDepend().mo69987a(this.f50813b, linkedHashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        if (r8.f50823p >= 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0083, code lost:
        r8.f50823p = r0.getInt("chromium_boot_failures", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008d, code lost:
        if (r8.f50804C <= 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0091, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        com.bytedance.frameworks.baselib.network.dispatcher.C13961e.m56473a(r2);
        r8.f50832y = r0.getInt("image_ttnet_enabled", 1);
        r8.f50833z = r0.getInt("sample_band_width_enabled", 1);
        r8.f50802A = r0.getInt("cdn_sample_band_width_enabled", 1);
        com.bytedance.ttnet.config.C20748a.f50791H = r0.getInt("use_http_dns", -1);
        com.bytedance.ttnet.config.C20748a.f50792I = r0.getInt("use_http_dns_refetch_on_expire", -1);
        com.bytedance.frameworks.baselib.network.http.parser.StreamParser.onConfigUpdate(r0);
        com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.m56628a(r0);
        com.bytedance.ttnet.utils.C20786a.m75721a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c9, code lost:
        if (r8.f50829v > 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
        if (r8.f50830w <= 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cf, code lost:
        com.bytedance.ttnet.p913d.C20766b.m75669a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        r8.f50820m = r0.getString("frontier_urls", "");
        r8.f50805D = r0.getString("cronet_so_path", "");
        r2 = r0.getString("api_http_host_list", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f2, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(r2) != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f4, code lost:
        r2 = r2.split(",");
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fc, code lost:
        if (r5 >= r4) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fe, code lost:
        r6 = r2[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0104, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(r6) != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0106, code lost:
        r8.f50808G.add(r6.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0112, code lost:
        com.bytedance.frameworks.baselib.network.http.cronet.impl.C13994c.m56604a().mo51533a(r0.getString("concurrent_request_config", ""));
        r2 = r0.getString("add_common_params", "");
        r4 = com.bytedance.frameworks.baselib.network.http.p741a.C13981b.m56538a().mo51399b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0131, code lost:
        if (r4 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0133, code lost:
        r4.mo51384a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0136, code lost:
        com.bytedance.frameworks.baselib.network.p740a.C13939c.m56420a().mo51301b(r0.getString("L0_params", ""));
        r2 = r0.getInt("query_filter_enabled", Integer.MIN_VALUE);
        r5 = r0.getString("query_filter_actions", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0155, code lost:
        if (r2 == Integer.MIN_VALUE) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0157, code lost:
        r4 = com.bytedance.frameworks.baselib.network.p740a.C13939c.m56420a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015b, code lost:
        if (r2 <= 0) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015f, code lost:
        r4.mo51300a(r1);
        com.bytedance.frameworks.baselib.network.p740a.C13939c.m56420a().mo51299a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0169, code lost:
        r1 = r0.getString("share_cookie_host_list", "");
        com.bytedance.ttnet.utils.C20793d.m75747b(r1, r8.f50806E);
        r2 = com.bytedance.ttnet.TTNetInit.getTTNetDepend().mo69996g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0182, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(r2) != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x018a, code lost:
        if (com.bytedance.ttnet.utils.C20793d.m75745a(r2, r8.f50806E) != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x018c, code lost:
        r8.f50806E.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0191, code lost:
        r8.f50811L.set(r0.getInt("tnc_update_interval", 10800));
        r2 = r0.getString("send_tnc_host_arrays", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01aa, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ac, code lost:
        r2 = r2.split(",");
        r8.f50812M.clear();
        r8.f50812M.addAll(java.util.Arrays.asList(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c8, code lost:
        if (com.bytedance.ttnet.tnc.TNCManager.m75687b().mo70058d() == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ca, code lost:
        com.bytedance.ttnet.tnc.TNCManager.m75687b().mo70058d().mo70062a(r8.f50816i.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01db, code lost:
        r0 = r0.getInt("disable_framed_transport", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01e1, code lost:
        if (r0 <= 0) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        com.bytedance.frameworks.baselib.network.http.ok3.impl.C14028g.m56766a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e8, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        com.bytedance.ttnet.config.C20759f.m75646a(r8.f50813b).mo70041c();
        r0 = r8.f50813b.getSharedPreferences("ss_app_config", 0);
        r8.f50821n = r0.getInt("ok_http_open", 0);
        r8.f50822o = r0.getInt("ok_http3_open", 0);
        r8.f50807F = r0.getInt("cronet_version", 0);
        r8.f50825r = r0.getInt("http_dns_enabled", 0);
        r8.f50826s = r0.getInt("detect_open", 0);
        r8.f50827t = r0.getInt("detect_native_page", 1);
        r8.f50828u = r0.getInt("collect_recent_page_info_enable", 1);
        r8.f50829v = r0.getInt("add_ss_queries_open", 0);
        r8.f50830w = r0.getInt("add_ss_queries_header_open", 0);
        r8.f50831x = r0.getInt("add_ss_queries_plaintext_open", 1);
        r8.f50803B = r0.getInt("add_device_fingerprint_open", 1);
        r8.f50804C = r0.getInt("dynamic_adjust_threadpool_size_open", 1);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70029h() {
        /*
        // Method dump skipped, instructions count: 603
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.C20748a.mo70029h():void");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.AbstractC13999a
    /* renamed from: a */
    public boolean mo51561a() {
        if (Logger.debug()) {
            Logger.m15167d("AppConfig", "isCronetBootFailureExpected...");
        }
        SharedPreferences sharedPreferences = this.f50813b.getSharedPreferences("ss_app_config", 0);
        if (this.f50823p < 0) {
            this.f50823p = sharedPreferences.getInt("chromium_boot_failures", 0);
        }
        this.f50824q = sharedPreferences.getLong("chromium_boot_failures_timestamp", 0);
        if (this.f50823p > 5 && System.currentTimeMillis() - this.f50824q > TimeUnit.HOURS.toMillis(1)) {
            this.f50823p = 5;
        }
        if (!mo69956f()) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("chromium_boot_failures", this.f50823p + 1);
        edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
        if (Logger.debug()) {
            Logger.m15167d("AppConfig", "KEY_CHROMIUM_BOOT_FAILURES inc...");
        }
        SharedPrefsEditorCompat.apply(edit);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.f50823p + 1));
        TTNetInit.getTTNetDepend().mo69987a(this.f50813b, linkedHashMap);
        return true;
    }

    /* renamed from: d */
    public void mo70027d(String str) {
        this.f50810K = str;
    }

    /* renamed from: a */
    public void mo70021a(TNCManager.TNCUpdateSource tNCUpdateSource) {
        mo70022a(tNCUpdateSource, false);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13973g
    /* renamed from: b */
    public List<String> mo51378b(String str) {
        if (C20793d.m75745a(str, this.f50806E)) {
            return this.f50806E;
        }
        return null;
    }

    /* renamed from: c */
    public void mo70026c(String str) {
        boolean z;
        if (!StringUtils.isEmpty(str)) {
            try {
                z = mo70023a(str, TNCManager.TNCUpdateSource.TTCRONET, System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            int i = 102;
            if (z) {
                i = 101;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", "cronet");
                TTNetInit.getTTNetDepend().mo69988a(this.f50813b, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f50814c.sendEmptyMessage(i);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.CdnConnectionQualitySamplerHook
    public boolean cdnShouldSampling(String str) {
        if (StringUtils.isEmpty(str) || this.f50802A <= 0) {
            return false;
        }
        try {
            URI a = C14091i.m57053a(str);
            if (a == null) {
                return false;
            }
            String host = a.getHost();
            if (!StringUtils.isEmpty(host) && host.endsWith(C20741b.m75548b())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        switch (message.what) {
            case 101:
                this.f50816i.set(System.currentTimeMillis());
                if (Logger.debug()) {
                    Logger.m15167d("TNCManager", "doRefresh, succ");
                }
                this.f50817j.set(false);
                return;
            case 102:
                if (Logger.debug()) {
                    Logger.m15167d("TNCManager", "doRefresh, error");
                }
                this.f50817j.set(false);
                return;
            case 103:
                if (Logger.debug()) {
                    Logger.m15167d("TNCManager", "do tnc polling");
                }
                mo70021a(TNCManager.TNCUpdateSource.TTPOLL);
                return;
            case 104:
                if (Logger.debug()) {
                    Logger.m15167d("TNCManager", "did is empty, delay request tnc");
                }
                mo70021a(TNCManager.TNCUpdateSource.TTSERVER);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static C20748a m75596a(Context context) {
        C20748a aVar;
        synchronized (C20748a.class) {
            if (f50801g == null) {
                boolean b = C14089g.m57048b(context);
                f50801g = new C20748a(context.getApplicationContext(), b);
                if (f50793N.contains(Build.MODEL)) {
                    f50800f = true;
                }
                f50797a = context.getPackageName();
                if (b) {
                    C14092a.m57060a(f50801g);
                    C13998f.m56630a((C13998f.AbstractC14000b) f50801g);
                    C13998f.m56629a((C13998f.AbstractC13999a) f50801g);
                    HttpClient.setHttpClientConfig(f50801g);
                    C13949b.m56438b().mo51312a(f50801g);
                    NetworkParams.setConnectionQualitySamplerHook(f50801g);
                    NetworkParams.setCdnConnectionQualitySamplerHook(f50801g);
                    if (NetworkParams.getCookieShareInterceptor() == null) {
                        NetworkParams.setCookieShareInterceptor(f50801g);
                    }
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                    try {
                        m75595a(context, new C20752a(), intentFilter);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    C20758e g = C20758e.m75635g();
                    C14092a.m57060a(g);
                    C13998f.m56630a((C13998f.AbstractC14000b) g);
                    C13998f.m56629a((C13998f.AbstractC13999a) g);
                    HttpClient.setHttpClientConfig(g);
                    if (NetworkParams.getCookieShareInterceptor() == null) {
                        NetworkParams.setCookieShareInterceptor(g);
                    }
                }
                NetworkParams.setApiRequestInterceptor(f50801g);
                ImageStrategyController.Init(context);
            }
            aVar = f50801g;
        }
        return aVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.connectionclass.C13949b.AbstractC13951b
    /* renamed from: a */
    public void mo51315a(ConnectionQuality connectionQuality) {
        if (Logger.debug() && connectionQuality != null) {
            Logger.m15167d("AppConfig", "onBandwidthStateChange bandwidthState = " + connectionQuality);
        }
    }

    /* renamed from: a */
    public void mo70022a(TNCManager.TNCUpdateSource tNCUpdateSource, boolean z) {
        m75598d(tNCUpdateSource, z);
    }

    /* renamed from: d */
    private void m75598d(TNCManager.TNCUpdateSource tNCUpdateSource, boolean z) {
        if (this.f50815h) {
            mo70024b(tNCUpdateSource, z);
        } else if (this.f50816i.get() <= 0) {
            try {
                new ThreadPlus("LoadDomainConfig4Other-Thread") {
                    /* class com.bytedance.ttnet.config.C20748a.C207491 */

                    @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                    public void run() {
                        C20748a.this.mo70028g();
                    }
                }.start();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m75597a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("return", str);
                jSONObject.put("CurrentShareCookieHostList", this.f50806E.toString());
            } catch (JSONException unused) {
            }
            TTNetInit.getTTNetDepend().mo69986a(TTNetInit.getTTNetDepend().mo69984a(), "handleResponse", "shareCookieHostList", jSONObject);
        }
    }

    /* renamed from: b */
    public boolean mo70024b(final TNCManager.TNCUpdateSource tNCUpdateSource, final boolean z) {
        Logger.m15167d("TNCManager", "doRefresh: updating state " + this.f50817j.get());
        if (!this.f50817j.compareAndSet(false, true)) {
            Logger.m15167d("TNCManager", "doRefresh, already running");
            return false;
        }
        new ThreadPlus("AppConfigThread") {
            /* class com.bytedance.ttnet.config.C20748a.C207502 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                C20748a.this.mo70025c(tNCUpdateSource, z);
            }
        }.start();
        return true;
    }

    private C20748a(Context context, boolean z) {
        this.f50813b = context;
        this.f50815h = z;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13969c
    /* renamed from: a */
    public String mo51370a(String str, BaseRequestContext baseRequestContext) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (this.f50815h) {
                mo70029h();
            } else {
                mo70028g();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (com.bytedance.ttnet.tnc.TNCManager.m75686a(r3.f50813b, false, com.bytedance.ttnet.tnc.TNCManager.TNCUpdateSource.PORTRETRY) != false) goto L_0x004f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70025c(com.bytedance.ttnet.tnc.TNCManager.TNCUpdateSource r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.C20748a.mo70025c(com.bytedance.ttnet.tnc.TNCManager$TNCUpdateSource, boolean):void");
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m75595a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13973g
    /* renamed from: a */
    public List<String> mo51377a(CookieManager cookieManager, C14003a aVar, URI uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (cookieManager == null && aVar == null) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        if (StringUtils.isEmpty(str) || !C20793d.m75745a(str, this.f50806E) || StringUtils.isEmpty(TTNetInit.getTTNetDepend().mo69996g())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().mo69996g());
            if (!StringUtils.isEmpty(cookie)) {
                arrayList.add(cookie);
                return arrayList;
            }
        }
        if (!Lists.isEmpty(arrayList) || aVar == null) {
            return arrayList;
        }
        try {
            Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().mo69996g()), new LinkedHashMap());
            if (map == null || map.isEmpty()) {
                return arrayList;
            }
            return map.get("Cookie");
        } catch (Throwable th) {
            th.printStackTrace();
            return arrayList;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13969c
    /* renamed from: a */
    public void mo51371a(String str, String str2, boolean z) throws IOException {
        if (!this.f50808G.isEmpty()) {
            for (String str3 : this.f50808G) {
                if (!StringUtils.isEmpty(str3) && str.endsWith(str3)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", str + str2);
                        jSONObject.put("replace", z);
                        TTNetInit.monitorLogSend("api_http", jSONObject);
                    } catch (Throwable unused) {
                    }
                    if (TTNetInit.apiHttpInterceptEnabled() && !z) {
                        throw new NotAllowApiHttpException("Api http request is not allowed to be executed");
                    }
                    return;
                }
            }
        }
    }
}
