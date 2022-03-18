package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.C0959c;
import androidx.customview.view.AbsSavedState;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    View f5074a;

    /* renamed from: b */
    float f5075b;

    /* renamed from: c */
    int f5076c;

    /* renamed from: d */
    boolean f5077d;

    /* renamed from: e */
    final C0959c f5078e;

    /* renamed from: f */
    boolean f5079f;

    /* renamed from: g */
    final ArrayList<RunnableC1449b> f5080g;

    /* renamed from: h */
    private int f5081h;

    /* renamed from: i */
    private int f5082i;

    /* renamed from: j */
    private Drawable f5083j;

    /* renamed from: k */
    private Drawable f5084k;

    /* renamed from: l */
    private final int f5085l;

    /* renamed from: m */
    private boolean f5086m;

    /* renamed from: n */
    private float f5087n;

    /* renamed from: o */
    private int f5088o;

    /* renamed from: p */
    private float f5089p;

    /* renamed from: q */
    private float f5090q;

    /* renamed from: r */
    private AbstractC1451d f5091r;

    /* renamed from: s */
    private boolean f5092s;

    /* renamed from: t */
    private final Rect f5093t;

    /* renamed from: u */
    private Method f5094u;

    /* renamed from: v */
    private Field f5095v;

    /* renamed from: w */
    private boolean f5096w;

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface AbstractC1451d {
        /* renamed from: a */
        void mo7680a(View view);

        /* renamed from: a */
        void mo7681a(View view, float f);

        /* renamed from: b */
        void mo7682b(View view);
    }

    /* renamed from: e */
    public boolean mo7643e() {
        return this.f5086m;
    }

    public int getCoveredFadeColor() {
        return this.f5082i;
    }

    public int getParallaxDistance() {
        return this.f5088o;
    }

    public int getSliderFadeColor() {
        return this.f5081h;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f5097e = {16843137};

        /* renamed from: a */
        public float f5098a;

        /* renamed from: b */
        boolean f5099b;

        /* renamed from: c */
        boolean f5100c;

        /* renamed from: d */
        Paint f5101d;

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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5097e);
            this.f5098a = obtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public boolean mo7633b() {
        return m6603b(this.f5074a, 0);
    }

    /* renamed from: c */
    public boolean mo7635c() {
        return m6602a(this.f5074a, 0);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5092s = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7644f() {
        if (ViewCompat.m4082h(this) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class RunnableC1449b implements Runnable {

        /* renamed from: a */
        final View f5105a;

        public void run() {
            if (this.f5105a.getParent() == SlidingPaneLayout.this) {
                this.f5105a.setLayerType(0, null);
                SlidingPaneLayout.this.mo7642e(this.f5105a);
            }
            SlidingPaneLayout.this.f5080g.remove(this);
        }

        RunnableC1449b(View view) {
            this.f5105a = view;
        }
    }

    public void computeScroll() {
        if (!this.f5078e.mo4869a(true)) {
            return;
        }
        if (!this.f5086m) {
            this.f5078e.mo4886h();
        } else {
            ViewCompat.m4073e(this);
        }
    }

    /* renamed from: d */
    public boolean mo7639d() {
        if (!this.f5086m || this.f5075b == 1.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (mo7643e()) {
            z = mo7639d();
        } else {
            z = this.f5079f;
        }
        savedState.f5102a = z;
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7628a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5092s = true;
        int size = this.f5080g.size();
        for (int i = 0; i < size; i++) {
            this.f5080g.get(i).run();
        }
        this.f5080g.clear();
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.C14471 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: a */
        boolean f5102a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5102a = z;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5102a ? 1 : 0);
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f5082i = i;
    }

    public void setPanelSlideListener(AbstractC1451d dVar) {
        this.f5091r = dVar;
    }

    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f5083j = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f5084k = drawable;
    }

    public void setSliderFadeColor(int i) {
        this.f5081h = i;
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    class C1448a extends C0859a {

        /* renamed from: b */
        private final Rect f5104b = new Rect();

        /* renamed from: c */
        public boolean mo7678c(View view) {
            return SlidingPaneLayout.this.mo7645f(view);
        }

        C1448a() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4540d(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: a */
        private void m6622a(C0864d dVar, C0864d dVar2) {
            Rect rect = this.f5104b;
            dVar2.mo4553a(rect);
            dVar.mo4563b(rect);
            dVar2.mo4572c(rect);
            dVar.mo4578d(rect);
            dVar.mo4583e(dVar2.mo4599j());
            dVar.mo4557a(dVar2.mo4613r());
            dVar.mo4566b(dVar2.mo4614s());
            dVar.mo4582e(dVar2.mo4617u());
            dVar.mo4598j(dVar2.mo4609o());
            dVar.mo4592h(dVar2.mo4605m());
            dVar.mo4576c(dVar2.mo4593h());
            dVar.mo4580d(dVar2.mo4597i());
            dVar.mo4586f(dVar2.mo4601k());
            dVar.mo4589g(dVar2.mo4603l());
            dVar.mo4596i(dVar2.mo4607n());
            dVar.mo4552a(dVar2.mo4577d());
            dVar.mo4562b(dVar2.mo4581e());
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            C0864d a = C0864d.m4172a(dVar);
            super.mo4535a(view, a);
            m6622a(dVar, a);
            a.mo4618v();
            dVar.mo4566b((CharSequence) SlidingPaneLayout.class.getName());
            dVar.mo4564b(view);
            ViewParent i = ViewCompat.m4085i(view);
            if (i instanceof View) {
                dVar.mo4579d((View) i);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i2);
                if (!mo7678c(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.m4069d(childAt, 1);
                    dVar.mo4573c(childAt);
                }
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4537a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo7678c(view)) {
                return super.mo4537a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    private class C1450c extends C0959c.AbstractC0962a {
        C1450c() {
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4889a(View view) {
            return SlidingPaneLayout.this.f5076c;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            if (SlidingPaneLayout.this.f5078e.mo4870b() != 0) {
                return;
            }
            if (SlidingPaneLayout.this.f5075b == BitmapDescriptorFactory.HUE_RED) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.mo7638d(slidingPaneLayout.f5074a);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                slidingPaneLayout2.mo7634c(slidingPaneLayout2.f5074a);
                SlidingPaneLayout.this.f5079f = false;
                return;
            }
            SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
            slidingPaneLayout3.mo7632b(slidingPaneLayout3.f5074a);
            SlidingPaneLayout.this.f5079f = true;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4894a(View view, int i) {
            SlidingPaneLayout.this.mo7628a();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public void mo4898b(int i, int i2) {
            SlidingPaneLayout.this.f5078e.mo4865a(SlidingPaneLayout.this.f5074a, i2);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            if (SlidingPaneLayout.this.f5077d) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f5099b;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f5074a.getLayoutParams();
            if (SlidingPaneLayout.this.mo7644f()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f5074a.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f5076c);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f5076c + paddingLeft);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo7644f()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && SlidingPaneLayout.this.f5075b > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f5076c;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f5074a.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f5075b > 0.5f)) {
                    i += SlidingPaneLayout.this.f5076c;
                }
            }
            SlidingPaneLayout.this.f5078e.mo4866a(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo7629a(i);
            SlidingPaneLayout.this.invalidate();
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public void setParallaxDistance(int i) {
        this.f5088o = i;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7630a(View view) {
        AbstractC1451d dVar = this.f5091r;
        if (dVar != null) {
            dVar.mo7681a(view, this.f5075b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7632b(View view) {
        AbstractC1451d dVar = this.f5091r;
        if (dVar != null) {
            dVar.mo7680a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7634c(View view) {
        AbstractC1451d dVar = this.f5091r;
        if (dVar != null) {
            dVar.mo7682b(view);
        }
        sendAccessibilityEvent(32);
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

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7645f(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f5086m || !layoutParams.f5100c || this.f5075b <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: g */
    private static boolean m6604g(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        if (savedState.f5102a) {
            mo7633b();
        } else {
            mo7635c();
        }
        this.f5079f = savedState.f5102a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6600a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo7644f()
            android.view.View r1 = r9.f5074a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f5100c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f5074a
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f5087n
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f5088o
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f5087n = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f5087n
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f5082i
            r9.m6601a(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m6600a(float):void");
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (mo7644f()) {
            drawable = this.f5084k;
        } else {
            drawable = this.f5083j;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo7644f()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7642e(View view) {
        Field field;
        if (Build.VERSION.SDK_INT >= 17) {
            ViewCompat.m4036a(view, ((LayoutParams) view.getLayoutParams()).f5101d);
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (!this.f5096w) {
                try {
                    this.f5094u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException e) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f5095v = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
                }
                this.f5096w = true;
            }
            if (this.f5094u == null || (field = this.f5095v) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.f5094u.invoke(view, null);
            } catch (Exception e3) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e3);
            }
        }
        ViewCompat.m4032a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5086m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f5078e.mo4872b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5089p = x;
            this.f5090q = y;
        } else if (actionMasked == 1 && mo7645f(this.f5074a)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f5089p;
            float f2 = y2 - this.f5090q;
            int f3 = this.f5078e.mo4884f();
            if ((f * f) + (f2 * f2) < ((float) (f3 * f3)) && this.f5078e.mo4875b(this.f5074a, (int) x2, (int) y2)) {
                m6602a(this.f5074a, 0);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7638d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View childAt;
        boolean z;
        int i7;
        int i8;
        int i9;
        View view2 = view;
        boolean f = mo7644f();
        if (f) {
            i = getWidth() - getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        if (f) {
            i2 = getPaddingLeft();
        } else {
            i2 = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m6604g(view)) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i6 = view.getLeft();
            i5 = view.getRight();
            i4 = view.getTop();
            i3 = view.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = f;
            } else {
                if (f) {
                    i7 = i2;
                } else {
                    i7 = i;
                }
                int max = Math.max(i7, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z = f;
                if (f) {
                    i8 = i;
                } else {
                    i8 = i2;
                }
                int min = Math.min(i8, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max < i6 || max2 < i4 || min > i5 || min2 > i3) {
                    i9 = 0;
                } else {
                    i9 = 4;
                }
                childAt.setVisibility(i9);
            }
            i10++;
            view2 = view;
            f = z;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f5086m && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f5079f = !this.f5078e.mo4875b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f5086m || (this.f5077d && actionMasked != 0)) {
            this.f5078e.mo4885g();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f5078e.mo4885g();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f5077d = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f5089p = x;
                this.f5090q = y;
                if (this.f5078e.mo4875b(this.f5074a, (int) x, (int) y) && mo7645f(this.f5074a)) {
                    z = true;
                    if (this.f5078e.mo4867a(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f5089p);
                float abs2 = Math.abs(y2 - this.f5090q);
                if (abs > ((float) this.f5078e.mo4884f()) && abs2 > abs) {
                    this.f5078e.mo4885g();
                    this.f5077d = true;
                    return false;
                }
            }
            z = false;
            return this.f5078e.mo4867a(motionEvent) ? true : true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7629a(int i) {
        int i2;
        int i3;
        if (this.f5074a == null) {
            this.f5075b = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        boolean f = mo7644f();
        LayoutParams layoutParams = (LayoutParams) this.f5074a.getLayoutParams();
        int width = this.f5074a.getWidth();
        if (f) {
            i = (getWidth() - i) - width;
        }
        if (f) {
            i2 = getPaddingRight();
        } else {
            i2 = getPaddingLeft();
        }
        if (f) {
            i3 = layoutParams.rightMargin;
        } else {
            i3 = layoutParams.leftMargin;
        }
        float f2 = ((float) (i - (i2 + i3))) / ((float) this.f5076c);
        this.f5075b = f2;
        if (this.f5088o != 0) {
            m6600a(f2);
        }
        if (layoutParams.f5100c) {
            m6601a(this.f5074a, this.f5075b, this.f5081h);
        }
        mo7630a(this.f5074a);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m6602a(View view, int i) {
        if (!this.f5092s && !mo7631a(BitmapDescriptorFactory.HUE_RED, i)) {
            return false;
        }
        this.f5079f = false;
        return true;
    }

    /* renamed from: b */
    private boolean m6603b(View view, int i) {
        if (!this.f5092s && !mo7631a(1.0f, i)) {
            return false;
        }
        this.f5079f = true;
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f5086m) {
            if (view == this.f5074a) {
                z = true;
            } else {
                z = false;
            }
            this.f5079f = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7631a(float f, int i) {
        int i2;
        if (!this.f5086m) {
            return false;
        }
        boolean f2 = mo7644f();
        LayoutParams layoutParams = (LayoutParams) this.f5074a.getLayoutParams();
        if (f2) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f5076c))) + ((float) this.f5074a.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f5076c)));
        }
        C0959c cVar = this.f5078e;
        View view = this.f5074a;
        if (!cVar.mo4868a(view, i2, view.getTop())) {
            return false;
        }
        mo7628a();
        ViewCompat.m4073e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = LocationRequest.PRIORITY_INDOOR;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = LocationRequest.PRIORITY_INDOOR;
            }
        }
        boolean z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f5074a = null;
        int i13 = paddingLeft;
        int i14 = 0;
        boolean z4 = false;
        float f = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            i5 = 8;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f5100c = z3;
            } else {
                if (layoutParams.f5098a > BitmapDescriptorFactory.HUE_RED) {
                    f += layoutParams.f5098a;
                    if (layoutParams.width == 0) {
                    }
                }
                int i15 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i15, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i15, 1073741824);
                } else {
                    i11 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    i12 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i13 -= measuredWidth;
                if (i13 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                layoutParams.f5099b = z2;
                z4 |= z2;
                if (layoutParams.f5099b) {
                    this.f5074a = childAt;
                }
            }
            i14++;
            z3 = false;
        }
        if (z4 || f > BitmapDescriptorFactory.HUE_RED) {
            int i16 = paddingLeft - this.f5085l;
            int i17 = 0;
            while (i17 < childCount) {
                View childAt2 = getChildAt(i17);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        if (layoutParams2.width != 0 || layoutParams2.f5098a <= BitmapDescriptorFactory.HUE_RED) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z4 || childAt2 == this.f5074a) {
                            if (layoutParams2.f5098a > BitmapDescriptorFactory.HUE_RED) {
                                if (layoutParams2.width != 0) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                } else if (layoutParams2.height == -1) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z4) {
                                    int i18 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i6 = i16;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                                    if (i7 != i18) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i17++;
                                    i16 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i16;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((layoutParams2.f5098a * ((float) Math.max(0, i13))) / f)), 1073741824), i8);
                                    i17++;
                                    i16 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i7 > i16 || layoutParams2.f5098a > BitmapDescriptorFactory.HUE_RED)) {
                            if (!z) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                i9 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i16, i9), i10);
                        }
                    }
                }
                i6 = i16;
                i17++;
                i16 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.f5086m = z4;
        if (this.f5078e.mo4870b() != 0 && !z4) {
            this.f5078e.mo4886h();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5081h = -858993460;
        this.f5092s = true;
        this.f5093t = new Rect();
        this.f5080g = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f5085l = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.m4043a(this, new C1448a());
        ViewCompat.m4069d((View) this, 1);
        C0959c a = C0959c.m4641a(this, 0.5f, new C1450c());
        this.f5078e = a;
        a.mo4863a(f * 400.0f);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f5086m && !layoutParams.f5099b && this.f5074a != null) {
            canvas.getClipBounds(this.f5093t);
            if (mo7644f()) {
                Rect rect = this.f5093t;
                rect.left = Math.max(rect.left, this.f5074a.getRight());
            } else {
                Rect rect2 = this.f5093t;
                rect2.right = Math.min(rect2.right, this.f5074a.getLeft());
            }
            canvas.clipRect(this.f5093t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: a */
    private void m6601a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > BitmapDescriptorFactory.HUE_RED && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f5101d == null) {
                layoutParams.f5101d = new Paint();
            }
            layoutParams.f5101d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f5101d);
            }
            mo7642e(view);
        } else if (view.getLayerType() != 0) {
            if (layoutParams.f5101d != null) {
                layoutParams.f5101d.setColorFilter(null);
            }
            RunnableC1449b bVar = new RunnableC1449b(view);
            this.f5080g.add(bVar);
            ViewCompat.m4046a(this, bVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f5092s = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        float f;
        boolean f2 = mo7644f();
        if (f2) {
            this.f5078e.mo4864a(2);
        } else {
            this.f5078e.mo4864a(1);
        }
        int i12 = i3 - i;
        if (f2) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (f2) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f5092s) {
            if (!this.f5086m || !this.f5079f) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            this.f5075b = f;
        }
        int i13 = i5;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f5099b) {
                    int i15 = i12 - i6;
                    int min = (Math.min(i5, i15 - this.f5085l) - i13) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f5076c = min;
                    if (f2) {
                        i11 = layoutParams.rightMargin;
                    } else {
                        i11 = layoutParams.leftMargin;
                    }
                    if (i13 + i11 + min + (measuredWidth / 2) > i15) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f5100c = z2;
                    int i16 = (int) (((float) min) * this.f5075b);
                    i13 += i11 + i16;
                    this.f5075b = ((float) i16) / ((float) this.f5076c);
                    i7 = 0;
                } else if (!this.f5086m || (i10 = this.f5088o) == 0) {
                    i13 = i5;
                    i7 = 0;
                } else {
                    i7 = (int) ((1.0f - this.f5075b) * ((float) i10));
                    i13 = i5;
                }
                if (f2) {
                    i8 = (i12 - i13) + i7;
                    i9 = i8 - measuredWidth;
                } else {
                    i9 = i13 - i7;
                    i8 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i5 += childAt.getWidth();
            }
        }
        if (this.f5092s) {
            if (this.f5086m) {
                if (this.f5088o != 0) {
                    m6600a(this.f5075b);
                }
                if (((LayoutParams) this.f5074a.getLayoutParams()).f5100c) {
                    m6601a(this.f5074a, this.f5075b, this.f5081h);
                }
            } else {
                for (int i17 = 0; i17 < childCount; i17++) {
                    m6601a(getChildAt(i17), BitmapDescriptorFactory.HUE_RED, this.f5081h);
                }
            }
            mo7638d(this.f5074a);
        }
        this.f5092s = false;
    }
}
