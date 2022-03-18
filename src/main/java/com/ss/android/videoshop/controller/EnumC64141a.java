package com.ss.android.videoshop.controller;

import android.util.SparseArray;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: com.ss.android.videoshop.controller.a */
enum EnumC64141a {
    PLAY(101),
    PAUSE(102),
    RELEASE(103),
    SEEK(104),
    UPDATE_PROGRESS(201),
    VIDEO_SIZE_CHANGED(202),
    INIT_PLAY(SmEvents.EVENT_HBRESET),
    PLAY_START(204),
    FETCH_VIDEO_MODEL(SmEvents.EVENT_HB_NOTICE_DISCONNECT),
    PREPARE(SmEvents.EVENT_NONET),
    PREPARED(207),
    RENDER_START(208),
    VIDEO_PLAY(209),
    VIDEO_PAUSE(210),
    PLAYBACK_STATE_CHANGED(211),
    LOAD_STATE_CHANGED(TTVideoEngine.PLAYER_OPTION_SET_SUPER_RES_STRENGTH),
    BUFFER_START(213),
    BUFFER_COUNT(SmEvents.EVENT_FT),
    BUFFERING_UPDATE(SmEvents.EVENT_HEARTBEAT_INVALID),
    BUFFER_END(SmEvents.EVENT_MEETING_LICENSE_TIME_OUT),
    STREAM_CHANGED(SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST),
    VIDEO_PRE_COMPLETED(SmEvents.EVENT_AUTO_END),
    VIDEO_COMPLETED(219),
    VIDEO_PRE_RELEASE(220),
    VIDEO_RELEASED(221),
    ERROR(222),
    RESOLUTION_CHANGED(223),
    PRE_FULLSCREEN(224),
    FULLSCREEN(225),
    INTERCEPT_FULLSCREEN(226),
    EXEC_COMMAND(227),
    VIDEO_STATUS_EXCEPTION(228),
    PRE_VIDEO_SEEK(229),
    SEEK_START(230),
    SEEK_COMPLETE(231),
    RENDER_SEEK_COMPLETE(232),
    REPLAY(233),
    RETRY(234),
    STREAM_BITRATE_CHANGED(235),
    UPDATE_VIDEO_SIZE(301),
    VIDEO_THREAD_QUIT(302);
    

    /* renamed from: a */
    private static SparseArray<EnumC64141a> f161980a = new SparseArray<>();
    private int what;

    public int getWhat() {
        m251861a();
        return this.what;
    }

    /* renamed from: a */
    private static void m251861a() {
        if (f161980a.size() <= 0) {
            EnumC64141a[] values = values();
            for (EnumC64141a aVar : values) {
                f161980a.put(aVar.what, aVar);
            }
        }
    }

    public static EnumC64141a getMsg(int i) {
        m251861a();
        return f161980a.get(i);
    }

    private EnumC64141a(int i) {
        this.what = i;
    }
}
