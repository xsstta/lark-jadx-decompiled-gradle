package com.haibin.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.haibin.calendarview.AbstractC23344b;
import java.util.Calendar;

public final class YearRecyclerView extends RecyclerView {

    /* renamed from: a */
    public C23350e f57553a;

    /* renamed from: b */
    public C23365q f57554b;

    /* renamed from: c */
    public AbstractC23341a f57555c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.haibin.calendarview.YearRecyclerView$a */
    public interface AbstractC23341a {
        /* renamed from: a */
        void mo81026a(int i, int i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81060a() {
        for (C23356k kVar : this.f57554b.mo81089a()) {
            kVar.setDiff(C23349d.m84772a(kVar.getYear(), kVar.getMonth(), this.f57553a.mo81129X()));
        }
    }

    /* access modifiers changed from: package-private */
    public final void setOnMonthSelectedListener(AbstractC23341a aVar) {
        this.f57555c = aVar;
    }

    public YearRecyclerView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public final void setup(C23350e eVar) {
        this.f57553a = eVar;
        this.f57554b.mo81210a(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81061a(int i) {
        Calendar instance = Calendar.getInstance();
        for (int i2 = 1; i2 <= 12; i2++) {
            instance.set(i, i2 - 1, 1);
            int a = C23349d.m84771a(i, i2);
            C23356k kVar = new C23356k();
            kVar.setDiff(C23349d.m84772a(i, i2, this.f57553a.mo81129X()));
            kVar.setCount(a);
            kVar.setMonth(i2);
            kVar.setYear(i);
            this.f57554b.mo81092a(kVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        this.f57554b.mo81208a(View.MeasureSpec.getSize(i) / 3, size / 4);
    }

    public YearRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57554b = new C23365q(context);
        setLayoutManager(new GridLayoutManager(context, 3));
        setAdapter(this.f57554b);
        this.f57554b.mo81091a((AbstractC23344b.AbstractC23347b) new AbstractC23344b.AbstractC23347b() {
            /* class com.haibin.calendarview.YearRecyclerView.C233401 */

            @Override // com.haibin.calendarview.AbstractC23344b.AbstractC23347b
            /* renamed from: a */
            public void mo81064a(int i, long j) {
                C23356k kVar;
                if (YearRecyclerView.this.f57555c != null && YearRecyclerView.this.f57553a != null && (kVar = (C23356k) YearRecyclerView.this.f57554b.mo81088a(i)) != null && C23349d.m84785a(kVar.getYear(), kVar.getMonth(), YearRecyclerView.this.f57553a.mo81183y(), YearRecyclerView.this.f57553a.mo81109D(), YearRecyclerView.this.f57553a.mo81184z(), YearRecyclerView.this.f57553a.mo81110E())) {
                    YearRecyclerView.this.f57555c.mo81026a(kVar.getYear(), kVar.getMonth());
                    if (YearRecyclerView.this.f57553a.f57633n != null) {
                        YearRecyclerView.this.f57553a.f57633n.mo81038a(true);
                    }
                }
            }
        });
    }
}
