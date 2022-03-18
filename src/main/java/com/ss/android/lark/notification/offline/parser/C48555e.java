package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2386h.C48535d;

/* renamed from: com.ss.android.lark.notification.offline.parser.e */
public class C48555e implements IOfflineExtraParser {

    /* renamed from: a */
    private int f122176a;

    /* renamed from: b */
    private JSONObject f122177b;

    /* renamed from: c */
    private AbstractC48407a.AbstractC48426n f122178c;

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        return this.f122176a;
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        JSONObject jSONObject = this.f122177b;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("cli_app_id");
        String string2 = this.f122177b.getString("i64_app_id");
        String string3 = this.f122177b.getString("android_schema");
        int intValue = this.f122177b.getInteger("last_notification_seq_id").intValue();
        String string4 = this.f122177b.getString("open_app_chat_feed_id");
        Log.m165379d("OpenAppChatOfflineExtraParser", String.format("openAppChat args cliAppId=%1s androidSchema=%2s noticeSeqId=%3s feedId=%4s", string, string3, Integer.valueOf(intValue), string4));
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string3)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(string3).buildUpon();
        buildUpon.appendQueryParameter("open_app_chat_feed_id", string4);
        String uri = buildUpon.build().toString();
        C48535d.m191354a().mo169623a(string);
        return this.f122178c.mo169399a(string, string2, uri, intValue);
    }

    public C48555e(OfflineNotice offlineNotice) {
        this.f122177b = offlineNotice.getBusinessInfo();
        try {
            this.f122176a = Integer.parseInt(offlineNotice.getMsgSid());
        } catch (Exception e) {
            Log.m165384e("OpenAppChatOfflineExtraParser", "parse sid failed", e);
            this.f122176a = C26253ae.m94997a();
        }
        this.f122178c = C48398a.m190922a().mo169347j();
    }
}
