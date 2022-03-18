package com.ss.android.appcenter.common.adapter.groupadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;

public class StickyHeaderLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f70408a = true;

    /* renamed from: b */
    private Context f70409b;

    /* renamed from: c */
    private RecyclerView f70410c;

    /* renamed from: d */
    private FrameLayout f70411d;

    /* renamed from: e */
    private final SparseArray<C28118a> f70412e = new SparseArray<>();

    /* renamed from: f */
    private int f70413f = -1;

    /* renamed from: g */
    private boolean f70414g = false;

    /* renamed from: b */
    private void m102823b() {
        this.f70410c.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.appcenter.common.adapter.groupadapter.StickyHeaderLayout.C281151 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (StickyHeaderLayout.this.f70408a) {
                    StickyHeaderLayout.this.mo100080a(false);
                }
            }
        });
    }

    /* renamed from: c */
    private void m102824c() {
        this.f70411d = new FrameLayout(this.f70409b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f70411d.setLayoutParams(layoutParams);
        this.f70411d.setClipChildren(false);
        this.f70411d.setClipToPadding(false);
        super.addView(this.f70411d, 1, layoutParams);
    }

    /* renamed from: d */
    private void m102825d() {
        if (this.f70411d.getChildCount() > 0) {
            View childAt = this.f70411d.getChildAt(0);
            this.f70412e.put(((Integer) childAt.getTag(-101)).intValue(), (C28118a) childAt.getTag(-102));
            this.f70411d.removeAllViews();
        }
    }

    private int getFirstVisibleItem() {
        RecyclerView.LayoutManager layoutManager = this.f70410c.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.mo7259c()];
                staggeredGridLayoutManager.mo7253a(iArr);
                return m102819a(iArr);
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollExtent() {
        if (this.f70410c != null) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f70410c, new Object[0])).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.computeVerticalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        if (this.f70410c != null) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f70410c, new Object[0])).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.computeVerticalScrollOffset();
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollRange() {
        if (this.f70410c != null) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f70410c, new Object[0])).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.computeVerticalScrollRange();
    }

    /* renamed from: a */
    public void mo100079a() {
        postDelayed(new Runnable() {
            /* class com.ss.android.appcenter.common.adapter.groupadapter.StickyHeaderLayout.RunnableC281173 */

            public void run() {
                StickyHeaderLayout.this.mo100080a(true);
            }
        }, 100);
    }

    /* renamed from: a */
    private void m102821a(AbstractC28120c cVar) {
        if (!this.f70414g) {
            this.f70414g = true;
            cVar.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                /* class com.ss.android.appcenter.common.adapter.groupadapter.StickyHeaderLayout.C281162 */

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    StickyHeaderLayout.this.mo100079a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    StickyHeaderLayout.this.mo100079a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    StickyHeaderLayout.this.mo100079a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i, int i2) {
                    StickyHeaderLayout.this.mo100079a();
                }
            });
        }
    }

    /* renamed from: b */
    private C28118a m102822b(int i) {
        return this.f70412e.get(i);
    }

    public StickyHeaderLayout(Context context) {
        super(context);
        this.f70409b = context;
    }

    /* renamed from: a */
    private int m102819a(int[] iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public void setSticky(boolean z) {
        if (this.f70408a != z) {
            this.f70408a = z;
            FrameLayout frameLayout = this.f70411d;
            if (frameLayout == null) {
                return;
            }
            if (z) {
                frameLayout.setVisibility(0);
                mo100080a(false);
                return;
            }
            m102825d();
            this.f70411d.setVisibility(8);
        }
    }

    /* renamed from: a */
    private C28118a m102820a(int i) {
        if (this.f70411d.getChildCount() <= 0) {
            return null;
        }
        View childAt = this.f70411d.getChildAt(0);
        if (((Integer) childAt.getTag(-101)).intValue() == i) {
            return (C28118a) childAt.getTag(-102);
        }
        m102825d();
        return null;
    }

    /* renamed from: a */
    public void mo100080a(boolean z) {
        boolean z2;
        RecyclerView.Adapter adapter = this.f70410c.getAdapter();
        if (adapter instanceof AbstractC28120c) {
            AbstractC28120c cVar = (AbstractC28120c) adapter;
            m102821a(cVar);
            int firstVisibleItem = getFirstVisibleItem();
            int k = cVar.mo100102k(firstVisibleItem);
            if (z || this.f70413f != k) {
                this.f70413f = k;
                int l = cVar.mo100103l(k);
                if (l != -1) {
                    int itemViewType = cVar.getItemViewType(l);
                    C28118a a = m102820a(itemViewType);
                    if (a != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (a == null) {
                        a = m102822b(itemViewType);
                    }
                    if (a == null) {
                        a = (C28118a) cVar.onCreateViewHolder(this.f70411d, itemViewType);
                        a.itemView.setTag(-101, Integer.valueOf(itemViewType));
                        a.itemView.setTag(-102, a);
                    }
                    cVar.onBindViewHolder(a, l);
                    if (!z2) {
                        this.f70411d.addView(a.itemView);
                    }
                } else {
                    m102825d();
                }
            }
            if (this.f70411d.getChildCount() > 0 && this.f70411d.getHeight() == 0) {
                this.f70411d.requestLayout();
            }
            this.f70411d.setTranslationY(m102818a(cVar, firstVisibleItem, k + 1));
        }
    }

    public void scrollBy(int i, int i2) {
        RecyclerView recyclerView = this.f70410c;
        if (recyclerView != null) {
            recyclerView.scrollBy(i, i2);
        } else {
            super.scrollBy(i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        RecyclerView recyclerView = this.f70410c;
        if (recyclerView != null) {
            recyclerView.scrollTo(i, i2);
        } else {
            super.scrollTo(i, i2);
        }
    }

    public StickyHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70409b = context;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0 || !(view instanceof RecyclerView)) {
            throw new IllegalArgumentException("StickyHeaderLayout can host only one direct child --> RecyclerView");
        }
        super.addView(view, i, layoutParams);
        this.f70410c = (RecyclerView) view;
        m102823b();
        m102824c();
    }

    /* renamed from: a */
    private float m102818a(AbstractC28120c cVar, int i, int i2) {
        int i3;
        int l = cVar.mo100103l(i2);
        if (l != -1 && this.f70410c.getChildCount() > (i3 = l - i)) {
            float y = this.f70410c.getChildAt(i3).getY() - ((float) this.f70411d.getHeight());
            if (y < BitmapDescriptorFactory.HUE_RED) {
                return y;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public StickyHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70409b = context;
    }
}
