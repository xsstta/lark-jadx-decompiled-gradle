package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14026f;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsRecord;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14033a;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14035c;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.b */
public class C14041b implements WeakHandler.IHandler {

    /* renamed from: a */
    public static String f36788a = "b";

    /* renamed from: b */
    private static ExecutorService f36789b = Executors.newFixedThreadPool(6);

    /* renamed from: c */
    private static volatile C14041b f36790c;

    /* renamed from: f */
    private static String f36791f;

    /* renamed from: u */
    private static HandlerThread f36792u;

    /* renamed from: v */
    private static WeakHandler f36793v;

    /* renamed from: d */
    private AtomicBoolean f36794d = new AtomicBoolean(true);

    /* renamed from: e */
    private AtomicBoolean f36795e = new AtomicBoolean(false);

    /* renamed from: g */
    private volatile String f36796g;

    /* renamed from: h */
    private ConcurrentSkipListSet<String> f36797h = new ConcurrentSkipListSet<>();

    /* renamed from: i */
    private ConcurrentMap<String, CopyOnWriteArrayList<String>> f36798i = new ConcurrentHashMap();

    /* renamed from: j */
    private ConcurrentSkipListSet<String> f36799j = new ConcurrentSkipListSet<>();

    /* renamed from: k */
    private AtomicInteger f36800k = new AtomicInteger(30);

    /* renamed from: l */
    private AtomicInteger f36801l = new AtomicInteger(2000);

    /* renamed from: m */
    private AtomicInteger f36802m = new AtomicInteger(60);

    /* renamed from: n */
    private AtomicInteger f36803n = new AtomicInteger(0);

    /* renamed from: o */
    private AtomicInteger f36804o = new AtomicInteger(5);

    /* renamed from: p */
    private AtomicInteger f36805p = new AtomicInteger(5);

    /* renamed from: q */
    private final C14032a f36806q;

    /* renamed from: r */
    private final C14026f f36807r = new C14026f();

    /* renamed from: s */
    private volatile AbstractC14045e f36808s;

    /* renamed from: t */
    private boolean f36809t = false;

