package com.bytedance.ee.bear.bitable.card.view.table;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.customview.p030a.C0959c;

public class BitableCardDragLayout extends ViewGroup {

    /* renamed from: a */
    public C0959c f13949a;

    /* renamed from: b */
    public int f13950b;

    /* renamed from: c */
    public float f13951c;

    /* renamed from: d */
    public int f13952d;

    /* renamed from: e */
    public AbstractC4729a f13953e;

    /* renamed from: f */
    private boolean f13954f;

    /* renamed from: g */
    private RectF f13955g;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.BitableCardDragLayout$a */
    public interface AbstractC4729a {
        /* renamed from: a */
        void mo18448a();

        /* renamed from: a */
        void mo18449a(float f);
    }

    public void computeScroll() {
        if (this.f13949a.mo4869a(true)) {
            ViewCompat.m4073e(this);
        }
    }

    public void setEnabled(boolean z) {
        this.f13954f = z;
    }

    public void setOnDragListener(AbstractC4729a aVar) {
        this.f13953e = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.table.BitableCardDragLayout$b */
    private class C4730b extends C0959c.AbstractC0962a {
        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            return true;
        }

        private C4730b() {
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4896b(View view) {
            return BitableCardDragLayout.this.f13950b;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            if (i == 0 && BitableCardDragLayout.this.f13952d == BitableCardDragLayout.this.f13950b && BitableCardDragLayout.this.f13953e != null) {
                BitableCardDragLayout.this.f13953e.mo18448a();
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            if (i < 0) {
                return 0;
            }
            return Math.min(Math.max(i, BitableCardDragLayout.this.getPaddingTop()), BitableCardDragLayout.this.f13950b);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            boolean z;
            int i;
            if (BitableCardDragLayout.this.f13952d != 0 && BitableCardDragLayout.this.f13952d != BitableCardDragLayout.this.f13950b) {
                if (((float) BitableCardDragLayout.this.f13952d) >= BitableCardDragLayout.this.f13951c) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = BitableCardDragLayout.this.f13950b;
                } else {
                    i = 0;
                }
                if (BitableCardDragLayout.this.f13949a.mo4866a(0, i)) {
                    ViewCompat.m4073e(BitableCardDragLayout.this);
                }
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            BitableCardDragLayout.this.f13952d = Math.abs(i2);
            float f = ((float) BitableCardDragLayout.this.f13952d) / ((float) BitableCardDragLayout.this.f13950b);
            if (f >= 1.0f) {
                f = 1.0f;
            }
            if (BitableCardDragLayout.this.f13953e != null) {
                BitableCardDragLayout.this.f13953e.mo18449a(f);
            }
        }
    }

    public BitableCardDragLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f13949a.mo4872b(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f13955g;
        if (rectF == null || !rectF.contains(motionEvent.getRawX(), motionEvent.getRawY()) || !this.f13954f || !this.f13949a.mo4867a(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setDragArea(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            this.f13955g = new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getMeasuredWidth()), (float) (iArr[1] + view.getMeasuredHeight()));
        }
    }

    public BitableCardDragLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13949a = C0959c.m4642a(this, new C4730b());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1) {
            throw new IllegalStateException("BitableCardDragLayout can host only one direct child.");
        } else if (getChildCount() > 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13950b = i2;
        this.f13951c = ((float) i2) * 0.35f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
        }
    }
}
