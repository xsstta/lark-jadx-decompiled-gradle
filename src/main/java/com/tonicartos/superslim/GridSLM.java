package com.tonicartos.superslim;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.tonicartos.superslim.C65671a;
import com.tonicartos.superslim.LayoutManager;

public class GridSLM extends AbstractC65675d {

    /* renamed from: a */
    public static int f165423a = 2;

    /* renamed from: c */
    private final Context f165424c;

    /* renamed from: d */
    private int f165425d;

    /* renamed from: e */
    private int f165426e;

    /* renamed from: f */
    private int f165427f;

    /* renamed from: g */
    private boolean f165428g;

    public static class LayoutParams extends LayoutManager.LayoutParams {

        /* renamed from: i */
        private int f165429i;

        /* renamed from: j */
        private int f165430j;

        /* renamed from: a */
        public int mo229875a() {
            return this.f165430j;
        }

        /* renamed from: b */
        public int mo229877b() {
            return this.f165429i;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            m257454c(layoutParams);
        }

        /* renamed from: a */
        public void mo229876a(int i) {
            this.f165429i = i;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            m257454c(marginLayoutParams);
        }

        /* renamed from: c */
        private void m257454c(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.f165429i = layoutParams2.f165429i;
                this.f165430j = layoutParams2.f165430j;
                return;
            }
            this.f165429i = -1;
            this.f165430j = -1;
        }

