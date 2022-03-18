package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C22438b;
import com.google.android.material.theme.p992a.C22497a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f55043a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224221 */

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo78155d();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo78151b(message.arg1);
                return true;
            }
        }
    });

    /* renamed from: b */
    public static final boolean f55044b;

    /* renamed from: c */
    public static final String f55045c = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: k */
    private static final int[] f55046k = {R.attr.snackbarStyle};

    /* renamed from: d */
    protected final C22435d f55047d;

    /* renamed from: e */
    public final AbstractC22437a f55048e;

    /* renamed from: f */
    public int f55049f;

    /* renamed from: g */
    public int f55050g;

    /* renamed from: h */
    public int f55051h;

    /* renamed from: i */
    public int f55052i;

    /* renamed from: j */
    C22438b.AbstractC22440a f55053j;

    /* renamed from: l */
    private final ViewGroup f55054l;

    /* renamed from: m */
    private boolean f55055m;

    /* renamed from: n */
    private View f55056n;

    /* renamed from: o */
    private final Runnable f55057o;

    /* renamed from: p */
    private Rect f55058p;

    /* renamed from: q */
    private int f55059q;

    /* renamed from: r */
    private List<BaseCallback<B>> f55060r;

    /* renamed from: s */
    private Behavior f55061s;

    /* renamed from: t */
    private final AccessibilityManager f55062t;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        /* renamed from: a */
        public void mo78178a(B b) {
        }

        /* renamed from: a */
        public void mo78179a(B b, int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public interface AbstractC22433b {
        /* renamed from: a */
        void mo78163a(View view);

        /* renamed from: b */
        void mo78164b(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public interface AbstractC22434c {
        /* renamed from: a */
        void mo78166a(View view, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public static class C22435d extends FrameLayout {

        /* renamed from: a */
        private static final View.OnTouchListener f55083a = new View.OnTouchListener() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C22435d.View$OnTouchListenerC224361 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };

        /* renamed from: b */
        private AbstractC22434c f55084b;

        /* renamed from: c */
        private AbstractC22433b f55085c;

        /* renamed from: d */
        private int f55086d;

        /* renamed from: e */
        private final float f55087e;

        /* renamed from: f */
        private final float f55088f;

        /* renamed from: g */
        private ColorStateList f55089g;

        /* renamed from: h */
        private PorterDuff.Mode f55090h;

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f55088f;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f55086d;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f55087e;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AbstractC22433b bVar = this.f55085c;
            if (bVar != null) {
                bVar.mo78163a(this);
            }
            ViewCompat.m4108w(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AbstractC22433b bVar = this.f55085c;
            if (bVar != null) {
                bVar.mo78164b(this);
            }
        }

        /* renamed from: a */
        private Drawable m81368a() {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C22197a.m80104a(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f55089g == null) {
                return C0774a.m3779g(gradientDrawable);
            }
            Drawable g = C0774a.m3779g(gradientDrawable);
            C0774a.m3768a(g, this.f55089g);
            return g;
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f55086d = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(AbstractC22433b bVar) {
            this.f55085c = bVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(AbstractC22434c cVar) {
            this.f55084b = cVar;
        }

        protected C22435d(Context context) {
            this(context, null);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f55083a;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f55089g == null)) {
                drawable = C0774a.m3779g(drawable.mutate());
                C0774a.m3768a(drawable, this.f55089g);
                C0774a.m3771a(drawable, this.f55090h);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f55089g = colorStateList;
            if (getBackground() != null) {
                Drawable g = C0774a.m3779g(getBackground().mutate());
                C0774a.m3768a(g, colorStateList);
                C0774a.m3771a(g, this.f55090h);
                if (g != getBackground()) {
                    super.setBackgroundDrawable(g);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f55090h = mode;
            if (getBackground() != null) {
                Drawable g = C0774a.m3779g(getBackground().mutate());
                C0774a.m3771a(g, mode);
                if (g != getBackground()) {
                    super.setBackgroundDrawable(g);
                }
            }
        }

        protected C22435d(Context context, AttributeSet attributeSet) {
            super(C22497a.m81662a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth});
            if (obtainStyledAttributes.hasValue(6)) {
                ViewCompat.m4092k(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f55086d = obtainStyledAttributes.getInt(2, 0);
            this.f55087e = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C22313c.m80795a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(C22365r.m81021a(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f55088f = obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f55083a);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.m4039a(this, m81368a());
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AbstractC22434c cVar = this.f55084b;
            if (cVar != null) {
                cVar.mo78166a(this, i, i2, i3, i4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public SwipeDismissBehavior<? extends View> mo78153c() {
        return new Behavior();
    }

    /* renamed from: b */
    public boolean mo78152b() {
        return C22438b.m81375a().mo78213e(this.f55053j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo78157f() {
        this.f55047d.post(new Runnable() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass13 */

            public void run() {
                if (BaseTransientBottomBar.this.f55047d != null) {
                    BaseTransientBottomBar.this.f55047d.setVisibility(0);
                    if (BaseTransientBottomBar.this.f55047d.getAnimationMode() == 1) {
                        BaseTransientBottomBar.this.mo78158g();
                    } else {
                        BaseTransientBottomBar.this.mo78159h();
                    }
                }
            }
        });
    }

    /* renamed from: k */
    private boolean m81336k() {
        if (this.f55052i <= 0 || this.f55055m || !m81337l()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m81337l() {
        ViewGroup.LayoutParams layoutParams = this.f55047d.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams) || !(((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private int m81339n() {
        int height = this.f55047d.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f55047d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: e */
    public void mo78156e() {
        if (mo78161j()) {
            mo78157f();
            return;
        }
        this.f55047d.setVisibility(0);
        mo78160i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo78161j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f55062t.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT > 19) {
            z = false;
        } else {
            z = true;
        }
        f55044b = z;
    }

    /* renamed from: m */
    private int m81338m() {
        View view = this.f55056n;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f55054l.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f55054l.getHeight()) - i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo78160i() {
        C22438b.m81375a().mo78210b(this.f55053j);
        List<BaseCallback<B>> list = this.f55060r;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f55060r.get(size).mo78178a(this);
            }
        }
    }

    /* renamed from: a */
    public void mo78149a() {
        Rect rect;
        int i;
        ViewGroup.LayoutParams layoutParams = this.f55047d.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f55058p) == null) {
            Log.w(f55045c, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f55056n != null) {
            i = this.f55059q;
        } else {
            i = this.f55049f;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + i;
        marginLayoutParams.leftMargin = this.f55058p.left + this.f55050g;
        marginLayoutParams.rightMargin = this.f55058p.right + this.f55051h;
        this.f55047d.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m81336k()) {
            this.f55047d.removeCallbacks(this.f55057o);
            this.f55047d.post(this.f55057o);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo78155d() {
        this.f55047d.setOnAttachStateChangeListener(new AbstractC22433b() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass10 */

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC22433b
            /* renamed from: a */
            public void mo78163a(View view) {
                WindowInsets rootWindowInsets;
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f55047d.getRootWindowInsets()) != null) {
                    BaseTransientBottomBar.this.f55052i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    BaseTransientBottomBar.this.mo78149a();
                }
            }

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC22433b
            /* renamed from: b */
            public void mo78164b(View view) {
                if (BaseTransientBottomBar.this.mo78152b()) {
                    BaseTransientBottomBar.f55043a.post(new Runnable() {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass10.RunnableC224231 */

                        public void run() {
                            BaseTransientBottomBar.this.mo78154c(3);
                        }
                    });
                }
            }
        });
        if (this.f55047d.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f55047d.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                m81331a((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.f55059q = m81338m();
            mo78149a();
            this.f55047d.setVisibility(4);
            this.f55054l.addView(this.f55047d);
        }
        if (ViewCompat.m4012F(this.f55047d)) {
            mo78156e();
        } else {
            this.f55047d.setOnLayoutChangeListener(new AbstractC22434c() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass11 */

                @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC22434c
                /* renamed from: a */
                public void mo78166a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.f55047d.setOnLayoutChangeListener(null);
                    BaseTransientBottomBar.this.mo78156e();
                }
            });
        }
    }

    /* renamed from: g */
    public void mo78158g() {
        ValueAnimator a = m81330a(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator b = m81332b(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a, b);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224242 */

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo78160i();
            }
        });
        animatorSet.start();
    }

    /* renamed from: h */
    public void mo78159h() {
        int n = m81339n();
        if (f55044b) {
            ViewCompat.m4087i((View) this.f55047d, n);
        } else {
            this.f55047d.setTranslationY((float) n);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(n, 0);
        valueAnimator.setInterpolator(C22116a.f53780b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224286 */

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo78160i();
            }

            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f55048e.mo78200a(70, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(n) {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224297 */

            /* renamed from: a */
            final /* synthetic */ int f55074a;

            /* renamed from: c */
            private int f55076c;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f55044b) {
                    ViewCompat.m4087i((View) BaseTransientBottomBar.this.f55047d, intValue - this.f55076c);
                } else {
                    BaseTransientBottomBar.this.f55047d.setTranslationY((float) intValue);
                }
                this.f55076c = intValue;
            }

            {
                this.f55074a = r2;
                this.f55076c = r2;
            }
        });
        valueAnimator.start();
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public static class C22432a {

        /* renamed from: a */
        private C22438b.AbstractC22440a f55082a;

        /* renamed from: a */
        public boolean mo78183a(View view) {
            return view instanceof C22435d;
        }

        /* renamed from: a */
        public void mo78182a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f55082a = baseTransientBottomBar.f55053j;
        }

        public C22432a(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo76519a(0.1f);
            swipeDismissBehavior.mo76523b(0.6f);
            swipeDismissBehavior.mo76520a(0);
        }

        /* renamed from: a */
        public void mo78181a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C22438b.m81375a().mo78212d(this.f55082a);
                }
            } else if (coordinatorLayout.mo3944a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C22438b.m81375a().mo78211c(this.f55082a);
            }
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: g */
        private final C22432a f55081g = new C22432a(this);

        /* renamed from: a */
        public void mo78180a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f55081g.mo78182a(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: a */
        public boolean mo76522a(View view) {
            return this.f55081g.mo78183a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f55081g.mo78181a(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo78150a(int i) {
        C22438b.m81375a().mo78208a(this.f55053j, i);
    }

    /* renamed from: a */
    private ValueAnimator m81330a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C22116a.f53779a);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224264 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseTransientBottomBar.this.f55047d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* renamed from: b */
    private ValueAnimator m81332b(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C22116a.f53782d);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224275 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseTransientBottomBar.this.f55047d.setScaleX(floatValue);
                BaseTransientBottomBar.this.f55047d.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    /* renamed from: d */
    private void m81333d(int i) {
        if (this.f55047d.getAnimationMode() == 1) {
            m81334e(i);
        } else {
            m81335f(i);
        }
    }

    /* renamed from: a */
    private void m81331a(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f55061s;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo78153c();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).mo78180a((BaseTransientBottomBar<?>) this);
        }
        swipeDismissBehavior.mo76521a(new SwipeDismissBehavior.AbstractC22147a() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass12 */

            @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC22147a
            /* renamed from: a */
            public void mo76525a(View view) {
                view.setVisibility(8);
                BaseTransientBottomBar.this.mo78150a(0);
            }

            @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC22147a
            /* renamed from: a */
            public void mo76524a(int i) {
                if (i == 0) {
                    C22438b.m81375a().mo78212d(BaseTransientBottomBar.this.f55053j);
                } else if (i == 1 || i == 2) {
                    C22438b.m81375a().mo78211c(BaseTransientBottomBar.this.f55053j);
                }
            }
        });
        layoutParams.setBehavior(swipeDismissBehavior);
        if (this.f55056n == null) {
            layoutParams.insetEdge = 80;
        }
    }

    /* renamed from: e */
    private void m81334e(final int i) {
        ValueAnimator a = m81330a(1.0f, BitmapDescriptorFactory.HUE_RED);
        a.setDuration(75L);
        a.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224253 */

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo78154c(i);
            }
        });
        a.start();
    }

    /* renamed from: f */
    private void m81335f(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m81339n());
        valueAnimator.setInterpolator(C22116a.f53780b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224308 */

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo78154c(i);
            }

            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f55048e.mo78201b(0, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C224319 */

            /* renamed from: b */
            private int f55080b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f55044b) {
                    ViewCompat.m4087i((View) BaseTransientBottomBar.this.f55047d, intValue - this.f55080b);
                } else {
                    BaseTransientBottomBar.this.f55047d.setTranslationY((float) intValue);
                }
                this.f55080b = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo78151b(int i) {
        if (!mo78161j() || this.f55047d.getVisibility() != 0) {
            mo78154c(i);
        } else {
            m81333d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78154c(int i) {
        C22438b.m81375a().mo78207a(this.f55053j);
        List<BaseCallback<B>> list = this.f55060r;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f55060r.get(size).mo78179a(this, i);
            }
        }
        ViewParent parent = this.f55047d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f55047d);
        }
    }
}
