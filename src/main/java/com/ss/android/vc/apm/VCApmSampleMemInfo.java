package com.ss.android.vc.apm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0017HÖ\u0001J\u000e\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0000J\u0006\u0010'\u001a\u00020(J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006+"}, d2 = {"Lcom/ss/android/vc/apm/VCApmSampleMemInfo;", "Lcom/ss/android/vc/apm/VCApmSampleBaseInfo;", "totalPss", "", "javaHeap", "nativeHeap", "graphics", "code", "(DDDDD)V", "getCode", "()D", "setCode", "(D)V", "getGraphics", "setGraphics", "getJavaHeap", "setJavaHeap", "getNativeHeap", "setNativeHeap", "getTotalPss", "setTotalPss", "avg", "count", "", "clear", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "plus", "info", "toJSON", "Lorg/json/JSONObject;", "toString", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.b.e */
public final class VCApmSampleMemInfo extends C60674c {

    /* renamed from: b */
    private double f151799b;

    /* renamed from: c */
    private double f151800c;

    /* renamed from: d */
    private double f151801d;

    /* renamed from: e */
    private double f151802e;

    /* renamed from: f */
    private double f151803f;

    public VCApmSampleMemInfo() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCApmSampleMemInfo)) {
            return false;
        }
        VCApmSampleMemInfo eVar = (VCApmSampleMemInfo) obj;
        return Double.compare(this.f151799b, eVar.f151799b) == 0 && Double.compare(this.f151800c, eVar.f151800c) == 0 && Double.compare(this.f151801d, eVar.f151801d) == 0 && Double.compare(this.f151802e, eVar.f151802e) == 0 && Double.compare(this.f151803f, eVar.f151803f) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f151799b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f151800c);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f151801d);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f151802e);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f151803f);
        return (((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
    }

    @Override // com.ss.android.vc.p3069b.C60674c
    public String toString() {
        return "VCApmSampleMemInfo(totalPss=" + this.f151799b + ", javaHeap=" + this.f151800c + ", nativeHeap=" + this.f151801d + ", graphics=" + this.f151802e + ", code=" + this.f151803f + ")";
    }

    /* renamed from: a */
    public final JSONObject mo208242a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalPss", this.f151799b);
        jSONObject.put("javaHeap", this.f151800c);
        jSONObject.put("nativeHeap", this.f151801d);
        jSONObject.put("graphics", this.f151802e);
        jSONObject.put("code", this.f151803f);
        return jSONObject;
    }

    /* renamed from: b */
    public VCApmSampleMemInfo mo208227a(int i) {
        double d = (double) i;
        return new VCApmSampleMemInfo(this.f151799b / d, this.f151800c / d, this.f151801d / d, this.f151802e / d, this.f151803f / d);
    }

    /* renamed from: a */
    public final void mo208243a(VCApmSampleMemInfo eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "info");
        this.f151799b += eVar.f151799b;
        this.f151800c += eVar.f151800c;
        this.f151801d += eVar.f151801d;
        this.f151802e += eVar.f151802e;
        this.f151803f += eVar.f151803f;
    }

    public VCApmSampleMemInfo(double d, double d2, double d3, double d4, double d5) {
        this.f151799b = d;
        this.f151800c = d2;
        this.f151801d = d3;
        this.f151802e = d4;
        this.f151803f = d5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VCApmSampleMemInfo(double r12, double r14, double r16, double r18, double r20, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r12
        L_0x0009:
            r0 = r22 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r14
        L_0x0010:
            r0 = r22 & 4
            if (r0 == 0) goto L_0x0016
            r7 = r1
            goto L_0x0018
        L_0x0016:
            r7 = r16
        L_0x0018:
            r0 = r22 & 8
            if (r0 == 0) goto L_0x001e
            r9 = r1
            goto L_0x0020
        L_0x001e:
            r9 = r18
        L_0x0020:
            r0 = r22 & 16
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r1 = r20
        L_0x0027:
            r12 = r11
            r13 = r3
            r15 = r5
            r17 = r7
            r19 = r9
            r21 = r1
            r12.<init>(r13, r15, r17, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.apm.VCApmSampleMemInfo.<init>(double, double, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
