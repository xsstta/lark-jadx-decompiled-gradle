package com.ss.android.lark.rust.track.monitor;

import com.bytedance.apm.block.p136a.AbstractC2834a;
import com.bytedance.apm.block.p136a.C2848f;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.rust.track.monitor.MonitorConfigParser;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor;", "Lcom/bytedance/apm/block/trace/AbsTracer;", "()V", "frameConfig", "Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "mFrameCostList", "Ljava/util/LinkedList;", "", "mFrameExecutorService", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "calculateBlockLevel", "unit", "Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor$DropFrameUnit;", "collectAndCalculate", "", "callback", "Lcom/ss/android/lark/rust/track/monitor/IBlockLevelCallback;", "doFrame", "focusedActivityName", "", "lastFrameNanos", "", "frameNanos", "getDroppedCount", "cost", "frameIntervalMillis", "", "start", "stop", "Companion", "DropFrameUnit", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.monitor.b */
public final class DropFrameMonitor extends AbstractC2834a {

    /* renamed from: b */
    public static final Companion f131509b = new Companion(null);

    /* renamed from: a */
    public LinkedList<Integer> f131510a = new LinkedList<>();

    /* renamed from: c */
    private final ExecutorService f131511c = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("push_monitor_frame");

    /* renamed from: d */
    private final MonitorConfigParser.GearConfig f131512d = MonitorConfigParser.INSTANCE.getFrameConfig();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor$Companion;", "", "()V", "DROP_FRAME_MONITOR", "", "LIMIT_DROP_FRAME", "", "MAX_LIST_SIZE", "OFFSET_TO_MS", "RATE_FROM_SETTING", "TAG", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor$DropFrameUnit;", "", "allDroppedCount", "", "dropLevel", "", "totalDuration", "isFrameFrozen", "", "(I[IIZ)V", "getAllDroppedCount", "()I", "getDropLevel", "()[I", "()Z", "getTotalDuration", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.b$b */
    public static final class DropFrameUnit {

        /* renamed from: a */
        private final int f131513a;

        /* renamed from: b */
        private final int[] f131514b;

        /* renamed from: c */
        private final int f131515c;

