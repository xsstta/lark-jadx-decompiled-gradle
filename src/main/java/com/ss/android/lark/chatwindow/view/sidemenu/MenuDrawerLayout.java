package com.ss.android.lark.chatwindow.view.sidemenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.customview.p030a.C0959c;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.sidemenu.C35299a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

public class MenuDrawerLayout extends LinearLayout {

    /* renamed from: a */
    float f91190a;

    /* renamed from: b */
    float f91191b;

    /* renamed from: c */
    int f91192c;

    /* renamed from: d */
    int f91193d;

    /* renamed from: e */
    public C0959c f91194e;

    /* renamed from: f */
    public final C35299a<AbstractC35298a> f91195f;

    /* renamed from: g */
    public boolean f91196g;

    /* renamed from: h */
    C0959c.AbstractC0962a f91197h;

    /* renamed from: i */
    private boolean f91198i;

    /* renamed from: j */
    private boolean f91199j;

    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.MenuDrawerLayout$a */
    public interface AbstractC35298a {
        /* renamed from: a */
        void mo129882a();

        /* renamed from: a */
        void mo129883a(float f);

        /* renamed from: b */
        void mo129884b();
    }

    public View getContentView() {
        return getChildAt(0);
    }

    public View getMenuView() {
        return getChildAt(1);
    }

    /* renamed from: a */
    private void m137819a() {
        this.f91194e = C0959c.m4642a(this, this.f91197h);
    }

    private int getUnresponseRange() {
        return (DeviceUtils.getScreenWidth(getContext()) / 3) * 2;
    }

    public int getMenuWidth() {
        return getMenuView().getWidth();
    }

    public void computeScroll() {
        super.computeScroll();
        C0959c cVar = this.f91194e;
        if (cVar == null || !cVar.mo4869a(true)) {
            View contentView = getContentView();
            this.f91192c = contentView.getLeft();
            this.f91193d = contentView.getTop();
            return;
        }
        postInvalidateOnAnimation();
    }

    public void setMenuEnabled(boolean z) {
        this.f91198i = z;
    }

    public MenuDrawerLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f91199j) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.f91194e.mo4872b(motionEvent);
            return true;
        } catch (Exception e) {
            Log.m165398w("MenuDrawerLayout", "exception in onTouchEvent", e);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m137820a(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (DesktopUtil.m144301a(getContext()) || !this.f91198i) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getX() >= ((float) getUnresponseRange()) || this.f91196g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = m137821a(getContentView(), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            } else {
                z2 = false;
            }
            if (z && !z2) {
                z3 = true;
            }
            this.f91199j = z3;
        }
        return this.f91199j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[Catch:{ Exception -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[Catch:{ Exception -> 0x006c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatwindow.view.sidemenu.MenuDrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public MenuDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f91195f = new C35299a<>();
        this.f91198i = true;
        this.f91197h = new C0959c.AbstractC0962a() {
            /* class com.ss.android.lark.chatwindow.view.sidemenu.MenuDrawerLayout.C352971 */

            /* renamed from: b */
            private int f91201b;

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public boolean mo4900b(View view, int i) {
                if (view == MenuDrawerLayout.this.getContentView()) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public int mo4890a(View view, int i, int i2) {
                int min = Math.min(0, Math.max(-MenuDrawerLayout.this.getMenuWidth(), i));
                this.f91201b = min;
                return min;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public void mo4893a(View view, float f, float f2) {
                int paddingLeft = MenuDrawerLayout.this.getPaddingLeft();
                int i = -MenuDrawerLayout.this.getMenuWidth();
                if (Math.abs(this.f91201b) < MenuDrawerLayout.this.getMenuWidth() / 2) {
                    MenuDrawerLayout.this.f91194e.mo4866a(paddingLeft, 0);
                } else {
                    MenuDrawerLayout.this.f91194e.mo4866a(i, 0);
                }
                MenuDrawerLayout.this.invalidate();
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public void mo4895a(View view, int i, int i2, int i3, int i4) {
                float f = (float) i;
                MenuDrawerLayout.this.getMenuView().setTranslationX(f);
                int paddingLeft = MenuDrawerLayout.this.getPaddingLeft();
                int i5 = -MenuDrawerLayout.this.getMenuWidth();
                C35299a<AbstractC35298a> aVar = MenuDrawerLayout.this.f91195f;
                C35299a.C35300a<AbstractC35298a> a = aVar.mo129885a();
                try {
                    int a2 = a.mo129889a();
                    for (int i6 = 0; i6 < a2; i6++) {
                        AbstractC35298a a3 = a.mo129890a(i6);
                        if (a3 != null) {
                            a3.mo129883a(f / ((float) MenuDrawerLayout.this.getMenuWidth()));
                            if (i == paddingLeft) {
                                a3.mo129882a();
                            } else if (i == i5) {
                                a3.mo129884b();
                            }
                        }
                    }
                    if (i == paddingLeft) {
                        MenuDrawerLayout.this.f91196g = false;
                    } else if (i == i5) {
                        MenuDrawerLayout.this.f91196g = true;
                    }
                    MenuDrawerLayout.this.f91192c = view.getLeft();
                    MenuDrawerLayout.this.f91193d = view.getTop();
                } finally {
                    aVar.mo129887b();
                }
            }
        };
        m137819a();
    }

    /* renamed from: a */
    private boolean m137821a(View view, int i, int i2) {
        if (!m137822b(view, i, i2)) {
            return false;
        }
        if (view.getTag(R.id.cannot_swipe_view) != null || view.canScrollHorizontally(1) || view.canScrollHorizontally(-1)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (m137821a(viewGroup.getChildAt(childCount), i, i2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m137822b(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f = (float) iArr[0];
        float f2 = (float) iArr[1];
        float f3 = (float) i;
        if (f3 <= f || f3 >= f + ((float) view.getWidth())) {
            return false;
        }
        float f4 = (float) i2;
        if (f4 <= f2 || f4 >= f2 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View contentView = getContentView();
        contentView.offsetLeftAndRight(this.f91192c);
        contentView.offsetTopAndBottom(this.f91193d);
    }
}
