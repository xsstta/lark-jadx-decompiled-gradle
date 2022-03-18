package com.ss.video.rtc.engine;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.video.rtc.engine.handler.ByteRtcAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcAudioFrameObserver;
import com.ss.video.rtc.engine.handler.ByteRtcEngineEncryptHandler;
import com.ss.video.rtc.engine.handler.ByteRtcEngineEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcEngineInternalEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcMetadataObserver;
import com.ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver;
import com.ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.utils.RtcRunnable;
import com.ss.video.rtc.engine.utils.VideoFrameConverter;
import java.nio.ByteBuffer;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

public final class NativeFunctions {
    public static native void nativeAddVideoEffectPath(long j, String[] strArr);

    public static native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    public static native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    public static native int nativeAdjustAudioMixingVolume(long j, int i);

    public static native void nativeAdjustPlaybackSignalVolume(long j, int i);

    public static native void nativeAdjustRecordingSignalVolume(long j, int i);

    public static native void nativeAdjustRemoteAudioVolume(long j, String str, int i);

    public static native int nativeCheckVideoEffectLicense(Context context, long j, String str);

    public static native long nativeCreateAudioDeviceManager(ByteRtcAudioDeviceEventHandler byteRtcAudioDeviceEventHandler);

    public static native long nativeCreateByteRtcEngine(Context context, String str, ByteRtcEngineEventHandler byteRtcEngineEventHandler, EglBase.Context context2, long j, String str2);

    public static native long nativeCreateRtcRoom(long j, String str);

    public static native void nativeDestroyByteRtcEngine(long j);

    public static native void nativeDisableLiveTranscoding(long j);

    public static native int nativeEnableAudioVolumeIndication(long j, int i, int i2);

    public static native int nativeEnableAutoSubscribe(long j, int i, int i2);

    public static native void nativeEnableLiveTranscoding(long j, String str);

    public static native int nativeEnableLocalAudio(long j, boolean z);

    public static native int nativeEnableLocalVideo(long j, boolean z);

    public static native void nativeEnablePerformanceCollect(boolean z);

    public static native int nativeEnableRangeAudio(long j, boolean z);

    public static native int nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native int nativeEnableVideoEffect(long j, boolean z);

    public static native int nativeGetAudioMixingCurrentPosition(long j);

    public static native int nativeGetAudioMixingDuration(long j);

    public static native int nativeGetAudioMixingStreamCachedFrameNum(long j);

    public static native int nativeGetEffectVolume(long j, int i);

    public static native String nativeGetErrorDescription(int i);

    public static native String nativeGetSDKVersion();

    public static native VideoFrameConverter nativeGetVideoFrameConverter();

    public static native int nativeHttpClientCallback(int i, int i2, int i3, String str);

    public static native void nativeInitVideoEffect(long j, String str);

    public static native void nativeInvokeWorkerUninterruptibly(long j, RtcRunnable rtcRunnable);

    public static native boolean nativeIsMirror(long j);

    public static native int nativeJoinChannel(long j, String str, String str2, String str3, String str4, String str5);

    public static native int nativeLeaveChannel(long j);

    public static native int nativeMuteAllRemoteAudioStreams(long j, boolean z);

    public static native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    public static native int nativeMuteLocalAudioStream(long j, boolean z);

    public static native int nativeMuteLocalVideoStream(long j, boolean z);

    public static native int nativeMuteRemoteAudioStream(long j, String str, boolean z);

    public static native int nativeMuteRemoteVideoStream(long j, String str, boolean z);

    public static native void nativeOnCapturerStarted(long j, boolean z);

    public static native void nativeOnCapturerStopped(long j);

    public static native void nativeOnFrameCaptured(long j, VideoFrame videoFrame);

    public static native int nativePauseAllEffects(long j);

    public static native int nativePauseAudioMixing(long j);

    public static native int nativePauseEffect(long j, int i);

    public static native int nativePlayEffect(long j, int i, String str, boolean z, int i2, int i3);

    public static native int nativePreloadEffect(long j, int i, String str);

    public static native int nativePublishScreen(long j);

