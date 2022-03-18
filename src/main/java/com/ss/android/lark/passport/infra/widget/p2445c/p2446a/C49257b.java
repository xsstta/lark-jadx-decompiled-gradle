package com.ss.android.lark.passport.infra.widget.p2445c.p2446a;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0516c;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.passport.infra.widget.p2445c.AbstractC49260c;
import com.ss.android.lark.passport.infra.widget.p2445c.p2449d.AbstractC49264b;

/* renamed from: com.ss.android.lark.passport.infra.widget.c.a.b */
public class C49257b implements AbstractC49256a {

    /* renamed from: a */
    private final AbstractC49260c f123640a;

    /* renamed from: b */
    private final C0516c<View> f123641b = new C0516c<>();

    /* renamed from: c */
    private final AbstractC49264b f123642c;

    public C49257b(AbstractC49260c cVar, AbstractC49264b bVar) {
        this.f123640a = cVar;
        this.f123642c = bVar;
    }

    @Override // com.ss.android.lark.passport.infra.widget.p2445c.p2446a.AbstractC49256a
    /* renamed from: a */
    public View mo171813a(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        long a = this.f123640a.mo171815a(i);
        View a2 = this.f123641b.mo2959a(a);
        if (a2 == null) {
            RecyclerView.ViewHolder a3 = this.f123640a.mo171816a(recyclerView);
            this.f123640a.mo171817a(a3, i);
            a2 = a3.itemView;
            if (a2.getLayoutParams() == null) {
                a2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            if (this.f123642c.mo171821a(recyclerView) == 1) {
                i2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
                i3 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
            }
            a2.measure(ViewGroup.getChildMeasureSpec(i2, recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), a2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i3, recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), a2.getLayoutParams().height));
            a2.layout(0, 0, a2.getMeasuredWidth(), a2.getMeasuredHeight());
            this.f123641b.mo2965b(a, a2);
        }
        return a2;
    }
}
