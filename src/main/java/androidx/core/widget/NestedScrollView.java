package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC0910l;
import androidx.core.view.C0859a;
import androidx.core.view.C0909k;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.core.view.p029a.C0872f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements NestedScrollingChild3, ScrollingView, AbstractC0910l {

    /* renamed from: w */
    private static final C0933a f3493w = new C0933a();

    /* renamed from: x */
    private static final int[] f3494x = {16843130};

    /* renamed from: A */
    private float f3495A;

    /* renamed from: B */
    private AbstractC0934b f3496B;

    /* renamed from: a */
    private long f3497a;

    /* renamed from: b */
    private final Rect f3498b;

    /* renamed from: c */
    private OverScroller f3499c;

    /* renamed from: d */
    private EdgeEffect f3500d;

    /* renamed from: e */
    private EdgeEffect f3501e;

    /* renamed from: f */
    private int f3502f;

    /* renamed from: g */
    private boolean f3503g;

    /* renamed from: h */
    private boolean f3504h;

    /* renamed from: i */
    private View f3505i;

    /* renamed from: j */
    private boolean f3506j;

    /* renamed from: k */
    private VelocityTracker f3507k;

    /* renamed from: l */
    private boolean f3508l;

    /* renamed from: m */
    private boolean f3509m;

    /* renamed from: n */
    private int f3510n;

    /* renamed from: o */
    private int f3511o;

    /* renamed from: p */
    private int f3512p;

    /* renamed from: q */
    private int f3513q;

    /* renamed from: r */
    private final int[] f3514r;

    /* renamed from: s */
    private final int[] f3515s;

    /* renamed from: t */
    private int f3516t;

    /* renamed from: u */
    private int f3517u;

    /* renamed from: v */
    private SavedState f3518v;

    /* renamed from: y */
    private final C0911m f3519y;

    /* renamed from: z */
    private final C0909k f3520z;

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface AbstractC0934b {
        /* renamed from: a */
        void mo742a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m4455b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0933a extends C0859a {
        C0933a() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            int scrollRange;
            super.mo4535a(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.mo4566b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.mo4600k(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.mo4555a(C0864d.C0865a.f3382n);
                    dVar.mo4555a(C0864d.C0865a.f3393y);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.mo4555a(C0864d.C0865a.f3381m);
                    dVar.mo4555a(C0864d.C0865a.f3358A);
                }
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo4540d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0872f.m4265a(accessibilityEvent, nestedScrollView.getScrollX());
            C0872f.m4267b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4536a(View view, int i, Bundle bundle) {
            if (super.mo4536a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo4744a(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo4744a(0, min, true);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo4747a(KeyEvent keyEvent) {
        this.f3498b.setEmpty();
        int i = 130;
        if (!mo114057b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo4745a(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo4754c(130);
                } else {
                    return mo4753b(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo4754c(33);
            } else {
                return mo4753b(33);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4746a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo4746a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo4745a(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3498b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f3498b.top + height > bottom) {
                    this.f3498b.top = bottom - height;
                }
            }
        } else {
            this.f3498b.top = getScrollY() - height;
            if (this.f3498b.top < 0) {
                this.f3498b.top = 0;
            }
        }
        Rect rect = this.f3498b;
        rect.bottom = rect.top + height;
        return m4450a(i, this.f3498b.top, this.f3498b.bottom);
    }

    /* renamed from: a */
    private boolean m4453a(View view, int i, int i2) {
        view.getDrawingRect(this.f3498b);
        offsetDescendantRectToMyCoords(view, this.f3498b);
        return this.f3498b.bottom + i >= getScrollY() && this.f3498b.top - i <= getScrollY() + i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4744a(int i, int i2, boolean z) {
        mo4743a(i, i2, 250, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4743a(int i, int i2, int i3, boolean z) {
        m4456b(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4741a(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* renamed from: a */
    private static boolean m4454a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m4454a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f3519y.mo4707a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f3520z.mo4694a();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3504h = false;
    }

    public void requestLayout() {
        this.f3503g = true;
        super.requestLayout();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    /* renamed from: c */
    private void mo114058c() {
        VelocityTracker velocityTracker = this.f3507k;
        if (velocityTracker == null) {
            this.f3507k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private void mo114059d() {
        if (this.f3507k == null) {
            this.f3507k = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void mo114061e() {
        VelocityTracker velocityTracker = this.f3507k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3507k = null;
        }
    }

    /* renamed from: f */
    private void mo114062f() {
        this.f3499c.abortAnimation();
        stopNestedScroll(1);
    }

    @Override // androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3521a = getScrollY();
        return savedState;
    }

    /* renamed from: g */
    private void mo114063g() {
        this.f3506j = false;
        mo114061e();
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.f3500d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f3501e.onRelease();
        }
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.core.widget.NestedScrollView.SavedState.C09321 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f3521a;

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3521a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3521a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3521a);
        }
    }

    /* renamed from: a */
    private void mo114050a() {
        this.f3499c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3510n = viewConfiguration.getScaledTouchSlop();
        this.f3511o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3512p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    private boolean mo114057b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3495A == BitmapDescriptorFactory.HUE_RED) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3495A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3495A;
    }

    /* renamed from: h */
    private void m4466h() {
        if (getOverScrollMode() == 2) {
            this.f3500d = null;
            this.f3501e = null;
        } else if (this.f3500d == null) {
            Context context = getContext();
            this.f3500d = new EdgeEffect(context);
            this.f3501e = new EdgeEffect(context);
        }
    }

    @Override // androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public void computeScroll() {
        if (!this.f3499c.isFinished()) {
            this.f3499c.computeScrollOffset();
            int currY = this.f3499c.getCurrY();
            int i = currY - this.f3517u;
            this.f3517u = currY;
            int[] iArr = this.f3515s;
            boolean z = false;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i, iArr, null, 1);
            int i2 = i - this.f3515s[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo4746a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f3515s;
                iArr2[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i3, this.f3514r, 1, iArr2);
                i2 = i3 - this.f3515s[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m4466h();
                    if (i2 < 0) {
                        if (this.f3500d.isFinished()) {
                            this.f3500d.onAbsorb((int) this.f3499c.getCurrVelocity());
                        }
                    } else if (this.f3501e.isFinished()) {
                        this.f3501e.onAbsorb((int) this.f3499c.getCurrVelocity());
                    }
                }
                mo114062f();
            }
            if (!this.f3499c.isFinished()) {
                ViewCompat.m4073e(this);
            } else {
                stopNestedScroll(1);
            }
        }
    }

    public void setOnScrollChangeListener(AbstractC0934b bVar) {
        this.f3496B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3509m = z;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f3520z.mo4693a(z);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    /* renamed from: a */
    private boolean m4452a(View view) {
        return !m4453a(view, 0, getHeight());
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.f3520z.mo4697a(i);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo114061e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3508l) {
            this.f3508l = z;
            requestLayout();
        }
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.f3520z.mo4706c(i);
    }

    /* renamed from: a */
    private void mo114056a(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f3517u = getScrollY();
        ViewCompat.m4073e(this);
    }

    /* renamed from: b */
    private void m4457b(View view) {
        view.getDrawingRect(this.f3498b);
        offsetDescendantRectToMyCoords(view, this.f3498b);
        int a = mo4741a(this.f3498b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: e */
    private void mo114060e(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3509m) {
            mo4742a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo4747a(keyEvent)) {
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
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3518v = savedState;
        requestLayout();
    }

    /* renamed from: d */
    public void mo4756d(int i) {
        if (getChildCount() > 0) {
            this.f3499c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo114056a(true);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3506j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != BitmapDescriptorFactory.HUE_RED) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo4753b(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        this.f3498b.top = 0;
        this.f3498b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3498b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f3498b;
            rect.top = rect.bottom - height;
        }
        return m4450a(i, this.f3498b.top, this.f3498b.bottom);
    }

    /* renamed from: c */
    public boolean mo4754c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m4453a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo114060e(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3498b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3498b);
            mo114060e(mo4741a(this.f3498b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m4452a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f3500d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f3500d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f3500d.setSize(width, height);
                if (this.f3500d.draw(canvas)) {
                    ViewCompat.m4073e(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f3501e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, BitmapDescriptorFactory.HUE_RED);
                this.f3501e.setSize(width2, height2);
                if (this.f3501e.draw(canvas)) {
                    ViewCompat.m4073e(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f3506j) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3513q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3502f) > this.f3510n && (2 & getNestedScrollAxes()) == 0) {
                                this.f3506j = true;
                                this.f3502f = y;
                                mo114059d();
                                this.f3507k.addMovement(motionEvent);
                                this.f3516t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m4448a(motionEvent);
                    }
                }
            }
            this.f3506j = false;
            this.f3513q = -1;
            mo114061e();
            if (this.f3499c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.m4073e(this);
            }
            stopNestedScroll(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m4460c((int) motionEvent.getX(), y2)) {
                this.f3506j = false;
                mo114061e();
            } else {
                this.f3502f = y2;
                this.f3513q = motionEvent.getPointerId(0);
                mo114058c();
                this.f3507k.addMovement(motionEvent);
                this.f3499c.computeScrollOffset();
                this.f3506j = !this.f3499c.isFinished();
                startNestedScroll(2, 0);
            }
        }
        return this.f3506j;
    }

    /* renamed from: a */
    private void m4448a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3513q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3502f = (int) motionEvent.getY(i);
            this.f3513q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3507k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        mo114059d();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3516t = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.f3516t);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3507k;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3512p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3513q);
                if (Math.abs(yVelocity) >= this.f3511o) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(BitmapDescriptorFactory.HUE_RED, f)) {
                        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f, true);
                        mo4756d(i);
                    }
                } else if (this.f3499c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m4073e(this);
                }
                this.f3513q = -1;
                mo114063g();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3513q);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3513q + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f3502f - y;
                    if (!this.f3506j && Math.abs(i2) > this.f3510n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3506j = true;
                        i2 = i2 > 0 ? i2 - this.f3510n : i2 + this.f3510n;
                    }
                    int i3 = i2;
                    if (this.f3506j) {
                        if (dispatchNestedPreScroll(0, i3, this.f3515s, this.f3514r, 0)) {
                            i3 -= this.f3515s[1];
                            this.f3516t += this.f3514r[1];
                        }
                        this.f3502f = y - this.f3514r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (mo4746a(0, i3, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.f3507k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i4 = i3 - scrollY2;
                        int[] iArr = this.f3515s;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i4, this.f3514r, 0, iArr);
                        int i5 = this.f3502f;
                        int[] iArr2 = this.f3514r;
                        this.f3502f = i5 - iArr2[1];
                        this.f3516t += iArr2[1];
                        if (z) {
                            int i6 = i3 - this.f3515s[1];
                            m4466h();
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                C0941d.m4549a(this.f3500d, ((float) i6) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f3501e.isFinished()) {
                                    this.f3501e.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                C0941d.m4549a(this.f3501e, ((float) i6) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f3500d.isFinished()) {
                                    this.f3500d.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f3500d;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f3501e.isFinished())) {
                                ViewCompat.m4073e(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3506j && getChildCount() > 0 && this.f3499c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m4073e(this);
                }
                this.f3513q = -1;
                mo114063g();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3502f = (int) motionEvent.getY(actionIndex);
                this.f3513q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m4448a(motionEvent);
                this.f3502f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3513q));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f3499c.isFinished();
            this.f3506j = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3499c.isFinished()) {
                mo114062f();
            }
            this.f3502f = (int) motionEvent.getY();
            this.f3513q = motionEvent.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f3507k;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    public final void mo4742a(int i, int i2) {
        m4456b(i, i2, 250, false);
    }

    /* renamed from: b */
    public final void mo4752b(int i, int i2) {
        mo4743a(i, i2, 250, false);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3520z.mo4695a(f, f2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.f3519y.mo4709a(view, i);
        stopNestedScroll(i);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3503g) {
            m4457b(view2);
        } else {
            this.f3505i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.f3520z.mo4698a(i, i2);
    }

    /* renamed from: c */
    private boolean m4460c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m4452a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3508l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b = m4455b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b2 = m4455b(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private boolean m4451a(Rect rect, boolean z) {
        boolean z2;
        int a = mo4741a(rect);
        if (a != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo4742a(0, a);
            }
        }
        return z2;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3520z.mo4696a(f, f2, z);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m4451a(rect, z);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3498b = new Rect();
        this.f3503g = true;
        this.f3504h = false;
        this.f3505i = null;
        this.f3506j = false;
        this.f3509m = true;
        this.f3513q = -1;
        this.f3514r = new int[2];
        this.f3515s = new int[2];
        mo114050a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3494x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3519y = new C0911m(this);
        this.f3520z = new C0909k(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m4043a(this, f3493w);
    }

    /* renamed from: a */
    private View m4445a(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else if (!z3) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private void m4447a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3520z.mo4692a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: a */
    private boolean m4450a(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View a = m4445a(z, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            mo114060e(i4);
            z2 = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f2, true);
        mo4756d((int) f2);
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f3519y.mo4711a(view, view2, i, i2);
        startNestedScroll(2, i2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC0934b bVar = this.f3496B;
        if (bVar != null) {
            bVar.mo742a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m4453a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3498b);
            offsetDescendantRectToMyCoords(findFocus, this.f3498b);
            mo114060e(mo4741a(this.f3498b));
        }
    }

    /* renamed from: b */
    private void m4456b(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3497a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3499c;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo114056a(z);
            } else {
                if (!this.f3499c.isFinished()) {
                    mo114062f();
                }
                scrollBy(i, i2);
            }
            this.f3497a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m4447a(i4, 0, (int[]) null);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3520z.mo4702a(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3520z.mo4699a(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3503g = false;
        View view = this.f3505i;
        if (view != null && m4454a(view, this)) {
            m4457b(this.f3505i);
        }
        this.f3505i = null;
        if (!this.f3504h) {
            if (this.f3518v != null) {
                scrollTo(getScrollX(), this.f3518v.f3521a);
                this.f3518v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m4455b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3504h = true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m4447a(i4, i5, (int[]) null);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f3520z.mo4700a(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.AbstractC0910l
    /* renamed from: a */
    public void mo1702a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m4447a(i4, i5, iArr);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3520z.mo4692a(i, i2, i3, i4, iArr, i5, iArr2);
    }
}