    public static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushAudioMixingStreamData(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalVideoFrame(long j, VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j2);

    public static native boolean nativePushScreenFrame(long j, VideoFrame videoFrame);

    public static native void nativeRegisterInternalEventObserver(long j, ByteRtcEngineInternalEventHandler byteRtcEngineInternalEventHandler);

    public static native void nativeRegisterVideoFrameObserver(long j, ByteRtcVideoFrameObserver byteRtcVideoFrameObserver);

    public static native void nativeRemoveVideoEffectPath(long j, String[] strArr);

    public static native int nativeRenewToken(long j, String str);

    public static native int nativeResumeAllEffects(long j);

    public static native int nativeResumeAudioMixing(long j);

    public static native int nativeResumeEffect(long j, int i);

    public static native int nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native int nativeSendRoomMessage(long j, String str);

    public static native long nativeSendUserBinaryMessage(long j, String str, byte[] bArr);

    public static native long nativeSendUserMessage(long j, String str, String str2);

    public static native void nativeSetAppState(long j, String str);

    public static native void nativeSetAudioDeviceObserver(long j, EngineAudioDeviceEventHandler engineAudioDeviceEventHandler);

    public static native void nativeSetAudioFrameObserver(long j, ByteRtcAudioFrameObserver byteRtcAudioFrameObserver);

    public static native int nativeSetAudioMixingPosition(long j, int i);

    public static native void nativeSetAudioPerfProfile(long j, int i);

    public static native void nativeSetAudioPlayoutMixStream(long j, boolean z, int i, int i2);

    public static native int nativeSetAudioRecvMode(long j, int i);

    public static native int nativeSetAudioSendMode(long j, int i);

    public static native int nativeSetBusinessId(long j, String str);

    public static native int nativeSetByteRtcEnv(int i);

    public static native int nativeSetChannelProfile(long j, int i);

    public static native int nativeSetClientRole(long j, int i);

    public static native void nativeSetCustomizeEncryptHandler(long j, ByteRtcEngineEncryptHandler byteRtcEngineEncryptHandler);

    public static native int nativeSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    public static native int nativeSetDefaultMuteAllRemoteVideoStreams(long j, boolean z);

    public static native int nativeSetDeviceId(String str);

    public static native int nativeSetEffectsVolume(long j, int i);

    public static native int nativeSetEnableSpeakerphone(long j, boolean z);

    public static native void nativeSetEnableSpeakerphoneForTest(long j, boolean z);

    public static native void nativeSetEncryptInfo(long j, int i, String str);

    public static native void nativeSetExternalAudioDevice(long j, boolean z, int i, int i2, int i3);

    public static native void nativeSetExternalVideoSource(long j, boolean z);

    public static native int nativeSetLocalVideoMirrorMode(long j, boolean z);

    public static native void nativeSetMetadataObserver(long j, ByteRtcMetadataObserver byteRtcMetadataObserver);

    public static native int nativeSetMirror(long j, boolean z);

    public static native void nativeSetMixedAudioFrameParameters(long j, int i, int i2);

    public static native void nativeSetNetworkType(int i);

    public static native int nativeSetParameters(String str);

    public static native void nativeSetPlaybackAudioFrameParameters(long j, int i, int i2);

    public static native int nativeSetPublishFallbackOption(long j, int i);

    public static native void nativeSetRecordingAudioFrameParameters(long j, int i, int i2);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j, int i);

    public static native int nativeSetRemoteUserPriority(long j, String str, int i);

    public static native int nativeSetRtcMode(long j, int i);

    public static native void nativeSetRuntimeParameters(long j, String str);

    public static native int nativeSetTeamId(long j, String str);

    public static native void nativeSetUpperHttpClient(boolean z);

    public static native void nativeSetVideoCompositingLayout(long j, String str);

    public static native void nativeSetVideoEffectColorFilter(long j, String str);

    public static native void nativeSetVideoEffectColorFilterIntensity(long j, float f);

    public static native void nativeSetVideoEffectPath(long j, String[] strArr);

    public static native void nativeSetVideoProfiles(long j, List<InternalVideoStreamDescription> list);

    public static native int nativeSetVolumeOfEffect(long j, int i, int i2);

    public static native int nativeSetupLocalScreen(long j, View view, int i);

    public static native int nativeSetupLocalScreenSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideo(long j, View view, int i);

    public static native int nativeSetupLocalVideoSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupRemoteVideo(long j, View view, int i, String str, boolean z);

    public static native int nativeSetupRemoteVideoSink(long j, IVideoSink iVideoSink, String str, boolean z);

    public static native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeStartAudioRecordingDeviceTest(long j, int i);

    public static native int nativeStartPlaybackDeviceTest(long j, String str);

    public static native int nativeStartPreview(long j);

    public static native int nativeStartScreenSharing(long j, Intent intent, InternalScreenSharingParams internalScreenSharingParams);

    public static native int nativeStopAllEffects(long j);

    public static native void nativeStopAudioMixing(long j);

    public static native int nativeStopAudioRecordingDeviceTest(long j);

    public static native int nativeStopEffect(long j, int i);

    public static native int nativeStopPlaybackDeviceTest(long j);

    public static native int nativeStopPreview(long j);

    public static native int nativeStopScreenSharing(long j);

    public static native void nativeSubscribeStream(long j, String str, boolean z, boolean z2, boolean z3, int i);

    public static native int nativeSwitchCamera(long j);

    public static native int nativeUnSubscribe(long j, String str, boolean z);

    public static native int nativeUnloadAllEffects(long j);

    public static native int nativeUnloadEffect(long j, int i);

    public static native int nativeUnpublishScreen(long j);

    public static native int nativeUpdateAudioRecvRange(long j, int i, int i2);

    public static native void nativeUpdateCloudRending(long j, String str);

    public static native int nativeUpdateScreenSharingParameters(long j, InternalScreenSharingParams internalScreenSharingParams);

    public static native int nativeUpdateSelfPosition(long j, int i, int i2, int i3);

    public static native void nativeUpdateVideoEffect(long j, String str, String str2, float f);
}
