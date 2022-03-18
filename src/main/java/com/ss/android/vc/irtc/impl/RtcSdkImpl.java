package com.ss.android.vc.irtc.impl;

import android.content.Context;
import android.content.Intent;
import android.opengl.EGLContext;
import android.view.View;
import com.ss.android.vc.irtc.AbstractC61023b;
import com.ss.android.vc.irtc.AbstractC61024c;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.irtc.AbstractC61027f;
import com.ss.android.vc.irtc.AbstractC61028g;
import com.ss.android.vc.irtc.AbstractC61029h;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.AbstractC61059k;
import com.ss.android.vc.irtc.AbstractC61060l;
import com.ss.android.vc.irtc.AbstractC61061m;
import com.ss.android.vc.irtc.AbstractC61062n;
import com.ss.android.vc.irtc.AbstractC61063o;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.RtcConstants;
import com.ss.android.vc.irtc.RtcDevicePerfInfo;
import com.ss.android.vc.irtc.SubChannelInfo;
import com.ss.android.vc.irtc.VideoSolution;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class RtcSdkImpl implements AbstractC61061m {

    private static class Holder {
        public static final RtcSdkImpl INSTANCE = new RtcSdkImpl();

        private Holder() {
        }
    }

    public static AbstractC61061m getInstance() {
        return Holder.INSTANCE;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void closeAudioRoute() {
        RtcServiceImpl.getInstance().closeAudioRoute();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void disableEncryption() {
        RtcServiceImpl.getInstance().disableEncryption();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableEncryption() {
        RtcServiceImpl.getInstance().enableEncryption();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void leaveBreakDownRoom() {
        RtcServiceImpl.getInstance().leaveBreakDownRoom();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void leaveChannel() {
        RtcServiceImpl.getInstance().leaveChannel();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void openAudioRoute() {
        RtcServiceImpl.getInstance().openAudioRoute();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void reset() {
        RtcServiceImpl.getInstance().reset();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void sodium() {
        RtcServiceImpl.getInstance().sodium();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void startPreview() {
        RtcServiceImpl.getInstance().startPreview();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void stopAudioCapture() {
        RtcServiceImpl.getInstance().stopAudioCapture();
    }

    public void stopHardwareEchoTest() {
        RtcServiceImpl.getInstance().stopHardwareEchoTest();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void stopPreview() {
        RtcServiceImpl.getInstance().stopPreview();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void stopScreenCapturer() {
        RtcServiceImpl.getInstance().stopScreenCapturer();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void switchCamera() {
        RtcServiceImpl.getInstance().switchCamera();
    }

    public View createRenderView() {
        return RtcServiceImpl.getInstance().createRenderView();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int crypto_kx_sessionkeybytes() {
        return RtcServiceImpl.getInstance().crypto_kx_sessionkeybytes();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public RtcDevicePerfInfo getDevicePerformanceInfo() {
        return RtcServiceImpl.getInstance().getDevicePerformanceInfo();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public String getEffectSDKVersion() {
        return RtcServiceImpl.getInstance().getEffectSDKVersion();
    }

    public long getNativeHandle() {
        return RtcServiceImpl.getInstance().getNativeHandle();
    }

    public RtcConstants.Status getRtcStatus() {
        return RtcServiceImpl.getInstance().getRtcStatus();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public String getSdkVersion() {
        return RtcServiceImpl.getInstance().getSdkVersion();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public boolean isMuteLocalAudio() {
        return RtcServiceImpl.getInstance().isMuteLocalAudio();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public boolean isMuteLocalVideo() {
        return RtcServiceImpl.getInstance().isMuteLocalVideo();
    }

    public boolean isRTCEngineAlive() {
        return RtcServiceImpl.getInstance().isRTCEngineAlive();
    }

    public boolean isSharing() {
        return RtcServiceImpl.getInstance().isSharing();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public Object newKeyPair() {
        return RtcServiceImpl.getInstance().newKeyPair();
    }

    public int startAudioRecordFrameListen() {
        return RtcServiceImpl.getInstance().startAudioRecordFrameListen();
    }

    public int stopAudioRecordFrameListen() {
        return RtcServiceImpl.getInstance().stopAudioRecordFrameListen();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void cancelEffect(String str) {
        RtcServiceImpl.getInstance().cancelEffect(str);
    }

    public void changeMicroVolume(int i) {
        RtcServiceImpl.getInstance().changeMicroVolume(i);
    }

    public void enableAutoSubscribe(boolean z) {
        RtcServiceImpl.getInstance().enableAutoSubscribe(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableBackgroundBlur(boolean z) {
        RtcServiceImpl.getInstance().enableBackgroundBlur(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableLocalAudio(boolean z) {
        RtcServiceImpl.getInstance().enableLocalAudio(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableLocalVideo(boolean z) {
        RtcServiceImpl.getInstance().enableLocalVideo(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableSpeaker(boolean z) {
        RtcServiceImpl.getInstance().enableSpeaker(z);
    }

    public void enableVideo(boolean z) {
        RtcServiceImpl.getInstance().enableVideo(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void initInMainProcess(Context context) {
        RtcServiceImpl.getInstance().initInMainProcess(context);
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        RtcServiceImpl.getInstance().muteAllRemoteAudioStreams(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void muteAudio(boolean z) {
        RtcServiceImpl.getInstance().muteAudio(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void muteCamera(boolean z) {
        RtcServiceImpl.getInstance().muteCamera(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void registerListener(AbstractC61058j jVar) {
        RtcServiceImpl.getInstance().registerListener(jVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void registerMetadataObserverEx(AbstractC61027f fVar) {
        RtcServiceImpl.getInstance().registerMetadataObserverEx(fVar);
    }

    public void sendRoomBinaryMessage(byte[] bArr) {
        RtcServiceImpl.getInstance().sendRoomBinaryMessage(bArr);
    }

    public void sendRoomMessage(String str) {
        RtcServiceImpl.getInstance().sendRoomMessage(str);
    }

    public void setAudioDataTestEventHandler(AbstractC61029h hVar) {
        RtcServiceImpl.getInstance().setAudioDataTestEventHandler(hVar);
    }

    public void setAudioDeviceListener(AbstractC61028g gVar) {
        RtcServiceImpl.getInstance().setAudioDeviceListener(gVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setBackgroundImage(String str) {
        RtcServiceImpl.getInstance().setBackgroundImage(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setCaptureDevice(int i) {
        RtcServiceImpl.getInstance().setCaptureDevice(i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setCaptureStatusCallback(AbstractC61023b bVar) {
        RtcServiceImpl.getInstance().setCaptureStatusCallback(bVar);
    }

    public void setChannelProfile(int i) {
        RtcServiceImpl.getInstance().setChannelProfile(i);
    }

    public void setDecoderMode(int i) {
        RtcServiceImpl.getInstance().setDecoderMode(i);
    }

    public void setDefaultAudioRouteToSpeakerPhone(boolean z) {
        RtcServiceImpl.getInstance().setDefaultAudioRouteToSpeakerPhone(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setDeviceOrientation(int i) {
        RtcServiceImpl.getInstance().setDeviceOrientation(i);
    }

    public void setDnsResults(Map<String, List<String>> map) {
        RtcServiceImpl.getInstance().setDnsResults(map);
    }

    public void setEncoderVideoProfiles(VideoSolution[] videoSolutionArr) {
        RtcServiceImpl.getInstance().setEncoderVideoProfiles(videoSolutionArr);
    }

    public void setFaceBeautyLevel(int i) {
        RtcServiceImpl.getInstance().setFaceBeautyLevel(i);
    }

    public void setIsUsingTTnet(boolean z) {
        RtcServiceImpl.getInstance().setIsUsingTTnet(z);
    }

    public void setLarkDebug(boolean z) {
        RtcServiceImpl.getInstance().setLarkDebug(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setLocalRotation(int i) {
        RtcServiceImpl.getInstance().setLocalRotation(i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setLogCallback(AbstractC61026e eVar) {
        RtcServiceImpl.getInstance().setLogCallback(eVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setMicrophoneName(String str) {
        RtcServiceImpl.getInstance().setMicrophoneName(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setPlaybackDigitalMute(boolean z) {
        RtcServiceImpl.getInstance().setPlaybackDigitalMute(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setPublishChannel(String str) {
        RtcServiceImpl.getInstance().setPublishChannel(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setResourceFinder(AbstractC61024c cVar) {
        RtcServiceImpl.getInstance().setResourceFinder(cVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRtcDirPath(String str) {
        RtcServiceImpl.getInstance().setRtcDirPath(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRtcDomainConfig(String str) {
        RtcServiceImpl.getInstance().setRtcDomainConfig(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRtcFGConfig(String str) {
        RtcServiceImpl.getInstance().setRtcFGConfig(str);
    }

    public void setRtcNativeLibraryLoader(AbstractC61059k kVar) {
        RtcServiceImpl.getInstance().setRtcNativeLibraryLoader(kVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setSpeakerName(String str) {
        RtcServiceImpl.getInstance().setSpeakerName(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setSubChannels(SubChannelInfo[] subChannelInfoArr) {
        RtcServiceImpl.getInstance().setSubChannels(subChannelInfoArr);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setVoipCallback(AbstractC61063o oVar) {
        RtcServiceImpl.getInstance().setVoipCallback(oVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void startAudioCapture(Intent intent) {
        RtcServiceImpl.getInstance().startAudioCapture(intent);
    }

    public void startHardwareEchoTest(String str) {
        RtcServiceImpl.getInstance().startHardwareEchoTest(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void unbindRenderView(View view) {
        RtcServiceImpl.getInstance().unbindRenderView(view);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void unregisterListener(AbstractC61058j jVar) {
        RtcServiceImpl.getInstance().unregisterListener(jVar);
    }

    public int enableInEarMonitoring(boolean z) {
        return RtcServiceImpl.getInstance().enableInEarMonitoring(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int setClientRole(int i) {
        return RtcServiceImpl.getInstance().setClientRole(i);
    }

    public int setEffectsVolume(int i) {
        return RtcServiceImpl.getInstance().setEffectsVolume(i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int setLocalVideoMirrorMode(int i) {
        return RtcServiceImpl.getInstance().setLocalVideoMirrorMode(i);
    }

    public int startAudioPlayoutExternSource(int i) {
        return RtcServiceImpl.getInstance().startAudioPlayoutExternSource(i);
    }

    public int stopAudioPlayoutExternSource(int i) {
        return RtcServiceImpl.getInstance().stopAudioPlayoutExternSource(i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int unloadEffect(int i) {
        return RtcServiceImpl.getInstance().unloadEffect(i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public View createRenderView(boolean z) {
        return RtcServiceImpl.getInstance().createRenderView(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableAudioVolumeIndication(int i, int i2) {
        RtcServiceImpl.getInstance().enableAudioVolumeIndication(i, i2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void forceFlipVideo(boolean z, boolean z2) {
        RtcServiceImpl.getInstance().forceFlipVideo(z, z2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void forceSetCameraRotation(boolean z, boolean z2) {
        RtcServiceImpl.getInstance().forceSetCameraRotation(z, z2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void joinBreakDownRoom(String str, boolean z) {
        RtcServiceImpl.getInstance().joinBreakDownRoom(str, z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void renderFrame(View view, C61071u uVar) {
        RtcServiceImpl.getInstance().renderFrame(view, uVar);
    }

    public void sendUserBinaryMessage(String str, byte[] bArr) {
        RtcServiceImpl.getInstance().sendUserBinaryMessage(str, bArr);
    }

    public void sendUserMessage(String str, String str2) {
        RtcServiceImpl.getInstance().sendUserMessage(str, str2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setAutoRenderMode(View view, boolean z) {
        RtcServiceImpl.getInstance().setAutoRenderMode(view, z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setBaseFrameListener(View view, AbstractC61060l lVar) {
        RtcServiceImpl.getInstance().setBaseFrameListener(view, lVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setEncryptKey(byte[] bArr, byte[] bArr2) {
        RtcServiceImpl.getInstance().setEncryptKey(bArr, bArr2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRemoteUserPriority(String str, RtcConstants.RemoteUserPriority remoteUserPriority) {
        RtcServiceImpl.getInstance().setRemoteUserPriority(str, remoteUserPriority);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRenderListener(View view, AbstractC61030i iVar) {
        RtcServiceImpl.getInstance().setRenderListener(view, iVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRenderMode(View view, int i) {
        RtcServiceImpl.getInstance().setRenderMode(view, i);
    }

    public void setVideoSinkListener(String str, AbstractC61062n nVar) {
        RtcServiceImpl.getInstance().setVideoSinkListener(str, nVar);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupLocalFrameCapturer(AbstractC61025d dVar, String str) {
        RtcServiceImpl.getInstance().setupLocalFrameCapturer(dVar, str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupLocalView(View view, String str) {
        RtcServiceImpl.getInstance().setupLocalView(view, str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupRemoteFrameCapturer(AbstractC61025d dVar, String str) {
        RtcServiceImpl.getInstance().setupRemoteFrameCapturer(dVar, str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupRemoteScreen(View view, String str) {
        RtcServiceImpl.getInstance().setupRemoteScreen(view, str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupRemoteView(View view, String str) {
        RtcServiceImpl.getInstance().setupRemoteView(view, str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int enableLocalAudioVolumeIndication(int i, int i2) {
        return RtcServiceImpl.getInstance().enableLocalAudioVolumeIndication(i, i2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public boolean isByteRtcSdkInited(String str, int i) {
        return RtcServiceImpl.getInstance().isByteRtcSdkInited(str, i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int preloadEffect(int i, String str) {
        return RtcServiceImpl.getInstance().preloadEffect(i, str);
    }

    public boolean pullExternalAudioFrame(byte[] bArr, int i) {
        return RtcServiceImpl.getInstance().pullExternalAudioFrame(bArr, i);
    }

    public boolean pushExternalAudioFrame(byte[] bArr, int i) {
        return RtcServiceImpl.getInstance().pushExternalAudioFrame(bArr, i);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void changeCapturerFormat(int i, int i2, int i3) {
        RtcServiceImpl.getInstance().changeCapturerFormat(i, i2, i3);
    }

    public JSONObject buildReportHeader(String str, String str2, String str3) {
        return RtcServiceImpl.getInstance().buildReportHeader(str, str2, str3);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4) {
        RtcServiceImpl.getInstance().setExternalVideoSource(z, z2, z3, z4);
    }

    public void startScreenCapturer(Intent intent, int i, int i2, int i3) {
        RtcServiceImpl.getInstance().startScreenCapturer(intent, i, i2, i3);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void subscribeStream(String str, int i, boolean z, boolean z2) {
        RtcServiceImpl.getInstance().subscribeStream(str, i, z, z2);
    }

    public boolean setExternalAudioDevice(boolean z, int i, int i2, int i3) {
        return RtcServiceImpl.getInstance().setExternalAudioDevice(z, i, i2, i3);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int crypto_kx_client_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return RtcServiceImpl.getInstance().crypto_kx_client_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int crypto_kx_server_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return RtcServiceImpl.getInstance().crypto_kx_server_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void joinChannel(String str, String str2, String str3, String str4, String str5) {
        RtcServiceImpl.getInstance().joinChannel(str, str2, str3, str4, str5);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        return RtcServiceImpl.getInstance().playEffect(i, str, z, i2, i3);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setProxyInfo(int i, String str, int i2, String str2, String str3) {
        RtcServiceImpl.getInstance().setProxyInfo(i, str, i2, str2, str3);
    }

    public void setWSProxyInfo(int i, String str, int i2, String str2, String str3) {
        RtcServiceImpl.getInstance().setWSProxyInfo(i, str, i2, str2, str3);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void startScreenCapturer(Intent intent, int i, int i2, int i3, int i4) {
        RtcServiceImpl.getInstance().startScreenCapturer(intent, i, i2, i3, i4);
    }

    public void pushExternalVideoFrame(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, boolean z) {
        RtcServiceImpl.getInstance().pushExternalVideoFrame(eGLContext, i, i2, i3, i4, j, z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void applyEffect(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
        RtcServiceImpl.getInstance().applyEffect(str, str2, str3, i, iArr, strArr, i2, str4);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void initByteRtcSdk(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, String str3, C61065q qVar, String str4, boolean z5, String str5) {
        RtcServiceImpl.getInstance().initByteRtcSdk(str, str2, i, z, z2, z3, z4, str3, qVar, str4, z5, str5);
    }
}