    /* renamed from: w */
    private Handler f36810w = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.C14041b.HandlerC140421 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && (message.obj instanceof C14041b)) {
                Bundle data = message.getData();
                DnsResult dnsResult = (DnsResult) data.getSerializable("callback_dnsresult_key");
                HostResolveJob hostResolveJob = (HostResolveJob) data.getSerializable("callback_dnsresult_job_key");
                if (hostResolveJob == null) {
                    Logger.m15167d(C14041b.f36788a, "callback job is null");
                } else if (message.what == 1) {
                    String str = C14041b.f36788a;
                    Logger.m15167d(str, "callback dns result for host " + hostResolveJob.getHost() + " in thread " + Thread.currentThread().getName());
                    hostResolveJob.mHttpDnsCallback.mo51710a(dnsResult);
                }
            }
        }
    };

    /* renamed from: f */
    public static HandlerThread m56835f(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AtomicInteger mo51692b() {
        return this.f36801l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AtomicInteger mo51694c() {
        return this.f36800k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AtomicInteger mo51696d() {
        return this.f36802m;
    }

    /* renamed from: e */
    public AbstractC14045e mo51698e() {
        return this.f36808s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo51700f() {
        return this.f36796g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ConcurrentSkipListSet<String> mo51701g() {
        return this.f36797h;
    }

    /* renamed from: h */
    public AtomicBoolean mo51702h() {
        return this.f36795e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HandlerThread mo51706l() {
        return f36792u;
    }

    /* renamed from: a */
    public void mo51688a(AbstractC14045e eVar) {
        if (this.f36809t) {
            Logger.m15167d(f36788a, "you have set httpdns depend before.");
        } else if (eVar == null || eVar.mo51711a() == null || TextUtils.isEmpty(eVar.mo51714d()) || eVar.mo51713c() == null) {
            this.f36808s = null;
            throw new IllegalArgumentException("you must set correct httpdns depend");
        } else {
            this.f36808s = eVar;
            if (TextUtils.isEmpty(this.f36796g)) {
                this.f36796g = eVar.mo51714d();
            }
            this.f36809t = true;
            mo51705k();
            this.f36807r.mo51626a(eVar.mo51711a());
            if (this.f36799j.size() >= 1) {
                mo51687a(DnsRecord.CacheStaleReason.PRELOAD_BATCH);
            } else if (this.f36808s.mo51712b() == null || this.f36808s.mo51712b().length <= 0 || this.f36808s.mo51712b().length > 10) {
                Logger.m15167d(f36788a, "httpdns preload domains's number must less than 10, httpdns preload is skipped.");
            } else {
                this.f36799j.addAll(Arrays.asList(this.f36808s.mo51712b()));
                mo51687a(DnsRecord.CacheStaleReason.PRELOAD_BATCH);
            }
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.obj = this;
            f36793v.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo51687a(DnsRecord.CacheStaleReason cacheStaleReason) {
        ConcurrentSkipListSet<String> concurrentSkipListSet = this.f36799j;
        if (!(concurrentSkipListSet == null || concurrentSkipListSet.size() == 0)) {
            if (this.f36799j.size() <= 10) {
                Logger.m15167d(f36788a, "do httpdns preload");
                Iterator<String> it = this.f36799j.iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!this.f36806q.mo51664e(next)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() != 0) {
                    String str = f36788a;
                    Logger.m15167d(str, "httpdns batch preload for : " + arrayList);
                    mo51686a((List<String>) arrayList, cacheStaleReason, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51689a(List<String> list) {
        String str = f36788a;
        Logger.m15167d(str, "batchRefreshHttpDnsStaleCache for host " + list);
        mo51686a(list, DnsRecord.CacheStaleReason.REFRESH_BATCH, false);
    }

    /* renamed from: a */
    public void mo51691a(JSONObject jSONObject) {
        Logger.m15167d(f36788a, "onServerConfigChanged");
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("ttnet_http_dns_enabled", -1);
            boolean z = false;
            if (optInt >= 0) {
                this.f36794d.set(optInt == 1);
            }
            String optString = jSONObject.optString("ttnet_tt_http_dns_domain");
            if (!TextUtils.isEmpty(optString)) {
                this.f36796g = optString;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_tt_http_dns_preload_batch_host");
            if (optJSONArray != null) {
                this.f36799j.clear();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString2)) {
                        this.f36799j.add(optString2);
                    }
                }
            }
            int optInt2 = jSONObject.optInt("localdns_cache_ttl", -1);
            if (optInt2 >= 0) {
                this.f36800k.set(optInt2);
            }
            int optInt3 = jSONObject.optInt("httpdns_prefer_time_ms", -1);
            if (optInt3 >= 0) {
                this.f36801l.set(optInt3);
            }
            int optInt4 = jSONObject.optInt("httpdns_stale_cache_interval", -1);
            if (optInt4 >= 0) {
                this.f36802m.set(optInt4);
            }
            int optInt5 = jSONObject.optInt("enable_compare_localdns_httpdns", -1);
            if (optInt5 >= 0) {
                this.f36803n.set(optInt5);
            }
            int optInt6 = jSONObject.optInt("ttnet_http_dns_prefer", -1);
            if (optInt6 >= 0) {
                AtomicBoolean atomicBoolean = this.f36795e;
                if (optInt6 == 1) {
                    z = true;
                }
                atomicBoolean.set(z);
            }
            int optInt7 = jSONObject.optInt("ttnet_http_dns_timeout", -1);
            if (optInt7 >= 0) {
                this.f36804o.set(optInt7);
            }
            int optInt8 = jSONObject.optInt("ttnet_local_dns_time_out", -1);
            if (optInt8 >= 0) {
                this.f36805p.set(optInt8);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_http_dns_addr");
            if (optJSONObject != null) {
                this.f36798i.clear();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString3 = optJSONObject.optString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                        String[] split = optString3.split(",");
                        if (next.equals(this.f36796g)) {
                            this.f36797h.clear();
                            this.f36797h.addAll(Arrays.asList(split));
                        } else {
                            this.f36798i.put(next, new CopyOnWriteArrayList<>(Arrays.asList(split)));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Future<Void> mo51686a(List<String> list, DnsRecord.CacheStaleReason cacheStaleReason, boolean z) {
        Future<Void> future = null;
        if (list != null) {
            if (list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (this.f36806q.mo51664e(list.get(i))) {
                        if (z && list.size() == 1 && i == 0) {
                            future = this.f36806q.mo51666g(list.get(i));
                            String str = f36788a;
                            Logger.m15167d(str, "sync block request for " + list.get(i) + " is resolving");
                        }
                        list.remove(list.get(i));
                    }
                }
                if (list.size() == 0) {
                    return future;
                }
                String str2 = f36788a;
                Logger.m15167d(str2, "submit httpdns resolve for host : " + list);
                try {
                    future = f36789b.submit(new CallableC14043c(C14033a.m56813a(list), f36791f, this.f36806q, cacheStaleReason, f36793v));
                    for (String str3 : list) {
                        this.f36806q.mo51650a(str3, future);
                        if (this.f36795e.get()) {
                            this.f36806q.mo51675p(str3);
                        }
                    }
                } catch (RejectedExecutionException e) {
                    e.printStackTrace();
                    String str4 = f36788a;
                    Logger.m15167d(str4, "submit httpdns resolve for host : " + list + " was rejected");
                }
                return future;
            }
        }
        Logger.m15167d(f36788a, "httpdns resolve hostlist is null.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51690a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            this.f36797h.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f36797h.add(optString);
                }
            }
            SharedPreferences.Editor edit = this.f36808s.mo51711a().getSharedPreferences("dispatchersdk_httpdns_hardcodeips", 0).edit();
            edit.putString("httpdns_hardcodeips", String.valueOf(jSONArray));
            edit.apply();
        }
    }

    /* renamed from: i */
    public void mo51703i() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 7;
        f36793v.sendMessage(obtain);
    }

    /* renamed from: j */
    public void mo51704j() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 6;
        f36793v.sendMessage(obtain);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo51705k() {
        try {
            f36789b.submit(new CallableC14046f());
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C14041b m56829a() {
        if (f36790c == null) {
            synchronized (C14041b.class) {
                if (f36790c == null) {
                    f36790c = new C14041b();
                }
            }
        }
        return f36790c;
    }

    private C14041b() {
        Logger.m15167d(f36788a, "HttpDns constructor");
        HandlerThread f = m56835f("TTOK-HTTPDNS");
        f36792u = f;
        f.start();
        WeakHandler weakHandler = new WeakHandler(f36792u.getLooper(), this);
        f36793v = weakHandler;
        f36791f = "4.0.78.3-tudp";
        this.f36806q = new C14032a(weakHandler);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo51697d(String str) {
        this.f36806q.mo51674o(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo51695c(String str) {
        if (C14033a.m56814a(str) && !this.f36806q.mo51664e(str)) {
            this.f36806q.mo51647a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo51699e(String str) {
        Logger.m15167d(f36788a, "removeLocalDnsStaleCache");
        if (C14033a.m56814a(str)) {
            this.f36806q.mo51658c(str);
        }
    }

    /* renamed from: a */
    private void m56831a(HostResolveJob hostResolveJob) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hostResolveJob.getHost());
        mo51686a((List<String>) arrayList, DnsRecord.CacheStaleReason.CACHE_UNSET, false);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this;
        Bundle bundle = new Bundle();
        bundle.putSerializable("dns_timeout_job_key", hostResolveJob);
        obtain.setData(bundle);
        f36793v.sendMessageDelayed(obtain, ((long) this.f36804o.get()) * 1000);
    }

    /* renamed from: g */
    private DnsResult m56836g(String str) {
        Logger.m15167d(f36788a, "try to look up hardcode ips");
        if (!this.f36798i.containsKey(str)) {
            return null;
        }
        DnsResult dnsResult = new DnsResult();
        Iterator<String> it = this.f36798i.get(str).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (C14035c.m56818c(next)) {
                dnsResult.ipv6List.add(next);
            } else if (C14035c.m56819d(next)) {
                dnsResult.ipv4List.add(next);
            } else {
                String str2 = f36788a;
                Logger.m15167d(str2, "find a invalid hardcode ip: " + next);
            }
        }
        dnsResult.source = DnsResult.Source.HARDCODE_IPS;
        return dnsResult;
    }

    /* renamed from: h */
    private boolean m56837h(String str) {
        if (!this.f36809t) {
            Logger.m15167d(f36788a, "you have not set httpdns depend");
            return true;
        } else if (!this.f36794d.get()) {
            Logger.m15167d(f36788a, "httpdns was unabled by tnc");
            return true;
        } else if (!C14033a.m56814a(str)) {
            Logger.m15167d(f36788a, "illegal host");
            return true;
        } else if (!C14035c.m56819d(str) && !C14035c.m56818c(str)) {
            return false;
        } else {
            Logger.m15167d(f36788a, "host is ipaddress");
            return true;
        }
    }

    /* renamed from: i */
    private synchronized Future<Void> m56838i(String str) {
        if (this.f36806q.mo51668i(str)) {
            String str2 = f36788a;
            Logger.m15167d(str2, "localdns is resolving for host : " + str);
            return this.f36806q.mo51669j(str);
        }
        String str3 = f36788a;
        Logger.m15167d(str3, "submit localdns resolve host : " + str);
        Future<Void> future = null;
        try {
            future = f36789b.submit(new CallableC14047g(str, this.f36806q, f36793v));
            this.f36806q.mo51656b(str, future);
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
        return future;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51693b(String str) {
        if (C14033a.m56814a(str) && !this.f36806q.mo51664e(str) && this.f36795e.get()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            mo51686a((List<String>) arrayList, DnsRecord.CacheStaleReason.CACHE_STALE_EXPIRED, false);
        }
    }

    /* renamed from: a */
    public DnsResult mo51685a(String str) {
        DnsResult dnsResult;
        Future<Void> future;
        DnsResult b;
        String str2 = f36788a;
        Logger.m15167d(str2, "getHttpDnsResultForHostSyncBlock for host : " + str);
        if (m56837h(str)) {
            return null;
        }
        boolean equals = str.equals(this.f36796g);
        if (!this.f36795e.get() || equals) {
            DnsResult b2 = m56833b(str, false);
            if (b2 != null) {
                return b2;
            }
            if (this.f36806q.mo51668i(str)) {
                future = this.f36806q.mo51669j(str);
            } else {
                future = m56838i(str);
            }
            if (future == null) {
                DnsResult a = m56827a(str, equals);
                if (a == null) {
                    return m56836g(str);
                }
                return a;
            }
            if (future.isDone()) {
                b = m56833b(str, true);
                if (b == null) {
                    dnsResult = m56827a(str, equals);
                }
            } else {
                try {
                    future.get(((long) this.f36805p.get()) * 1000, TimeUnit.MILLISECONDS);
                    b = m56833b(str, true);
                    if (b == null) {
                        dnsResult = m56827a(str, equals);
                    }
                } catch (Exception unused) {
                    dnsResult = m56827a(str, equals);
                }
            }
            dnsResult = b;
        } else {
            DnsResult c = m56834c(str, false);
            if (c != null) {
                return c;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, false);
            dnsResult = m56828a(m56830a(str, (List<Boolean>) arrayList, true), str, arrayList.get(0).booleanValue());
        }
        if (dnsResult == null) {
            return m56836g(str);
        }
        return dnsResult;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String str = f36788a;
        Logger.m15167d(str, "httpdns handler handle msg in " + Thread.currentThread().getName());
        if (message == null) {
            return;
        }
        if ((message.obj instanceof C14041b) || (message.obj instanceof CallableC14043c) || (message.obj instanceof CallableC14047g) || (message.obj instanceof DnsRecord) || (message.obj instanceof C14032a)) {
            try {
                if ((message.obj instanceof C14041b) && message.what == 2) {
                    Logger.m15167d(f36788a, "MSG_HTTPDNS_PREFER_TIMEOUT");
                    HostResolveJob hostResolveJob = (HostResolveJob) message.getData().getSerializable("httpdns_timeout_job_key");
                    if (hostResolveJob == null) {
                        Logger.m15167d(f36788a, "MSG_HTTPDNS_PREFER_TIMEOUT job is null");
                    } else if (this.f36806q.mo51651a(hostResolveJob)) {
                        String str2 = f36788a;
                        Logger.m15167d(str2, "httpdns request not return in httpdns prefer time for host : " + hostResolveJob.getHost());
                        m56832a(hostResolveJob, m56833b(hostResolveJob.getHost(), hostResolveJob.isLocalDnsExpired()));
                        this.f36806q.mo51654b(hostResolveJob);
                    }
                } else if (!(message.obj instanceof CallableC14043c) || message.what != 3) {
                    if ((message.obj instanceof CallableC14047g) && message.what == 1) {
                        Logger.m15167d(f36788a, "MSG_LOCALDNS_COMPLETED");
                        String string = message.getData().getString("localdns_completed_host");
                        if (string == null) {
                            Logger.m15167d(f36788a, "MSG_HTTPDNS_COMPLETED host is null");
                        } else if (this.f36806q.mo51673n(string)) {
                            String str3 = f36788a;
                            Logger.m15167d(str3, "localdns returned in localdns timeout for host : " + string);
                            Iterator<HostResolveJob> it = this.f36806q.mo51672m(string).iterator();
                            while (it.hasNext()) {
                                HostResolveJob next = it.next();
                                DnsResult b = m56833b(string, true);
                                if (b == null) {
                                    DnsResult c = m56834c(string, false);
                                    if (c == null) {
                                        m56831a(next);
                                        this.f36806q.mo51649a(next.getHost(), next);
                                    } else {
                                        m56832a(next, c);
                                    }
                                } else {
                                    String str4 = f36788a;
                                    Logger.m15167d(str4, "localdns request is returned in timeout for " + string);
                                    m56832a(next, b);
                                }
                                this.f36806q.mo51662d(next);
                            }
                        }
                    } else if ((message.obj instanceof C14041b) && message.what == 3) {
                        Logger.m15167d(f36788a, "MSG_LOCALDNS_REQUEST_TIMEOUT");
                        HostResolveJob hostResolveJob2 = (HostResolveJob) message.getData().getSerializable("dns_timeout_job_key");
                        if (hostResolveJob2 == null) {
                            Logger.m15167d(f36788a, "MSG_HTTPDNS_PREFER_TIMEOUT job is null");
                        } else if (this.f36806q.mo51659c(hostResolveJob2)) {
                            String str5 = f36788a;
                            Logger.m15167d(str5, "local request not return in localdns timeout for host : " + hostResolveJob2.getHost());
                            DnsResult c2 = m56834c(hostResolveJob2.getHost(), false);
                            if (c2 != null) {
                                m56832a(hostResolveJob2, c2);
                            } else {
                                if (!this.f36806q.mo51664e(hostResolveJob2.getHost())) {
                                    m56831a(hostResolveJob2);
                                }
                                this.f36806q.mo51649a(hostResolveJob2.getHost(), hostResolveJob2);
                            }
                            this.f36806q.mo51662d(hostResolveJob2);
                        }
                    } else if ((message.obj instanceof C14041b) && message.what == 4) {
                        Logger.m15167d(f36788a, "MSG_HTTPDNS_REQUEST_TIMEOUT");
                        HostResolveJob hostResolveJob3 = (HostResolveJob) message.getData().getSerializable("dns_timeout_job_key");
                        if (hostResolveJob3 == null) {
                            Logger.m15167d(f36788a, "MSG_HTTPDNS_PREFER_TIMEOUT job is null");
                        } else if (this.f36806q.mo51651a(hostResolveJob3)) {
                            m56832a(hostResolveJob3, (DnsResult) null);
                            this.f36806q.mo51654b(hostResolveJob3);
                        }
                    } else if ((message.obj instanceof C14041b) && message.what == 5) {
                        Logger.m15167d(f36788a, "MSG_LOAD_LOCAL_HARDCODEIPS");
                        String string2 = this.f36808s.mo51711a().getSharedPreferences("dispatchersdk_httpdns_hardcodeips", 0).getString("httpdns_hardcodeips", "");
                        if (!TextUtils.isEmpty(string2)) {
                            this.f36797h.clear();
                            try {
                                JSONArray jSONArray = new JSONArray(string2);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    String optString = jSONArray.optString(i);
                                    if (!TextUtils.isEmpty(optString)) {
                                        this.f36797h.add(optString);
                                    }
                                }
                            } catch (JSONException unused) {
                                Logger.m15167d(f36788a, "local httpdns hardcode ips not exists, use default");
                            }
                        } else if (this.f36808s.mo51715e() != null && this.f36797h.size() == 0) {
                            this.f36797h.addAll(Arrays.asList(this.f36808s.mo51715e()));
                        }
                    } else if ((message.obj instanceof C14041b) && message.what == 6) {
                        Logger.m15167d(f36788a, "network changed");
                        this.f36806q.mo51646a(m56829a().mo51698e().mo51711a());
                    } else if ((message.obj instanceof C14041b) && message.what == 7) {
                        Logger.m15167d(f36788a, "activity resume, detect ipv6 reachable");
                        mo51705k();
                    } else if (message.obj instanceof DnsRecord) {
                        String string3 = message.getData().getString("dnsrecord_host");
                        if (TextUtils.isEmpty(string3)) {
                            Logger.m15167d(f36788a, "DnsRecord refresh host is null");
                            return;
                        }
                        switch (message.what) {
                            case 10:
                                String str6 = f36788a;
                                Logger.m15167d(str6, "refresh httpdns cache for host : " + string3);
                                m56829a().mo51693b(string3);
                                return;
                            case 11:
                                String str7 = f36788a;
                                Logger.m15167d(str7, "remove localdns cache for host : " + string3);
                                m56829a().mo51699e(string3);
                                return;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                String str8 = f36788a;
                                Logger.m15167d(str8, "add host : " + string3 + " to stale cache host list");
                                m56829a().mo51697d(string3);
                                return;
                            case 13:
                                String str9 = f36788a;
                                Logger.m15167d(str9, "remove httpdns cache for host : " + string3);
                                m56829a().mo51695c(string3);
                                return;
                            default:
                                return;
                        }
                    } else if (!(message.obj instanceof C14032a) || message.what != 20) {
                        String str10 = f36788a;
                        Logger.m15167d(str10, "HTTPDNS-CollectResult handler thread receive a unknown message : " + message);
                    } else {
                        Logger.m15167d(f36788a, "reset httpdns domain failed count");
                        this.f36806q.mo51663e();
                    }
                } else {
                    Logger.m15167d(f36788a, "MSG_HTTPDNS_COMPLETED");
                    ArrayList<String> stringArrayList = message.getData().getStringArrayList("httpdns_completed_hosts");
                    if (stringArrayList == null) {
                        Logger.m15167d(f36788a, "MSG_HTTPDNS_COMPLETED hostlist is null");
                        return;
                    }
                    for (String str11 : stringArrayList) {
                        if (this.f36806q.mo51671l(str11)) {
                            String str12 = f36788a;
                            Logger.m15167d(str12, "httpdns returned in httpdns prefer time for host : " + stringArrayList);
                            Iterator<HostResolveJob> it2 = this.f36806q.mo51670k(str11).iterator();
                            while (it2.hasNext()) {
                                HostResolveJob next2 = it2.next();
                                DnsResult c3 = m56834c(str11, true);
                                if (m56829a().mo51702h().get() && c3 == null) {
                                    c3 = m56833b(str11, next2.isLocalDnsExpired());
                                }
                                String str13 = f36788a;
                                Logger.m15167d(str13, "httpdns request is returned in prefer time for " + str11);
                                m56832a(next2, c3);
                                this.f36806q.mo51654b(next2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private DnsResult m56833b(String str, boolean z) {
        String str2 = f36788a;
        Logger.m15167d(str2, "lookup localdns cache for host " + str);
        DnsResult dnsResult = new DnsResult();
        DnsRecord d = this.f36806q.mo51660d(str);
        if (d == null) {
            return null;
        }
        dnsResult.ipv4List = d.mo51639i();
        dnsResult.ipv6List = d.mo51640j();
        if (z) {
            dnsResult.source = DnsResult.Source.LOCALDNS_REQUEST;
        } else {
            dnsResult.source = DnsResult.Source.LOCALDNS_CACHE;
        }
        return dnsResult;
    }

    /* renamed from: a */
    private DnsResult m56827a(String str, boolean z) {
        Future<Void> future;
        if (z) {
            return null;
        }
        if (this.f36806q.mo51664e(str)) {
            future = this.f36806q.mo51666g(str);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            future = mo51686a((List<String>) arrayList, DnsRecord.CacheStaleReason.CACHE_UNSET, true);
        }
        if (future == null) {
            return null;
        }
        if (future.isDone()) {
            return m56834c(str, true);
        }
        try {
            future.get(((long) this.f36804o.get()) * 1000, TimeUnit.MILLISECONDS);
            return m56834c(str, true);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private DnsResult m56834c(String str, boolean z) {
        String str2 = f36788a;
        Logger.m15167d(str2, "look up httpdns cache for host " + str);
        DnsRecord b = this.f36806q.mo51652b(str);
        if (b == null) {
            return null;
        }
        DnsResult dnsResult = new DnsResult();
        dnsResult.ipv4List = b.mo51639i();
        dnsResult.ipv6List = b.mo51640j();
        if (!z) {
            if ((b.mo51638h() * 1000) + b.mo51637g() > System.currentTimeMillis()) {
                dnsResult.source = DnsResult.Source.HTTPDNS_CACHE;
            } else {
                dnsResult.source = DnsResult.Source.HTTPDNS_STALE_CACHE;
            }
            return dnsResult;
        } else if ((b.mo51638h() * 1000) + b.mo51637g() <= System.currentTimeMillis()) {
            return null;
        } else {
            dnsResult.source = DnsResult.Source.HTTPDNS_REQUEST;
            return dnsResult;
        }
    }

    /* renamed from: a */
    private void m56832a(HostResolveJob hostResolveJob, DnsResult dnsResult) {
        String str = f36788a;
        Logger.m15167d(str, "doDnsResultCallback for host " + hostResolveJob.getHost());
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("callback_dnsresult_job_key", hostResolveJob);
        bundle.putSerializable("callback_dnsresult_key", dnsResult);
        obtain.setData(bundle);
        this.f36810w.sendMessage(obtain);
    }

    /* renamed from: a */
    private DnsResult m56828a(Future<Void> future, String str, boolean z) {
        Logger.m15167d(f36788a, "getDnsResultInHttpDnsPreferTime");
        if (future == null) {
            try {
                Logger.m15167d(f36788a, "httpdns future is null");
                return m56833b(str, z);
            } catch (InterruptedException unused) {
                Logger.m15167d(f36788a, "httpdns InterruptedException, look up localdns");
                return m56833b(str, z);
            } catch (ExecutionException unused2) {
                Logger.m15167d(f36788a, "httpdns ExecutionException, look up localdns");
                return m56833b(str, z);
            } catch (TimeoutException unused3) {
                Logger.m15167d(f36788a, "httpdns timeout in httpdns prefer time, look up localdns");
                return m56833b(str, z);
            }
        } else if (future.isDone()) {
            Logger.m15167d(f36788a, "httpdns future is done");
            DnsResult c = m56834c(str, true);
            if (c == null) {
                return m56833b(str, z);
            }
            return c;
        } else {
            future.get((long) m56829a().mo51692b().get(), TimeUnit.MILLISECONDS);
            DnsResult c2 = m56834c(str, true);
            if (c2 == null) {
                return m56833b(str, z);
            }
            return c2;
        }
    }

    /* renamed from: a */
    private Future<Void> m56830a(String str, List<Boolean> list, boolean z) {
        Future<Void> future;
        DnsRecord d = this.f36806q.mo51660d(str);
        if (d == null || d.mo51637g() + (d.mo51638h() * 1000) <= System.currentTimeMillis() + ((long) this.f36801l.get())) {
            list.set(0, true);
            if (!this.f36806q.mo51668i(str)) {
                m56838i(str);
            }
        }
        if (this.f36806q.mo51664e(str)) {
            String str2 = f36788a;
            Logger.m15167d(str2, "httpdns is resolving for host " + str);
            return this.f36806q.mo51666g(str);
        }
        synchronized (this) {
            if (this.f36806q.mo51664e(str)) {
                future = this.f36806q.mo51666g(str);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                future = mo51686a(arrayList, DnsRecord.CacheStaleReason.CACHE_UNSET, z);
            }
        }
        return future;
    }
}
