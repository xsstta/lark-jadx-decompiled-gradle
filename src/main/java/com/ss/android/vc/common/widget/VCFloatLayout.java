package com.ss.android.vc.common.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60753g;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.common.widget.VcFloatInterceptedFrameLayout;

public class VCFloatLayout extends FrameLayout {

    /* renamed from: a */
    protected Position f152116a;

    /* renamed from: b */
    public int[] f152117b;

    /* renamed from: c */
    public boolean f152118c;

    /* renamed from: d */
    private StickyMode f152119d;

    /* renamed from: e */
    private AbstractC60821b f152120e;

    /* renamed from: f */
    private AbstractC60822c f152121f;

    /* renamed from: g */
    private int f152122g;

    /* renamed from: h */
    private int f152123h;

    /* renamed from: i */
    private int f152124i;

    /* renamed from: j */
    private int f152125j;

    /* renamed from: k */
    private View f152126k;

    /* renamed from: l */
    private FrameLayout.LayoutParams f152127l;

    /* renamed from: m */
    private boolean f152128m;

    /* renamed from: n */
    private boolean f152129n;

    /* renamed from: o */
    private int f152130o;

    /* renamed from: p */
    private boolean f152131p;

    /* renamed from: q */
    private Rect f152132q;

    /* renamed from: r */
    private int f152133r;

    /* renamed from: s */
    private String f152134s;

    public enum Position {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public enum StickyMode {
        AUTO,
        LEFT,
        RIGHT
    }

    /* renamed from: com.ss.android.vc.common.widget.VCFloatLayout$a */
    public interface AbstractC60820a {
        /* renamed from: a */
        void mo208539a();
    }

    /* renamed from: com.ss.android.vc.common.widget.VCFloatLayout$b */
    public interface AbstractC60821b {
        /* renamed from: a */
        void mo208540a(Rect rect);
    }

    /* renamed from: com.ss.android.vc.common.widget.VCFloatLayout$c */
    public interface AbstractC60822c {
        /* renamed from: a */
        void mo208541a(Rect rect);
    }

    /* renamed from: a */
    private void m236395a(String str) {
    }

    public View getContentView() {
        return this.f152126k;
    }

    /* renamed from: a */
    public void mo208525a(FrameLayout.LayoutParams layoutParams, AbstractC60820a aVar) {
        View view = this.f152126k;
        if (view != null) {
            VcFloatInterceptedFrameLayout vcFloatInterceptedFrameLayout = (VcFloatInterceptedFrameLayout) view;
            this.f152126k = vcFloatInterceptedFrameLayout.getChildAt(0);
            vcFloatInterceptedFrameLayout.removeAllViews();
            removeAllViews();
            addView(this.f152126k, layoutParams);
            this.f152126k = null;
            this.f152118c = false;
            m236394a(aVar);
        }
    }

