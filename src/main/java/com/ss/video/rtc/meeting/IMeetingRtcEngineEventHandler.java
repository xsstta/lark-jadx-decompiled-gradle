package com.ss.video.rtc.meeting;

import com.ss.video.rtc.engine.ByteStream;
import com.ss.video.rtc.engine.InternalAudioVolumeInfo;
import com.ss.video.rtc.engine.InternalLocalAudioStats;
import com.ss.video.rtc.engine.InternalLocalVideoStats;
import com.ss.video.rtc.engine.InternalNetworkQualityInfo;
import com.ss.video.rtc.engine.InternalRemoteAudioStats;
import com.ss.video.rtc.engine.InternalRemoteVideoStats;
import com.ss.video.rtc.engine.InternalRtcStats;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.SubscribeState;
import com.ss.video.rtc.engine.device.MediaDeviceInfo;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public abstract class IMeetingRtcEngineEventHandler {

    public enum LocalAudioStreamError {
        LOCAL_AUDIO_STREAM_ERROR_OK,
        LOCAL_AUDIO_STREAM_ERROR_FAILURE,
        LOCAL_AUDIO_STREAM_ERROR_DEVICE_NO_PERMISSION,
        LOCAL_AUDIO_STREAM_ERROR_DEVICE_BUSY,
        LOCAL_AUDIO_STREAM_ERROR_RECORD_FAILURE,
        LOCAL_AUDIO_STREAM_ERROR_ENCODE_FAILURE,
        LocalAudioStreamError {
        }
    }

    public enum LocalAudioStreamState {
        LOCAL_AUDIO_STREAM_STATE_STOPPED,
        LOCAL_AUDIO_STREAM_STATE_RECORDING,
        LOCAL_AUDIO_STREAM_STATE_ENCODING,
        LOCAL_AUDIO_STREAM_STATE_FAILED,
        LOCAL_AUDIO_STREAM_STATE_MUTE,
        LOCAL_AUDIO_STREAM_STATE_UNMUTE,
        LocalAudioStreamState {
        }
    }

    public enum LocalVideoStreamError {
        LOCAL_VIDEO_STREAM_ERROR_OK,
        LOCAL_VIDEO_STREAM_ERROR_FAILURE,
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_NO_PERMISSION,
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_BUSY,
        LOCAL_VIDEO_STREAM_ERROR_RECORD_FAILURE,
        LOCAL_VIDEO_STREAM_ERROR_ENCODE_FAILURE,
        LocalVideoStreamError {
        }
    }

    public enum LocalVideoStreamState {
        LOCAL_VIDEO_STREAM_STATE_STOPPED,
        LOCAL_VIDEO_STREAM_STATE_RECORDING,
        LOCAL_VIDEO_STREAM_STATE_ENCODING,
        LOCAL_VIDEO_STREAM_STATE_FAILED,
        LocalVideoStreamState {
        }
    }

    public static class RtcAudioDumpStatus {
    }

    public enum RtcEchoTestResult {
        ECHO_UNKNOW,
        ECHO_EXCELLENT,
        ECHO_NORMAL,
        ECHO_BAD,
        ECHO_POOR
    }

    public enum RtcLogLevel {
        RTC_LOG_LEVEL_TRACE,
        RTC_LOG_LEVEL_DEBUG,
        RTC_LOG_LEVEL_INFO,
        RTC_LOG_LEVEL_WARNING,
        RTC_LOG_LEVEL_ERROR
    }

    public static class RtcMediaDeviceErrorCode {
    }

    public static class RtcMediaDeviceWarnCode {
    }

    public static class RtcWarnCode {
    }

    public void OnUpdateUserChannel(String str, String str2) {
    }

    public void onActiveSpeaker(String str) {
    }

    public void onApiCallExecuted(String str, int i) {
    }

    public void onApplyEffectResponse(int i, String str) {
    }

    public void onAudioDumpStatus(int i) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onCameraReady() {
    }

    public void onClientRoleChanged(int i, int i2) {
    }

    public void onConnectionBanned() {
    }

    public void onConnectionInterrupted() {
    }

    public void onConnectionLost() {
    }

    public void onConnectionTypeUpdated(boolean z) {
    }

    public void onDynamicLayoutPerfEnable(boolean z) {
    }

    public void onEchoTestProgress(int i) {
    }

    public void onEchoTestResult(RtcEchoTestResult rtcEchoTestResult) {
    }

    public void onError(int i) {
    }

    public void onFirstLocalAudioFrame(int i) {
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
    }

    public void onFirstMergeFrame(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteAudioFrame(String str, long j) {
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
    }

    public void onInviteAcceptedByPeer(String str, String str2) {
    }

    public void onInviteEndByMyself(String str, String str2) {
    }

    public void onInviteEndByPeer(String str, String str2) {
    }

    public void onInviteFailed(String str, String str2, int i) {
    }

    public void onInviteReceivedByPeer(String str, String str2) {
    }

    public void onJoinChannelSuccess(String str, String str2, int i) {
    }

    public void onLastmileQuality(int i) {
    }

    public void onLeaveChannel(RtcStats rtcStats) {
    }

    public void onLocalAudioStateChanged(int i, int i2) {
    }

    public void onLocalAudioStats(LocalAudioStats localAudioStats) {
    }

    public void onLocalAudioVolumeIndication(AudioVolumeInfo audioVolumeInfo) {
    }

    public void onLocalVideoStateChanged(int i, int i2) {
    }

    public void onLocalVideoStats(LocalVideoStats localVideoStats) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onMaximumScreenShareFpsUpdated(int i) {
    }

    public void onMediaDeviceChanged(MediaDeviceInfo mediaDeviceInfo) {
    }

    public void onMediaDeviceError(int i, String str, int i2) {
    }

    public void onMediaDeviceWarning(int i, String str, int i2) {
    }

    public void onMediaEngineLoadSuccess() {
    }

    public void onMediaEngineStartCallSuccess() {
    }

    public void onNeedAvatar(String str) {
    }

    public void onNetStateChanged(int i) {
    }

    public void onNetworkQuality(String str, NetworkQualityInfo networkQualityInfo) {
    }

    public void onNetworkQuality2(UserNetworkQualityInfo userNetworkQualityInfo, UserNetworkQualityInfo[] userNetworkQualityInfoArr) {
    }

    public void onRejoinChannelSuccess(String str, String str2, int i) {
    }

    public void onRemoteAudioStats(RemoteAudioStats remoteAudioStats) {
    }

    public void onRemoteAudioTransportStats(String str, int i, int i2, int i3) {
    }

    public void onRemoteVideoStateChanged(String str, int i) {
    }

    public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
    }

    public void onRequestToken() {
    }

    public void onResponse(String str) {
    }

    public void onRoomBinaryMessageReceived(ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str) {
    }

    public void onRtcStats(RtcStats rtcStats) {
    }

    public void onSetupVideoError(String str, String str2) {
    }

    public void onStreamAdd(String str, ByteStream byteStream) {
    }

    public void onStreamMessage(String str, int i, byte[] bArr) {
    }

    public void onStreamMessageError(String str, int i, int i2, int i3, int i4) {
    }

    public void onStreamPublishSucceed(String str) {
    }

    public void onStreamRemove(String str, ByteStream byteStream) {
    }

    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
    }

    public void onSystemOverloaded(SystemUsageInfo systemUsageInfo, String str) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserEnableAudio(String str, boolean z) {
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
    }

    public void onUserEnableVideo(String str, boolean z) {
    }

    public void onUserJoined(String str, int i) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMuteAudio(String str, boolean z) {
    }

    public void onUserMuteVideo(String str, boolean z) {
    }

    public void onUserOffline(String str, int i) {
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
    }

    public void onVideoStopped() {
    }

    public void onWarning(int i) {
    }

    public void onWebsocketDisconnect() {
    }

    public void uploadLogFinished(boolean z) {
    }

    public static class LocalAudioStats {
        public float audioLossRate;
        public int numChannels;
        public int recordSampleRate;
        public int rtt;
        public float sendKBitrate;
        public int sentSampleRate;
        public int statsInterval;

        public LocalAudioStats() {
        }

        public String toString() {
            return "LocalAudioStats{audioLossRate='" + this.audioLossRate + '\'' + ", sendKBitrate='" + this.sendKBitrate + '\'' + ", recordSampleRate='" + this.recordSampleRate + '\'' + ", rtt='" + this.rtt + '\'' + ", numChannels='" + this.numChannels + '\'' + ", sentSampleRate='" + this.sentSampleRate + '\'' + '}';
        }

        public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
            this.audioLossRate = internalLocalAudioStats.audioLossRate;
            this.sendKBitrate = (float) internalLocalAudioStats.sendKBitrate;
            this.recordSampleRate = internalLocalAudioStats.recordSampleRate;
            this.statsInterval = internalLocalAudioStats.statsInterval;
            this.rtt = internalLocalAudioStats.rtt;
            this.numChannels = internalLocalAudioStats.numChannels;
            this.sentSampleRate = internalLocalAudioStats.sentSampleRate;
        }
    }

    public static class LocalVideoStats {
        public int codecType;
        public int encodedBitrate;
        public int encodedFrameCount;
        public int encodedFrameHeight;
        public int encodedFrameWidth;
        public int encoderOutputFrameRate;
        public int inputFrameRate;
        public boolean isScreen;
        public int rendererOutputFrameRate;
        public int rtt;
        public int sentFrameRate;
        public float sentKBitrate;
        public int statsInterval;
        public int targetFrameRate;
        public int targetKBitrate;
        public float videoLossRate;

        public LocalVideoStats() {
        }

        public String toString() {
            return "LocalVideoStats{sentKBitrate='" + this.sentKBitrate + '\'' + ", inputFrameRate='" + this.inputFrameRate + '\'' + ", sentFrameRate='" + this.sentFrameRate + '\'' + ", encoderOutputFrameRate='" + this.encoderOutputFrameRate + '\'' + ", rendererOutputFrameRate='" + this.rendererOutputFrameRate + '\'' + ", targetKBitrate='" + this.targetKBitrate + '\'' + ", targetFrameRate='" + this.targetFrameRate + '\'' + ", videoLossRate='" + this.videoLossRate + '\'' + ", rtt='" + this.rtt + '\'' + ", encodedBitrate='" + this.encodedBitrate + '\'' + ", encodedFrameWidth='" + this.encodedFrameWidth + '\'' + ", encodedFrameHeight='" + this.encodedFrameHeight + '\'' + ", encodedFrameCount='" + this.encodedFrameCount + '\'' + ", codecType='" + this.codecType + '\'' + ", isScreen='" + this.isScreen + '\'' + '}';
        }

        public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
            this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
            this.inputFrameRate = internalLocalVideoStats.inputFrameRate;
            this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
            this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
            this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
            this.targetKBitrate = internalLocalVideoStats.targetKBitrate;
            this.targetFrameRate = internalLocalVideoStats.targetFrameRate;
            this.statsInterval = internalLocalVideoStats.statsInterval;
            this.videoLossRate = internalLocalVideoStats.videoLossRate;
            this.rtt = internalLocalVideoStats.rtt;
            this.encodedBitrate = internalLocalVideoStats.encodedBitrate;
            this.encodedFrameWidth = internalLocalVideoStats.encodedFrameWidth;
            this.encodedFrameHeight = internalLocalVideoStats.encodedFrameHeight;
            this.encodedFrameCount = internalLocalVideoStats.encodedFrameCount;
            this.codecType = internalLocalVideoStats.codecType;
            this.isScreen = internalLocalVideoStats.isScreen;
        }
    }

    public static class RemoteAudioStats {
        public float audioLossRate;
        public int concealedSamples;
        public int concealmentEvent;
        public int decDuration;
        public int decSampleRate;
        public long e2eDelay;
        public int frozenRate;
        public int jitterBufferDelay;
        public int numChannels;
        public int playoutSampleRate;
        public int quality;
        public float receivedKBitrate;
        public int receivedSampleRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public String uid;

        public RemoteAudioStats() {
        }

        public String toString() {
            return "RemoteAudioStats{uid='" + this.uid + '\'' + ", audioLossRate='" + this.audioLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + '}';
        }

        public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
            this.uid = internalRemoteAudioStats.uid;
            this.audioLossRate = internalRemoteAudioStats.audioLossRate;
            this.receivedKBitrate = (float) internalRemoteAudioStats.receivedKBitrate;
            this.stallCount = internalRemoteAudioStats.stallCount;
            this.stallDuration = internalRemoteAudioStats.stallDuration;
            this.e2eDelay = internalRemoteAudioStats.e2eDelay;
            this.playoutSampleRate = internalRemoteAudioStats.playoutSampleRate;
            this.statsInterval = internalRemoteAudioStats.statsInterval;
            this.rtt = internalRemoteAudioStats.rtt;
            this.quality = internalRemoteAudioStats.quality;
            this.jitterBufferDelay = internalRemoteAudioStats.jitterBufferDelay;
            this.numChannels = internalRemoteAudioStats.numChannels;
            this.receivedSampleRate = internalRemoteAudioStats.receivedSampleRate;
            this.frozenRate = internalRemoteAudioStats.frozenRate;
            this.concealedSamples = internalRemoteAudioStats.concealedSamples;
            this.concealmentEvent = internalRemoteAudioStats.concealmentEvent;
            this.decSampleRate = internalRemoteAudioStats.decSampleRate;
            this.decDuration = internalRemoteAudioStats.decDuration;
        }
    }

    public static class RemoteVideoStats {
        public int decoderOutputFrameRate;
        public long e2eDelay;
        public int frozenRate;
        public int height;
        public boolean isScreen;
        public float receivedKBitrate;
        public int rendererOutputFrameRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public String uid;
        public int videoIndex;
        public float videoLossRate;
        public int width;

        public RemoteVideoStats() {
        }

        public String toString() {
            return "RemoteVideoStats{uid='" + this.uid + '\'' + ", width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", videoLossRate='" + this.videoLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", decoderOutputFrameRate='" + this.decoderOutputFrameRate + '\'' + ", rendererOutputFrameRate='" + this.rendererOutputFrameRate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + ", isScreen='" + this.isScreen + '\'' + ", rtt='" + this.rtt + '\'' + ", frozenRate='" + this.frozenRate + '\'' + ", videoIndex='" + this.videoIndex + '\'' + '}';
        }

        public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
            this.uid = internalRemoteVideoStats.uid;
            this.width = internalRemoteVideoStats.width;
            this.height = internalRemoteVideoStats.height;
            this.videoLossRate = internalRemoteVideoStats.videoLossRate;
            this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
            this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
            this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
            this.stallCount = internalRemoteVideoStats.stallCount;
            this.e2eDelay = internalRemoteVideoStats.e2eDelay;
            this.isScreen = internalRemoteVideoStats.isScreen;
            this.statsInterval = internalRemoteVideoStats.statsInterval;
            this.rtt = internalRemoteVideoStats.rtt;
            this.frozenRate = internalRemoteVideoStats.frozenRate;
            this.videoIndex = internalRemoteVideoStats.videoIndex;
        }
    }

    public static class RtcStats {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int rxAudioKBitRate;
        public long rxBytes;
        public int rxKBitRate;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioKBitRate;
        public long txBytes;
        public int txKBitRate;
        public int txVideoKBitRate;
        public int users;

        public RtcStats() {
        }

        public void reset() {
            this.totalDuration = 0;
            this.txBytes = 0;
            this.rxBytes = 0;
            this.txKBitRate = 0;
            this.rxKBitRate = 0;
            this.txAudioKBitRate = 0;
            this.rxAudioKBitRate = 0;
            this.txVideoKBitRate = 0;
            this.rxVideoKBitRate = 0;
            this.users = 0;
            this.cpuTotalUsage = 0.0d;
            this.cpuAppUsage = 0.0d;
        }

        public String toString() {
            return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + '}';
        }

        public RtcStats(InternalRtcStats internalRtcStats) {
            this.totalDuration = internalRtcStats.totalDuration;
            this.txBytes = (long) internalRtcStats.txBytes;
            this.rxBytes = (long) internalRtcStats.rxBytes;
            this.txKBitRate = internalRtcStats.txKBitRate;
            this.rxKBitRate = internalRtcStats.rxKBitRate;
            this.txAudioKBitRate = internalRtcStats.txAudioKBitRate;
            this.rxAudioKBitRate = internalRtcStats.rxAudioKBitRate;
            this.txVideoKBitRate = internalRtcStats.txVideoKBitRate;
            this.rxVideoKBitRate = internalRtcStats.rxVideoKBitRate;
            this.users = internalRtcStats.users;
            this.cpuTotalUsage = internalRtcStats.cpuTotalUsage;
            this.cpuAppUsage = internalRtcStats.cpuAppUsage;
        }
    }

    public static class AudioVolumeInfo {
        public int smoothVolume;
        public String uid;
        public int volume;

        public String toString() {
            return "uid=" + this.uid + ",volume=" + this.volume + ",smooth=" + this.smoothVolume;
        }

        public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
            this.uid = internalAudioVolumeInfo.uid;
            this.volume = internalAudioVolumeInfo.volume;
            this.smoothVolume = internalAudioVolumeInfo.smooth_volume;
        }

        public AudioVolumeInfo(String str, int i, int i2) {
            this.uid = str;
            this.volume = i;
            this.smoothVolume = i2;
        }
    }

    public static class NetworkQualityInfo {
        public int direction;
        public double fractionLost;
        public int netWorkQuality;
        public int rtt;
        public int totalBandwidth;

        public String toString() {
            return "fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",netWorkQuality=" + this.netWorkQuality + ",direction=" + this.direction;
        }

        public NetworkQualityInfo(InternalNetworkQualityInfo internalNetworkQualityInfo) {
            this.fractionLost = internalNetworkQualityInfo.fractionLost;
            this.rtt = internalNetworkQualityInfo.rtt;
            this.totalBandwidth = internalNetworkQualityInfo.totalBandwidth;
            this.netWorkQuality = internalNetworkQualityInfo.netWorkQuality;
            this.direction = this.direction;
        }

        public NetworkQualityInfo(double d, int i, int i2, int i3, int i4) {
            this.fractionLost = d;
            this.rtt = i;
            this.totalBandwidth = i2;
            this.netWorkQuality = i3;
            this.direction = i4;
        }
    }

    public static class SystemUsageInfo {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public long memoryAppUsage;
        public long memoryTotalUsage;

        public String toString() {
            return "SystemUsageInfo{cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + ", memoryTotalUsage=" + this.memoryTotalUsage + ", memoryAppUsage=" + this.memoryAppUsage + '}';
        }
    }

    public static class UserNetworkQualityInfo {
        public double fractionLost;
        public int netWorkQuality;
        public int rtt;
        public int totalBandwidth;
        public String uid;

        public String toString() {
            return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",netWorkQuality=" + this.netWorkQuality;
        }

        public UserNetworkQualityInfo(InternalNetworkQualityInfo internalNetworkQualityInfo) {
            this.uid = internalNetworkQualityInfo.uid;
            this.fractionLost = internalNetworkQualityInfo.fractionLost;
            this.rtt = internalNetworkQualityInfo.rtt;
            this.totalBandwidth = internalNetworkQualityInfo.totalBandwidth;
            this.netWorkQuality = internalNetworkQualityInfo.netWorkQuality;
        }

        public UserNetworkQualityInfo(String str, double d, int i, int i2, int i3) {
            this.uid = str;
            this.fractionLost = d;
            this.rtt = i;
            this.totalBandwidth = i2;
            this.netWorkQuality = i3;
        }
    }

    public class RtcErrorCode {
        RtcErrorCode() {
        }
    }
}
