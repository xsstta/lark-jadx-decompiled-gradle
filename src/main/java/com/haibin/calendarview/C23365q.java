package com.haibin.calendarview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: com.haibin.calendarview.q */
public final class C23365q extends AbstractC23344b<C23356k> {

    /* renamed from: d */
    private C23350e f57706d;

    /* renamed from: e */
    private int f57707e;

    /* renamed from: f */
    private int f57708f;

    C23365q(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81210a(C23350e eVar) {
        this.f57706d = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81208a(int i, int i2) {
        this.f57707e = i;
        this.f57708f = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.haibin.calendarview.q$a */
    public static class C23366a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        YearView f57709a;

        C23366a(View view, C23350e eVar) {
            super(view);
            YearView yearView = (YearView) view;
            this.f57709a = yearView;
            yearView.setup(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.haibin.calendarview.AbstractC23344b
    /* renamed from: a */
    public RecyclerView.ViewHolder mo81087a(ViewGroup viewGroup, int i) {
        YearView yearView;
        if (TextUtils.isEmpty(this.f57706d.mo81181w())) {
            yearView = new C23353h(this.f57590c);
        } else {
            try {
                yearView = (YearView) this.f57706d.mo81180v().getConstructor(Context.class).newInstance(this.f57590c);
            } catch (Exception e) {
                e.printStackTrace();
                yearView = new C23353h(this.f57590c);
            }
        }
        yearView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new C23366a(yearView, this.f57706d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81090a(RecyclerView.ViewHolder viewHolder, C23356k kVar, int i) {
        YearView yearView = ((C23366a) viewHolder).f57709a;
        yearView.mo81066a(kVar.getYear(), kVar.getMonth());
        yearView.mo81072b(this.f57707e, this.f57708f);
    }
}
