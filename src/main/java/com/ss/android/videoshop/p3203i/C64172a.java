package com.ss.android.videoshop.p3203i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.videoshop.i.a */
public class C64172a {

    /* renamed from: a */
    private List<Runnable> f162140a;

    /* renamed from: b */
    private boolean f162141b;

    /* renamed from: b */
    public void mo222326b() {
        if (!mo222327c()) {
            this.f162140a.clear();
        }
    }

    /* renamed from: c */
    public boolean mo222327c() {
        List<Runnable> list = this.f162140a;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo222324a() {
        if (!this.f162141b && !mo222327c()) {
            this.f162141b = true;
            Iterator it = new ArrayList(this.f162140a).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f162140a.clear();
            this.f162141b = false;
        }
    }

    /* renamed from: a */
    public void mo222325a(Runnable runnable) {
        if (this.f162140a == null) {
            this.f162140a = new ArrayList();
        }
        this.f162140a.add(runnable);
    }
}
