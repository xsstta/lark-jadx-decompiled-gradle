package com.ss.android.lark.mm.module.minifloatwindow.floating;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;

/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.d */
public class C46529d {

    /* renamed from: a */
    private static C46531e f117112a;

    private C46529d() {
    }

    /* renamed from: b */
    private static AbstractC46538f m183985b() {
        return new AbstractC46538f() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46529d.C465301 */

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: a */
            public Context mo163438a() {
                return C45899c.m181859a().getContextDepend().mo144557a();
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: d */
            public boolean mo163446d() {
                return C45899c.m181859a().getVideoChatDependency().mo144590b();
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: c */
            public Activity mo163445c() {
                Context b = C45899c.m181859a().getContextDepend().mo144562b();
                if (b instanceof Activity) {
                    return (Activity) b;
                }
                return null;
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: b */
            public boolean mo163444b() {
                return C45899c.m181859a().getMultiTaskDependency().mo144587a();
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: b */
            public void mo163442b(View view) {
                C45899c.m181859a().getMultiTaskDependency().mo144588b(view);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: a */
            public void mo163439a(View view) {
                C45899c.m181859a().getMultiTaskDependency().mo144586a(view);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: b */
            public void mo163443b(IMmDepend.AbstractC45871b.AbstractC45873b bVar) {
                C45899c.m181859a().getContextDepend().mo144563b(bVar);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: a */
            public void mo163440a(IMmDepend.AbstractC45871b.AbstractC45873b bVar) {
                C45899c.m181859a().getContextDepend().mo144559a(bVar);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.AbstractC46538f
            /* renamed from: a */
            public void mo163441a(IMmDepend.AbstractC45871b.AbstractC45874c cVar) {
                C45899c.m181859a().getContextDepend().mo144560a(cVar);
            }
        };
    }

    /* renamed from: a */
    public static C46531e m183984a() {
        if (f117112a == null) {
            synchronized (C46529d.class) {
                if (f117112a == null) {
                    f117112a = new C46531e(m183985b());
                }
            }
        }
        return f117112a;
    }
}
