package com.ss.android.vc.irtc.impl;

import com.ss.android.vc.irtc.AbstractC61024c;
import com.ss.video.rtc.meeting.IRtcResourceFinder;

public class RtcResourceFinder implements IRtcResourceFinder {
    private AbstractC61024c finder;

    @Override // com.ss.video.rtc.meeting.IRtcResourceFinder
    public void release(long j) {
    }

    public void setResourceFinder(AbstractC61024c cVar) {
        this.finder = cVar;
    }

    public RtcResourceFinder(AbstractC61024c cVar) {
        this.finder = cVar;
    }

    @Override // com.ss.video.rtc.meeting.IRtcResourceFinder
    public long createNativeResourceFinder(long j) {
        AbstractC61024c cVar = this.finder;
        if (cVar != null) {
            return cVar.mo210647a(j);
        }
        return 0;
    }
}
