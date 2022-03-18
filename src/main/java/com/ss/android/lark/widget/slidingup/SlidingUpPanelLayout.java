package com.ss.android.lark.widget.slidingup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0908j;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.slidingup.C59140b;
import java.util.List;

public class SlidingUpPanelLayout extends ViewGroup {

    /* renamed from: i */
    private static final PanelState f146709i = PanelState.COLLAPSED;

    /* renamed from: j */
    private static final int[] f146710j = {16842927};

    /* renamed from: A */
    private boolean f146711A;

    /* renamed from: B */
    private float f146712B;

    /* renamed from: C */
    private float f146713C;

    /* renamed from: D */
    private float f146714D;

    /* renamed from: E */
    private float f146715E;

    /* renamed from: F */
    private boolean f146716F;

    /* renamed from: G */
    private final List<AbstractC59138b> f146717G;

    /* renamed from: H */
    private View.OnClickListener f146718H;

    /* renamed from: I */
    private boolean f146719I;

    /* renamed from: J */
    private final Rect f146720J;

    /* renamed from: a */
    public boolean f146721a;

    /* renamed from: b */
    public View f146722b;

    /* renamed from: c */
    public PanelState f146723c;

    /* renamed from: d */
    public float f146724d;

    /* renamed from: e */
    public int f146725e;

    /* renamed from: f */
    public float f146726f;

    /* renamed from: g */
    public boolean f146727g;

    /* renamed from: h */
    public final C59140b f146728h;

    /* renamed from: k */
    private int f146729k;

    /* renamed from: l */
    private int f146730l;

    /* renamed from: m */
    private final Paint f146731m;

    /* renamed from: n */
    private final Drawable f146732n;

    /* renamed from: o */
    private int f146733o;

    /* renamed from: p */
    private int f146734p;

    /* renamed from: q */
    private int f146735q;

    /* renamed from: r */
    private boolean f146736r;

    /* renamed from: s */
    private boolean f146737s;

    /* renamed from: t */
    private View f146738t;

    /* renamed from: u */
    private int f146739u;

    /* renamed from: v */
    private View f146740v;

    /* renamed from: w */
    private int f146741w;

    /* renamed from: x */
    private C59139a f146742x;

    /* renamed from: y */
    private View f146743y;

    /* renamed from: z */
    private PanelState f146744z;

    public enum PanelState {
        EXPANDED,
        COLLAPSED,
        ANCHORED,
        HIDDEN,
        DRAGGING
    }

    /* renamed from: com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$b */
    public interface AbstractC59138b {
        /* renamed from: a */
        void mo147146a(View view, float f);

        /* renamed from: a */
        void mo147147a(View view, PanelState panelState, PanelState panelState2);
    }

    public float getAnchorPoint() {
        return this.f146726f;
    }

    public int getCoveredFadeColor() {
        return this.f146730l;
    }

    public View getDragView() {
        return this.f146738t;
    }

    public int getMinFlingVelocity() {
        return this.f146729k;
    }

    public int getPanelHeight() {
        return this.f146733o;
    }

    public PanelState getPanelState() {
        return this.f146723c;
    }

