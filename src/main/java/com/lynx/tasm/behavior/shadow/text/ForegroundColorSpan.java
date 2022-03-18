package com.lynx.tasm.behavior.shadow.text;

public class ForegroundColorSpan extends android.text.style.ForegroundColorSpan {
    public int hashCode() {
        return getForegroundColor() + 31;
    }

    public ForegroundColorSpan(int i) {
        super(i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ForegroundColorSpan) || getForegroundColor() != ((ForegroundColorSpan) obj).getForegroundColor()) {
            return false;
        }
        return true;
    }
}
