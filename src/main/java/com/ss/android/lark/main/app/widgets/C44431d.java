package com.ss.android.lark.main.app.widgets;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.main.app.fragment.C44273e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.widgets.d */
public class C44431d extends AbstractC44416a<String> {

    /* renamed from: a */
    List<C44273e> f112752a = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f112752a.size();
    }

    /* renamed from: a */
    public void mo157813a() {
        this.f112752a.clear();
    }

    public C44431d(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override // com.ss.android.lark.main.app.widgets.AbstractC44416a
    /* renamed from: a */
    public Fragment mo157783a(int i) {
        if (i < 0 || i >= this.f112752a.size()) {
            return null;
        }
        return this.f112752a.get(i).mo157350a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo157785b(int i) {
        if (i < 0 || i >= this.f112752a.size()) {
            return null;
        }
        return this.f112752a.get(i).mo157351b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo157782a(String str) {
        for (int i = 0; i < this.f112752a.size(); i++) {
            if (this.f112752a.get(i).mo157351b().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo157815a(C44273e eVar) {
        if (!this.f112752a.contains(eVar)) {
            this.f112752a.add(eVar);
        }
    }

    /* renamed from: a */
    public void mo157816a(List<String> list) {
        Iterator<C44273e> it = this.f112752a.iterator();
        while (it.hasNext()) {
            if (list.contains(it.next().mo157351b())) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo157814a(int i, C44273e eVar) {
        if (!this.f112752a.contains(eVar)) {
            this.f112752a.add(i, eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo157784a(String str, String str2) {
        return str.equals(str2);
    }
}
