package com.ss.android.lark.main.app.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.drawerlayout.widget.DrawerLayout;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.widgets.TipContainer;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.p2235b.C44498d;
import com.ss.android.lark.maincore.AbstractC44547d;
import com.ss.android.lark.maincore.AbstractC44548e;

public class MainViewContainer extends DrawerLayout implements AbstractC44548e {

    /* renamed from: c */
    final AbstractC44136a f112701c;

    /* renamed from: d */
    public String f112702d;

    /* renamed from: e */
    public TipContainer f112703e;

    /* renamed from: f */
    public DrawerContainer f112704f;

    /* renamed from: g */
    public int f112705g;

    /* renamed from: h */
    private AbstractC44547d f112706h;

    /* renamed from: i */
    private boolean f112707i;

    /* renamed from: j */
    private boolean f112708j;

    /* renamed from: k */
    private int[] f112709k;

    /* renamed from: l */
    private final int[] f112710l;

    /* renamed from: m */
    private PopupWindow f112711m;

    /* renamed from: e */
    public void mo157767e() {
        m176260k();
        m176259j();
    }

    /* renamed from: g */
    public boolean mo157769g() {
        return mo4955j(this.f112704f);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44548e
    public Context getContainerContext() {
        return super.getContext();
    }

    /* renamed from: h */
    public void mo157770h() {
        setDrawerLockModeWithoutState(1);
    }

    /* renamed from: i */
    public void mo157771i() {
        setDrawerLockModeWithState(this.f112705g);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44548e
    public void aS_() {
        DrawerContainer drawerContainer = this.f112704f;
        if (drawerContainer != null) {
            drawerContainer.mo157749a();
            mo4953h(this.f112704f);
        }
    }

    /* renamed from: f */
    public void mo157768f() {
        PopupWindow popupWindow = this.f112711m;
        if (popupWindow != null) {
            m176258a(popupWindow);
            this.f112711m = null;
        }
    }

    /* renamed from: j */
    private void m176259j() {
        C44498d.m176513a("main_view_container", this);
        DrawerContainer drawerContainer = new DrawerContainer(getContext());
        this.f112704f = drawerContainer;
        addView(drawerContainer, drawerContainer.getContainerLayoutParams());
        this.f112704f.bringToFront();
        this.f112704f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.widgets.MainViewContainer.View$OnClickListenerC444121 */

            public void onClick(View view) {
            }
        });
        super.mo4918a(new DrawerLayout.AbstractC0974c() {
            /* class com.ss.android.lark.main.app.widgets.MainViewContainer.C444132 */

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
            /* renamed from: a */
            public void mo719a(int i) {
                MainViewContainer.this.f112704f.mo157750a(i);
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
            /* renamed from: b */
            public void mo723b(View view) {
                MainViewContainer.this.f112704f.mo157755c();
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
            /* renamed from: a */
            public void mo720a(View view) {
                MainViewContainer.this.f112704f.mo157753b();
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
            /* renamed from: a */
            public void mo721a(View view, float f) {
                MainViewContainer.this.f112704f.mo157757d();
            }
        });
    }

    /* renamed from: k */
    private void m176260k() {
        TipContainer tipContainer = new TipContainer(getContext());
        this.f112703e = tipContainer;
        tipContainer.setVisibility(8);
        addView(this.f112703e, new DrawerLayout.LayoutParams(-1, -1));
        this.f112703e.setTipChangeListener(new TipContainer.AbstractC44415a() {
            /* class com.ss.android.lark.main.app.widgets.MainViewContainer.C444143 */

            @Override // com.ss.android.lark.main.app.widgets.TipContainer.AbstractC44415a
            /* renamed from: a */
            public void mo157776a(String str) {
                if (MainViewContainer.this.f112702d.equals(str) || DesktopUtil.m144301a(MainViewContainer.this.getContext())) {
                    MainViewContainer.this.f112704f.bringToFront();
                    MainViewContainer.this.f112704f.setVisibility(0);
                    MainViewContainer.this.f112703e.setVisibility(8);
                    if (MainViewContainer.this.f112705g != -1) {
                        MainViewContainer mainViewContainer = MainViewContainer.this;
                        mainViewContainer.setDrawerLockModeWithState(mainViewContainer.f112705g);
                    }
                }
            }

            @Override // com.ss.android.lark.main.app.widgets.TipContainer.AbstractC44415a
            /* renamed from: b */
            public void mo157777b(String str) {
                if (MainViewContainer.this.f112702d.equals(str) || DesktopUtil.m144301a(MainViewContainer.this.getContext())) {
                    MainViewContainer.this.f112703e.bringToFront();
                    MainViewContainer.this.f112703e.setVisibility(0);
                    MainViewContainer.this.f112704f.setVisibility(8);
                    MainViewContainer.this.setDrawerLockModeWithoutState(1);
                }
            }
        });
        if (DesktopUtil.m144301a(getContext())) {
            setDrawerLockMode(1);
        }
    }

    public void setDrawerLockModeWithoutState(int i) {
        super.setDrawerLockMode(i);
    }

    public void setiMainViewController(AbstractC44547d dVar) {
        this.f112706h = dVar;
    }

    /* renamed from: c */
    public void mo157764c(String str) {
        DrawerContainer drawerContainer = this.f112704f;
        if (drawerContainer != null) {
            drawerContainer.mo157756c(str);
        }
    }

    /* renamed from: d */
    public void mo157765d(String str) {
        TipContainer tipContainer = this.f112703e;
        if (tipContainer != null) {
            tipContainer.mo157778a(str);
        }
    }

    public void setDrawerLockModeWithState(int i) {
        this.f112705g = i;
        super.setDrawerLockMode(i);
    }

    /* renamed from: a */
    private void m176258a(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.m165384e("MainViewContainer", "dispatchTouchEvent", e);
            return true;
        }
    }

    public MainViewContainer(Context context) {
        super(context);
        this.f112701c = C44134a.m174959a();
        this.f112705g = -1;
        this.f112709k = new int[2];
        this.f112710l = new int[2];
        this.f112711m = null;
    }

    /* renamed from: b */
    public boolean mo157763b(String str) {
        DrawerContainer drawerContainer = this.f112704f;
        if (drawerContainer != null) {
            return drawerContainer.mo157752a(str);
        }
        return false;
    }

    /* renamed from: a */
    private String m176256a(ViewGroup viewGroup) {
        String a;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                return m176257a(viewGroup, i);
            }
            if ((childAt instanceof ViewGroup) && (a = m176256a((ViewGroup) childAt)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: m */
    private String m176261m(View view) {
        if (view.getId() != -1) {
            return getResources().getResourceEntryName(view.getId()) + "/";
        }
        return view.getClass().getSimpleName() + "/";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44548e
    /* renamed from: a */
    public void mo99184a(View view) {
        if (!DesktopUtil.m144301a(getContainerContext())) {
            removeView(view);
        } else {
            m176258a(this.f112711m);
            this.f112711m = null;
        }
        int i = this.f112705g;
        if (i != -1) {
            setDrawerLockModeWithState(i);
        }
    }

    /* renamed from: a */
    public void mo157760a(String str) {
        this.f112702d = str;
        TipContainer tipContainer = this.f112703e;
        if (tipContainer != null) {
            tipContainer.mo157780b(str);
        }
        DrawerContainer drawerContainer = this.f112704f;
        if (drawerContainer != null) {
            drawerContainer.mo157754b(str);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44548e
    /* renamed from: a */
    public void mo99186a(boolean z) {
        DrawerContainer drawerContainer = this.f112704f;
        if (drawerContainer != null) {
            mo4928b(drawerContainer, z);
        }
    }

    /* renamed from: a */
    public void mo157761a(String str, View view) {
        DrawerContainer drawerContainer = this.f112704f;
        if (drawerContainer != null) {
            drawerContainer.mo157751a(str, view);
        }
    }

    /* renamed from: b */
    public void mo157762b(String str, View view) {
        TipContainer tipContainer = this.f112703e;
        if (tipContainer != null) {
            tipContainer.bringToFront();
            this.f112703e.mo157779a(str, view);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    /* renamed from: a */
    public void mo4913a(int i, int i2) {
        if (DesktopUtil.m144301a(getContext())) {
            super.mo4913a(1, i2);
        } else {
            super.mo4913a(i, i2);
        }
    }

    public MainViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f112701c = C44134a.m174959a();
        this.f112705g = -1;
        this.f112709k = new int[2];
        this.f112710l = new int[2];
        this.f112711m = null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void onMeasure(int i, int i2) {
        if (!this.f112707i) {
            this.f112707i = true;
            this.f112701c.mo133182B().mo133365c("first_render", "first_render");
        }
        try {
            super.onMeasure(i, i2);
        } catch (NullPointerException e) {
            throw new RuntimeException(m176256a((ViewGroup) this), e);
        }
    }

    /* renamed from: a */
    private String m176257a(ViewGroup viewGroup, int i) {
        String str = i + "/";
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                str = str + m176261m(childAt);
            }
        }
        String str2 = str + ";";
        while (true) {
            str2 = str2 + m176261m((View) viewGroup);
            if (!(viewGroup.getParent() instanceof ViewGroup)) {
                return str2;
            }
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
    }

    public MainViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112701c = C44134a.m174959a();
        this.f112705g = -1;
        this.f112709k = new int[2];
        this.f112710l = new int[2];
        this.f112711m = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44548e
    /* renamed from: a */
    public void mo99185a(View view, int i, View view2, PopupWindow.OnDismissListener onDismissListener) {
        this.f112709k = DesktopUtil.m144302a(view);
        getLocationOnScreen(this.f112710l);
        if (DesktopUtil.m144301a(getContext())) {
            m176258a(this.f112711m);
            this.f112711m = null;
            PopupWindow popupWindow = new PopupWindow(getContext());
            this.f112711m = popupWindow;
            popupWindow.setBackgroundDrawable(null);
            this.f112711m.setContentView(view2);
            this.f112711m.setOutsideTouchable(true);
            view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            try {
                this.f112711m.showAtLocation(view, 51, this.f112709k[0] + ((view.getWidth() - view2.getMeasuredWidth()) / 2), UIUtils.dp2px(getContext(), 65.0f));
            } catch (Exception unused) {
            }
            this.f112711m.setOnDismissListener(onDismissListener);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof DrawerLayout.LayoutParams)) {
                layoutParams = new DrawerLayout.LayoutParams(-1, -1);
                view2.setLayoutParams(layoutParams);
            }
            ((DrawerLayout.LayoutParams) layoutParams).topMargin = (this.f112709k[1] - this.f112710l[1]) + i;
            addView(view2);
        }
        setDrawerLockModeWithoutState(1);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NullPointerException e) {
            throw new RuntimeException(m176256a((ViewGroup) this), e);
        } catch (IndexOutOfBoundsException e2) {
            Log.m165385e("MainViewContainer", e2.getMessage(), e2, true);
        }
        if (!this.f112708j) {
            this.f112708j = true;
            this.f112701c.mo133182B().mo133366d("first_render", "first_render");
        }
    }
}
