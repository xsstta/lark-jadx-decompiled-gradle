package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.ByteStream;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import java.nio.ByteBuffer;

public abstract class IRtcRoomEventHandler {
    public void onAudioFramePlayStateChanged(IRtcEngineEventHandler.RtcUser rtcUser, IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(IRtcEngineEventHandler.RtcUser rtcUser, IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState) {
    }

    public abstract void onAudioQuality(String str, int i, short s, short s2);

    public abstract void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i, int i2);

    public abstract void onConnectionInterrupted();

    public abstract void onConnectionLost();

    public abstract void onError(int i);

    public abstract void onFirstLocalAudioFrame(int i);

    public abstract void onFirstLocalScreenFrame(int i, int i2, int i3);

    public abstract void onFirstLocalVideoFrame(int i, int i2, int i3);

    public abstract void onFirstRemoteAudioFrame(String str, int i);

    public abstract void onFirstRemoteScreenFrame(String str, int i, int i2, int i3);

    public abstract void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3);

    public abstract void onFirstRemoteVideoFrame(String str, int i, int i2, int i3);

    public abstract void onJoinRoomSuccess(String str, String str2, int i);

    public abstract void onLeaveRoom(IRtcEngineEventHandler.RtcStats rtcStats);

    public void onLocalAudioStateChanged(int i, int i2) {
    }

    public abstract void onLocalAudioStats(IRtcEngineEventHandler.LocalAudioStats localAudioStats);

    public void onLocalVideoStateChanged(int i, int i2) {
    }

    public abstract void onLocalVideoStats(IRtcEngineEventHandler.LocalVideoStats localVideoStats);

    public abstract void onLoginCompletion(int i, ByteStream[] byteStreamArr);

    public abstract void onNetworkQuality(String str, int i, int i2);

    public abstract void onRejoinRoomSuccess(String str, String str2, int i);

    public void onRemoteAudioStateChanged(String str, int i, int i2, int i3) {
    }

    public abstract void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats);

    public void onRemoteStreamSwitch(IRtcEngineEventHandler.RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onRemoteVideoStateChanged(String str, int i, int i2, int i3) {
    }

    public abstract void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats);

    public abstract void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer);

    public abstract void onRoomMessageReceived(String str, String str2);

    public abstract void onRoomMessageSendResult(long j, int i);

    public abstract void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats);

    public void onScreenVideoFramePlayStateChanged(IRtcEngineEventHandler.RtcUser rtcUser, IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(IRtcEngineEventHandler.RtcUser rtcUser, IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState) {
    }

    public abstract void onStreamAdd(ByteStream byteStream);

    public abstract void onStreamPublishSucceed(String str, boolean z);

    public abstract void onStreamPublished(String str, int i);

    public abstract void onStreamRemove(ByteStream byteStream, IRtcEngineEventHandler.RtcStreamRemoveReason rtcStreamRemoveReason);

    public abstract void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig);

    public abstract void onStreamUnpublished(String str);

    public void onSubscribe(String str, boolean z) {
    }

    public abstract void onTranscodingError(String str, int i);

    public void onUnSubscribe(String str, boolean z) {
    }

    public abstract void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer);

    public abstract void onUserEnableLocalAudio(String str, boolean z);

    public abstract void onUserEnableLocalVideo(String str, boolean z);

    public abstract void onUserJoined(String str, int i);

    public abstract void onUserMessageReceived(String str, String str2);

    public abstract void onUserMessageSendResult(long j, int i);

    public abstract void onUserMuteAudio(String str, boolean z);

    public abstract void onUserMuteVideo(String str, boolean z);

    public abstract void onUserOffline(String str, int i);

    public void onVideoFramePlayStateChanged(IRtcEngineEventHandler.RtcUser rtcUser, IRtcEngineEventHandler.FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(IRtcEngineEventHandler.RtcUser rtcUser, IRtcEngineEventHandler.FirstFrameSendState firstFrameSendState) {
    }

    public abstract void onVideoSizeChanged(String str, int i, int i2, int i3);

    public abstract void onWarning(int i);
}
