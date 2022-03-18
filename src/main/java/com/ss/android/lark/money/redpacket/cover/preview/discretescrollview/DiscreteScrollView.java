package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.AbstractC48093a;
import java.util.ArrayList;
import java.util.List;

public class DiscreteScrollView extends RecyclerView {

    /* renamed from: f */
    private static final int f121043f = DSVOrientation.HORIZONTAL.ordinal();

    /* renamed from: a */
    public DiscreteScrollLayoutManager f121044a;

    /* renamed from: b */
    public List<AbstractC48075b> f121045b;

    /* renamed from: c */
    public List<AbstractC48074a> f121046c;

    /* renamed from: d */
    public Runnable f121047d = new Runnable() {
        /* class com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollView.RunnableC480731 */

        public void run() {
            DiscreteScrollView.this.mo168347a();
        }
    };

    /* renamed from: e */
    public boolean f121048e;

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollView$a */
    public interface AbstractC48074a<T extends RecyclerView.ViewHolder> {
        /* renamed from: a */
        void mo168290a(T t, int i);
    }

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollView$b */
    public interface AbstractC48075b<T extends RecyclerView.ViewHolder> {
        /* renamed from: a */
        void mo168364a(float f, int i, int i2, T t, T t2);

        /* renamed from: a */
        void mo168365a(T t, int i);

