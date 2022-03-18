package com.bytedance.applog.util;

import com.bytedance.applog.AbstractC3383b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.util.b */
public class C3452b implements AbstractC3383b {

    /* renamed from: a */
    private static volatile C3452b f10966a;

    /* renamed from: b */
    private final CopyOnWriteArraySet<AbstractC3383b> f10967b = new CopyOnWriteArraySet<>();

    private C3452b() {
    }

    /* renamed from: a */
    public static C3452b m14578a() {
        if (f10966a == null) {
            synchronized (C3452b.class) {
                if (f10966a == null) {
                    f10966a = new C3452b();
                }
            }
        }
        return f10966a;
    }

    /* renamed from: a */
    public void mo13896a(AbstractC3383b bVar) {
        if (bVar != null) {
            this.f10967b.add(bVar);
        }
    }

    @Override // com.bytedance.applog.AbstractC3383b
    /* renamed from: b */
    public void mo13633b(boolean z, JSONObject jSONObject) {
        Iterator<AbstractC3383b> it = this.f10967b.iterator();
        while (it.hasNext()) {
            it.next().mo13633b(z, jSONObject);
        }
    }

    @Override // com.bytedance.applog.AbstractC3383b
    /* renamed from: a */
    public void mo13629a(String str, String str2) {
        Iterator<AbstractC3383b> it = this.f10967b.iterator();
        while (it.hasNext()) {
            it.next().mo13629a(str, str2);
        }
    }

    @Override // com.bytedance.applog.AbstractC3383b
    /* renamed from: a */
    public void mo13632a(boolean z, JSONObject jSONObject) {
        Iterator<AbstractC3383b> it = this.f10967b.iterator();
        while (it.hasNext()) {
            it.next().mo13632a(z, jSONObject);
        }
    }

    @Override // com.bytedance.applog.AbstractC3383b
    /* renamed from: a */
    public void mo13630a(String str, String str2, String str3) {
        Iterator<AbstractC3383b> it = this.f10967b.iterator();
        while (it.hasNext()) {
            it.next().mo13630a(str, str2, str3);
        }
    }

    @Override // com.bytedance.applog.AbstractC3383b
    /* renamed from: a */
    public void mo13631a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Iterator<AbstractC3383b> it = this.f10967b.iterator();
        while (it.hasNext()) {
            it.next().mo13631a(z, str, str2, str3, str4, str5, str6);
        }
    }
}
