package com.bytedance.p725f.p726a.p728b.p731c;

import com.bytedance.p725f.p726a.p733c.AbstractC13867b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.f.a.b.c.b */
public class C13861b implements AbstractC13867b {

    /* renamed from: a */
    private List<LinkedHashMap<Long, Long>> f36273a = new ArrayList();

    /* renamed from: b */
    private long f36274b = 0;

    /* renamed from: c */
    private long f36275c = 0;

    /* renamed from: d */
    private long f36276d = 0;

    /* renamed from: a */
    public long mo51125a() {
        return this.f36275c;
    }

    /* renamed from: c */
    public void mo51129c() {
        this.f36273a.clear();
        this.f36274b = 0;
        this.f36275c = 0;
        this.f36276d = 0;
    }

    public String toString() {
        return "cputime:{" + "deltaTime:" + mo51125a() + " totaltime:" + mo51128b() + "}";
    }

    /* renamed from: b */
    public long mo51128b() {
        if (this.f36274b == 0 && !this.f36273a.isEmpty()) {
            for (LinkedHashMap<Long, Long> linkedHashMap : this.f36273a) {
                for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                    this.f36274b += entry.getValue().longValue();
                }
            }
        }
        return this.f36274b;
    }

    /* renamed from: a */
    public void mo51127a(LinkedHashMap<Long, Long> linkedHashMap) {
        this.f36273a.add(linkedHashMap);
    }

    /* renamed from: a */
    public void mo51126a(AbstractC13867b bVar) {
        if (bVar != null) {
            long b = mo51128b() - ((C13861b) bVar).mo51128b();
            this.f36275c = b;
            if (this.f36276d == 0) {
                this.f36276d = b;
            }
        }
    }
}
