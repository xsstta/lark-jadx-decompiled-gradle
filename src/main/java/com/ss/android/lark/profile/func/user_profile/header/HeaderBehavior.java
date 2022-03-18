package com.ss.android.lark.profile.func.user_profile.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

public class HeaderBehavior extends AppBarLayout.Behavior {

    /* renamed from: a */
    private static final int f130146a = UIHelper.dp2px(330.0f);

    /* renamed from: b */
    private FrameLayout f130147b;

    /* renamed from: c */
    private ConstraintLayout f130148c;

    /* renamed from: d */
    private RecyclerView f130149d;

    /* renamed from: e */
    private ImageView f130150e;

    /* renamed from: f */
    private ImageView f130151f;

    /* renamed from: g */
    private int f130152g;

    /* renamed from: h */
    private boolean f130153h;

    /* renamed from: i */
    private float f130154i;

    /* renamed from: j */
    private TextView f130155j;

    /* renamed from: k */
    private TextView f130156k;

    /* renamed from: l */
    private TextView f130157l;

    /* renamed from: m */
    private TextView f130158m;

    /* renamed from: n */
    private ImageView f130159n;

    /* renamed from: o */
    private TextView f130160o;

    /* renamed from: p */
    private TextView f130161p;

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public HeaderBehavior() {
    }

    /* renamed from: b */
    private float m203847b() {
        return this.f130154i / 375.0f;
    }

    /* renamed from: c */
    private boolean m203853c() {
        if (this.f130155j.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m203855e() {
        if (this.f130156k.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m203856f() {
        RecyclerView.Adapter adapter = this.f130149d.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m203854d() {
        if ((this.f130157l.getVisibility() & this.f130158m.getVisibility() & this.f130159n.getVisibility() & this.f130160o.getVisibility() & this.f130161p.getVisibility()) != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m203841a() {
        this.f130154i = BitmapDescriptorFactory.HUE_RED;
        if (m203856f()) {
            this.f130154i += m203840a(this.f130149d);
        }
        if (m203854d()) {
            this.f130154i += (float) UIHelper.dp2px(22.0f);
        }
        if (m203853c()) {
            this.f130154i += m203840a(this.f130155j);
        }
        if (m203855e()) {
            this.f130154i += m203840a(this.f130156k);
        }
    }

    /* renamed from: a */
    private void m203845a(AppBarLayout appBarLayout) {
        appBarLayout.setClipChildren(false);
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.ss.android.lark.profile.func.user_profile.header.$$Lambda$HeaderBehavior$QXcHDvwSgitR0PE1tVwqh7dE8xk */

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                HeaderBehavior.lambda$QXcHDvwSgitR0PE1tVwqh7dE8xk(HeaderBehavior.this, appBarLayout, i);
            }
        });
    }

    /* renamed from: a */
    private float m203840a(View view) {
        if (view == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float height = (float) view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + ((float) (marginLayoutParams.bottomMargin + marginLayoutParams.topMargin));
    }

    /* renamed from: a */
    private void m203843a(CoordinatorLayout coordinatorLayout) {
        m203852c(coordinatorLayout);
        m203849b(coordinatorLayout);
        this.f130148c = (ConstraintLayout) coordinatorLayout.findViewById(R.id.mProfileInfosLayout);
        m203841a();
    }

    /* renamed from: b */
    private void m203848b(int i) {
        float abs = 1.0f - ((((float) Math.abs(i)) * 1.0f) / ((float) UIHelper.dp2px(150.0f)));
        this.f130149d.setAlpha(abs);
        this.f130155j.setAlpha(abs);
        this.f130156k.setAlpha(abs);
        this.f130157l.setAlpha(abs);
        this.f130158m.setAlpha(abs);
        this.f130159n.setAlpha(abs);
        this.f130160o.setAlpha(abs);
        this.f130161p.setAlpha(abs);
    }

    /* renamed from: c */
    private void m203851c(int i) {
        if (Math.abs(i) <= 0) {
            this.f130148c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        } else if (Math.abs(i) >= 375) {
            this.f130148c.setTranslationY(this.f130154i);
        } else {
            this.f130148c.setTranslationY(((float) (-i)) * m203847b());
        }
    }

    /* renamed from: b */
    private void m203849b(CoordinatorLayout coordinatorLayout) {
        this.f130149d = (RecyclerView) coordinatorLayout.findViewById(R.id.mCtaRv);
        this.f130155j = (TextView) coordinatorLayout.findViewById(R.id.mProfileTenantName);
        this.f130156k = (TextView) coordinatorLayout.findViewById(R.id.mTenantCertification);
        this.f130157l = (TextView) coordinatorLayout.findViewById(R.id.mFrozenTv);
        this.f130158m = (TextView) coordinatorLayout.findViewById(R.id.mBlockTv);
        this.f130159n = (ImageView) coordinatorLayout.findViewById(R.id.mDoNotDisturbTag);
        this.f130160o = (TextView) coordinatorLayout.findViewById(R.id.mProfileWorkdayLeave);
        this.f130161p = (TextView) coordinatorLayout.findViewById(R.id.mUserDimissionTv);
    }

    /* renamed from: c */
    private void m203852c(CoordinatorLayout coordinatorLayout) {
        this.f130150e = (ImageView) coordinatorLayout.findViewById(R.id.mProfileOriginalAvatar);
        this.f130151f = (ImageView) coordinatorLayout.findViewById(R.id.mProfileBlurAvatar);
        this.f130147b = (FrameLayout) coordinatorLayout.findViewById(R.id.mProfileAvatarWrapper);
    }

    /* renamed from: a */
    private void m203842a(int i) {
        float abs = 1.0f - ((((float) Math.abs(i)) * 1.0f) / ((float) UIHelper.dp2px(150.0f)));
        if (abs <= BitmapDescriptorFactory.HUE_RED) {
            this.f130151f.setVisibility(0);
            this.f130150e.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.f130150e.setVisibility(8);
        } else if (abs >= 1.0f) {
            this.f130150e.setVisibility(0);
            this.f130150e.setAlpha(1.0f);
            this.f130151f.setVisibility(8);
        } else {
            this.f130151f.setVisibility(0);
            this.f130150e.setAlpha(abs);
            this.f130150e.setVisibility(0);
        }
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m203844a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        m203845a(appBarLayout);
        m203843a(coordinatorLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m203850b(AppBarLayout appBarLayout, int i) {
        this.f130153h = true;
        if (this.f130152g != i) {
            this.f130152g = i;
            m203842a(i);
            m203848b(i);
            m203851c(i);
            m203846a(appBarLayout, i);
        }
    }

    /* renamed from: a */
    private void m203846a(AppBarLayout appBarLayout, int i) {
        appBarLayout.setBottom(f130146a + i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        if (!DesktopUtil.m144301a(coordinatorLayout.getContext())) {
            m203844a(coordinatorLayout, appBarLayout);
        }
        return onLayoutChild;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
    }

    /* renamed from: a */
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2) {
        return super.onNestedPreFling(coordinatorLayout, appBarLayout, view, f, f2);
    }

    /* renamed from: a */
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        super.onNestedScrollAccepted(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }
}
