package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.p971a.C21399a;
import com.google.android.datatransport.runtime.p973c.C21426a;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.time.AbstractC21523a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public class C21501a implements AbstractC21520r {

    /* renamed from: a */
    private final Context f52152a;

    /* renamed from: b */
    private final AbstractC21461c f52153b;

    /* renamed from: c */
    private AlarmManager f52154c;

    /* renamed from: d */
    private final SchedulerConfig f52155d;

    /* renamed from: e */
    private final AbstractC21523a f52156e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo72764a(Intent intent) {
        if (PendingIntent.getBroadcast(this.f52152a, 0, intent, 536870912) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r
    /* renamed from: a */
    public void mo72763a(AbstractC21439l lVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", lVar.mo72661a());
        builder.appendQueryParameter("priority", String.valueOf(C21426a.m77512a(lVar.mo72663c())));
        if (lVar.mo72662b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(lVar.mo72662b(), 0));
        }
        Intent intent = new Intent(this.f52152a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (mo72764a(intent)) {
            C21399a.m77445a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long a = this.f52153b.mo72726a(lVar);
        long a2 = this.f52155d.mo72749a(lVar.mo72663c(), a, i);
        C21399a.m77447a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", lVar, Long.valueOf(a2), Long.valueOf(a), Integer.valueOf(i));
        this.f52154c.set(3, this.f52156e.mo72782a() + a2, PendingIntent.getBroadcast(this.f52152a, 0, intent, 0));
    }

    public C21501a(Context context, AbstractC21461c cVar, AbstractC21523a aVar, SchedulerConfig schedulerConfig) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, schedulerConfig);
    }

    C21501a(Context context, AbstractC21461c cVar, AlarmManager alarmManager, AbstractC21523a aVar, SchedulerConfig schedulerConfig) {
        this.f52152a = context;
        this.f52153b = cVar;
        this.f52154c = alarmManager;
        this.f52156e = aVar;
        this.f52155d = schedulerConfig;
    }
}
