package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.a */
public class C31099a extends View {

    /* renamed from: a */
    protected View f78527a;

    /* renamed from: b */
    protected int f78528b;

    /* renamed from: c */
    protected int f78529c;

    /* renamed from: d */
    protected float f78530d;

    /* renamed from: e */
    protected int f78531e;

    /* renamed from: f */
    protected float f78532f;

    /* renamed from: g */
    protected float f78533g;

    /* renamed from: h */
    protected PointF f78534h;

    /* renamed from: i */
    protected int f78535i;

    /* renamed from: j */
    protected Drawable f78536j;

    /* renamed from: k */
    protected RectF f78537k;

    /* renamed from: l */
    protected Paint f78538l;

    /* renamed from: m */
    private final int f78539m;

    /* renamed from: n */
    private boolean f78540n;

    /* renamed from: a */
    public void mo112661a() {
        this.f78540n = true;
        invalidate();
    }

    /* renamed from: b */
    private void m116082b() {
        setLayerType(1, null);
        this.f78537k = new RectF();
        this.f78534h = new PointF();
        Paint paint = new Paint();
        this.f78538l = paint;
        paint.setAntiAlias(true);
        this.f78538l.setStyle(Paint.Style.FILL);
        this.f78535i = C32634ae.m125178a(R.color.lkui_O500);
        this.f78530d = (float) UIUtils.dp2px(getContext(), 5.0f);
        this.f78531e = 8388661;
        this.f78532f = (float) UIUtils.dp2px(getContext(), BitmapDescriptorFactory.HUE_RED);
        this.f78533g = (float) UIUtils.dp2px(getContext(), BitmapDescriptorFactory.HUE_RED);
        if (Build.VERSION.SDK_INT >= 21) {
            setTranslationZ(1000.0f);
        }
        this.f78540n = false;
    }

    /* renamed from: c */
    private void m116083c() {
        switch (this.f78531e) {
            case 17:
                this.f78534h.x = ((float) this.f78528b) / 2.0f;
                this.f78534h.y = ((float) this.f78529c) / 2.0f;
                return;
            case 49:
                this.f78534h.x = ((float) this.f78528b) / 2.0f;
                this.f78534h.y = this.f78533g + this.f78530d;
                return;
            case 81:
                this.f78534h.x = ((float) this.f78528b) / 2.0f;
                this.f78534h.y = ((float) this.f78529c) - (this.f78533g + this.f78530d);
                return;
            case 8388627:
                this.f78534h.x = this.f78532f + this.f78530d;
                this.f78534h.y = ((float) this.f78529c) / 2.0f;
                return;
            case 8388629:
                this.f78534h.x = ((float) this.f78528b) - (this.f78532f + this.f78530d);
                this.f78534h.y = ((float) this.f78529c) / 2.0f;
                return;
            case 8388659:
                this.f78534h.x = this.f78532f + this.f78530d;
                this.f78534h.y = this.f78533g + this.f78530d;
                return;
            case 8388661:
                this.f78534h.x = ((float) this.f78528b) - (this.f78532f + this.f78530d);
                this.f78534h.y = this.f78533g + this.f78530d;
                return;
            case 8388691:
                this.f78534h.x = this.f78532f + this.f78530d;
                this.f78534h.y = ((float) this.f78529c) - (this.f78533g + this.f78530d);
                return;
            case 8388693:
                this.f78534h.x = ((float) this.f78528b) - (this.f78532f + this.f78530d);
                this.f78534h.y = ((float) this.f78529c) - (this.f78533g + this.f78530d);
                return;
            default:
                return;
        }
    }

    public C31099a(Context context) {
        this(context, null);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.a$a */
    private class C31100a extends ViewGroup {
        /* access modifiers changed from: protected */
        @Override // android.view.View, android.view.ViewGroup
        public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
            if (!(getParent() instanceof RelativeLayout)) {
                super.dispatchRestoreInstanceState(sparseArray);
            }
        }

        public C31100a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            View view = null;
            View view2 = null;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt instanceof C31099a)) {
                    view = childAt;
                } else {
                    view2 = childAt;
                }
            }
            if (view == null) {
                super.onMeasure(i, i2);
                return;
            }
            view.measure(i, i2);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    /* renamed from: a */
    public C31099a mo112659a(int i) {
        if (i == 8388659 || i == 8388661 || i == 8388691 || i == 8388693 || i == 17 || i == 49 || i == 81 || i == 8388627 || i == 8388629) {
            this.f78531e = i;
            invalidate();
            return this;
        }
        throw new IllegalStateException("only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END");
    }

    /* renamed from: a */
    public C31099a mo112660a(View view) {
        if (view != null) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new IllegalStateException("targetView must have a parent");
            }
            this.f78527a = view;
            if (parent instanceof C31100a) {
                ((C31100a) parent).addView(this);
            } else {
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                viewGroup.removeView(view);
                C31100a aVar = new C31100a(getContext());
                if (viewGroup instanceof RelativeLayout) {
                    aVar.setId(view.getId());
                }
                viewGroup.addView(aVar, indexOfChild, layoutParams);
                aVar.addView(view);
                aVar.addView(this);
            }
            return this;
        }
        throw new IllegalStateException("targetView can not be null");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f78540n) {
            this.f78538l.setColor(this.f78535i);
            m116083c();
            if (this.f78534h.x != -1000.0f || this.f78534h.y != -1000.0f) {
                if (this.f78536j != null) {
                    this.f78536j.setBounds(((int) this.f78534h.x) - ((int) this.f78530d), ((int) this.f78534h.y) - ((int) this.f78530d), ((int) this.f78534h.x) + ((int) this.f78530d), ((int) this.f78534h.y) + ((int) this.f78530d));
                    this.f78536j.draw(canvas);
                    return;
                }
                canvas.drawCircle(this.f78534h.x, this.f78534h.y, this.f78530d, this.f78538l);
            }
        }
    }

    private C31099a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C31099a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f78539m = 5;
        m116082b();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f78528b = i;
        this.f78529c = i2;
    }
}
