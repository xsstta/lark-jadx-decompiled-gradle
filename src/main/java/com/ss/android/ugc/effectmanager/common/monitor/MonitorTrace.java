package com.ss.android.ugc.effectmanager.common.monitor;

import android.os.SystemClock;
import com.ss.android.ugc.effectmanager.common.utils.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "", "id", "", "(Ljava/lang/String;)V", "<set-?>", "", "duration", "getDuration", "()J", "getId", "()Ljava/lang/String;", "isTraceEnded", "", "stepList", "", "getStepList", "()Ljava/util/List;", "traceBeginTimeMills", "addStep", "", "step", "begin", "end", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.e.b */
public final class MonitorTrace {

    /* renamed from: a */
    private long f151303a;

    /* renamed from: b */
    private boolean f151304b;

    /* renamed from: c */
    private final List<String> f151305c = new ArrayList();

    /* renamed from: d */
    private long f151306d;

    /* renamed from: e */
    private final String f151307e;

    /* renamed from: a */
    public final List<String> mo207201a() {
        return this.f151305c;
    }

    /* renamed from: b */
    public final long mo207203b() {
        return this.f151306d;
    }

    /* renamed from: c */
    public final void mo207204c() {
        if (!this.f151305c.isEmpty()) {
            this.f151305c.clear();
        }
        this.f151304b = false;
        this.f151303a = SystemClock.uptimeMillis();
        mo207202a(">>>>>>> Trace Begin <<<<<<<");
    }

    /* renamed from: d */
    public final void mo207205d() {
        mo207202a(">>>>>>> Trace End <<<<<<<");
        this.f151304b = true;
        this.f151306d = SystemClock.uptimeMillis() - this.f151303a;
    }

    public MonitorTrace(String str) {
        this.f151307e = str;
    }

    /* renamed from: a */
    public final void mo207202a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "step");
        if (!this.f151304b) {
            List<String> list = this.f151305c;
            list.add(TimeUtils.f151364a.mo207280a() + " [" + this.f151307e + "]->" + str + " \n");
        }
    }
}
