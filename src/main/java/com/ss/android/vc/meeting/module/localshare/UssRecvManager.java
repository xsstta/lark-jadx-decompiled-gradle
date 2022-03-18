package com.ss.android.vc.meeting.module.localshare;

import android.os.Handler;
import com.ss.android.usssendengine.UssSend;
import com.ss.android.vc.statistics.appreciable.UssRecvAppreciable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\tJ\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R0\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/UssRecvManager;", "Lcom/ss/android/usssendengine/UssSend$OnUssRecvListener;", "()V", "handler", "Landroid/os/Handler;", "isProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onUssRecvDataCallback", "Lkotlin/Function2;", "", "", "", "getOnUssRecvDataCallback", "()Lkotlin/jvm/functions/Function2;", "setOnUssRecvDataCallback", "(Lkotlin/jvm/functions/Function2;)V", "timingTickTask", "Ljava/lang/Runnable;", "ussSend", "Lcom/ss/android/usssendengine/UssSend;", "onRecvData", "errorCode", "", "shareKey", "startUssRecv", "stopUssRecv", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.l */
public final class UssRecvManager implements UssSend.AbstractC60634a {

    /* renamed from: d */
    public static final Lazy f156194d = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C62183b.INSTANCE);

    /* renamed from: e */
    public static final Companion f156195e = new Companion(null);

    /* renamed from: a */
    public final Handler f156196a;

    /* renamed from: b */
    public final UssSend f156197b;

    /* renamed from: c */
    public final AtomicBoolean f156198c;

    /* renamed from: f */
    private Function2<? super Boolean, ? super String, Unit> f156199f;

    /* renamed from: g */
    private final Runnable f156200g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/UssRecvManager$Companion;", "", "()V", "USS_RECV_TICK_INTERVAL", "", "USS_RECV_TIMEOUT", "", "instance", "Lcom/ss/android/vc/meeting/module/localshare/UssRecvManager;", "getInstance", "()Lcom/ss/android/vc/meeting/module/localshare/UssRecvManager;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.l$a */
    public static final class Companion {
        /* renamed from: a */
        public final UssRecvManager mo215103a() {
            Lazy lazy = UssRecvManager.f156194d;
            Companion aVar = UssRecvManager.f156195e;
            return (UssRecvManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.k<java.lang.Boolean, java.lang.String, kotlin.Unit> */
    /* renamed from: a */
    public final Function2<Boolean, String, Unit> mo215098a() {
        return this.f156199f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/meeting/module/localshare/UssRecvManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.l$b */
    static final class C62183b extends Lambda implements Function0<UssRecvManager> {
        public static final C62183b INSTANCE = new C62183b();

        C62183b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UssRecvManager invoke() {
            return new UssRecvManager(null);
        }
    }

    /* renamed from: d */
    public final boolean mo215102d() {
        return this.f156198c.get();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.l$e */
    public static final class RunnableC62186e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UssRecvManager f156205a;

        RunnableC62186e(UssRecvManager lVar) {
            this.f156205a = lVar;
        }

        public final void run() {
            this.f156205a.f156198c.set(false);
            this.f156205a.f156197b.stopUssRecv();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.l$d */
    static final class RunnableC62185d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UssRecvManager f156204a;

        RunnableC62185d(UssRecvManager lVar) {
            this.f156204a = lVar;
        }

        public final void run() {
            this.f156204a.f156198c.compareAndSet(false, true);
            this.f156204a.f156197b.startUssRecv(4000, this.f156204a);
            UssRecvAppreciable.f160800b.mo220220a().mo220218a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/meeting/module/localshare/UssRecvManager$timingTickTask$1", "Ljava/lang/Runnable;", "run", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.l$f */
    public static final class RunnableC62187f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UssRecvManager f156206a;

        public void run() {
            this.f156206a.f156197b.tickUssSend();
            this.f156206a.f156196a.postDelayed(this, 50);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC62187f(UssRecvManager lVar) {
            this.f156206a = lVar;
        }
    }

    /* renamed from: c */
    public final void mo215101c() {
        this.f156196a.removeCallbacksAndMessages(null);
        this.f156196a.post(new RunnableC62186e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.l$c */
    static final class RunnableC62184c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UssRecvManager f156201a;

        /* renamed from: b */
        final /* synthetic */ int f156202b;

        /* renamed from: c */
        final /* synthetic */ String f156203c;

        RunnableC62184c(UssRecvManager lVar, int i, String str) {
            this.f156201a = lVar;
            this.f156202b = i;
            this.f156203c = str;
        }

        public final void run() {
            boolean z;
            Function2<Boolean, String, Unit> a = this.f156201a.mo215098a();
            if (a != null) {
                if (this.f156202b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                a.invoke(Boolean.valueOf(z), this.f156203c);
            }
            if (this.f156202b != 0) {
                UssRecvAppreciable.f160800b.mo220220a().mo220219a(false);
            } else {
                UssRecvAppreciable.f160800b.mo220220a().mo220219a(true);
            }
        }
    }

    private UssRecvManager() {
        this.f156196a = new Handler();
        this.f156197b = new UssSend();
        this.f156198c = new AtomicBoolean(false);
        this.f156200g = new RunnableC62187f(this);
    }

    /* renamed from: b */
    public final void mo215100b() {
        if (!this.f156198c.get()) {
            mo215101c();
            this.f156196a.post(new RunnableC62185d(this));
            this.f156196a.postDelayed(this.f156200g, 50);
        }
    }

    public /* synthetic */ UssRecvManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo215099a(Function2<? super Boolean, ? super String, Unit> kVar) {
        this.f156199f = kVar;
    }

    @Override // com.ss.android.usssendengine.UssSend.AbstractC60634a
    /* renamed from: a */
    public void mo208127a(int i, String str) {
        mo215101c();
        this.f156196a.post(new RunnableC62184c(this, i, str));
    }
}
