package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VCMeetingJoinInfoEntity implements Serializable {
    private static final long serialVersionUID = 1;
    public VCTabMeetingJoinInfo joinInfo;

    public String toString() {
        return "VCMeetingJoinInfoEntity{joinInfo=" + this.joinInfo + '}';
    }
}
