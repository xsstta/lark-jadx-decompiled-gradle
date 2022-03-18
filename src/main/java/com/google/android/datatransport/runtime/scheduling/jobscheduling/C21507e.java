package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.p971a.C21399a;
import com.google.android.datatransport.runtime.p973c.C21426a;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
public class C21507e implements AbstractC21520r {

    /* renamed from: a */
    private final Context f52166a;

    /* renamed from: b */
    private final AbstractC21461c f52167b;

    /* renamed from: c */
    private final SchedulerConfig f52168c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo72772a(AbstractC21439l lVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f52166a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(lVar.mo72661a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C21426a.m77512a(lVar.mo72663c())).array());
        if (lVar.mo72662b() != null) {
            adler32.update(lVar.mo72662b());
        }
        return (int) adler32.getValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r
    /* renamed from: a */
    public void mo72763a(AbstractC21439l lVar, int i) {
        ComponentName componentName = new ComponentName(this.f52166a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f52166a.getSystemService("jobscheduler");
        int a = mo72772a(lVar);
        if (m77793a(jobScheduler, a, i)) {
            C21399a.m77445a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long a2 = this.f52167b.mo72726a(lVar);
        JobInfo.Builder a3 = this.f52168c.mo72750a(new JobInfo.Builder(a, componentName), lVar.mo72663c(), a2, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", lVar.mo72661a());
        persistableBundle.putInt("priority", C21426a.m77512a(lVar.mo72663c()));
        if (lVar.mo72662b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(lVar.mo72662b(), 0));
        }
        a3.setExtras(persistableBundle);
        C21399a.m77447a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", lVar, Integer.valueOf(a), Long.valueOf(this.f52168c.mo72749a(lVar.mo72663c(), a2, i)), Long.valueOf(a2), Integer.valueOf(i));
        jobScheduler.schedule(a3.build());
    }

    public C21507e(Context context, AbstractC21461c cVar, SchedulerConfig schedulerConfig) {
        this.f52166a = context;
        this.f52167b = cVar;
        this.f52168c = schedulerConfig;
    }

    /* renamed from: a */
    private boolean m77793a(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
