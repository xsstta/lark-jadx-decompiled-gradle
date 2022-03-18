package com.ss.android.lark.mm.module.detail.subtitles.model;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;", "Ljava/io/Serializable;", "speed", "", "isAutoPlay", "", "isSilenceEnabled", "(FZZ)V", "()Z", "getSpeed", "()F", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmPlaySettingInfo implements Serializable {
    private final boolean isAutoPlay;
    private final boolean isSilenceEnabled;
    private final float speed;

    public static /* synthetic */ MmPlaySettingInfo copy$default(MmPlaySettingInfo mmPlaySettingInfo, float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mmPlaySettingInfo.speed;
        }
        if ((i & 2) != 0) {
            z = mmPlaySettingInfo.isAutoPlay;
        }
        if ((i & 4) != 0) {
            z2 = mmPlaySettingInfo.isSilenceEnabled;
        }
        return mmPlaySettingInfo.copy(f, z, z2);
    }

    public final float component1() {
        return this.speed;
    }

    public final boolean component2() {
        return this.isAutoPlay;
    }

    public final boolean component3() {
        return this.isSilenceEnabled;
    }

    public final MmPlaySettingInfo copy(float f, boolean z, boolean z2) {
        return new MmPlaySettingInfo(f, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmPlaySettingInfo)) {
            return false;
        }
        MmPlaySettingInfo mmPlaySettingInfo = (MmPlaySettingInfo) obj;
        return Float.compare(this.speed, mmPlaySettingInfo.speed) == 0 && this.isAutoPlay == mmPlaySettingInfo.isAutoPlay && this.isSilenceEnabled == mmPlaySettingInfo.isSilenceEnabled;
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.speed) * 31;
        boolean z = this.isAutoPlay;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (floatToIntBits + i2) * 31;
        boolean z2 = this.isSilenceEnabled;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "MmPlaySettingInfo(speed=" + this.speed + ", isAutoPlay=" + this.isAutoPlay + ", isSilenceEnabled=" + this.isSilenceEnabled + ")";
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final boolean isAutoPlay() {
        return this.isAutoPlay;
    }

    public final boolean isSilenceEnabled() {
        return this.isSilenceEnabled;
    }

    public MmPlaySettingInfo(float f, boolean z, boolean z2) {
        this.speed = f;
        this.isAutoPlay = z;
        this.isSilenceEnabled = z2;
    }
}
