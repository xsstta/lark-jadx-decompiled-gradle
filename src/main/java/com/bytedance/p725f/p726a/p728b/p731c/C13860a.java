package com.bytedance.p725f.p726a.p728b.p731c;

import android.content.Context;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p728b.AbstractC13858b;
import com.bytedance.p725f.p726a.p733c.C13868c;
import com.bytedance.p725f.p726a.p733c.C13869d;
import com.bytedance.p725f.p726a.p733c.C13870e;
import com.bytedance.p725f.p726a.p733c.C13871f;
import com.bytedance.p725f.p726a.p734d.C13880b;
import com.bytedance.p725f.p726a.p734d.C13883d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.f.a.b.c.a */
public class C13860a extends AbstractC13858b {

    /* renamed from: c */
    private boolean f36262c;

    /* renamed from: d */
    private C13870e f36263d = new C13870e();

    /* renamed from: e */
    private C13863d f36264e = new C13863d();

    /* renamed from: f */
    private Map<Long, C13870e> f36265f = new HashMap();

    /* renamed from: g */
    private Map<Long, C13863d> f36266g = new HashMap();

    /* renamed from: h */
    private C13871f f36267h = new C13871f();

    /* renamed from: i */
    private C13861b f36268i = new C13861b();

    /* renamed from: j */
    private C13868c f36269j = new C13868c();

    /* renamed from: k */
    private C13862c f36270k = new C13862c();

    /* renamed from: l */
    private Map<Long, C13869d> f36271l = new HashMap();

    /* renamed from: m */
    private Map<Long, C13864e> f36272m = new HashMap();

    /* renamed from: a */
    private boolean m56208a(int i) {
        return i == 2;
    }

    /* renamed from: b */
    private boolean m56209b(int i) {
        return i == 3;
    }

    @Override // com.bytedance.p725f.p726a.p728b.AbstractC13858b
    /* renamed from: a */
    public void mo51114a() {
        if (!this.f36262c) {
            this.f36262c = true;
            mo51122e();
        }
    }

    @Override // com.bytedance.p725f.p726a.p728b.AbstractC13858b
    /* renamed from: b */
    public void mo51115b() {
        if (this.f36262c) {
            this.f36262c = false;
            m56210h();
        }
    }

    /* renamed from: g */
    public AbstractC13853c.C13855b mo51124g() {
        return m56206a(mo51123f());
    }

    /* renamed from: e */
    public void mo51122e() {
        if (this.f36262c) {
            if (this.f36254b.mo51096a().mo51092d()) {
                mo51120c();
            }
            mo51121d();
        }
    }

    /* renamed from: f */
    public List<List<Integer>> mo51123f() {
        return m56207a(this.f36264e.mo51145c(), this.f36264e.mo51148f());
    }

    /* renamed from: h */
    private void m56210h() {
        this.f36264e.mo51149g();
        this.f36265f.clear();
        this.f36266g.clear();
        this.f36268i.mo51129c();
        this.f36270k.mo51138c();
        this.f36271l.clear();
        this.f36272m.clear();
    }

