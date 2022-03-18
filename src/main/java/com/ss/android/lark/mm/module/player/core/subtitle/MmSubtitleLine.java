package com.ss.android.lark.mm.module.player.core.subtitle;

import java.io.Serializable;
import java.util.Objects;

public class MmSubtitleLine implements Serializable {
    public String content;
    public int index;
    public long start_ms;
    public long stop_ms;

    public MmSubtitleLine() {
    }

    public String getContent() {
        return this.content;
    }

    public int getIndex() {
        return this.index;
    }

    public long getStart_ms() {
        return this.start_ms;
    }

    public long getStop_ms() {
        return this.stop_ms;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.index));
    }

    public String toString() {
        return "MmSubtitleLine{index=" + this.index + ", from=" + this.start_ms + ", to=" + this.stop_ms + ", text='" + this.content + '\'' + '}';
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public boolean isMatch(long j) {
        if (j < this.start_ms || j > this.stop_ms) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.index == ((MmSubtitleLine) obj).index) {
            return true;
        }
        return false;
    }

    public MmSubtitleLine(long j, long j2, String str) {
        this.start_ms = j;
        this.stop_ms = j2;
        this.content = str;
    }
}
