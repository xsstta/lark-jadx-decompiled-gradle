package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.RtcEngine;
import com.ss.video.rtc.engine.handler.IRtcRoomEventHandler;
import com.ss.video.rtc.engine.live.LiveTranscoding;
import com.ss.video.rtc.engine.mediaio.IVideoSink;

public abstract class IRtcRoom {
    public abstract void destroy();

    public abstract void disableLiveTranscoding();

    public abstract void enableAudioVolumeIndication(int i, int i2);

    public abstract void enableLiveTranscoding(LiveTranscoding liveTranscoding);

    public abstract void enableSubscribeLocalStream(boolean z);

    public abstract void joinRoom(String str, PublisherConfiguration publisherConfiguration, String str2);

    public abstract void leaveRoom();

    public abstract void muteAllRemoteAudioStreams();

    public abstract void muteAllRemoteVideoStreams();

    public abstract void muteRemoteAudioStream(String str);

    public abstract void muteRemoteVideoStream(String str);

    public abstract void publish();

    public abstract void publishScreen();

    public abstract void renewToken(String str);

    public abstract void sendRoomBinaryMessage(byte[] bArr);

    public abstract void sendRoomMessage(String str);

    public abstract void sendUserBinaryMessage(String str, byte[] bArr);

    public abstract void sendUserMessage(String str, String str2);

    public abstract void setAutoSubscribe(RtcEngine.SubscribeMode subscribeMode, RtcEngine.SubscribeMode subscribeMode2);

    public abstract void setChannelProfile(RtcEngine.CHANNEL_PROFILE_TYPE channel_profile_type);

    public abstract void setClientRole(RtcEngine.CLIENT_ROLE_TYPE client_role_type);

    public abstract void setCustomUserRole(String str);

    public abstract void setDefaultMuteAllRemoteAudioStreams(boolean z);

    public abstract void setDefaultMuteAllRemoteVideoStreams(boolean z);

    public abstract void setRTCRoomEventHandler(IRtcRoomEventHandler iRtcRoomEventHandler);

    public abstract void setVideoCompositingLayout(LiveTranscoding.Layout layout);

    public abstract void setupRemoteScreen(VideoCanvas videoCanvas);

    public abstract int setupRemoteScreenRender(IVideoSink iVideoSink, String str);

    public abstract void setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str);

    public abstract void subscribe(String str, SubscribeConfig subscribeConfig);

    public abstract void unmuteAllRemoteAudioStreams();

    public abstract void unmuteAllRemoteVideoStreams();

    public abstract void unmuteRemoteAudioStream(String str);

    public abstract void unmuteRemoteVideoStream(String str);

    public abstract void unpublish();

    public abstract void unpublishScreen();

    public abstract void unsubscribe(String str, boolean z);
}
