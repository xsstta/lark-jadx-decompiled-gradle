package com.ss.android.lark.diskmanage;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lcom/ss/android/lark/diskmanage/GlobalConfig;", "", "cleanInterval", "", "idleDelay", "sdkTaskCostLimit", "taskCostLimit", "cacheTimeLimit", "autoCleanMaxTimes", "(JJJJJJ)V", "getAutoCleanMaxTimes", "()J", "setAutoCleanMaxTimes", "(J)V", "getCacheTimeLimit", "setCacheTimeLimit", "getCleanInterval", "setCleanInterval", "getIdleDelay", "setIdleDelay", "getSdkTaskCostLimit", "setSdkTaskCostLimit", "getTaskCostLimit", "setTaskCostLimit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.c */
public final class GlobalConfig {

    /* renamed from: a */
    private long f94578a;

    /* renamed from: b */
    private long f94579b;

    /* renamed from: c */
    private long f94580c;

    /* renamed from: d */
    private long f94581d;

    /* renamed from: e */
    private long f94582e;

    /* renamed from: f */
    private long f94583f;

    public GlobalConfig() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GlobalConfig) {
                GlobalConfig cVar = (GlobalConfig) obj;
                if (this.f94578a == cVar.f94578a) {
                    if (this.f94579b == cVar.f94579b) {
                        if (this.f94580c == cVar.f94580c) {
                            if (this.f94581d == cVar.f94581d) {
                                if (this.f94582e == cVar.f94582e) {
                                    if (this.f94583f == cVar.f94583f) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f94578a;
        long j2 = this.f94579b;
        long j3 = this.f94580c;
        long j4 = this.f94581d;
        long j5 = this.f94582e;
        long j6 = this.f94583f;
        return (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "GlobalConfig(cleanInterval=" + this.f94578a + ", idleDelay=" + this.f94579b + ", sdkTaskCostLimit=" + this.f94580c + ", taskCostLimit=" + this.f94581d + ", cacheTimeLimit=" + this.f94582e + ", autoCleanMaxTimes=" + this.f94583f + ")";
    }

    /* renamed from: a */
    public final long mo135564a() {
        return this.f94578a;
    }

    /* renamed from: b */
    public final long mo135566b() {
        return this.f94580c;
    }

    /* renamed from: c */
    public final long mo135568c() {
        return this.f94582e;
    }

    /* renamed from: d */
    public final void mo135570d(long j) {
        this.f94581d = j;
    }

    /* renamed from: e */
    public final void mo135571e(long j) {
        this.f94582e = j;
    }

    /* renamed from: f */
    public final void mo135573f(long j) {
        this.f94583f = j;
    }

    /* renamed from: a */
    public final void mo135565a(long j) {
        this.f94578a = j;
    }

    /* renamed from: b */
    public final void mo135567b(long j) {
        this.f94579b = j;
    }

    /* renamed from: c */
    public final void mo135569c(long j) {
        this.f94580c = j;
    }

    public GlobalConfig(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f94578a = j;
        this.f94579b = j2;
        this.f94580c = j3;
        this.f94581d = j4;
        this.f94582e = j5;
        this.f94583f = j6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GlobalConfig(long r14, long r16, long r18, long r20, long r22, long r24, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26 & 1
            if (r0 == 0) goto L_0x0008
            r0 = 86400(0x15180, double:4.26873E-319)
            goto L_0x0009
        L_0x0008:
            r0 = r14
        L_0x0009:
            r2 = r26 & 2
            r3 = 30
            if (r2 == 0) goto L_0x0011
            r5 = r3
            goto L_0x0013
        L_0x0011:
            r5 = r16
        L_0x0013:
            r2 = r26 & 4
            if (r2 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r3 = r18
        L_0x001a:
            r2 = r26 & 8
            if (r2 == 0) goto L_0x0021
            r7 = 60
            goto L_0x0023
        L_0x0021:
            r7 = r20
        L_0x0023:
            r2 = r26 & 16
            if (r2 == 0) goto L_0x002b
            r9 = 604800(0x93a80, double:2.98811E-318)
            goto L_0x002d
        L_0x002b:
            r9 = r22
        L_0x002d:
            r2 = r26 & 32
            if (r2 == 0) goto L_0x0034
            r11 = 5
            goto L_0x0036
        L_0x0034:
            r11 = r24
        L_0x0036:
            r14 = r13
            r15 = r0
            r17 = r5
            r19 = r3
            r21 = r7
            r23 = r9
            r25 = r11
            r14.<init>(r15, r17, r19, r21, r23, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.diskmanage.GlobalConfig.<init>(long, long, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
