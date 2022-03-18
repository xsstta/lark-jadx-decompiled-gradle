package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.RtcSharedContext;
import com.ss.video.rtc.engine.utils.LogUtil;

public class EngineAudioDeviceEventHandler {
    public void onAudioDevicePlayoutStart() {
        LogUtil.m257132i("EngineAudioDeviceEventHandler", "onAudioDevicePlayoutStart...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = RtcSharedContext.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDevicePlayoutStart();
        }
    }

    public void onAudioDevicePlayoutStop() {
        LogUtil.m257132i("EngineAudioDeviceEventHandler", "onAudioDevicePlayoutStop...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = RtcSharedContext.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDevicePlayoutStop();
        }
    }

    public void onAudioDeviceRecordStart() {
        LogUtil.m257132i("EngineAudioDeviceEventHandler", "onAudioDeviceRecordStart...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = RtcSharedContext.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDeviceRecordStart();
        }
    }

    public void onAudioDeviceRecordStop() {
        LogUtil.m257132i("EngineAudioDeviceEventHandler", "onAudioDeviceRecordStop...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = RtcSharedContext.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDeviceRecordStop();
        }
    }
}
