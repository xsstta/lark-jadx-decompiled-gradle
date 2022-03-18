package com.ss.android.lark.mail.impl.service.p2215a.p2216a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailAccountPushResponse;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import java.io.IOException;

/* renamed from: com.ss.android.lark.mail.impl.service.a.a.a */
public class C43288a extends AbstractC43286a {
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_ACCOUNT_PUSH;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        C42093e a;
        try {
            MailAccountPushResponse decode = MailAccountPushResponse.ADAPTER.decode(bArr);
            if (decode != null && decode.account != null && (a = C42130j.m168150a().mo152082a(decode.account)) != null) {
                ((AbstractC43313a) Watchers.m167205a(AbstractC43313a.class)).mo153312a(a, decode.rust_push.booleanValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
