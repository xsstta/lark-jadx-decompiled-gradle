package com.ss.android.lark.mm.module.record.model;

import com.ss.android.lark.mm.base.IMmSerializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/record/model/WaveData;", "Lcom/ss/android/lark/mm/base/IMmSerializable;", "volume", "", "(S)V", "getVolume", "()S", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WaveData implements IMmSerializable {
    private final short volume;

    public static /* synthetic */ WaveData copy$default(WaveData waveData, short s, int i, Object obj) {
        if ((i & 1) != 0) {
            s = waveData.volume;
        }
        return waveData.copy(s);
    }

    public final short component1() {
        return this.volume;
    }

    public final WaveData copy(short s) {
        return new WaveData(s);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof WaveData) && this.volume == ((WaveData) obj).volume;
        }
        return true;
    }

    public int hashCode() {
        return this.volume;
    }

    public String toString() {
        return "WaveData(volume=" + ((int) this.volume) + ")";
    }

    public final short getVolume() {
        return this.volume;
    }

    public WaveData(short s) {
        this.volume = s;
    }
}
