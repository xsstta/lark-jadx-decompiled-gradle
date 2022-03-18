package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsRecord;
import com.bytedance.frameworks.baselib.network.http.util.C14087e;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a */
public class C14032a {

    /* renamed from: a */
    private static final String f36761a = "a";

    /* renamed from: b */
    private C14087e<String, DnsRecord> f36762b = new C14087e<>(100);

    /* renamed from: c */
    private ConcurrentMap<String, DnsRecord> f36763c = new ConcurrentHashMap();

    /* renamed from: d */
    private ConcurrentMap<String, Future<Void>> f36764d = new ConcurrentHashMap();

    /* renamed from: e */
    private ConcurrentMap<String, Future<Void>> f36765e = new ConcurrentHashMap();

    /* renamed from: f */
    private ConcurrentMap<String, ConcurrentSkipListSet<HostResolveJob>> f36766f = new ConcurrentHashMap();

    /* renamed from: g */
    private ConcurrentMap<String, ConcurrentSkipListSet<HostResolveJob>> f36767g = new ConcurrentHashMap();

    /* renamed from: h */
    private ConcurrentSkipListSet<String> f36768h = new ConcurrentSkipListSet<>();

    /* renamed from: i */
    private AtomicInteger f36769i = new AtomicInteger(0);

    /* renamed from: j */
    private AtomicInteger f36770j = new AtomicInteger(0);

    /* renamed from: k */
    private NetworkUtils.NetworkType f36771k = NetworkUtils.NetworkType.NONE;

    /* renamed from: l */
    private final long f36772l = 180000;

    /* renamed from: m */
    private final int f36773m = 10;