        /* renamed from: d */
        private final boolean f131516d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DropFrameUnit) {
                    DropFrameUnit bVar = (DropFrameUnit) obj;
                    if ((this.f131513a == bVar.f131513a) && Intrinsics.areEqual(this.f131514b, bVar.f131514b)) {
                        if (this.f131515c == bVar.f131515c) {
                            if (this.f131516d == bVar.f131516d) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f131513a * 31;
            int[] iArr = this.f131514b;
            int hashCode = (((i + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31) + this.f131515c) * 31;
            boolean z = this.f131516d;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public String toString() {
            return "DropFrameUnit(allDroppedCount=" + this.f131513a + ", dropLevel=" + Arrays.toString(this.f131514b) + ", totalDuration=" + this.f131515c + ", isFrameFrozen=" + this.f131516d + ")";
        }

        /* renamed from: a */
        public final int mo181654a() {
            return this.f131513a;
        }

        /* renamed from: b */
        public final int[] mo181655b() {
            return this.f131514b;
        }

        /* renamed from: c */
        public final boolean mo181656c() {
            return this.f131516d;
        }

        public DropFrameUnit(int i, int[] iArr, int i2, boolean z) {
            Intrinsics.checkParameterIsNotNull(iArr, "dropLevel");
            this.f131513a = i;
            this.f131514b = iArr;
            this.f131515c = i2;
            this.f131516d = z;
        }
    }

    /* renamed from: b */
    public final void mo181652b() {
        C2848f.m12008a().mo12246a(true);
        C2848f.m12008a().mo12243a(this);
    }

    /* renamed from: c */
    public final void mo181653c() {
        C2848f.m12008a().mo12249b(this);
        this.f131510a = new LinkedList<>();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.b$c */
    public static final class RunnableC53191c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DropFrameMonitor f131517a;

        /* renamed from: b */
        final /* synthetic */ IBlockLevelCallback f131518b;

        RunnableC53191c(DropFrameMonitor bVar, IBlockLevelCallback cVar) {
            this.f131517a = bVar;
            this.f131518b = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
            if (com.bytedance.apm.util.C3122i.m13009a((java.util.List<?>) r0.element) == false) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            r1 = com.bytedance.apm.util.C3118f.m12988a();
            r2 = com.bytedance.apm.util.C3118f.m12991b() - 1;
            r5 = new int[((r2 + 0) + 1)];
            r0 = r0.element.iterator();
            r6 = 0;
            r7 = 0;
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
            if (r0.hasNext() == false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
            r9 = ((java.lang.Number) r0.next()).intValue();
            r10 = r12.f131517a.mo181649a(r9, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
            if (r10 <= 0) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
            r6 = r6 + r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
            if (r10 <= 120) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
            r10 = java.lang.Math.max(java.lang.Math.min(r10, r2), 0);
            r5[r10] = r5[r10] + 1;
            r7 = r7 + (r9 / 100);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
            r12.f131518b.mo181593a(r12.f131517a.mo181650a(new com.ss.android.lark.rust.track.monitor.DropFrameMonitor.DropFrameUnit(r6, r5, r7, r8)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
            com.ss.android.lark.log.Log.m165383e("DropFrameMonitor", r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.rust.track.monitor.DropFrameMonitor.RunnableC53191c.run():void");
        }
    }

    /* renamed from: a */
    public final void mo181651a(IBlockLevelCallback cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        this.f131511c.execute(new RunnableC53191c(this, cVar));
    }

    /* renamed from: a */
    public final int mo181650a(DropFrameUnit bVar) {
        float f;
        float f2;
        float f3;
        float f4;
        if (bVar.mo181656c()) {
            return 4;
        }
        int length = bVar.mo181655b().length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i >= 10) {
                i2 += bVar.mo181655b()[i];
            }
            i++;
        }
        MonitorConfigParser.GearConfig gearConfig = this.f131512d;
        if (gearConfig != null) {
            f = gearConfig.getSlightlyLevel();
        } else {
            f = 0.02f;
        }
        MonitorConfigParser.GearConfig gearConfig2 = this.f131512d;
        if (gearConfig2 != null) {
            f2 = gearConfig2.getModeratelyLevel();
        } else {
            f2 = 0.05f;
        }
        MonitorConfigParser.GearConfig gearConfig3 = this.f131512d;
        if (gearConfig3 != null) {
            f3 = gearConfig3.getSeverelyLevel();
        } else {
            f3 = 0.1f;
        }
        MonitorConfigParser.GearConfig gearConfig4 = this.f131512d;
        if (gearConfig4 != null) {
            f4 = gearConfig4.getFatallyLevel();
        } else {
            f4 = 0.2f;
        }
        float a = ((float) i2) / ((float) bVar.mo181654a());
        if (a < f) {
            return 0;
        }
        if (a >= f && a < f2) {
            return 1;
        }
        if (a >= f2 && a < f3) {
            return 2;
        }
        if (a >= f3 && a < f4) {
            return 3;
        }
        if (a >= f4) {
            return 4;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo181649a(int i, float f) {
        return i / ((int) (f * ((float) 100)));
    }

    @Override // com.bytedance.apm.block.AbstractC2833a
    /* renamed from: a */
    public void mo12215a(String str, long j, long j2) {
        Log.m165379d("DropFrameMonitor", "start to capture drop frame status");
        long j3 = j2 - j;
        if (j3 >= 0) {
            synchronized (this) {
                if (this.f131510a.size() > 20000) {
                    this.f131510a.poll();
                }
                this.f131510a.add(Integer.valueOf(((int) j3) * 100));
            }
        }
    }
}
