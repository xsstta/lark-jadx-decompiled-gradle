package com.bytedance.ee.plugin.common.ttpdfreader;

import java.util.Objects;

public class Range {
    public long begin = -1;
    public long end = -1;

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.begin), Long.valueOf(this.end));
    }

    public String toString() {
        return "Range{begin=" + this.begin + ", end=" + this.end + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (range.begin > this.begin || range.end < this.end) {
            return false;
        }
        return true;
    }

    public Range(long j, long j2) {
        this.begin = j;
        this.end = j2;
    }
}
