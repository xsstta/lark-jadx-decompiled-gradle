package com.bytedance.ee.lark.infra.storage.p639b;

import android.util.LruCache;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.bytedance.ee.lark.infra.storage.b.a */
public class C12897a {

    /* renamed from: a */
    private LruCache<String, C12898a> f34392a = new LruCache<>(100);

    /* renamed from: com.bytedance.ee.lark.infra.storage.b.a$a */
    class C12898a {

        /* renamed from: a */
        public String f34393a;

        /* renamed from: c */
        private long f34395c;

        /* renamed from: d */
        private long f34396d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo48651a() {
            long j = this.f34396d;
            if (j == -1 || (j * 1000) + this.f34395c >= System.currentTimeMillis()) {
                return true;
            }
            return false;
        }

        C12898a(String str, long j, long j2) {
            this.f34393a = str;
            this.f34395c = j;
            this.f34396d = j2;
        }
    }

    /* renamed from: a */
    public String mo48649a(String str) {
        C12898a aVar = this.f34392a.get(str);
        if (aVar == null) {
            return null;
        }
        if (aVar.mo48651a()) {
            return aVar.f34393a;
        }
        AppBrandLogger.m52830i("MemoryCacheStorage", "memory is expired, key:" + str);
        return null;
    }

    /* renamed from: a */
    public boolean mo48650a(String str, String str2, long j) {
        if (str == null || str2 == null || j < 0) {
            AppBrandLogger.m52829e("MemoryCacheStorage", "put value failed: key or value is null", "expireTime: ", Long.valueOf(j));
            return false;
        }
        this.f34392a.put(str, new C12898a(str2, System.currentTimeMillis(), j));
        return true;
    }
}
