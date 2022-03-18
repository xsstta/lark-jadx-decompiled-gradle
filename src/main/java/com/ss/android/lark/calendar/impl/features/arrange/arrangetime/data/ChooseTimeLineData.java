package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.data;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/data/ChooseTimeLineData;", "", "hour", "", "minuteUnitNum", "baseLineYOffset", "", "(IIF)V", "getBaseLineYOffset", "()F", "setBaseLineYOffset", "(F)V", "getHour", "()I", "setHour", "(I)V", "getMinuteUnitNum", "setMinuteUnitNum", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a.b */
public final class ChooseTimeLineData {

    /* renamed from: a */
    private int f75365a;

    /* renamed from: b */
    private int f75366b;

    /* renamed from: c */
    private float f75367c;

    public ChooseTimeLineData() {
        this(0, 0, BitmapDescriptorFactory.HUE_RED, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseTimeLineData)) {
            return false;
        }
        ChooseTimeLineData bVar = (ChooseTimeLineData) obj;
        return this.f75365a == bVar.f75365a && this.f75366b == bVar.f75366b && Float.compare(this.f75367c, bVar.f75367c) == 0;
    }

    public int hashCode() {
        return (((this.f75365a * 31) + this.f75366b) * 31) + Float.floatToIntBits(this.f75367c);
    }

    public String toString() {
        return "ChooseTimeLineData(hour=" + this.f75365a + ", minuteUnitNum=" + this.f75366b + ", baseLineYOffset=" + this.f75367c + ")";
    }

    /* renamed from: a */
    public final int mo108916a() {
        return this.f75365a;
    }

    /* renamed from: b */
    public final int mo108917b() {
        return this.f75366b;
    }

    /* renamed from: c */
    public final float mo108918c() {
        return this.f75367c;
    }

    public ChooseTimeLineData(int i, int i2, float f) {
        this.f75365a = i;
        this.f75366b = i2;
        this.f75367c = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChooseTimeLineData(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
    }
}
