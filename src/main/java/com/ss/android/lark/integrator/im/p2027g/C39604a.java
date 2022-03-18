package com.ss.android.lark.integrator.im.p2027g;

import android.content.Context;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.edu.EduModule;
import com.ss.android.lark.edu.p1822a.AbstractC36920a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;

/* renamed from: com.ss.android.lark.integrator.im.g.a */
public class C39604a {

    /* renamed from: a */
    private static volatile EduModule f101078a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.g.a$a */
    public static class C39607a {

        /* renamed from: a */
        public static final AbstractC36920a f101080a = C39604a.m157162b();
    }

    private C39604a() {
    }

    /* renamed from: b */
    public static AbstractC36920a m157162b() {
        return new AbstractC36920a() {
            /* class com.ss.android.lark.integrator.im.p2027g.C39604a.C396051 */

            @Override // com.ss.android.lark.edu.p1822a.AbstractC36920a
            /* renamed from: a */
            public AbstractC36920a.AbstractC36921a mo136299a() {
                return new AbstractC36920a.AbstractC36921a() {
                    /* class com.ss.android.lark.integrator.im.p2027g.C39604a.C396051.C396061 */

                    @Override // com.ss.android.lark.edu.p1822a.AbstractC36920a.AbstractC36921a
                    /* renamed from: a */
                    public String mo136301a() {
                        return C39603g.m157159a().getPassportDependency().mo143674e();
                    }
                };
            }

            @Override // com.ss.android.lark.edu.p1822a.AbstractC36920a
            /* renamed from: a */
            public Chat mo136298a(String str) {
                return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
            }

            @Override // com.ss.android.lark.edu.p1822a.AbstractC36920a
            /* renamed from: a */
            public void mo136300a(Context context, String str) {
                AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("group_create").mo105929a());
            }
        };
    }

    /* renamed from: a */
    public static EduModule m157161a() {
        if (f101078a == null) {
            synchronized (C39604a.class) {
                if (f101078a == null) {
                    f101078a = new EduModule(C39607a.f101080a);
                }
            }
        }
        return f101078a;
    }
}
