package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;

public class DnsRecord {

    /* renamed from: a */
    private static final String f36754a = "DnsRecord";

    /* renamed from: b */
    private String f36755b;

    /* renamed from: c */
    private List<String> f36756c;

    /* renamed from: d */
    private List<String> f36757d;

    /* renamed from: e */
    private long f36758e;

    /* renamed from: f */
    private long f36759f;

    /* renamed from: g */
    private final WeakHandler f36760g = new WeakHandler(C14041b.m56829a().mo51706l().getLooper(), C14041b.m56829a());

    public enum CacheStaleReason {
        CACHE_UNSET,
        CACHE_VALID,
        CACHE_STALE_BOTH,
        CACHE_STALE_NETCHANGED,
        CACHE_STALE_EXPIRED,
        PRELOAD_BATCH,
        REFRESH_BATCH
    }

    /* renamed from: g */
    public long mo51637g() {
        return this.f36759f;
    }

    /* renamed from: h */
    public long mo51638h() {
        return this.f36758e;
    }

    /* renamed from: i */
    public List<String> mo51639i() {
        return this.f36756c;
    }

    /* renamed from: j */
    public List<String> mo51640j() {
        return this.f36757d;
    }

    /* renamed from: d */
    public void mo51634d() {
        this.f36760g.removeMessages(13);
    }

    /* renamed from: f */
    public void mo51636f() {
        this.f36760g.removeMessages(11);
    }

    /* renamed from: c */
    public void mo51633c() {
        this.f36760g.removeMessages(10);
        this.f36760g.removeMessages(12);
    }

    /* renamed from: b */
    public void mo51632b() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 13;
        m56771a(obtain);
        this.f36760g.sendMessageDelayed(obtain, this.f36758e * 1000);
    }

    /* renamed from: a */
    public void mo51631a() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 12;
        m56771a(obtain);
        this.f36760g.sendMessageDelayed(obtain, this.f36758e * 1000);
        Message obtain2 = Message.obtain();
        obtain2.obj = this;
        obtain2.what = 10;
        m56771a(obtain2);
        this.f36760g.sendMessageDelayed(obtain2, (this.f36758e * 1000) + (((long) C14041b.m56829a().mo51696d().get()) * 1000));
    }

    /* renamed from: e */
    public void mo51635e() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 11;
        m56771a(obtain);
        this.f36760g.sendMessageDelayed(obtain, ((long) C14041b.m56829a().mo51694c().get()) * 1000);
    }

    /* renamed from: a */
    private void m56771a(Message message) {
        Bundle bundle = new Bundle();
        bundle.putString("dnsrecord_host", this.f36755b);
        message.setData(bundle);
    }

    public DnsRecord(String str, long j, List<String> list, List<String> list2, int i) {
        this.f36755b = str;
        this.f36759f = j;
        this.f36756c = list;
        this.f36757d = list2;
        this.f36758e = (long) i;
    }
}
