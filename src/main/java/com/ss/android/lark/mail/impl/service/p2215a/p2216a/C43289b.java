package com.ss.android.lark.mail.impl.service.p2215a.p2216a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailOAuthStatusPushResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43324k;
import java.io.IOException;

/* renamed from: com.ss.android.lark.mail.impl.service.a.a.b */
public class C43289b extends AbstractC43286a {
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.PUSH_MAIL_OAUTH_STATUS;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            MailOAuthStatusPushResponse decode = MailOAuthStatusPushResponse.ADAPTER.decode(bArr);
            if (decode.status != null) {
                C42093e a = C42130j.m168150a().mo152082a(decode.account);
                Log.m165389i("OauthStatusPushProcessor", "status change:" + decode.status);
                ((AbstractC43324k) Watchers.m167205a(AbstractC43324k.class)).onOAuthChange(decode.status, decode.email_address, a);
                if (a != null) {
                    ((AbstractC43313a) Watchers.m167205a(AbstractC43313a.class)).mo153312a(a, false);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
