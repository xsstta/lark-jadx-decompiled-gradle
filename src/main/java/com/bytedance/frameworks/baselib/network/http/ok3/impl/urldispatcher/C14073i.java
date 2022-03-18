package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import com.bytedance.frameworks.baselib.network.http.util.C14088f;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i */
public class C14073i {

    /* renamed from: a */
    static final /* synthetic */ boolean f36978a = true;

    /* renamed from: b */
    private static final String f36979b = "i";

    /* renamed from: c */
    private static volatile C14073i f36980c;

    /* renamed from: p */
    private static AtomicBoolean f36981p = new AtomicBoolean(false);

    /* renamed from: d */
    private Context f36982d;

    /* renamed from: e */
    private AtomicBoolean f36983e = new AtomicBoolean(f36978a);

    /* renamed from: f */
    private AtomicLong f36984f = new AtomicLong(0);

    /* renamed from: g */
    private List<AbstractC14072h> f36985g = new ArrayList();

    /* renamed from: h */
    private final ReentrantReadWriteLock f36986h = new ReentrantReadWriteLock();

    /* renamed from: i */
    private List<C14066b> f36987i = new ArrayList();

    /* renamed from: j */
    private final ReentrantReadWriteLock f36988j = new ReentrantReadWriteLock();

    /* renamed from: k */
    private AtomicInteger f36989k = new AtomicInteger(0);

    /* renamed from: l */
    private AtomicLong f36990l = new AtomicLong(0);

    /* renamed from: m */
    private ConcurrentMap<String, String> f36991m = new ConcurrentHashMap();

    /* renamed from: n */
    private String f36992n;

    /* renamed from: o */
    private String f36993o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i$a */
    public static class C14074a implements Comparator<BaseDispatchAction> {
        C14074a() {
        }

        /* renamed from: a */
        public int compare(BaseDispatchAction baseDispatchAction, BaseDispatchAction baseDispatchAction2) {
            return baseDispatchAction.mo51732a() - baseDispatchAction2.mo51732a();
        }
    }

    /* renamed from: b */
    public Context mo51754b() {
        return this.f36982d;
    }

    /* renamed from: h */
    public String mo51761h() {
        return this.f36992n;
    }

    /* renamed from: i */
    public String mo51762i() {
        return this.f36993o;
    }

    /* renamed from: j */
    public ConcurrentMap<String, String> mo51763j() {
        return this.f36991m;
    }

    /* renamed from: d */
    public boolean mo51757d() {
        return this.f36985g.isEmpty();
    }

    /* renamed from: e */
    public long mo51758e() {
        return this.f36984f.get();
    }

    /* renamed from: f */
    public int mo51759f() {
        return this.f36989k.get();
    }

    /* renamed from: g */
    public long mo51760g() {
        return this.f36990l.get();
    }

    /* renamed from: c */
    public boolean mo51756c() {
        return this.f36987i.isEmpty() ^ f36978a;
    }

    /* renamed from: a */
    public static C14073i m56967a() {
        if (f36980c == null) {
            synchronized (C14073i.class) {
                if (f36980c == null) {
                    f36980c = new C14073i();
                }
            }
        }
        return f36980c;
    }

    /* renamed from: a */
    public void mo51752a(Context context) {
        this.f36982d = context;
    }

