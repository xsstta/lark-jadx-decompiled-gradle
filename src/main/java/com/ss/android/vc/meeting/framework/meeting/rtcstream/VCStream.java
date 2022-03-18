package com.ss.android.vc.meeting.framework.meeting.rtcstream;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.rtcstream.c */
public final class VCStream {

    /* renamed from: a */
    private String f153634a;

    /* renamed from: b */
    private boolean f153635b;

    /* renamed from: c */
    private boolean f153636c;

    /* renamed from: d */
    private int f153637d;

    /* renamed from: a */
    public static /* synthetic */ VCStream m238783a(VCStream cVar, String str, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.f153634a;
        }
        if ((i2 & 2) != 0) {
            z = cVar.f153635b;
        }
        if ((i2 & 4) != 0) {
            z2 = cVar.f153636c;
        }
        if ((i2 & 8) != 0) {
            i = cVar.f153637d;
        }
        return cVar.mo212236a(str, z, z2, i);
    }

    /* renamed from: a */
    public final VCStream mo212236a(String str, boolean z, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "streamId");
        return new VCStream(str, z, z2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCStream)) {
            return false;
        }
        VCStream cVar = (VCStream) obj;
        return Intrinsics.areEqual(this.f153634a, cVar.f153634a) && this.f153635b == cVar.f153635b && this.f153636c == cVar.f153636c && this.f153637d == cVar.f153637d;
    }

    public int hashCode() {
        String str = this.f153634a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f153635b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f153636c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((i5 + i) * 31) + this.f153637d;
    }

    public String toString() {
        return "VCStream(streamId=" + this.f153634a + ", video=" + this.f153635b + ", audio=" + this.f153636c + ", videoIndex=" + this.f153637d + ")";
    }

    /* renamed from: a */
    public final String mo212237a() {
        return this.f153634a;
    }

    /* renamed from: c */
    public final boolean mo212242c() {
        return this.f153636c;
    }

    /* renamed from: d */
    public final int mo212243d() {
        return this.f153637d;
    }

    /* renamed from: b */
    public final boolean mo212241b() {
        return this.f153635b;
    }

    /* renamed from: b */
    public final void mo212240b(boolean z) {
        this.f153636c = z;
    }

    /* renamed from: a */
    public final void mo212238a(int i) {
        this.f153637d = i;
    }

    /* renamed from: a */
    public final void mo212239a(boolean z) {
        this.f153635b = z;
    }

    public VCStream(String str, boolean z, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "streamId");
        this.f153634a = str;
        this.f153635b = z;
        this.f153636c = z2;
        this.f153637d = i;
    }
}
