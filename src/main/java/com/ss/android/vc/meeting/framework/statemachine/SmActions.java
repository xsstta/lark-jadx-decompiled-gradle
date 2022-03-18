package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.meeting.framework.meeting.Description;

public interface SmActions {
    @Description(desc = "")
    public static final int ACTION_CALLING_ENTRY = 123;
    @Description(desc = "")
    public static final int ACTION_CALLING_EXIT = 124;
    @Description(desc = "")
    public static final int ACTION_IDLE_ENTRY = 141;
    @Description(desc = "")
    public static final int ACTION_INIT_ENTRY = 121;
    @Description(desc = "")
    public static final int ACTION_INIT_EXIT = 122;
    @Description(desc = "")
    public static final int ACTION_ONTHECALL_ENTRY = 127;
    @Description(desc = "")
    public static final int ACTION_ONTHECALL_EXIT = 128;
    @Description(desc = "")
    public static final int ACTION_RINGING_ENTRY = 125;
    @Description(desc = "")
    public static final int ACTION_RINGING_EXIT = 126;
}
