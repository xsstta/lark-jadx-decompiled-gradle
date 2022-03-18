package com.bytedance.apm.p143i.p147c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.apm.i.c.c */
public class C2967c {

    /* renamed from: a */
    public long f9525a;

    /* renamed from: b */
    public Map<String, C2980h> f9526b;

    /* renamed from: c */
    public Map<String, C2980h> f9527c;

    /* renamed from: d */
    public int f9528d = 50;

    /* renamed from: e */
    public int f9529e = 20;

    /* renamed from: f */
    public int f9530f = 50;

    /* renamed from: g */
    public int f9531g = Math.min(3, 50 / 2);

    /* renamed from: h */
    private int f9532h = 0;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.c.c$a */
    public static class C2968a {

        /* renamed from: a */
        public static final C2967c f9533a = new C2967c();
    }

    /* renamed from: a */
    public static C2967c m12480a() {
        return C2968a.f9533a;
    }

    /* renamed from: d */
    public int mo12701d() {
        return this.f9532h;
    }

    /* renamed from: c */
    public synchronized Map<String, C2980h> mo12700c() {
        return this.f9527c;
    }

    /* renamed from: b */
    public void mo12699b() {
        this.f9525a = 0;
        this.f9532h = 0;
        Map<String, C2980h> map = this.f9526b;
        if (map != null) {
            map.clear();
            this.f9526b = null;
        }
        Map<String, C2980h> map2 = this.f9527c;
        if (map2 != null) {
            map2.clear();
            this.f9527c = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo12698a(long j, String str, String str2) {
        if (this.f9527c == null) {
            this.f9527c = new HashMap();
        }
        if (this.f9527c.containsKey(str)) {
            C2980h hVar = this.f9527c.get(str);
            hVar.f9579d++;
            hVar.f9580e = System.currentTimeMillis();
            if (hVar.f9579d > this.f9532h) {
                this.f9532h = hVar.f9579d;
            }
        } else {
            Map<String, C2980h> map = this.f9526b;
            if (map != null) {
                long j2 = Long.MAX_VALUE;
                String str3 = null;
                if (map.containsKey(str)) {
                    C2980h hVar2 = this.f9526b.get(str);
                    int i = hVar2.f9579d;
                    hVar2.f9579d = i + 1;
                    hVar2.f9580e = System.currentTimeMillis();
                    if (i > this.f9531g) {
                        this.f9526b.remove(str);
                        if (this.f9527c.size() >= this.f9529e) {
                            long currentTimeMillis = this.f9525a + ((System.currentTimeMillis() - this.f9525a) / 2);
                            for (Map.Entry<String, C2980h> entry : this.f9527c.entrySet()) {
                                if (entry.getValue().f9580e < currentTimeMillis && ((long) entry.getValue().f9579d) < j2) {
                                    str3 = entry.getValue().f9576a;
                                    j2 = (long) entry.getValue().f9579d;
                                }
                            }
                            if (str3 != null) {
                                this.f9527c.remove(str3);
                            }
                        }
                        this.f9527c.put(str, hVar2);
                    }
                } else {
                    if (this.f9526b.size() >= this.f9528d) {
                        for (Map.Entry<String, C2980h> entry2 : this.f9526b.entrySet()) {
                            if (entry2.getValue().f9580e < j2) {
                                j2 = entry2.getValue().f9580e;
                                str3 = entry2.getValue().f9576a;
                            }
                        }
                        if (str3 != null) {
                            this.f9526b.remove(str3);
                        }
                    }
                    this.f9526b.put(str, new C2980h(str, j, str2));
                }
            } else {
                HashMap hashMap = new HashMap();
                this.f9526b = hashMap;
                hashMap.put(str, new C2980h(str, j, str2));
            }
        }
    }
}
