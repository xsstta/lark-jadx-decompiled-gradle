package com.ss.android.lark.upgrade.silent;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.ss.android.lark.log.Log;

public class SilentUpgradeJobService extends JobService {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.upgrade.silent.SilentUpgradeJobService$a */
    public interface AbstractC57708a {
        /* renamed from: a */
        void mo195864a();
    }

    public boolean onStartJob(JobParameters jobParameters) {
        int jobId = jobParameters.getJobId();
        Log.m165379d("SilentUpgradeJobService", " start job " + jobId);
        C57709a.m224043a().mo195866a(jobId, null);
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        int jobId = jobParameters.getJobId();
        Log.m165379d("SilentUpgradeJobService", " stop job " + jobId);
        C57709a.m224043a().mo195865a(jobId);
        return false;
    }
}
