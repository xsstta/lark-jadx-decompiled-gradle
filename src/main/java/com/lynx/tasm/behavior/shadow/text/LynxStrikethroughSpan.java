package com.lynx.tasm.behavior.shadow.text;

import android.text.style.StrikethroughSpan;

public class LynxStrikethroughSpan extends StrikethroughSpan {
    public int hashCode() {
        return getSpanTypeId() * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getSpanTypeId() == ((LynxStrikethroughSpan) obj).getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
