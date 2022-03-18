package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.b */
public class C29146b implements AbstractC27534b {

    /* renamed from: a */
    private final ArrayList<AbstractC27534b.AbstractC27535a> f72967a = new ArrayList<>();

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b
    /* renamed from: a */
    public void mo98167a(AbstractC27534b.AbstractC27535a aVar) {
        this.f72967a.add(aVar);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b
    /* renamed from: b */
    public void mo98168b(AbstractC27534b.AbstractC27535a aVar) {
        this.f72967a.remove(aVar);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b
    /* renamed from: a */
    public void mo98166a(int i) {
        Iterator<AbstractC27534b.AbstractC27535a> it = this.f72967a.iterator();
        while (it.hasNext()) {
            it.next().onBadgeSumChanged(i);
        }
    }
}
