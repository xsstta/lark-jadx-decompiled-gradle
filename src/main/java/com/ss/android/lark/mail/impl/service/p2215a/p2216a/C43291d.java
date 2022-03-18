package com.ss.android.lark.mail.impl.service.p2215a.p2216a;

import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.MailSharedAccountChangePushResponse;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;

/* renamed from: com.ss.android.lark.mail.impl.service.a.a.d */
public class C43291d extends AbstractC43286a {
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: c */
    public boolean mo154971c() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_SHARED_ACCOUNT_CHANGE_PUSH;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            C13479a.m54763b("receive shared account push sid=" + str);
            MailSharedAccountChangePushResponse decode = MailSharedAccountChangePushResponse.ADAPTER.decode(bArr);
            if (decode.account != null) {
                C42093e a = C42130j.m168150a().mo152082a(decode.account);
                if (decode.fetch_account_list.booleanValue()) {
                    ((AbstractC43313a) Watchers.m167205a(AbstractC43313a.class)).mo153312a(a, true);
                    return;
                }
                ((AbstractC43333t) Watchers.m167205a(AbstractC43333t.class)).onSharedAccountChange("" + System.currentTimeMillis(), a, decode.is_bind.booleanValue());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
