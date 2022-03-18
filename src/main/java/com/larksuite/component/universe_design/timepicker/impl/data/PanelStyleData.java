package com.larksuite.component.universe_design.timepicker.impl.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/data/PanelStyleData;", "", "visibleItemNum", "", "minuteInterval", "itemDividerVisibility", "", "showDayInfo", "(IIZZ)V", "getItemDividerVisibility", "()Z", "setItemDividerVisibility", "(Z)V", "getMinuteInterval", "()I", "setMinuteInterval", "(I)V", "getShowDayInfo", "setShowDayInfo", "getVisibleItemNum", "setVisibleItemNum", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PanelStyleData {
    private boolean itemDividerVisibility;
    private int minuteInterval;
    private boolean showDayInfo;
    private int visibleItemNum;

    public PanelStyleData() {
        this(0, 0, false, false, 15, null);
    }

    public static /* synthetic */ PanelStyleData copy$default(PanelStyleData panelStyleData, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = panelStyleData.visibleItemNum;
        }
        if ((i3 & 2) != 0) {
            i2 = panelStyleData.minuteInterval;
        }
        if ((i3 & 4) != 0) {
            z = panelStyleData.itemDividerVisibility;
        }
        if ((i3 & 8) != 0) {
            z2 = panelStyleData.showDayInfo;
        }
        return panelStyleData.copy(i, i2, z, z2);
    }

    public final int component1() {
        return this.visibleItemNum;
    }

    public final int component2() {
        return this.minuteInterval;
    }

    public final boolean component3() {
        return this.itemDividerVisibility;
    }

    public final boolean component4() {
        return this.showDayInfo;
    }

    public final PanelStyleData copy(int i, int i2, boolean z, boolean z2) {
        return new PanelStyleData(i, i2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelStyleData)) {
            return false;
        }
        PanelStyleData panelStyleData = (PanelStyleData) obj;
        return this.visibleItemNum == panelStyleData.visibleItemNum && this.minuteInterval == panelStyleData.minuteInterval && this.itemDividerVisibility == panelStyleData.itemDividerVisibility && this.showDayInfo == panelStyleData.showDayInfo;
    }

    public int hashCode() {
        int i = ((this.visibleItemNum * 31) + this.minuteInterval) * 31;
        boolean z = this.itemDividerVisibility;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.showDayInfo;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return i6 + i2;
    }

    public String toString() {
        return "PanelStyleData(visibleItemNum=" + this.visibleItemNum + ", minuteInterval=" + this.minuteInterval + ", itemDividerVisibility=" + this.itemDividerVisibility + ", showDayInfo=" + this.showDayInfo + ")";
    }

    public final boolean getItemDividerVisibility() {
        return this.itemDividerVisibility;
    }

    public final int getMinuteInterval() {
        return this.minuteInterval;
    }

    public final boolean getShowDayInfo() {
        return this.showDayInfo;
    }

    public final int getVisibleItemNum() {
        return this.visibleItemNum;
    }

    public final void setItemDividerVisibility(boolean z) {
        this.itemDividerVisibility = z;
    }

    public final void setMinuteInterval(int i) {
        this.minuteInterval = i;
    }

    public final void setShowDayInfo(boolean z) {
        this.showDayInfo = z;
    }

    public final void setVisibleItemNum(int i) {
        this.visibleItemNum = i;
    }

    public PanelStyleData(int i, int i2, boolean z, boolean z2) {
        this.visibleItemNum = i;
        this.minuteInterval = i2;
        this.itemDividerVisibility = z;
        this.showDayInfo = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelStyleData(int i, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 3 : i, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? true : z2);
    }
}
