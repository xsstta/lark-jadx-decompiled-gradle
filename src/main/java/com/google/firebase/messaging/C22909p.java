package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.p */
public final class C22909p {

    /* renamed from: a */
    private final SharedPreferences f56616a;

    /* renamed from: b */
    private final String f56617b;

    /* renamed from: c */
    private final String f56618c;

    /* renamed from: d */
    private final ArrayDeque<String> f56619d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f56620e;

    /* renamed from: f */
    private boolean f56621f = false;

    /* renamed from: e */
    private final void m83246e() {
        this.f56620e.execute(new RunnableC22910q(this));
    }

    /* renamed from: b */
    public final String mo79529b() {
        String peek;
        synchronized (this.f56619d) {
            peek = this.f56619d.peek();
        }
        return peek;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void mo79530c() {
        synchronized (this.f56619d) {
            this.f56616a.edit().putString(this.f56617b, mo79527a()).commit();
        }
    }

    /* renamed from: a */
    public final String mo79527a() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f56619d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f56618c);
        }
        return sb.toString();
    }

    /* renamed from: d */
    private final void m83245d() {
        synchronized (this.f56619d) {
            this.f56619d.clear();
            String string = this.f56616a.getString(this.f56617b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(this.f56618c)) {
                    String[] split = string.split(this.f56618c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f56619d.add(str);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m83244a(boolean z) {
        if (z && !this.f56621f) {
            m83246e();
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo79528a(Object obj) {
        boolean a;
        synchronized (this.f56619d) {
            a = m83244a(this.f56619d.remove(obj));
        }
        return a;
    }

    /* renamed from: a */
    static C22909p m83243a(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C22909p pVar = new C22909p(sharedPreferences, str, str2, executor);
        pVar.m83245d();
        return pVar;
    }

    private C22909p(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f56616a = sharedPreferences;
        this.f56617b = str;
        this.f56618c = str2;
        this.f56620e = executor;
    }
}
