package com.ss.video.rtc.meeting;

import android.content.Context;
import android.view.View;
import com.ss.video.rtc.engine.EffectInfo;
import com.ss.video.rtc.engine.InternalVideoStreamDescription;
import com.ss.video.rtc.engine.RtcAudioDumpSampleConfig;
import com.ss.video.rtc.engine.SubChannelInfo;
import com.ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver;
import com.ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.utils.DevicePerformanceInfo;
import java.nio.ByteBuffer;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

public final class MeetingRtcNativeFunctions {
    public static native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    public static native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    public static native int nativeAdjustAudioMixingVolume(long j, int i);

    public static native void nativeAdjustPlaybackSignalVolume(long j, int i);

    public static native void nativeAdjustRecordingSignalVolume(long j, int i);

    public static native void nativeApplyEffect(long j, EffectInfo effectInfo, int i, String str);

    public static native void nativeCancelEffect(long j, String str);

    public static native long nativeCreateByteRtcEngine(Context context, String str, MeetingRtcEngineEventHandler meetingRtcEngineEventHandler, EglBase.Context context2, long j, String str2);

    public static native void nativeDestroyByteRtcEngine(long j);

    public static native int nativeDisableAudio(long j);

    public static native int nativeDisableVideo(long j);

    public static native int nativeEnableAudio(long j);

    public static native int nativeEnableAudioVolumeIndication(long j, int i, int i2);

    public static native int nativeEnableAutoSubscribe(long j, boolean z);

    public static native void nativeEnableBackgroundBlur(long j, boolean z);

    public static native int nativeEnableEncryption(long j, boolean z);

    public static native int nativeEnableLocalAudio(long j, boolean z);

    public static native int nativeEnableLocalAudioVolumeIndication(long j, int i, int i2);

    public static native int nativeEnableLocalVideo(long j, boolean z);

    public static native void nativeEnableRNNoise(long j, boolean z);

    public static native int nativeEnableVideo(long j);

    public static native void nativeForceFlipVideo(long j, boolean z, boolean z2);

    public static native void nativeForceSetCameraRotation(long j, boolean z, boolean z2);

    public static native void nativeForceSetDecoderMode(long j, int i);

    public static native void nativeForceSetVideoProfiles(long j, List<InternalVideoStreamDescription> list);

    public static native int nativeGetAudioMixingCurrentPosition(long j);

    public static native int nativeGetAudioMixingDuration(long j);

    public static native DevicePerformanceInfo nativeGetDevicePerformanceInfo();

    public static native String nativeGetEffectSDKVersion();

    public static native int nativeGetEffectVolume(long j, int i);

    public static native int nativeGetMaxShareFpsInternal(long j);

    public static native String nativeGetSDKVersion();

