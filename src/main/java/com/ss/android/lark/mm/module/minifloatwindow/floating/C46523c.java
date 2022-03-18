package com.ss.android.lark.mm.module.minifloatwindow.floating;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.floating.LKUIFloat;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.c */
public class C46523c {

    /* renamed from: a */
    private AbstractC46526a f117107a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.c$a */
    public interface AbstractC46526a {
        /* renamed from: a */
        Context mo163435a();

        /* renamed from: a */
        void mo163436a(View view);

        /* renamed from: b */
        void mo163437b(View view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.c$b */
    public interface AbstractC46527b {
        void invoke(FrameLayout frameLayout);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.c$c */
    public interface AbstractC46528c {
        void isOnCreated(boolean z);
    }

    /* renamed from: b */
    private void m183968b() {
        if (LKUIFloat.m150806c("APP_FLOAT_MINUTES_TAG")) {
            LKUIFloat.m150801a("APP_FLOAT_MINUTES_TAG");
        }
    }

    /* renamed from: a */
    public void mo163431a() {
        FrameLayout frameLayout;
        View d = LKUIFloat.m150807d("APP_FLOAT_MINUTES_TAG");
        if (d != null && (frameLayout = (FrameLayout) d.findViewById(R.id.float_container)) != null) {
            frameLayout.removeAllViews();
            m183968b();
        }
    }

    public C46523c(AbstractC46526a aVar) {
        this.f117107a = aVar;
    }

    /* renamed from: a */
    public void mo163432a(View view) {
        this.f117107a.mo163437b(view);
    }

    /* renamed from: a */
    public void mo163433a(View view, AbstractC46528c cVar) {
        m183967a(new AbstractC46527b(view) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$c$DWv05dyRyDTIkXOtnJBpk7U7lbI */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.AbstractC46527b
            public final void invoke(FrameLayout frameLayout) {
                C46523c.lambda$DWv05dyRyDTIkXOtnJBpk7U7lbI(C46523c.this, this.f$1, frameLayout);
            }
        }, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m183965a(FrameLayout frameLayout, View view) {
        if (view.getParent() != null) {
            C45855f.m181666e("AppFloat", "fatal error: attached view has parent already!");
        } else if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(view, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    /* renamed from: b */
    public void mo163434b(View view, AbstractC46528c cVar) {
        this.f117107a.mo163436a(view);
        cVar.isOnCreated(true);
    }

    /* renamed from: a */
    private void m183967a(final AbstractC46527b bVar, final AbstractC46528c cVar) {
        LKUIFloat.m150799a(this.f117107a.mo163435a().getApplicationContext()).mo140129a(R.layout.float_window_root_view, new AbstractC38339g() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.C465252 */

            @Override // com.ss.android.lark.floating.p1896c.AbstractC38339g
            /* renamed from: a */
            public void mo140249a(View view) {
                bVar.invoke((FrameLayout) view.findViewById(R.id.float_container));
            }
        }).mo140133a("APP_FLOAT_MINUTES_TAG").mo140132a(SidePattern.RESULT_HORIZONTAL).mo140138b(true).mo140128a(8388613, 15, LocationRequest.PRIORITY_HD_ACCURACY).mo140139c(false).mo140131a(ShowPattern.ALL_TIME).mo140130a(new OnFloatCallbacks() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.C465241 */

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: a */
            public void mo140241a() {
            }

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: a */
            public void mo140242a(View view) {
            }

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: a */
            public void mo140243a(View view, MotionEvent motionEvent) {
            }

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: b */
            public void mo140245b(View view) {
            }

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: b */
            public void mo140246b(View view, MotionEvent motionEvent) {
            }

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: c */
            public void mo140247c(View view) {
            }

            @Override // com.ss.android.lark.floating.interfaces.OnFloatCallbacks
            /* renamed from: a */
            public void mo140244a(boolean z, String str, View view) {
                C45855f.m181664c("AppFloat", "[create] isSuccess=" + z);
                cVar.isOnCreated(z);
            }
        }).mo140137a();
    }
}
