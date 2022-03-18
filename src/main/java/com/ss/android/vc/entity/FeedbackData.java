package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class FeedbackData implements Serializable {
    public String otherReason;
    public List<String> reasonSubkeys;

    public String toString() {
        return "FeedbackData{reasonSubkeys=" + this.reasonSubkeys + ", otherReason='" + this.otherReason + '\'' + '}';
    }
}
