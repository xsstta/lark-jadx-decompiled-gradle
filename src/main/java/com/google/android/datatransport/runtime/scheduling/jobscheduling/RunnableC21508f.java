package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
final /* synthetic */ class RunnableC21508f implements Runnable {

    /* renamed from: a */
    private final JobInfoSchedulerService f52169a;

    /* renamed from: b */
    private final JobParameters f52170b;

    private RunnableC21508f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f52169a = jobInfoSchedulerService;
        this.f52170b = jobParameters;
    }

    /* renamed from: a */
    public static Runnable m77796a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new RunnableC21508f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        JobInfoSchedulerService.m77760a(this.f52169a, this.f52170b);
    }
}
