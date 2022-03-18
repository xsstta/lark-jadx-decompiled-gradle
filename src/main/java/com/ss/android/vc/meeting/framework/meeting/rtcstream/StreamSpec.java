package com.ss.android.vc.meeting.framework.meeting.rtcstream;

public class StreamSpec {

    public enum Resolution {
        UNKNOWN,
        FULL_SCREEN,
        HALF_SCREEN,
        QUATER_SCREEN,
        FLOAT_WINDOW
    }

    public enum Scene {
        UNKNOWN,
        GRID_VIEW,
        GALLERY_VIEW,
        SHARE_SCREEN,
        MEETING_FLOAT_VIEW,
        MEETING_FULL_VIEW,
        GLOBAL_FLOAT_WINDOW
    }
}
