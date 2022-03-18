package com.tt.refer.impl.business.container;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.abs.container.background.IForeBackgroundService;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0017J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0017J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tt/refer/impl/business/container/ForeBackgroundService;", "Lcom/tt/refer/abs/container/background/IForeBackgroundService;", "timeLimitMill", "", "(J)V", "beginBackgroundTime", "foreBackgroundListenerList", "", "Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "isForeground", "", "mainHandler", "Landroid/os/Handler;", "notifyBackgroundOverLimitTimeRunnable", "Ljava/lang/Runnable;", "clearListener", "", "getStayBackgroundTime", "isBackground", "onBackGround", "onBackgroundOverLimitTime", "onForeGround", "registerForeBackgroundListener", "listener", "unregisterForeBackgroundListener", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.c.b */
public final class ForeBackgroundService implements IForeBackgroundService {

    /* renamed from: b */
    public static final Companion f171019b = new Companion(null);

    /* renamed from: a */
    public final List<IForeBackgroundService.ForeBackgroundListener> f171020a;

    /* renamed from: c */
    private boolean f171021c;

    /* renamed from: d */
    private long f171022d;

    /* renamed from: e */
    private final Runnable f171023e;

    /* renamed from: f */
    private final Handler f171024f;

    /* renamed from: g */
    private final long f171025g;

    public ForeBackgroundService() {
        this(0, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tt/refer/impl/business/container/ForeBackgroundService$Companion;", "", "()V", "BACKGROUND_NO_TIME_LIMIT", "", "BEGIN_BACKGROUND_TIME_WHEN_FOREGROUND", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.c.b$b */
    static final class RunnableC67902b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ForeBackgroundService f171026a;

        RunnableC67902b(ForeBackgroundService bVar) {
            this.f171026a = bVar;
        }

        public final void run() {
            this.f171026a.mo235565b();
        }
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: d */
    public boolean mo235074d() {
        return !this.f171021c;
    }

    /* renamed from: b */
    public final void mo235565b() {
        AppBrandLogger.m52830i("ForeBackgroundService", "onBackgroundOverLimitTime");
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: e */
    public void mo235075e() {
        synchronized (this.f171020a) {
            this.f171020a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: f */
    private final long m264210f() {
        if (this.f171022d == -1) {
            return 0;
        }
        return System.currentTimeMillis() - this.f171022d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.c.b$c */
    public static final class RunnableC67903c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ForeBackgroundService f171027a;

        /* renamed from: b */
        final /* synthetic */ long f171028b;

        RunnableC67903c(ForeBackgroundService bVar, long j) {
            this.f171027a = bVar;
            this.f171028b = j;
        }

        public final void run() {
            synchronized (this.f171027a.f171020a) {
                AppBrandLogger.m52830i("ForeBackgroundService", "notifyOnBackground");
                Iterator<T> it = this.f171027a.f171020a.iterator();
                while (it.hasNext()) {
                    it.next().mo87718a(this.f171028b);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.c.b$d */
    public static final class RunnableC67904d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ForeBackgroundService f171029a;

        RunnableC67904d(ForeBackgroundService bVar) {
            this.f171029a = bVar;
        }

        public final void run() {
            synchronized (this.f171029a.f171020a) {
                AppBrandLogger.m52830i("ForeBackgroundService", "notifyOnForeground");
                Iterator<T> it = this.f171029a.f171020a.iterator();
                while (it.hasNext()) {
                    it.next().mo87717a();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: a */
    public void mo235070a() {
        AppBrandLogger.m52830i("ForeBackgroundService", "onForeGround");
        this.f171021c = true;
        this.f171022d = -1;
        this.f171024f.removeCallbacks(this.f171023e);
        C67866g.m264032c(new RunnableC67904d(this));
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: c */
    public void mo235073c() {
        AppBrandLogger.m52830i("ForeBackgroundService", "onBackGround");
        this.f171021c = false;
        this.f171022d = System.currentTimeMillis();
        long j = this.f171025g;
        if (j > 0) {
            this.f171024f.postDelayed(this.f171023e, j);
        }
        C67866g.m264032c(new RunnableC67903c(this, m264210f()));
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: a */
    public void mo235071a(IForeBackgroundService.ForeBackgroundListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        synchronized (this.f171020a) {
            if (!this.f171020a.contains(aVar)) {
                this.f171020a.add(aVar);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.tt.refer.abs.container.background.IForeBackgroundService
    /* renamed from: b */
    public void mo235072b(IForeBackgroundService.ForeBackgroundListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        synchronized (this.f171020a) {
            this.f171020a.remove(aVar);
        }
    }

    public ForeBackgroundService(long j) {
        this.f171025g = j;
        this.f171022d = -1;
        this.f171023e = new RunnableC67902b(this);
        this.f171024f = new Handler(Looper.getMainLooper());
        this.f171020a = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ForeBackgroundService(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : j);
    }
}
