package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;

/* renamed from: com.ss.android.lark.notification.offline.parser.b */
public class C48552b implements IOfflineExtraParser {

    /* renamed from: a */
    private AbstractC48407a.AbstractC48419h f122166a;

    /* renamed from: b */
    private String f122167b = "";

    /* renamed from: c */
    private int f122168c;

    /* renamed from: d */
    private JSONObject f122169d;

    /* renamed from: e */
    private int f122170e;

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        return this.f122168c;
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        if (this.f122170e == 4) {
            return m191406c();
        }
        return m191407d();
    }

    /* renamed from: c */
    private Intent m191406c() {
        JSONObject jSONObject = this.f122169d;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("extra_str");
        if (TextUtils.isEmpty(string)) {
            Log.m165383e("DocOfflineExtraParser", "notification doc pass through data is null");
            return null;
        }
        Intent a = this.f122166a.mo169384a(string);
        a.putExtra("user_id", this.f122167b);
        return a;
    }

    /* renamed from: d */
    private Intent m191407d() {
        try {
            JSONObject parseObject = JSON.parseObject(this.f122169d.getString("extra_str"));
            if (!"PUSH_DOC_FEED".equals(parseObject.getString(ShareHitPoint.f121869d))) {
                return null;
            }
            JSONObject jSONObject = parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String string = jSONObject.getString("msg_id");
            String string2 = jSONObject.getString("feed_id");
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    return this.f122166a.mo169385a(string2, string);
                }
            }
            return null;
        } catch (Exception e) {
            Log.m165383e("DocOfflineExtraParser", "getOpenDocDetailIntent: mBusinessInfo = " + this.f122169d + " exception = " + e);
            return null;
        }
    }

    public C48552b(OfflineNotice offlineNotice) {
        this.f122169d = offlineNotice.getBusinessInfo();
        this.f122167b = offlineNotice.getUserId();
        try {
            int intValue = this.f122169d.getInteger("direct").intValue();
            this.f122170e = intValue;
            if (intValue == 0) {
                this.f122170e = 1;
            }
        } catch (Exception unused) {
            this.f122170e = 1;
        }
        try {
            this.f122168c = (((int) Long.parseLong(offlineNotice.getMsgSid())) % 10004) * 10004;
        } catch (Exception unused2) {
            this.f122168c = C26253ae.m94997a();
        }
        this.f122166a = C48398a.m190922a().mo169346i();
    }
}
