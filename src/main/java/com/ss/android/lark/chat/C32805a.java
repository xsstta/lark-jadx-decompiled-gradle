package com.ss.android.lark.chat;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.sdk.C53241h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.chat.a */
public class C32805a {

    /* renamed from: a */
    private final Set<String> f84181a = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.ss.android.lark.chat.a$a */
    private static class C32806a {

        /* renamed from: a */
        public static final C32805a f84182a = new C32805a();
    }

    /* renamed from: a */
    public static C32805a m125891a() {
        return C32806a.f84182a;
    }

    /* renamed from: b */
    public void mo120931b() {
        this.f84181a.clear();
    }

    /* renamed from: a */
    public void mo120930a(Message message) {
        if (message != null && C34438a.m133579a(message)) {
            long a = C29990c.m110930b().mo134596x().mo134462a();
            long burnTime = message.getBurnTime();
            String displayName = TimeZone.getDefault().getDisplayName(false, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("logMsgBurned --> ");
            sb.append(" msgId = " + message.getId() + " , isBurned = " + message.isBurned() + " ,ntpTime = " + a + " ,burnTime = " + burnTime + " ,msgCreateTime = " + (message.getCreateTime() * 1000) + " ,calLeftTime = " + (burnTime - a) + " ,burnLife = " + ((long) (message.getBurnLife() * 1000)) + " ,timezone = " + displayName + " ,local with ntp offset = " + (System.currentTimeMillis() - a));
            C53241h.m205898b("secret_chat_tag", sb.toString());
        }
    }

    /* renamed from: a */
    public void mo120929a(int i, long j, long j2, long j3, String str) {
        long j4 = j - j3;
        long j5 = j2 * 1000;
        int i2 = i * 1000;
        if (j4 > ((long) i2) && !this.f84181a.contains(str)) {
            this.f84181a.add(str);
            String displayName = TimeZone.getDefault().getDisplayName(false, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("logSecretMsgTimeAbnormal --> ");
            sb.append(" msgId = " + str + " ,ntpTime = " + j3 + " ,burnTime = " + j + " ,msgCreateTime = " + j5 + " ,calLeftTime = " + j4 + " ,burnLife = " + i2 + " ,timezone = " + displayName + " ,local with ntp offset = " + (System.currentTimeMillis() - j3));
            C53241h.m205898b("secret_chat_tag", sb.toString());
        }
    }
}
