package com.ss.lark.android.passport.biz.utils;

import com.ss.android.lark.passport.infra.service.ServiceFinder;

/* renamed from: com.ss.lark.android.passport.biz.utils.d */
public class C65249d {
    /* renamed from: a */
    public static int m256139a() {
        if (ServiceFinder.m193748c().isLogin()) {
            return 1;
        }
        return 0;
    }
}
