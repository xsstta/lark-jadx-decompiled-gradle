package com.ss.android.lark.mm.module.player.core;

import android.content.Context;
import com.ss.android.lark.mm.p2288b.C45850b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.videoshop.api.C64107n;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;

/* renamed from: com.ss.android.lark.mm.module.player.core.n */
public class C46687n {
    /* renamed from: a */
    public static void m184667a(Context context) {
        if (C45850b.m181645a()) {
            C64159a.m252078a(new C64159a.AbstractC64160a() {
                /* class com.ss.android.lark.mm.module.player.core.C46687n.C466881 */

                @Override // com.ss.android.videoshop.p3199e.C64159a.AbstractC64160a
                /* renamed from: a */
                public void mo163952a(String str, String str2) {
                    C45855f.m181662a(str, str2);
                }

                @Override // com.ss.android.videoshop.p3199e.C64159a.AbstractC64160a
                /* renamed from: b */
                public void mo163954b(String str, String str2) {
                    C45855f.m181663b(str, str2);
                }

                @Override // com.ss.android.videoshop.p3199e.C64159a.AbstractC64160a
                /* renamed from: c */
                public void mo163955c(String str, String str2) {
                    C45855f.m181663b(str, str2);
                }

                @Override // com.ss.android.videoshop.p3199e.C64159a.AbstractC64160a
                /* renamed from: a */
                public void mo163951a(C64116b bVar, String str) {
                    C45855f.m181663b("MmVideoShopInitor", "reportVideoLog " + str);
                }

                @Override // com.ss.android.videoshop.p3199e.C64159a.AbstractC64160a
                /* renamed from: a */
                public void mo163953a(String str, boolean z) {
                    C45855f.m181663b("MmVideoShopInitor", "writeVideoLog " + str);
                }

                @Override // com.ss.android.videoshop.p3199e.C64159a.AbstractC64160a
                /* renamed from: a */
                public void mo163950a(int i, String str, StackTraceElement[] stackTraceElementArr) {
                    C45855f.m181665d(str, "alogStackTrace");
                }
            });
        }
        C64107n.m251617a(context);
    }
}