    /* renamed from: c */
    public void mo51120c() {
        C13861b bVar = (C13861b) this.f36267h.mo51152a();
        bVar.mo51126a(this.f36268i);
        long a = bVar.mo51125a();
        C13862c cVar = (C13862c) this.f36269j.mo51152a();
        cVar.mo51134a(this.f36270k);
        cVar.mo51133a(a);
        ArrayList<Long> a2 = C13883d.m56276a();
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = a2.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            C13869d dVar = this.f36271l.get(Long.valueOf(longValue));
            if (dVar == null) {
                dVar = new C13869d(longValue);
                this.f36271l.put(Long.valueOf(longValue), dVar);
            }
            C13864e eVar = (C13864e) dVar.mo51152a();
            if (eVar == null) {
                arrayList.add(Long.valueOf(longValue));
            } else {
                eVar.mo51134a(this.f36272m.get(Long.valueOf(longValue)));
                eVar.mo51133a(a);
                this.f36272m.put(Long.valueOf(longValue), eVar);
                C13880b.m56265a("current tid stat : " + eVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Long) it2.next()).longValue();
            this.f36271l.remove(Long.valueOf(longValue2));
            this.f36272m.remove(Long.valueOf(longValue2));
        }
        this.f36268i = bVar;
        this.f36270k = cVar;
    }

    /* renamed from: d */
    public void mo51121d() {
        if (this.f36254b.mo51096a().mo51093e()) {
            C13863d dVar = (C13863d) this.f36263d.mo51152a();
            dVar.mo51141a(this.f36264e);
            this.f36264e = dVar;
        }
        ArrayList<Long> a = C13883d.m56276a();
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = a.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            C13870e eVar = this.f36265f.get(Long.valueOf(longValue));
            if (eVar == null) {
                eVar = new C13870e((int) longValue);
                this.f36265f.put(Long.valueOf(longValue), eVar);
            }
            C13863d dVar2 = (C13863d) eVar.mo51152a();
            if (dVar2 == null) {
                arrayList.add(Long.valueOf(longValue));
                C13880b.m56265a("remove tid : " + longValue);
            } else {
                dVar2.mo51141a(this.f36266g.get(Long.valueOf(longValue)));
                this.f36266g.put(Long.valueOf(longValue), dVar2);
                if (this.f36254b.mo51096a().mo51093e()) {
                    this.f36264e.mo51144b(dVar2);
                }
                C13880b.m56265a("current tid " + longValue + " stat : " + dVar2);
                C13880b.m56265a("current tid " + longValue + " delta : " + dVar2.mo51147e());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Long) it2.next()).longValue();
            this.f36265f.remove(Long.valueOf(longValue2));
            this.f36266g.remove(Long.valueOf(longValue2));
        }
    }

    /* renamed from: a */
    private AbstractC13853c.C13855b m56206a(List<List<Integer>> list) {
        boolean a = m56208a(list.size());
        boolean b = m56209b(list.size());
        AbstractC13853c.C13855b bVar = new AbstractC13853c.C13855b();
        int i = 0;
        for (List<Integer> list2 : list) {
            if (list2 != null && list2.size() >= 5) {
                if (i == 0) {
                    bVar.f36228a = (float) list2.get(0).intValue();
                    bVar.f36229b = (float) list2.get(1).intValue();
                    bVar.f36230c = (float) list2.get(2).intValue();
                    bVar.f36231d = (float) list2.get(3).intValue();
                    float intValue = (float) list2.get(4).intValue();
                    bVar.f36228a = intValue;
                    bVar.f36232e = intValue;
                }
                if (i == 1 && b) {
                    bVar.f36233f = (float) list2.get(0).intValue();
                    bVar.f36234g = (float) list2.get(1).intValue();
                    bVar.f36235h = (float) list2.get(2).intValue();
                    bVar.f36236i = (float) list2.get(3).intValue();
                    bVar.f36237j = (float) list2.get(4).intValue();
                }
                if (i == 1 && a) {
                    bVar.f36233f = BitmapDescriptorFactory.HUE_RED;
                    bVar.f36234g = BitmapDescriptorFactory.HUE_RED;
                    bVar.f36235h = BitmapDescriptorFactory.HUE_RED;
                    bVar.f36236i = BitmapDescriptorFactory.HUE_RED;
                    bVar.f36237j = BitmapDescriptorFactory.HUE_RED;
                    bVar.f36238k = (float) list2.get(0).intValue();
                    bVar.f36239l = (float) list2.get(1).intValue();
                    bVar.f36240m = (float) list2.get(2).intValue();
                    bVar.f36241n = (float) list2.get(3).intValue();
                    bVar.f36242o = (float) list2.get(4).intValue();
                }
                if (i == 2 && b) {
                    bVar.f36238k = (float) list2.get(0).intValue();
                    bVar.f36239l = (float) list2.get(1).intValue();
                    bVar.f36240m = (float) list2.get(2).intValue();
                    bVar.f36241n = (float) list2.get(3).intValue();
                    bVar.f36242o = (float) list2.get(4).intValue();
                }
                i++;
            }
        }
        return bVar;
    }

    public C13860a(Context context, AbstractC13853c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    private List<List<Integer>> m56207a(List<LinkedHashMap<Long, Long>> list, long j) {
        if (list == null) {
            return null;
        }
        long j2 = 0;
        if (j <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkedHashMap<Long, Long> linkedHashMap : list) {
            ArrayList arrayList2 = new ArrayList();
            int size = linkedHashMap.size() / 4;
            int i = 0;
            long j3 = j2;
            long j4 = j3;
            int i2 = 0;
            for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                Long key = entry.getKey();
                Long value = entry.getValue();
                if (!(key == null || value == null)) {
                    j4 += value.longValue();
                    if (i < 3) {
                        if (i2 < size) {
                            j3 += value.longValue();
                            i2++;
                        } else {
                            arrayList2.add(Integer.valueOf((int) ((((double) j3) / ((double) j)) * 100.0d)));
                            j3 = value.longValue();
                            i++;
                            i2 = 1;
                        }
                    } else if (i == 3) {
                        j3 += value.longValue();
                    }
                }
            }
            double d = (double) j;
            arrayList2.add(Integer.valueOf((int) ((((double) j3) / d) * 100.0d)));
            arrayList2.add(Integer.valueOf((int) ((((double) j4) / d) * 100.0d)));
            arrayList.add(arrayList2);
            j2 = 0;
        }
        return arrayList;
    }
}
