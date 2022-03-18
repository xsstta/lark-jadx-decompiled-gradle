package com.ss.android.lark.platform.network.ttnet;

import com.ss.android.lark.biz.core.api.av;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.platform.network.ttnet.e */
public class C51879e {

    /* renamed from: b */
    private static volatile C51879e f128895b;

    /* renamed from: a */
    private CopyOnWriteArrayList<av> f128896a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C51879e m201203a() {
        if (f128895b == null) {
            synchronized (C51879e.class) {
                if (f128895b == null) {
                    f128895b = new C51879e();
                }
            }
        }
        return f128895b;
    }

    /* renamed from: a */
    public void mo178055a(av avVar) {
        if (avVar != null) {
            this.f128896a.add(avVar);
        }
    }

    /* renamed from: b */
    public void mo178056b(av avVar) {
        if (avVar != null) {
            this.f128896a.remove(avVar);
        }
    }

    /* renamed from: a */
    public void mo178054a(int i) {
        Iterator<av> it = this.f128896a.iterator();
        while (it.hasNext()) {
            av next = it.next();
            if (next != null) {
                next.mo105614a(i);
            }
        }
    }
}