    /* renamed from: a */
    public C14068d mo51750a(C14075j jVar) {
        String str = f36979b;
        Logger.m15167d(str, "getDispatchResultForUrl: " + jVar.mo51768b());
        if (!UrlUtils.isValidUrl(jVar.mo51768b())) {
            Logger.m15167d(str, "illegal url");
            return null;
        } else if (this.f36983e.get()) {
            return m56969b(jVar);
        } else {
            Logger.m15167d(str, "dispatch is unabled by tnc");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m56970b(org.json.JSONObject r19) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i.m56970b(org.json.JSONObject):void");
    }

    /* renamed from: a */
    private void m56968a(JSONObject jSONObject) {
        int optInt;
        JSONObject optJSONObject;
        String optString = jSONObject.optString("action");
        if (!TextUtils.isEmpty(optString) && (optInt = jSONObject.optInt("act_priority", -1)) >= 0 && (optJSONObject = jSONObject.optJSONObject("param")) != null) {
            String optString2 = jSONObject.optString("lifecycle");
            long j = 0;
            long j2 = -1;
            if ("".equals(optString2)) {
                j2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                if (C14088f.m57043a(optString2, arrayList) && arrayList.size() == 2) {
                    j = ((Long) arrayList.get(0)).longValue();
                    j2 = ((Long) arrayList.get(1)).longValue();
                } else {
                    j = -1;
                }
            }
            long optInt2 = (long) jSONObject.optInt("rule_id");
            String optString3 = jSONObject.optString("sign");
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("request_method");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString4 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString4)) {
                        arrayList2.add(optString4);
                    }
                }
            }
            BaseDispatchAction a = BaseDispatchAction.m56925a(optString, optJSONObject, optInt, j, j2, optInt2, optString3, this.f36984f.get(), arrayList2, jSONObject.optInt("set_req_priority", optInt));
            if (a instanceof AbstractC14072h) {
                this.f36985g.add((AbstractC14072h) a);
            }
        }
    }

    /* renamed from: b */
    public void mo51755b(Context context) {
        if (C14089g.m57048b(context) && !f36981p.get()) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ttnet_tnc_config", 0);
            String string = sharedPreferences.getString("tnc_config_str", null);
            String string2 = sharedPreferences.getString("ttnet_tnc_etag", null);
            String string3 = sharedPreferences.getString("ttnet_tnc_abtest", null);
            try {
                if (!TextUtils.isEmpty(string)) {
                    m56967a().mo51753a(new JSONObject(string), 0, string2, string3, System.currentTimeMillis());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            f36981p.set(f36978a);
        }
    }

    /* renamed from: b */
    private C14068d m56969b(C14075j jVar) {
        String b = jVar.mo51768b();
        C14068d dVar = new C14068d();
        ArrayList<C14067c> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, b);
        this.f36986h.readLock().lock();
        Iterator<AbstractC14072h> it = this.f36985g.iterator();
        String str = b;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC14072h next = it.next();
            String str2 = f36979b;
            Logger.m15167d(str2, "action url = " + arrayList2);
            Logger.m15167d(str2, "current action priority is " + next.mo51732a());
            BaseDispatchAction.DispatchResultEnum a = next.mo51747a(jVar, str, arrayList2, arrayList);
            String str3 = (String) arrayList2.get(0);
            if (a == BaseDispatchAction.DispatchResultEnum.DISPATCH_DROP) {
                Logger.m15167d(str2, "the url has been dropped by urldispatcher, skip follow-up actions");
                if (!f36978a && ((String) arrayList2.get(0)).length() != 0) {
                    throw new AssertionError();
                }
            } else {
                str = str3;
            }
        }
        String str4 = (String) arrayList2.get(0);
        this.f36986h.readLock().unlock();
        ArrayList arrayList3 = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("origin_url", b);
            jSONObject.put("dispatched_url", str4);
            JSONArray jSONArray = new JSONArray();
            for (C14067c cVar : arrayList) {
                if (cVar.f36956d) {
                    JSONObject jSONObject2 = new JSONObject();
                    arrayList3.add(Long.valueOf(cVar.f36954b));
                    jSONObject2.put("rule_id", cVar.f36954b);
                    jSONObject2.put("service_name", cVar.f36953a);
                    jSONObject2.put("priority", cVar.f36955c);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("action_info_list", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("dispatch", jSONObject);
            new JSONObject().put("dispatchersdk", jSONObject3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dVar.f36961b = arrayList3;
        dVar.f36960a = str4;
        dVar.f36962c = arrayList;
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo51751a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i.mo51751a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public int mo51749a(String str, String str2) {
        if (Logger.debug()) {
            String str3 = f36979b;
            Logger.m15167d(str3, "getDelayResultForUrl: " + str);
        }
        if (!UrlUtils.isValidUrl(str)) {
            if (Logger.debug()) {
                Logger.m15167d(f36979b, "illegal url");
            }
            return 0;
        }
        this.f36988j.readLock().lock();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 0);
        Iterator<C14066b> it = this.f36987i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C14066b next = it.next();
            if (Logger.debug()) {
                String str4 = f36979b;
                Logger.m15167d(str4, "current action priority is " + next.mo51732a());
            }
            if (next.mo51743a(str, str2, arrayList) == BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY) {
                if (Logger.debug()) {
                    Logger.m15167d(f36979b, "the url has been delayed by delay action, skip follow-up actions");
                }
            }
        }
        this.f36988j.readLock().unlock();
        return ((Integer) arrayList.get(0)).intValue();
    }

    /* renamed from: a */
    public void mo51753a(JSONObject jSONObject, int i, String str, String str2, long j) {
        String str3 = f36979b;
        Logger.m15167d(str3, "URLDispatcher::onServerConfigChanged, tnc source is " + i + "etag is " + str);
        this.f36989k.set(i);
        this.f36992n = str;
        this.f36993o = str2;
        this.f36990l.set(j);
        JSONArray optJSONArray = jSONObject.optJSONArray("request_delay_actions");
        try {
            this.f36988j.writeLock().lock();
            this.f36987i.clear();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        m56970b(optJSONObject);
                    }
                }
            }
            if (!this.f36987i.isEmpty()) {
                Collections.sort(this.f36987i, new C14074a());
            }
            int optInt = jSONObject.optInt("ttnet_url_dispatcher_enabled", -1);
            if (optInt >= 0) {
                AtomicBoolean atomicBoolean = this.f36983e;
                boolean z = f36978a;
                if (optInt != 1) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
            long optInt2 = (long) jSONObject.optInt("ttnet_dispatch_actions_epoch", -1);
            if (optInt2 == this.f36984f.get()) {
                Logger.m15167d(f36979b, "dispatch action epoch not changed");
                return;
            }
            this.f36984f.set(optInt2);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("ttnet_dispatch_actions");
            if (optJSONArray2 != null) {
                try {
                    this.f36986h.writeLock().lock();
                    this.f36985g.clear();
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            m56968a(optJSONObject2);
                        }
                    }
                    if (!this.f36985g.isEmpty()) {
                        Collections.sort(this.f36985g, new C14074a());
                    }
                } finally {
                    this.f36986h.writeLock().unlock();
                    String str4 = f36979b;
                    Logger.m15167d(str4, "parse dispatch actions completed, actions size is " + this.f36985g.size());
                }
            }
        } finally {
            this.f36988j.writeLock().unlock();
            if (Logger.debug()) {
                String str5 = f36979b;
                Logger.m15167d(str5, "parse delay actions completed, actions size is " + this.f36987i.size());
            }
        }
    }
}