        /* renamed from: a */
        public static LayoutParams m257453a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams == null) {
                Log.w("SuperSLiM", "Null value passed in call to GridSLM.LayoutParams.from().");
                return new LayoutParams(-2, -2);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                return new LayoutParams(layoutParams);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.slm_grid_columnWidth, R.attr.slm_grid_numColumns});
            this.f165429i = obtainStyledAttributes.getInt(1, -1);
            this.f165430j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public GridSLM mo229873b(C65674c cVar) {
        super.mo229873b(cVar);
        if (cVar.f165471l instanceof LayoutParams) {
            LayoutParams layoutParams = (LayoutParams) cVar.f165471l;
            int a = layoutParams.mo229875a();
            int b = layoutParams.mo229877b();
            if (a < 0 && b < 0) {
                b = 1;
            }
            if (b == -1) {
                mo229870a(a);
            } else {
                mo229874b(b);
            }
        }
        m257439c(cVar);
        return this;
    }

    /* renamed from: a */
    public void mo229870a(int i) {
        this.f165425d = i;
        this.f165428g = false;
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public LayoutManager.LayoutParams mo229869a(LayoutManager.LayoutParams layoutParams) {
        return LayoutParams.m257453a((ViewGroup.LayoutParams) layoutParams);
    }

    /* renamed from: b */
    public void mo229874b(int i) {
        this.f165426e = i;
        this.f165425d = 0;
        this.f165428g = true;
    }

    /* renamed from: c */
    private void m257439c(C65674c cVar) {
        int width = (this.f165472b.getWidth() - cVar.f165468i) - cVar.f165467h;
        if (!this.f165428g) {
            if (this.f165425d <= 0) {
                this.f165425d = (int) TypedValue.applyDimension(1, 48.0f, this.f165424c.getResources().getDisplayMetrics());
            }
            this.f165426e = width / Math.abs(this.f165425d);
        }
        if (this.f165426e < 1) {
            this.f165426e = 1;
        }
        int i = width / this.f165426e;
        this.f165427f = i;
        if (i == 0) {
            Log.e("GridSection", "Too many columns (" + this.f165426e + ") for available width" + width + ".");
        }
    }

    public GridSLM(LayoutManager layoutManager, Context context) {
        super(layoutManager);
        this.f165424c = context;
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public LayoutManager.LayoutParams mo229868a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    private void m257438a(C65671a.C65672a aVar, C65674c cVar) {
        this.f165472b.measureChildWithMargins(aVar.f165457a, cVar.f165469j + cVar.f165470k + ((this.f165426e - 1) * this.f165427f), 0);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229862a(int i, int i2, int i3) {
        int width = this.f165472b.getWidth();
        int i4 = 0;
        boolean z = false;
        while (i2 >= 0) {
            View childAt = this.f165472b.getChildAt(i2);
            LayoutManager.LayoutParams layoutParams = (LayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mo229890d() != i) {
                break;
            }
            if (!layoutParams.f165442a) {
                if (childAt.getLeft() >= width) {
                    break;
                }
                width = childAt.getLeft();
                z = true;
                i4 = Math.max(i4, this.f165472b.getDecoratedBottom(childAt));
            }
            i2--;
        }
        return z ? i4 : i3;
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229866a(int i, C65674c cVar, C65671a aVar) {
        int i2;
        int i3;
        int itemCount = aVar.mo229902a().getItemCount();
        int i4 = cVar.f165460a + 1;
        int i5 = 0;
        while (i5 < cVar.f165466g && i4 < i) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i2 = this.f165426e;
                if (i6 >= i2 || (i3 = i4 + i6) >= itemCount) {
                    i5 += i7;
                    i4 += i2;
                } else {
                    C65671a.C65672a c = aVar.mo229907c(i3);
                    m257438a(c, cVar);
                    i7 = Math.max(i7, this.f165472b.getDecoratedMeasuredHeight(c.f165457a));
                    aVar.mo229904a(i3, c.f165457a);
                    i6++;
                }
            }
            i5 += i7;
            i4 += i2;
        }
        if (i5 == cVar.f165466g) {
            return 0;
        }
        if (i5 > cVar.f165466g) {
            return 1;
        }
        return -i5;
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: b */
    public int mo229872b(int i, View view, C65674c cVar, C65671a aVar) {
        return mo229871b(i, this.f165472b.getDecoratedTop(view), this.f165472b.getPosition(view) - 1, cVar, aVar);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229865a(int i, View view, C65674c cVar, C65671a aVar) {
        return mo229863a(i, mo229862a(cVar.f165460a, this.f165472b.getChildCount() - 1, this.f165472b.getDecoratedBottom(view)), this.f165472b.getPosition(view) + 1, cVar, aVar);
    }

    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: a */
    public int mo229863a(int i, int i2, int i3, C65674c cVar, C65671a aVar) {
        int itemCount;
        int i4;
        if (i2 >= i || i3 >= (itemCount = aVar.mo229902a().getItemCount())) {
            return i2;
        }
        C65671a.C65672a c = aVar.mo229907c(i3);
        aVar.mo229904a(i3, c.f165457a);
        if (c.mo229908a().mo229890d() != cVar.f165460a) {
            return i2;
        }
        if (cVar.f165461b) {
            i4 = cVar.f165460a + 1;
        } else {
            i4 = cVar.f165460a;
        }
        int i5 = (i3 - i4) % this.f165426e;
        for (int i6 = 1; i6 <= i5; i6++) {
            int i7 = 1;
            while (true) {
                if (i7 > this.f165472b.getChildCount()) {
                    break;
                }
                View childAt = this.f165472b.getChildAt(this.f165472b.getChildCount() - i7);
                if (this.f165472b.getPosition(childAt) == i3 - i6) {
                    i2 = this.f165472b.getDecoratedTop(childAt);
                    this.f165472b.detachAndScrapViewAt(i7, aVar.f165453a);
                    break;
                } else if (((LayoutManager.LayoutParams) childAt.getLayoutParams()).mo229890d() != cVar.f165460a) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        int i8 = i3 - i5;
        while (true) {
            if (i8 >= itemCount || i2 > i) {
                break;
            }
            C65671a.C65672a c2 = aVar.mo229907c(i8);
            if (c2.mo229908a().mo229890d() != cVar.f165460a) {
                aVar.mo229904a(i8, c2.f165457a);
                break;
            }
            i2 += mo229864a(i2, i8, LayoutManager.Direction.END, true, cVar, aVar);
            i8 += this.f165426e;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r12 = false;
     */
    @Override // com.tonicartos.superslim.AbstractC65675d
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo229871b(int r19, int r20, int r21, com.tonicartos.superslim.C65674c r22, com.tonicartos.superslim.C65671a r23) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.superslim.GridSLM.mo229871b(int, int, int, com.tonicartos.superslim.c, com.tonicartos.superslim.a):int");
    }

    /* renamed from: a */
    private void m257437a(C65671a.C65672a aVar, int i, int i2, int i3, C65674c cVar, C65671a aVar2) {
        int i4;
        int i5;
        if (aVar.mo229908a().height != -1) {
            i3 = this.f165472b.getDecoratedMeasuredHeight(aVar.f165457a);
        }
        if (i2 == this.f165426e - 1) {
            i4 = this.f165472b.getDecoratedMeasuredWidth(aVar.f165457a);
        } else {
            i4 = Math.min(this.f165427f, this.f165472b.getDecoratedMeasuredWidth(aVar.f165457a));
        }
        int i6 = i + i3;
        if (aVar2.f165455c) {
            i5 = cVar.f165468i;
        } else {
            i5 = cVar.f165467h;
        }
        int i7 = i5 + (i2 * this.f165427f);
        this.f165472b.layoutDecorated(aVar.f165457a, i7, i, i7 + i4, i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo229864a(int r19, int r20, com.tonicartos.superslim.LayoutManager.Direction r21, boolean r22, com.tonicartos.superslim.C65674c r23, com.tonicartos.superslim.C65671a r24) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.superslim.GridSLM.mo229864a(int, int, com.tonicartos.superslim.LayoutManager$Direction, boolean, com.tonicartos.superslim.c, com.tonicartos.superslim.a):int");
    }
}
