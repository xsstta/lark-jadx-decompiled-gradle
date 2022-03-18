package com.bytedance.framwork.core.p748a;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.framwork.core.a.d */
public final class C14117d {

    /* renamed from: a */
    private static C14117d f37092a;

    /* renamed from: b */
    private final Context f37093b;

    /* renamed from: c */
    private final Map<String, AbstractC14109a> f37094c = new ConcurrentHashMap();

    /* renamed from: d */
    private final C14119f f37095d;

    /* renamed from: e */
    private final AtomicBoolean f37096e;

    /* renamed from: f */
    private final LinkedList<C14113b> f37097f;

    /* renamed from: a */
    static void m57119a(String str) {
    }

    /* renamed from: a */
    static void m57120a(String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo51880b() {
        return this.f37096e.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, AbstractC14109a> mo51876a() {
        return this.f37094c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC14109a mo51879b(String str) {
        return this.f37094c.get(str);
    }

    /* renamed from: a */
    public static C14117d m57118a(Context context) {
        if (f37092a == null) {
            synchronized (C14117d.class) {
                if (f37092a == null) {
                    f37092a = new C14117d(context);
                }
            }
        }
        return f37092a;
    }

    private C14117d(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f37096e = atomicBoolean;
        LinkedList<C14113b> linkedList = new LinkedList<>();
        this.f37097f = linkedList;
        Context applicationContext = context.getApplicationContext();
        this.f37093b = applicationContext;
        C14119f fVar = new C14119f(applicationContext, this, linkedList, atomicBoolean);
        this.f37095d = fVar;
        fVar.start();
    }

    /* renamed from: a */
    public void mo51877a(String str, AbstractC14109a aVar) {
        if (!mo51880b() && aVar != null) {
            this.f37094c.put(str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo51878a(String str, byte[] bArr) {
        if (mo51880b() || bArr == null || bArr.length <= 0 || mo51879b(str) == null) {
            return false;
        }
        synchronized (this.f37097f) {
            if (this.f37096e.get()) {
                return false;
            }
            if (this.f37097f.size() >= 2000) {
                this.f37097f.poll();
            }
            boolean add = this.f37097f.add(new C14113b(str, bArr));
            this.f37095d.mo51888a();
            return add;
        }
    }
}
