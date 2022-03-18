package com.bytedance.ee.bear.bitable.card.view.cell.p259a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableMetaModel;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4527b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4532f;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.a.a */
public class C4570a extends AbstractC4597b<List<DateModel>, DateModel> implements AbstractC4607d {

    /* renamed from: g */
    public C4537a<List<DateModel>> f13469g;

    /* renamed from: h */
    protected TextView f13470h;

    /* renamed from: i */
    protected ImageView f13471i;

    /* renamed from: j */
    protected ImageView f13472j;

    /* renamed from: k */
    private RelativeLayout f13473k;

    /* renamed from: l */
    private C4572b f13474l;

    /* renamed from: m */
    private AbstractC4548e f13475m;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13473k;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        super.mo17996h();
        mo18017l();
        this.f13474l.mo17973a();
        AbstractC4548e eVar = this.f13475m;
        if (eVar != null) {
            eVar.mo17908a(this.f13473k, this);
        }
        this.f13472j.setSelected(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        C4572b bVar = this.f13474l;
        if (bVar != null && bVar.mo17980d()) {
            this.f13474l.mo17978b();
        }
        AbstractC4548e eVar = this.f13475m;
        if (eVar != null) {
            eVar.mo17910b(this.f13470h, this);
        }
        this.f13472j.setSelected(false);
    }

    /* renamed from: l */
    private void mo18017l() {
        Long l;
        if (this.f13474l == null) {
            C4572b bVar = new C4572b(this.f13470h.getContext());
            this.f13474l = bVar;
            bVar.mo17976a(new AbstractC4565a.AbstractC4568a() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.p259a.$$Lambda$Z6025BndrcRaKMDuMJFUMPBUy4 */

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4568a
                public final void onDismiss() {
                    C4570a.this.mo17997i();
                }
            });
            this.f13474l.mo17977a(new AbstractC4565a.AbstractC4569b<Long>() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a.C45711 */

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel] */
                /* JADX WARNING: Unknown variable types count: 1 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo17986a(java.lang.Long r4) {
                    /*
                        r3 = this;
                        r0 = 0
                        if (r4 == 0) goto L_0x001c
                        com.bytedance.ee.bear.bitable.card.view.cell.a.a r1 = com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a.this
                        com.bytedance.ee.bear.bitable.card.model.stmodel.cell.a<java.util.List<com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel>> r1 = r1.f13469g
                        java.lang.Class<com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel> r2 = com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel.class
                        java.lang.Object r1 = r1.mo17830a(r2)
                        com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel r1 = (com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel) r1
                        com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel r2 = new com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel
                        if (r1 != 0) goto L_0x0014
                        goto L_0x0018
                    L_0x0014:
                        com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.DateModel$Reminder r0 = r1.getReminder()
                    L_0x0018:
                        r2.<init>(r4, r0)
                        r0 = r2
                    L_0x001c:
                        com.bytedance.ee.bear.bitable.card.view.cell.a.a r4 = com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a.this
                        r4.mo18110a(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4570a.C45711.mo17986a(java.lang.Long):void");
                }

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4569b
                /* renamed from: a */
                public void mo17987a(String str, Map<String, String> map) {
                    C4570a.this.f13588e.mo17864a(str, map);
                }
            });
            DateModel dateModel = (DateModel) this.f13469g.mo17830a(DateModel.class);
            if (dateModel == null) {
                l = null;
            } else {
                l = dateModel.getValue();
            }
            this.f13474l.mo17999a(l, ((C4527b) this.f13469g.mo17829a()).mo17719a(), ((C4527b) this.f13469g.mo17829a()).mo17720b(), true);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d
    /* renamed from: a */
    public int mo17990a(Context context) {
        C4572b bVar = this.f13474l;
        if (bVar != null) {
            return bVar.mo17983g();
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<DateModel>> aVar) {
        Long l;
        super.mo17993a((C4537a) aVar);
        this.f13469g = aVar;
        boolean z = false;
        if (!mo18116e()) {
            if (aVar.mo17829a() instanceof C4527b) {
                DateModel dateModel = (DateModel) aVar.mo17830a(DateModel.class);
                String a = ((C4527b) aVar.mo17829a()).mo17719a();
                String b = ((C4527b) aVar.mo17829a()).mo17720b();
                if (!this.f13586c) {
                    String a2 = mo17992a(dateModel, a, b, "");
                    if (dateModel != null) {
                        z = dateModel.isReminderEnabled();
                    }
                    mo17994a(a2, z);
                }
                if (this.f13474l != null) {
                    if (dateModel == null) {
                        l = null;
                    } else {
                        l = dateModel.getValue();
                    }
                    this.f13474l.mo17999a(l, a, b, !this.f13586c);
                }
            }
        } else if (aVar.mo17829a() instanceof C4532f) {
            if (aVar.mo17835c() == null) {
                this.f13470h.setText("");
                this.f13471i.setVisibility(8);
                return;
            }
            TableMetaModel.FieldBean a3 = ((C4532f) aVar.mo17829a()).mo17740a();
            if (!(a3 == null || a3.property == null)) {
                String str = a3.property.dateFormat;
                String str2 = a3.property.timeFormat;
                ArrayList arrayList = new ArrayList();
                for (DateModel dateModel2 : aVar.mo17835c()) {
                    arrayList.add(mo17992a(dateModel2, str, str2, ""));
                }
                mo17994a(C13721c.m55645a(arrayList, ","), false);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        int i;
        super.mo17995a(z, eFieldUneditableReason);
        ImageView imageView = this.f13472j;
        if (!z || mo18116e()) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17994a(String str, boolean z) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str) || !z) {
            i = R.color.text_title;
            i2 = 8;
        } else {
            i = R.color.primary_pri_500;
            i2 = 0;
        }
        this.f13470h.setText(str);
        TextView textView = this.f13470h;
        textView.setTextColor(textView.getResources().getColor(i));
        this.f13471i.setVisibility(i2);
    }

    public C4570a(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar);
        this.f13475m = eVar;
        this.f13473k = (RelativeLayout) view.findViewById(R.id.date_content_layout);
        this.f13471i = (ImageView) view.findViewById(R.id.date_content_reminder);
        this.f13472j = (ImageView) view.findViewById(R.id.bitable_cell_date_drop_triangle);
        this.f13470h = (TextView) view.findViewById(R.id.date_content);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17992a(DateModel dateModel, String str, String str2, String str3) {
        if (dateModel == null || dateModel.getValue() == null || TextUtils.isEmpty(str)) {
            return str3;
        }
        Long value = dateModel.getValue();
        if (!TextUtils.isEmpty(str2)) {
            str = String.format("%s %s", str, str2);
        }
        return new SimpleDateFormat(str, this.itemView.getResources().getConfiguration().locale).format(value);
    }
}
