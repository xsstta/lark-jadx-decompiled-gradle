package com.ss.video.rtc.meeting;

import android.content.Context;
import com.ss.video.rtc.engine.EffectInfo;
import com.ss.video.rtc.engine.IAudioFrameObserver;
import com.ss.video.rtc.engine.IAudioFrameTestObserver;
import com.ss.video.rtc.engine.IMetadataObserver;
import com.ss.video.rtc.engine.RtcAudioDumpSampleConfig;
import com.ss.video.rtc.engine.RtcSharedContext;
import com.ss.video.rtc.engine.SubChannelInfo;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.VideoCanvas;
import com.ss.video.rtc.engine.VideoStreamDescription;
import com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.DevicePerformanceInfo;
import com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler;
import com.ss.video.rtc.meeting.MeetingRtcConstants;
import org.webrtc.EglBase;

public abstract class MeetingRtcEngine {
    private static MeetingRtcEngineImpl mInstance;
    private static final Object sLock = new Object();

    public abstract void SetAecOption(MeetingRtcConstants.AecOption aecOption);

    public abstract void SetEffectResourceFinder(IRtcResourceFinder iRtcResourceFinder);

    public abstract void SetHighpassFilter(boolean z);

    public abstract void SetNsOption(MeetingRtcConstants.NsOption nsOption);

    public abstract int SetRemoteUserPriority(String str, MeetingRtcConstants.RemoteUserPriority remoteUserPriority);

    public abstract int addPublishStreamUrl(String str, boolean z);

    public abstract int adjustAudioMixingPlayoutVolume(int i);

    public abstract int adjustAudioMixingPublishVolume(int i);

    public abstract int adjustAudioMixingVolume(int i);

    public abstract int adjustPlaybackSignalVolume(int i);

    public abstract int adjustRecordingSignalVolume(int i);

    public abstract void applyEffect(EffectInfo effectInfo, MeetingRtcConstants.EffectType effectType, String str);

    public abstract void cancelEffect(String str);

    public abstract int disableVideo();

    public abstract int enableAudio(boolean z);

    public abstract int enableAudioVolumeIndication(int i, int i2);

    public abstract void enableAutoSubscribe(boolean z);

    public abstract void enableBackgroundBlur(boolean z);

    public abstract int enableEncryption(boolean z);

    public abstract int enableLocalAudio(boolean z);

    public abstract int enableLocalAudioVolumeIndication(int i, int i2);

    public abstract int enableLocalVideo(boolean z);

    public abstract void enableRNNoise(boolean z);

    public abstract int enableVideo();

    public abstract void forceFlipVideo(boolean z, boolean z2);

    public abstract void forceSetCameraRotation(boolean z, boolean z2);

    public abstract void forceSetDecoderMode(VideoStreamDescription.CodecMode codecMode);

    public abstract void forceSetEncoderVideoProfiles(VideoStreamDescription[] videoStreamDescriptionArr);

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract int getEffectVolume(int i);

    public abstract int getMaximumScreenShareFps();

    public abstract boolean isLocalVideoMirrorOn();

    public abstract boolean isMuteLocalAudio();

    public abstract boolean isMuteLocalVideo();

    public abstract boolean isSpeakerphoneEnabled();

    public abstract int joinBreakDownRoom(String str, boolean z);

    public abstract int joinChannel(String str, String str2, String str3, String str4);

    public abstract int joinChannel(String str, String str2, String str3, String str4, String str5);

    public abstract int leaveBreakDownRoom();

    public abstract int leaveChannel();

    public abstract int muteAllRemoteAudioStreams(boolean z);

    public abstract int muteAllRemoteVideoStreams(boolean z);

    public abstract int muteLocalAudioStream(boolean z);

    public abstract int muteLocalVideoStream(boolean z);

    public abstract int muteRemoteAudioStream(String str, boolean z);

    public abstract int muteRemoteVideoStream(String str, boolean z);

    public abstract int pauseAllEffects();

    public abstract int pauseAudioMixing();

    public abstract int pauseEffect(int i);

    public abstract int playEffect(int i, String str, boolean z, int i2, int i3);

