package com.lynx.tasm.behavior.shadow.text;

public class BackgroundColorSpan extends android.text.style.BackgroundColorSpan {
    public int hashCode() {
        return getBackgroundColor() + 31;
    }

    public BackgroundColorSpan(int i) {
        super(i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BackgroundColorSpan) || getBackgroundColor() != ((BackgroundColorSpan) obj).getBackgroundColor()) {
            return false;
        }
        return true;
    }
}
