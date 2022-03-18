package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.text.TextUtils;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.h */
public class C64521h {
    /* renamed from: a */
    public static String m253487a(String str, RsaInfo rsaInfo) {
        if (rsaInfo == null || TextUtils.isEmpty(rsaInfo.publicKey) || TextUtils.isEmpty(rsaInfo.rsaToken)) {
            return str;
        }
        try {
            return C49160a.m193858b(rsaInfo.publicKey, str);
        } catch (Exception e) {
            PassportLog.f123351c.mo171474a().mo171471d("RsaPwdRequestBuilder", "encrypt error: rsaToken=" + rsaInfo.rsaToken + "；public_key=" + rsaInfo.publicKey + "；error=" + e.toString());
            return str;
        }
    }
}
