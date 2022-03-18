package com.bytedance.apm.battery.p131b;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.battery.C2795a;
import com.bytedance.apm.battery.dao.p135a.C2831a;
import com.bytedance.apm.battery.p132c.AbstractC2823h;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3122i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.b.a */
public class C2803a {

    /* renamed from: a */
    public volatile boolean f8948a;

    /* renamed from: b */
    public final LinkedList<C2878a> f8949b;

    /* renamed from: c */
    private String f8950c;

    /* renamed from: d */
    private String f8951d;

    /* renamed from: e */
    private C2831a f8952e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.battery.b.a$a */
    public static class C2806a {

        /* renamed from: a */
        public static final C2803a f8956a = new C2803a();
    }

    /* renamed from: a */
    public static C2803a m11844a() {
        return C2806a.f8956a;
    }

    private C2803a() {
        this.f8950c = "";
        this.f8949b = new LinkedList<>();
    }

    /* renamed from: e */
    private C2831a m11850e() {
        if (this.f8952e == null) {
            this.f8952e = C2831a.m11977e();
        }
        return this.f8952e;
    }

    /* renamed from: b */
    public void mo12135b() {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.battery.p131b.C2803a.RunnableC28052 */

            public void run() {
                LinkedList linkedList;
                C2803a.this.mo12137c();
                C2803a.this.f8948a = true;
                synchronized (C2803a.this.f8949b) {
                    linkedList = new LinkedList(C2803a.this.f8949b);
                    C2803a.this.f8949b.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C2803a.this.mo12133a((C2878a) it.next());
                }
            }
        });
    }

    /* renamed from: d */
    public JSONObject mo12138d() {
        JSONObject jSONObject = new JSONObject();
        List<C2878a> a = m11845a(true, 0L);
        if (C3122i.m13009a(a)) {
            return jSONObject;
        }
        C2807b bVar = new C2807b();
        if (m11848b(bVar, a)) {
            try {
                JSONObject c = bVar.mo12149c(true);
                if (c != null) {
                    return c;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public void mo12137c() {
        boolean z;
        if (C2785b.m11761e()) {
            C2807b bVar = new C2807b();
            List<C2878a> a = m11845a(true, 0L);
            if (!C3122i.m13009a(a)) {
                try {
                    z = m11847a(bVar, a);
                } catch (Exception unused) {
                    z = false;
                }
                C2878a aVar = a.get(a.size() - 1);
                long m = aVar.mo12353m();
                long d = aVar.mo12344d();
                if (!z) {
                    if (C2785b.m11769j()) {
                        C2925e.m12373b(C2922b.f9427b, "report main process data failed, clean data and stop calc data of other process");
                    }
                    m11846a(m);
                    return;
                }
                if (C2785b.m11769j()) {
                    C2925e.m12374c(C2922b.f9427b, "report main process data over, begin handle other process data");
                }
                List<C2878a> a2 = m11845a(false, d);
                HashMap hashMap = new HashMap(4);
                for (C2878a aVar2 : a2) {
                    String j = aVar2.mo12350j();
                    List list = (List) hashMap.get(j);
                    if (list != null) {
                        list.add(aVar2);
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(aVar2);
                        hashMap.put(j, linkedList);
                    }
                }
                try {
                    for (List<C2878a> list2 : hashMap.values()) {
                        m11847a(bVar, list2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                bVar.mo12150c();
                m11846a(m);
            }
        }
    }

    /* renamed from: a */
    private void m11846a(long j) {
        try {
            m11850e().mo12209a(j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo12134a(String str) {
        this.f8950c = str;
    }

    /* renamed from: c */
    private void m11849c(C2878a aVar) {
        try {
            if (C2785b.m11769j()) {
                String str = C2922b.f9427b;
                C2925e.m12374c(str, "saveBatteryLog into db: " + aVar);
            }
            m11850e().mo12207a(aVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo12133a(final C2878a aVar) {
        if (aVar != null) {
            if (C2785b.m11769j()) {
                String str = C2922b.f9427b;
                C2925e.m12374c(str, "record batteryLog: " + aVar.toString());
            }
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.battery.p131b.C2803a.RunnableC28041 */

                public void run() {
                    C2803a.this.mo12136b(aVar);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo12136b(C2878a aVar) {
        if (C2785b.m11769j()) {
            String str = C2922b.f9427b;
            C2925e.m12374c(str, "record batteryLog: " + aVar.toString() + " , mReportedInMainProcess: " + this.f8948a);
        }
        if (this.f8948a || !C2785b.m11761e()) {
            if (TextUtils.isEmpty(this.f8951d)) {
                this.f8951d = String.valueOf(System.currentTimeMillis());
            }
            aVar.mo12337a(C2785b.m11761e());
            aVar.mo12340b(C2785b.m11756d());
            aVar.mo12343c(this.f8951d);
            if (TextUtils.isEmpty(aVar.mo12347g())) {
                aVar.mo12336a(this.f8950c);
            }
            m11849c(aVar);
            return;
        }
        aVar.mo12336a(this.f8950c);
        synchronized (this.f8949b) {
            if (this.f8949b.size() > 100) {
                this.f8949b.poll();
            }
            this.f8949b.add(aVar);
        }
    }

    /* renamed from: a */
    private List<C2878a> m11845a(boolean z, long j) {
        try {
            return m11850e().mo12208a(z, j);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    private boolean m11848b(C2807b bVar, List<C2878a> list) {
        Map<String, AbstractC2823h> f = C2795a.m11824a().mo12124f();
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (C2878a aVar : list) {
            if (str == null || !str.equals(aVar.mo12352l())) {
                str = aVar.mo12352l();
                sb.append(str);
            }
            if (!"ground_record".equals(aVar.f9206b)) {
                AbstractC2823h hVar = f.get(aVar.f9206b);
                if (hVar != null) {
                    hVar.mo12186a(bVar, aVar);
                }
            } else if (aVar.mo12338a()) {
                bVar.mo12156f(aVar.mo12342c());
            } else {
                bVar.mo12141a(aVar.mo12342c());
            }
        }
        C2878a aVar2 = list.get(0);
        bVar.mo12143a(aVar2.mo12351k());
        bVar.mo12142a(aVar2.mo12350j());
        bVar.mo12147b(sb.toString());
        return true;
    }

    /* renamed from: a */
    private boolean m11847a(C2807b bVar, List<C2878a> list) throws Exception {
        boolean z;
        Map<String, AbstractC2823h> f = C2795a.m11824a().mo12124f();
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (C2878a aVar : list) {
            if (str == null || !str.equals(aVar.mo12352l())) {
                str = aVar.mo12352l();
                sb.append(str);
            }
            if (!"ground_record".equals(aVar.f9206b)) {
                AbstractC2823h hVar = f.get(aVar.f9206b);
                if (hVar != null) {
                    hVar.mo12186a(bVar, aVar);
                }
            } else if (aVar.mo12338a()) {
                bVar.mo12156f(aVar.mo12342c());
            } else {
                bVar.mo12141a(aVar.mo12342c());
            }
        }
        C2878a aVar2 = list.get(0);
        bVar.mo12143a(aVar2.mo12351k());
        if (!bVar.mo12144a() || (bVar.mo12153d() && bVar.mo12155e())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.mo12145b();
            if (C2785b.m11769j()) {
                C2925e.m12373b(C2922b.f9427b, "main process front or back duration is not valid, stop report ");
            }
            return false;
        }
        bVar.mo12142a(aVar2.mo12350j());
        bVar.mo12147b(sb.toString());
        return bVar.mo12148b(true);
    }
}
