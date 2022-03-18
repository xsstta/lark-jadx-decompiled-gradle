package com.bytedance.ee.bear.bitable.card.view.cell.p263c;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableMetaModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4527b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4532f;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.c.a */
public class C4603a extends AbstractC4602c<List<Long>> {

    /* renamed from: g */
    protected TextView f13601g;

    /* renamed from: h */
    protected View f13602h;

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13602h;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: d */
    public boolean mo18115d() {
        return !mo18116e();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<Long>> aVar) {
        super.mo17993a((C4537a) aVar);
        if (!mo18116e()) {
            if (aVar.mo17829a() instanceof C4527b) {
                this.f13601g.setText(m19121a((Long) aVar.mo17830a(Long.class), ((C4527b) aVar.mo17829a()).mo17719a(), ((C4527b) aVar.mo17829a()).mo17720b(), ""));
            }
        } else if (aVar.mo17829a() instanceof C4532f) {
            if (aVar.mo17835c() == null) {
                this.f13601g.setText("");
                return;
            }
            TableMetaModel.FieldBean a = ((C4532f) aVar.mo17829a()).mo17740a();
            if (!(a == null || a.property == null)) {
                String str = a.property.dateFormat;
                String str2 = a.property.timeFormat;
                ArrayList arrayList = new ArrayList();
                for (Long l : aVar.mo17835c()) {
                    arrayList.add(m19121a(l, str, str2, ""));
                }
                this.f13601g.setText(C13721c.m55645a(arrayList, ","));
            }
        }
    }

    public C4603a(View view, AbstractC4712d dVar) {
        super(view, dVar);
        this.f13602h = view.findViewById(R.id.date_content_layout);
        this.f13601g = (TextView) view.findViewById(R.id.date_content);
    }

    /* renamed from: a */
    private String m19121a(Long l, String str, String str2, String str3) {
        if (l == null || TextUtils.isEmpty(str)) {
            return str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = String.format("%s %s", str, str2);
        }
        return new SimpleDateFormat(str, this.itemView.getResources().getConfiguration().locale).format(l);
    }
}
