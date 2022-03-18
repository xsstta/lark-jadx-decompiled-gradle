package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class as implements ServiceConnection {

    /* renamed from: a */
    private final Context f56425a;

    /* renamed from: b */
    private final Intent f56426b;

    /* renamed from: c */
    private final ScheduledExecutorService f56427c;

    /* renamed from: d */
    private final Queue<C22822a> f56428d;

    /* renamed from: e */
    private aq f56429e;

    /* renamed from: f */
    private boolean f56430f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.as$a */
    public static class C22822a {

        /* renamed from: a */
        final Intent f56431a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f56432b = new TaskCompletionSource<>();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo79349b() {
            this.f56432b.trySetResult(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Task<Void> mo79347a() {
            return this.f56432b.getTask();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final /* synthetic */ void mo79350c() {
            String action = this.f56431a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseInstanceId", sb.toString());
            mo79349b();
        }

        C22822a(Intent intent) {
            this.f56431a = intent;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79348a(ScheduledExecutorService scheduledExecutorService) {
            mo79347a().addOnCompleteListener(scheduledExecutorService, new au(scheduledExecutorService.schedule(new RunnableC22823at(this), 4000, TimeUnit.MILLISECONDS)));
        }
    }

    /* renamed from: c */
    private void m82932c() {
        while (!this.f56428d.isEmpty()) {
            this.f56428d.poll().mo79349b();
        }
    }

    /* renamed from: a */
    private synchronized void m82930a() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f56428d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            aq aqVar = this.f56429e;
            if (aqVar == null || !aqVar.isBinderAlive()) {
                m82931b();
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
            }
            this.f56429e.mo79342a(this.f56428d.poll());
        }
    }

    /* renamed from: b */
    private void m82931b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f56430f);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        if (!this.f56430f) {
            this.f56430f = true;
            try {
                if (!ConnectionTracker.getInstance().bindService(this.f56425a, this.f56426b, this, 65)) {
                    Log.e("FirebaseInstanceId", "binding to the service failed");
                    this.f56430f = false;
                    m82932c();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseInstanceId", "Exception while binding the service", e);
            }
        }
    }

    /* renamed from: a */
    public synchronized Task<Void> mo79344a(Intent intent) {
        C22822a aVar;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C22822a(intent);
        aVar.mo79348a(this.f56427c);
        this.f56428d.add(aVar);
        m82930a();
        return aVar.mo79347a();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        m82930a();
    }

    public as(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f56430f = false;
        if (!(iBinder instanceof aq)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            m82932c();
            return;
        }
        this.f56429e = (aq) iBinder;
        m82930a();
    }

    as(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f56428d = new ArrayDeque();
        this.f56430f = false;
        Context applicationContext = context.getApplicationContext();
        this.f56425a = applicationContext;
        this.f56426b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f56427c = scheduledExecutorService;
    }
}