        /* renamed from: b */
        void mo168366b(T t, int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollView$c */
    public class C48076c implements DiscreteScrollLayoutManager.AbstractC48072c {
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48072c
        /* renamed from: c */
        public void mo168344c() {
            DiscreteScrollView.this.mo168347a();
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48072c
        /* renamed from: d */
        public void mo168345d() {
            DiscreteScrollView.this.mo168347a();
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48072c
        /* renamed from: a */
        public void mo168340a() {
            int e;
            RecyclerView.ViewHolder a;
            DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
            discreteScrollView.removeCallbacks(discreteScrollView.f121047d);
            if (!DiscreteScrollView.this.f121045b.isEmpty() && (a = DiscreteScrollView.this.mo168346a((e = DiscreteScrollView.this.f121044a.mo168335e()))) != null) {
                DiscreteScrollView.this.mo168349a(a, e);
            }
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48072c
        /* renamed from: b */
        public void mo168343b() {
            int e;
            RecyclerView.ViewHolder a;
            if ((!DiscreteScrollView.this.f121046c.isEmpty() || !DiscreteScrollView.this.f121045b.isEmpty()) && (a = DiscreteScrollView.this.mo168346a((e = DiscreteScrollView.this.f121044a.mo168335e()))) != null) {
                DiscreteScrollView.this.mo168351b(a, e);
                DiscreteScrollView.this.mo168352c(a, e);
            }
        }

        private C48076c() {
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48072c
        /* renamed from: a */
        public void mo168342a(boolean z) {
            int i;
            if (DiscreteScrollView.this.f121048e) {
                DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                if (z) {
                    i = 0;
                } else {
                    i = 2;
                }
                discreteScrollView.setOverScrollMode(i);
            }
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager.AbstractC48072c
        /* renamed from: a */
        public void mo168341a(float f) {
            int currentItem;
            int d;
            if (!DiscreteScrollView.this.f121045b.isEmpty() && (currentItem = DiscreteScrollView.this.getCurrentItem()) != (d = DiscreteScrollView.this.f121044a.mo168333d())) {
                DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                discreteScrollView.mo168348a(f, currentItem, d, discreteScrollView.mo168346a(currentItem), DiscreteScrollView.this.mo168346a(d));
            }
        }
    }

    public int getCurrentItem() {
        return this.f121044a.mo168335e();
    }

    /* renamed from: a */
    public void mo168347a() {
        removeCallbacks(this.f121047d);
        if (!this.f121046c.isEmpty()) {
            int e = this.f121044a.mo168335e();
            RecyclerView.ViewHolder a = mo168346a(e);
            if (a == null) {
                post(this.f121047d);
            } else {
                mo168352c(a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo168350a(AbstractC48074a<?> aVar) {
        this.f121046c.add(aVar);
    }

    public void setItemTransformer(AbstractC48093a aVar) {
        this.f121044a.mo168323a(aVar);
    }

    public void setItemTransitionTimeMillis(int i) {
        this.f121044a.mo168317a(i);
    }

    public void setOffscreenItems(int i) {
        this.f121044a.mo168327b(i);
    }

    public void setOrientation(DSVOrientation dSVOrientation) {
        this.f121044a.mo168321a(dSVOrientation);
    }

    public void setOverScrollEnabled(boolean z) {
        this.f121048e = z;
        setOverScrollMode(2);
    }

    public void setScrollConfig(DSVScrollConfig dSVScrollConfig) {
        this.f121044a.mo168322a(dSVScrollConfig);
    }

    public void setSlideOnFling(boolean z) {
        this.f121044a.mo168324a(z);
    }

    public void setSlideOnFlingThreshold(int i) {
        this.f121044a.mo168334d(i);
    }

    public DiscreteScrollView(Context context) {
        super(context);
        m189807a((AttributeSet) null);
    }

    /* renamed from: a */
    public RecyclerView.ViewHolder mo168346a(int i) {
        View findViewByPosition = this.f121044a.findViewByPosition(i);
        if (findViewByPosition != null) {
            return getChildViewHolder(findViewByPosition);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        int e = this.f121044a.mo168335e();
        super.scrollToPosition(i);
        if (e != i) {
            mo168347a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof DiscreteScrollLayoutManager) {
            super.setLayoutManager(layoutManager);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setClampTransformProgressAfter(int i) {
        if (i > 1) {
            this.f121044a.mo168331c(i);
            return;
        }
        throw new IllegalArgumentException("must be >= 1");
    }

    /* renamed from: a */
    private void m189807a(AttributeSet attributeSet) {
        this.f121045b = new ArrayList();
        this.f121046c = new ArrayList();
        int i = f121043f;
        boolean z = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.dsv_orientation});
            i = obtainStyledAttributes.getInt(0, i);
            obtainStyledAttributes.recycle();
        }
        if (getOverScrollMode() == 2) {
            z = false;
        }
        this.f121048e = z;
        DiscreteScrollLayoutManager discreteScrollLayoutManager = new DiscreteScrollLayoutManager(getContext(), new C48076c(), DSVOrientation.values()[i]);
        this.f121044a = discreteScrollLayoutManager;
        setLayoutManager(discreteScrollLayoutManager);
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m189807a(attributeSet);
    }

    /* renamed from: b */
    public void mo168351b(RecyclerView.ViewHolder viewHolder, int i) {
        for (AbstractC48075b bVar : this.f121045b) {
            bVar.mo168366b(viewHolder, i);
        }
    }

    /* renamed from: c */
    public void mo168352c(RecyclerView.ViewHolder viewHolder, int i) {
        for (AbstractC48074a aVar : this.f121046c) {
            aVar.mo168290a(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (this.f121044a.mo168325a(i, i2)) {
            return false;
        }
        boolean fling = super.fling(i, i2);
        if (fling) {
            this.f121044a.mo168328b(i, i2);
        } else {
            this.f121044a.mo168330c();
        }
        return fling;
    }

    /* renamed from: a */
    public void mo168349a(RecyclerView.ViewHolder viewHolder, int i) {
        for (AbstractC48075b bVar : this.f121045b) {
            bVar.mo168365a(viewHolder, i);
        }
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m189807a(attributeSet);
    }

    /* renamed from: a */
    public void mo168348a(float f, int i, int i2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        for (AbstractC48075b bVar : this.f121045b) {
            bVar.mo168364a(f, i, i2, viewHolder, viewHolder2);
        }
    }
}
