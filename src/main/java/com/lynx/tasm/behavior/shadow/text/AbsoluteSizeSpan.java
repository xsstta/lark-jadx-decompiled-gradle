package com.lynx.tasm.behavior.shadow.text;

public class AbsoluteSizeSpan extends android.text.style.AbsoluteSizeSpan {
    public int hashCode() {
        return ((getDip() ? 1 : 0) * 31) + getSize();
    }

    public AbsoluteSizeSpan(int i) {
        super(i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbsoluteSizeSpan)) {
            return false;
        }
        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
        if (absoluteSizeSpan.getDip() == getDip() && absoluteSizeSpan.getSize() == getSize()) {
            return true;
        }
        return false;
    }
}
