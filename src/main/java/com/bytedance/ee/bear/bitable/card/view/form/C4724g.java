package com.bytedance.ee.bear.bitable.card.view.form;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4549f;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.g */
public class C4724g {

    /* renamed from: a */
    private C4525a f13937a;

    /* renamed from: b */
    private AbstractC4549f f13938b;

    /* renamed from: a */
    private int m19581a() {
        List<C4537a> h = this.f13937a.mo17714h();
        String h2 = this.f13937a.mo17705a().mo17782h();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < h.size(); i3++) {
            C4537a aVar = h.get(i3);
            if (!TextUtils.isEmpty(aVar.mo17829a().mo17754k()) && i < 0) {
                i = i3;
            }
            if (TextUtils.equals(h2, aVar.mo17829a().mo17749g()) && i2 < 0) {
                this.f13937a.mo17705a().mo17776e(null);
                i2 = i3;
            }
        }
        return i > -1 ? i : i2;
    }

    public C4724g(AbstractC4549f fVar) {
        this.f13938b = fVar;
    }

    /* renamed from: a */
    public void mo18438a(C4525a aVar) {
        C13479a.m54772d("RecordPresenter_record", "setRecord: " + aVar);
        this.f13937a = aVar;
        int a = m19581a();
        if (a > -1) {
            this.f13938b.mo17911a(a);
        }
        this.f13938b.mo17912a(aVar);
    }
}
