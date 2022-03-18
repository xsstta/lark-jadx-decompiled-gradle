package com.bytedance.ee.bear.bitable.card.view.title;

import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.facade.common.widget.C7727a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7838i;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.title.e */
public class C4748e extends C4689e implements AbstractC4746c {

    /* renamed from: p */
    private boolean f14006p = true;

    /* renamed from: q */
    private String f14007q = "";

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: l */
    public TextView mo18017l() {
        return this.f13828g;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: a */
    public void mo18492a(String str) {
        this.f14007q = str;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    public void a_(boolean z) {
        this.f14006p = z;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e, com.bytedance.ee.bear.bitable.card.view.cell.text.C4689e
    /* renamed from: a */
    public void mo17993a(C4537a<C7827a> aVar) {
        if (aVar.mo17835c() == null || TextUtils.isEmpty(aVar.mo17835c().f21134a)) {
            this.f13829h.mo18344b(new C7827a(this.f14007q, new C4517a[0], new C7838i[0]));
        } else if (this.f14006p) {
            this.f13829h.mo18344b(aVar.mo17835c());
        } else {
            this.f13829h.mo18344b(new C7827a(aVar.mo17835c().f21134a, new C4517a[0], new C7838i[0]));
        }
    }

    C4748e(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar, eVar);
        this.f13828g.setMovementMethod(C7727a.m30901a());
        this.f13828g.setFocusable(false);
        this.f13828g.setFocusableInTouchMode(false);
        this.f13828g.setClickable(false);
        this.f13828g.setLongClickable(false);
        this.f13828g.setIncludeFontPadding(false);
        this.f13828g.setTransformationMethod(SingleLineTransformationMethod.getInstance());
    }
}
