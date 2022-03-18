package com.ss.android.lark.dfcore.p1799a;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.morpheus.C20207c;
import com.bytedance.morpheus.core.C20208a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.NetworkUtils;
import com.ss.android.lark.dfcore.config.C36608a;
import com.ss.android.lark.dfcore.p1801c.AbstractC36602a;
import com.ss.android.lark.dfcore.p1801c.C36605c;
import com.ss.android.lark.dfcore.p1801c.C36607e;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.dfcore.a.a */
public class C36596a implements Handler.Callback {

    /* renamed from: a */
    private static volatile C36596a f94166a;

    /* renamed from: b */
    private static long f94167b;

    /* renamed from: c */
    private ConcurrentLinkedDeque<DynamicFeatureTask> f94168c = new ConcurrentLinkedDeque<>();

    /* renamed from: d */
    private ConcurrentLinkedQueue<DynamicFeatureTask> f94169d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private Handler f94170e;

    /* renamed from: f */
    private volatile DynamicFeatureTask f94171f;

    /* renamed from: a */
    public static HandlerThread m144375a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public void mo135009a(DynamicFeatureTask dynamicFeatureTask) {
        if (dynamicFeatureTask != null) {
            Log.m165379d("DFCore", "download: " + dynamicFeatureTask.mo135040a());
            if (dynamicFeatureTask.mo135057g() == 2) {
                m144390e(dynamicFeatureTask);
            } else {
                m144381a(dynamicFeatureTask, this.f94168c);
            }
            mo135011b();
        }
    }

