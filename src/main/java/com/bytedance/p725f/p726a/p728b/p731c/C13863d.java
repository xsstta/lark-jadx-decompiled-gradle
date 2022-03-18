package com.bytedance.p725f.p726a.p728b.p731c;

import com.bytedance.p725f.p726a.p733c.AbstractC13867b;
import com.bytedance.p725f.p726a.p734d.C13872a;
import com.bytedance.p725f.p726a.p734d.C13880b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.f.a.b.c.d */
public class C13863d implements AbstractC13867b {

    /* renamed from: a */
    private List<LinkedHashMap<Long, Long>> f36284a = new ArrayList();

    /* renamed from: b */
    private List<LinkedHashMap<Long, Long>> f36285b = new ArrayList();

    /* renamed from: c */
    private List<LinkedHashMap<Long, Long>> f36286c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f36287d = C13872a.m56257d();

    /* renamed from: e */
    private long f36288e = 0;

    /* renamed from: f */
    private long f36289f = 0;

    /* renamed from: g */
    private long f36290g = 0;

    /* renamed from: a */
    public List<LinkedHashMap<Long, Long>> mo51140a() {
        return this.f36284a;
    }

    /* renamed from: b */
    public List<LinkedHashMap<Long, Long>> mo51143b() {
        return this.f36285b;
    }

    /* renamed from: c */
    public List<LinkedHashMap<Long, Long>> mo51145c() {
        return this.f36286c;
    }

    /* renamed from: d */
    public long mo51146d() {
        if (this.f36288e == 0) {
            this.f36288e = m56231a(this.f36284a);
        }
        return this.f36288e;
    }

    /* renamed from: e */
    public long mo51147e() {
        if (this.f36289f == 0) {
            this.f36289f = m56231a(this.f36285b);
        }
        return this.f36289f;
    }

    /* renamed from: f */
    public long mo51148f() {
        if (this.f36290g == 0) {
            this.f36290g = m56231a(this.f36286c);
        }
        return this.f36290g;
    }

    /* renamed from: g */
    public void mo51149g() {
        this.f36284a.clear();
        this.f36285b.clear();
        this.f36286c.clear();
        this.f36288e = 0;
        this.f36289f = 0;
        this.f36290g = 0;
    }

    public String toString() {
        return "ProcTimeInStateInfo{freqTimeMapList=" + this.f36284a + ", freqDeltaTimeMapList=" + this.f36285b + ", totalCpuTime=" + mo51146d() + ", totalDeltaCpuTime=" + mo51147e() + ", totalMergeCpuTime=" + mo51148f() + '}';
    }

    /* renamed from: a */
    public void mo51142a(LinkedHashMap<Long, Long> linkedHashMap) {
        if (linkedHashMap != null) {
            this.f36284a.add(linkedHashMap);
        }
    }

    /* renamed from: a */
    private long m56231a(List<LinkedHashMap<Long, Long>> list) {
        int size;
        long j = 0;
        if (list != null && !list.isEmpty() && (size = list.size()) == this.f36287d.size()) {
            for (int i = 0; i != size; i++) {
                for (Map.Entry<Long, Long> entry : list.get(i).entrySet()) {
                    j += entry.getValue().longValue();
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public void mo51141a(AbstractC13867b bVar) {
        if (bVar == null) {
            this.f36285b.addAll(this.f36284a);
            return;
        }
        List<LinkedHashMap<Long, Long>> a = ((C13863d) bVar).mo51140a();
        if (!a.isEmpty()) {
            if (this.f36284a.size() != a.size()) {
                C13880b.m56267b("calculate freqTimeDetla size error");
                return;
            }
            this.f36285b.clear();
            for (int i = 0; i != this.f36284a.size(); i++) {
                LinkedHashMap<Long, Long> linkedHashMap = a.get(i);
                LinkedHashMap<Long, Long> linkedHashMap2 = new LinkedHashMap<>();
                for (Map.Entry<Long, Long> entry : this.f36284a.get(i).entrySet()) {
                    Long key = entry.getKey();
                    Long value = entry.getValue();
                    Long l = linkedHashMap.get(key);
                    if (l != null) {
                        linkedHashMap2.put(key, Long.valueOf(value.longValue() - l.longValue()));
                    } else {
                        C13880b.m56269c("calculate freqTimeDetla freq not found " + key);
                    }
                }
                this.f36285b.add(linkedHashMap2);
            }
        }
    }

    /* renamed from: b */
    public void mo51144b(AbstractC13867b bVar) {
        if (bVar != null) {
            C13863d dVar = (C13863d) bVar;
            List<LinkedHashMap<Long, Long>> a = dVar.mo51140a();
            List<LinkedHashMap<Long, Long>> b = dVar.mo51143b();
            if (!b.isEmpty()) {
                a = b;
            }
            if (this.f36286c.isEmpty()) {
                this.f36286c.addAll(a);
                C13880b.m56265a("merge first");
                return;
            }
            int size = this.f36286c.size();
            if (size != a.size()) {
                C13880b.m56267b("merge freqTime size error");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != size; i++) {
                LinkedHashMap<Long, Long> linkedHashMap = a.get(i);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Long, Long> entry : this.f36286c.get(i).entrySet()) {
                    Long key = entry.getKey();
                    Long value = entry.getValue();
                    Long l = linkedHashMap.get(key);
                    if (l != null) {
                        linkedHashMap2.put(key, Long.valueOf(value.longValue() + l.longValue()));
                    } else {
                        C13880b.m56267b("merge freqTimeDetla freq not found " + key);
                    }
                }
                arrayList.add(linkedHashMap2);
            }
            this.f36286c = arrayList;
        }
    }
}
