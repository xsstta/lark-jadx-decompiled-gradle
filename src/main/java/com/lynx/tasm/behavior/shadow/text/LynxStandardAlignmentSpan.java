package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.style.AlignmentSpan;

public class LynxStandardAlignmentSpan extends AlignmentSpan.Standard {
    public int hashCode() {
        int i;
        int spanTypeId = getSpanTypeId() * 31;
        if (getAlignment() == null) {
            i = 0;
        } else {
            i = getAlignment().hashCode();
        }
        return spanTypeId + i;
    }

    public LynxStandardAlignmentSpan(Layout.Alignment alignment) {
        super(alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LynxStandardAlignmentSpan lynxStandardAlignmentSpan = (LynxStandardAlignmentSpan) obj;
        if (getAlignment() == lynxStandardAlignmentSpan.getAlignment() && getSpanTypeId() == lynxStandardAlignmentSpan.getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
