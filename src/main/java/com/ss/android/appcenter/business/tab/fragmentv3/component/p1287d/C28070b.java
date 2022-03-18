package com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d;

import com.ss.android.appcenter.common.util.C28182f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.d.b */
public class C28070b<T> {

    /* renamed from: a */
    protected int f70244a;

    /* renamed from: b */
    protected List<String> f70245b = new ArrayList();

    /* renamed from: c */
    protected List<String> f70246c = new ArrayList();

    /* renamed from: d */
    protected List<List<T>> f70247d = new ArrayList();

    /* renamed from: b */
    public List<String> mo99918b() {
        return this.f70246c;
    }

    /* renamed from: c */
    public int mo99920c() {
        return this.f70244a;
    }

    /* renamed from: a */
    public int mo99915a() {
        return this.f70245b.size();
    }

    /* renamed from: d */
    public List<T> mo99921d() {
        return (List) C28182f.m103235a(this.f70247d, this.f70244a, null);
    }

    /* renamed from: e */
    public boolean mo99922e() {
        if (mo99915a() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo99916a(int i) {
        this.f70244a = i;
    }

    /* renamed from: b */
    public void mo99919b(int i) {
        this.f70244a = i;
    }

    /* renamed from: a */
    public void mo99917a(String str, String str2) {
        this.f70245b.add(str);
        this.f70246c.add(str2);
    }
}
