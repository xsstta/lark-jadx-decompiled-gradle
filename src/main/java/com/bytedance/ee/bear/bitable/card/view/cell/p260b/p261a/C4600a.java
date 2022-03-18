package com.bytedance.ee.bear.bitable.card.view.cell.p260b.p261a;

import android.view.View;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.widget.AtEditText;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.b.a.a */
public class C4600a extends AbstractC4602c<C7827a> {

    /* renamed from: g */
    protected AtEditText f13597g;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13597g;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<C7827a> aVar) {
        String str;
        super.mo17993a((C4537a) aVar);
        AtEditText atEditText = this.f13597g;
        if (aVar.mo17835c() != null) {
            str = aVar.mo17835c().f21134a;
        } else {
            str = "";
        }
        atEditText.setText(str);
    }

    public C4600a(View view, AbstractC4712d dVar) {
        super(view, dVar);
        AtEditText atEditText = (AtEditText) view.findViewById(R.id.cell_edit_text);
        this.f13597g = atEditText;
        atEditText.setFocusable(false);
        this.f13597g.setFocusableInTouchMode(false);
    }
}
