package com.bytedance.ee.bear.bitable.card.view.title;

import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4527b;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.title.a */
public class C4744a extends C4570a implements AbstractC4746c {

    /* renamed from: k */
    private String f14003k = "";

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    public /* synthetic */ void a_(boolean z) {
        AbstractC4746c.CC.$default$a_(this, z);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: l */
    public TextView mo18017l() {
        return this.f13470h;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: a */
    public void mo18492a(String str) {
        this.f14003k = str;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<DateModel>> aVar) {
        boolean z;
        if (aVar.mo17829a() instanceof C4527b) {
            DateModel dateModel = (DateModel) aVar.mo17830a(DateModel.class);
            String a = mo17992a(dateModel, ((C4527b) aVar.mo17829a()).mo17719a(), ((C4527b) aVar.mo17829a()).mo17720b(), this.f14003k);
            if (dateModel == null) {
                z = false;
            } else {
                z = dateModel.isReminderEnabled();
            }
            mo17994a(a, z);
        }
    }

    C4744a(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar, eVar);
    }
}
