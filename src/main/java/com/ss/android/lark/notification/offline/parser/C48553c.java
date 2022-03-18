package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;

/* renamed from: com.ss.android.lark.notification.offline.parser.c */
public class C48553c implements IOfflineExtraParser {

    /* renamed from: a */
    private int f122171a;

    /* renamed from: b */
    private String f122172b = "";

    /* renamed from: c */
    private String f122173c = "";

    /* renamed from: d */
    private AbstractC48407a.AbstractC48424l f122174d;

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        return this.f122171a;
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        Intent a = this.f122174d.mo169394a(this.f122173c);
        a.putExtra("user_id", this.f122172b);
        return a;
    }

    public C48553c(OfflineNotice offlineNotice) {
        JSONObject businessInfo = offlineNotice.getBusinessInfo();
        try {
            this.f122171a = (int) ((Long.parseLong(offlineNotice.getMsgSid()) % 10006) * 10006);
            this.f122172b = offlineNotice.getUserId();
        } catch (Exception e) {
            Log.m165383e("MailOfflineExtraParser", "parse Sid error: " + e.getMessage());
            this.f122171a = C26253ae.m94997a();
        }
        if (businessInfo != null) {
            this.f122173c = businessInfo.getString("extra_str");
        }
        this.f122174d = C48398a.m190922a().mo169351n();
    }
}
