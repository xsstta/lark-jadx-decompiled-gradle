package com.tonicartos.superslim;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.tonicartos.superslim.C65671a;
import com.tonicartos.superslim.LayoutManager;

/* renamed from: com.tonicartos.superslim.d */
public abstract class AbstractC65675d {

    /* renamed from: b */
    protected LayoutManager f165472b;

    /* renamed from: a */
    public abstract int mo229863a(int i, int i2, int i3, C65674c cVar, C65671a aVar);

    /* renamed from: a */
    public abstract int mo229865a(int i, View view, C65674c cVar, C65671a aVar);

    /* renamed from: a */
    public abstract int mo229866a(int i, C65674c cVar, C65671a aVar);

    /* renamed from: a */
    public LayoutManager.LayoutParams mo229869a(LayoutManager.LayoutParams layoutParams) {
        return layoutParams;
    }

    /* renamed from: b */
    public abstract int mo229871b(int i, int i2, int i3, C65674c cVar, C65671a aVar);

    /* renamed from: b */
    public abstract int mo229872b(int i, View view, C65674c cVar, C65671a aVar);

    /* renamed from: b */
    public AbstractC65675d mo229873b(C65674c cVar) {
        return this;
    }

    public AbstractC65675d(LayoutManager layoutManager) {
        this.f165472b = layoutManager;
    }

    /* renamed from: c */
    public int mo229916c(int i) {
        View d = mo229917d(i);
        if (d == null) {
            return -1;
        }
        return this.f165472b.getPosition(d);
    }

    /* renamed from: d */
    public View mo229917d(int i) {
        int childCount = this.f165472b.getChildCount() - 1;
        View view = null;
        while (childCount >= 0) {
            View childAt = this.f165472b.getChildAt(childCount);
            LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) childAt.getLayoutParams();
            if (i != layoutParams.mo229890d()) {
                return view;
            }
            if (!layoutParams.f165442a) {
                return childAt;
            }
            childCount--;
            view = childAt;
        }
        return view;
    }

    /* renamed from: a */
    public int mo229911a(int i, SparseArray<Boolean> sparseArray) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < sparseArray.size()) {
            if (sparseArray.get(i, false).booleanValue()) {
                i2++;
            } else {
                i3++;
            }
            i++;
        }
        return i3;
    }

    /* renamed from: b */
    public int mo229915b(int i, SparseArray<Boolean> sparseArray) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < sparseArray.size()) {
            if (sparseArray.get(i, false).booleanValue()) {
                i2++;
            } else {
                i3++;
            }
            i--;
        }
        return i3;
    }

    /* renamed from: a */
    public View mo229913a(int i, boolean z) {
        int childCount = this.f165472b.getChildCount();
        int i2 = 0;
        View view = null;
        while (i2 < childCount) {
            View childAt = this.f165472b.getChildAt(i2);
            LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) childAt.getLayoutParams();
            if (i != layoutParams.mo229890d()) {
                return view;
            }
            if (!layoutParams.f165442a || !z) {
                return childAt;
            }
            i2++;
            view = childAt;
        }
        return view;
    }

    /* renamed from: a */
    public LayoutManager.LayoutParams mo229868a(Context context, AttributeSet attributeSet) {
        return new LayoutManager.LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public int mo229862a(int i, int i2, int i3) {
        while (i2 >= 0) {
            View childAt = this.f165472b.getChildAt(i2);
            LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mo229890d() != i) {
                break;
            } else if (!layoutParams.f165442a) {
                return this.f165472b.getDecoratedBottom(childAt);
            } else {
                i2--;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public int mo229914b(int i, int i2, int i3) {
        while (i2 < this.f165472b.getChildCount()) {
            View childAt = this.f165472b.getChildAt(i2);
            LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mo229890d() != i) {
                break;
            } else if (!layoutParams.f165442a) {
                return this.f165472b.getDecoratedTop(childAt);
            } else {
                i2++;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo229912a(C65671a.C65672a aVar, int i, LayoutManager.Direction direction, C65671a aVar2) {
        int i2;
        if (direction == LayoutManager.Direction.START) {
            i2 = 0;
        } else {
            i2 = this.f165472b.getChildCount();
        }
        aVar2.mo229903a(i);
        this.f165472b.addView(aVar.f165457a, i2);
        return i2;
    }
}
