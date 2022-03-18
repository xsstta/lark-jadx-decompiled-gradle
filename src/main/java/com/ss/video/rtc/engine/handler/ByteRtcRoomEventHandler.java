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
import com.ss.video.rtc.engine.RtcRoom;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

public class ByteRtcRoomEventHandler {
    private RtcRoom mRtcRoom;

    public void onConnectionInterrupted() {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onConnectionInterrupt...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onConnectionInterrupted();
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onConnectionInterrupted callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionLost() {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onConnectionLost...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onConnectionLost();
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onConnectionLost callback catch exception.\n" + e.getMessage());
        }
    }

    public ByteRtcRoomEventHandler(RtcRoom rtcRoom) {
        this.mRtcRoom = rtcRoom;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onError(int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onError...errorNum: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onError(i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalAudioFrame(int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstLocalAudioFrame...elapsed: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalAudioFrame(i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLeaveRoom(InternalRtcStats internalRtcStats) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onLeaveRoom...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLeaveRoom(new IRtcEngineEventHandler.RtcStats(internalRtcStats));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onLeaveRoom callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalAudioStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalAudioStats(new IRtcEngineEventHandler.LocalAudioStats(internalLocalAudioStats));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalVideoStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalVideoStats(new IRtcEngineEventHandler.LocalVideoStats(internalLocalVideoStats));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteVideoStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteVideoStats(new IRtcEngineEventHandler.RemoteVideoStats(internalRemoteVideoStats));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRtcStats(InternalRtcStats internalRtcStats) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRtcStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRtcStats(new IRtcEngineEventHandler.RtcStats(internalRtcStats));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamAdd(ByteStream byteStream) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamAdd...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamAdd(byteStream);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamAdd callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamUnpublished(String str) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamUnpublished url:" + str);
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamUnpublished(str);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamUnpublished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onWarning(int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onWarning, warnNum: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onWarning(i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteAudioStats...");
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
            this.mRtcRoom.getRtcRoomHandler().onRemoteAudioStats(new IRtcEngineEventHandler.RemoteAudioStats(internalRemoteAudioStats));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteStreamSwitch, uid: " + internalRemoteStreamSwitch.uid + ", before_video_index: " + internalRemoteStreamSwitch.before_video_index + ", after_video_index: " + internalRemoteStreamSwitch.after_video_index + ", before_enable: " + internalRemoteStreamSwitch.before_enable + ", after_enable: " + internalRemoteStreamSwitch.after_enable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteStreamSwitch(new IRtcEngineEventHandler.RemoteStreamSwitch(internalRemoteStreamSwitch));
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteStreamSwitch callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioFramePlayStateChanged(InternalRtcUser internalRtcUser, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioFramePlayStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioFramePlayStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRtcUser internalRtcUser, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioFrameSendStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioFrameSendStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onLocalAudioStateChanged(int i, int i2) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalAudioStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalAudioStateChanged(i, i2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStateChanged(int i, int i2) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalVideoStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalVideoStateChanged(i, i2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLoginCompletion(int i, ByteStream[] byteStreamArr) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onLoginCompletion");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLoginCompletion(i, byteStreamArr);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onLoginCompletion callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRoomBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRoomMessageReceived: " + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(str, str2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRoomMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRoomMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageSendResult(j, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRoomMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRtcUser internalRtcUser, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onScreenVideoFramePlayStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onScreenVideoFramePlayStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRtcUser internalRtcUser, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onScreenVideoFrameSendStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onScreenVideoFrameSendStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onStreamPublishSucceed(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamPublishSucceed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublishSucceed(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamPublishSucceed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageSendResult(j, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoFramePlayStateChanged(InternalRtcUser internalRtcUser, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onVideoFramePlayStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRtcEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoFramePlayStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRtcUser internalRtcUser, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onVideoFrameSendStateChanged, user: " + internalRtcUser + ", state: " + i);
        IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRtcEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoFrameSendStateChanged(new IRtcEngineEventHandler.RtcUser(internalRtcUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onFirstRemoteAudioFrame(String str, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteAudioFrame...uid: " + str + ", elapsed: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteAudioFrame(str, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamPublished(String str, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamPublished error(" + i + ") url:" + str);
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublished(str, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamPublished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamRemove(ByteStream byteStream, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamRemove...uid: " + byteStream.userId);
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamRemove(byteStream, IRtcEngineEventHandler.RtcStreamRemoveReason.values()[i]);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSubscribe(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubscribe(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onSubscribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onTranscodingError(String str, int i) {
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
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onTranscodingError error(" + i + ") url:" + str);
        try {
            this.mRtcRoom.getRtcRoomHandler().onTranscodingError(str, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onTranscodingError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUnSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUnSubscribe(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUnSubscribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserBinaryMessageReceived: uid:" + str + "binary message length" + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserEnableLocalAudio(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserEnableLocalVideo... uid: " + str + ", enabled: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserEnableLocalVideo(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserEnableLocalVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserJoined(String str, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserJoined... uid: " + str + ", elapsed: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserJoined(str, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMessageReceived: uid:" + str + "message" + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(str, str2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteAudio(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMuteAudio... uid: " + str + ", muted: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMuteAudio(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMuteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteVideo(String str, boolean z) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMuteVideo(str, z);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserMuteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserOffline(String str, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserOffline... uid: " + str + ", reason: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserOffline(str, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onUserOffline callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i, int i2) {
        try {
            IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRtcEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i3 = 0; i3 < internalAudioVolumeInfoArr.length; i3++) {
                audioVolumeInfoArr[i3] = new IRtcEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i3]);
            }
            this.mRtcRoom.getRtcRoomHandler().onAudioVolumeIndication(audioVolumeInfoArr, i, i2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onJoinRoomSuccess(String str, String str2, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onJoinRoomSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onJoinRoomSuccess(str, str2, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onJoinRoomSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkQuality(String str, int i, int i2) {
        try {
            this.mRtcRoom.getRtcRoomHandler().onNetworkQuality(str, i, i2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onNetworkQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRejoinRoomSuccess(String str, String str2, int i) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "OnRejoinChannelSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRejoinRoomSuccess(str, str2, i);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "OnRejoinChannelSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamSubscribed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamSubscribed(i, str, subscribeConfig);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onStreamSubscribed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstLocalScreenFrame...width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalScreenFrame(i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstLocalScreenFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstLocalVideoFrame...width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalVideoFrame(i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStateChanged(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteAudioStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteAudioStateChanged(str, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStateChanged(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteVideoStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteVideoStateChanged(str, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onRemoteVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioQuality...uid: " + str + ", quality: " + i + ", delay: " + ((int) s) + ", lost: " + ((int) s2));
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioQuality(str, i, s, s2);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onAudioQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteScreenFrame...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteScreenFrame(str, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteScreenFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteVideoDecoded...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteVideoDecoded(str, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteVideoDecoded callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteVideoFrame...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteVideoFrame(str, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onFirstRemoteVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcRoomEventHandler", "onVideoSizeChanged...udi: " + str + ", width: " + i + ", height: " + i2 + ", rotation: " + i3);
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoSizeChanged(str, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcRoomEventHandler", "onVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }
}
