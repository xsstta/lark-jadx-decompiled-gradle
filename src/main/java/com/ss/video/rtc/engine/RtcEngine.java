package com.ss.video.rtc.engine;

import android.content.Context;
import android.content.Intent;
import android.opengl.EGLContext;
import com.huawei.hms.location.LocationRequest;
import com.ss.video.rtc.engine.IRtcAudioDeviceManager;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.handler.ByteRtcEngineEncryptHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineInternalEventHandler;
import com.ss.video.rtc.engine.live.LiveTranscoding;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderImpl;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.engine.utils.RtcEglContextChecker;
import com.ss.video.rtc.engine.video.ScreenSharingParameters;
import com.ss.video.rtc.engine.video.VideoEncoderConfiguration;
import java.util.List;
import org.json.JSONObject;
import org.webrtc.EglBase;

public abstract class RtcEngine {
    private static C65562RtcEngineImpl mInstance;
    protected static RtcEglContextChecker mRtcEglContextChecker;
    protected static RtcNativeLibraryLoader mRtcNativeLibraryLoader = new RtcNativeLibraryLoaderImpl();

    public enum ByteRtcEnv {
        kByteRtcEnvProduct,
        kByteRtcEnvBOE,
        kByteRtcEnvTest
    }

    public enum CHANNEL_PROFILE_TYPE {
        CHANNEL_PROFILE_COMMUNICATION,
        CHANNEL_PROFILE_LIVE_BROADCASTING,
        CHANNEL_PROFILE_GAME,
        CHANNEL_PROFILE_CLOUD_GAME
    }

    public enum CLIENT_ROLE_TYPE {
        CLIENT_ROLE_BROADCASTER,
        CLIENT_ROLE_SILENT_AUDIENCE
    }

    public enum ConnectionState {
        CONNECTION_START,
        CONNECTION_STATE_DISCONNECTED,
        CONNECTION_STATE_CONNECTING,
        CONNECTION_STATE_CONNECTED,
        CONNECTION_STATE_RECONNECTING,
        CONNECTION_STATE_RECONNECTED
    }

    public enum RtcRenderViewType {
        RTC_SURFACEVIEW,
        RTC_TEXTUREVIEW
    }

    public abstract void AdjustRemoteAudioVolume(String str, int i);

    public abstract int EnableRangeAudio(boolean z);

    public abstract void SetAudioPerfProfile(AudioPerfProfile audioPerfProfile);

    public abstract int SetAudioRecvMode(RangeAudioMode rangeAudioMode);

    public abstract int SetAudioSendMode(RangeAudioMode rangeAudioMode);

    public abstract int SetRtcMode(RtcMode rtcMode);

    public abstract void SetRuntimeParameters(JSONObject jSONObject);

    public abstract int SetTeamId(String str);

    public abstract int UpdateAudioRecvRange(int i, int i2);

    public abstract int UpdateSelfPosition(int i, int i2, int i3);

    public abstract void addVideoEffectPath(List<String> list);

    public abstract int adjustAudioMixingPlayoutVolume(int i);

    public abstract int adjustAudioMixingPublishVolume(int i);

    public abstract int adjustAudioMixingVolume(int i);

    public abstract int adjustPlaybackSignalVolume(int i);

    public abstract int adjustRecordingSignalVolume(int i);

    public abstract int checkVideoEffectLicense(Context context, String str);

    public abstract IRtcRoom createRoom(String str);

    public abstract void disableLiveTranscoding();

    public abstract int enableAudioVolumeIndication(int i, int i2);

    public abstract void enableAutoSubscribe(SubscribeMode subscribeMode, SubscribeMode subscribeMode2);

    public abstract void enableLiveTranscoding(LiveTranscoding liveTranscoding);

    public abstract int enableLocalAudio(boolean z);

    public abstract int enableLocalVideo(boolean z);

    public abstract void enableSubscribeLocalStream(boolean z);

    public abstract int enableVideoEffect(boolean z);

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract int getAudioMixingStreamCachedFrameNum();

    public abstract int getEffectVolume(int i);

    public abstract IRtcEngineInternalEventHandler getRtcEngineInternalEventHandler();

    public abstract boolean isLocalVideoMirrorOn();

    public abstract boolean isSpeakerphoneEnabled();

