package com.ss.android.lark.ug.attribution.p2854a;

import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.attribution.bean.C57357a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.ug.attribution.a.a */
public class C57351a {

    /* renamed from: a */
    private C57357a f141212a = new C57357a();

    /* renamed from: b */
    private List<AbstractC57352b> f141213b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo194499a(AbstractC57352b bVar) {
        this.f141213b.add(bVar);
    }

    /* renamed from: b */
    public void mo194502b(AbstractC57352b bVar) {
        this.f141213b.remove(bVar);
    }

    /* renamed from: a */
    private void m222320a(C57357a aVar) {
        for (AbstractC57352b bVar : this.f141213b) {
            bVar.mo194497a(aVar);
        }
    }

    /* renamed from: b */
    public void mo194503b(String str) {
        synchronized (this.f141212a) {
            this.f141212a.mo194513a(str);
        }
        m222320a(this.f141212a);
    }

    /* renamed from: a */
    public void mo194500a(String str) {
        synchronized (this.f141212a) {
            this.f141212a.mo194514a(new HashMap());
        }
        UGApm.f141196a.mo194468a(str);
        m222320a(this.f141212a);
    }

    /* renamed from: a */
    public void mo194501a(Map<String, Object> map) {
        synchronized (this.f141212a) {
            this.f141212a.mo194514a(map);
        }
        m222320a(this.f141212a);
    }
}
