package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.main.app.tab.NavigationTab;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.tab.MainTabItemView;
import java.util.HashMap;
import java.util.Map;

public class MainTab extends LinearLayout {

    /* renamed from: a */
    AbstractC44371p f112429a;

    /* renamed from: b */
    AbstractC44372q f112430b;

    /* renamed from: c */
    public Map<String, View> f112431c;

    /* renamed from: d */
    public MoreTabLayout f112432d;

    /* renamed from: e */
    private View.OnClickListener f112433e;

    /* renamed from: f */
    private View.OnTouchListener f112434f;

    /* renamed from: g */
    private FrameLayout f112435g;

    /* renamed from: a */
    public void mo157473a() {
        m175888c();
    }

    public AbstractC44371p getOnTabItemClickListener() {
        return this.f112429a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.tab.MainTab$a */
    public static class C44339a extends FrameLayout {

        /* renamed from: a */
        private ImageView f112442a;

        /* renamed from: b */
        private C36592a f112443b = new C36592a.C36593a().mo135002a(UIUtils.getString(getContext(), R.string.Lark_Legacy_MoreApp)).mo135003a(getContext());

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo157490a() {
            C36592a aVar = this.f112443b;
            if (aVar != null) {
                aVar.dismiss();
            }
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            mo157490a();
        }

        public void setOnClickListener(final View.OnClickListener onClickListener) {
            super.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.main.app.tab.MainTab.C44339a.C443401 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C44339a.this.mo157490a();
                    View.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }

        public void setHovered(boolean z) {
            int i;
            super.setHovered(z);
            ImageView imageView = this.f112442a;
            if (z) {
                i = R.drawable.ic_nav_tab_more_hovered;
            } else {
                i = R.drawable.ic_nav_tab_more_normal;
            }
            imageView.setImageResource(i);
            C36592a aVar = this.f112443b;
            if (aVar == null) {
                return;
            }
            if (z) {
                aVar.mo134998a(this, 60, 48, -10, 0);
            } else {
                aVar.dismiss();
            }
        }

        public C44339a(Context context) {
            super(context);
            ImageView imageView = new ImageView(getContext());
            this.f112442a = imageView;
            imageView.setImageResource(R.drawable.ic_nav_tab_more_normal);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(UIUtils.dp2px(getContext(), 20.0f), UIUtils.dp2px(getContext(), 20.0f));
            layoutParams.gravity = 17;
            addView(this.f112442a, layoutParams);
        }
    }

    public int getTabCount() {
        return this.f112431c.size();
    }

    public NavigationTab.AbstractC44342a getNavRedDotListener() {
        MoreTabLayout iVar = this.f112432d;
        if (iVar == null) {
            return null;
        }
        return iVar.getNavRedDotListener();
    }

    /* renamed from: c */
    private void m175888c() {
        this.f112433e = new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.tab.MainTab.View$OnClickListenerC443351 */

            public void onClick(View view) {
                MainTab.this.f112429a.mo157345a((String) view.getTag(R.id.main_tab_sub_tab_tag));
            }
        };
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.lark.main.app.tab.MainTab.C443362 */

            public boolean onDoubleTap(MotionEvent motionEvent) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                for (String str : MainTab.this.f112431c.keySet()) {
                    if (UIUtils.calcViewScreenLocation(MainTab.this.f112431c.get(str)).contains(rawX, rawY)) {
                        if (MainTab.this.f112430b == null) {
                            return true;
                        }
                        MainTab.this.f112430b.mo157335a(str);
                        return true;
                    }
                }
                return false;
            }
        });
        this.f112434f = new View.OnTouchListener() {
            /* class com.ss.android.lark.main.app.tab.MainTab.View$OnTouchListenerC443373 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                return MainTab.this.onTouchEvent(motionEvent);
            }
        };
    }

    /* renamed from: b */
    public void mo157476b() {
        for (String str : this.f112431c.keySet()) {
            View view = this.f112431c.get(str);
            if (view != null) {
                view.clearAnimation();
                view.setOnTouchListener(null);
                view.setOnClickListener(null);
            }
        }
        this.f112431c.clear();
        MoreTabLayout iVar = this.f112432d;
        if (iVar != null) {
            iVar.mo201248h();
        }
        removeAllViews();
    }

    public void setOnTabItemClickListener(AbstractC44371p pVar) {
        this.f112429a = pVar;
    }

    public void setOnTabItemDoubleTapListener(AbstractC44372q qVar) {
        this.f112430b = qVar;
    }

    public MainTab(Context context) {
        this(context, null);
    }

    public void setOnDesktopNavIconClickListener(View.OnClickListener onClickListener) {
        this.f112435g.setOnClickListener(onClickListener);
    }

    public void setOnMoreClickListener(final View.OnClickListener onClickListener) {
        MoreTabLayout iVar = this.f112432d;
        if (iVar != null) {
            iVar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.main.app.tab.MainTab.View$OnClickListenerC443384 */

                public void onClick(View view) {
                    MainTab mainTab = MainTab.this;
                    mainTab.mo157478c(!mainTab.f112432d.getStatus());
                    onClickListener.onClick(view);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo157477b(boolean z) {
        MoreTabLayout iVar;
        if (C44373s.m176069a().mo157648i()) {
            MoreTabLayout iVar2 = this.f112432d;
            if (iVar2 != null) {
                iVar2.setVisibility(8);
                if (this.f112432d.getParent() != null) {
                    ((ViewGroup) this.f112432d.getParent()).removeView(this.f112432d);
                }
            }
        } else if (!z && (iVar = this.f112432d) != null) {
            iVar.setVisibility(8);
        } else if (z) {
            if (this.f112432d == null) {
                MoreTabLayout iVar3 = new MoreTabLayout(getContext());
                this.f112432d = iVar3;
                iVar3.setTag(R.id.main_tab_sub_tab_tag, "more");
            }
            this.f112432d.setVisibility(0);
            this.f112432d.mo201238b(false);
            addView(this.f112432d);
        }
    }

    /* renamed from: c */
    public void mo157478c(boolean z) {
        MoreTabLayout iVar = this.f112432d;
        if (iVar != null && iVar.getStatus() != z) {
            for (String str : this.f112431c.keySet()) {
                View view = this.f112431c.get(str);
                if (view instanceof MainTabItemView) {
                    if (z) {
                        ((MainTabItemView) view).setIconSelectStatus(false);
                    } else {
                        MainTabItemView mainTabItemView = (MainTabItemView) view;
                        if (mainTabItemView.getStatus()) {
                            mainTabItemView.setIconSelectStatus(true);
                        }
                    }
                }
            }
            if (z) {
                this.f112432d.mo110677a();
            } else {
                this.f112432d.mo201238b(false);
            }
        }
    }

    /* renamed from: a */
    public void mo157475a(boolean z) {
        LinearLayout.LayoutParams layoutParams;
        if (z) {
            if (this.f112435g == null) {
                this.f112435g = new C44339a(getContext());
            }
            if (DesktopUtil.m144301a(getContext())) {
                layoutParams = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), 60.0f), UIUtils.dp2px(getContext(), 48.0f));
            } else {
                layoutParams = new LinearLayout.LayoutParams(0, UIUtils.dp2px(getContext(), 57.0f));
            }
            if (this.f112435g.getParent() != null) {
                ((ViewGroup) this.f112435g.getParent()).removeView(this.f112435g);
            }
            addView(this.f112435g, layoutParams);
            this.f112435g.setVisibility(0);
            return;
        }
        FrameLayout frameLayout = this.f112435g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public MainTab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo157474a(String str, View view) {
        LinearLayout.LayoutParams layoutParams;
        this.f112431c.put(str, view);
        view.setTag(R.id.main_tab_sub_tab_tag, str);
        view.setOnClickListener(this.f112433e);
        view.setOnTouchListener(this.f112434f);
        if (DesktopUtil.m144301a(getContext())) {
            layoutParams = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), 60.0f), UIUtils.dp2px(getContext(), 48.0f));
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, UIUtils.dp2px(getContext(), (float) 65));
        }
        if (!DesktopUtil.m144301a(getContext())) {
            layoutParams.weight = 1.0f;
        }
        view.setLayoutParams(layoutParams);
        addView(view, layoutParams);
    }

    public MainTab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112431c = new HashMap();
        this.f112435g = null;
        this.f112432d = null;
        setOrientation(DesktopUtil.m144301a(getContext()) ? 1 : 0);
    }
}
