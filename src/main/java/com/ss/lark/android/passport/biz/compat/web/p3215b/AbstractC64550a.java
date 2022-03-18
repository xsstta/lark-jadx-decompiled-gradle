package com.ss.lark.android.passport.biz.compat.web.p3215b;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.b.a */
public abstract class AbstractC64550a {
    /* renamed from: a */
    public abstract String mo223258a();

    /* renamed from: a */
    public abstract void mo223260a(String str);

    /* renamed from: a */
    public void mo223259a(Uri uri) {
        if (uri != null) {
            if (TextUtils.isEmpty(mo223258a())) {
                PassportLog.f123351c.mo171474a().mo171471d("BaseUrlParamHandler", "paramName is empty");
                return;
            }
            String str = null;
            try {
                str = uri.getQueryParameter(mo223258a());
            } catch (Throwable th) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171462a("BaseUrlParamHandler", "handle uri failed: " + uri.toString(), th);
            }
            if (!TextUtils.isEmpty(str)) {
                mo223260a(str);
            }
        }
    }
}
