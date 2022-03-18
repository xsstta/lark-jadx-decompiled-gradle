package com.larksuite.component.ui.layout;

import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006#"}, d2 = {"Lcom/larksuite/component/ui/layout/OnLayoutData;", "", "changed", "", "l", "", "t", "r", C63954b.f161494a, "(ZIIII)V", "getB", "()I", "setB", "(I)V", "getChanged", "()Z", "setChanged", "(Z)V", "getL", "setL", "getR", "setR", "getT", "setT", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.layout.b */
public final class OnLayoutData {

    /* renamed from: a */
    private boolean f62719a;

    /* renamed from: b */
    private int f62720b;

    /* renamed from: c */
    private int f62721c;

    /* renamed from: d */
    private int f62722d;

    /* renamed from: e */
    private int f62723e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutData)) {
            return false;
        }
        OnLayoutData bVar = (OnLayoutData) obj;
        return this.f62719a == bVar.f62719a && this.f62720b == bVar.f62720b && this.f62721c == bVar.f62721c && this.f62722d == bVar.f62722d && this.f62723e == bVar.f62723e;
    }

    public int hashCode() {
        boolean z = this.f62719a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (((((((i * 31) + this.f62720b) * 31) + this.f62721c) * 31) + this.f62722d) * 31) + this.f62723e;
    }

    public String toString() {
        return "OnLayoutData(changed=" + this.f62719a + ", l=" + this.f62720b + ", t=" + this.f62721c + ", r=" + this.f62722d + ", b=" + this.f62723e + ")";
    }

    /* renamed from: b */
    public final int mo89726b() {
        return this.f62720b;
    }

    /* renamed from: c */
    public final int mo89728c() {
        return this.f62721c;
    }

    /* renamed from: d */
    public final int mo89730d() {
        return this.f62722d;
    }

    /* renamed from: e */
    public final int mo89732e() {
        return this.f62723e;
    }

    /* renamed from: a */
    public final boolean mo89725a() {
        return this.f62719a;
    }

    /* renamed from: a */
    public final void mo89723a(int i) {
        this.f62720b = i;
    }

    /* renamed from: a */
    public final void mo89724a(boolean z) {
        this.f62719a = z;
    }

    /* renamed from: b */
    public final void mo89727b(int i) {
        this.f62721c = i;
    }

    /* renamed from: c */
    public final void mo89729c(int i) {
        this.f62722d = i;
    }

    /* renamed from: d */
    public final void mo89731d(int i) {
        this.f62723e = i;
    }

    public OnLayoutData(boolean z, int i, int i2, int i3, int i4) {
        this.f62719a = z;
        this.f62720b = i;
        this.f62721c = i2;
        this.f62722d = i3;
        this.f62723e = i4;
    }
}
