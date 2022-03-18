package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.monitor.util.thread.AbstractC20190c;
import com.bytedance.monitor.util.thread.AbstractRunnableC20192d;
import com.bytedance.monitor.util.thread.C20188b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class AbsMonitor {

    /* renamed from: a */
    protected String f49088a;

    /* renamed from: b */
    protected int f49089b;

    /* renamed from: c */
    protected int f49090c = 1;

    /* renamed from: d */
    protected volatile boolean f49091d;

    /* renamed from: e */
    protected AbstractC20190c f49092e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RunMode {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<String, ?> mo68210a(long j, long j2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo68213b() {
        this.f49089b = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo68214b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Pair<String, ?> mo68215c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68211a() {
        if (this.f49089b >= 0) {
            this.f49089b = 2;
            return;
        }
        throw new IllegalStateException("collector has destroyed, can not start.");
    }

    /* renamed from: a */
    public final void mo68212a(final int i) {
        AbstractRunnableC20192d a = C20188b.m73690a("refreshConfig", new Runnable() {
            /* class com.bytedance.monitor.collector.AbsMonitor.RunnableC201131 */

            public void run() {
                int i;
                if (AbsMonitor.this.f49089b > -1 && AbsMonitor.this.f49089b == 2 && AbsMonitor.this.f49090c != (i = i)) {
                    AbsMonitor.this.f49090c = i;
                    AbsMonitor.this.mo68214b(i);
                }
            }
        });
        AbstractC20190c cVar = this.f49092e;
        if (cVar != null) {
            cVar.mo68322a(a);
        }
    }

    public AbsMonitor(int i, String str) {
        this.f49088a = str;
        this.f49090c = i;
        C20152k.m73538a().mo68289a(this);
        this.f49092e = C20188b.m73688a();
    }
}
