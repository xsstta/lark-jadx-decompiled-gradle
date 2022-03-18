package com.bytedance.ee.bear.document.p310g;

import android.app.Application;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.document.g.c */
public class C5809c {

    /* renamed from: a */
    private ArrayList<AbstractC5808b> f16317a = new ArrayList<>();

    /* renamed from: b */
    private Application f16318b;

    /* renamed from: a */
    public void mo23366a() {
        if (this.f16318b == null || this.f16317a.size() == 0) {
            C13479a.m54758a("InitTaskExecutor", "start()... application is null or task list is empty");
            return;
        }
        Iterator<AbstractC5808b> it = this.f16317a.iterator();
        while (it.hasNext()) {
            it.next().mo23364a(this.f16318b);
        }
    }

    /* renamed from: a */
    public C5809c mo23365a(AbstractC5808b bVar) {
        if (bVar != null) {
            this.f16317a.add(bVar);
        }
        return this;
    }

    public C5809c(Application application) {
        this.f16318b = application;
    }
}
