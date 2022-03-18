package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VCTabTotalMissedCallInfoEntity implements Serializable {
    private static final long serialVersionUID = 1;
    public long mconfirmed_missed_calls;
    public long mtotal_missed_calls;

    public String toString() {
        return "MissedCalls = " + this.mtotal_missed_calls + " ConformedCalls = " + this.mconfirmed_missed_calls;
    }
}
