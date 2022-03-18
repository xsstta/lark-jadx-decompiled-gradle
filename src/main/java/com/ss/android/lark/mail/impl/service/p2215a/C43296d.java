package com.ss.android.lark.mail.impl.service.p2215a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43339a;

/* renamed from: com.ss.android.lark.mail.impl.service.a.d */
public class C43296d {

    /* renamed from: a */
    public static boolean f110149a;

    /* renamed from: a */
    public static void m172003a() {
        C43345c.m172076m().mo154991a(new C43345c.AbstractC43349b() {
            /* class com.ss.android.lark.mail.impl.service.p2215a.C43296d.C432971 */

            @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
            /* renamed from: a */
            public void mo152845a(boolean z) {
            }

            @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
            /* renamed from: b */
            public void mo152846b(boolean z) {
                if (z && C43296d.f110149a) {
                    C43296d.f110149a = false;
                    Log.m165388i("onActiveBlockPush");
                    ((AbstractC43339a) Watchers.m167205a(AbstractC43339a.class)).onActiveBlockPush();
                }
            }
        });
    }

    /* renamed from: c */
    private static boolean m172005c() {
        return !C43345c.m172076m().mo154999e();
    }

    /* renamed from: b */
    public static boolean m172004b() {
        if (!m172005c()) {
            return false;
        }
        Log.m165388i("block the push of MAIL_OUTBOX_SEND_STATE_CHANGE");
        f110149a = true;
        return true;
    }
}