    public abstract int preloadEffect(int i, String str);

    public abstract int publishScreen();

    public abstract int publishScreenAudio();

    public abstract boolean pullExternalAudioFrame(byte[] bArr, int i);

    public abstract int pushExternalAudioFrame(byte[] bArr, long j);

    public abstract boolean pushExternalAudioFrame(byte[] bArr, int i);

    public abstract boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame);

    public abstract boolean pushScreenAudioFrame(byte[] bArr, int i, int i2, int i3, int i4);

    public abstract boolean pushScreenFrame(RtcVideoFrame rtcVideoFrame);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract void registerMetadataObserver(IMetadataObserver iMetadataObserver);

    public abstract void registerMetadataObserverEx(IMetadataObserverEx iMetadataObserverEx);

    public abstract int renewToken(String str);

    public abstract int resumeAllEffects();

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i);

    public abstract long sendBinaryMessageToRoom(byte[] bArr);

    public abstract long sendBinaryMessageToUser(String str, byte[] bArr);

    public abstract long sendMessageToRoom(String str);

    public abstract long sendMessageToUser(String str, String str2);

    public abstract int setAudioDataEventHandler(IAudioFrameTestObserver iAudioFrameTestObserver);

    public abstract boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler);

    public abstract int setAudioMixingPosition(int i);

    public abstract int setAudioProfile(int i, int i2);

    public abstract void setBackgroundImage(String str);

    public abstract int setCaptureDevice(int i);

    public abstract int setChannelProfile(int i);

    public abstract int setClientRole(int i);

    public abstract int setDefaultMuteAllRemoteAudioStreams(boolean z);

    public abstract int setDefaultMuteAllRemoteVideoStreams(boolean z);

    public abstract void setDeviceOrientation(int i);

    public abstract int setEffectsVolume(int i);

    public abstract int setEnableSpeakerphone(boolean z);

    public abstract boolean setExternalAudioDevice(boolean z, int i, int i2, int i3);

    public abstract int setExternalAudioSource(boolean z, int i, int i2, int i3);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4);

    public abstract void setFaceBeautyLevel(int i);

    public abstract int setLocalVideoMirrorMode(int i);

    public int setLogFile(String str) {
        return -1;
    }

    public abstract int setLogFileDir(String str);

    public abstract void setLogFilter(IMeetingRtcEngineEventHandler.RtcLogLevel rtcLogLevel);

    public abstract int setMediaServerIP(String str);

    public abstract void setMicrophoneName(String str);

    public abstract void setOnDestroyCompletedCallback(Runnable runnable);

    public abstract int setPlaybackDigitalMute(boolean z);

    public abstract int setPublishChannel(String str);

    public abstract int setPublishSpecialStream(int i);

    public abstract int setSendScreenMaxKbps(int i);

    public abstract void setSpeakerName(String str);

    public abstract int setSpeakerphoneVolume(int i);

    public abstract int setSubChannels(SubChannelInfo[] subChannelInfoArr);

    public abstract int setSubscribeSpecialStream(int[] iArr);

    public abstract int setVolumeOfEffect(int i, int i2);

    public abstract int setupLocalScreen(VideoCanvas videoCanvas);

    public abstract int setupLocalScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupLocalVideo(VideoCanvas videoCanvas);

    public abstract int setupLocalVideoRender(IVideoSink iVideoSink, String str);

    public abstract void setupRemoteScreen(VideoCanvas videoCanvas);

    public abstract int setupRemoteScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str);

    public abstract void startAudioDump(RtcAudioDumpSampleConfig rtcAudioDumpSampleConfig, String str);

    public abstract int startAudioLocalPlayout();

    public abstract int startAudioLocalRecord();

    public abstract int startAudioLocalShare();

    public abstract int startAudioMixing(String str, boolean z, boolean z2, int i);

    public abstract int startAudioPlayoutExternSource(int i);

    public abstract int startAudioRecordFrameListen();

    public abstract void startHardwareEchoTest(String str);

    public abstract int startPreview();

    public abstract int stopAllEffects();

    public abstract void stopAudioDump();

    public abstract int stopAudioLocalPlayout();

    public abstract int stopAudioLocalRecord();

    public abstract int stopAudioLocalShare();

    public abstract int stopAudioMixing();

    public abstract int stopAudioPlayoutExternSource(int i);

    public abstract int stopAudioRecordFrameListen();

    public abstract int stopEffect(int i);

    public abstract void stopHardwareEchoTest();

    public abstract int stopPreview();

    public abstract void subscribeStream(String str, SubscribeConfig subscribeConfig);

    public abstract int switchCamera();

    public abstract void unSubscribe(String str);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i);

    public abstract int unpublishScreen();

    public abstract int unpublishScreenAudio();

    public static DevicePerformanceInfo getDevicePerformanceInfo() {
        return MeetingRtcEngineImpl.getDevicePerformanceInfo();
    }

    public static String getEffectSDKVersion() {
        return MeetingRtcEngineImpl.getEffectSDKVersion();
    }

    public static String getSdkVersion() {
        return MeetingRtcEngineImpl.getSDKVersion();
    }

    public static void destroy() {
        synchronized (sLock) {
            MeetingRtcEngineImpl meetingRtcEngineImpl = mInstance;
            if (meetingRtcEngineImpl != null) {
                meetingRtcEngineImpl.doDestroy();
                mInstance = null;
            }
        }
    }

    public static EglBase.Context getEglContext() {
        if (RtcSharedContext.getEGLContext() == null) {
            return null;
        }
        return RtcSharedContext.getEGLContext().getEglBaseContext();
    }

    public static void setApiServerHost(String[] strArr) {
        MeetingRtcEngineImpl.setApiServerHost(strArr);
    }

    public static void setHostName(String str) {
        MeetingRtcEngineImpl.setHostName(str);
    }

    public static void setLogPath(String str) {
        MeetingRtcEngineImpl.setLogPath(str);
    }

    public static void setRtcDirPath(String str) {
        MeetingRtcEngineImpl.setRtcDirPath(str);
    }

    public static void setRtcFGConfig(String str) {
        MeetingRtcEngineImpl.setRtcFGConfig(str);
    }

    public static void setRtcNativeLibraryLoader(RtcNativeLibraryLoader rtcNativeLibraryLoader) {
        MeetingRtcEngineImpl.setRtcNativeLibraryLoader(rtcNativeLibraryLoader);
    }

    public static void setSignalingServer(String str) {
        MeetingRtcEngineImpl.setSignalingServer(str);
    }

    public static int setDeviceId(String str) {
        return MeetingRtcEngineImpl.setDeviceId(str);
    }

    public static void setApiServerHost(String[] strArr, String str) {
        MeetingRtcEngineImpl.setApiServerHost(strArr, str);
    }

    public static void setVendorType(MeetingRtcConstants.VendorType vendorType, boolean z, String str) {
        MeetingRtcEngineImpl.setVendorType(vendorType, z, str);
    }

    public static void setProxyInfo(int i, String str, int i2, String str2, String str3) {
        MeetingRtcEngineImpl.setProxyInfo(i, str, i2, str2, str3);
    }

    public static MeetingRtcEngine create(Context context, String str, IMeetingRtcEngineEventHandler iMeetingRtcEngineEventHandler, Object obj, String str2) {
        return create(context, str, iMeetingRtcEngineEventHandler, false, obj, str2);
    }

    public static MeetingRtcEngine create(Context context, String str, IMeetingRtcEngineEventHandler iMeetingRtcEngineEventHandler, String[] strArr, String str2) {
        if (strArr != null) {
            setApiServerHost(strArr);
        }
        return create(context, str, iMeetingRtcEngineEventHandler, false, null, str2);
    }

    public static MeetingRtcEngine create(Context context, String str, IMeetingRtcEngineEventHandler iMeetingRtcEngineEventHandler, boolean z, Object obj, String str2) {
        synchronized (sLock) {
            if (context == null) {
                return null;
            }
            if (mInstance == null) {
                mInstance = new MeetingRtcEngineImpl(context, str, iMeetingRtcEngineEventHandler, obj, str2);
            }
            return mInstance;
        }
    }
}
