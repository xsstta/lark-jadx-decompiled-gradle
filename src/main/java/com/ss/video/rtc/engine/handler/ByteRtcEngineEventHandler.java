package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.ByteStream;
import com.ss.video.rtc.engine.InternalAudioVolumeInfo;
import com.ss.video.rtc.engine.InternalLocalAudioStats;
import com.ss.video.rtc.engine.InternalLocalVideoStats;
import com.ss.video.rtc.engine.InternalRemoteAudioStats;
import com.ss.video.rtc.engine.InternalRemoteStreamSwitch;
import com.ss.video.rtc.engine.InternalRemoteVideoStats;
import com.ss.video.rtc.engine.InternalRtcStats;
import com.ss.video.rtc.engine.InternalRtcUser;
import com.ss.video.rtc.engine.InternalSourceWantedData;
import com.ss.video.rtc.engine.RtcEngine;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.SubscribeState;
import com.ss.video.rtc.engine.SysStats;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class ByteRtcEngineEventHandler {
    private long mJoinChannelTime;
    private String mRoom;
    private WeakReference<C65562RtcEngineImpl> mRtcEngineImpl;
    private String mSession;
    private State mState = State.IDLE;
    private String mUser;

    private enum State {
        IDLE,
        IN_ROOM
    }

    public void onAudioMixingFinished() {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioMixingFinished...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingFinished();
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioMixingFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionInterrupted() {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionInterrupt...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionInterrupted();
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onConnectionInterrupted callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionLost() {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionLost...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionLost();
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onConnectionLost callback catch exception.\n" + e.getMessage());
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onLeaveChannel(InternalRtcStats internalRtcStats) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLeaveChannel...");
    }

    public ByteRtcEngineEventHandler(C65562RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rtcEngineImpl);
    }

    public void onLocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioStats...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStats(new IRtcEngineEventHandler.LocalAudioStats(internalLocalAudioStats));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onLocalAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalVideoStats...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStats(new IRtcEngineEventHandler.LocalVideoStats(internalLocalVideoStats));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onLocalVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteVideoStats...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStats(new IRtcEngineEventHandler.RemoteVideoStats(internalRemoteVideoStats));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRtcStats(InternalRtcStats internalRtcStats) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRtcStats...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRtcStats(new IRtcEngineEventHandler.RtcStats(internalRtcStats));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamAdd(ByteStream byteStream) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamAdd...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamAdd(byteStream);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onStreamAdd callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSysStats(SysStats sysStats) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onSysStats...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSysStats(sysStats);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onSysStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onActiveSpeaker(String str) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onActiveSpeaker...uid: " + str);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onActiveSpeaker(str);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onActiveSpeaker callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioEffectFinished(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioEffectFinished...soundId: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioEffectFinished(i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioEffectFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioRouteChanged(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioRouteChanged...routing: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioRouteChanged(i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioRouteChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionStateChanged(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257132i("ByteRtcEngineEventHandler", "onConnectionStateChanged, state: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionStateChanged(i, -1);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onConnectionStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onError(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onError...errorNum: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onError(i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalAudioFrame(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalAudioFrame...elapsed: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalAudioFrame(i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMirrorStateChanged(boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onMirrorStateChanged: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMirrorStateChanged(z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onMirrorStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkTypeChanged(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257132i("ByteRtcEngineEventHandler", "onNetworkTypeChanged, type: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTypeChanged(i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onNetworkTypeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteAudioStats...");
        int i = 0;
        try {
            int i2 = internalRemoteAudioStats.quality;
            if (i2 == -1) {
                i = 6;
            } else if (i2 == 0) {
                i = 5;
            } else if (i2 == 1) {
                i = 4;
            } else if (i2 == 2) {
                i = 3;
            } else if (i2 == 3) {
                i = 2;
            } else if (i2 == 4) {
                i = 1;
            }
            internalRemoteAudioStats.quality = i;
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStats(new IRtcEngineEventHandler.RemoteAudioStats(internalRemoteAudioStats));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onResponse(String str) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onResponse, res: " + str);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onResponse(str);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onResponse callback catch exception.\n" + e.getMessage());
        }
    }

    public void onWarning(int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onWarning, warnNum: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onWarning(i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteStreamSwitch, uid: " + internalRemoteStreamSwitch.uid + ", isScreen: " + internalRemoteStreamSwitch.isScreen + ", before_video_index: " + internalRemoteStreamSwitch.before_video_index + ", after_video_index: " + internalRemoteStreamSwitch.after_video_index + ", before_enable: " + internalRemoteStreamSwitch.before_enable + ", after_enable: " + internalRemoteStreamSwitch.after_enable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteStreamSwitch(new IRtcEngineEventHandler.RemoteStreamSwitch(internalRemoteStreamSwitch));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteStreamSwitch callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioStateChanged(int i, int i2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioStateChanged...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStateChanged(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStateChanged(int i, int i2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalVideoStateChanged...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStateChanged(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamPublishSucceed(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamPublishSucceed...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamPublishSucceed(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onStreamPublishSucceed callback catch exception.\n" + e.getMessage());
        }
    }

    public void OnTranscodingError(String str, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        if (i == 0) {
            i = 0;
        } else if (i == 1) {
            i = 1;
        } else if (i == 2) {
            i = 2;
        } else if (i == 3) {
            i = 3;
        } else if (i == 4) {
            i = 4;
        }
        LogUtil.m257129d("ByteRtcEngineEventHandler", "OnTranscodingError error(" + i + ") url:" + str);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamPublished(str, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "OnTranscodingError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioFramePlayStateChanged(InternalRtcUser internalRtcUser, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioFramePlayStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        }
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRtcUser internalRtcUser, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioFrameSendStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        }
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFrameSendStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        try {
            IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRtcEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i2 = 0; i2 < internalAudioVolumeInfoArr.length; i2++) {
                audioVolumeInfoArr[i2] = new IRtcEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i2]);
            }
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (!(rtcEngineImpl == null || (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) == null)) {
                rtcEngineHandler.onAudioVolumeIndication(audioVolumeInfoArr, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteAudioFrame(String str, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteAudioFrame...uid: " + str + ", elapsed: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteAudioFrame(str, (long) i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLogReport(String str, String str2) {
        IRtcEngineEventHandler rtcEngineHandler;
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
                    if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                        rtcEngineHandler.onLogReport(str, jSONObject);
                    }
                } catch (JSONException e) {
                    LogUtil.m257129d("ByteRtcEngineEventHandler", "onLogReport...parse json catch exception: " + e.getMessage());
                }
            } else {
                LogUtil.m257132i(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onLogReport callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLoginCompletion(int i, ByteStream[] byteStreamArr) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLoginCompletion, errorCode: " + i + ", listStream: " + Arrays.toString(byteStreamArr));
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLoginCompletion(i, byteStreamArr);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onLoginCompletion callback catch exception.\n" + e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r7 != 3) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[Catch:{ Exception -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMediaDeviceStateChanged(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.handler.ByteRtcEngineEventHandler.onMediaDeviceStateChanged(int, int):void");
    }

    public void onMuteAllRemoteAudio(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onMuteAllRemoteAudio... uid: " + str + ", muted: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onMuteAllRemoteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMuteAllRemoteVideo(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onMuteAllRemoteVideo... uid: " + str + ", muted: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteVideo(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onMuteAllRemoteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onPerformanceAlarms(int i, InternalSourceWantedData internalSourceWantedData) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onPerformanceAlarms, level: " + i + ", data: " + internalSourceWantedData);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPerformanceAlarms(i, new IRtcEngineEventHandler.SourceWantedData(internalSourceWantedData));
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onPerformanceAlarms callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteUserAudioRecvModeChange(String str, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "remote user audio recv mode change: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioRecvModeChange(str, RtcEngine.RangeAudioMode.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteUserAudioRecvModeChange callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteUserAudioSendModeChange(String str, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "remote user audio send mode change: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioSendModeChange(str, RtcEngine.RangeAudioMode.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteUserAudioSendModeChange callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRoomBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRoomMessageReceived: " + str2);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageReceived(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRoomMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRoomMessageSendResult: " + j + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageSendResult(j, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRoomMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onScreenStreamRemove(String str, String str2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onScreenStreamRemove...uid: " + str + ", streamInfo: " + str2);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenStreamRemove(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onScreenStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRtcUser internalRtcUser, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onScreenVideoFramePlayStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        }
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFramePlayStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRtcUser internalRtcUser, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onScreenVideoFrameSendStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        }
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFrameSendStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onStreamRemove(ByteStream byteStream, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamRemove...uid: " + byteStream.userId);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamRemove(byteStream, IRtcEngineEventHandler.RtcStreamRemoveReason.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSubscribe(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSubscribe(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onSubsribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUnSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUnSubscribe(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUnSubscribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserBinaryMessageReceived: " + str + byteBuffer.capacity());
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserEnableLocalAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableLocalVideo... uid: " + str + ", enabled: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserEnableLocalVideo(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserEnableLocalVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserJoined(String str, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserJoined... uid: " + str + ", elapsed: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserJoined(str, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMessageReceived: " + str + str2);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceived(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMessageSendResult: " + j + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResult(j, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteAudio(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMuteAudio... uid: " + str + ", muted: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserMuteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteVideo(String str, boolean z) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteVideo(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserMuteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserOffline(String str, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserOffline... uid: " + str + ", reason: " + i);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserOffline(str, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onUserOffline callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoFramePlayStateChanged(InternalRtcUser internalRtcUser, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoFramePlayStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        }
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRtcUser internalRtcUser, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoFrameSendStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        }
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onStreamRemove(String str, String str2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamRemove...uid: " + str + ", streamInfo: " + str2);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamRemove(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onStreamRemove 2 callback catch exception.\n" + e.getMessage());
        }
    }

    public void onJoinChannelSuccess(String str, String str2, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "OnJoinChannelSuccess...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onJoinChannelSuccess(str, str2, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "OnJoinChannelSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkQuality(String str, int i, int i2) {
        IRtcEngineEventHandler rtcEngineHandler;
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkQuality(str, i, i2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onNetworkQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRejoinChannelSuccess(String str, String str2, int i) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "OnRejoinChannelSuccess...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRejoinChannelSuccess(str, str2, i);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "OnRejoinChannelSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamSubscribed...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSubscribed(SubscribeState.values()[i], str, subscribeConfig);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onStreamSubscribed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalScreenFrame...width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalScreenFrame(i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstLocalScreenFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalVideoFrame...width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalVideoFrame(i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStateChanged(String str, int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteAudioStateChanged...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStateChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStateChanged(String str, int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteVideoStateChanged...");
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStateChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onRemoteVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioQuality...uid: " + str + ", quality: " + i + ", delay: " + ((int) s) + ", lost: " + ((int) s2));
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioQuality(str, i, s, s2);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onAudioQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteScreenFrame...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteScreenFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstRemoteScreenFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteVideoDecoded...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoDecoded(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstRemoteVideoDecoded callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteVideoFrame...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onFirstRemoteVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
        IRtcEngineEventHandler rtcEngineHandler;
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoSizeChanged...udi: " + str + ", width: " + i + ", height: " + i2 + ", rotation: " + i3);
        try {
            C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
            if (rtcEngineImpl != null && (rtcEngineHandler = rtcEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoSizeChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257130e("ByteRtcEngineEventHandler", "onVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }
}
