package com.ss.video.rtc.meeting;

import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.utils.LogUtil;

/* renamed from: com.ss.video.rtc.meeting.-$$Lambda$MeetingRtcEngineImpl$77guItqOuNrR7z_EoBxME1-oW2k  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MeetingRtcEngineImpl$77guItqOuNrR7z_EoBxME1oW2k implements LogUtil.LoggerSink {
    public static final /* synthetic */ $$Lambda$MeetingRtcEngineImpl$77guItqOuNrR7z_EoBxME1oW2k INSTANCE = new $$Lambda$MeetingRtcEngineImpl$77guItqOuNrR7z_EoBxME1oW2k();

    private /* synthetic */ $$Lambda$MeetingRtcEngineImpl$77guItqOuNrR7z_EoBxME1oW2k() {
    }

    @Override // com.ss.video.rtc.engine.utils.LogUtil.LoggerSink
    public final void onLoggerMessage(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th) {
        MeetingRtcEngineImpl.lambda$new$1(rtcLogLevel, str, th);
    }
}
