package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    private ArrayList<View> f3848a;

    /* renamed from: b */
    private ArrayList<View> f3849b;

    /* renamed from: c */
    private boolean f3850c;

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m4922a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3850c = z;
    }

    public FragmentContainerView(Context context) {
        super(context);
        this.f3850c = true;
    }

    public void removeView(View view) {
        m4922a(view);
        super.removeView(view);
    }

    public void removeViewInLayout(View view) {
        m4922a(view);
        super.removeViewInLayout(view);
    }

    public void removeViewAt(int i) {
        m4922a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3849b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3848a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3850c = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3849b == null) {
                this.f3849b = new ArrayList<>();
            }
            this.f3849b.add(view);
        }
        super.startViewTransition(view);
    }

    /* renamed from: a */
    private void m4922a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f3849b) != null && arrayList.contains(view))) {
            if (this.f3848a == null) {
                this.f3848a = new ArrayList<>();
            }
            this.f3848a.add(view);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f3850c && this.f3848a != null) {
            for (int i = 0; i < this.f3848a.size(); i++) {
                super.drawChild(canvas, this.f3848a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m4922a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4922a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4922a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3850c = true;
        if (!isInEditMode()) {
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f3850c || (arrayList = this.f3848a) == null || arrayList.size() <= 0 || !this.f3848a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.getViewFragment(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f3850c = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842755, 16842961});
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment findFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(this, instantiate, string).commitNowAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.getViewFragment(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }
}
