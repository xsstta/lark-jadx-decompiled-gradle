package com.bytedance.ee.bear.drive.view.preview.archive.view;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.e */
public class C7249e {

    /* renamed from: a */
    int f19418a = 0;

    /* renamed from: b */
    private List<Integer> f19419b = new ArrayList();

    /* renamed from: c */
    public List<Integer> mo28310c() {
        return new ArrayList(this.f19419b);
    }

    private C7249e() {
    }

    /* renamed from: a */
    public static C7249e m28987a() {
        C7249e eVar = new C7249e();
        eVar.f19419b.add(0);
        return eVar;
    }

    /* renamed from: b */
    public C7249e mo28309b() {
        if (mo28311d()) {
            return null;
        }
        C7249e eVar = new C7249e();
        List<Integer> list = eVar.f19419b;
        List<Integer> list2 = this.f19419b;
        list.addAll(list2.subList(0, list2.size() - 1));
        return eVar;
    }

    /* renamed from: d */
    public boolean mo28311d() {
        if (this.f19419b.size() == 1 && this.f19419b.get(0).intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C7249e m28988a(C7249e eVar, int i) {
        if (eVar == null || i < 0) {
            return m28987a();
        }
        C7249e eVar2 = new C7249e();
        eVar2.f19419b.addAll(eVar.f19419b);
        eVar2.f19419b.add(Integer.valueOf(i));
        return eVar2;
    }
}
