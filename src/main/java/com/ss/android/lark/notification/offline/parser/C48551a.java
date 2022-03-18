package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;

/* renamed from: com.ss.android.lark.notification.offline.parser.a */
public class C48551a implements IOfflineExtraParser {

    /* renamed from: a */
    private int f122162a;

    /* renamed from: b */
    private String f122163b = "";

    /* renamed from: c */
    private String f122164c;

    /* renamed from: d */
    private AbstractC48407a.AbstractC48413e f122165d;

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        return this.f122162a;
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        Intent a = this.f122165d.mo169366a(this.f122164c);
        a.putExtra("user_id", this.f122163b);
        return a;
    }

    public C48551a(OfflineNotice offlineNotice) {
        JSONObject businessInfo = offlineNotice.getBusinessInfo();
        try {
            this.f122162a = (((int) Long.parseLong(offlineNotice.getMsgSid())) % 10005) * 10005;
            this.f122163b = offlineNotice.getUserId();
        } catch (Exception unused) {
            this.f122162a = C26253ae.m94997a();
        }
        if (businessInfo != null) {
            this.f122164c = businessInfo.getString("extra_str");
        }
        this.f122165d = C48398a.m190922a().mo169348k();
    }
}
