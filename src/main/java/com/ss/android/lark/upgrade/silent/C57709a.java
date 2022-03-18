package com.ss.android.lark.upgrade.silent;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.impl.C57642b;
import com.ss.android.lark.upgrade.silent.SilentUpgradeJobService;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.upgrade.silent.a */
public class C57709a {

    /* renamed from: a */
    private Context f142192a;

    /* renamed from: b */
    private JobScheduler f142193b;

    /* renamed from: c */
    private Map<Integer, SilentUpgradeJobService.AbstractC57708a> f142194c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.upgrade.silent.a$a */
    public static class C57711a {

        /* renamed from: a */
        public static final C57709a f142195a = new C57709a();
    }

    /* renamed from: a */
    public static C57709a m224043a() {
        return C57711a.f142195a;
    }

    private C57709a() {
        this.f142194c = new HashMap();
        Context a = C57607a.m223662a().mo177704a();
        this.f142192a = a;
        this.f142193b = (JobScheduler) a.getSystemService("jobscheduler");
    }

    /* renamed from: a */
    public void mo195865a(int i) {
        Log.m165389i("SilentUpgradeManager", "triggerStopJob");
        this.f142194c.remove(Integer.valueOf(i));
        C57642b.m223804a().mo195726b(i);
    }

    /* renamed from: b */
    private JobInfo m224044b(int i) {
        JobInfo.Builder builder = new JobInfo.Builder(i, new ComponentName(this.f142192a.getPackageName(), SilentUpgradeJobService.class.getName()));
        builder.setMinimumLatency(5000);
        builder.setRequiredNetworkType(2);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setRequiresBatteryNotLow(true);
            builder.setRequiresStorageNotLow(true);
        }
        return builder.build();
    }

    /* renamed from: a */
    public void mo195867a(String str) {
        String str2;
        int hashCode = str.hashCode();
        if (this.f142194c.containsKey(Integer.valueOf(hashCode))) {
            Log.m165397w("SilentUpgradeManager", "requestSilentJob already contains jobId return");
            return;
        }
        this.f142194c.put(Integer.valueOf(hashCode), null);
        int schedule = this.f142193b.schedule(m224044b(hashCode));
        StringBuilder sb = new StringBuilder();
        sb.append("JobScheduler.schedule result: ");
        sb.append(schedule);
        if (schedule <= 0) {
            str2 = "request wrong";
        } else {
            str2 = "";
        }
        sb.append(str2);
        Log.m165389i("SilentUpgradeManager", sb.toString());
    }

    /* renamed from: b */
    public void mo195868b(String str) {
        int hashCode = str.hashCode();
        if (!this.f142194c.containsKey(Integer.valueOf(hashCode))) {
            Log.m165397w("SilentUpgradeManager", "reportDone not contains jobId return");
            return;
        }
        SilentUpgradeJobService.AbstractC57708a aVar = this.f142194c.get(Integer.valueOf(hashCode));
        if (aVar != null) {
            aVar.mo195864a();
        }
    }

    /* renamed from: a */
    public void mo195866a(int i, SilentUpgradeJobService.AbstractC57708a aVar) {
        Log.m165389i("SilentUpgradeManager", "triggerStartJob");
        this.f142194c.put(Integer.valueOf(i), aVar);
        C57642b.m223804a().mo195710a(i);
    }
}
