package com.ss.android.lark.mm.module.highlight.timeline;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class TimeLineMergeRequestData implements Serializable {
    public TimeLineMergeLine timeline;

    public List<TimeLineMergeItem> getReactions() {
        TimeLineMergeLine timeLineMergeLine = this.timeline;
        if (timeLineMergeLine != null) {
            return timeLineMergeLine.reactions;
        }
        return Collections.EMPTY_LIST;
    }
}