    /* renamed from: n */
    private final Handler f36774n;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AtomicInteger mo51645a() {
        return this.f36769i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AtomicInteger mo51657c() {
        return this.f36770j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51653b() {
        this.f36769i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo51663e() {
        this.f36770j.set(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo51661d() {
        this.f36770j.getAndIncrement();
        if (this.f36770j.get() >= 2) {
            Message obtain = Message.obtain();
            obtain.what = 20;
            obtain.obj = this;
            this.f36774n.sendMessageDelayed(obtain, 180000);
        }
    }

    /* renamed from: f */
    public void mo51665f(String str) {
        this.f36764d.remove(str);
    }

    /* renamed from: h */
    public void mo51667h(String str) {
        this.f36765e.remove(str);
    }

    /* renamed from: i */
    public boolean mo51668i(String str) {
        return this.f36765e.containsKey(str);
    }

    /* renamed from: l */
    public boolean mo51671l(String str) {
        return this.f36766f.containsKey(str);
    }

    /* renamed from: n */
    public boolean mo51673n(String str) {
        return this.f36767g.containsKey(str);
    }

    /* renamed from: c */
    public void mo51658c(String str) {
        DnsRecord d = mo51660d(str);
        if (d != null) {
            d.mo51636f();
            this.f36763c.remove(str);
        }
    }

    /* renamed from: e */
    public boolean mo51664e(String str) {
        return this.f36764d.containsKey(str);
    }

    /* renamed from: k */
    public ConcurrentSkipListSet<HostResolveJob> mo51670k(String str) {
        return this.f36766f.get(str);
    }

    /* renamed from: m */
    public ConcurrentSkipListSet<HostResolveJob> mo51672m(String str) {
        return this.f36767g.get(str);
    }

    /* renamed from: p */
    public void mo51675p(String str) {
        if (this.f36768h.contains(str)) {
            this.f36768h.remove(str);
        }
    }

    /* renamed from: b */
    public DnsRecord mo51652b(String str) {
        DnsRecord a;
        synchronized (this.f36762b.mo51821c()) {
            a = this.f36762b.mo51813a(str);
        }
        return a;
    }

    /* renamed from: d */
    public DnsRecord mo51660d(String str) {
        if (this.f36763c.containsKey(str)) {
            return this.f36763c.get(str);
        }
        return null;
    }

    /* renamed from: g */
    public Future<Void> mo51666g(String str) {
        if (this.f36764d.containsKey(str)) {
            return this.f36764d.get(str);
        }
        return null;
    }

    /* renamed from: j */
    public Future<Void> mo51669j(String str) {
        if (this.f36765e.containsKey(str)) {
            return this.f36765e.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo51647a(String str) {
        DnsRecord b = mo51652b(str);
        if (b != null) {
            if (C14041b.m56829a().mo51702h().get()) {
                b.mo51633c();
            } else {
                b.mo51634d();
            }
            synchronized (this.f36762b.mo51821c()) {
                this.f36762b.mo51817b(str);
            }
        }
    }

    /* renamed from: b */
    public void mo51654b(HostResolveJob hostResolveJob) {
        String host = hostResolveJob.getHost();
        if (this.f36766f.containsKey(host)) {
            this.f36766f.get(host).remove(hostResolveJob);
            if (this.f36766f.get(host).isEmpty()) {
                this.f36766f.remove(host);
            }
        }
    }

    /* renamed from: c */
    public boolean mo51659c(HostResolveJob hostResolveJob) {
        if (!this.f36767g.containsKey(hostResolveJob.getHost()) || !this.f36767g.get(hostResolveJob.getHost()).contains(hostResolveJob)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public void mo51674o(String str) {
        this.f36768h.add(str);
        if (this.f36768h.size() >= 10) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f36768h);
            C14041b.m56829a().mo51689a(arrayList);
        }
    }

    public C14032a(Handler handler) {
        this.f36774n = handler;
    }

    /* renamed from: d */
    public void mo51662d(HostResolveJob hostResolveJob) {
        String host = hostResolveJob.getHost();
        if (this.f36767g.containsKey(host)) {
            this.f36767g.get(host).remove(hostResolveJob);
            if (this.f36767g.get(host).isEmpty()) {
                this.f36767g.remove(host);
            }
        }
    }

    /* renamed from: a */
    public void mo51646a(Context context) {
        NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(context);
        if (networkType != this.f36771k) {
            String str = f36761a;
            Logger.m15167d(str, "network changed, clear cache and re-batch-preload preload hosts, current net type is " + networkType);
            synchronized (this.f36762b.mo51821c()) {
                for (Map.Entry<String, DnsRecord> entry : this.f36762b.mo51821c().entrySet()) {
                    if (entry != null) {
                        if (C14041b.m56829a().mo51702h().get()) {
                            entry.getValue().mo51633c();
                        } else {
                            entry.getValue().mo51634d();
                        }
                    }
                }
                this.f36762b.mo51815a();
            }
            for (Map.Entry<String, DnsRecord> entry2 : this.f36763c.entrySet()) {
                if (entry2 != null) {
                    entry2.getValue().mo51636f();
                }
            }
            this.f36763c.clear();
            if (networkType != NetworkUtils.NetworkType.NONE) {
                C14041b.m56829a().mo51687a(DnsRecord.CacheStaleReason.CACHE_STALE_NETCHANGED);
                C14041b.m56829a().mo51705k();
            }
        }
        this.f36771k = networkType;
    }

    /* renamed from: a */
    public boolean mo51651a(HostResolveJob hostResolveJob) {
        if (!this.f36766f.containsKey(hostResolveJob.getHost()) || !this.f36766f.get(hostResolveJob.getHost()).contains(hostResolveJob)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo51650a(String str, Future<Void> future) {
        this.f36764d.put(str, future);
    }

    /* renamed from: b */
    public void mo51656b(String str, Future<Void> future) {
        this.f36765e.put(str, future);
    }

    /* renamed from: a */
    public void mo51648a(String str, DnsRecord dnsRecord) {
        DnsRecord b = mo51652b(str);
        if (b != null) {
            if (C14041b.m56829a().mo51702h().get()) {
                b.mo51633c();
            } else {
                b.mo51634d();
            }
        }
        if (C14041b.m56829a().mo51702h().get()) {
            dnsRecord.mo51631a();
        } else {
            dnsRecord.mo51632b();
        }
        synchronized (this.f36762b.mo51821c()) {
            this.f36762b.mo51814a(str, dnsRecord);
        }
    }

    /* renamed from: b */
    public void mo51655b(String str, DnsRecord dnsRecord) {
        DnsRecord d = mo51660d(str);
        if (d != null) {
            d.mo51636f();
        }
        dnsRecord.mo51635e();
        this.f36763c.put(str, dnsRecord);
    }

    /* renamed from: a */
    public synchronized void mo51649a(String str, HostResolveJob hostResolveJob) {
        if (this.f36766f.containsKey(str)) {
            this.f36766f.get(str).add(hostResolveJob);
        } else {
            ConcurrentSkipListSet<HostResolveJob> concurrentSkipListSet = new ConcurrentSkipListSet<>();
            concurrentSkipListSet.add(hostResolveJob);
            this.f36766f.put(str, concurrentSkipListSet);
        }
    }
}
