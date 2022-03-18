package com.bytedance.ttnet.tnc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.AbstractC14025e;
import com.bytedance.frameworks.baselib.network.http.p742b.AbstractC13983a;
import com.bytedance.frameworks.baselib.network.http.p742b.C13984b;
import com.bytedance.frameworks.baselib.network.http.util.UrlBuilder;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.ttnet.AbstractC20729a;
import com.bytedance.ttnet.AbstractC20744c;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.config.C20748a;
import com.bytedance.ttnet.http.C20772a;
import com.bytedance.ttnet.http.C20773b;
import com.bytedance.ttnet.p910a.C20740b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class TNCManager implements AbstractC14025e {

    /* renamed from: c */
    private static TNCManager f50907c;

    /* renamed from: d */
    private static String f50908d;

    /* renamed from: a */
    Handler f50909a = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.ttnet.tnc.TNCManager.HandlerC207762 */

        public void handleMessage(Message message) {
            boolean z;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                TNCManager tNCManager = TNCManager.this;
                tNCManager.mo70056a(z, tNCManager.mo70053a(message.arg2));
            }
        }
    };

    /* renamed from: b */
    private long f50910b;

    /* renamed from: e */
    private boolean f50911e;

    /* renamed from: f */
    private Context f50912f;

    /* renamed from: g */
    private C20778b f50913g;

    /* renamed from: h */
    private int f50914h;

    /* renamed from: i */
    private long f50915i;

    /* renamed from: j */
    private int f50916j;

    /* renamed from: k */
    private HashMap<String, Integer> f50917k = new HashMap<>();

    /* renamed from: l */
    private HashMap<String, Integer> f50918l = new HashMap<>();

    /* renamed from: m */
    private int f50919m = 0;

    /* renamed from: n */
    private HashMap<String, Integer> f50920n = new HashMap<>();

    /* renamed from: o */
    private HashMap<String, Integer> f50921o = new HashMap<>();

    /* renamed from: p */
    private boolean f50922p = true;

    /* renamed from: b */
    private boolean m75688b(int i) {
        return i >= 200 && i < 400;
    }

    /* renamed from: a */
    static String m75680a() {
        return f50908d;
    }

    /* renamed from: d */
    public C20778b mo70058d() {
        return this.f50913g;
    }

    /* renamed from: a */
    public void mo70055a(JSONObject jSONObject, String str, String str2, boolean z) {
        boolean z2;
        C20778b bVar;
        Logger.m15167d("TNCManager", "data: " + jSONObject + " etag: " + str + " tncAttr: " + str2 + " needUpdateTnc: " + z);
        if (jSONObject == null || (bVar = this.f50913g) == null) {
            z2 = false;
        } else {
            bVar.mo70063a("");
            z2 = this.f50913g.mo70064a(jSONObject, TNCUpdateSource.TTSERVER, str, str2, System.currentTimeMillis());
        }
        if (z && !z2) {
            Logger.m15167d("TNCManager", "doUpdateRemote tnc");
            mo70056a(true, TNCUpdateSource.TTREGION);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.AbstractC14025e
    /* renamed from: a */
    public synchronized void mo51624a(Request request, Response response) {
        if (request != null && response != null) {
            if (this.f50922p) {
                if (NetworkUtils.isNetworkAvailable(this.f50912f)) {
                    HttpUrl url = request.url();
                    String scheme = url.scheme();
                    String host = url.host();
                    String encodedPath = url.encodedPath();
                    int code = response.code();
                    if (!"http".equals(scheme) && !"https".equals(scheme)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(host)) {
                        if (response.networkResponse() != null) {
                            if (Logger.debug()) {
                                Logger.m15167d("TNCManager", "onOk3Response, url: " + scheme + "://" + host + "#" + code);
                            }
                            C20777a c = mo70057c();
                            if (c != null && c.f50926b) {
                                m75684a(response, host);
                            }
                            if (c != null && c.f50925a) {
                                if (c.f50927c != null && c.f50927c.size() > 0 && c.f50927c.containsKey(host)) {
                                    if (Logger.debug()) {
                                        Logger.m15167d("TNCManager", "onOk3Response, url matched: " + scheme + "://" + host + "#" + code + " " + this.f50916j + "#" + this.f50917k.size() + "#" + this.f50918l.size() + " " + this.f50919m + "#" + this.f50920n.size() + "#" + this.f50921o.size());
                                    }
                                    if (code > 0) {
                                        if (m75688b(code)) {
                                            if (this.f50916j > 0 || this.f50919m > 0) {
                                                m75691f();
                                            }
                                        } else if (!m75689c(code)) {
                                            this.f50919m++;
                                            this.f50920n.put(encodedPath, 0);
                                            this.f50921o.put(host, 0);
                                            if (this.f50919m >= c.f50931g && this.f50920n.size() >= c.f50932h && this.f50921o.size() >= c.f50933i) {
                                                if (Logger.debug()) {
                                                    Logger.m15167d("TNCManager", "onOk3Response, url doUpdate: " + scheme + "://" + host + "#" + code);
                                                }
                                                m75685a(false, 0L, TNCUpdateSource.TTERROR);
                                                m75691f();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.AbstractC14025e
    /* renamed from: a */
    public synchronized void mo51623a(Request request, Exception exc) {
        if (request != null && exc != null) {
            if (this.f50922p) {
                if (NetworkUtils.isNetworkAvailable(this.f50912f)) {
                    HttpUrl url = request.url();
                    String scheme = url.scheme();
                    String host = url.host();
                    String encodedPath = url.encodedPath();
                    String a = m75681a(exc);
                    if (!"http".equals(scheme) && !"https".equals(scheme)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(host)) {
                        if (!TextUtils.isEmpty(a) && a.contains("timeout") && a.contains("time out") && !a.contains("unreachable")) {
                            C20777a c = mo70057c();
                            if (c != null && c.f50925a) {
                                if (c.f50927c != null && c.f50927c.size() > 0 && c.f50927c.containsKey(host)) {
                                    if (Logger.debug()) {
                                        Logger.m15167d("TNCManager", "onOk3Timeout, url matched: " + scheme + "://" + host + "#" + a + " " + this.f50916j + "#" + this.f50917k.size() + "#" + this.f50918l.size() + " " + this.f50919m + "#" + this.f50920n.size() + "#" + this.f50921o.size());
                                    }
                                    this.f50916j++;
                                    this.f50917k.put(encodedPath, 0);
                                    this.f50918l.put(host, 0);
                                    if (this.f50916j >= c.f50928d && this.f50917k.size() >= c.f50929e && this.f50918l.size() >= c.f50930f) {
                                        if (Logger.debug()) {
                                            Logger.m15167d("TNCManager", "onOk3Timeout, url doUpate: " + scheme + "://" + host);
                                        }
                                        m75685a(false, 0L, TNCUpdateSource.TTERROR);
                                        m75691f();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo70056a(boolean z, TNCUpdateSource tNCUpdateSource) {
        C20777a c = mo70057c();
        if (c != null) {
            if (Logger.debug()) {
                Logger.m15167d("TNCManager", "doUpdateRemote, " + z);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f50910b + (((long) c.f50934j) * 1000) <= elapsedRealtime) {
                this.f50910b = elapsedRealtime;
                C20748a.m75596a(this.f50912f).mo70024b(tNCUpdateSource, false);
            } else if (Logger.debug()) {
                Logger.m15167d("TNCManager", "doUpdateRemote, time limit");
            }
        }
    }

    /* renamed from: c */
    public C20777a mo70057c() {
        C20778b bVar = this.f50913g;
        if (bVar != null) {
            return bVar.mo70061a();
        }
        return null;
    }

    /* renamed from: b */
    public static synchronized TNCManager m75687b() {
        TNCManager tNCManager;
        synchronized (TNCManager.class) {
            if (f50907c == null) {
                f50907c = new TNCManager();
            }
            tNCManager = f50907c;
        }
        return tNCManager;
    }

    /* renamed from: e */
    private void m75690e() {
        SharedPreferences sharedPreferences = this.f50912f.getSharedPreferences("ttnet_tnc_config", 0);
        this.f50914h = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.f50915i = sharedPreferences.getLong("tnc_probe_version", 0);
    }

    private TNCManager() {
    }

    /* renamed from: f */
    private void m75691f() {
        if (Logger.debug()) {
            Logger.m15167d("TNCManager", "resetTNCControlState");
        }
        this.f50916j = 0;
        this.f50917k.clear();
        this.f50918l.clear();
        this.f50919m = 0;
        this.f50920n.clear();
        this.f50921o.clear();
    }

    /* renamed from: a */
    private String m75681a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().toLowerCase();
    }

    /* renamed from: a */
    private static void m75683a(UrlBuilder urlBuilder) {
        Map<String, String> a;
        AbstractC20744c tTNetDepend = TTNetInit.getTTNetDepend();
        if (!(tTNetDepend == null || !(tTNetDepend instanceof AbstractC20729a) || (a = ((AbstractC20729a) tTNetDepend).mo69974a()) == null || a.isEmpty())) {
            for (Map.Entry<String, String> entry : a.entrySet()) {
                urlBuilder.addParam(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: c */
    private boolean m75689c(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        C20777a c = mo70057c();
        if (c == null || TextUtils.isEmpty(c.f50936l)) {
            return false;
        }
        String str = c.f50936l;
        if (str.contains("" + i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m75682a(final ICronetAppProvider iCronetAppProvider) {
        String carrierRegion = iCronetAppProvider.getCarrierRegion();
        String sysRegion = iCronetAppProvider.getSysRegion();
        String region = iCronetAppProvider.getRegion();
        if (TextUtils.isEmpty(carrierRegion)) {
            if (!TextUtils.isEmpty(sysRegion)) {
                carrierRegion = sysRegion;
            } else {
                carrierRegion = region;
            }
        }
        C13984b.m56548a().mo51413a(carrierRegion, iCronetAppProvider.getStoreIdcRuleJSON(), TTNetInit.getTTNetDepend().mo69984a(), new AbstractC13983a() {
            /* class com.bytedance.ttnet.tnc.TNCManager.C207751 */

            @Override // com.bytedance.frameworks.baselib.network.http.p742b.AbstractC13983a
            /* renamed from: a */
            public void mo51409a(String str, String str2) {
                iCronetAppProvider.sendAppMonitorEvent(str, str2);
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p742b.AbstractC13983a
            /* renamed from: a */
            public void mo51410a(String str, String str2, String str3) {
                C20740b.m75544a().mo69982a(str, str2, str3);
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p742b.AbstractC13983a
            /* renamed from: a */
            public void mo51411a(JSONObject jSONObject, String str, String str2, boolean z) {
                TNCManager.m75687b().mo70055a(jSONObject, str, str2, z);
            }
        });
        if (!TextUtils.isEmpty(carrierRegion)) {
            f50908d = TTNetInit.getGetDomainConfigByRegion(carrierRegion);
        }
        if (TextUtils.isEmpty(f50908d)) {
            f50908d = iCronetAppProvider.getGetDomainDefaultJSON();
        }
        Logger.m15167d("TNCManager", "region: " + carrierRegion + " json: " + f50908d);
    }

    /* renamed from: a */
    public TNCUpdateSource mo70053a(int i) {
        if (i == 7) {
            return TNCUpdateSource.PORTRETRY;
        }
        if (i == 10) {
            return TNCUpdateSource.TTREGION;
        }
        if (i == 20) {
            return TNCUpdateSource.TTCRONET;
        }
        switch (i) {
            case -2:
                return TNCUpdateSource.TTRESUME;
            case -1:
                return TNCUpdateSource.TTHardCode;
            case 0:
                return TNCUpdateSource.TTCACHE;
            case 1:
                return TNCUpdateSource.TTSERVER;
            case 2:
                return TNCUpdateSource.TTERROR;
            case 3:
                return TNCUpdateSource.TTPOLL;
            case 4:
                return TNCUpdateSource.TTTNC;
            default:
                return TNCUpdateSource.TTSERVER;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m75684a(okhttp3.Response r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.tnc.TNCManager.m75684a(okhttp3.Response, java.lang.String):void");
    }

    /* renamed from: a */
    public synchronized void mo70054a(Context context, boolean z) {
        if (!this.f50911e) {
            this.f50912f = context;
            this.f50922p = z;
            this.f50913g = new C20778b(context, z);
            if (z) {
                m75690e();
            }
            if (Logger.debug()) {
                Logger.m15167d("TNCManager", "initTnc, isMainProc: " + z + " probeCmd: " + this.f50914h + " probeVersion: " + this.f50915i);
            }
            this.f50911e = true;
        }
    }

    public enum TNCUpdateSource {
        TTRESUME(-2),
        TTHardCode(-1),
        TTCACHE(0),
        TTSERVER(1),
        TTERROR(2),
        TTPOLL(3),
        TTTNC(4),
        PORTRETRY(7),
        TTREGION(10),
        TTCRONET(20);
        
        public final int mValue;

        private TNCUpdateSource(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: a */
    private void m75685a(boolean z, long j, TNCUpdateSource tNCUpdateSource) {
        if (!this.f50909a.hasMessages(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)) {
            Message obtainMessage = this.f50909a.obtainMessage();
            obtainMessage.what = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            obtainMessage.arg1 = z ? 1 : 0;
            obtainMessage.arg2 = tNCUpdateSource.mValue;
            if (j > 0) {
                this.f50909a.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f50909a.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    public static boolean m75686a(Context context, boolean z, TNCUpdateSource tNCUpdateSource) {
        String str;
        Logger.m15167d("TNCManager", "getdomain internal, use retrofit okhttp: " + z + ", tnc source: " + tNCUpdateSource);
        ArrayList arrayList = new ArrayList();
        if (C20748a.m75596a(context).mo70033m() == null || C20748a.m75596a(context).mo70033m().size() == 0) {
            arrayList.addAll(Arrays.asList(C20748a.m75596a(context).mo70030j()));
        } else {
            arrayList.addAll(C20748a.m75596a(context).mo70033m());
            String[] j = C20748a.m75596a(context).mo70030j();
            for (String str2 : j) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UrlBuilder urlBuilder = new UrlBuilder("https://" + ((String) it.next()) + "/get_domains/v5/");
            try {
                if (Build.VERSION.SDK_INT < 21) {
                    str = Build.CPU_ABI;
                } else {
                    str = Build.SUPPORTED_ABIS[0];
                }
                urlBuilder.addParam("abi", str);
                urlBuilder.addParam("tnc_src", tNCUpdateSource.mValue);
                urlBuilder.addParam("okhttp_version", "4.0.78.3-tudp");
                urlBuilder.addParam("ttnet_version", "4.0.78.3-tudp");
                m75683a(urlBuilder);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            C13984b.m56548a().mo51416a(hashMap);
            if (!z) {
                C20772a aVar = new C20772a();
                aVar.f50897b = urlBuilder.toString();
                aVar.f50901f = true;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String a = C20773b.m75677a(aVar.f50897b, hashMap, null, aVar);
                    aVar.f50898c = System.currentTimeMillis() - currentTimeMillis;
                    if (!StringUtils.isEmpty(a)) {
                        if (!StringUtils.isEmpty(aVar.f50903h)) {
                            C20748a.m75596a(context).mo70027d(aVar.f50903h);
                        }
                        m75687b().f50913g.mo70063a(aVar.f50904i);
                        JSONObject jSONObject = new JSONObject(a);
                        ClientKeyManager.m75584a().mo70010a(a);
                        return C20748a.m75596a(context).mo70023a(jSONObject, tNCUpdateSource, System.currentTimeMillis());
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } else {
                urlBuilder.addParam("aid", TTNetInit.getTTNetDepend().mo69999j());
                urlBuilder.addParam("device_platform", "android");
                if (TTNetInit.getCronetProvider() != null) {
                    urlBuilder.addParam("version_code", TTNetInit.getCronetProvider().getVersionCode());
                    urlBuilder.addParam("channel", TTNetInit.getCronetProvider().getChannel());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                String urlBuilder2 = urlBuilder.toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Pair<String, String> parseUrl = UrlUtils.parseUrl(urlBuilder2, linkedHashMap);
                    String str3 = (String) parseUrl.first;
                    String str4 = (String) parseUrl.second;
                    INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.createSsService(str3, INetworkApi.class);
                    if (iNetworkApi == null) {
                        continue;
                    } else {
                        Call<String> doGet = iNetworkApi.doGet(true, -1, str4, linkedHashMap, arrayList2, null);
                        try {
                            SsResponse<String> execute = doGet.execute();
                            List<Header> headers = execute.headers();
                            String body = execute.body();
                            String headerValueIgnoreCase = RetrofitUtils.getHeaderValueIgnoreCase(headers, "x-ss-etag");
                            String headerValueIgnoreCase2 = RetrofitUtils.getHeaderValueIgnoreCase(headers, "x-tt-tnc-abtest");
                            if (StringUtils.isEmpty(body)) {
                                if (doGet == null) {
                                }
                                doGet.cancel();
                            } else {
                                if (!StringUtils.isEmpty(headerValueIgnoreCase)) {
                                    C20748a.m75596a(context).mo70027d(headerValueIgnoreCase);
                                }
                                m75687b().f50913g.mo70063a(headerValueIgnoreCase2);
                                Logger.m15167d("TNCManager", "okhttp tnc response success, etag is " + headerValueIgnoreCase);
                                JSONObject jSONObject2 = new JSONObject(body);
                                ClientKeyManager.m75584a().mo70010a(body);
                                boolean a2 = C20748a.m75596a(context).mo70023a(jSONObject2, tNCUpdateSource, System.currentTimeMillis());
                                if (doGet != null) {
                                    doGet.cancel();
                                }
                                return a2;
                            }
                        } catch (Throwable th3) {
                            if (doGet != null) {
                                doGet.cancel();
                            }
                            throw th3;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