    /* renamed from: e */
    private void mo213680e() {
        m236394a((AbstractC60820a) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo208527c() {
        StickyMode stickyMode = this.f152119d;
        if (stickyMode == null || stickyMode == StickyMode.AUTO) {
            return true;
        }
        return false;
    }

    public int getContentBottomMargin() {
        if (this.f152126k == null) {
            return 0;
        }
        return getHeight() - this.f152126k.getBottom();
    }

    /* renamed from: f */
    private void mo213681f() {
        if (this.f152127l != null && this.f152126k.getWidth() > 0 && this.f152126k.getHeight() > 0) {
            this.f152127l.leftMargin = this.f152126k.getLeft();
            this.f152127l.topMargin = this.f152126k.getTop();
            this.f152127l.gravity = 51;
            this.f152126k.setLayoutParams(this.f152127l);
        }
    }

    /* renamed from: b */
    public void mo208526b() {
        FrameLayout.LayoutParams layoutParams = this.f152127l;
        if (layoutParams != null) {
            layoutParams.topMargin = this.f152130o;
            this.f152127l.leftMargin = getWidth() - this.f152127l.width;
            this.f152126k.setLayoutParams(this.f152127l);
            mo208528d();
            m236399g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo208528d() {
        boolean z;
        if (this.f152127l != null && getHeight() != 0) {
            boolean z2 = false;
            if (this.f152127l.topMargin < 1) {
                z = true;
            } else {
                z = false;
            }
            this.f152128m = z;
            if (Math.abs((this.f152126k.getHeight() + this.f152127l.topMargin) - getHeight()) < 1) {
                z2 = true;
            }
            this.f152129n = z2;
        }
    }

    /* renamed from: g */
    private void m236399g() {
        boolean z;
        if (getHeight() != 0 && getWidth() != 0) {
            boolean z2 = true;
            if (this.f152127l.topMargin + (this.f152127l.height / 2) < getHeight() / 2) {
                z = true;
            } else {
                z = false;
            }
            if (this.f152127l.leftMargin + (this.f152127l.width / 2) >= getWidth() / 2) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    this.f152116a = Position.LEFT_TOP;
                } else {
                    this.f152116a = Position.LEFT_BOTTOM;
                }
            } else if (z) {
                this.f152116a = Position.RIGHT_TOP;
            } else {
                this.f152116a = Position.RIGHT_BOTTOM;
            }
        }
    }

    public Rect getFloatContentBound() {
        Rect rect = new Rect();
        if (!(this.f152127l == null || this.f152126k == null)) {
            mo213681f();
            Rect rect2 = new Rect();
            getGlobalVisibleRect(rect2);
            rect.left = rect2.left + this.f152127l.leftMargin;
            rect.top = rect2.top + this.f152127l.topMargin;
            rect.right = rect.left + this.f152126k.getWidth();
            rect.bottom = rect.top + this.f152126k.getHeight();
        }
        return rect;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo208522a() {
        if (getChildCount() != 1) {
            throw new IllegalStateException("Only one child is illegal.");
        } else if (this.f152126k == null) {
            View childAt = getChildAt(0);
            this.f152126k = childAt;
            if (childAt.getVisibility() == 8) {
                C60775q.m236136a("The visibility of content view cannot be gone.");
            }
            int left = this.f152126k.getLeft();
            int top = this.f152126k.getTop();
            removeAllViews();
            VcFloatInterceptedFrameLayout vcFloatInterceptedFrameLayout = new VcFloatInterceptedFrameLayout(getContext());
            vcFloatInterceptedFrameLayout.addView(this.f152126k, new FrameLayout.LayoutParams(-2, -2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f152126k.getWidth(), this.f152126k.getHeight());
            this.f152127l = layoutParams;
            layoutParams.leftMargin = left;
            this.f152127l.topMargin = top;
            this.f152127l.gravity = 51;
            addView(vcFloatInterceptedFrameLayout, this.f152127l);
            this.f152126k = vcFloatInterceptedFrameLayout;
            mo208528d();
            vcFloatInterceptedFrameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class com.ss.android.vc.common.widget.$$Lambda$VCFloatLayout$_1lCv7ge7cWrnCgCoNtzFDk6Iuo */

                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    VCFloatLayout.lambda$_1lCv7ge7cWrnCgCoNtzFDk6Iuo(VCFloatLayout.this, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            vcFloatInterceptedFrameLayout.setDispatchTouchEventListener(new VcFloatInterceptedFrameLayout.AbstractC60825a() {
                /* class com.ss.android.vc.common.widget.$$Lambda$VCFloatLayout$87sBgwZDl69D56XoQBYvKBGUx4 */

                @Override // com.ss.android.vc.common.widget.VcFloatInterceptedFrameLayout.AbstractC60825a
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    return VCFloatLayout.m271128lambda$87sBgwZDl69D56XoQBYvKBGUx4(VCFloatLayout.this, motionEvent);
                }
            });
            Rect rect = this.f152132q;
            if (rect != null) {
                mo208524a(rect);
            }
            int i = this.f152133r;
            if (i > 0) {
                mo208523a(i, (Integer) 5);
            }
        }
    }

    public void setMovePositionChangeListener(AbstractC60821b bVar) {
        this.f152120e = bVar;
    }

    public void setName(String str) {
        this.f152134s = str;
    }

    public void setStickyPositionChangeListener(AbstractC60822c cVar) {
        this.f152121f = cVar;
    }

    /* renamed from: a */
    private void m236394a(final AbstractC60820a aVar) {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.vc.common.widget.VCFloatLayout.ViewTreeObserver$OnPreDrawListenerC608191 */

            public boolean onPreDraw() {
                VCFloatLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                if (VCFloatLayout.this.f152118c) {
                    return false;
                }
                VCFloatLayout.this.mo208522a();
                VCFloatLayout vCFloatLayout = VCFloatLayout.this;
                vCFloatLayout.getLocationOnScreen(vCFloatLayout.f152117b);
                VCFloatLayout.this.f152118c = true;
                AbstractC60820a aVar = aVar;
                if (aVar == null) {
                    return false;
                }
                aVar.mo208539a();
                return false;
            }
        });
    }

    public void setStickyMode(StickyMode stickyMode) {
        if (this.f152119d == null && stickyMode != null) {
            this.f152119d = stickyMode;
        }
    }

    public VCFloatLayout(Context context) {
        super(context);
        this.f152116a = Position.RIGHT_TOP;
        this.f152117b = new int[2];
        this.f152133r = -1;
        this.f152134s = "_";
        mo213680e();
    }

    /* renamed from: a */
    private void mo213678a(int i) {
        if (this.f152120e != null) {
            Rect floatContentBound = getFloatContentBound();
            floatContentBound.offset(i, 0);
            this.f152120e.mo208540a(floatContentBound);
        }
    }

    public void setMinTopMargin(int i) {
        this.f152130o = i;
        FrameLayout.LayoutParams layoutParams = this.f152127l;
        if (layoutParams != null && !this.f152131p && layoutParams.topMargin < i) {
            this.f152127l.topMargin = i;
            this.f152126k.setLayoutParams(this.f152127l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.common.widget.VCFloatLayout$d */
    public static class C60823d extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private float f152137a;

        /* renamed from: b */
        private float f152138b;

        /* renamed from: c */
        private float f152139c;

        /* renamed from: d */
        private float f152140d;

        /* renamed from: e */
        private AbstractC60824a f152141e;

        /* renamed from: com.ss.android.vc.common.widget.VCFloatLayout$d$a */
        public interface AbstractC60824a {
            void onUpdate(float f, float f2, boolean z);
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f152141e != null) {
                this.f152141e.onUpdate((this.f152137a * floatValue) - this.f152138b, (this.f152139c * floatValue) - this.f152140d, C60753g.m236084a(floatValue, 1.0f));
            }
            this.f152138b = this.f152137a * floatValue;
            this.f152140d = this.f152139c * floatValue;
        }

        public C60823d(float f, float f2, AbstractC60824a aVar) {
            this.f152141e = aVar;
            this.f152137a = f;
            this.f152139c = f2;
            setInterpolator(new OvershootInterpolator());
            addUpdateListener(this);
            setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
            setDuration(200L);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m236396a(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int rawX = (int) (motionEvent.getRawX() - ((float) this.f152122g));
                    int rawY = (int) (motionEvent.getRawY() - ((float) this.f152123h));
                    if (rawX == 0 && rawX == 0) {
                        return false;
                    }
                    if (this.f152127l.leftMargin + rawX <= 0) {
                        i2 = 0;
                    } else if (this.f152127l.leftMargin + rawX + this.f152127l.width >= getWidth()) {
                        i2 = getWidth() - this.f152127l.width;
                    } else {
                        i2 = rawX + this.f152127l.leftMargin;
                    }
                    if (this.f152127l.topMargin + rawY <= 0) {
                        this.f152128m = true;
                        i3 = 0;
                    } else if (this.f152127l.topMargin + rawY + this.f152126k.getHeight() >= getHeight()) {
                        i3 = getHeight() - this.f152126k.getHeight();
                        this.f152129n = true;
                    } else {
                        i3 = rawY + this.f152127l.topMargin;
                        this.f152129n = false;
                        this.f152128m = false;
                    }
                    this.f152127l.leftMargin = i2;
                    this.f152127l.topMargin = i3;
                    this.f152126k.setLayoutParams(this.f152127l);
                    requestLayout();
                    this.f152122g = (int) motionEvent.getRawX();
                    this.f152123h = (int) motionEvent.getRawY();
                    return false;
                } else if (actionMasked != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f152131p = false;
            if (Math.abs(((float) this.f152124i) - motionEvent.getRawX()) >= 5.0f || Math.abs(((float) this.f152125j) - motionEvent.getRawY()) >= 5.0f) {
                z = true;
            } else {
                z = false;
            }
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if ((this.f152127l.leftMargin == 0 && this.f152119d == StickyMode.LEFT) || (this.f152127l.leftMargin + this.f152127l.width == rect.right && this.f152119d == StickyMode.RIGHT)) {
                m236399g();
                if (this.f152120e != null) {
                    mo213678a(0);
                }
            } else {
                if (!mo208527c() || this.f152127l.leftMargin + (this.f152127l.width / 2) > rect.centerX()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                StickyMode stickyMode = this.f152119d;
                if (stickyMode == null || stickyMode != StickyMode.LEFT) {
                    z3 = z2;
                }
                if (z3) {
                    i = -this.f152127l.leftMargin;
                } else {
                    i = (rect.width() - this.f152127l.leftMargin) - this.f152127l.width;
                }
                if (this.f152120e != null && z) {
                    mo213678a(i);
                } else if (this.f152126k != null && this.f152118c) {
                    m236391a(i, 0);
                }
            }
            return z;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f152131p = true;
        mo213681f();
        this.f152122g = (int) motionEvent.getRawX();
        this.f152123h = (int) motionEvent.getRawY();
        this.f152124i = (int) motionEvent.getRawX();
        this.f152125j = (int) motionEvent.getRawY();
        return false;
    }

    /* renamed from: a */
    public void mo208524a(Rect rect) {
        C60700b.m235851b("VCFloatLayout", "[moveToPos]", "Rect Pos: " + rect);
        if (rect == null) {
            C60700b.m235864f("VCFloatLayout", "[moveToPos2]", "ExpectedArea is invalid.");
        } else if (this.f152127l == null) {
            this.f152132q = rect;
        } else if (!getFloatContentBound().equals(rect)) {
            Rect rect2 = new Rect();
            getGlobalVisibleRect(rect2);
            if (rect2.width() != 0 && rect2.height() != 0) {
                if (rect2.width() < rect.width() || rect2.height() < rect.height()) {
                    C60775q.m236136a("[moveToPos]ExpectedArea is too big: " + rect + ", floatArea: " + rect2);
                    return;
                }
                if (!rect2.contains(rect)) {
                    if (rect.left < rect2.left) {
                        rect.offset(rect2.left - rect.left, 0);
                    }
                    if (rect.right > rect2.right) {
                        rect.offset(rect2.right - rect.right, 0);
                    }
                    if (rect.top < rect2.top) {
                        rect.offset(0, rect2.top - rect.top);
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect.offset(0, rect2.bottom - rect.bottom);
                    }
                }
                this.f152127l.leftMargin = rect.left - rect2.left;
                this.f152127l.topMargin = rect.top - rect2.top;
                this.f152126k.setLayoutParams(this.f152127l);
            }
        }
    }

    public VCFloatLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f152116a = Position.RIGHT_TOP;
        this.f152117b = new int[2];
        this.f152133r = -1;
        this.f152134s = "_";
        mo213680e();
    }

    /* renamed from: a */
    private void m236391a(int i, int i2) {
        if (i == 0 && i2 == 0) {
            m236399g();
            return;
        }
        int i3 = this.f152127l.topMargin + i2;
        m236395a("[adjustLoc] lastTopMargin: " + i3);
        new C60823d((float) i, (float) i2, new C60823d.AbstractC60824a(i, i3) {
            /* class com.ss.android.vc.common.widget.$$Lambda$VCFloatLayout$djhKCNlUGwuMF91jWgdX7SCKbE */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.vc.common.widget.VCFloatLayout.C60823d.AbstractC60824a
            public final void onUpdate(float f, float f2, boolean z) {
                VCFloatLayout.m271129lambda$djhKCNlUGwuMF91jWgdX7SCKbE(VCFloatLayout.this, this.f$1, this.f$2, f, f2, z);
            }
        }).start();
    }

    /* renamed from: a */
    public void mo208523a(int i, Integer num) {
        View view;
        if (i >= 0 && (view = this.f152126k) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            this.f152127l = layoutParams;
            if (layoutParams == null) {
                this.f152133r = i;
                return;
            }
            if (num == null) {
                num = Integer.valueOf(layoutParams.gravity);
            }
            this.f152127l.bottomMargin = i;
            this.f152127l.gravity = Integer.valueOf(num.intValue() | 80).intValue();
            this.f152126k.setLayoutParams(this.f152127l);
        }
    }

    public VCFloatLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152116a = Position.RIGHT_TOP;
        this.f152117b = new int[2];
        this.f152133r = -1;
        this.f152134s = "_";
        mo213680e();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f152127l != null && this.f152126k != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            if (this.f152128m) {
                this.f152127l.topMargin = 0;
            } else {
                int i5 = this.f152127l.topMargin - (iArr[1] - this.f152117b[1]);
                if (i5 < 0) {
                    i5 = 0;
                }
                this.f152127l.topMargin = i5;
            }
            int i6 = this.f152127l.topMargin;
            int i7 = this.f152130o;
            if (i6 < i7) {
                this.f152127l.topMargin = i7;
            }
            if (this.f152129n) {
                FrameLayout.LayoutParams layoutParams = this.f152127l;
                layoutParams.topMargin = i2 - layoutParams.height;
            } else if (this.f152127l.topMargin + this.f152127l.height > i2) {
                FrameLayout.LayoutParams layoutParams2 = this.f152127l;
                layoutParams2.topMargin = i2 - layoutParams2.height;
            }
            if (this.f152127l.leftMargin == 0) {
                this.f152127l.leftMargin = 0;
            } else if (this.f152127l.rightMargin == 0) {
                this.f152127l.leftMargin = getWidth() - this.f152127l.width;
            }
            this.f152126k.setLayoutParams(this.f152127l);
            int[] iArr2 = this.f152117b;
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
            mo208528d();
            m236399g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236392a(int i, int i2, float f, float f2, boolean z) {
        if (this.f152126k != null && this.f152118c) {
            FrameLayout.LayoutParams layoutParams = this.f152127l;
            layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + f);
            FrameLayout.LayoutParams layoutParams2 = this.f152127l;
            layoutParams2.topMargin = (int) (((float) layoutParams2.topMargin) + f2);
            if (z) {
                if (mo208527c()) {
                    if (i < 0) {
                        this.f152127l.leftMargin = 0;
                    } else {
                        this.f152127l.leftMargin = getWidth() - this.f152127l.width;
                    }
                } else if (this.f152119d == StickyMode.LEFT) {
                    this.f152127l.leftMargin = 0;
                } else {
                    this.f152127l.leftMargin = getWidth() - this.f152127l.width;
                }
                this.f152127l.topMargin = i2;
                if (this.f152127l.topMargin < 0) {
                    this.f152127l.topMargin = 0;
                } else if (this.f152127l.topMargin > getHeight() - this.f152126k.getHeight()) {
                    this.f152127l.topMargin = getHeight() - this.f152126k.getHeight();
                }
                m236395a("[adjustLoc] Top margin when finished: " + this.f152127l.topMargin);
            }
            this.f152126k.setLayoutParams(this.f152127l);
            requestLayout();
            if (z) {
                m236399g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236393a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.f152131p && this.f152121f != null) {
            mo213681f();
            m236399g();
            mo208528d();
            m236395a("[onLayoutChange]left: " + i + ", top: " + i2 + ", right: " + i3 + ", bottom: " + i4);
            this.f152121f.mo208541a(getFloatContentBound());
        }
    }
}
