package com.tt.miniapp.manager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.larkbrand.p651f.p652a.C13055b;
import com.bytedance.ee.larkbrand.utils.C13380x;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonParser;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.settings.v2.handler.C66802u;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.MicroSchemaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.j */
public class C66440j {

    /* renamed from: com.tt.miniapp.manager.j$c */
    public static class C66446c {

        /* renamed from: a */
        public final String f167731a;

        /* renamed from: b */
        public final JSONObject f167732b;

        /* renamed from: c */
        public final JSONObject f167733c;

        /* renamed from: d */
        private C66447a f167734d;

        /* access modifiers changed from: package-private */
        /* renamed from: com.tt.miniapp.manager.j$c$a */
        public static class C66447a {

            /* renamed from: a */
            public boolean f167735a;

            /* renamed from: b */
            public List<String> f167736b;

            /* renamed from: c */
            public List<String> f167737c;

            C66447a() {
            }
        }

        /* renamed from: a */
        public boolean mo231991a() {
            C66447a aVar = this.f167734d;
            if (aVar == null) {
                return false;
            }
            return aVar.f167735a;
        }

        /* renamed from: b */
        public List<String> mo231992b() {
            C66447a aVar = this.f167734d;
            if (aVar == null) {
                return null;
            }
            return aVar.f167737c;
        }

        /* renamed from: c */
        public List<String> mo231993c() {
            C66447a aVar = this.f167734d;
            if (aVar == null) {
                return null;
            }
            return aVar.f167736b;
        }

        private C66446c(JSONObject jSONObject) {
            this.f167731a = jSONObject.optString("method", "GET");
            this.f167732b = jSONObject.optJSONObject("header");
            this.f167733c = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject optJSONObject = jSONObject.optJSONObject("hitPrefetchExtraRules");
            if (optJSONObject != null) {
                C66447a aVar = new C66447a();
                this.f167734d = aVar;
                aVar.f167735a = optJSONObject.optBoolean("ignoreHeadersMatching");
                JSONArray optJSONArray = optJSONObject.optJSONArray("requiredStorageKeys");
                if (optJSONArray != null) {
                    this.f167734d.f167737c = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f167734d.f167737c.add(optJSONArray.optString(i));
                    }
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("requiredHeaderKeys");
                if (optJSONArray2 != null) {
                    this.f167734d.f167736b = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f167734d.f167736b.add(optJSONArray2.optString(i2));
                    }
                }
            }
        }

