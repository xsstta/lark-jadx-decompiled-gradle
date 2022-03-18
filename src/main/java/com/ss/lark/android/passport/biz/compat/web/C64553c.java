package com.ss.lark.android.passport.biz.compat.web;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.c */
public class C64553c {

    /* renamed from: a */
    private static final PassportLog f162963a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    private static final String[] f162964b = {"tel", "voicemail", "sms", "smsto", "mms", "mmsto", "mailto", "geo", "zoomus"};

    /* renamed from: a */
    public boolean mo223263a(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = Uri.parse(str).getScheme();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : f162964b) {
            if (str3.equalsIgnoreCase(str2)) {
                return m253643b(context, str);
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m253643b(Context context, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveInfo = null;
            parseUri.setComponent(null);
            parseUri.addFlags(268435456);
            try {
                resolveInfo = context.getPackageManager().resolveActivity(parseUri, 0);
            } catch (Exception e) {
                f162963a.mo171462a("signinsdk_UrlInterceptor", "customUrlIntercepter resolveActivity exception", e);
            }
            if (resolveInfo == null) {
                PassportLog passportLog = f162963a;
                passportLog.mo171471d("signinsdk_UrlInterceptor", "customUrlIntercepter resolveActivity is null, url:" + str);
                return true;
            }
            try {
                context.startActivity(parseUri);
            } catch (Exception e2) {
                f162963a.mo171462a("signinsdk_UrlInterceptor", "customUrlIntercepter startActivity exception", e2);
            }
            return true;
        } catch (Exception e3) {
            f162963a.mo171462a("signinsdk_UrlInterceptor", "customUrlIntercepter parseUri exception", e3);
            return false;
        }
    }
}
