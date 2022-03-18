package com.ss.android.lark.mm.module.list.widget;

import android.os.SystemClock;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.list.widget.IProgressCalculator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/CompleteProgressCalculatorImpl;", "Lcom/ss/android/lark/mm/module/list/widget/IProgressCalculator;", "initProgress", "", "rateInSecondBelow80", "(FF)V", "increasedProgress", "rateInSecond", "startTime", "", "Ljava/lang/Long;", "getProgress", "", "needsUpdate", "", "start", "", "updateProgress", "curTime", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.widget.a */
public final class CompleteProgressCalculatorImpl implements IProgressCalculator {

    /* renamed from: a */
    private Long f117005a;

    /* renamed from: b */
    private float f117006b;

    /* renamed from: c */
    private final float f117007c;

    /* renamed from: d */
    private final float f117008d;

    /* renamed from: a */
    public synchronized void mo163319a() {
        this.f117005a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: b */
    public synchronized boolean mo163322b() {
        boolean z;
        if (mo163323c() < 100) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: c */
    public synchronized int mo163323c() {
        return Math.min((int) ((this.f117008d + this.f117006b) * ((float) 100)), 100);
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: a */
    public synchronized void mo163321a(long j) {
        float f;
        long j2;
        long j3;
        Long l = this.f117005a;
        if (l != null) {
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = -1;
            }
            if (j2 <= j) {
                Long l2 = this.f117005a;
                if (l2 != null) {
                    j3 = l2.longValue();
                } else {
                    j3 = 0;
                }
                f = (((float) (j - j3)) * this.f117007c) / ((float) 1000);
                this.f117006b = f;
            }
        }
        f = BitmapDescriptorFactory.HUE_RED;
        this.f117006b = f;
    }

    @Override // com.ss.android.lark.mm.module.list.widget.IProgressCalculator
    /* renamed from: a */
    public void mo163320a(float f, float f2) {
        IProgressCalculator.C46465a.m183820a(this, f, f2);
    }

    public CompleteProgressCalculatorImpl(float f, float f2) {
        this.f117008d = f;
        this.f117007c = f < 0.8f ? 1.0f - f : f2;
    }
}
