package com.ss.android.lark.mm.module.floatwindow.view.progress;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\r\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u00068"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;", "", ShareHitPoint.f121869d, "", "thickness", "trackColor", "indicatorColor", "indicatorStartColor", "indicatorEndColor", "indicatorCornerRadius", "", "progress", "circularSize", "trackThicknessFraction", "(IIIIIIFIIF)V", "getCircularSize", "()I", "setCircularSize", "(I)V", "getIndicatorColor", "setIndicatorColor", "getIndicatorCornerRadius", "()F", "setIndicatorCornerRadius", "(F)V", "getIndicatorEndColor", "setIndicatorEndColor", "getIndicatorStartColor", "setIndicatorStartColor", "getProgress", "setProgress", "getThickness", "setThickness", "getTrackColor", "setTrackColor", "getTrackThicknessFraction", "setTrackThicknessFraction", "getType", "setType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.a */
public final class ProgressSpec {

    /* renamed from: a */
    private int f116686a;

    /* renamed from: b */
    private int f116687b;

    /* renamed from: c */
    private int f116688c;

    /* renamed from: d */
    private int f116689d;

    /* renamed from: e */
    private int f116690e;

    /* renamed from: f */
    private int f116691f;

    /* renamed from: g */
    private float f116692g;

    /* renamed from: h */
    private int f116693h;

    /* renamed from: i */
    private int f116694i;

    /* renamed from: j */
    private float f116695j;

    public ProgressSpec() {
        this(0, 0, 0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressSpec)) {
            return false;
        }
        ProgressSpec aVar = (ProgressSpec) obj;
        return this.f116686a == aVar.f116686a && this.f116687b == aVar.f116687b && this.f116688c == aVar.f116688c && this.f116689d == aVar.f116689d && this.f116690e == aVar.f116690e && this.f116691f == aVar.f116691f && Float.compare(this.f116692g, aVar.f116692g) == 0 && this.f116693h == aVar.f116693h && this.f116694i == aVar.f116694i && Float.compare(this.f116695j, aVar.f116695j) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((this.f116686a * 31) + this.f116687b) * 31) + this.f116688c) * 31) + this.f116689d) * 31) + this.f116690e) * 31) + this.f116691f) * 31) + Float.floatToIntBits(this.f116692g)) * 31) + this.f116693h) * 31) + this.f116694i) * 31) + Float.floatToIntBits(this.f116695j);
    }

    public String toString() {
        return "ProgressSpec(type=" + this.f116686a + ", thickness=" + this.f116687b + ", trackColor=" + this.f116688c + ", indicatorColor=" + this.f116689d + ", indicatorStartColor=" + this.f116690e + ", indicatorEndColor=" + this.f116691f + ", indicatorCornerRadius=" + this.f116692g + ", progress=" + this.f116693h + ", circularSize=" + this.f116694i + ", trackThicknessFraction=" + this.f116695j + ")";
    }

    /* renamed from: a */
    public final int mo162818a() {
        return this.f116686a;
    }

    /* renamed from: b */
    public final int mo162821b() {
        return this.f116687b;
    }

    /* renamed from: c */
    public final int mo162824c() {
        return this.f116688c;
    }

    /* renamed from: d */
    public final int mo162826d() {
        return this.f116689d;
    }

    /* renamed from: e */
    public final int mo162828e() {
        return this.f116690e;
    }

    /* renamed from: f */
    public final int mo162831f() {
        return this.f116691f;
    }

    /* renamed from: g */
    public final float mo162833g() {
        return this.f116692g;
    }

    /* renamed from: h */
    public final int mo162835h() {
        return this.f116693h;
    }

    /* renamed from: i */
    public final int mo162838i() {
        return this.f116694i;
    }

    /* renamed from: j */
    public final float mo162839j() {
        return this.f116695j;
    }

    /* renamed from: a */
    public final void mo162819a(float f) {
        this.f116692g = f;
    }

    /* renamed from: b */
    public final void mo162822b(float f) {
        this.f116695j = f;
    }

    /* renamed from: c */
    public final void mo162825c(int i) {
        this.f116688c = i;
    }

    /* renamed from: d */
    public final void mo162827d(int i) {
        this.f116689d = i;
    }

    /* renamed from: e */
    public final void mo162829e(int i) {
        this.f116690e = i;
    }

    /* renamed from: f */
    public final void mo162832f(int i) {
        this.f116691f = i;
    }

    /* renamed from: g */
    public final void mo162834g(int i) {
        this.f116693h = i;
    }

    /* renamed from: h */
    public final void mo162836h(int i) {
        this.f116694i = i;
    }

    /* renamed from: a */
    public final void mo162820a(int i) {
        this.f116686a = i;
    }

    /* renamed from: b */
    public final void mo162823b(int i) {
        this.f116687b = i;
    }

    public ProgressSpec(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, float f2) {
        this.f116686a = i;
        this.f116687b = i2;
        this.f116688c = i3;
        this.f116689d = i4;
        this.f116690e = i5;
        this.f116691f = i6;
        this.f116692g = f;
        this.f116693h = i7;
        this.f116694i = i8;
        this.f116695j = f2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProgressSpec(int r12, int r13, int r14, int r15, int r16, int r17, float r18, int r19, int r20, float r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.floatwindow.view.progress.ProgressSpec.<init>(int, int, int, int, int, int, float, int, int, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
