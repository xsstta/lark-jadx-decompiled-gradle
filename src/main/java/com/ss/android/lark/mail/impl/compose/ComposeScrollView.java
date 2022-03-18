package com.ss.android.lark.mail.impl.compose;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.huawei.hms.location.LocationRequest;
import java.util.ArrayList;

public class ComposeScrollView extends ScrollView {

    /* renamed from: a */
    public AbstractC41922a f106393a;

    /* renamed from: b */
    private final int f106394b = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: c */
    private final Rect f106395c = new Rect();

    /* renamed from: d */
    private int f106396d = -1;

    /* renamed from: e */
    private int f106397e;

    /* renamed from: f */
    private int f106398f;

    /* renamed from: g */
    private Runnable f106399g = new Runnable() {
        /* class com.ss.android.lark.mail.impl.compose.ComposeScrollView.RunnableC419211 */

        public void run() {
            ComposeScrollView.this.f106393a.mo150665a();
        }
    };

    /* renamed from: com.ss.android.lark.mail.impl.compose.ComposeScrollView$a */
    public interface AbstractC41922a {
        /* renamed from: a */
        void mo150665a();
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        return 0;
    }

    public void setOnTouchChangedListener(AbstractC41922a aVar) {
        this.f106393a = aVar;
    }

    public ComposeScrollView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m166640a(int i) {
        if (i == 0) {
            return;
        }
        if (isSmoothScrollingEnabled()) {
            smoothScrollBy(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    public boolean fullScroll(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        this.f106395c.top = 0;
        this.f106395c.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f106395c.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect = this.f106395c;
            rect.top = rect.bottom - height;
        }
        return m166642a(i, this.f106395c.top, this.f106395c.bottom);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.f106393a != null && !m166641a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                removeCallbacks(this.f106399g);
                postDelayed(this.f106399g, 200);
            }
            this.f106397e = (int) motionEvent.getY();
            this.f106396d = motionEvent.getPointerId(0);
        } else if (actionMasked == 2 || actionMasked == 3) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f106396d);
            if (findPointerIndex != -1) {
                if (Math.abs(this.f106397e - ((int) motionEvent.getY(findPointerIndex))) > this.f106398f) {
                    removeCallbacks(this.f106399g);
                }
            }
        } else {
            this.f106396d = -1;
        }
        return onTouchEvent;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public ComposeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m166641a(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - 0 || i2 >= childAt.getBottom() - 0 || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    public ComposeScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f106398f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    private View m166639a(boolean z, int i, int i2) {
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
            if (!(view2.getParent() instanceof ScrollView) && !(view2.getParent().getParent() instanceof ScrollView)) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                if (viewGroup.getChildCount() == 1) {
                    top += viewGroup.getTop();
                    bottom += viewGroup.getTop();
                }
            }
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

    /* renamed from: a */
    private boolean m166642a(int i, int i2, int i3) {
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
        View a = m166639a(z, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m166640a(i4);
            z2 = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z2;
    }
}