        /* synthetic */ C66446c(JSONObject jSONObject, RunnableC664411 r2) {
            this(jSONObject);
        }
    }

    /* renamed from: a */
    public static boolean m259738a() {
        return ProcessUtil.isMiniappProcess() && HostDependManager.getInst().getFeatureGating("bdp_startpage_prefetch.enable");
    }

    /* renamed from: a */
    public static void m259735a(C66450f fVar, String str, IAppContext iAppContext) {
        m259723a(iAppContext).f167725d.put(str, fVar);
    }

    /* renamed from: a */
    public static void m259731a(Context context, String str) {
        AppBrandLogger.m52828d("PreTTRequestManager", "clearing", str);
        if (!TextUtils.isEmpty(str)) {
            C12899a.m53203a(context, "config_prefetch").edit().remove(str + "prefetch_info").apply();
        }
    }

    /* renamed from: a */
    public static void m259737a(String str, String str2, IAppContext iAppContext) {
        if (str2.equals("no_prefetch")) {
            m259735a((C66450f) null, str, iAppContext);
            return;
        }
        try {
            m259735a(C66450f.m259758a(new JSONObject(str2)), str, iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("PreTTRequestManager", e);
        }
    }

    /* renamed from: a */
    public static void m259733a(Context context, String str, String str2) {
        C12899a.m53203a(context, "config_prefetch").edit().putString(str + "prefetch_info", str2).apply();
    }

    /* renamed from: a */
    public static void m259732a(final Context context, final String str, final IAppContext iAppContext, boolean z) {
        C66444a a = m259723a(iAppContext);
        if (a.f167726e || !m259738a()) {
            AppBrandLogger.m52828d("PreTTRequestManager", "prefetch not enable，fetched:" + a.f167726e);
        } else if (!m259723a(iAppContext).f167726e && str != null) {
            C67866g.m264026a(new Action() {
                /* class com.tt.miniapp.manager.C66440j.C664433 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    MicroSchemaEntity a = C66451k.m259761a(str);
                    if (a != null) {
                        String appId = a.getAppId();
                        String path = a.getPath();
                        C66450f a2 = C66440j.m259724a(context, appId, iAppContext);
                        if (a2 == null) {
                            AppBrandLogger.m52828d("PreTTRequestManager", "prefetch info is null do not prefetch ...");
                            return;
                        }
                        if (TextUtils.isEmpty(path)) {
                            path = a2.f167749a;
                            AppBrandLogger.m52828d("PreTTRequestManager", "use entry path", path);
                        }
                        C66440j.m259730a(context, a2, path, a.getQuery(), iAppContext);
                    }
                }
            }, C67554l.m262725b(), z);
        }
    }

    /* renamed from: a */
    public static synchronized void m259730a(Context context, C66450f fVar, String str, Map<String, Object> map, IAppContext iAppContext) {
        synchronized (C66440j.class) {
            C66444a a = m259723a(iAppContext);
            if (!a.f167726e) {
                if (str == null) {
                    AppBrandLogger.m52829e("PreTTRequestManager", "path is null ????");
                    return;
                }
                a.f167726e = true;
                ArrayList<String> arrayList = fVar.f167750b.get(str);
                AppBrandLogger.m52828d("PreTTRequestManager", "doPrefetch ...", map, arrayList);
                VConsoleManager vConsoleManager = (VConsoleManager) AppbrandApplicationImpl.getInst(iAppContext).getService(VConsoleManager.class);
                if (vConsoleManager != null && vConsoleManager.isVConsoleSwitchOn()) {
                    List<String> a2 = m259723a(iAppContext).mo231990a(iAppContext.getAppId());
                    m259736a("prefetch setting:" + a2, iAppContext);
                }
                if (arrayList != null && arrayList.size() > 0) {
                    if (a.f167723b == null) {
                        a.f167723b = m259727a(Integer.MAX_VALUE, iAppContext);
                    }
                    Pattern compile = Pattern.compile("\\$\\{([^}]*)\\}");
                    for (String str2 : arrayList) {
                        String a3 = m259725a(iAppContext, str2, compile, map, (List<String>) null);
                        if (a3 != null) {
                            RunnableC66449e eVar = new RunnableC66449e(iAppContext, a3, null, false, null);
                            eVar.f167744a = 1;
                            a.f167723b.execute(eVar);
                        } else {
                            AppBrandLogger.m52829e("PreTTRequestManager", "prefetchUrl not match:" + str2);
                        }
                    }
                }
                Map<String, C66446c> map2 = fVar.f167751c.get(str);
                if (map2 != null && map2.size() > 0) {
                    if (a.f167723b == null) {
                        a.f167723b = m259727a(Integer.MAX_VALUE, iAppContext);
                    }
                    for (Map.Entry<String, C66446c> entry : map2.entrySet()) {
                        m259734a(iAppContext, a.f167723b, entry.getKey(), entry.getValue(), map);
                    }
                }
                Map<String, List<C66446c>> map3 = fVar.f167752d.get(str);
                if (map3 != null && map3.size() > 0) {
                    for (Map.Entry<String, List<C66446c>> entry2 : map3.entrySet()) {
                        String key = entry2.getKey();
                        List<C66446c> value = entry2.getValue();
                        if (value != null && !value.isEmpty()) {
                            if (a.f167723b == null) {
                                a.f167723b = m259727a(Integer.MAX_VALUE, iAppContext);
                            }
                            for (C66446c cVar : value) {
                                m259734a(iAppContext, a.f167723b, key, cVar, map);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m259734a(IAppContext iAppContext, ThreadPoolExecutor threadPoolExecutor, String str, C66446c cVar, Map<String, Object> map) {
        String str2;
        Pattern compile = Pattern.compile("\\$\\{([^}]*)\\}");
        AppBrandLogger.m52830i("PreTTRequestManager", "try doPrefetch:" + str);
        String a = m259725a(iAppContext, str, compile, map, cVar.mo231992b());
        if (a == null) {
            AppBrandLogger.m52830i("PreTTRequestManager", "url not match pattern");
            m259736a("prefetch url not match:" + str, iAppContext);
            return;
        }
        String str3 = null;
        if (cVar.f167732b != null) {
            str2 = m259725a(iAppContext, cVar.f167732b.toString(), compile, map, cVar.mo231992b());
            if (str2 == null) {
                AppBrandLogger.m52830i("PreTTRequestManager", "header not match pattern");
                m259736a("prefetch header not match pattern:" + str, iAppContext);
                return;
            }
        } else {
            str2 = null;
        }
        if (cVar.f167733c != null) {
            String a2 = m259725a(iAppContext, cVar.f167733c.toString(), compile, map, cVar.mo231992b());
            if (a2 == null) {
                AppBrandLogger.m52830i("PreTTRequestManager", "data not match pattern");
                m259736a("prefetch data not match pattern:" + str, iAppContext);
                return;
            }
            str3 = a2;
        }
        if ("GET".equalsIgnoreCase(cVar.f167731a)) {
            if (str3 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (!TextUtils.isEmpty(optString)) {
                            a = C13380x.m54429a(a, next, optString);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            AppBrandLogger.m52830i("PreTTRequestManager", "request url:" + a);
            RunnableC66449e eVar = new RunnableC66449e(iAppContext, a, str2, cVar.mo231991a(), cVar.mo231993c());
            eVar.f167744a = 1;
            threadPoolExecutor.execute(eVar);
        } else if ("POST".equalsIgnoreCase(cVar.f167731a)) {
            RunnableC66449e eVar2 = new RunnableC66449e(iAppContext, a, str2, str3, cVar.mo231991a(), cVar.mo231993c());
            eVar2.f167744a = 1;
            threadPoolExecutor.execute(eVar2);
        }
    }

    /* renamed from: a */
    private static boolean m259740a(List<String> list, List<String> list2, String str) {
        if (list != null && list.contains(str)) {
            AppBrandLogger.m52830i("PreTTRequestManager", "setting storage key match:" + str);
            return true;
        } else if (list2 == null || !list2.contains(str)) {
            return false;
        } else {
            AppBrandLogger.m52830i("PreTTRequestManager", "config storage key match:" + str);
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m259739a(IAppContext iAppContext, String str) {
        return ((AbstractC12910a) iAppContext.findServiceByInterface(AbstractC12910a.class)).mo48697b(str) != null;
    }

    /* renamed from: a */
    public static void m259736a(Object obj, IAppContext iAppContext) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method", "log");
            jSONObject.put("msg", obj);
            jSONArray.put(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.m52830i("PreTTRequestManager", e);
        }
        AppBrandLogger.m52828d("PreTTRequestManager", jSONArray);
        C67049n.m261313a(jSONArray, iAppContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.manager.j$e */
    public static class RunnableC66449e implements Comparable<RunnableC66449e>, Runnable {

        /* renamed from: a */
        int f167744a = 1;

        /* renamed from: b */
        public C66448d f167745b;

        /* renamed from: c */
        C12830f f167746c;

        /* renamed from: d */
        volatile boolean f167747d;

        /* renamed from: e */
        private IAppContext f167748e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo231998a() {
            synchronized (this) {
                this.f167747d = true;
                try {
                    wait();
                } catch (InterruptedException e) {
                    AppBrandLogger.m52831w("PreTTRequestManager", e);
                }
            }
        }

        public void run() {
            PriorityBlockingQueue<Runnable> priorityBlockingQueue = C66440j.m259723a(this.f167748e).f167724c;
            priorityBlockingQueue.add(this);
            AppBrandLogger.m52828d("PreTTRequestManager", "begin request:", this.f167745b.f167738a, "method:" + this.f167745b.f167739b, "ignoreHeader:" + this.f167745b.f167742e);
            try {
                C66440j.m259736a("start prefetch..." + this.f167745b.f167738a, this.f167748e);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeStamp", System.currentTimeMillis());
                jSONObject.put("url", this.f167745b.f167738a);
                C12830f a = C13055b.m53547a(this.f167748e).mo49095a(C12804c.m52892a(), this.f167745b.f167738a, this.f167745b.f167740c, null, this.f167745b.f167741d, this.f167745b.f167739b, C12805d.m52894a(AppbrandContext.getInst().getTracing(), true, this.f167748e));
                this.f167746c = a;
                if (a.mo48463b() == 200) {
                    C66440j.m259723a(this.f167748e).f167722a.put(this.f167745b, this.f167746c);
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f167746c.mo48466d());
                } else {
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "error:" + this.f167746c.mo48468f().toString());
                    jSONObject.put("code", "error code:" + this.f167746c.mo48463b());
                }
                C66440j.m259736a(jSONObject, this.f167748e);
                priorityBlockingQueue.remove(this);
                synchronized (this) {
                    if (this.f167747d) {
                        notifyAll();
                        this.f167747d = false;
                    }
                }
            } catch (Exception e) {
                try {
                    AppBrandLogger.m52829e("PreTTRequestManager", e);
                    priorityBlockingQueue.remove(this);
                    synchronized (this) {
                        if (this.f167747d) {
                            notifyAll();
                            this.f167747d = false;
                        }
                    }
                } catch (Throwable th) {
                    priorityBlockingQueue.remove(this);
                    synchronized (this) {
                        if (this.f167747d) {
                            notifyAll();
                            this.f167747d = false;
                        }
                        throw th;
                    }
                }
            }
        }

        /* renamed from: a */
        public int compareTo(RunnableC66449e eVar) {
            int i = this.f167744a;
            int i2 = eVar.f167744a;
            if (i > i2) {
                return -1;
            }
            if (i < i2) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        private String m259755a(String str) {
            if (str == null) {
                return "{\"content-type\":\"application\\/json\"}";
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.opt("content-type") == null) {
                    jSONObject.put("content-type", "application/json");
                    return jSONObject.toString();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return str;
        }

        public RunnableC66449e(IAppContext iAppContext, String str, String str2, boolean z, List<String> list) {
            this.f167748e = iAppContext;
            C66448d dVar = new C66448d(str, m259755a(str2));
            this.f167745b = dVar;
            dVar.mo231995a(z);
            this.f167745b.mo231994a(list);
        }

        public RunnableC66449e(IAppContext iAppContext, String str, String str2, String str3, boolean z, List<String> list) {
            this.f167748e = iAppContext;
            C66448d dVar = new C66448d(str, m259755a(str2), str3);
            this.f167745b = dVar;
            dVar.mo231995a(z);
            this.f167745b.mo231994a(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.manager.j$1 */
    public static class RunnableC664411 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ File f167708a;

        /* renamed from: b */
        final /* synthetic */ IAppContext f167709b;

        /* renamed from: c */
        final /* synthetic */ Context f167710c;

        /* renamed from: d */
        final /* synthetic */ String f167711d;

        public void run() {
            boolean z;
            try {
                JSONObject jSONObject = new JSONObject(C66440j.m259726a(this.f167708a, this.f167709b));
                String optString = jSONObject.optString("entryPagePath");
                JSONObject optJSONObject = jSONObject.optJSONObject("prefetches");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("prefetchRules");
                if ((optJSONObject == null || optJSONObject.length() <= 0) && (optJSONObject2 == null || optJSONObject2.length() <= 0)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || TextUtils.isEmpty(optString)) {
                    C66440j.m259729a(this.f167710c, (C66450f) null, this.f167711d);
                    return;
                }
                C66440j.m259729a(this.f167710c, C66450f.m259759a(optJSONObject, optJSONObject2, optString), this.f167711d);
            } catch (Exception e) {
                AppBrandLogger.m52831w("PreTTRequestManager", e);
            }
        }
    }

    /* renamed from: com.tt.miniapp.manager.j$a */
    public static class C66444a {

        /* renamed from: a */
        public ConcurrentHashMap<C66448d, C12830f> f167722a = new ConcurrentHashMap<>();

        /* renamed from: b */
        public volatile ThreadPoolExecutor f167723b;

        /* renamed from: c */
        public PriorityBlockingQueue<Runnable> f167724c = new PriorityBlockingQueue<>();

        /* renamed from: d */
        public HashMap<String, C66450f> f167725d = new HashMap<>();

        /* renamed from: e */
        public volatile boolean f167726e = false;

        /* renamed from: f */
        private HashMap<String, String> f167727f = new HashMap<>();

        /* renamed from: g */
        private List<String> f167728g;

        /* renamed from: a */
        public HashMap<String, String> mo231989a() {
            if (this.f167727f.size() == 0 && HostExtensionManager.getInstance().getHostInterface() != null) {
                this.f167727f.put("deviceId", HostExtensionManager.getInstance().getHostInterface().getDeviceId());
                this.f167727f.put("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                this.f167727f.put("timeZoneOffset", String.valueOf(((TimeZone.getDefault().getRawOffset() / 60) / 60) / 1000));
                this.f167727f.put("locale", C67479c.m262467a().mo234230c().toString());
            }
            return this.f167727f;
        }

        /* renamed from: a */
        public List<String> mo231990a(String str) {
            if (this.f167728g == null && str != null) {
                this.f167728g = new ArrayList();
                String b = C66802u.m260678a().mo232710b();
                if (b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(b);
                        if (jSONObject.has("prefetchStorageConfig")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("prefetchStorageConfig");
                            if (jSONObject2.has(str)) {
                                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    this.f167728g.add(jSONArray.getString(i));
                                }
                            }
                        }
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("PreTTRequestManager", "parse prefetchStorageConfig", e);
                    }
                }
            }
            return this.f167728g;
        }
    }

    /* renamed from: com.tt.miniapp.manager.j$f */
    public static class C66450f {

        /* renamed from: a */
        public String f167749a = "";

        /* renamed from: b */
        LinkedHashMap<String, ArrayList<String>> f167750b = new LinkedHashMap<>();

        /* renamed from: c */
        LinkedHashMap<String, Map<String, C66446c>> f167751c = new LinkedHashMap<>();

        /* renamed from: d */
        LinkedHashMap<String, Map<String, List<C66446c>>> f167752d = new LinkedHashMap<>();

        /* renamed from: e */
        private JSONObject f167753e;

        /* renamed from: f */
        private JSONObject f167754f;

        /* renamed from: a */
        public JSONObject mo232001a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("entryPath", this.f167749a);
                JSONObject jSONObject2 = this.f167753e;
                if (jSONObject2 != null) {
                    jSONObject.put("prefetches", jSONObject2);
                }
                JSONObject jSONObject3 = this.f167754f;
                if (jSONObject3 != null) {
                    jSONObject.put("prefetchRules", jSONObject3);
                }
            } catch (Exception e) {
                AppBrandLogger.m52828d("PreTTRequestManager", e);
            }
            return jSONObject;
        }

        /* renamed from: a */
        static C66450f m259758a(JSONObject jSONObject) {
            try {
                return m259759a(jSONObject.getJSONObject("prefetches"), jSONObject.getJSONObject("prefetchRules"), jSONObject.getString("entryPath"));
            } catch (JSONException e) {
                AppBrandLogger.m52828d("PreTTRequestManager", e);
                return null;
            }
        }

        /* renamed from: a */
        static C66450f m259759a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            C66450f fVar = new C66450f();
            fVar.f167749a = str;
            if (jSONObject != null) {
                fVar.f167753e = jSONObject;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            String optString = optJSONArray.optString(i);
                            if (!TextUtils.isEmpty(optString)) {
                                arrayList.add(optString);
                            }
                        }
                        fVar.f167750b.put(next, arrayList);
                    }
                }
            }
            if (jSONObject2 != null) {
                fVar.f167754f = jSONObject2;
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    JSONObject optJSONObject = jSONObject2.optJSONObject(next2);
                    if (optJSONObject != null) {
                        C66445b a = C66445b.m259745a(optJSONObject);
                        if (a.f167729a != null) {
                            fVar.f167751c.put(next2, a.f167729a);
                        }
                        if (a.f167730b != null) {
                            fVar.f167752d.put(next2, a.f167730b);
                        }
                    }
                }
            }
            return fVar;
        }
    }

    /* renamed from: com.tt.miniapp.manager.j$d */
    public static class C66448d {

        /* renamed from: a */
        String f167738a;

        /* renamed from: b */
        String f167739b;

        /* renamed from: c */
        String f167740c;

        /* renamed from: d */
        String f167741d;

        /* renamed from: e */
        boolean f167742e;

        /* renamed from: f */
        List<String> f167743f;

        /* renamed from: a */
        public void mo231994a(List<String> list) {
            this.f167743f = list;
        }

        /* renamed from: a */
        public void mo231995a(boolean z) {
            this.f167742e = z;
        }

        /* renamed from: a */
        private boolean m259749a(String str) {
            List<String> list = this.f167743f;
            if (list != null && !list.isEmpty()) {
                if (str == null) {
                    if (this.f167741d == null) {
                        return true;
                    }
                    return false;
                } else if (this.f167741d == null) {
                    return false;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f167741d);
                        JSONObject jSONObject2 = new JSONObject(str);
                        boolean z = false;
                        for (String str2 : this.f167743f) {
                            if (jSONObject.has(str2)) {
                                if (!TextUtils.equals(jSONObject2.getString(str2), jSONObject.getString(str2))) {
                                    return false;
                                }
                                z = true;
                            }
                        }
                        if (z) {
                            return true;
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo231996a(C66448d dVar) {
            if (!dVar.f167739b.equals(this.f167739b) || !m259750a(this.f167738a, dVar.f167738a)) {
                return false;
            }
            if (!this.f167742e && !m259749a(dVar.f167741d) && !m259751b(this.f167741d, dVar.f167741d)) {
                return false;
            }
            if ("POST".equals(this.f167739b)) {
                return m259751b(this.f167740c, dVar.f167740c);
            }
            return true;
        }

        public C66448d(String str, String str2) {
            this.f167739b = "GET";
            this.f167738a = str;
            this.f167741d = str2;
        }

        /* renamed from: b */
        private boolean m259751b(String str, String str2) {
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
                return false;
            } else if (str2 == null) {
                return false;
            } else {
                try {
                    JsonParser jsonParser = new JsonParser();
                    return jsonParser.parse(str).equals(jsonParser.parse(str2));
                } catch (Exception unused) {
                    return false;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[Catch:{ Exception -> 0x005e }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m259750a(java.lang.String r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r6.length()
                int r7 = r7.length()
                r1 = 0
                if (r0 == r7) goto L_0x000c
                return r1
            L_0x000c:
                android.net.Uri r7 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x005e }
                android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x005e }
                java.lang.String r0 = r7.getHost()     // Catch:{ Exception -> 0x005e }
                java.lang.String r2 = r6.getHost()     // Catch:{ Exception -> 0x005e }
                boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch:{ Exception -> 0x005e }
                if (r0 != 0) goto L_0x0023
                return r1
            L_0x0023:
                java.util.Set r0 = r7.getQueryParameterNames()     // Catch:{ Exception -> 0x005e }
                java.util.Set r2 = r6.getQueryParameterNames()     // Catch:{ Exception -> 0x005e }
                int r3 = r0.size()     // Catch:{ Exception -> 0x005e }
                int r4 = r2.size()     // Catch:{ Exception -> 0x005e }
                if (r3 == r4) goto L_0x0036
                return r1
            L_0x0036:
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x005e }
            L_0x003a:
                boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x005e }
                if (r3 == 0) goto L_0x005c
                java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x005e }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x005e }
                boolean r4 = r2.contains(r3)     // Catch:{ Exception -> 0x005e }
                if (r4 != 0) goto L_0x004d
                return r1
            L_0x004d:
                java.lang.String r4 = r7.getQueryParameter(r3)     // Catch:{ Exception -> 0x005e }
                java.lang.String r3 = r6.getQueryParameter(r3)     // Catch:{ Exception -> 0x005e }
                boolean r3 = android.text.TextUtils.equals(r4, r3)     // Catch:{ Exception -> 0x005e }
                if (r3 != 0) goto L_0x003a
                return r1
            L_0x005c:
                r6 = 1
                return r6
            L_0x005e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.manager.C66440j.C66448d.m259750a(java.lang.String, java.lang.String):boolean");
        }

        public C66448d(String str, String str2, String str3) {
            this.f167739b = "POST";
            this.f167738a = str;
            this.f167741d = str2;
            this.f167740c = str3;
        }

        public C66448d(String str, String str2, String str3, String str4) {
            this.f167738a = str;
            this.f167739b = str2;
            this.f167740c = str3;
            this.f167741d = str4;
        }
    }

    /* renamed from: a */
    public static C66444a m259723a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170180g;
    }

    /* renamed from: com.tt.miniapp.manager.j$b */
    public static class C66445b {

        /* renamed from: a */
        public Map<String, C66446c> f167729a;

        /* renamed from: b */
        public Map<String, List<C66446c>> f167730b;

        /* renamed from: a */
        public static C66445b m259745a(JSONObject jSONObject) {
            C66445b bVar = new C66445b();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    C66446c cVar = new C66446c((JSONObject) opt, null);
                    if (bVar.f167729a == null) {
                        bVar.f167729a = new HashMap();
                    }
                    bVar.f167729a.put(next, cVar);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() > 0) {
                        if (bVar.f167730b == null) {
                            bVar.f167730b = new HashMap();
                        }
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add(new C66446c(jSONArray.optJSONObject(i), null));
                        }
                        bVar.f167730b.put(next, arrayList);
                    }
                }
            }
            return bVar;
        }
    }

    /* renamed from: c */
    private static String m259742c(Context context, String str) {
        return C12899a.m53203a(context, "config_prefetch").getString(str + "prefetch_info", "");
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m259727a(int i, IAppContext iAppContext) {
        return new ThreadPoolExecutor(0, i, 30, TimeUnit.SECONDS, new SynchronousQueue(true), C67866g.m264024a("TmaTTPrefetch Dispatcher", false));
    }

    /* renamed from: b */
    private static C66450f m259741b(Context context, String str) {
        try {
            String c = m259742c(context, str);
            if (TextUtils.isEmpty(c) || c.equals("no_prefetch")) {
                return null;
            }
            return C66450f.m259758a(new JSONObject(c));
        } catch (Exception e) {
            AppBrandLogger.m52828d("PreTTRequestManager", "getPrefetchInfoFromLocal error", e.toString());
        }
        return null;
    }

    /* renamed from: a */
    public static C12830f m259722a(C66448d dVar, IAppContext iAppContext) {
        if (!m259738a()) {
            return null;
        }
        if (!("GET".equals(dVar.f167739b) || "POST".equals(dVar.f167739b))) {
            return null;
        }
        C66444a a = m259723a(iAppContext);
        for (Map.Entry<C66448d, C12830f> entry : a.f167722a.entrySet()) {
            if (entry.getKey().mo231996a(dVar)) {
                return entry.getValue();
            }
        }
        Iterator<Runnable> it = a.f167724c.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            if (next instanceof RunnableC66449e) {
                RunnableC66449e eVar = (RunnableC66449e) next;
                if (eVar.f167745b.mo231996a(dVar)) {
                    eVar.mo231998a();
                    if (eVar.f167746c.mo48468f() == null) {
                        return eVar.f167746c;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m259726a(java.io.File r8, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r9) {
        /*
            com.tt.miniapp.ttapkgdecoder.b.d r9 = new com.tt.miniapp.ttapkgdecoder.b.d
            r9.<init>(r8)
            r8 = 0
            r0 = 0
            com.tt.refer.common.pkg.i r1 = new com.tt.refer.common.pkg.i     // Catch:{ all -> 0x004a }
            r1.<init>(r9)     // Catch:{ all -> 0x004a }
            boolean r2 = r1.mo235456a()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0044
            r1.mo235461f()     // Catch:{ all -> 0x0048 }
            com.tt.miniapp.ttapkgdecoder.TTAPkgInfo r2 = r1.mo235460e()     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "app-config.json"
            com.tt.miniapp.ttapkgdecoder.TTAPkgFile r2 = r2.findFile(r3)     // Catch:{ all -> 0x0048 }
            int r3 = r2.getSize()     // Catch:{ all -> 0x0048 }
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0048 }
            int r4 = r2.getOffset()     // Catch:{ all -> 0x0048 }
            long r4 = (long) r4     // Catch:{ all -> 0x0048 }
            long r6 = r1.mo235459d()     // Catch:{ all -> 0x0048 }
            long r4 = r4 - r6
            int r5 = (int) r4     // Catch:{ all -> 0x0048 }
            long r4 = (long) r5     // Catch:{ all -> 0x0048 }
            r9.mo233016b(r4)     // Catch:{ all -> 0x0048 }
            int r2 = r2.getSize()     // Catch:{ all -> 0x0048 }
            r9.mo233013a(r3, r8, r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0048 }
            r9.<init>(r3)     // Catch:{ all -> 0x0048 }
            r1.mo235457b()
            return r9
        L_0x0044:
            r1.mo235457b()
            goto L_0x0059
        L_0x0048:
            r9 = move-exception
            goto L_0x004c
        L_0x004a:
            r9 = move-exception
            r1 = r0
        L_0x004c:
            java.lang.String r2 = "PreTTRequestManager"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005a }
            r3[r8] = r9     // Catch:{ all -> 0x005a }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r2, r3)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0059
            goto L_0x0044
        L_0x0059:
            return r0
        L_0x005a:
            r8 = move-exception
            if (r1 == 0) goto L_0x0060
            r1.mo235457b()
        L_0x0060:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.manager.C66440j.m259726a(java.io.File, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized C66450f m259724a(Context context, String str, IAppContext iAppContext) {
        C66450f fVar;
        synchronized (C66440j.class) {
            fVar = m259723a(iAppContext).f167725d.get(str);
            if (fVar == null) {
                fVar = m259741b(context, str);
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public static void m259729a(Context context, C66450f fVar, String str) {
        if (fVar != null) {
            m259733a(context, str, fVar.mo232001a().toString());
        } else {
            m259733a(context, str, "no_prefetch");
        }
    }

    /* renamed from: a */
    private static String m259725a(IAppContext iAppContext, String str, Pattern pattern, Map<String, Object> map, List<String> list) {
        Matcher matcher = pattern.matcher(str);
        if (str.contains("${")) {
            HashMap<String, String> a = m259723a(iAppContext).mo231989a();
            List<String> a2 = m259723a(iAppContext).mo231990a(iAppContext.getAppId());
            while (matcher.find()) {
                String group = matcher.group();
                String group2 = matcher.group(1);
                if (map != null && map.get(group2) != null) {
                    str = str.replace(group, map.get(group2).toString());
                } else if (m259740a(a2, list, group2) && m259739a(iAppContext, group2)) {
                    str = str.replace(group, ((AbstractC12910a) iAppContext.findServiceByInterface(AbstractC12910a.class)).mo48697b(group2));
                } else if (a == null || a.get(group2) == null) {
                    return null;
                } else {
                    str = str.replace(group, a.get(group2));
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m259728a(final Context context, final AppConfig appConfig, final String str, final String str2, final IAppContext iAppContext) {
        if (m259738a()) {
            final JSONObject h = appConfig.mo230047h();
            final JSONObject i = appConfig.mo230048i();
            if (DebugUtil.debug()) {
                AppBrandLogger.m52828d("PreTTRequestManager", "saveAndStartPrefetch", str, h, i);
            }
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.manager.C66440j.C664422 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    boolean z;
                    JSONObject jSONObject;
                    JSONObject jSONObject2 = h;
                    if ((jSONObject2 == null || jSONObject2.length() <= 0) && ((jSONObject = i) == null || jSONObject.length() <= 0)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z || TextUtils.isEmpty(appConfig.f165497d)) {
                        C66440j.m259729a(context, (C66450f) null, str);
                        return;
                    }
                    C66450f a = C66450f.m259759a(h, i, appConfig.f165497d);
                    C66440j.m259735a(a, str, iAppContext);
                    C66440j.m259732a(context, str2, iAppContext, false);
                    C66440j.m259729a(context, a, str);
                }
            }, C67554l.m262725b());
        }
    }
}
