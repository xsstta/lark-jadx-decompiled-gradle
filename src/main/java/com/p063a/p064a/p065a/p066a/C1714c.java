package com.p063a.p064a.p065a.p066a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.a.a.c */
class C1714c implements AbstractC1715d {

    /* renamed from: a */
    private final ThreadLocal<String> f5837a = new ThreadLocal<>();

    /* renamed from: b */
    private final List<AbstractC1712a> f5838b = new ArrayList();

    C1714c() {
    }

    /* renamed from: a */
    private String m7633a() {
        String str = this.f5837a.get();
        if (str == null) {
            return null;
        }
        this.f5837a.remove();
        return str;
    }

    @Override // com.p063a.p064a.p065a.p066a.AbstractC1715d
    /* renamed from: a */
    public void mo8753a(String str, Object... objArr) {
        m7634a(4, (Throwable) null, str, objArr);
    }

    /* renamed from: b */
    private String m7635b(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(str, objArr);
    }

    @Override // com.p063a.p064a.p065a.p066a.AbstractC1715d
    /* renamed from: a */
    public void mo8754a(Throwable th, String str, Object... objArr) {
        m7634a(6, th, str, objArr);
    }

    /* renamed from: a */
    private synchronized void m7634a(int i, Throwable th, String str, Object... objArr) {
        C1716e.m7641a((Object) str);
        mo8752a(i, m7633a(), m7635b(str, objArr), th);
    }

    /* renamed from: a */
    public synchronized void mo8752a(int i, String str, String str2, Throwable th) {
        if (!(th == null || str2 == null)) {
            str2 = str2 + " : " + C1716e.m7642a(th);
        }
        if (th != null && str2 == null) {
            str2 = C1716e.m7642a(th);
        }
        if (C1716e.m7643a((CharSequence) str2)) {
            str2 = "Empty/NULL log message";
        }
        for (AbstractC1712a aVar : this.f5838b) {
            if (aVar.mo8751a(i, str)) {
                aVar.mo8750a(i, str, str2);
            }
        }
    }
}
