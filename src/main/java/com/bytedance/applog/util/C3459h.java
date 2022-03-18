package com.bytedance.applog.util;

import com.bytedance.applog.AbstractC3387c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.util.h */
public class C3459h implements AbstractC3387c {

    /* renamed from: a */
    private static volatile C3459h f10980a;

    /* renamed from: b */
    private final CopyOnWriteArraySet<AbstractC3387c> f10981b = new CopyOnWriteArraySet<>();

    private C3459h() {
    }

    /* renamed from: a */
    public static C3459h m14609a() {
        if (f10980a == null) {
            synchronized (C3459h.class) {
                if (f10980a == null) {
                    f10980a = new C3459h();
                }
            }
        }
        return f10980a;
    }

    /* renamed from: a */
    public void mo13906a(AbstractC3387c cVar) {
        if (cVar != null) {
            this.f10981b.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo13907b(AbstractC3387c cVar) {
        if (cVar != null) {
            this.f10981b.remove(cVar);
        }
    }

    @Override // com.bytedance.applog.AbstractC3387c
    /* renamed from: a */
    public void mo13638a(String str, JSONObject jSONObject) {
        Iterator<AbstractC3387c> it = this.f10981b.iterator();
        while (it.hasNext()) {
            it.next().mo13638a(str, jSONObject);
        }
    }

    @Override // com.bytedance.applog.AbstractC3387c
    /* renamed from: a */
    public void mo13637a(String str, String str2, String str3, long j, long j2, String str4) {
        Iterator<AbstractC3387c> it = this.f10981b.iterator();
        while (it.hasNext()) {
            it.next().mo13637a(str, str2, str3, j, j2, str4);
        }
    }
}
