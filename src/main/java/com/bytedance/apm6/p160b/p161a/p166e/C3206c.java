package com.bytedance.apm6.p160b.p161a.p166e;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.bytedance.apm6.b.a.e.c */
public class C3206c {

    /* renamed from: e */
    private static volatile C3206c f10259e = new C3206c();

    /* renamed from: a */
    public Set<AbstractC3208d> f10260a = new HashSet();

    /* renamed from: b */
    public AbstractC3205b f10261b;

    /* renamed from: c */
    public int f10262c = 80;

    /* renamed from: d */
    public int f10263d = 5;

    /* renamed from: a */
    public static C3206c m13399a() {
        return f10259e;
    }

    /* renamed from: b */
    public void mo13291b() {
        if (C3318a.m13827e()) {
            C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(new AbstractRunnableC3362a(0, 14400000) {
                /* class com.bytedance.apm6.p160b.p161a.p166e.C3206c.C32071 */

                public void run() {
                    Iterator<AbstractC3208d> it;
                    HashMap hashMap;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = C3206c.this.f10263d;
                    long j = ((long) C3206c.this.f10262c) * 1024 * 1024;
                    HashMap hashMap2 = new HashMap();
                    if (C3318a.m13915u()) {
                        C3350b.m13932a(C3159a.f10110a, "start weedOut:" + (currentTimeMillis - (((long) i) * 86400000)));
                    }
                    Iterator<AbstractC3208d> it2 = C3206c.this.f10260a.iterator();
                    long j2 = 0;
                    while (it2.hasNext()) {
                        AbstractC3208d next = it2.next();
                        C3204a aVar = new C3204a();
                        hashMap2.put(next.mo13213g(), aVar);
                        aVar.mo13283a(next.mo13213g());
                        aVar.mo13282a(next.mo13214h());
                        if (C3318a.m13915u()) {
                            String str = C3159a.f10110a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("weedOut:name:");
                            sb.append(aVar.mo13281a());
                            sb.append(" beforeSize:");
                            hashMap = hashMap2;
                            it = it2;
                            sb.append(aVar.mo13284b());
                            C3350b.m13932a(str, sb.toString());
                        } else {
                            hashMap = hashMap2;
                            it = it2;
                        }
                        next.mo13209c(currentTimeMillis - (((long) i) * 86400000));
                        long h = next.mo13214h();
                        aVar.mo13285b(h);
                        if (C3318a.m13915u()) {
                            C3350b.m13932a(C3159a.f10110a, "weedOut:name:" + aVar.mo13281a() + " afterSize:" + aVar.mo13284b());
                        }
                        j2 += h;
                        hashMap2 = hashMap;
                        it2 = it;
                    }
                    while (true) {
                        i--;
                        if (j2 > j && i > 0) {
                            j2 = 0;
                            for (AbstractC3208d dVar : C3206c.this.f10260a) {
                                dVar.mo13209c(currentTimeMillis - (((long) i) * 86400000));
                                long h2 = dVar.mo13214h();
                                C3204a aVar2 = (C3204a) hashMap2.get(dVar.mo13213g());
                                if (aVar2 != null) {
                                    aVar2.mo13285b(h2);
                                }
                                j2 += dVar.mo13214h();
                            }
                        }
                    }
                    if (C3206c.this.f10261b != null) {
                        C3206c.this.f10261b.mo13287a(new ArrayList(hashMap2.values()));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public synchronized void mo13289a(AbstractC3205b bVar) {
        this.f10261b = bVar;
    }

    /* renamed from: a */
    public synchronized void mo13290a(AbstractC3208d dVar) {
        if (dVar != null) {
            this.f10260a.add(dVar);
        }
    }

    /* renamed from: a */
    public void mo13288a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f10262c = i;
            this.f10263d = i2;
            if (C3318a.m13915u()) {
                String str = C3159a.f10110a;
                C3350b.m13932a(str, "weed out config:maxSizeMB:" + i + " keepDays:" + i2);
            }
        }
    }
}
