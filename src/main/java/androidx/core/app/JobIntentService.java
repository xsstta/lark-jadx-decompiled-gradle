package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    static final HashMap<ComponentName, AbstractC0724g> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0720d> mCompatQueue;
    AbstractC0724g mCompatWorkEnqueuer;
    AsyncTaskC0717a mCurProcessor;
    boolean mDestroyed;
    boolean mInterruptIfStopped;
    AbstractC0718b mJobImpl;
    boolean mStopped;

    /* access modifiers changed from: package-private */
    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$b */
    public interface AbstractC0718b {
        /* renamed from: a */
        IBinder mo4101a();

        /* renamed from: b */
        GenericWorkItem mo4102b();
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$d */
    public final class C0720d implements GenericWorkItem {

        /* renamed from: a */
        final Intent f3021a;

        /* renamed from: b */
        final int f3022b;

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.f3021a;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.f3022b);
        }

        C0720d(Intent intent, int i) {
            this.f3021a = intent;
            this.f3022b = i;
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    /* renamed from: androidx.core.app.JobIntentService$e  reason: invalid class name */
    static final class jobJobServiceEngineC0721e extends JobServiceEngine implements AbstractC0718b {

        /* renamed from: a */
        final JobIntentService f3024a;

        /* renamed from: b */
        final Object f3025b = new Object();

        /* renamed from: c */
        JobParameters f3026c;

        /* renamed from: androidx.core.app.JobIntentService$e$a */
        final class C0722a implements GenericWorkItem {

            /* renamed from: a */
            final JobWorkItem f3027a;

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.f3027a.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void complete() {
                synchronized (jobJobServiceEngineC0721e.this.f3025b) {
                    if (jobJobServiceEngineC0721e.this.f3026c != null) {
                        jobJobServiceEngineC0721e.this.f3026c.completeWork(this.f3027a);
                    }
                }
            }

            C0722a(JobWorkItem jobWorkItem) {
                this.f3027a = jobWorkItem;
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0718b
        /* renamed from: a */
        public IBinder mo4101a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3024a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.jobJobServiceEngineC0721e.C0722a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        @Override // androidx.core.app.JobIntentService.AbstractC0718b
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.GenericWorkItem mo4102b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3025b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3026c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f3024a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$e$a r0 = new androidx.core.app.JobIntentService$e$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.jobJobServiceEngineC0721e.mo4102b():androidx.core.app.JobIntentService$GenericWorkItem");
        }

        jobJobServiceEngineC0721e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3024a = jobIntentService;
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3026c = jobParameters;
            this.f3024a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f3024a.doStopCurrentWork();
            synchronized (this.f3025b) {
                this.f3026c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$c */
    public static final class C0719c extends AbstractC0724g {

        /* renamed from: a */
        boolean f3016a;

        /* renamed from: b */
        boolean f3017b;

        /* renamed from: f */
        private final Context f3018f;

        /* renamed from: g */
        private final PowerManager.WakeLock f3019g;

        /* renamed from: h */
        private final PowerManager.WakeLock f3020h;

        @Override // androidx.core.app.JobIntentService.AbstractC0724g
        /* renamed from: a */
        public void mo4103a() {
            synchronized (this) {
                this.f3016a = false;
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0724g
        /* renamed from: b */
        public void mo4105b() {
            synchronized (this) {
                if (!this.f3017b) {
                    this.f3017b = true;
                    this.f3020h.acquire(600000);
                    this.f3019g.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0724g
        /* renamed from: c */
        public void mo4106c() {
            synchronized (this) {
                if (this.f3017b) {
                    if (this.f3016a) {
                        this.f3019g.acquire(60000);
                    }
                    this.f3017b = false;
                    this.f3020h.release();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.JobIntentService.AbstractC0724g
        /* renamed from: a */
        public void mo4104a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3031c);
            if (this.f3018f.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3016a) {
                        this.f3016a = true;
                        if (!this.f3017b) {
                            this.f3019g.acquire(60000);
                        }
                    }
                }
            }
        }

        C0719c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3018f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3019g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3020h = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean doStopCurrentWork() {
        AsyncTaskC0717a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0720d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo4106c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public GenericWorkItem dequeueWork() {
        AbstractC0718b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo4102b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            return this.mCompatQueue.remove(0);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new jobJobServiceEngineC0721e(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    /* access modifiers changed from: package-private */
    public void processorFinished() {
        ArrayList<C0720d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<C0720d> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo4106c();
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class AsyncTaskC0717a extends AsyncTask<Void, Void, Void> {
        AsyncTaskC0717a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void r1) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r1) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.complete();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$g */
    public static abstract class AbstractC0724g {

        /* renamed from: c */
        final ComponentName f3031c;

        /* renamed from: d */
        boolean f3032d;

        /* renamed from: e */
        int f3033e;

        /* renamed from: a */
        public void mo4103a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4104a(Intent intent);

        /* renamed from: b */
        public void mo4105b() {
        }

        /* renamed from: c */
        public void mo4106c() {
        }

        AbstractC0724g(ComponentName componentName) {
            this.f3031c = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4109a(int i) {
            if (!this.f3032d) {
                this.f3032d = true;
                this.f3033e = i;
            } else if (this.f3033e != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f3033e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class C0723f extends AbstractC0724g {

        /* renamed from: a */
        private final JobInfo f3029a;

        /* renamed from: b */
        private final JobScheduler f3030b;

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.JobIntentService.AbstractC0724g
        /* renamed from: a */
        public void mo4104a(Intent intent) {
            this.f3030b.enqueue(this.f3029a, new JobWorkItem(intent));
        }

        C0723f(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo4109a(i);
            this.f3029a = new JobInfo.Builder(i, this.f3031c).setOverrideDeadline(0).build();
            this.f3030b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    public IBinder onBind(Intent intent) {
        AbstractC0718b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo4101a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new AsyncTaskC0717a();
            AbstractC0724g gVar = this.mCompatWorkEnqueuer;
            if (gVar != null && z) {
                gVar.mo4105b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo4103a();
        synchronized (this.mCompatQueue) {
            ArrayList<C0720d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0720d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                AbstractC0724g workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo4109a(i);
                workEnqueuer.mo4104a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static AbstractC0724g getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC0724g gVar;
        HashMap<ComponentName, AbstractC0724g> hashMap = sClassWorkEnqueuer;
        AbstractC0724g gVar2 = hashMap.get(componentName);
        if (gVar2 != null) {
            return gVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            gVar = new C0719c(context, componentName);
        } else if (z) {
            gVar = new C0723f(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        hashMap.put(componentName, gVar);
        return gVar;
    }
}
