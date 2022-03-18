package com.larksuite.framework.ui.p1198b.p1199a;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0516c;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.framework.ui.p1198b.p1202d.AbstractC26196b;

/* renamed from: com.larksuite.framework.ui.b.a.b */
public class C26185b implements AbstractC26184a {

    /* renamed from: a */
    private final AbstractC26197e f64662a;

    /* renamed from: b */
    private final C0516c<View> f64663b = new C0516c<>();

    /* renamed from: c */
    private final AbstractC26196b f64664c;

    @Override // com.larksuite.framework.ui.p1198b.p1199a.AbstractC26184a
    /* renamed from: a */
    public void mo93162a() {
        this.f64663b.mo2971d();
    }

    public C26185b(AbstractC26197e eVar, AbstractC26196b bVar) {
        this.f64662a = eVar;
        this.f64664c = bVar;
    }

    @Override // com.larksuite.framework.ui.p1198b.p1199a.AbstractC26184a
    /* renamed from: a */
    public View mo93161a(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        long a = this.f64662a.mo93176a(i);
        View a2 = this.f64663b.mo2959a(a);
        if (a2 == null) {
            RecyclerView.ViewHolder a3 = this.f64662a.mo93177a(recyclerView);
            this.f64662a.mo93178a(a3, i);
            a2 = a3.itemView;
            if (a2.getLayoutParams() == null) {
                a2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            if (this.f64664c.mo93174a(recyclerView) == 1) {
                i2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
                i3 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
            }
            a2.measure(ViewGroup.getChildMeasureSpec(i2, recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), a2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i3, recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), a2.getLayoutParams().height));
            a2.layout(0, 0, a2.getMeasuredWidth(), a2.getMeasuredHeight());
            this.f64663b.mo2965b(a, a2);
        }
        return a2;
    }
}
