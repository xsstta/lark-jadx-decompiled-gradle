package com.larksuite.component.universe_design.progress;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006,"}, d2 = {"Lcom/larksuite/component/universe_design/progress/UDProgressSpec;", "", ShareHitPoint.f121869d, "", "thickness", "trackColor", "indicatorColor", "indicatorCornerRadius", "", "progress", "circularSize", "(IIIIFII)V", "getCircularSize", "()I", "setCircularSize", "(I)V", "getIndicatorColor", "setIndicatorColor", "getIndicatorCornerRadius", "()F", "setIndicatorCornerRadius", "(F)V", "getProgress", "setProgress", "getThickness", "setThickness", "getTrackColor", "setTrackColor", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.progress.a */
public final class UDProgressSpec {

    /* renamed from: a */
    private int f63507a;

    /* renamed from: b */
    private int f63508b;

    /* renamed from: c */
    private int f63509c;

    /* renamed from: d */
    private int f63510d;

    /* renamed from: e */
    private float f63511e;

    /* renamed from: f */
    private int f63512f;

    /* renamed from: g */
    private int f63513g;

    public UDProgressSpec() {
        this(0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UDProgressSpec)) {
            return false;
        }
        UDProgressSpec aVar = (UDProgressSpec) obj;
        return this.f63507a == aVar.f63507a && this.f63508b == aVar.f63508b && this.f63509c == aVar.f63509c && this.f63510d == aVar.f63510d && Float.compare(this.f63511e, aVar.f63511e) == 0 && this.f63512f == aVar.f63512f && this.f63513g == aVar.f63513g;
    }

    public int hashCode() {
        return (((((((((((this.f63507a * 31) + this.f63508b) * 31) + this.f63509c) * 31) + this.f63510d) * 31) + Float.floatToIntBits(this.f63511e)) * 31) + this.f63512f) * 31) + this.f63513g;
    }

    public String toString() {
        return "UDProgressSpec(type=" + this.f63507a + ", thickness=" + this.f63508b + ", trackColor=" + this.f63509c + ", indicatorColor=" + this.f63510d + ", indicatorCornerRadius=" + this.f63511e + ", progress=" + this.f63512f + ", circularSize=" + this.f63513g + ")";
    }

    /* renamed from: a */
    public final int mo91092a() {
        return this.f63507a;
    }

    /* renamed from: b */
    public final int mo91095b() {
        return this.f63508b;
    }

    /* renamed from: c */
    public final int mo91097c() {
        return this.f63509c;
    }

    /* renamed from: d */
    public final int mo91099d() {
        return this.f63510d;
    }

    /* renamed from: e */
    public final float mo91101e() {
        return this.f63511e;
    }

    /* renamed from: f */
    public final int mo91104f() {
        return this.f63512f;
    }

    /* renamed from: g */
    public final int mo91106g() {
        return this.f63513g;
    }

    /* renamed from: a */
    public final void mo91093a(float f) {
        this.f63511e = f;
    }

    /* renamed from: b */
    public final void mo91096b(int i) {
        this.f63508b = i;
    }

    /* renamed from: c */
    public final void mo91098c(int i) {
        this.f63509c = i;
    }

    /* renamed from: d */
    public final void mo91100d(int i) {
        this.f63510d = i;
    }

    /* renamed from: e */
    public final void mo91102e(int i) {
        this.f63512f = i;
    }

    /* renamed from: f */
    public final void mo91105f(int i) {
        this.f63513g = i;
    }

    /* renamed from: a */
    public final void mo91094a(int i) {
        this.f63507a = i;
    }

    public UDProgressSpec(int i, int i2, int i3, int i4, float f, int i5, int i6) {
        this.f63507a = i;
        this.f63508b = i2;
        this.f63509c = i3;
        this.f63510d = i4;
        this.f63511e = f;
        this.f63512f = i5;
        this.f63513g = i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UDProgressSpec(int r7, int r8, int r9, int r10, float r11, int r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = 0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = 0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = 0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r11 = 0
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002b
            r5 = 0
            goto L_0x002c
        L_0x002b:
            r5 = r12
        L_0x002c:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0032
            r14 = 0
            goto L_0x0033
        L_0x0032:
            r14 = r13
        L_0x0033:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.progress.UDProgressSpec.<init>(int, int, int, int, float, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
