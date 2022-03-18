package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f1173a;

    /* renamed from: b */
    Drawable f1174b;

    /* renamed from: c */
    Drawable f1175c;

    /* renamed from: d */
    boolean f1176d;

    /* renamed from: e */
    boolean f1177e;

    /* renamed from: f */
    private boolean f1178f;

    /* renamed from: g */
    private View f1179g;

    /* renamed from: h */
    private View f1180h;

    /* renamed from: i */
    private View f1181i;

    /* renamed from: j */
    private int f1182j;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public View getTabContainer() {
        return this.f1179g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1173a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1174b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1175c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1180h = findViewById(R.id.action_bar);
        this.f1181i = findViewById(R.id.action_context_bar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1173a;
        if (drawable != null && drawable.isStateful()) {
            this.f1173a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1174b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1174b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1175c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1175c.setState(getDrawableState());
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1178f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1178f = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    /* renamed from: a */
    private boolean m1503a(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int m1504b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setTabContainer(C0481y yVar) {
        View view = this.f1179g;
        if (view != null) {
            removeView(view);
        }
        this.f1179g = yVar;
        if (yVar != null) {
            addView(yVar);
            ViewGroup.LayoutParams layoutParams = yVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            yVar.setAllowCollapse(false);
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
        Drawable drawable = this.f1173a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1174b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1175c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f1173a || this.f1176d) && ((drawable != this.f1174b || !this.f1177e) && ((drawable != this.f1175c || !this.f1176d) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1173a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1173a);
        }
        this.f1173a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1180h;
            if (view != null) {
                this.f1173a.setBounds(view.getLeft(), this.f1180h.getTop(), this.f1180h.getRight(), this.f1180h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1176d ? !(this.f1173a == null && this.f1174b == null) : this.f1175c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1175c;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1175c);
        }
        this.f1175c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1176d && (drawable2 = this.f1175c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1176d ? this.f1173a == null && this.f1174b == null : this.f1175c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1174b;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1174b);
        }
        this.f1174b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1177e && (drawable2 = this.f1174b) != null) {
                drawable2.setBounds(this.f1179g.getLeft(), this.f1179g.getTop(), this.f1179g.getRight(), this.f1179g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1176d ? !(this.f1173a == null && this.f1174b == null) : this.f1175c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1180h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f1182j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1180h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1179g;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1503a(this.f1180h)) {
                    i3 = m1504b(this.f1180h);
                } else if (!m1503a(this.f1181i)) {
                    i3 = m1504b(this.f1181i);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1504b(this.f1179g), i4));
            }
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.m4039a(this, new C0435b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle});
        boolean z = false;
        this.f1173a = obtainStyledAttributes.getDrawable(0);
        this.f1174b = obtainStyledAttributes.getDrawable(2);
        this.f1182j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1176d = true;
            this.f1175c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1176d ? this.f1173a == null && this.f1174b == null : this.f1175c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1179g;
        boolean z3 = true;
        boolean z4 = false;
        if (view == null || view.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1176d) {
            Drawable drawable2 = this.f1175c;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1173a != null) {
                if (this.f1180h.getVisibility() == 0) {
                    this.f1173a.setBounds(this.f1180h.getLeft(), this.f1180h.getTop(), this.f1180h.getRight(), this.f1180h.getBottom());
                } else {
                    View view2 = this.f1181i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1173a.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1173a.setBounds(this.f1181i.getLeft(), this.f1181i.getTop(), this.f1181i.getRight(), this.f1181i.getBottom());
                    }
                }
                z4 = true;
            }
            this.f1177e = z2;
            if (!z2 || (drawable = this.f1174b) == null) {
                z3 = z4;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z3) {
            invalidate();
        }
    }
}
