package com.bytedance.geckox.statistic;

import com.bytedance.geckox.statistic.model.C14348a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.geckox.statistic.b */
public class C14331b {

    /* renamed from: a */
    private static final Map<Long, C14331b> f37651a = new HashMap();

    /* renamed from: b */
    private final Map<String, C14348a> f37652b = new HashMap();

    C14331b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C14348a> mo52460a() {
        ArrayList arrayList;
        synchronized (this.f37652b) {
            arrayList = new ArrayList(this.f37652b.values());
        }
        return arrayList;
    }

    /* renamed from: a */
    static C14331b m57730a(long j) {
        C14331b bVar;
        Map<Long, C14331b> map = f37651a;
        synchronized (map) {
            bVar = map.get(Long.valueOf(j));
            if (bVar == null) {
                bVar = new C14331b();
                map.put(Long.valueOf(j), bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C14348a mo52459a(String str) {
        C14348a aVar;
        synchronized (this.f37652b) {
            aVar = this.f37652b.get(str);
            if (aVar == null) {
                aVar = new C14348a();
                this.f37652b.put(str, aVar);
            }
        }
        return aVar;
    }
}
