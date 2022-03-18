package com.bytedance.ee.bear.facade.common.empty;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.facade.common.empty.C7692e;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.facade.common.empty.d */
public class C7690d {

    /* renamed from: a */
    private AbstractC7697f f20803a;

    /* renamed from: b */
    private View f20804b;

    /* renamed from: c */
    private C7692e f20805c;

    /* renamed from: a */
    public C7692e mo30157a() {
        return this.f20805c;
    }

    /* renamed from: a */
    public void mo30158a(C7692e.C7695b bVar) {
        C13479a.m54764b("EmptyViewMediator", "updateEmptyState");
        if (bVar != null) {
            int a = bVar.mo30170a();
            C13479a.m54764b("EmptyViewMediator", "emptyState.getState:" + a);
            if (a != 0) {
                if (a == 1) {
                    this.f20803a.mo30125a();
                    View view = this.f20804b;
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    this.f20803a.mo30132f();
                    return;
                } else if (a == 2) {
                    this.f20803a.mo30128b();
                    View view2 = this.f20804b;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        return;
                    }
                    return;
                } else if (a == 3) {
                    this.f20803a.mo30125a();
                    View view3 = this.f20804b;
                    if (view3 != null) {
                        view3.setVisibility(4);
                    }
                    this.f20803a.mo30127a(bVar.mo30172b());
                    return;
                } else if (a == 4) {
                    this.f20803a.mo30125a();
                    View view4 = this.f20804b;
                    if (view4 != null) {
                        view4.setVisibility(4);
                    }
                    this.f20803a.mo30130d();
                    return;
                } else if (a == 5) {
                    this.f20803a.mo30125a();
                    View view5 = this.f20804b;
                    if (view5 != null) {
                        view5.setVisibility(4);
                    }
                    this.f20803a.mo30133g();
                    return;
                } else if (a != 99) {
                    switch (a) {
                        case 7:
                            this.f20803a.mo30125a();
                            View view6 = this.f20804b;
                            if (view6 != null) {
                                view6.setVisibility(4);
                            }
                            this.f20803a.mo30135h();
                            return;
                        case 8:
                            break;
                        case 9:
                            this.f20803a.mo30125a();
                            View view7 = this.f20804b;
                            if (view7 != null) {
                                view7.setVisibility(4);
                            }
                            this.f20803a.mo30136i();
                            return;
                        case 10:
                            this.f20803a.mo30125a();
                            View view8 = this.f20804b;
                            if (view8 != null) {
                                view8.setVisibility(4);
                            }
                            this.f20803a.mo30137j();
                            return;
                        default:
                            C13479a.m54758a("EmptyViewMediator", "onChanged: unknown state = " + a);
                            return;
                    }
                } else {
                    this.f20803a.mo30125a();
                    View view9 = this.f20804b;
                    if (view9 != null) {
                        view9.setVisibility(4);
                    }
                    this.f20803a.mo30131e();
                    return;
                }
            }
            this.f20803a.mo30125a();
            View view10 = this.f20804b;
            if (view10 != null) {
                view10.setVisibility(4);
            }
            this.f20803a.mo30129c();
        }
    }

    public C7690d(Context context, AbstractC7697f fVar, View view) {
        this.f20803a = fVar;
        this.f20804b = view;
    }

    public C7690d(Context context, LifecycleOwner lifecycleOwner, AbstractC7697f fVar, View view) {
        this.f20803a = fVar;
        this.f20804b = view;
        C7692e eVar = new C7692e(context);
        this.f20805c = eVar;
        eVar.mo5923a(lifecycleOwner, new AbstractC1178x<C7692e.C7695b>() {
            /* class com.bytedance.ee.bear.facade.common.empty.C7690d.C76911 */

            /* renamed from: a */
            public void onChanged(C7692e.C7695b bVar) {
                C7690d.this.mo30158a(bVar);
            }
        });
    }
}