    public static native void nativeI420Mirror(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native boolean nativeIsMirror(long j);

    public static native boolean nativeIsMuteLocalAudio(long j);

    public static native boolean nativeIsMuteLocalVideo(long j);

    public static native int nativeJoinBreakDownRoom(long j, String str, boolean z);

    public static native int nativeJoinChannel(long j, String str, String str2, String str3, String str4, String str5);

    public static native int nativeLeaveBreakDownRoom(long j);

    public static native int nativeLeaveChannel(long j);

    public static native int nativeMuteAllRemoteAudioStreams(long j, boolean z);

    public static native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    public static native int nativeMuteLocalAudioStream(long j, boolean z);

    public static native int nativeMuteLocalVideoStream(long j, boolean z);

    public static native int nativeMuteRemoteAudioStream(long j, String str, boolean z);

    public static native int nativeMuteRemoteVideoStream(long j, String str, boolean z);

    public static native void nativeNV21ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static native void nativeOnUsbCamFrameCaptured(long j, VideoFrame videoFrame);

    public static native int nativePauseAllEffects(long j);

    public static native int nativePauseAudioMixing(long j);

    public static native int nativePauseEffect(long j, int i);

    public static native int nativePlayEffect(long j, int i, String str, boolean z, int i2, int i3);

    public static native int nativePreloadEffect(long j, int i, String str);

    public static native int nativePublishScreen(long j);

    public static native int nativePublishScreenAudio(long j);

    public static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalVideoFrame(long j, VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j2);

    public static native boolean nativePushScreenAudioFrame(long j, byte[] bArr, int i, int i2, int i3, int i4);

    public static native boolean nativePushScreenFrame(long j, VideoFrame videoFrame);

    public static native void nativeRegisterLocalVideoFrameObserver(long j, ByteRtcVideoFrameObserver byteRtcVideoFrameObserver);

    public static native void nativeRegisterRemoteVideoFrameObserver(long j, String str, boolean z, ByteRtcVideoFrameObserver byteRtcVideoFrameObserver);

    public static native int nativeRenewToken(long j, String str);

    public static native int nativeResumeAllEffects(long j);

    public static native int nativeResumeAudioMixing(long j);

    public static native int nativeResumeEffect(long j, int i);

    public static native int nativeSendBinaryMessageToRoom(long j, byte[] bArr);

    public static native int nativeSendBinaryMessageToUser(long j, String str, byte[] bArr);

    public static native int nativeSendMessageToRoom(long j, String str);

    public static native int nativeSendMessageToUser(long j, String str, String str2);

    public static native void nativeSetAecOption(long j, int i);

    public static native void nativeSetAppState(long j, String str);

    public static native void nativeSetAppVersion(long j, String str);

    public static native int nativeSetAudioDataEventHandler(long j, MeetingRtcAudioTestObserver meetingRtcAudioTestObserver);

    public static native void nativeSetAudioDeviceObserver(long j, EngineAudioDeviceEventHandler engineAudioDeviceEventHandler);

    public static native void nativeSetAudioFrameObserver(long j, MeetingRtcAudioFrameObserver meetingRtcAudioFrameObserver);

    public static native int nativeSetAudioMixingPosition(long j, int i);

    public static native void nativeSetBackgroundImage(long j, String str);

    public static native void nativeSetBuiltInResourcePath(String str);

    public static native int nativeSetCaptureDevice(long j, int i);

    public static native void nativeSetChannelProfile(long j, int i);

    public static native int nativeSetClientRole(long j, int i);

    public static native int nativeSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    public static native int nativeSetDefaultMuteAllRemoteVideoStreams(long j, boolean z);

    public static native int nativeSetDeviceId(String str);

    public static native void nativeSetDeviceOrientation(long j, int i);

    public static native int nativeSetEffectsVolume(long j, int i);

    public static native int nativeSetEnableSpeakerphone(long j, boolean z);

    public static native void nativeSetExternalAudioDevice(long j, boolean z, int i, int i2, int i3);

    public static native void nativeSetExternalVideoSource(long j, boolean z);

    public static native void nativeSetFaceBeautyLevel(long j, int i);

    public static native void nativeSetHighpassFilterEnable(long j, boolean z);

    public static native void nativeSetHostName(String str);

    public static native void nativeSetIsUsingTTnet(boolean z);

    public static native void nativeSetLogLevel(int i);

    public static native void nativeSetLogPath(String str);

    public static native int nativeSetMediaServerIP(long j, String str);

    public static native void nativeSetMeetingMetadataObserver(long j, MeetingRtcMetadataObserver meetingRtcMetadataObserver);

    public static native int nativeSetMetadataObserver(long j, MeetingRtcMetadataObserver meetingRtcMetadataObserver);

    public static native void nativeSetMicphoneName(long j, String str);

    public static native int nativeSetMirror(long j, boolean z);

    public static native void nativeSetNetworkType(long j, int i);

    public static native void nativeSetNsOption(long j, int i);

    public static native void nativeSetPlaybackDigitalMute(long j, boolean z);

    public static native void nativeSetProxyInfo(int i, String str, int i2, String str2, String str3);

    public static native int nativeSetPublishChannel(long j, String str);

    public static native int nativeSetPublishSpecialStream(long j, int i);

    public static native int nativeSetRemoteUserPriority(long j, String str, int i);

    public static native void nativeSetRtcFGConfig(String str);

    public static native int nativeSetSdkContext(String str, String str2);

    public static native int nativeSetSendScreenMaxKbps(long j, int i);

    public static native void nativeSetSpeakerName(long j, String str);

    public static native int nativeSetSpeakerVolume(long j, int i);

    public static native int nativeSetSubChannels(long j, SubChannelInfo[] subChannelInfoArr);

    public static native int nativeSetSubscribeSpecialStream(long j, int[] iArr);

    public static native void nativeSetVendorType(int i, boolean z, String str);

    public static native int nativeSetVolumeOfEffect(long j, int i, int i2);

    public static native int nativeSetupLocalVideo(long j, View view, int i, boolean z);

    public static native int nativeSetupLocalVideoSink(long j, IVideoSink iVideoSink, boolean z);

    public static native int nativeSetupRemoteVideo(long j, View view, int i, String str, boolean z);

    public static native int nativeSetupRemoteVideoSink(long j, IVideoSink iVideoSink, String str, boolean z);

    public static native void nativeStartAudioDump(long j, RtcAudioDumpSampleConfig rtcAudioDumpSampleConfig, String str);

    public static native int nativeStartAudioLocalPlayout(long j);

    public static native int nativeStartAudioLocalRecord(long j);

    public static native int nativeStartAudioLocalShare(long j);

    public static native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeStartAudioPlayoutExternSource(long j, int i);

    public static native int nativeStartAudioRecordFrameListen(long j);

    public static native void nativeStartHardwareEchoTest(long j, String str);

    public static native int nativeStartPreview(long j);

    public static native int nativeStopAllEffects(long j);

    public static native void nativeStopAudioDump(long j);

    public static native int nativeStopAudioLocalPlayout(long j);

    public static native int nativeStopAudioLocalRecord(long j);

    public static native int nativeStopAudioLocalShare(long j);

    public static native void nativeStopAudioMixing(long j);

    public static native int nativeStopAudioPlayoutExternSource(long j, int i);

    public static native int nativeStopAudioRecordFrameListen(long j);

    public static native int nativeStopEffect(long j, int i);

    public static native void nativeStopHardwareEchoTest(long j);

    public static native int nativeStopPreview(long j);

    public static native void nativeSubscribeStream(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeSwitchCamera(long j);

    public static native int nativeUnSubscribe(long j, String str);

    public static native int nativeUnloadAllEffects(long j);

    public static native int nativeUnloadEffect(long j, int i);

    public static native int nativeUnpublishScreen(long j);

    public static native int nativeUnpublishScreenAudio(long j);
}
