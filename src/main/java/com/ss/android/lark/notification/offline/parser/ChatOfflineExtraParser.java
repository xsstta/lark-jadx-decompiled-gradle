package com.ss.android.lark.notification.offline.parser;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26253ae;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ChatOfflineExtraParser implements IOfflineExtraParser {

    /* renamed from: a */
    private final JSONObject f122152a;

    /* renamed from: b */
    private final String f122153b;

    /* renamed from: c */
    private final String f122154c;

    /* renamed from: d */
    private final String f122155d;

    /* renamed from: e */
    private final String f122156e;

    /* renamed from: f */
    private final int f122157f;

    /* renamed from: g */
    private final AbstractC48407a.AbstractC48425m f122158g;

    /* renamed from: h */
    private final AbstractC48407a.AbstractC48421j f122159h;

    /* renamed from: i */
    private final AbstractC48407a.AbstractC48414f f122160i;

    /* renamed from: j */
    private final Context f122161j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direct {
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: a */
    public int mo169635a() {
        try {
            if (!TextUtils.isEmpty(this.f122153b)) {
                return (int) ((Long.parseLong(this.f122153b) * 30001) % 30001);
            }
            if (!TextUtils.isEmpty(this.f122155d)) {
                return Integer.parseInt(this.f122155d);
            }
            return C26253ae.m94997a();
        } catch (Exception unused) {
            return C26253ae.m94997a();
        }
    }

    @Override // com.ss.android.lark.notification.offline.parser.IOfflineExtraParser
    /* renamed from: b */
    public Intent mo169636b() {
        JSONObject jSONObject = this.f122152a;
        if (jSONObject == null) {
            Intent a = this.f122158g.mo169396a(this.f122161j, this.f122159h.mo169389b(), this.f122159h.mo169387a(new Bundle()));
            Log.m165389i("OfflineNotice", "receive offline notice parse Chat: go to Main");
            return a;
        }
        int intValue = jSONObject.getIntValue("position");
        int i = this.f122157f;
        Bundle bundle = null;
        if (i == 2) {
            bundle = this.f122160i.mo169368a(this.f122153b, -1, (AbstractC48407a.AbstractC48412d) null);
        } else if (i == 3) {
            bundle = this.f122160i.mo169368a(this.f122153b, intValue, (AbstractC48407a.AbstractC48412d) null);
        }
        if (bundle == null) {
            Bundle a2 = this.f122159h.mo169387a(new Bundle());
            a2.putString("user_id", this.f122156e);
            Log.m165389i("OfflineNotice", "receive offline notice parse Chat: go to Main");
            return this.f122158g.mo169396a(this.f122161j, this.f122159h.mo169389b(), a2);
        }
        bundle.putString("user_id", this.f122156e);
        Bundle a3 = this.f122160i.mo169367a(bundle);
        Log.m165389i("OfflineNotice", "receive offline notice parse Thread messageId: " + this.f122154c);
        return this.f122158g.mo169395a(this.f122161j, a3, 335544320);
    }

    public ChatOfflineExtraParser(OfflineNotice offlineNotice) {
        JSONObject businessInfo = offlineNotice.getBusinessInfo();
        this.f122152a = businessInfo;
        this.f122155d = offlineNotice.getMsgSid();
        this.f122156e = offlineNotice.getUserId();
        if (businessInfo == null) {
            this.f122153b = "";
            this.f122154c = "";
            this.f122157f = 1;
        } else {
            long longValue = businessInfo.getLongValue("chat_id");
            if (longValue != 0) {
                this.f122153b = Long.toString(longValue);
            } else {
                this.f122153b = "";
            }
            long longValue2 = businessInfo.getLongValue("message_id");
            if (longValue2 != 0) {
                this.f122154c = Long.toString(longValue2);
            } else {
                this.f122154c = "";
            }
            this.f122157f = businessInfo.getInteger("direct").intValue();
        }
        this.f122158g = C48398a.m190922a().mo169340c();
        this.f122159h = C48398a.m190922a().mo169344g();
        this.f122160i = C48398a.m190922a().mo169343f();
        this.f122161j = C48398a.m190922a().mo169335a();
    }
}
