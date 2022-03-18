package com.ss.android.vc.apm;

import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.ar;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/apm/VCOnlineApmCollector;", "", "()V", "TAG", "", "enabled", "", "mCpuCollector", "Lcom/ss/android/vc/apm/IApmCollector;", "mListener", "Lcom/ss/android/vc/apm/VCOnlineApmCollector$OnOnlineApmCollectorListener;", "mMemCollector", "mScheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "runnable", "Ljava/lang/Runnable;", "compute", "", "end", "start", "listener", "OnOnlineApmCollectorListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.b.j */
public final class VCOnlineApmCollector {

    /* renamed from: a */
    private final String f151810a = "VCOnlineApmCollector";

    /* renamed from: b */
    private AbstractC60659a f151811b;

    /* renamed from: c */
    private AbstractC60659a f151812c;

    /* renamed from: d */
    private volatile ScheduledExecutorService f151813d;

    /* renamed from: e */
    private OnOnlineApmCollectorListener f151814e;

    /* renamed from: f */
    private final Runnable f151815f = new RunnableC60687b(this);

    /* renamed from: g */
    private boolean f151816g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/apm/VCOnlineApmCollector$OnOnlineApmCollectorListener;", "", "onSample", "", "info", "Lcom/ss/android/vc/apm/VCApmSampleInfo;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.b.j$a */
    public interface OnOnlineApmCollectorListener {
        void onSample(C60680d dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.b.j$b */
    static final class RunnableC60687b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VCOnlineApmCollector f151817a;

        RunnableC60687b(VCOnlineApmCollector jVar) {
            this.f151817a = jVar;
        }

        public final void run() {
            this.f151817a.mo208249a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo208249a() {
        C60674c cVar;
        C60674c cVar2;
        AbstractC60659a aVar = this.f151811b;
        if (aVar != null) {
            cVar = aVar.mo208203a();
        } else {
            cVar = null;
        }
        AbstractC60659a aVar2 = this.f151812c;
        if (aVar2 != null) {
            cVar2 = aVar2.mo208203a();
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            C60680d dVar = new C60680d(cVar, (VCApmSampleMemInfo) cVar2, null, null);
            OnOnlineApmCollectorListener aVar3 = this.f151814e;
            if (aVar3 != null) {
                aVar3.onSample(dVar);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.apm.VCApmSampleMemInfo");
        }
    }

    /* renamed from: b */
    public final synchronized void mo208251b() {
        if (this.f151816g && ar.m236694a() != null && !C26284k.m95185a(ar.m236694a())) {
            if (!DesktopUtil.m144307b()) {
                ScheduledExecutorService scheduledExecutorService = this.f151813d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                this.f151814e = null;
                this.f151812c = null;
                this.f151811b = null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo208250a(OnOnlineApmCollectorListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (this.f151816g && ar.m236694a() != null && !C26284k.m95185a(ar.m236694a())) {
            if (!DesktopUtil.m144307b()) {
                this.f151811b = new C60683f();
                this.f151812c = new C60684g();
                this.f151814e = aVar;
                if (this.f151813d == null) {
                    this.f151813d = C60735ab.m236007b("VC-ApmCollector");
                    Unit unit = Unit.INSTANCE;
                }
                ScheduledExecutorService scheduledExecutorService = this.f151813d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.scheduleWithFixedDelay(this.f151815f, 3, 6, TimeUnit.SECONDS);
                }
            }
        }
    }
}
