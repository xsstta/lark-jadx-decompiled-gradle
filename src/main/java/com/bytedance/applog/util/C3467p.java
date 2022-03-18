package com.bytedance.applog.util;

import com.bytedance.applog.AbstractC3423i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.util.p */
public class C3467p implements AbstractC3423i {

    /* renamed from: a */
    private static volatile C3467p f10987a;

    /* renamed from: b */
    private final CopyOnWriteArraySet<AbstractC3423i> f10988b = new CopyOnWriteArraySet<>();

    private C3467p() {
    }

    /* renamed from: a */
    public static C3467p m14657a() {
        if (f10987a == null) {
            synchronized (C3467p.class) {
                f10987a = new C3467p();
            }
        }
        return f10987a;
    }

    /* renamed from: a */
    public void mo13912a(AbstractC3423i iVar) {
        if (iVar != null) {
            this.f10988b.add(iVar);
        }
    }

    /* renamed from: b */
    public void mo13913b(AbstractC3423i iVar) {
        if (iVar != null) {
            this.f10988b.remove(iVar);
        }
    }

    @Override // com.bytedance.applog.AbstractC3423i
    /* renamed from: a */
    public void mo13719a(long j, String str) {
        Iterator<AbstractC3423i> it = this.f10988b.iterator();
        while (it.hasNext()) {
            it.next().mo13719a(j, str);
        }
    }

    @Override // com.bytedance.applog.AbstractC3423i
    /* renamed from: a */
    public void mo13720a(long j, String str, JSONObject jSONObject) {
        Iterator<AbstractC3423i> it = this.f10988b.iterator();
        while (it.hasNext()) {
            it.next().mo13720a(j, str, jSONObject);
        }
    }
}
