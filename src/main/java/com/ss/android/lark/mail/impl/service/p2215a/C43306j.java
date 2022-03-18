package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.UnreadCountColor;
import com.bytedance.lark.pb.email.v1.MailUpdateUnreadThreadCountPushResponse;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43314aa;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.service.a.j */
public class C43306j extends AbstractC43286a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_UNREAD_THREAD_COUNT_CHANGE_PUSH;
    }

    /* renamed from: a */
    public static BadgeCountState m172026a(UnreadCountColor unreadCountColor) {
        BadgeCountState badgeCountState = BadgeCountState.RED;
        if (unreadCountColor != null) {
            return BadgeCountState.fromValue(unreadCountColor.getValue());
        }
        return badgeCountState;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        int i;
        try {
            MailUpdateUnreadThreadCountPushResponse decode = MailUpdateUnreadThreadCountPushResponse.ADAPTER.decode(bArr);
            if (decode.count != null) {
                i = decode.count.intValue();
            } else {
                i = 0;
            }
            HashMap hashMap = new HashMap();
            if (decode.count_map != null) {
                for (String str2 : decode.count_map.keySet()) {
                    hashMap.put(str2, Integer.valueOf(decode.count_map.get(str2).intValue()));
                }
            }
            BadgeCountState a = m172026a(decode.tab_unread_color);
            HashMap hashMap2 = new HashMap();
            if (decode.color_map != null) {
                for (String str3 : decode.color_map.keySet()) {
                    hashMap2.put(str3, m172026a(decode.color_map.get(str3)));
                }
            }
            ((AbstractC43314aa) Watchers.m167205a(AbstractC43314aa.class)).mo150415a(i, a, hashMap, hashMap2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
