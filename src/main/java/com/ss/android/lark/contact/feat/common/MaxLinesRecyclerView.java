package com.ss.android.lark.contact.feat.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MaxLinesRecyclerView extends CommonRecyclerView {

    /* renamed from: a */
    private int f91584a;

    /* renamed from: b */
    private List<Integer> f91585b = new ArrayList();

    /* renamed from: c */
    private int f91586c = 0;

    /* renamed from: d */
    private AbstractC35426a f91587d;

    /* renamed from: com.ss.android.lark.contact.feat.common.MaxLinesRecyclerView$a */
    public interface AbstractC35426a {
        /* renamed from: a */
        void mo130750a(int i, int i2);
    }

    public void setMaxLines(int i) {
        this.f91584a = i;
    }

    public void setOnHeightChangedListener(AbstractC35426a aVar) {
        this.f91587d = aVar;
    }

    public MaxLinesRecyclerView(Context context) {
        super(context);
    }

    public MaxLinesRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        computeVerticalScrollRange();
        int computeVerticalScrollExtent = computeVerticalScrollExtent();
        if (this.f91584a > 0 && this.f91585b.size() == this.f91584a) {
            List<Integer> list = this.f91585b;
            i2 = View.MeasureSpec.makeMeasureSpec(list.get(list.size() - 1).intValue(), Integer.MIN_VALUE);
        }
        if (this.f91585b.size() < this.f91584a && computeVerticalScrollExtent > 0 && !this.f91585b.contains(Integer.valueOf(computeVerticalScrollExtent))) {
            this.f91585b.add(Integer.valueOf(computeVerticalScrollExtent));
        }
        int i3 = this.f91586c;
        if (i3 != computeVerticalScrollExtent) {
            AbstractC35426a aVar = this.f91587d;
            if (aVar != null) {
                aVar.mo130750a(i3, computeVerticalScrollExtent);
            }
            this.f91586c = computeVerticalScrollExtent;
        }
        super.onMeasure(i, i2);
    }

    public MaxLinesRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
