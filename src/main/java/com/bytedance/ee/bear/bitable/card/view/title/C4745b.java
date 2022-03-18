package com.bytedance.ee.bear.bitable.card.view.title;

import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.p260b.p261a.C4600a;
import com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.widget.AtEditText;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.title.b */
public class C4745b extends C4600a implements AbstractC4746c {

    /* renamed from: h */
    private String f14004h = "";

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    public /* synthetic */ void a_(boolean z) {
        AbstractC4746c.CC.$default$a_(this, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: b */
    public void mo18113b() {
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: l */
    public TextView mo18017l() {
        return this.f13597g;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: a */
    public void mo18492a(String str) {
        this.f14004h = str;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e, com.bytedance.ee.bear.bitable.card.view.cell.p260b.p261a.C4600a
    /* renamed from: a */
    public void mo17993a(C4537a<C7827a> aVar) {
        String str;
        AtEditText atEditText = this.f13597g;
        if (aVar.mo17835c() != null) {
            str = aVar.mo17835c().f21134a;
        } else {
            str = this.f14004h;
        }
        atEditText.setText(str);
    }

    public C4745b(View view, AbstractC4712d dVar) {
        super(view, dVar);
    }
}
