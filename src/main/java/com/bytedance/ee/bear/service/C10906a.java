package com.bytedance.ee.bear.service;

import com.bytedance.ee.bear.service.base.C10916c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.service.a */
public class C10906a {
    /* renamed from: a */
    public static void m45376a(AbstractC10928d dVar, String str, String str2, long j, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", str);
        hashMap.put("process", C10916c.m45409b(null));
        hashMap.put("thread", Thread.currentThread().getName());
        hashMap.put("service", str2);
        hashMap.put("init_status", C10929e.f29412b.get() + String.valueOf(C10929e.f29413c.get()) + C10929e.f29414d.get());
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.toString(j));
        hashMap.put("error_message", str3);
        dVar.mo17007a("dev_performance_bear_service", hashMap);
    }
}
