package com.ss.android.lark.mm.module.list.widget;

import android.os.SystemClock;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/ProcessingProgressCalculatorImpl;", "Lcom/ss/android/lark/mm/module/list/widget/IProgressCalculator;", "initProgress", "", "rateInSecond", "(FF)V", "increasedProgress", "startTime", "", "Ljava/lang/Long;", "getProgress", "", "needsUpdate", "", "start", "", "updateProgress", "curTime", "updateProgressAndRate", "progress", "rate", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.widget.f */
public final class ProcessingProgressCalculatorImpl implements IProgressCalculator {

    /* renamed from: a */
    public static final Companion f117033a = new Companion(null);

    /* renamed from: b */
    private Long f117034b;

    /* renamed from: c */
    private float f117035c;

    /* renamed from: d */
    private float f117036d;

    /* renamed from: e */
    private float f117037e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/ProcessingProgressCalculatorImpl$Companion;", "", "()V", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public synchronized void mo163341a() {
        this.f117034b = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: b */
    public synchronized boolean mo163322b() {
        boolean z;
        if (mo163323c() < 99) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: c */
    public synchronized int mo163323c() {
        int min;
        min = Math.min((int) ((this.f117036d + this.f117035c) * ((float) 100)), 99);
        C45855f.m181663b("Progress", "[getProgress] " + this.f117036d + ' ' + this.f117035c + ' ' + min);
        return min;
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: a */
    public synchronized void mo163321a(long j) {
        float f;
        long j2;
        Long l = this.f117034b;
        if (l != null) {
            long j3 = -1;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = -1;
            }
            if (j2 <= j) {
                Long l2 = this.f117034b;
                if (l2 != null) {
                    j3 = l2.longValue();
                }
                f = (((float) (j - j3)) * this.f117037e) / ((float) 1000);
                this.f117035c = f;
            }
        }
        f = BitmapDescriptorFactory.HUE_RED;
        this.f117035c = f;
    }

    public ProcessingProgressCalculatorImpl(float f, float f2) {
        this.f117036d = f;
        this.f117037e = f2;
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: a */
    public synchronized void mo163320a(float f, float f2) {
        C45855f.m181663b("Progress", "[updateProgressAndRate]  before initProgress: " + this.f117036d + " increasedProgress: " + this.f117035c + " startTime: " + this.f117034b + " rateInSecond: " + this.f117037e);
        if (f > this.f117036d) {
            this.f117036d = f;
        }
        this.f117035c = BitmapDescriptorFactory.HUE_RED;
        this.f117034b = Long.valueOf(SystemClock.elapsedRealtime());
        this.f117037e = f2;
        C45855f.m181663b("Progress", "[updateProgressAndRate]  after initProgress: " + this.f117036d + " increasedProgress: " + this.f117035c + " startTime: " + this.f117034b + " rateInSecond: " + this.f117037e);
    }
}
