package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.C21445q;
import com.google.android.datatransport.runtime.p973c.C21426a;

public class JobInfoSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C21445q.m77586a(getApplicationContext());
        AbstractC21439l.AbstractC21440a a = AbstractC21439l.m77567d().mo72667a(string).mo72666a(C21426a.m77513a(i));
        if (string2 != null) {
            a.mo72668a(Base64.decode(string2, 0));
        }
        C21445q.m77585a().mo72696b().mo72775a(a.mo72669a(), i2, RunnableC21508f.m77796a(this, jobParameters));
        return true;
    }
}
