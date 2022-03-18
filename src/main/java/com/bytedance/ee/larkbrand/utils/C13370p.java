package com.bytedance.ee.larkbrand.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.p3302a.C66389b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.C67586c;
import com.tt.option.p3392m.AbstractC67655b;
import java.io.File;

/* renamed from: com.bytedance.ee.larkbrand.utils.p */
public class C13370p {
    /* renamed from: b */
    public static void m54375b(final Context context, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.bytedance.ee.larkbrand.utils.C13370p.RunnableC133722 */

            public void run() {
                LKUIToast.show(context, str);
            }
        });
    }

    /* renamed from: a */
    public static void m54374a(Context context, String str) {
        File file = new File(AppbrandUtil.getAppServiceDir(context), "99.99.99.99");
        C12824b bVar = new C12824b(str, false);
        bVar.mo48417a(C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()).getPath());
        bVar.mo48418b(System.currentTimeMillis() + ".ooo");
        try {
            File a = C66434g.m259707a().mo231983a(bVar, new AbstractC67655b.AbstractC67656a() {
                /* class com.bytedance.ee.larkbrand.utils.C13370p.C133711 */

                @Override // com.tt.option.p3392m.AbstractC67655b.AbstractC67656a
                /* renamed from: a */
                public void mo49677a(int i, long j, long j2) {
                }
            }, C67448a.m262353a().mo234190i()).mo48421a();
            if (a == null || !a.exists()) {
                m54375b(context, "no js sdk on this server");
                return;
            }
            C67586c.m263046a(AppbrandUtil.getAppServiceDir(context));
            File a2 = C66389b.m259575a(context, "__dev__.zip");
            C67586c.m263047a(a.getAbsolutePath(), a2.getAbsolutePath());
            IOUtils.copyFolder(new File(a2, "__dev__"), file);
            IOUtils.delete(a2);
            IOUtils.writeStringToFile(C66389b.m259574a().getAbsolutePath(), "99999999", "UTF-8");
            m54375b(context, "up date js sdk success");
        } catch (Exception e) {
            m54375b(context, e.toString());
        }
    }
}
