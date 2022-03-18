package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.util.C0843d;
import androidx.core.util.Pools;
import androidx.core.view.AbstractC0910l;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.C0883ab;
import androidx.core.view.C0904f;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, AbstractC0910l {

    /* renamed from: a */
    static final String f2974a;

    /* renamed from: b */
    static final Class<?>[] f2975b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f2976c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f2977d;

    /* renamed from: f */
    private static final Pools.AbstractC0839a<Rect> f2978f = new Pools.SynchronizedPool(12);

    /* renamed from: e */
    ViewGroup.OnHierarchyChangeListener f2979e;

    /* renamed from: g */
    private final List<View> f2980g;

    /* renamed from: h */
    private final C0705a<View> f2981h;

    /* renamed from: i */
    private final List<View> f2982i;

    /* renamed from: j */
    private final List<View> f2983j;

    /* renamed from: k */
    private Paint f2984k;

    /* renamed from: l */
    private final int[] f2985l;

    /* renamed from: m */
    private final int[] f2986m;

    /* renamed from: n */
    private boolean f2987n;

    /* renamed from: o */
    private boolean f2988o;

    /* renamed from: p */
    private int[] f2989p;

    /* renamed from: q */
    private View f2990q;

    /* renamed from: r */
    private View f2991r;

    /* renamed from: s */
    private ViewTreeObserver$OnPreDrawListenerC0703c f2992s;

    /* renamed from: t */
    private boolean f2993t;

    /* renamed from: u */
    private C0883ab f2994u;

    /* renamed from: v */
    private boolean f2995v;

    /* renamed from: w */
    private Drawable f2996w;

    /* renamed from: x */
    private AbstractC0912n f2997x;

    /* renamed from: y */
    private final C0911m f2998y;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public interface AbstractC0701a {
        Behavior getBehavior();
    }

    /* renamed from: a */
    private static int m3449a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: c */
    private static int m3462c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & SmEvents.EVENT_NE_RR) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m3464d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m3466e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public static abstract class Behavior<V extends View> {
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C0883ab onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C0883ab abVar) {
            return abVar;
        }

        public void onAttachedToLayoutParams(LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((LayoutParams) view.getLayoutParams()).mBehaviorTag;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public static void setTag(View view, Object obj) {
            ((LayoutParams) view.getLayoutParams()).mBehaviorTag = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            if (getScrimOpacity(coordinatorLayout, v) > BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline = -1;
        View mAnchorDirectChild;
        int mAnchorId = -1;
        View mAnchorView;
        Behavior mBehavior;
        boolean mBehaviorResolved;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final Rect mLastChildRect = new Rect();

        /* access modifiers changed from: package-private */
        public void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        /* access modifiers changed from: package-private */
        public void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        public int getAnchorId() {
            return this.mAnchorId;
        }

        public Behavior getBehavior() {
            return this.mBehavior;
        }

        /* access modifiers changed from: package-private */
        public boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        /* access modifiers changed from: package-private */
        public Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        /* access modifiers changed from: package-private */
        public void invalidateAnchor() {
            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
        }

        /* access modifiers changed from: package-private */
        public boolean checkAnchorChanged() {
            if (this.mAnchorView != null || this.mAnchorId == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean didBlockInteraction() {
            if (this.mBehavior == null) {
                this.mDidBlockInteraction = false;
            }
            return this.mDidBlockInteraction;
        }

        /* access modifiers changed from: package-private */
        public void setChangedAfterNestedScroll(boolean z) {
            this.mDidChangeAfterNestedScroll = z;
        }

        /* access modifiers changed from: package-private */
        public void resetNestedScroll(int i) {
            setNestedScrollAccepted(i, false);
        }

        public void setAnchorId(int i) {
            invalidateAnchor();
            this.mAnchorId = i;
        }

        /* access modifiers changed from: package-private */
        public void setLastChildRect(Rect rect) {
            this.mLastChildRect.set(rect);
        }

        /* access modifiers changed from: package-private */
        public boolean isNestedScrollAccepted(int i) {
            if (i == 0) {
                return this.mDidAcceptNestedScrollTouch;
            }
            if (i != 1) {
                return false;
            }
            return this.mDidAcceptNestedScrollNonTouch;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void setBehavior(Behavior behavior) {
            Behavior behavior2 = this.mBehavior;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.mBehavior = behavior;
                this.mBehaviorTag = null;
                this.mBehaviorResolved = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: package-private */
        public void setNestedScrollAccepted(int i, boolean z) {
            if (i == 0) {
                this.mDidAcceptNestedScrollTouch = z;
            } else if (i == 1) {
                this.mDidAcceptNestedScrollNonTouch = z;
            }
        }

        private boolean shouldDodge(View view, int i) {
            int a = C0904f.m4351a(((LayoutParams) view.getLayoutParams()).insetEdge, i);
            if (a == 0 || (C0904f.m4351a(this.dodgeInsetEdges, i) & a) != a) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public View findAnchorView(CoordinatorLayout coordinatorLayout, View view) {
            if (this.mAnchorId == -1) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return null;
            }
            if (this.mAnchorView == null || !verifyAnchorView(view, coordinatorLayout)) {
                resolveAnchorView(view, coordinatorLayout);
            }
            return this.mAnchorView;
        }

        /* access modifiers changed from: package-private */
        public boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.mDidBlockInteraction;
            if (z2) {
                return true;
            }
            Behavior behavior = this.mBehavior;
            if (behavior != null) {
                z = behavior.blocksInteractionBelow(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.mDidBlockInteraction = z3;
            return z3;
        }

        private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            if (this.mAnchorView.getId() != this.mAnchorId) {
                return false;
            }
            View view2 = this.mAnchorView;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.mAnchorDirectChild = view2;
            return true;
        }

        LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline});
            this.gravity = obtainStyledAttributes.getInteger(0, 0);
            this.mAnchorId = obtainStyledAttributes.getResourceId(1, -1);
            this.anchorGravity = obtainStyledAttributes.getInteger(2, 0);
            this.keyline = obtainStyledAttributes.getInteger(6, -1);
            this.insetEdge = obtainStyledAttributes.getInt(5, 0);
            this.dodgeInsetEdges = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.mBehaviorResolved = hasValue;
            if (hasValue) {
                this.mBehavior = CoordinatorLayout.m3450a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.mBehavior;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        private void resolveAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.mAnchorId);
            this.mAnchorView = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.mAnchorDirectChild = null;
                            this.mAnchorView = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.mAnchorDirectChild = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.mAnchorId) + " to anchor view " + view);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean dependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            if (view2 == this.mAnchorDirectChild || shouldDodge(view2, ViewCompat.m4082h(coordinatorLayout)) || ((behavior = this.mBehavior) != null && behavior.layoutDependsOn(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    static class C0704d implements Comparator<View> {
        C0704d() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float G = ViewCompat.m4013G(view);
            float G2 = ViewCompat.m4013G(view2);
            if (G > G2) {
                return -1;
            }
            if (G < G2) {
                return 1;
            }
            return 0;
        }
    }

    public final C0883ab getLastWindowInsets() {
        return this.f2994u;
    }

    public Drawable getStatusBarBackground() {
        return this.f2996w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0883ab mo3937a(C0883ab abVar) {
        if (C0843d.m3987a(this.f2994u, abVar)) {
            return abVar;
        }
        this.f2994u = abVar;
        boolean z = true;
        boolean z2 = abVar != null && abVar.mo4644b() > 0;
        this.f2995v = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0883ab b = m3460b(abVar);
        requestLayout();
        return b;
    }

    /* renamed from: a */
    private void m3457a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((LayoutParams) getChildAt(i2).getLayoutParams()).resetTouchBehaviorTracking();
        }
        this.f2990q = null;
        this.f2987n = false;
    }

    /* renamed from: a */
    private boolean m3458a(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2982i;
        m3456a(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && behavior != null) {
                    if (i == 0) {
                        z = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        z = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (z) {
                        this.f2990q = view;
                    }
                }
                boolean didBlockInteraction = layoutParams.didBlockInteraction();
                boolean isBlockingInteractionBelow = layoutParams.isBlockingInteractionBelow(this, view);
                z2 = isBlockingInteractionBelow && !didBlockInteraction;
                if (isBlockingInteractionBelow && !z2) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                }
                if (i == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i == 1) {
                    behavior.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public LayoutParams mo3935a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            if (view instanceof AbstractC0701a) {
                Behavior behavior = ((AbstractC0701a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.setBehavior(behavior);
                layoutParams.mBehaviorResolved = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        layoutParams.setBehavior((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                layoutParams.mBehaviorResolved = true;
            }
        }
        return layoutParams;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3942a(View view, Rect rect) {
        C0706b.m3509b(this, view, rect);
    }

    /* renamed from: a */
    public void mo3939a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.checkAnchorChanged()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (layoutParams.mAnchorView != null) {
            m3454a(view, layoutParams.mAnchorView, i);
        } else if (layoutParams.keyline >= 0) {
            m3461b(view, layoutParams.keyline, i);
        } else {
            m3463c(view, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3943a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo3942a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3941a(View view, int i, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m3452a(view, i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        m3455a(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3938a(int i) {
        boolean z;
        int h = ViewCompat.m4082h(this);
        int size = this.f2980g.size();
        Rect e = m3467e();
        Rect e2 = m3467e();
        Rect e3 = m3467e();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2980g.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (layoutParams.mAnchorDirectChild == this.f2980g.get(i3)) {
                        mo3948b(view, h);
                    }
                }
                mo3943a(view, true, e2);
                if (layoutParams.insetEdge != 0 && !e2.isEmpty()) {
                    int a = C0904f.m4351a(layoutParams.insetEdge, h);
                    int i4 = a & SmEvents.EVENT_NE_RR;
                    if (i4 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i4 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i5 = a & 7;
                    if (i5 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i5 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    m3453a(view, e, h);
                }
                if (i != 2) {
                    mo3951c(view, e3);
                    if (!e3.equals(e2)) {
                        mo3949b(view, e2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f2980g.get(i6);
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    Behavior behavior = layoutParams2.getBehavior();
                    if (behavior != null && behavior.layoutDependsOn(this, view2, view)) {
                        if (i != 0 || !layoutParams2.getChangedAfterNestedScroll()) {
                            if (i != 2) {
                                z = behavior.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                layoutParams2.setChangedAfterNestedScroll(z);
                            }
                        } else {
                            layoutParams2.resetChangedAfterNestedScroll();
                        }
                    }
                }
            }
        }
        m3451a(e);
        m3451a(e2);
        m3451a(e3);
    }

    /* renamed from: a */
    public boolean mo3944a(View view, int i, int i2) {
        Rect e = m3467e();
        mo3942a(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m3451a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.core.view.AbstractC0910l
    /* renamed from: a */
    public void mo1702a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i5) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.f2985l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2985l;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f2985l[1]);
                    } else {
                        i7 = Math.min(i9, this.f2985l[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo3938a(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public class ViewTreeObserver$OnPreDrawListenerC0703c implements ViewTreeObserver.OnPreDrawListener {
        public boolean onPreDraw() {
            CoordinatorLayout.this.mo3938a(0);
            return true;
        }

        ViewTreeObserver$OnPreDrawListenerC0703c() {
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f2998y.mo4707a();
    }

    /* renamed from: e */
    private static Rect m3467e() {
        Rect acquire = f2978f.acquire();
        if (acquire == null) {
            return new Rect();
        }
        return acquire;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m3470f();
        return Collections.unmodifiableList(this.f2980g);
    }

    /* access modifiers changed from: package-private */
    public void aa_() {
        if (this.f2988o && this.f2992s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2992s);
        }
        this.f2993t = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3946b() {
        if (this.f2988o) {
            if (this.f2992s == null) {
                this.f2992s = new ViewTreeObserver$OnPreDrawListenerC0703c();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2992s);
        }
        this.f2993t = true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2996w;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: g */
    private void m3471g() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (ViewCompat.m4109x(this)) {
                if (this.f2997x == null) {
                    this.f2997x = new AbstractC0912n() {
                        /* class androidx.coordinatorlayout.widget.CoordinatorLayout.C06991 */

                        @Override // androidx.core.view.AbstractC0912n
                        public C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                            return CoordinatorLayout.this.mo3937a(abVar);
                        }
                    };
                }
                ViewCompat.m4044a(this, this.f2997x);
                setSystemUiVisibility(1280);
                return;
            }
            ViewCompat.m4044a(this, (AbstractC0912n) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z_() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m3469e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2993t) {
            return;
        }
        if (z) {
            mo3946b();
        } else {
            aa_();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3457a(false);
        if (this.f2993t) {
            if (this.f2992s == null) {
                this.f2992s = new ViewTreeObserver$OnPreDrawListenerC0703c();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2992s);
        }
        if (this.f2994u == null && ViewCompat.m4109x(this)) {
            ViewCompat.m4108w(this);
        }
        this.f2988o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3457a(false);
        if (this.f2993t && this.f2992s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2992s);
        }
        View view = this.f2991r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2988o = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (!(id == -1 || behavior == null || (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) == null)) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.f3000a = sparseArray;
        return savedState;
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        f2974a = str;
        if (Build.VERSION.SDK_INT >= 21) {
            f2977d = new C0704d();
        } else {
            f2977d = null;
        }
    }

    /* renamed from: f */
    private void m3470f() {
        this.f2980g.clear();
        this.f2981h.mo4045a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams a = mo3935a(childAt);
            a.findAnchorView(this, childAt);
            this.f2981h.mo4046a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (a.dependsOn(this, childAt, childAt2)) {
                        if (!this.f2981h.mo4049b(childAt2)) {
                            this.f2981h.mo4046a(childAt2);
                        }
                        this.f2981h.mo4047a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2980g.addAll(this.f2981h.mo4048b());
        Collections.reverse(this.f2980g);
    }

    /* access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.C07001 */

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
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        SparseArray<Parcelable> f3000a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3000a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3000a.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3000a;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f3000a.keyAt(i3);
                parcelableArr[i3] = this.f3000a.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2979e = onHierarchyChangeListener;
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    private class ViewGroup$OnHierarchyChangeListenerC0702b implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC0702b() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f2979e != null) {
                CoordinatorLayout.this.f2979e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo3938a(2);
            if (CoordinatorLayout.this.f2979e != null) {
                CoordinatorLayout.this.f2979e.onChildViewRemoved(view, view2);
            }
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m3471g();
    }

    /* renamed from: a */
    private static void m3451a(Rect rect) {
        rect.setEmpty();
        f2978f.release(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ContextCompat.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f2996w) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    public List<View> mo3950c(View view) {
        List<View> d = this.f2981h.mo4051d(view);
        this.f2983j.clear();
        if (d != null) {
            this.f2983j.addAll(d);
        }
        return this.f2983j;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3457a(true);
        }
        boolean a = m3458a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m3457a(true);
        }
        return a;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2987n) {
            m3457a(false);
            this.f2987n = true;
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f2996w;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2996w.setVisible(z, false);
        }
    }

    /* renamed from: b */
    private C0883ab m3460b(C0883ab abVar) {
        Behavior behavior;
        if (abVar.mo4650f()) {
            return abVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.m4109x(childAt) && (behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                abVar = behavior.onApplyWindowInsets(this, childAt, abVar);
                if (abVar.mo4650f()) {
                    break;
                }
            }
        }
        return abVar;
    }

    /* renamed from: e */
    private boolean m3469e(View view) {
        return this.f2981h.mo4052e(view);
    }

    /* renamed from: d */
    public List<View> mo3954d(View view) {
        List c = this.f2981h.mo4050c(view);
        this.f2983j.clear();
        if (c != null) {
            this.f2983j.addAll(c);
        }
        return this.f2983j;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f2995v && this.f2996w != null) {
            C0883ab abVar = this.f2994u;
            if (abVar != null) {
                i = abVar.mo4644b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f2996w.setBounds(0, 0, getWidth(), i);
                this.f2996w.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        SparseArray<Parcelable> sparseArray = savedState.f3000a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = mo3935a(childAt).getBehavior();
            if (!(id == -1 || behavior == null || (parcelable2 = sparseArray.get(id)) == null)) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* renamed from: b */
    private int m3459b(int i) {
        int[] iArr = this.f2989p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2990q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m3458a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2990q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2990q
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2990q
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m3457a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f2996w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2996w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2996w.setState(getDrawableState());
                }
                C0774a.m3774b(this.f2996w, ViewCompat.m4082h(this));
                Drawable drawable4 = this.f2996w;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f2996w.setCallback(this);
            }
            ViewCompat.m4073e(this);
        }
    }

    /* renamed from: b */
    public void mo3947b(View view) {
        List c = this.f2981h.mo4050c(view);
        if (!(c == null || c.isEmpty())) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                Behavior behavior = ((LayoutParams) view2.getLayoutParams()).getBehavior();
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m3456a(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = f2977d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3949b(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).setLastChildRect(rect);
    }

    /* renamed from: d */
    private void m3465d(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mInsetOffsetX != i) {
            ViewCompat.m4089j(view, i - layoutParams.mInsetOffsetX);
            layoutParams.mInsetOffsetX = i;
        }
    }

    /* renamed from: e */
    private void m3468e(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mInsetOffsetY != i) {
            ViewCompat.m4087i(view, i - layoutParams.mInsetOffsetY);
            layoutParams.mInsetOffsetY = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3951c(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).getLastChildRect());
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.f2998y.mo4709a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i)) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                layoutParams.resetNestedScroll(i);
                layoutParams.resetChangedAfterNestedScroll();
            }
        }
        this.f2991r = null;
    }

    /* renamed from: c */
    private void m3463c(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect e = m3467e();
        e.set(getPaddingLeft() + layoutParams.leftMargin, getPaddingTop() + layoutParams.topMargin, (getWidth() - getPaddingRight()) - layoutParams.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams.bottomMargin);
        if (this.f2994u != null && ViewCompat.m4109x(this) && !ViewCompat.m4109x(view)) {
            e.left += this.f2994u.mo4642a();
            e.top += this.f2994u.mo4644b();
            e.right -= this.f2994u.mo4646c();
            e.bottom -= this.f2994u.mo4647d();
        }
        Rect e2 = m3467e();
        C0904f.m4352a(m3462c(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m3451a(e);
        m3451a(e2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3948b(View view, int i) {
        Behavior behavior;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mAnchorView != null) {
            Rect e = m3467e();
            Rect e2 = m3467e();
            Rect e3 = m3467e();
            mo3942a(layoutParams.mAnchorView, e);
            boolean z = false;
            mo3943a(view, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m3452a(view, i, e, e3, layoutParams, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m3455a(layoutParams, e3, measuredWidth, measuredHeight);
            int i2 = e3.left - e2.left;
            int i3 = e3.top - e2.top;
            if (i2 != 0) {
                ViewCompat.m4089j(view, i2);
            }
            if (i3 != 0) {
                ViewCompat.m4087i(view, i3);
            }
            if (z && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onDependentViewChanged(this, view, layoutParams.mAnchorView);
            }
            m3451a(e);
            m3451a(e2);
            m3451a(e3);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: a */
    private void m3454a(View view, View view2, int i) {
        Rect e = m3467e();
        Rect e2 = m3467e();
        try {
            mo3942a(view2, e);
            mo3941a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m3451a(e);
            m3451a(e2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0) && (behavior = layoutParams.getBehavior()) != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f2980g = new ArrayList();
        this.f2981h = new C0705a<>();
        this.f2982i = new ArrayList();
        this.f2983j = new ArrayList();
        this.f2985l = new int[2];
        this.f2986m = new int[2];
        this.f2998y = new C0911m(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.keylines, R.attr.statusBarBackground}, 0, 2131887416);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.keylines, R.attr.statusBarBackground}, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, new int[]{R.attr.keylines, R.attr.statusBarBackground}, attributeSet, typedArray, 0, 2131887416);
            } else {
                saveAttributeDataForStyleable(context, new int[]{R.attr.keylines, R.attr.statusBarBackground}, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2989p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2989p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2989p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f2996w = typedArray.getDrawable(1);
        typedArray.recycle();
        m3471g();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0702b());
        if (ViewCompat.m4076f(this) == 0) {
            ViewCompat.m4069d((View) this, 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static Behavior m3450a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2974a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = f2976c;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2975b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: b */
    private void m3461b(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int a = C0904f.m4351a(m3464d(layoutParams.gravity), i2);
        int i3 = a & 7;
        int i4 = a & SmEvents.EVENT_NE_RR;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m3459b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + layoutParams.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - layoutParams.rightMargin));
        int max2 = Math.max(getPaddingTop() + layoutParams.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mBehavior != null) {
            float scrimOpacity = layoutParams.mBehavior.getScrimOpacity(this, view);
            if (scrimOpacity > BitmapDescriptorFactory.HUE_RED) {
                if (this.f2984k == null) {
                    this.f2984k = new Paint();
                }
                this.f2984k.setColor(layoutParams.mBehavior.getScrimColor(this, view));
                this.f2984k.setAlpha(m3449a(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2984k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: a */
    private void m3453a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        if (ViewCompat.m4012F(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            Rect e = m3467e();
            Rect e2 = m3467e();
            e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior == null || !behavior.getInsetDodgeRect(this, view, e)) {
                e.set(e2);
            } else if (!e2.contains(e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e.toShortString() + " | Bounds:" + e2.toShortString());
            }
            m3451a(e2);
            if (e.isEmpty()) {
                m3451a(e);
                return;
            }
            int a = C0904f.m4351a(layoutParams.dodgeInsetEdges, i);
            boolean z3 = true;
            if ((a & 48) != 48 || (i3 = (e.top - layoutParams.topMargin) - layoutParams.mInsetOffsetY) >= rect.top) {
                z = false;
            } else {
                m3468e(view, rect.top - i3);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - e.bottom) - layoutParams.bottomMargin) + layoutParams.mInsetOffsetY) < rect.bottom) {
                m3468e(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                m3468e(view, 0);
            }
            if ((a & 3) != 3 || (i2 = (e.left - layoutParams.leftMargin) - layoutParams.mInsetOffsetX) >= rect.left) {
                z2 = false;
            } else {
                m3465d(view, rect.left - i2);
                z2 = true;
            }
            if ((a & 5) != 5 || (width = ((getWidth() - e.right) - layoutParams.rightMargin) + layoutParams.mInsetOffsetX) >= rect.right) {
                z3 = z2;
            } else {
                m3465d(view, width - rect.right);
            }
            if (!z3) {
                m3465d(view, 0);
            }
            m3451a(e);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0) && (behavior = layoutParams.getBehavior()) != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo3938a(1);
        }
        return z2;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behavior;
        this.f2998y.mo4711a(view, view2, i, i2);
        this.f2991r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i2) && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    layoutParams.setNestedScrollAccepted(i2, onStartNestedScroll);
                } else {
                    layoutParams.setNestedScrollAccepted(i2, false);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m3455a(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + layoutParams.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - layoutParams.rightMargin));
        int max2 = Math.max(getPaddingTop() + layoutParams.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - layoutParams.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    public void mo3940a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int h = ViewCompat.m4082h(this);
        int size = this.f2980g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2980g.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, h))) {
                mo3939a(view, h);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i3) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.f2985l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2985l;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f2985l;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo3938a(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        mo1702a(view, i, i2, i3, i4, 0, this.f2986m);
    }

    /* renamed from: a */
    private void m3452a(View view, int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int i4;
        int i5;
        int a = C0904f.m4351a(m3466e(layoutParams.gravity), i);
        int a2 = C0904f.m4351a(m3462c(layoutParams.anchorGravity), i);
        int i6 = a & 7;
        int i7 = a & SmEvents.EVENT_NE_RR;
        int i8 = a2 & 7;
        int i9 = a2 & SmEvents.EVENT_NE_RR;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }
}
