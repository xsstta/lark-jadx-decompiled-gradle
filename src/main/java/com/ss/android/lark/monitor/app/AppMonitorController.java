package com.ss.android.lark.monitor.app;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\rH\u0002J\u001e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\nJ\b\u0010#\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\nH\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/monitor/app/AppMonitorController;", "", "appContext", "Landroid/content/Context;", "logDir", "", "processName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "mContext", "mLastAppFront", "", "mPlugins", "", "Lcom/ss/android/lark/monitor/app/IAppPlugin;", "mProcessName", "mRunnable", "Ljava/lang/Runnable;", "mScheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "convertProcessName", "onAppFrontStateChanged", "", "isAppFront", "lastActivityName", "curActivityName", "onAppFrontStateChangedInner", "registerPlugin", "appPlugin", "setCpuExceptionStandard", "low", "", "middle", "high", "setVcStatus", "bInUsing", "triggerOneTimeTask", "triggerScheduleTask", "start", "Companion", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.monitor.app.a */
public final class AppMonitorController {

    /* renamed from: b */
    public static final Companion f121347b = new Companion(null);

    /* renamed from: a */
    public final List<IAppPlugin> f121348a = new ArrayList();

    /* renamed from: c */
    private ScheduledFuture<?> f121349c;

    /* renamed from: d */
    private final Context f121350d;

    /* renamed from: e */
    private final String f121351e;

    /* renamed from: f */
    private Runnable f121352f;

    /* renamed from: g */
    private boolean f121353g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/monitor/app/AppMonitorController$Companion;", "", "()V", "MMAP_FILE_PATH", "", "PERIOD", "", "TAG", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.a$b */
    public static final class RunnableC48216b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppMonitorController f121354a;

        /* renamed from: b */
        final /* synthetic */ boolean f121355b;

        /* renamed from: c */
        final /* synthetic */ String f121356c;

        /* renamed from: d */
        final /* synthetic */ String f121357d;

        RunnableC48216b(AppMonitorController aVar, boolean z, String str, String str2) {
            this.f121354a = aVar;
            this.f121355b = z;
            this.f121356c = str;
            this.f121357d = str2;
        }

        public final void run() {
            this.f121354a.mo168723b(this.f121355b, this.f121356c, this.f121357d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.a$c */
    public static final class RunnableC48217c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppMonitorController f121358a;

        /* renamed from: b */
        final /* synthetic */ boolean f121359b;

        RunnableC48217c(AppMonitorController aVar, boolean z) {
            this.f121358a = aVar;
            this.f121359b = z;
        }

        public final void run() {
            Iterator<T> it = this.f121358a.f121348a.iterator();
            while (it.hasNext()) {
                it.next().mo168701b(this.f121359b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.a$d */
    public static final class RunnableC48218d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppMonitorController f121360a;

        /* renamed from: b */
        final /* synthetic */ boolean f121361b;

        RunnableC48218d(AppMonitorController aVar, boolean z) {
            this.f121360a = aVar;
            this.f121361b = z;
        }

        public final void run() {
            Iterator<T> it = this.f121360a.f121348a.iterator();
            while (it.hasNext()) {
                it.next().mo168699a(this.f121361b);
            }
        }
    }

    /* renamed from: a */
    private final void m190280a() {
        boolean equals = TextUtils.equals("main", this.f121351e);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC48217c(this, equals));
        Log.m165379d("AppMonitorController", "triggerOneTimeTask");
    }

    /* renamed from: a */
    private final void m190281a(IAppPlugin cVar) {
        this.f121348a.add(cVar);
    }

    /* renamed from: a */
    public final void mo168721a(boolean z) {
        Log.m165379d("AppMonitorController", "setVcStatus " + z);
        NativeMonitor.getInstance().setVcStatus(z);
    }

    /* renamed from: a */
    private final String m190279a(String str) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return "main";
        }
        int i = indexOf$default + 1;
        if (str != null) {
            String substring = str.substring(i);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    private final void m190282b(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        if (z) {
            ScheduledFuture<?> scheduledFuture2 = this.f121349c;
            if (scheduledFuture2 != null) {
                if (scheduledFuture2 == null) {
                    Intrinsics.throwNpe();
                }
                if (!scheduledFuture2.isCancelled()) {
                    return;
                }
            }
            boolean equals = TextUtils.equals("main", this.f121351e);
            long elapsedRealtime = ((long) 35000) - (SystemClock.elapsedRealtime() % ((long) 30000));
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            this.f121349c = coreThreadPool.getScheduleThreadPool().scheduleAtFixedRate(new RunnableC48218d(this, equals), elapsedRealtime, 30000, TimeUnit.MILLISECONDS);
        } else {
            ScheduledFuture<?> scheduledFuture3 = this.f121349c;
            if (scheduledFuture3 != null) {
                if (scheduledFuture3 == null) {
                    Intrinsics.throwNpe();
                }
                if (!scheduledFuture3.isCancelled() && (scheduledFuture = this.f121349c) != null) {
                    scheduledFuture.cancel(true);
                }
            }
            this.f121349c = null;
        }
        Log.m165379d("AppMonitorController", "triggerScheduleTask:" + z);
    }

    /* renamed from: b */
    public final void mo168723b(boolean z, String str, String str2) {
        Log.m165379d("AppMonitorController", "onAppFrontStateChanged isAppFront " + z);
        NativeMonitor.getInstance().setAppStatus(z);
        if (z) {
            m190280a();
            m190282b(true);
            return;
        }
        m190282b(false);
    }

    public AppMonitorController(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "appContext");
        Intrinsics.checkParameterIsNotNull(str, "logDir");
        Intrinsics.checkParameterIsNotNull(str2, "processName");
        this.f121350d = context;
        String a = m190279a(str2);
        this.f121351e = a;
        Log.m165379d("AppMonitorController", "init " + a);
        NativeMonitor instance = NativeMonitor.getInstance();
        instance.init(str + "lark_app_mmap", a);
        m190281a(new CpuAppPlugin());
    }

    /* renamed from: a */
    public final void mo168720a(long j, long j2, long j3) {
        Log.m165379d("AppMonitorController", "setCpuExceptionStandard " + j + ' ' + j2 + ' ' + j3);
        if (j != 50 || j2 != 80 || j3 != 100) {
            NativeMonitor.getInstance().setCpuExceptionStandard(j, j2, j3);
        }
    }

    /* renamed from: a */
    public final void mo168722a(boolean z, String str, String str2) {
        if (this.f121353g != z) {
            this.f121353g = z;
            if (this.f121352f != null) {
                Handler backgroundHandler = CoreThreadPool.getBackgroundHandler();
                Runnable runnable = this.f121352f;
                if (runnable != null) {
                    backgroundHandler.removeCallbacks(runnable);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Runnable");
                }
            }
            Log.m165379d("AppMonitorController", "onAppFrontStateChanged remove duplicate runnable");
        }
        this.f121352f = new RunnableC48216b(this, z, str, str2);
        Handler backgroundHandler2 = CoreThreadPool.getBackgroundHandler();
        Runnable runnable2 = this.f121352f;
        if (runnable2 != null) {
            backgroundHandler2.postDelayed(runnable2, 50);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Runnable");
    }
}
