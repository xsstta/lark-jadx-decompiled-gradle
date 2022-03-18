package com.ss.android.lark.desktopmode.p1788b.p1791c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36544b;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;

/* renamed from: com.ss.android.lark.desktopmode.b.c.a */
public class C36538a implements AbstractC36544b {

    /* renamed from: a */
    public AbstractC36551c f94076a;

    /* renamed from: b */
    public DrawerLayout f94077b;

    /* renamed from: c */
    private AbstractC36544b.AbstractC36545a f94078c;

    /* renamed from: d */
    private FrameLayout f94079d;

    /* renamed from: f */
    private boolean m144162f() {
        if (this.f94078c == null || this.f94077b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo134868a() {
        if (this.f94077b != null) {
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.desktopmode.p1788b.p1791c.C36538a.RunnableC365424 */

                public void run() {
                    C36538a.this.mo134872a(true);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo134873b() {
        if (this.f94077b != null) {
            mo134872a(false);
        }
    }

    /* renamed from: c */
    public void mo134875c() {
        if (this.f94077b != null) {
            mo134872a(true);
        }
    }

    /* renamed from: d */
    public void mo134877d() {
        mo134878e();
        this.f94079d.removeAllViews();
        this.f94079d.setVisibility(8);
    }

    /* renamed from: e */
    public void mo134878e() {
        View childAt = this.f94079d.getChildAt(0);
        if (childAt instanceof AbstractC36546c) {
            ((AbstractC36546c) childAt).mo129894a();
        }
    }

    public C36538a(AbstractC36551c cVar) {
        this.f94076a = cVar;
    }

    /* renamed from: a */
    public void mo134872a(boolean z) {
        this.f94077b.mo4918a(new DrawerLayout.AbstractC0975d() {
            /* class com.ss.android.lark.desktopmode.p1788b.p1791c.C36538a.C365435 */

            @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c, androidx.drawerlayout.widget.DrawerLayout.AbstractC0975d
            /* renamed from: b */
            public void mo723b(View view) {
                super.mo723b(view);
                C36538a.this.f94076a.mo134892a(ContainerType.Drawer);
                C36538a.this.f94077b.mo4929b(this);
            }
        });
        this.f94077b.mo4925b(8388613, z);
    }

    /* renamed from: b */
    public void mo134874b(final C36516a aVar) {
        DrawerLayout drawerLayout = this.f94077b;
        if (drawerLayout != null && !drawerLayout.mo4946g(8388613)) {
            this.f94077b.mo4943e(8388613);
            this.f94077b.mo4918a(new DrawerLayout.AbstractC0975d() {
                /* class com.ss.android.lark.desktopmode.p1788b.p1791c.C36538a.C365413 */

                @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c, androidx.drawerlayout.widget.DrawerLayout.AbstractC0975d
                /* renamed from: a */
                public void mo720a(View view) {
                    super.mo720a(view);
                    C36538a.this.f94077b.mo4929b(this);
                    C36538a.this.mo134876c(aVar);
                }
            });
        }
    }

    /* renamed from: c */
    public void mo134876c(C36516a aVar) {
        View childAt = this.f94079d.getChildAt(0);
        if (childAt instanceof AbstractC36546c) {
            ((AbstractC36546c) childAt).mo129897a(aVar);
        }
    }

    /* renamed from: a */
    private void m144161a(DrawerParams drawerParams) {
        View b = this.f94078c.mo134831b();
        if (b != null) {
            int drawerWidth = drawerParams.getDrawerWidth();
            DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) b.getLayoutParams();
            if (drawerWidth == -1) {
                layoutParams.width = -1;
            } else {
                layoutParams.width = UIUtils.dp2px(b.getContext(), (float) drawerWidth);
            }
            b.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo134869a(View view) {
        FrameLayout frameLayout = this.f94079d;
        if (frameLayout != null && view != null) {
            frameLayout.removeAllViews();
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f94079d.addView(view, new FrameLayout.LayoutParams(-1, -1));
            this.f94079d.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo134870a(final C36516a aVar) {
        if (m144162f() && (aVar.getFragmentParams() instanceof DrawerParams)) {
            m144161a((DrawerParams) aVar.getFragmentParams());
            this.f94076a.mo134899b(aVar);
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.desktopmode.p1788b.p1791c.C36538a.RunnableC365402 */

                public void run() {
                    C36538a.this.mo134874b(aVar);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo134871a(AbstractC36544b.AbstractC36545a aVar) {
        this.f94078c = aVar;
        if (aVar != null) {
            DrawerLayout a = aVar.mo134830a();
            this.f94077b = a;
            a.setScrimColor(0);
            this.f94077b.mo4918a(new DrawerLayout.AbstractC0974c() {
                /* class com.ss.android.lark.desktopmode.p1788b.p1791c.C36538a.C365391 */

                @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
                /* renamed from: a */
                public void mo719a(int i) {
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
                /* renamed from: a */
                public void mo720a(View view) {
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
                /* renamed from: a */
                public void mo721a(View view, float f) {
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
                /* renamed from: b */
                public void mo723b(View view) {
                    C36538a.this.f94077b.setDrawerLockMode(1);
                    C36538a.this.mo134878e();
                }
            });
            this.f94079d = this.f94078c.mo134832c();
        }
    }
}
