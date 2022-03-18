package com.larksuite.component.ui.layout;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/ui/layout/OnMeasureData;", "", "widthMeasureSpec", "", "heightMeasureSpec", "(II)V", "getHeightMeasureSpec", "()I", "setHeightMeasureSpec", "(I)V", "getWidthMeasureSpec", "setWidthMeasureSpec", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.layout.c */
public final class OnMeasureData {

    /* renamed from: a */
    private int f62724a;

    /* renamed from: b */
    private int f62725b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnMeasureData)) {
            return false;
        }
        OnMeasureData cVar = (OnMeasureData) obj;
        return this.f62724a == cVar.f62724a && this.f62725b == cVar.f62725b;
    }

    public int hashCode() {
        return (this.f62724a * 31) + this.f62725b;
    }

    public String toString() {
        return "OnMeasureData(widthMeasureSpec=" + this.f62724a + ", heightMeasureSpec=" + this.f62725b + ")";
    }

    /* renamed from: a */
    public final int mo89736a() {
        return this.f62724a;
    }

    /* renamed from: b */
    public final int mo89738b() {
        return this.f62725b;
    }

    /* renamed from: a */
    public final void mo89737a(int i) {
        this.f62724a = i;
    }

    /* renamed from: b */
    public final void mo89739b(int i) {
        this.f62725b = i;
    }

    public OnMeasureData(int i, int i2) {
        this.f62724a = i;
        this.f62725b = i2;
    }
}
