package com.bytedance.ee.bear.doc.follow.p296b;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.doc.follow.b.b */
public abstract class AbstractC5422b implements AbstractC5424c {

    /* renamed from: a */
    private List<AbstractC5423a> f15475a = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.doc.follow.b.b$a */
    public interface AbstractC5423a {
        boolean onIntercept(AbstractC5421a aVar);
    }

    /* renamed from: a */
    public abstract View mo21679a();

    /* renamed from: b */
    public void mo21682b(AbstractC5423a aVar) {
        this.f15475a.remove(aVar);
    }

    /* renamed from: a */
    public void mo21681a(AbstractC5423a aVar) {
        if (!this.f15475a.contains(aVar)) {
            this.f15475a.add(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c
    /* renamed from: a */
    public void mo21680a(AbstractC5421a aVar) {
        int i;
        if (aVar instanceof C5425d) {
            View a = mo21679a();
            for (int size = this.f15475a.size() - 1; size >= 0; size--) {
                if (this.f15475a.get(size).onIntercept(aVar)) {
                    return;
                }
            }
            if (a != null) {
                if (((C5425d) aVar).f15476a) {
                    i = 0;
                } else {
                    i = 8;
                }
                a.setVisibility(i);
            }
        }
    }
}
