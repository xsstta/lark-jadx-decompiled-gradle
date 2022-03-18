package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.ap;
import com.google.firebase.iid.aq;
import java.util.concurrent.ExecutorService;

public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    final ExecutorService executor = C22896f.m83172d();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* access modifiers changed from: protected */
    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            ap.m82926b(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    public Task<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new RunnableC22893c(this, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new aq(new aq.AbstractC22821a() {
                /* class com.google.firebase.messaging.EnhancedIntentService.C228841 */

                @Override // com.google.firebase.iid.aq.AbstractC22821a
                /* renamed from: a */
                public Task<Void> mo79343a(Intent intent) {
                    return EnhancedIntentService.this.processIntent(intent);
                }
            });
        }
        return this.binder;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, Task task) {
        finishTask(intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(ExecutorC22894d.f56601a, new C22895e(this, intent));
        return 3;
    }
}
