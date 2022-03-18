package com.ss.video.rtc.meeting;

public class MeetingResourceFinderAdapter {
    public static IRtcResourceFinder sFinder;

    public static void ReleaseNativeResourceFinder(long j) {
        sFinder.release(j);
    }

    public static long CreateNativeResourceFinder(long j) {
        IRtcResourceFinder iRtcResourceFinder;
        if (j == 0 || (iRtcResourceFinder = sFinder) == null) {
            return 0;
        }
        return iRtcResourceFinder.createNativeResourceFinder(j);
    }
}
