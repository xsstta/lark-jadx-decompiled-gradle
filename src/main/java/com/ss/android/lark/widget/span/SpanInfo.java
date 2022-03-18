package com.ss.android.lark.widget.span;

import java.io.Serializable;
import java.util.Objects;

public class SpanInfo implements Serializable, Comparable<SpanInfo> {
    public int end;
    public boolean isGlobalSpanInfo;
    public int start;
    public String text;
    public int type;

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.start), Integer.valueOf(this.end), Integer.valueOf(this.type), this.text);
    }

    public String toString() {
        return "start:" + this.start + ", end:" + this.end + ", type:" + this.type + ", text:" + this.text;
    }

    public int compareTo(SpanInfo spanInfo) {
        if (spanInfo == null) {
            return 0;
        }
        int i = this.start;
        int i2 = spanInfo.start;
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        if ((this instanceof PrefixInfo) || (spanInfo instanceof PrefixInfo)) {
            return 0;
        }
        int i3 = this.end;
        int i4 = spanInfo.end;
        if (i3 < i4) {
            return -1;
        }
        if (i3 != i4) {
            return 1;
        }
        if (spanInfo.type == 4) {
            return -1;
        }
        if (this.type == 4) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanInfo)) {
            return false;
        }
        SpanInfo spanInfo = (SpanInfo) obj;
        if (this.start == spanInfo.start && this.end == spanInfo.end && this.type == spanInfo.type && Objects.equals(this.text, spanInfo.text)) {
            return true;
        }
        return false;
    }
}