    /* renamed from: a */
    public void mo135010a(DynamicFeatureTask dynamicFeatureTask, Exception exc) {
        AbstractC36602a b = C36605c.m144424a().mo135033b(dynamicFeatureTask.mo135040a());
        if (b != null) {
            C20208a aVar = new C20208a(dynamicFeatureTask.mo135050b(), C20207c.m73750b().mo68356b(), 6);
            if (exc instanceof SplitInstallException) {
                aVar.mo68386c(((SplitInstallException) exc).getErrorCode());
            } else {
                aVar.mo68386c(1);
            }
            aVar.mo68381a(exc);
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(aVar) {
                /* class com.ss.android.lark.dfcore.p1799a.$$Lambda$a$n26y7PdJ4uhDDtg_KvuDliSK70 */
                public final /* synthetic */ C20208a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C36596a.m144379a(AbstractC36602a.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo135011b() {
        m144377a(0);
    }

    /* renamed from: e */
    private void m144389e() {
        Log.m165383e("DFCore", "removeTryToCancelTaskMsg");
        this.f94170e.removeMessages(2);
    }

    /* renamed from: f */
    private DynamicFeatureTask m144391f() {
        return this.f94168c.poll();
    }

    /* renamed from: g */
    private DynamicFeatureTask m144393g() {
        return this.f94168c.peek();
    }

    /* renamed from: i */
    private void m144396i() {
        DynamicFeatureUtils.getSplitInstallManager().getSessionStates().addOnCompleteListener($$Lambda$a$NNhUxKXT0gdq3IeYmsRxS2kjtWY.INSTANCE);
    }

    /* renamed from: h */
    private static long m144395h() {
        long currentTimeMillis = System.currentTimeMillis() - f94167b;
        if (currentTimeMillis < C36608a.f94184a) {
            return C36608a.f94184a - currentTimeMillis;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m144397j() {
        Log.m165379d("DFCore", "tryExecuteNextTask");
        DynamicFeatureTask f = m144391f();
        if (f != null) {
            m144388d(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.dfcore.a.a$2 */
    public static /* synthetic */ class C365982 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94174a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.dfcore.config.ExistingTaskPolicy[] r0 = com.ss.android.lark.dfcore.config.ExistingTaskPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.dfcore.p1799a.C36596a.C365982.f94174a = r0
                com.ss.android.lark.dfcore.config.ExistingTaskPolicy r1 = com.ss.android.lark.dfcore.config.ExistingTaskPolicy.APPEND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.dfcore.p1799a.C36596a.C365982.f94174a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.dfcore.config.ExistingTaskPolicy r1 = com.ss.android.lark.dfcore.config.ExistingTaskPolicy.REPLACE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.dfcore.p1799a.C36596a.C365982.f94174a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.dfcore.config.ExistingTaskPolicy r1 = com.ss.android.lark.dfcore.config.ExistingTaskPolicy.KEEP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.dfcore.p1799a.C36596a.C365982.<clinit>():void");
        }
    }

    private C36596a() {
        HandlerThread a = m144375a("df_core_dispatcher");
        a.start();
        this.f94170e = new Handler(a.getLooper(), this);
    }

    /* renamed from: a */
    public static C36596a m144376a() {
        if (f94166a == null) {
            synchronized (C36596a.class) {
                if (f94166a == null) {
                    f94166a = new C36596a();
                }
            }
        }
        return f94166a;
    }

    /* renamed from: c */
    public synchronized void mo135013c() {
        Log.m165389i("DFCore", "emptyCurRunningTask, task: " + this.f94171f);
        if (this.f94171f != null) {
            this.f94171f.mo135065n();
            this.f94171f = null;
        }
    }

    /* renamed from: d */
    public static void m144387d() {
        StringBuilder sb = new StringBuilder("pendingQueue：[");
        Iterator<DynamicFeatureTask> it = f94166a.f94168c.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo135040a());
            sb.append(",");
        }
        sb.append("]\nfailedQueue：[");
        Iterator<DynamicFeatureTask> it2 = f94166a.f94169d.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().mo135040a());
            sb.append(",");
        }
        sb.append("]\n");
        Log.m165383e("DFCore", "[dump] queue: " + ((Object) sb));
    }

    /* renamed from: c */
    private void m144386c(DynamicFeatureTask dynamicFeatureTask) {
        m144380a(dynamicFeatureTask, 0);
    }

    /* renamed from: f */
    private void m144392f(DynamicFeatureTask dynamicFeatureTask) {
        m144385b(dynamicFeatureTask, this.f94168c);
        m144385b(dynamicFeatureTask, this.f94169d);
    }

    /* renamed from: e */
    private void m144390e(DynamicFeatureTask dynamicFeatureTask) {
        if (dynamicFeatureTask != null) {
            Log.m165379d("DFCore", "addToPendingQueueHead: " + dynamicFeatureTask.mo135040a());
            if (dynamicFeatureTask.equals(this.f94168c.peek())) {
                this.f94168c.poll();
            }
            this.f94168c.addFirst(dynamicFeatureTask);
        }
    }

    /* renamed from: a */
    private void m144377a(long j) {
        if (j == 0) {
            this.f94170e.sendEmptyMessage(1);
        } else {
            this.f94170e.sendEmptyMessageDelayed(1, j);
        }
    }

    /* renamed from: b */
    public void mo135012b(DynamicFeatureTask dynamicFeatureTask) {
        if (dynamicFeatureTask != null) {
            Log.m165379d("DFCore", "cancel: " + dynamicFeatureTask.mo135040a());
            dynamicFeatureTask.mo135049a(true);
            m144392f(dynamicFeatureTask);
            if (this.f94171f == null) {
                Log.m165383e("DFCore", "cancel: mCurrentRunningTask is null,  no need to cancel: " + dynamicFeatureTask);
            } else if (!dynamicFeatureTask.equals(this.f94171f)) {
                Log.m165383e("DFCore", "cancel: task is not running,  no need to cancel: " + dynamicFeatureTask);
            } else {
                m144389e();
                Log.m165383e("DFCore", "cancel: sendMsgTryToCancelTask:  " + dynamicFeatureTask);
                m144386c(dynamicFeatureTask);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m144378a(Task task) {
        if (task.isSuccessful()) {
            for (SplitInstallSessionState splitInstallSessionState : (List) task.getResult()) {
                if (splitInstallSessionState.status() == 2) {
                    Log.m165383e("DFCore", "current active downloads: " + splitInstallSessionState);
                }
            }
        }
    }

    /* renamed from: d */
    private void m144388d(final DynamicFeatureTask dynamicFeatureTask) {
        this.f94171f = dynamicFeatureTask;
        dynamicFeatureTask.mo135041a(System.currentTimeMillis());
        dynamicFeatureTask.mo135046a((DynamicFeatureTask.AbstractC36614a) new DynamicFeatureTask.AbstractC36614a() {
            /* class com.ss.android.lark.dfcore.p1799a.C36596a.C365971 */

            @Override // com.ss.android.lark.dfcore.task.DynamicFeatureTask.AbstractC36614a
            /* renamed from: a */
            public void mo135015a() {
                Log.m165383e("DFCore", "onDownloadTimeout: " + dynamicFeatureTask);
                C36596a.this.mo135010a(dynamicFeatureTask, new Exception("Task Download Timeout"));
            }
        });
        Log.m165389i("DFCore", "internalInstall: " + dynamicFeatureTask.mo135040a());
        String b = dynamicFeatureTask.mo135050b();
        if (DynamicFeatureUtils.isDynamicLanguageTask(b)) {
            SplitInstallManager splitInstallManager = DynamicFeatureUtils.getSplitInstallManager();
            Locale f = dynamicFeatureTask.mo135056f();
            splitInstallManager.startInstall(SplitInstallRequest.newBuilder().addLanguage(f).build()).addOnSuccessListener(new OnSuccessListener(f) {
                /* class com.ss.android.lark.dfcore.p1799a.$$Lambda$a$jd6_VwY0FznfFMOb4KkmmNmfNQ */
                public final /* synthetic */ Locale f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.google.android.play.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C36596a.m144383a(this.f$0, (Integer) obj);
                }
            }).addOnFailureListener(new OnFailureListener(dynamicFeatureTask) {
                /* class com.ss.android.lark.dfcore.p1799a.$$Lambda$a$8lr7BpsJe9ngpyBBOBiRhUbckw8 */
                public final /* synthetic */ DynamicFeatureTask f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.google.android.play.core.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C36596a.this.m144384b((C36596a) this.f$1, (DynamicFeatureTask) exc);
                }
            });
            return;
        }
        C20207c.m73748a(b);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m144394g(DynamicFeatureTask dynamicFeatureTask) {
        DynamicFeatureTask dynamicFeatureTask2 = this.f94171f;
        if (dynamicFeatureTask2 == null) {
            Log.m165383e("DFCore", "MSG_TRY_TO_CANCEL_TASK: mCurrentRunningTask is null,  no need to cancel ");
        } else if (!dynamicFeatureTask.equals(this.f94171f)) {
            Log.m165383e("DFCore", "MSG_TRY_TO_CANCEL_TASK: task is not running,  no need to cancel: " + dynamicFeatureTask);
        } else {
            int sessionId = DynamicFeatureUtils.getSessionId(dynamicFeatureTask2);
            if (sessionId < 0) {
                Log.m165389i("DFCore", "session id is " + sessionId + ", task may be has not been started, please be careful, " + dynamicFeatureTask2);
            }
            long k = dynamicFeatureTask2.mo135062k();
            if (k > 0) {
                Log.m165389i("DFCore", "MSG_TRY_TO_CANCEL_TASK: should sleep : " + k + ", task: " + dynamicFeatureTask2.mo135040a());
                m144380a(dynamicFeatureTask2, k);
                return;
            }
            int sessionId2 = DynamicFeatureUtils.getSessionId(dynamicFeatureTask2);
            if (sessionId2 < 0) {
                Log.m165383e("DFCore", "session id is " + sessionId2 + ", task may be has not been started, no need to cancel:" + dynamicFeatureTask2.mo135040a());
            } else if (this.f94171f != null && this.f94171f.equals(dynamicFeatureTask2)) {
                Log.m165389i("DFCore", "MSG_TRY_TO_CANCEL_TASK : " + dynamicFeatureTask2.mo135040a());
                f94167b = System.currentTimeMillis();
                DynamicFeatureUtils.getSplitInstallManager().cancelInstall(sessionId2);
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            DynamicFeatureTask g = m144393g();
            if (g == null) {
                Log.m165383e("DFCore", "MSG_TRY_TO_INSTALL_NEXT_TASK, next task is null ");
            } else if (g.mo135061j()) {
                m144385b(g, this.f94168c);
                Log.m165383e("DFCore", "MSG_TRY_TO_INSTALL_NEXT_TASK, task has been canceled : " + g);
            } else if (this.f94171f != null) {
                Log.m165383e("DFCore", "MSG_TRY_TO_INSTALL_NEXT_TASK, running task is :" + this.f94171f + ", next task :" + g);
            } else {
                long h = m144395h();
                if (h > 0) {
                    Log.m165389i("DFCore", "MSG_TRY_TO_INSTALL_NEXT_TASK, should sleep : " + h + ", task: " + g.mo135040a());
                    m144377a(h);
                } else {
                    CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
                        /* class com.ss.android.lark.dfcore.p1799a.$$Lambda$a$SoONHwucb8M7MVwkR2ZXr9c7mA */

                        public final void run() {
                            C36596a.this.m144397j();
                        }
                    });
                }
            }
        } else if (i == 2) {
            DynamicFeatureTask dynamicFeatureTask = (DynamicFeatureTask) message.getData().getParcelable("task");
            if (dynamicFeatureTask == null) {
                Log.m165383e("DFCore", "MSG_TRY_TO_CANCEL_TASK: task is null");
            } else {
                CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable(dynamicFeatureTask) {
                    /* class com.ss.android.lark.dfcore.p1799a.$$Lambda$a$eZOOj7ZapjTcHr3ZVy6GvBNnFY */
                    public final /* synthetic */ DynamicFeatureTask f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C36596a.this.m144394g(this.f$1);
                    }
                });
            }
        } else if (i == 3) {
            Log.m165379d("DFCore", "MSG_TRY_RESUME_TASK_EXPIRED");
            boolean z = false;
            Iterator<DynamicFeatureTask> it = this.f94169d.iterator();
            while (it.hasNext()) {
                DynamicFeatureTask next = it.next();
                if (next.mo135064m() && NetworkUtils.m94915b(LarkContext.getApplication())) {
                    Log.m165379d("DFCore", "move " + next.mo135040a() + " from FailedQueue to PendingQueue");
                    m144381a(next, this.f94168c);
                    this.f94169d.remove(next);
                    z = true;
                }
            }
            if (z) {
                mo135011b();
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m144382a(Exception exc) {
        Log.m165383e("DFCore", "handle actives sessions limit exceeded exception: " + exc);
        if ((exc instanceof SplitInstallException) && ((SplitInstallException) exc).getErrorCode() == -1) {
            Log.m165383e("DFCore", "check for actives downloads");
            m144396i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m144383a(Locale locale, Integer num) {
        C36607e.m144436a(locale.getLanguage(), num.intValue());
    }

    /* renamed from: b */
    private static void m144385b(DynamicFeatureTask dynamicFeatureTask, AbstractCollection<DynamicFeatureTask> abstractCollection) {
        if (dynamicFeatureTask != null && abstractCollection != null) {
            abstractCollection.remove(dynamicFeatureTask);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m144384b(DynamicFeatureTask dynamicFeatureTask, Exception exc) {
        m144382a(exc);
        mo135010a(dynamicFeatureTask, exc);
        Log.m165383e("DFCore", "OnFailureListener: " + exc.toString());
    }

    /* renamed from: a */
    private void m144380a(DynamicFeatureTask dynamicFeatureTask, long j) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        Bundle bundle = new Bundle();
        bundle.putParcelable("task", dynamicFeatureTask);
        obtain.setData(bundle);
        if (j == 0) {
            this.f94170e.sendMessage(obtain);
        } else {
            this.f94170e.sendMessageDelayed(obtain, j);
        }
    }

    /* renamed from: a */
    private void m144381a(DynamicFeatureTask dynamicFeatureTask, AbstractCollection<DynamicFeatureTask> abstractCollection) {
        if (dynamicFeatureTask != null) {
            if (abstractCollection.contains(dynamicFeatureTask)) {
                int i = C365982.f94174a[dynamicFeatureTask.mo135058h().mo135036a().ordinal()];
                if (i == 2) {
                    abstractCollection.remove(dynamicFeatureTask);
                } else if (i == 3) {
                    return;
                }
            }
            Log.m165379d("DFCore", "enqueueQueueWithPolicy: " + dynamicFeatureTask.mo135040a());
            abstractCollection.add(dynamicFeatureTask);
        }
    }
}
