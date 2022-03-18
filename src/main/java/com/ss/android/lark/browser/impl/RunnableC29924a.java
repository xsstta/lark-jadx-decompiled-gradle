package com.ss.android.lark.browser.impl;

import com.larksuite.framework.utils.aq;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29929a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29931b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.browser.impl.a */
public class RunnableC29924a implements Runnable {

    /* renamed from: a */
    private String f74651a;

    /* renamed from: b */
    private long f74652b;

    public void run() {
        Log.m165389i("ClearAllCookiesFinishedRunnable", "ClearAllCookiesFinishedRunnable, enter run");
        C29638a.m109622a().getDocsDependency().mo107665b();
        C29927b.m110661e();
        long currentTimeMillis = System.currentTimeMillis() - this.f74652b;
        Log.m165389i("ClearAllCookiesFinishedRunnable", "ClearAllCookiesFinishedRunnable, cookie clear finish , cost " + currentTimeMillis);
        C57744a.m224104a().putBoolean(C29927b.m110662f(), true);
        C29929a.m110673a(C29931b.f74688s).addCategoryValue("host", aq.m95059b(this.f74651a)).addCategoryValue("check_clean_duration", Long.valueOf(currentTimeMillis)).flush();
    }

    public RunnableC29924a(String str, long j) {
        this.f74651a = str;
        this.f74652b = j;
    }
}
