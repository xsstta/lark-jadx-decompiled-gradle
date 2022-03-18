package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.view.View;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.d */
public class C4547d implements AbstractC4548e {

    /* renamed from: a */
    private final List<AbstractC4548e> f13393a = new ArrayList();

    /* renamed from: a */
    public void mo17909a(AbstractC4548e eVar) {
        if (eVar != null && !this.f13393a.contains(eVar)) {
            this.f13393a.add(eVar);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e
    /* renamed from: a */
    public void mo17908a(View view, AbstractC4607d dVar) {
        for (AbstractC4548e eVar : this.f13393a) {
            eVar.mo17908a(view, dVar);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e
    /* renamed from: b */
    public void mo17910b(View view, AbstractC4607d dVar) {
        for (AbstractC4548e eVar : this.f13393a) {
            eVar.mo17910b(view, dVar);
        }
    }
}
