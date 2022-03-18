package com.bytedance.ee.bear.bitable.card.view.cell.p260b.p262b;

import android.view.View;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c;
import com.bytedance.ee.bear.bitable.card.view.cell.text.C4678a;
import com.bytedance.ee.bear.facade.common.widget.C7727a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.span.HyperLinkSpan;
import com.bytedance.ee.bear.widget.AtEditText;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.b.b.a */
public class C4601a extends AbstractC4602c<C7827a> implements AbstractC10460a.AbstractC10461a {

    /* renamed from: g */
    private AtEditText f13598g;

    /* renamed from: h */
    private C4678a f13599h;

    /* renamed from: i */
    private View f13600i;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13600i;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<C7827a> aVar) {
        C7827a aVar2;
        super.mo17993a((C4537a) aVar);
        C4678a aVar3 = this.f13599h;
        if (aVar.mo17835c() != null) {
            aVar2 = aVar.mo17835c();
        } else {
            aVar2 = new C7827a();
        }
        aVar3.mo18340a(aVar2);
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10460a.AbstractC10461a
    /* renamed from: a */
    public void mo18121a(AbstractC10460a aVar) {
        if (this.f13588e != null) {
            if (aVar instanceof C10463c) {
                this.f13588e.mo17869b(((C10463c) aVar).mo39749g());
            } else if (aVar instanceof HyperLinkSpan) {
                this.f13588e.mo17869b(((HyperLinkSpan) aVar).mo39763g());
            } else if (aVar instanceof C10468i) {
                this.f13588e.mo17863a(((C10468i) aVar).mo39767g());
            }
        }
    }

    public C4601a(View view, AbstractC4712d dVar) {
        super(view, dVar);
        AtEditText atEditText = (AtEditText) view.findViewById(R.id.cell_edit_text);
        this.f13598g = atEditText;
        atEditText.setMovementMethod(C7727a.m30901a());
        this.f13598g.setFocusable(false);
        this.f13598g.setFocusableInTouchMode(false);
        this.f13598g.setClickable(false);
        this.f13598g.setLongClickable(false);
        this.f13598g.setLinkTextColor(view.getResources().getColor(R.color.primary_pri_500));
        C4678a aVar = (C4678a) this.f13598g.getPresenter();
        this.f13599h = aVar;
        aVar.mo18341a((AbstractC10460a.AbstractC10461a) this);
        this.f13599h.mo18339a(dVar);
        this.f13600i = view.findViewById(R.id.url_content_fl);
    }
}
