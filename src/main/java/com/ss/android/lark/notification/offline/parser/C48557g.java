package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;

/* renamed from: com.ss.android.lark.notification.offline.parser.g */
public class C48557g implements IOfflineExtraParser {

    /* renamed from: a */
    private int f122192a;

    /* renamed from: b */
    private String f122193b = "";

    /* renamed from: c */
    private String f122194c;

    /* renamed from: d */
    private AbstractC48407a.AbstractC48428p f122195d;

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        return this.f122192a;
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        Intent launchTodoTransPageIntent = this.f122195d.getLaunchTodoTransPageIntent(this.f122194c);
        launchTodoTransPageIntent.putExtra("user_id", this.f122193b);
        return launchTodoTransPageIntent;
    }

    public C48557g(OfflineNotice offlineNotice) {
        JSONObject businessInfo = offlineNotice.getBusinessInfo();
        try {
            this.f122192a = (((int) Long.parseLong(offlineNotice.getMsgSid())) % 10010) * 10010;
            this.f122193b = offlineNotice.getUserId();
        } catch (Exception unused) {
            this.f122192a = C26253ae.m94997a();
        }
        if (businessInfo != null) {
            this.f122194c = businessInfo.getString("extra_str");
        }
        this.f122195d = C48398a.m190922a().mo169349l();
    }
}