    public abstract int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3);

    public abstract int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3, String str4);

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

    public abstract boolean pullExternalAudioFrame(byte[] bArr, int i);

    public abstract boolean pushAudioMixingStreamData(byte[] bArr, int i);

    public abstract boolean pushExternalAudioFrame(byte[] bArr, int i);

    public abstract boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame);

    public abstract boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame, boolean z);

    public abstract boolean pushScreenFrame(RtcVideoFrame rtcVideoFrame);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract void registerMetadataObserver(IMetadataObserver iMetadataObserver);

    public abstract void removeVideoEffectPath(List<String> list);

    public abstract int renewToken(String str);

    public abstract int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    public abstract int resumeAllEffects();

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i);

    public abstract long sendRoomBinaryMessage(byte[] bArr);

    public abstract long sendRoomMessage(String str);

    public abstract long sendUserBinaryMessage(String str, byte[] bArr);

    public abstract long sendUserMessage(String str, String str2);

    public abstract boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler);

    public abstract int setAudioMixingPosition(int i);

    public abstract void setAudioPlayoutMixStream(boolean z, int i, int i2);

    public abstract int setBusinessId(String str);

    public abstract int setChannelProfile(CHANNEL_PROFILE_TYPE channel_profile_type);

    public abstract int setClientRole(CLIENT_ROLE_TYPE client_role_type);

    public abstract void setCustomizeEncryptHandler(ByteRtcEngineEncryptHandler byteRtcEngineEncryptHandler);

    public abstract int setDefaultMuteAllRemoteAudioStreams(boolean z);

    public abstract int setDefaultMuteAllRemoteVideoStreams(boolean z);

    public abstract int setEffectsVolume(int i);

    public abstract int setEnableSpeakerphone(boolean z);

    public abstract void setEncryptInfo(int i, String str);

    public abstract boolean setExternalAudioDevice(boolean z, int i, int i2, int i3);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4);

    public abstract int setLocalVideoMirrorMode(int i);

    public abstract void setLogFilter(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel);

    public abstract boolean setMixedAudioFrameParameters(int i, int i2);

    public abstract void setOnDestroyCompletedCallback(Runnable runnable);

    public abstract boolean setPlaybackAudioFrameParameters(int i, int i2);

    public abstract int setPublishFallbackOption(int i);

    public abstract boolean setRecordingAudioFrameParameters(int i, int i2);

    public abstract int setRemoteSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    public abstract int setRemoteUserPriority(String str, RemoteUserPriority remoteUserPriority);

    public abstract void setRtcEngineEventHandler(IRtcEngineEventHandler iRtcEngineEventHandler);

    public abstract void setRtcEngineInternalEventHandler(IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler);

    public abstract void setVideoCompositingLayout(LiveTranscoding.Layout layout);

    public abstract void setVideoEffectAlgoModelPath(String str);

    public abstract void setVideoEffectColorFilter(String str);

    public abstract void setVideoEffectColorFilterIntensity(float f);

    public abstract void setVideoEffectPath(List<String> list);

    public abstract int setVideoProfiles(VideoStreamDescription[] videoStreamDescriptionArr);

    public abstract int setVideoProfiles(VideoStreamDescription[] videoStreamDescriptionArr, VideoEncoderConfiguration.ORIENTATION_MODE orientation_mode);

    public abstract int setVolumeOfEffect(int i, int i2);

    public abstract int setupLocalScreen(VideoCanvas videoCanvas);

    public abstract int setupLocalScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupLocalVideo(VideoCanvas videoCanvas);

    public abstract int setupLocalVideoRender(IVideoSink iVideoSink, String str);

    public abstract int setupLocalVideoRender(IVideoSink iVideoSink, String str, boolean z);

    public abstract void setupRemoteScreen(VideoCanvas videoCanvas);

    public abstract int setupRemoteScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupRemoteScreenRender(IVideoSink iVideoSink, String str, String str2);

    public abstract int setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2, boolean z);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str, boolean z);

    public abstract int startAudioMixing(String str, boolean z, boolean z2, int i);

    public abstract void startCloudRendering(String str);

    public abstract int startPreview();

    public abstract int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters);

    public abstract int stopAllEffects();

    public abstract int stopAudioMixing();

    public abstract void stopCloudRendering();

    public abstract int stopEffect(int i);

    public abstract int stopPreview();

    public abstract int stopScreenSharing();

    public abstract void subscribeStream(String str, SubscribeConfig subscribeConfig);

    public abstract int switchCamera();

    public abstract void unSubscribe(String str, boolean z);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i);

    public abstract int unpublishScreen();

    public abstract void updateCloudRendering(String str);

    public abstract int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters);

    public abstract void updateVideoEffect(String str, String str2, float f);

    public enum AudioPerfProfile {
        AUDIO_PERF_PROFILE_AUTO(0),
        AUDIO_PERF_PROFILE_LOW(1),
        AUDIO_PERF_PROFILE_MID(2),
        AUDIO_PERF_PROFILE_HIGH(3);
        
        private int value;

        public int value() {
            return this.value;
        }

        private AudioPerfProfile(int i) {
            this.value = i;
        }
    }

    public enum BackgroundMode {
        BACKGROUND_A(0),
        BACKGROUND_B(1),
        BLUR(2),
        NONE(3);
        
        private int value;

        public int value() {
            return this.value;
        }

        private BackgroundMode(int i) {
            this.value = i;
        }
    }

    public enum DivideModel {
        EFFECT(0),
        DEFAULT(1);
        
        private int value;

        public int value() {
            return this.value;
        }

        private DivideModel(int i) {
            this.value = i;
        }
    }

    public enum RangeAudioMode {
        RANGE_AUDIO_MODE_UNDEFINED(0),
        RANGE_AUDIO_MODE_TEAM(1),
        RANGE_AUDIO_MODE_WORLD(2);
        
        private int value;

        public int value() {
            return this.value;
        }

        private RangeAudioMode(int i) {
            this.value = i;
        }
    }

    public enum RemoteUserPriority {
        REMOTE_USER_PRIORITY_LOW(0),
        REMOTE_USER_PRIORITY_MEDIUM(100),
        REMOTE_USER_PRIORITY_HIGH(LocationRequest.PRIORITY_HD_ACCURACY);
        
        private int value;

        public int value() {
            return this.value;
        }

        private RemoteUserPriority(int i) {
            this.value = i;
        }
    }

    public enum RtcMode {
        RTC_MODE_GENERAL(0),
        RTC_MODE_LOCAL_AUDIO(1);
        
        private int value;

        public int value() {
            return this.value;
        }

        private RtcMode(int i) {
            this.value = i;
        }
    }

    public enum SubscribeFallbackOptions {
        SUBSCRIBE_FALLBACK_OPTIONS_DISABLED(0),
        SUBSCRIBE_FALLBACK_OPTIONS_STREAM_LOW(1),
        SUBSCRIBE_FALLBACK_OPTIONS_AUDIO_ONLY(2);
        
        private int value;

        public int value() {
            return this.value;
        }

        private SubscribeFallbackOptions(int i) {
            this.value = i;
        }
    }

    public enum SubscribeMode {
        AUTO_SUBSCRIBE_MODE(0),
        MANUAL_SUBSCRIBE_MODE(1);
        
        private int value;

        public int value() {
            return this.value;
        }

        private SubscribeMode(int i) {
            this.value = i;
        }
    }

    public static RtcNativeLibraryLoader getRtcNativeLibraryLoader() {
        return mRtcNativeLibraryLoader;
    }

    public static String getSdkVersion() {
        return C65562RtcEngineImpl.getSDKVersion();
    }

    public static synchronized void destroy() {
        synchronized (RtcEngine.class) {
            C65562RtcEngineImpl rtcEngineImpl = mInstance;
            if (rtcEngineImpl != null) {
                rtcEngineImpl.doDestroy();
                mInstance = null;
                mRtcNativeLibraryLoader = null;
                mRtcEglContextChecker = null;
                System.gc();
            }
        }
    }

    public static void enablePerformanceCollect(boolean z) {
        C65562RtcEngineImpl.enablePerformanceCollect(z);
    }

    public static void setEnableLog(boolean z) {
        LogUtil.setDebug(z);
    }

    public static void setLoggerMessageLevel(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel) {
        LogUtil.setLogLevel(rtcLogLevel);
    }

    public static void setRtcHttpClientBeforeCreateEngine(RtcHttpClient rtcHttpClient) {
        C65562RtcEngineImpl.setRtcHttpClient(rtcHttpClient);
    }

    public static String getErrorDescription(int i) {
        return C65562RtcEngineImpl.getErrorDescription(i);
    }

    public static int setDeviceId(String str) {
        return C65562RtcEngineImpl.setDeviceId(str);
    }

    public static int setEnv(ByteRtcEnv byteRtcEnv) {
        return C65562RtcEngineImpl.setEnv(byteRtcEnv);
    }

    public static int setParameters(String str) {
        return C65562RtcEngineImpl.setParameters(str);
    }

    public static void setRtcEglContextChecker(RtcEglContextChecker rtcEglContextChecker) {
        if (rtcEglContextChecker != null) {
            mRtcEglContextChecker = rtcEglContextChecker;
            EglBase.CC.setEglContextChecker(rtcEglContextChecker);
        }
    }

    public static synchronized IRtcAudioDeviceManager createAudioDeviceManager(IRtcAudioDeviceManager.IRtcAudioDeviceEventHandler iRtcAudioDeviceEventHandler) {
        IRtcAudioDeviceManager createAudioDeviceManager;
        synchronized (RtcEngine.class) {
            createAudioDeviceManager = C65562RtcEngineImpl.createAudioDeviceManager(iRtcAudioDeviceEventHandler);
        }
        return createAudioDeviceManager;
    }

    public static synchronized void destroyEngine(RtcEngine rtcEngine) {
        synchronized (RtcEngine.class) {
            if (rtcEngine != null) {
                if (rtcEngine == mInstance) {
                    destroy();
                } else {
                    ((C65562RtcEngineImpl) rtcEngine).doDestroy();
                    System.gc();
                }
            }
        }
    }

    public static void setRtcNativeLibraryLoader(RtcNativeLibraryLoader rtcNativeLibraryLoader) {
        LogUtil.m257132i("RtcEngine", "set rtc native library loader" + rtcNativeLibraryLoader);
        mRtcNativeLibraryLoader = rtcNativeLibraryLoader;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngine createShared;
        synchronized (RtcEngine.class) {
            createShared = createShared(context, str, iRtcEngineEventHandler, null);
        }
        return createShared;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, EGLContext eGLContext) {
        RtcEngine createShared;
        synchronized (RtcEngine.class) {
            createShared = createShared(context, str, iRtcEngineEventHandler, eGLContext);
        }
        return createShared;
    }

    protected static synchronized RtcEngine createShared(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, Object obj) {
        synchronized (RtcEngine.class) {
            if (context == null || str == null) {
                return null;
            }
            if (mInstance == null) {
                try {
                    mInstance = new C65562RtcEngineImpl(context, str, iRtcEngineEventHandler, obj, null);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            return mInstance;
        }
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, Object obj) {
        RtcEngine createShared;
        synchronized (RtcEngine.class) {
            createShared = createShared(context, str, iRtcEngineEventHandler, obj);
        }
        return createShared;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, javax.microedition.khronos.egl.EGLContext eGLContext) {
        RtcEngine createShared;
        synchronized (RtcEngine.class) {
            createShared = createShared(context, str, iRtcEngineEventHandler, eGLContext);
        }
        return createShared;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.ss.video.rtc.engine.RtcEngine createEngine(android.content.Context r9, java.lang.String r10, com.ss.video.rtc.engine.handler.IRtcEngineEventHandler r11, java.lang.Object r12, org.json.JSONObject r13) {
        /*
            java.lang.Class<com.ss.video.rtc.engine.RtcEngine> r0 = com.ss.video.rtc.engine.RtcEngine.class
            monitor-enter(r0)
            r1 = 0
            if (r9 == 0) goto L_0x001a
            if (r10 == 0) goto L_0x001a
            com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl r8 = new com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl     // Catch:{ IllegalStateException -> 0x0018, all -> 0x0015 }
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IllegalStateException -> 0x0018, all -> 0x0015 }
            monitor-exit(r0)
            return r8
        L_0x0015:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x0018:
            monitor-exit(r0)
            return r1
        L_0x001a:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.RtcEngine.createEngine(android.content.Context, java.lang.String, com.ss.video.rtc.engine.handler.IRtcEngineEventHandler, java.lang.Object, org.json.JSONObject):com.ss.video.rtc.engine.RtcEngine");
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, ByteRtcEnv byteRtcEnv, EGLContext eGLContext) {
        RtcEngine createShared;
        synchronized (RtcEngine.class) {
            setEnv(byteRtcEnv);
            createShared = createShared(context, str, iRtcEngineEventHandler, eGLContext);
        }
        return createShared;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, ByteRtcEnv byteRtcEnv, javax.microedition.khronos.egl.EGLContext eGLContext) {
        RtcEngine createShared;
        synchronized (RtcEngine.class) {
            setEnv(byteRtcEnv);
            createShared = createShared(context, str, iRtcEngineEventHandler, eGLContext);
        }
        return createShared;
    }
}
