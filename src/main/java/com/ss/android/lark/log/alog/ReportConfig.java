package com.ss.android.lark.log.alog;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/log/alog/ReportConfig;", "", "duration", "", "maxTagF", "", "maxLogSize", "maxLogSubSize", "(JIII)V", "getDuration", "()J", "setDuration", "(J)V", "getMaxLogSize", "()I", "setMaxLogSize", "(I)V", "getMaxLogSubSize", "setMaxLogSubSize", "getMaxTagF", "setMaxTagF", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReportConfig {
    private long duration;
    private int maxLogSize;
    private int maxLogSubSize;
    private int maxTagF;

    public ReportConfig() {
        this(0, 0, 0, 0, 15, null);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getMaxLogSize() {
        return this.maxLogSize;
    }

    public final int getMaxLogSubSize() {
        return this.maxLogSubSize;
    }

    public final int getMaxTagF() {
        return this.maxTagF;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setMaxLogSize(int i) {
        this.maxLogSize = i;
    }

    public final void setMaxLogSubSize(int i) {
        this.maxLogSubSize = i;
    }

    public final void setMaxTagF(int i) {
        this.maxTagF = i;
    }

    public ReportConfig(long j, int i, int i2, int i3) {
        this.duration = j;
        this.maxTagF = i;
        this.maxLogSize = i2;
        this.maxLogSubSize = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReportConfig(long r7, int r9, int r10, int r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0006
            r7 = 1000(0x3e8, double:4.94E-321)
        L_0x0006:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto L_0x0010
            r9 = 100
            r3 = 100
            goto L_0x0011
        L_0x0010:
            r3 = r9
        L_0x0011:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x001a
            r10 = 4096(0x1000, float:5.74E-42)
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x001b
        L_0x001a:
            r4 = r10
        L_0x001b:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x0024
            r11 = 50
            r5 = 50
            goto L_0x0025
        L_0x0024:
            r5 = r11
        L_0x0025:
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.log.alog.ReportConfig.<init>(long, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
