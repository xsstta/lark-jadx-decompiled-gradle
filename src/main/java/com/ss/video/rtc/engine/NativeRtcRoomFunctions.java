package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.handler.ByteRtcRoomEventHandler;

public class NativeRtcRoomFunctions {
    public static native void nativeDestory(long j);

    public static native void nativeDisableLiveTranscoding(long j);

    public static native void nativeEnableAudioVolumeIndication(long j, int i, int i2);

    public static native void nativeEnableLiveTranscoding(long j, String str);

    public static native void nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native int nativeJoinRoom(long j, String str, String str2, String str3);

    public static native void nativeLeaveRoom(long j);

    public static native void nativeMuteAllRemoteAudioStreams(long j);

    public static native void nativeMuteAllRemoteVideoStreams(long j);

    public static native void nativeMuteRemoteAudioStream(long j, String str);

    public static native void nativeMuteRemoteVideoStream(long j, String str);

    public static native void nativePublish(long j);

    public static native void nativePublishScreen(long j);

    public static native void nativeReleaseRTCRoomEventHandler(long j);

    public static native void nativeRenewToken(long j, String str);

    public static native void nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native void nativeSendRoomMessage(long j, String str);

    public static native void nativeSendUserBinaryMessage(long j, String str, byte[] bArr);

    public static native void nativeSendUserMessage(long j, String str, String str2);

    public static native void nativeSetAutoSubscribe(long j, int i, int i2);

    public static native void nativeSetChannelProfile(long j, int i);

    public static native void nativeSetClientRole(long j, int i);

    public static native void nativeSetCustomUserRole(long j, String str);

    public static native void nativeSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    public static native void nativeSetDefaultMuteAllRemoteVideoStreams(long j, boolean z);

    public static native long nativeSetRTCRoomEventHandler(long j, ByteRtcRoomEventHandler byteRtcRoomEventHandler);

    public static native void nativeSetVideoCompositingLayout(long j, String str);

    public static native void nativeSetupRemoteScreen(long j, VideoCanvas videoCanvas);

    public static native void nativeSetupRemoteVideo(long j, VideoCanvas videoCanvas);

    public static native void nativeSubscribe(long j, String str, SubscribeConfig subscribeConfig);

    public static native void nativeUnmuteAllRemoteAudioStreams(long j);

    public static native void nativeUnmuteAllRemoteVideoStreams(long j);

    public static native void nativeUnmuteRemoteAudioStream(long j, String str);

    public static native void nativeUnmuteRemoteVideoStream(long j, String str);

    public static native void nativeUnpublish(long j);

    public static native void nativeUnpublishScreen(long j);

    public static native void nativeUnsubscribe(long j, String str, boolean z);
}
