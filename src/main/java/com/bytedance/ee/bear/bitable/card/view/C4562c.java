package com.bytedance.ee.bear.bitable.card.view;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout;
import com.bytedance.ee.bear.bitable.card.view.form.C4724g;
import com.bytedance.ee.bear.bitable.card.view.form.C4725h;
import com.bytedance.ee.bear.bitable.card.view.table.BitableCardViewPager;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.c */
public class C4562c extends BitableCardStackLayout.Adapter<ViewGroup, C4535b> {

    /* renamed from: a */
    private final C4771b f13449a;

    /* renamed from: b */
    private final AbstractC4712d f13450b;

    public C4562c(C4771b bVar, AbstractC4712d dVar) {
        this.f13449a = bVar;
        this.f13450b = dVar;
    }

    /* renamed from: a */
    public View mo17847a(C4535b bVar, ViewGroup viewGroup) {
        if (!EViewType.FORM.equals(bVar.mo17775e().mo17794c())) {
            return new BitableCardViewPager(viewGroup.getContext(), this.f13449a, this.f13450b);
        }
        C4725h hVar = new C4725h(viewGroup.getContext(), this.f13449a, this.f13450b);
        hVar.setTag(new C4724g(hVar));
        return hVar;
    }

    /* renamed from: b */
    public void mo17856b(ViewGroup viewGroup, C4535b bVar) {
        if (viewGroup instanceof C4725h) {
            List<C4525a> i = bVar.mo17784i();
            if (i != null && i.size() > 0) {
                ((C4724g) viewGroup.getTag()).mo18438a(i.get(0));
            }
        } else if (viewGroup instanceof BitableCardViewPager) {
            ((BitableCardViewPager) viewGroup).mo18451a(bVar);
        }
    }

    /* renamed from: a */
    public void mo17850a(ViewGroup viewGroup, C4535b bVar) {
        if (viewGroup instanceof C4725h) {
            List<C4525a> i = bVar.mo17784i();
            if (i != null && i.size() > 0) {
                ((C4724g) viewGroup.getTag()).mo18438a(i.get(0));
            }
        } else if (viewGroup instanceof BitableCardViewPager) {
            ((BitableCardViewPager) viewGroup).setData(bVar);
        }
    }

    /* renamed from: a */
    public void mo17851a(ViewGroup viewGroup, boolean z) {
        if (viewGroup instanceof BitableCardViewPager) {
            ((BitableCardViewPager) viewGroup).setUserVisibleHint(z);
        }
    }
}
