package com.ss.android.lark.mail.impl.p2161a;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.lark.mail.impl.a.a */
public class C41772a<T> extends C1177w<T> {

    /* renamed from: a */
    private final AtomicReference<String> f106056a = new AtomicReference<>("");

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo150231d(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo150232f() {
        String g = m165917g();
        String andSet = this.f106056a.getAndSet(g);
        if (TextUtils.isEmpty(andSet) || TextUtils.equals(g, andSet)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private String m165917g() {
        String f = C41816b.m166115a().mo150139f();
        if (TextUtils.isEmpty(f)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f);
        C42093e l = C43277a.m171921a().mo154948l();
        if (l != null && !TextUtils.isEmpty(l.mo151848b())) {
            sb.append("_");
            sb.append(l.mo151848b());
        }
        return sb.toString();
    }

    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5926a(T t) {
        if (mo150230c(t)) {
            super.mo5926a((Object) t);
            mo150231d(t);
        }
    }

    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: b */
    public void mo5929b(T t) {
        if (mo150230c(t)) {
            super.mo5929b((Object) t);
            mo150231d(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo150230c(T t) {
        boolean z;
        boolean z2;
        T b = mo5927b();
        boolean z3 = false;
        if (b == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            z2 = !b.equals(t);
        } else {
            if (t != null) {
                z3 = true;
            }
            z2 = z3;
        }
        if (!z2) {
            return mo150232f();
        }
        return z2;
    }
}
