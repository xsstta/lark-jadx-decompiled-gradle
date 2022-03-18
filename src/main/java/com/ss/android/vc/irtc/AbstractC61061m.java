package com.ss.android.vc.irtc;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.android.vc.irtc.RtcConstants;

/* renamed from: com.ss.android.vc.irtc.m */
public interface AbstractC61061m {
    void applyEffect(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4);

    void cancelEffect(String str);

    void changeCapturerFormat(int i, int i2, int i3);

    void closeAudioRoute();

    View createRenderView(boolean z);

    int crypto_kx_client_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    int crypto_kx_server_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    int crypto_kx_sessionkeybytes();

    void disableEncryption();

    void enableAudioVolumeIndication(int i, int i2);

    void enableBackgroundBlur(boolean z);

    void enableEncryption();

    void enableLocalAudio(boolean z);

    int enableLocalAudioVolumeIndication(int i, int i2);

    void enableLocalVideo(boolean z);

    void enableSpeaker(boolean z);

    void forceFlipVideo(boolean z, boolean z2);

    void forceSetCameraRotation(boolean z, boolean z2);

    RtcDevicePerfInfo getDevicePerformanceInfo();

    String getEffectSDKVersion();

    String getSdkVersion();

    void initByteRtcSdk(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, String str3, C61065q qVar, String str4, boolean z5, String str5);

    void initInMainProcess(Context context);

    boolean isByteRtcSdkInited(String str, int i);

    boolean isMuteLocalAudio();

    boolean isMuteLocalVideo();

    void joinBreakDownRoom(String str, boolean z);

    void joinChannel(String str, String str2, String str3, String str4, String str5);

    void leaveBreakDownRoom();

    void leaveChannel();

    void muteAudio(boolean z);

    void muteCamera(boolean z);

    Object newKeyPair();

    void openAudioRoute();

    int playEffect(int i, String str, boolean z, int i2, int i3);

    int preloadEffect(int i, String str);

    void registerListener(AbstractC61058j jVar);

    void registerMetadataObserverEx(AbstractC61027f fVar);

    void renderFrame(View view, C61071u uVar);

    void reset();

    void setAutoRenderMode(View view, boolean z);

    void setBackgroundImage(String str);

    void setBaseFrameListener(View view, AbstractC61060l lVar);

    void setCaptureDevice(int i);

    void setCaptureStatusCallback(AbstractC61023b bVar);

    int setClientRole(int i);

    void setDeviceOrientation(int i);

    void setEncryptKey(byte[] bArr, byte[] bArr2);

    void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4);

    void setLocalRotation(int i);

    int setLocalVideoMirrorMode(int i);

    void setLogCallback(AbstractC61026e eVar);

    void setMicrophoneName(String str);

    void setPlaybackDigitalMute(boolean z);

    void setProxyInfo(int i, String str, int i2, String str2, String str3);

    void setPublishChannel(String str);

    void setRemoteUserPriority(String str, RtcConstants.RemoteUserPriority remoteUserPriority);

    void setRenderListener(View view, AbstractC61030i iVar);

    void setRenderMode(View view, int i);

    void setResourceFinder(AbstractC61024c cVar);

    void setRtcDirPath(String str);

    void setRtcDomainConfig(String str);

    void setRtcFGConfig(String str);

    void setSpeakerName(String str);

    void setSubChannels(SubChannelInfo[] subChannelInfoArr);

    void setVoipCallback(AbstractC61063o oVar);

    void setupLocalFrameCapturer(AbstractC61025d dVar, String str);

    void setupLocalView(View view, String str);

    void setupRemoteFrameCapturer(AbstractC61025d dVar, String str);

    void setupRemoteScreen(View view, String str);

    void setupRemoteView(View view, String str);

    void sodium();

    void startAudioCapture(Intent intent);

    void startPreview();

    void startScreenCapturer(Intent intent, int i, int i2, int i3, int i4);

    void stopAudioCapture();

    void stopPreview();

    void stopScreenCapturer();

    void subscribeStream(String str, int i, boolean z, boolean z2);

    void switchCamera();

    void unbindRenderView(View view);

    int unloadEffect(int i);

    void unregisterListener(AbstractC61058j jVar);
}