    public int getShadowHeight() {
        return this.f146734p;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        private static final int[] f146747b = {16843137};

        /* renamed from: a */
        public float f146748a;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f146747b);
            if (obtainStyledAttributes != null) {
                this.f146748a = obtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo200907b() {
        mo200906a(BitmapDescriptorFactory.HUE_RED, 0);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f146719I = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f146719I = true;
    }

    /* renamed from: e */
    public void mo200917e() {
        if (this.f146735q > 0) {
            ViewCompat.m4057b(this.f146743y, (float) getCurrentParallaxOffset());
        }
    }

    public void computeScroll() {
        C59140b bVar = this.f146728h;
        if (bVar != null && bVar.mo200972a(true)) {
            if (!isEnabled()) {
                this.f146728h.mo200980d();
            } else {
                ViewCompat.m4073e(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo200913d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public int getCurrentParallaxOffset() {
        int max = (int) (((float) this.f146735q) * Math.max(this.f146724d, (float) BitmapDescriptorFactory.HUE_RED));
        if (this.f146721a) {
            return -max;
        }
        return max;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f146739u;
        if (i != -1) {
            setDragView(findViewById(i));
        }
        int i2 = this.f146741w;
        if (i2 != -1) {
            setScrollableView(findViewById(i2));
        }
    }

    public Parcelable onSaveInstanceState() {
        PanelState panelState;
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        if (this.f146723c != PanelState.DRAGGING) {
            panelState = this.f146723c;
        } else {
            panelState = this.f146744z;
        }
        bundle.putSerializable("sliding_state", panelState);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$2 */
    public static /* synthetic */ class C591362 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146746a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$PanelState[] r0 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.PanelState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.C591362.f146746a = r0
                com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$PanelState r1 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.PanelState.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.C591362.f146746a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$PanelState r1 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.PanelState.ANCHORED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.C591362.f146746a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$PanelState r1 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.PanelState.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.C591362.f146746a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$PanelState r1 = com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.PanelState.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.C591362.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo200910c() {
        int i;
        int i2;
        int i3;
        int i4;
        if (getChildCount() != 0) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            View view = this.f146722b;
            int i5 = 0;
            if (view == null || !m229684b(view)) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                i4 = this.f146722b.getLeft();
                i3 = this.f146722b.getRight();
                i2 = this.f146722b.getTop();
                i = this.f146722b.getBottom();
            }
            View childAt = getChildAt(0);
            int max = Math.max(paddingLeft, childAt.getLeft());
            int max2 = Math.max(paddingTop, childAt.getTop());
            int min = Math.min(width, childAt.getRight());
            int min2 = Math.min(height, childAt.getBottom());
            if (max >= i4 && max2 >= i2 && min <= i3 && min2 <= i) {
                i5 = 4;
            }
            childAt.setVisibility(i5);
        }
    }

    /* renamed from: a */
    public boolean mo200905a() {
        if (!this.f146711A || this.f146722b == null || this.f146723c == PanelState.HIDDEN) {
            return false;
        }
        return true;
    }

    public void setClipPanel(boolean z) {
        this.f146737s = z;
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        this.f146718H = onClickListener;
    }

    public void setMinFlingVelocity(int i) {
        this.f146729k = i;
    }

    public void setOverlayed(boolean z) {
        this.f146736r = z;
    }

    public void setScrollableView(View view) {
        this.f146740v = view;
    }

    public void setScrollableViewHelper(C59139a aVar) {
        this.f146742x = aVar;
    }

    public void setTouchEnabled(boolean z) {
        this.f146711A = z;
    }

    /* renamed from: com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout$a */
    private class C59137a extends C59140b.AbstractC59143a {
        private C59137a() {
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: a */
        public int mo200957a(View view) {
            return SlidingUpPanelLayout.this.f146725e;
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: a */
        public void mo200959a(int i) {
            if (SlidingUpPanelLayout.this.f146728h != null && SlidingUpPanelLayout.this.f146728h.mo200965a() == 0) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                slidingUpPanelLayout.f146724d = slidingUpPanelLayout.mo200900a(slidingUpPanelLayout.f146722b.getTop());
                SlidingUpPanelLayout.this.mo200917e();
                if (SlidingUpPanelLayout.this.f146724d == 1.0f) {
                    SlidingUpPanelLayout.this.mo200910c();
                    SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.EXPANDED);
                } else if (SlidingUpPanelLayout.this.f146724d == BitmapDescriptorFactory.HUE_RED) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.COLLAPSED);
                } else if (SlidingUpPanelLayout.this.f146724d < BitmapDescriptorFactory.HUE_RED) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.HIDDEN);
                    SlidingUpPanelLayout.this.f146722b.setVisibility(4);
                } else {
                    SlidingUpPanelLayout.this.mo200910c();
                    SlidingUpPanelLayout.this.setPanelStateInternal(PanelState.ANCHORED);
                }
            }
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: b */
        public void mo200963b(View view, int i) {
            SlidingUpPanelLayout.this.mo200913d();
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: a */
        public boolean mo200962a(View view, int i) {
            if (SlidingUpPanelLayout.this.f146727g || view != SlidingUpPanelLayout.this.f146722b) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: a */
        public int mo200958a(View view, int i, int i2) {
            int a = SlidingUpPanelLayout.this.mo200901a(BitmapDescriptorFactory.HUE_RED);
            int a2 = SlidingUpPanelLayout.this.mo200901a(1.0f);
            if (SlidingUpPanelLayout.this.f146721a) {
                return Math.min(Math.max(i, a2), a);
            }
            return Math.min(Math.max(i, a), a2);
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: a */
        public void mo200960a(View view, float f, float f2) {
            int i;
            if (SlidingUpPanelLayout.this.f146721a) {
                f2 = -f2;
            }
            int i2 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i2 > 0 && SlidingUpPanelLayout.this.f146724d <= SlidingUpPanelLayout.this.f146726f) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                i = slidingUpPanelLayout.mo200901a(slidingUpPanelLayout.f146726f);
            } else if (i2 <= 0 || SlidingUpPanelLayout.this.f146724d <= SlidingUpPanelLayout.this.f146726f) {
                int i3 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i3 < 0 && SlidingUpPanelLayout.this.f146724d >= SlidingUpPanelLayout.this.f146726f) {
                    SlidingUpPanelLayout slidingUpPanelLayout2 = SlidingUpPanelLayout.this;
                    i = slidingUpPanelLayout2.mo200901a(slidingUpPanelLayout2.f146726f);
                } else if (i3 < 0 && SlidingUpPanelLayout.this.f146724d < SlidingUpPanelLayout.this.f146726f) {
                    i = SlidingUpPanelLayout.this.mo200901a(BitmapDescriptorFactory.HUE_RED);
                } else if (SlidingUpPanelLayout.this.f146724d >= (SlidingUpPanelLayout.this.f146726f + 1.0f) / 2.0f) {
                    i = SlidingUpPanelLayout.this.mo200901a(1.0f);
                } else if (SlidingUpPanelLayout.this.f146724d >= SlidingUpPanelLayout.this.f146726f / 2.0f) {
                    SlidingUpPanelLayout slidingUpPanelLayout3 = SlidingUpPanelLayout.this;
                    i = slidingUpPanelLayout3.mo200901a(slidingUpPanelLayout3.f146726f);
                } else {
                    i = SlidingUpPanelLayout.this.mo200901a(BitmapDescriptorFactory.HUE_RED);
                }
            } else {
                i = SlidingUpPanelLayout.this.mo200901a(1.0f);
            }
            if (SlidingUpPanelLayout.this.f146728h != null) {
                SlidingUpPanelLayout.this.f146728h.mo200969a(view.getLeft(), i);
            }
            SlidingUpPanelLayout.this.invalidate();
        }

        @Override // com.ss.android.lark.widget.slidingup.C59140b.AbstractC59143a
        /* renamed from: a */
        public void mo200961a(View view, int i, int i2, int i3, int i4) {
            SlidingUpPanelLayout.this.mo200908b(i2);
            SlidingUpPanelLayout.this.invalidate();
        }
    }

    public SlidingUpPanelLayout(Context context) {
        this(context, null);
    }

    public void setCoveredFadeColor(int i) {
        this.f146730l = i;
        requestLayout();
    }

    /* renamed from: a */
    public void mo200904a(AbstractC59138b bVar) {
        synchronized (this.f146717G) {
            this.f146717G.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo200909b(AbstractC59138b bVar) {
        synchronized (this.f146717G) {
            this.f146717G.remove(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setDragView(int i) {
        this.f146739u = i;
        setDragView(findViewById(i));
    }

    public void setPanelStateInternal(PanelState panelState) {
        PanelState panelState2 = this.f146723c;
        if (panelState2 != panelState) {
            this.f146723c = panelState;
            mo200903a(this, panelState2, panelState);
        }
    }

    public void setParallaxOffset(int i) {
        this.f146735q = i;
        if (!this.f146719I) {
            requestLayout();
        }
    }

    public void setShadowHeight(int i) {
        this.f146734p = i;
        if (!this.f146719I) {
            invalidate();
        }
    }

    /* renamed from: b */
    private static boolean m229684b(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public float mo200900a(int i) {
        float f;
        int a = mo200901a(BitmapDescriptorFactory.HUE_RED);
        if (this.f146721a) {
            f = (float) (a - i);
        } else {
            f = (float) (i - a);
        }
        return f / ((float) this.f146725e);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            PanelState panelState = (PanelState) bundle.getSerializable("sliding_state");
            this.f146723c = panelState;
            if (panelState == null) {
                panelState = f146709i;
            }
            this.f146723c = panelState;
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setAnchorPoint(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            this.f146726f = f;
            this.f146719I = true;
            requestLayout();
        }
    }

    public void setGravity(int i) {
        boolean z;
        if (i == 48 || i == 80) {
            if (i == 80) {
                z = true;
            } else {
                z = false;
            }
            this.f146721a = z;
            if (!this.f146719I) {
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("gravity must be set to either top or bottom");
    }

    public void setPanelHeight(int i) {
        if (getPanelHeight() != i) {
            this.f146733o = i;
            if (!this.f146719I) {
                requestLayout();
            }
            if (getPanelState() == PanelState.COLLAPSED) {
                mo200907b();
                invalidate();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !mo200905a()) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.f146728h.mo200974b(motionEvent);
            return true;
        } catch (Exception e) {
            Log.m165398w("SlidingUpPanelLayout", "exception in onInterceptTouchEvent", e);
            return false;
        }
    }

    public void setDragView(View view) {
        View view2 = this.f146738t;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        this.f146738t = view;
        if (view != null) {
            view.setClickable(true);
            this.f146738t.setFocusable(false);
            this.f146738t.setFocusableInTouchMode(false);
            this.f146738t.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.View$OnClickListenerC591351 */

                public void onClick(View view) {
                    if (SlidingUpPanelLayout.this.isEnabled() && SlidingUpPanelLayout.this.mo200905a()) {
                        if (SlidingUpPanelLayout.this.f146723c == PanelState.EXPANDED || SlidingUpPanelLayout.this.f146723c == PanelState.ANCHORED) {
                            SlidingUpPanelLayout.this.setPanelState(PanelState.COLLAPSED);
                        } else if (SlidingUpPanelLayout.this.f146726f < 1.0f) {
                            SlidingUpPanelLayout.this.setPanelState(PanelState.ANCHORED);
                        } else {
                            SlidingUpPanelLayout.this.setPanelState(PanelState.EXPANDED);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public int mo200901a(float f) {
        int i;
        View view = this.f146722b;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        int i2 = (int) (f * ((float) this.f146725e));
        if (this.f146721a) {
            return ((getMeasuredHeight() - getPaddingBottom()) - this.f146733o) - i2;
        }
        return (getPaddingTop() - i) + this.f146733o + i2;
    }

    /* renamed from: b */
    public void mo200908b(int i) {
        int i2;
        if (this.f146723c != PanelState.DRAGGING) {
            this.f146744z = this.f146723c;
        }
        setPanelStateInternal(PanelState.DRAGGING);
        this.f146724d = mo200900a(i);
        mo200917e();
        mo200902a(this.f146722b);
        LayoutParams layoutParams = (LayoutParams) this.f146743y.getLayoutParams();
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) - this.f146733o;
        if (this.f146724d <= BitmapDescriptorFactory.HUE_RED && !this.f146736r) {
            if (this.f146721a) {
                i2 = i - getPaddingBottom();
            } else {
                i2 = ((getHeight() - getPaddingBottom()) - this.f146722b.getMeasuredHeight()) - i;
            }
            layoutParams.height = i2;
            if (layoutParams.height == height) {
                layoutParams.height = -1;
            }
            this.f146743y.requestLayout();
        } else if (layoutParams.height != -1 && !this.f146736r) {
            layoutParams.height = -1;
            this.f146743y.requestLayout();
        }
    }

    public void draw(Canvas canvas) {
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (this.f146732n != null && (view = this.f146722b) != null) {
            int right = view.getRight();
            if (this.f146721a) {
                i2 = this.f146722b.getTop() - this.f146734p;
                i = this.f146722b.getTop();
            } else {
                i2 = this.f146722b.getBottom();
                i = this.f146722b.getBottom() + this.f146734p;
            }
            this.f146732n.setBounds(this.f146722b.getLeft(), i2, right, i);
            this.f146732n.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo200902a(View view) {
        synchronized (this.f146717G) {
            for (AbstractC59138b bVar : this.f146717G) {
                bVar.mo147146a(view, this.f146724d);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        int a = C0908j.m4366a(motionEvent);
        if (!isEnabled() || !mo200905a() || (this.f146727g && a != 0)) {
            this.f146728h.mo200980d();
            return super.dispatchTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (a == 0) {
            this.f146716F = false;
            this.f146712B = x;
            this.f146713C = y;
        } else if (a == 2) {
            float f = y - this.f146713C;
            this.f146712B = x;
            this.f146713C = y;
            if (Math.abs(x - this.f146712B) > Math.abs(f)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (!m229683a(this.f146740v, (int) this.f146714D, (int) this.f146715E)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            boolean z = this.f146721a;
            int i2 = -1;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            if (((float) i) * f <= BitmapDescriptorFactory.HUE_RED) {
                if (z) {
                    i2 = 1;
                }
                if (f * ((float) i2) < BitmapDescriptorFactory.HUE_RED) {
                    if (this.f146724d < 1.0f) {
                        this.f146716F = false;
                        return onTouchEvent(motionEvent);
                    }
                    if (!this.f146716F && this.f146728h.mo200981e()) {
                        this.f146728h.mo200979c();
                        motionEvent.setAction(0);
                    }
                    this.f146716F = true;
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else if (this.f146742x.mo200964a(this.f146740v, z) > 0) {
                this.f146716F = true;
                return super.dispatchTouchEvent(motionEvent);
            } else {
                if (this.f146716F) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    motionEvent.setAction(0);
                }
                this.f146716F = false;
                return onTouchEvent(motionEvent);
            }
        } else if (a == 1 && this.f146716F) {
            this.f146728h.mo200967a(0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r0 != 3) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setPanelState(PanelState panelState) {
        PanelState panelState2;
        int i;
        if (this.f146728h.mo200965a() == 2) {
            Log.m165379d("SlidingUpPanelLayout", "View is settling. Aborting animation.");
            this.f146728h.mo200980d();
        }
        if (panelState == null || panelState == PanelState.DRAGGING) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        } else if (!isEnabled()) {
        } else {
            if ((this.f146719I || this.f146722b != null) && panelState != (panelState2 = this.f146723c) && panelState2 != PanelState.DRAGGING) {
                if (this.f146719I) {
                    setPanelStateInternal(panelState);
                    return;
                }
                if (this.f146723c == PanelState.HIDDEN) {
                    this.f146722b.setVisibility(0);
                    requestLayout();
                }
                int i2 = C591362.f146746a[panelState.ordinal()];
                if (i2 == 1) {
                    mo200906a(1.0f, 0);
                } else if (i2 == 2) {
                    mo200906a(this.f146726f, 0);
                } else if (i2 == 3) {
                    int a = mo200901a(BitmapDescriptorFactory.HUE_RED);
                    if (this.f146721a) {
                        i = this.f146733o;
                    } else {
                        i = -this.f146733o;
                    }
                    mo200906a(mo200900a(a + i), 0);
                } else if (i2 == 4) {
                    mo200906a(BitmapDescriptorFactory.HUE_RED, 0);
                }
            }
        }
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
            int childCount = getChildCount();
            if (childCount == 2) {
                this.f146743y = getChildAt(0);
                View childAt = getChildAt(1);
                this.f146722b = childAt;
                if (this.f146738t == null) {
                    setDragView(childAt);
                }
                if (this.f146722b.getVisibility() != 0) {
                    this.f146723c = PanelState.HIDDEN;
                }
                int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt2 = getChildAt(i7);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8 || i7 != 0) {
                        if (childAt2 == this.f146743y) {
                            if (this.f146736r || this.f146723c == PanelState.HIDDEN) {
                                i4 = paddingTop;
                            } else {
                                i4 = paddingTop - this.f146733o;
                            }
                            i3 = paddingLeft - (layoutParams.leftMargin + layoutParams.rightMargin);
                        } else {
                            if (childAt2 == this.f146722b) {
                                i4 = paddingTop - layoutParams.topMargin;
                            } else {
                                i4 = paddingTop;
                            }
                            i3 = paddingLeft;
                        }
                        if (layoutParams.width == -2) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                        } else if (layoutParams.width == -1) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        } else {
                            i5 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                        }
                        if (layoutParams.height == -2) {
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                        } else {
                            if (layoutParams.f146748a > BitmapDescriptorFactory.HUE_RED && layoutParams.f146748a < 1.0f) {
                                i4 = (int) (((float) i4) * layoutParams.f146748a);
                            } else if (layoutParams.height != -1) {
                                i4 = layoutParams.height;
                            }
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        }
                        childAt2.measure(i5, i6);
                        View view = this.f146722b;
                        if (childAt2 == view) {
                            this.f146725e = view.getMeasuredHeight() - this.f146733o;
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        } else {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo200906a(float f, int i) {
        if (isEnabled() && this.f146722b != null) {
            int a = mo200901a(f);
            C59140b bVar = this.f146728h;
            View view = this.f146722b;
            if (bVar.mo200971a(view, view.getLeft(), a)) {
                mo200913d();
                ViewCompat.m4073e(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m229683a(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i3 = iArr2[0] + i;
        int i4 = iArr2[1] + i2;
        if (i3 < iArr[0] || i3 >= iArr[0] + view.getWidth() || i4 < iArr[1] || i4 >= iArr[1] + view.getHeight()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int save = canvas.save();
        View view2 = this.f146722b;
        if (view2 == null || view2 == view) {
            z = super.drawChild(canvas, view, j);
        } else {
            canvas.getClipBounds(this.f146720J);
            if (!this.f146736r) {
                if (this.f146721a) {
                    Rect rect = this.f146720J;
                    rect.bottom = Math.min(rect.bottom, this.f146722b.getTop());
                } else {
                    Rect rect2 = this.f146720J;
                    rect2.top = Math.max(rect2.top, this.f146722b.getBottom());
                }
            }
            if (this.f146737s) {
                canvas.clipRect(this.f146720J);
            }
            z = super.drawChild(canvas, view, j);
            int i = this.f146730l;
            if (i != 0) {
                float f = this.f146724d;
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    this.f146731m.setColor((i & 16777215) | (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24));
                    canvas.drawRect(this.f146720J, this.f146731m);
                }
            }
        }
        canvas.restoreToCount(save);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SlidingUpPanelLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo200903a(View view, PanelState panelState, PanelState panelState2) {
        synchronized (this.f146717G) {
            for (AbstractC59138b bVar : this.f146717G) {
                bVar.mo147147a(view, panelState, panelState2);
            }
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            this.f146719I = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f146719I) {
            int i7 = C591362.f146746a[this.f146723c.ordinal()];
            if (i7 == 1) {
                this.f146724d = 1.0f;
            } else if (i7 == 2) {
                this.f146724d = this.f146726f;
            } else if (i7 != 3) {
                this.f146724d = BitmapDescriptorFactory.HUE_RED;
            } else {
                int a = mo200901a(BitmapDescriptorFactory.HUE_RED);
                if (this.f146721a) {
                    i6 = this.f146733o;
                } else {
                    i6 = -this.f146733o;
                }
                this.f146724d = mo200900a(a + i6);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || (i8 != 0 && !this.f146719I)) {
                int measuredHeight = childAt.getMeasuredHeight();
                if (childAt == this.f146722b) {
                    i5 = mo200901a(this.f146724d);
                } else {
                    i5 = paddingTop;
                }
                if (!this.f146721a && childAt == this.f146743y && !this.f146736r) {
                    i5 = mo200901a(this.f146724d) + this.f146722b.getMeasuredHeight();
                }
                int i9 = layoutParams.leftMargin + paddingLeft;
                childAt.layout(i9, i5, childAt.getMeasuredWidth() + i9, measuredHeight + i5);
            }
        }
        if (this.f146719I) {
            mo200910c();
        }
        mo200917e();
        this.f146719I = false;
    }
}
