package com.ss.android.lark.mm.module.minifloatwindow.floating;

import android.app.Activity;
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

/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.a */
public class C46516a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.a$a */
    public interface AbstractC46520a {
        /* renamed from: a */
        void mo163429a(FrameLayout frameLayout);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.a$b */
    public interface AbstractC46521b {
        /* renamed from: a */
        void mo163430a(boolean z);
    }

    /* renamed from: b */
    private void m183942b(Activity activity) {
        if (LKUIFloat.m150804b(activity, "ACTIVITY_FLOAT_MINUTES_TAG")) {
            LKUIFloat.m150800a(activity, "ACTIVITY_FLOAT_MINUTES_TAG");
        }
    }

    /* renamed from: a */
    public void mo163426a(Activity activity) {
        FrameLayout frameLayout;
        View c = LKUIFloat.m150805c(activity, "ACTIVITY_FLOAT_MINUTES_TAG");
        if (c != null && (frameLayout = (FrameLayout) c.findViewById(R.id.float_container)) != null) {
            frameLayout.removeAllViews();
            m183942b(activity);
        }
    }

    /* renamed from: a */
    public void mo163428a(FrameLayout frameLayout, View view) {
        if (view.getParent() != null) {
            C45855f.m181666e("ActivityFloat", "fatal error: attached view has parent already!");
        } else if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(view, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    /* renamed from: a */
    public void mo163427a(final View view, Activity activity, AbstractC46521b bVar) {
        m183941a(activity, new AbstractC46520a() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46516a.C465193 */

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46516a.AbstractC46520a
            /* renamed from: a */
            public void mo163429a(FrameLayout frameLayout) {
                C46516a.this.mo163428a(frameLayout, view);
            }
        }, bVar);
    }

    /* renamed from: a */
    private void m183941a(Activity activity, final AbstractC46520a aVar, final AbstractC46521b bVar) {
        LKUIFloat.m150799a(activity).mo140129a(R.layout.float_window_root_view, new AbstractC38339g() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46516a.C465182 */

            @Override // com.ss.android.lark.floating.p1896c.AbstractC38339g
            /* renamed from: a */
            public void mo140249a(View view) {
                aVar.mo163429a((FrameLayout) view.findViewById(R.id.float_container));
            }
        }).mo140133a("ACTIVITY_FLOAT_MINUTES_TAG").mo140132a(SidePattern.RESULT_HORIZONTAL).mo140138b(true).mo140128a(8388613, 15, LocationRequest.PRIORITY_HD_ACCURACY).mo140139c(false).mo140131a(ShowPattern.CURRENT_ACTIVITY).mo140130a(new OnFloatCallbacks() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46516a.C465171 */

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
                C45855f.m181664c("ActivityFloat", "[create] isSuccess=" + z);
                bVar.mo163430a(z);
            }
        }).mo140137a();
    }
}
