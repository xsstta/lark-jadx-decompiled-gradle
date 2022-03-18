package com.zackratos.ultimatebarx.ultimatebarx.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0014J'\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarBackground;", "", "color", "", "drawableRes", "colorRes", "(III)V", "getColor$ultimatebarx_release", "()I", "setColor$ultimatebarx_release", "(I)V", "getColorRes$ultimatebarx_release", "setColorRes$ultimatebarx_release", "getDrawableRes$ultimatebarx_release", "setDrawableRes$ultimatebarx_release", "component1", "component1$ultimatebarx_release", "component2", "component2$ultimatebarx_release", "component3", "component3$ultimatebarx_release", "copy", "default", "", "equals", "", "other", "hashCode", "toString", "", "transparent", "update", "background", "Companion", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.a.a */
public final class BarBackground {

    /* renamed from: a */
    public static final Companion f171309a = new Companion(null);

    /* renamed from: b */
    private int f171310b;

    /* renamed from: c */
    private int f171311c;

    /* renamed from: d */
    private int f171312d;

    public BarBackground() {
        this(0, 0, 0, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarBackground)) {
            return false;
        }
        BarBackground aVar = (BarBackground) obj;
        return this.f171310b == aVar.f171310b && this.f171311c == aVar.f171311c && this.f171312d == aVar.f171312d;
    }

    public int hashCode() {
        return (((this.f171310b * 31) + this.f171311c) * 31) + this.f171312d;
    }

    public String toString() {
        return "BarBackground(color=" + this.f171310b + ", drawableRes=" + this.f171311c + ", colorRes=" + this.f171312d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarBackground$Companion;", "", "()V", "newInstance", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarBackground;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final BarBackground mo236961a() {
            return new BarBackground(0, 0, 0, 7, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final int mo236955c() {
        return this.f171310b;
    }

    /* renamed from: d */
    public final int mo236956d() {
        return this.f171311c;
    }

    /* renamed from: e */
    public final int mo236957e() {
        return this.f171312d;
    }

    /* renamed from: a */
    public final void mo236951a() {
        this.f171310b = Integer.MIN_VALUE;
        this.f171312d = -1;
        this.f171311c = -1;
    }

    /* renamed from: b */
    public final BarBackground mo236954b() {
        BarBackground aVar = this;
        aVar.f171310b = 0;
        aVar.f171312d = -1;
        aVar.f171311c = -1;
        return aVar;
    }

    /* renamed from: a */
    public final void mo236952a(int i) {
        this.f171310b = i;
    }

    /* renamed from: a */
    public final void mo236953a(BarBackground aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "background");
        if (!Intrinsics.areEqual(aVar, this)) {
            this.f171310b = aVar.f171310b;
            this.f171311c = aVar.f171311c;
            this.f171312d = aVar.f171312d;
        }
    }

    public BarBackground(int i, int i2, int i3) {
        this.f171310b = i;
        this.f171311c = i2;
        this.f171312d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarBackground(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
