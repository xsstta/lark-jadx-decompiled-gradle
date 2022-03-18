package com.ss.android.lark.diskmanage.clean;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\rJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006J\u001c\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\rJ\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/diskmanage/clean/DiskCleanTaskManager;", "", "()V", "mBizTaskMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/diskmanage/Biz;", "Lcom/ss/android/lark/diskmanage/clean/IDiskCleanTask;", "mCleanExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getCanManualSize", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getDefaultAutoCleanRegistry", "", "Lcom/ss/android/lark/diskmanage/DefaultAutoCleanItem;", "manualClean", "", "register", "task", "remoteClean", "remoteConfig", "Lcom/ss/android/lark/diskmanage/RemoteConfig;", "unRegister", "Companion", "SingletonHolder", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.clean.a */
public final class DiskCleanTaskManager {

    /* renamed from: b */
    public static final Companion f94590b = new Companion(null);

    /* renamed from: a */
    public final ConcurrentHashMap<Biz, IDiskCleanTask> f94591a = new ConcurrentHashMap<>();

    /* renamed from: c */
    private final ExecutorService f94592c = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-disk-clean");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/diskmanage/clean/DiskCleanTaskManager$Companion;", "", "()V", "TAG", "", "getInstance", "Lcom/ss/android/lark/diskmanage/clean/DiskCleanTaskManager;", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.clean.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final DiskCleanTaskManager mo135593a() {
            return SingletonHolder.f94593a.mo135594a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/diskmanage/clean/DiskCleanTaskManager$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/diskmanage/clean/DiskCleanTaskManager;", "getInstance", "()Lcom/ss/android/lark/diskmanage/clean/DiskCleanTaskManager;", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.clean.a$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f94593a = new SingletonHolder();

        /* renamed from: b */
        private static final DiskCleanTaskManager f94594b = new DiskCleanTaskManager();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DiskCleanTaskManager mo135594a() {
            return f94594b;
        }
    }

    /* renamed from: a */
    public final synchronized List<DefaultAutoCleanItem> mo135588a() {
        ArrayList arrayList;
        List<DefaultAutoCleanItem> d;
        arrayList = new ArrayList();
        for (IDiskCleanTask cVar : this.f94591a.values()) {
            if (!(cVar.mo135615a() == Biz.DEFAULT || (d = cVar.mo135619d()) == null)) {
                arrayList.addAll(d);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.clean.a$c */
    public static final class RunnableC36814c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCleanTaskManager f94595a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f94596b;

        RunnableC36814c(DiskCleanTaskManager aVar, IGetDataCallback iGetDataCallback) {
            this.f94595a = aVar;
            this.f94596b = iGetDataCallback;
        }

        public final void run() {
            double d = 0.0d;
            for (IDiskCleanTask cVar : this.f94595a.f94591a.values()) {
                double c = cVar.mo135618c();
                d += c;
                Log.m165389i("DiskCleanTaskManager", "getCanManualSize, biz: " + cVar.mo135615a() + ", itemSize: " + c);
            }
            this.f94596b.onSuccess(Double.valueOf(d));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.clean.a$d */
    public static final class RunnableC36815d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCleanTaskManager f94597a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f94598b;

        RunnableC36815d(DiskCleanTaskManager aVar, IGetDataCallback iGetDataCallback) {
            this.f94597a = aVar;
            this.f94598b = iGetDataCallback;
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            for (IDiskCleanTask cVar : this.f94597a.f94591a.values()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                CleanResult b = cVar.mo135617b();
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                if (z || b.mo135503a()) {
                    z = true;
                } else {
                    z = false;
                }
                Log.m165389i("DiskCleanTaskManager", "manualClean, biz: " + cVar.mo135615a() + ", cost time: " + currentTimeMillis3 + ", result: " + b);
            }
            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
            Log.m165389i("DiskCleanTaskManager", "manualClean, total cost: " + currentTimeMillis4);
            this.f94598b.onSuccess(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.clean.a$e */
    public static final class RunnableC36816e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCleanTaskManager f94599a;

        /* renamed from: b */
        final /* synthetic */ RemoteConfig f94600b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f94601c;

        RunnableC36816e(DiskCleanTaskManager aVar, RemoteConfig dVar, IGetDataCallback iGetDataCallback) {
            this.f94599a = aVar;
            this.f94600b = dVar;
            this.f94601c = iGetDataCallback;
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            for (IDiskCleanTask cVar : this.f94599a.f94591a.values()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                CleanResult a = cVar.mo135616a(this.f94600b);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                if (z || a.mo135503a()) {
                    z = true;
                } else {
                    z = false;
                }
                Log.m165389i("DiskCleanTaskManager", "remoteClean, biz: " + cVar.mo135615a() + ", cost time: " + currentTimeMillis3 + ", result: " + a);
            }
            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
            Log.m165389i("DiskCleanTaskManager", "remoteClean, total cost: " + currentTimeMillis4);
            this.f94601c.onSuccess(Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final synchronized void mo135589a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f94592c.execute(new RunnableC36815d(this, iGetDataCallback));
    }

    /* renamed from: b */
    public final synchronized void mo135592b(IGetDataCallback<Double> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f94592c.execute(new RunnableC36814c(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final synchronized void mo135590a(IDiskCleanTask cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "task");
        this.f94591a.put(cVar.mo135615a(), cVar);
    }

    /* renamed from: a */
    public final void mo135591a(RemoteConfig dVar, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(dVar, "remoteConfig");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f94592c.execute(new RunnableC36816e(this, dVar, iGetDataCallback));
    }
}
