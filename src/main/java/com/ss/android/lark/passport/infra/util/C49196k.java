package com.ss.android.lark.passport.infra.util;

import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.android.lark.passport.infra.util.k */
public class C49196k {
    /* renamed from: a */
    public static void m193953a(HttpHeaders httpHeaders, String str, String str2) {
        if (httpHeaders != null && str != null) {
            if (str2 != null) {
                try {
                    httpHeaders.put(str, str2);
                } catch (Exception e) {
                    PassportLog.f123351c.mo171474a().mo171471d("HttpUtils", e.toString());
                }
            } else {
                httpHeaders.remove(str);
            }
        }
    }
}
