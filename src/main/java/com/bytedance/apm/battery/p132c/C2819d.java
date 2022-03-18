package com.bytedance.apm.battery.p132c;

import android.app.PendingIntent;
import com.bytedance.apm.battery.C2795a;
import com.bytedance.apm.battery.config.C2824a;
import com.bytedance.apm.battery.p130a.AbstractC2801d;
import com.bytedance.apm.battery.p131b.C2803a;
import com.bytedance.apm.battery.p131b.C2807b;
import com.bytedance.apm.battery.p132c.p133a.C2813a;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p137c.C2878a;
import com.bytedance.apm.p143i.C2949b;
import com.bytedance.apm.util.C3120g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c.d */
public class C2819d extends AbstractC2818c<C2813a> implements AbstractC2801d {

    /* renamed from: d */
    private int[] f9017d;

    /* renamed from: e */
    private int f9018e;

    /* renamed from: f */
    private List<Long> f9019f = new ArrayList();

    /* renamed from: g */
    private int f9020g;

    /* renamed from: h */
    private final Object f9021h = new Object();

    /* renamed from: i */
    private final List<Long> f9022i = new ArrayList();

    @Override // com.bytedance.apm.battery.p130a.AbstractC2801d
    /* renamed from: a */
    public String mo12131a() {
        return "android.app.IAlarmManager";
    }

    public C2819d() {
        super("alarm");
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c, com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: b */
    public void mo12167b() {
        super.mo12167b();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9021h) {
            this.f9019f.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c, com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: c */
    public void mo12168c() {
        super.mo12168c();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9021h) {
            this.f9019f.add(Long.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: e */
    private void m11913e() {
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.f9017d;
        int i = 0;
        double d = ((((double) iArr[0]) + ((double) iArr[1])) / ((double) (currentTimeMillis - this.f9013a))) * 60000.0d * 10.0d;
        double d2 = (((double) this.f9018e) / ((double) (currentTimeMillis - this.f9013a))) * 60000.0d * 10.0d;
        if (d >= ((double) C2824a.m11950d())) {
            i = 49;
        }
        if (d2 >= ((double) C2824a.m11953e())) {
            i |= 50;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("wake_up_count", d).put("normal_count", d2);
                if (this.f9015c != null && this.f9015c.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2813a aVar : this.f9015c.values()) {
                        jSONArray.put(aVar.mo12174c());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                C2949b.m12422a(jSONObject, "battery_trace");
                C2741a.m11630c().mo11785a(new C2751d("battery_trace", jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m11912b(Object[] objArr) {
        int i;
        if (objArr[0] == null || !(objArr[0] instanceof PendingIntent)) {
            i = -1;
        } else {
            i = objArr[0].hashCode();
        }
        C2813a aVar = (C2813a) this.f9015c.get(Integer.valueOf(i));
        if (aVar != null && aVar.f9000b > 0) {
            aVar.f9003e = System.currentTimeMillis();
            this.f9015c.put(Integer.valueOf(i), aVar);
        }
    }

    /* renamed from: a */
    private void m11911a(Object[] objArr) {
        long j;
        C2813a aVar = new C2813a();
        boolean z = false;
        int i = 0;
        int i2 = -1;
        for (Object obj : objArr) {
            if ((obj instanceof Integer) && !z) {
                aVar.f8999a = ((Integer) obj).intValue();
                z = true;
            } else if (obj instanceof Long) {
                if (i == 0) {
                    aVar.f9002d = ((Long) obj).longValue();
                    aVar.f9002d = aVar.mo12172a();
                } else if (i == 2) {
                    aVar.f9000b = ((Long) obj).longValue();
                }
                i++;
            } else if (obj instanceof PendingIntent) {
                PendingIntent pendingIntent = (PendingIntent) obj;
                aVar.f9001c = C3120g.m12995a(pendingIntent);
                i2 = pendingIntent.hashCode();
            }
        }
        if (i2 != -1) {
            if (aVar.f9000b == 0) {
                j = aVar.f9002d;
            } else {
                j = -1;
            }
            aVar.f9003e = j;
            if (C2795a.m11824a().mo12125g()) {
                aVar.f9004f = Thread.currentThread().getName();
                aVar.f9005g = Thread.currentThread().getStackTrace();
            }
            this.f9015c.put(Integer.valueOf(i2), aVar);
        }
    }

    @Override // com.bytedance.apm.battery.p132c.AbstractC2823h
    /* renamed from: a */
    public void mo12186a(C2807b bVar, C2878a aVar) {
        if (mo12185f().equals(aVar.f9206b)) {
            if (aVar.mo12341b()) {
                bVar.mo12154e(aVar.mo12342c());
            } else {
                bVar.mo12160j(aVar.mo12342c());
            }
        }
    }

    /* renamed from: a */
    private void m11910a(int[] iArr, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if ((!this.f9014b || i % 2 != 0) && (this.f9014b || i % 2 != 1)) {
            C2803a.m11844a().mo12133a(new C2878a(true, currentTimeMillis, mo12185f(), (long) iArr[0]));
            C2803a.m11844a().mo12133a(new C2878a(false, currentTimeMillis, mo12185f(), (long) iArr[1]));
            return;
        }
        C2803a.m11844a().mo12133a(new C2878a(false, currentTimeMillis, mo12185f(), (long) iArr[0]));
        C2803a.m11844a().mo12133a(new C2878a(true, currentTimeMillis, mo12185f(), (long) iArr[1]));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p132c.AbstractC2818c
    /* renamed from: a */
    public void mo12164a(long j, long j2) {
        this.f9018e = 0;
        this.f9017d = new int[2];
        this.f9022i.add(Long.valueOf(j));
        synchronized (this.f9021h) {
            this.f9022i.addAll(this.f9019f);
            this.f9019f.clear();
        }
        this.f9022i.add(Long.valueOf(j2));
        this.f9020g = 1;
        while (this.f9020g < this.f9022i.size()) {
            super.mo12164a(this.f9022i.get(this.f9020g - 1).longValue(), this.f9022i.get(this.f9020g).longValue());
            this.f9020g++;
        }
        int[] iArr = this.f9017d;
        if (iArr[0] + iArr[1] != 0) {
            m11910a(iArr, this.f9022i.size());
        }
        this.f9022i.clear();
        m11913e();
    }

    @Override // com.bytedance.apm.battery.p130a.AbstractC2801d
    /* renamed from: a */
    public void mo12132a(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("set".equals(name)) {
                m11911a(objArr);
            } else if ("remove".equals(name)) {
                m11912b(objArr);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12166a(C2813a aVar, long j, long j2) {
        int i = 1;
        if (aVar.f9000b > 0) {
            long j3 = aVar.f9002d;
            if (j3 < j) {
                j3 = (aVar.f9000b + j) - ((j - aVar.f9002d) % aVar.f9000b);
            }
            long j4 = aVar.f9003e;
            if (j4 <= j2 && aVar.f9003e > 0) {
                j2 = j4;
            }
            long j5 = j2 - j3;
            if (j5 > 0) {
                i = 1 + ((int) (j5 / aVar.f9000b));
            } else {
                return;
            }
        } else if (j > aVar.f9002d || aVar.f9002d > j2) {
            return;
        }
        if (aVar.mo12173b()) {
            int[] iArr = this.f9017d;
            int i2 = this.f9020g % 2;
            iArr[i2] = iArr[i2] + i;
            return;
        }
        this.f9018e += i;
    }
}
