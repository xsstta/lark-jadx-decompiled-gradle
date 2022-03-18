package com.ss.android.lark.mail.impl.service.p2215a.p2216a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailTabAndSettingStatusPushResponse;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43319f;
import java.io.IOException;

/* renamed from: com.ss.android.lark.mail.impl.service.a.a.e */
public class C43292e extends AbstractC43286a {
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_TAB_AND_SETTING_PUSH;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            MailTabAndSettingStatusPushResponse decode = MailTabAndSettingStatusPushResponse.ADAPTER.decode(bArr);
            if (decode.tab_and_setting_status != null) {
                ((AbstractC43319f) Watchers.m167205a(AbstractC43319f.class)).mo154986a(decode.tab_and_setting_status.tab_visible.booleanValue(), decode.tab_and_setting_status.setting_visible.booleanValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
