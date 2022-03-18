package com.ss.android.lark.process_statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.process_statistics.IProcessLauchReporter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.process_statistics.a */
public class C52238a implements IProcessLauchReporter {

    /* renamed from: a */
    private static AtomicBoolean f129585a = new AtomicBoolean(false);

    /* renamed from: b */
    private static Map<IProcessLauchReporter.BusinessType, Long> f129586b = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo178816a(IProcessLauchReporter.LaunchReason launchReason) {
        if (f129585a.compareAndSet(false, true)) {
            Log.m165389i("ProcessLaunchReporter", "launchReason=" + launchReason);
        }
    }

    /* renamed from: a */
    public void mo178815a(IProcessLauchReporter.BusinessType businessType, long j) {
        if (!f129586b.containsKey(businessType)) {
            synchronized (f129586b) {
                if (!f129586b.containsKey(businessType)) {
                    f129586b.put(businessType, Long.valueOf(j));
                    Log.m165389i("ProcessLaunchReporter", "BusinessType:" + businessType + " , UsageTimestamp=" + j);
                }
            }
        }
    }
}
