package com.ss.android.lark.message;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.message.a */
public class C45277a {
    /* renamed from: a */
    public static String m179798a() {
        String format = String.format("https://%s/lark/card/api/bindTriggerCode", C45294c.m179871a().mo143891a(DomainSettings.Alias.OPEN_MSG_CARD));
        C53241h.m205898b("UrlConfig", "dynamicUrl:" + format);
        return format;
    }
}
