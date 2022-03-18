package com.ss.lark.android.passport.biz.utils;

import com.ss.android.lark.passport.infra.service.ServiceFinder;

/* renamed from: com.ss.lark.android.passport.biz.utils.e */
public class C65250e {
    /* renamed from: a */
    public static boolean m256140a() {
        boolean isFgEnable = ServiceFinder.m193748c().isFgEnable("suite_software_user_agreement");
        boolean isFgEnable2 = ServiceFinder.m193748c().isFgEnable("suite_software_privacy_agreement");
        if (!isFgEnable || !isFgEnable2) {
            return false;
        }
        return true;
    }
}
