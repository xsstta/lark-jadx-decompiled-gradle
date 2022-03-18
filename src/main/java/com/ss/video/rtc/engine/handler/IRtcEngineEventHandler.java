package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.ByteStream;
import com.ss.video.rtc.engine.InternalAudioVolumeInfo;
import com.ss.video.rtc.engine.InternalLocalAudioStats;
import com.ss.video.rtc.engine.InternalLocalVideoStats;
import com.ss.video.rtc.engine.InternalRemoteAudioStats;
import com.ss.video.rtc.engine.InternalRemoteStreamSwitch;
import com.ss.video.rtc.engine.InternalRemoteVideoStats;
import com.ss.video.rtc.engine.InternalRtcStats;
import com.ss.video.rtc.engine.InternalRtcUser;
import com.ss.video.rtc.engine.InternalSourceWantedData;
import com.ss.video.rtc.engine.RtcEngine;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.SubscribeState;
import com.ss.video.rtc.engine.SysStats;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public abstract class IRtcEngineEventHandler {

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

    public enum RemoteAudioState {
        REMOTE_AUDIO_STATE_STOPPED,
        REMOTE_AUDIO_STATE_STARTING,
        REMOTE_AUDIO_STATE_DECODING,
        REMOTE_AUDIO_STATE_FROZEN,
        REMOTE_AUDIO_STATE_FAILED,
        RemoteAudioState {
        }
    }

    public enum RemoteAudioStateReason {
        REMOTE_AUDIO_REASON_INTERNAL,
        REMOTE_AUDIO_REASON_NETWORK_CONGESTION,
        REMOTE_AUDIO_REASON_NETWORK_RECOVERY,
        REMOTE_AUDIO_REASON_LOCAL_MUTED,
        REMOTE_AUDIO_REASON_LOCAL_UNMUTED,
        REMOTE_AUDIO_REASON_REMOTE_MUTED,
        REMOTE_AUDIO_REASON_REMOTE_UNMUTED,
        REMOTE_AUDIO_REASON_REMOTE_OFFLINE,
        RemoteAudioStateReason {
        }
    }

    public enum RemoteVideoState {
        REMOTE_VIDEO_STATE_STOPPED,
        REMOTE_VIDEO_STATE_STARTING,
        REMOTE_VIDEO_STATE_DECODING,
        REMOTE_VIDEO_STATE_FROZEN,
        REMOTE_VIDEO_STATE_FAILED,
        RemoteVideoState {
        }
    }

    public enum RemoteVideoStateReason {
        REMOTE_VIDEO_REASON_INTERNAL,
        REMOTE_VIDEO_REASON_NETWORK_CONGESTION,
        REMOTE_VIDEO_REASON_NETWORK_RECOVERY,
        REMOTE_VIDEO_REASON_LOCAL_MUTED,
        REMOTE_VIDEO_REASON_LOCAL_UNMUTED,
        REMOTE_VIDEO_REASON_REMOTE_MUTED,
        REMOTE_VIDEO_REASON_REMOTE_UNMUTED,
        REMOTE_VIDEO_REASON_REMOTE_OFFLINE,
        RemoteVideoStateReason {
        }
    }

    public static class RtcErrorCodeDescription {
    }

    public enum RtcLogLevel {
        RTC_LOG_LEVEL_TRACE,
        RTC_LOG_LEVEL_DEBUG,
        RTC_LOG_LEVEL_INFO,
        RTC_LOG_LEVEL_WARNING,
        RTC_LOG_LEVEL_ERROR
    }

    public enum RtcStreamRemoveReason {
        RtcStreamRemoveUnpublish,
        RtcStreamRemovePublishFailed,
        RtcStreamRemoveKeepLiveFailed,
        RtcStreamRemoveClientDisconnected,
        RtcStreamRemoveRepublish,
        RtcStreamRemoveOtherReason
    }

    public static class RtcWarnCode {
    }

    public void onActiveSpeaker(String str) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
    }

    public void onAudioRouteChanged(int i) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onConnectionInterrupted() {
    }

    public void onConnectionLost() {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onError(int i) {
    }

    public void onFirstLocalAudioFrame(int i) {
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
    }

    public void onFirstRemoteAudioFrame(String str, long j) {
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
    }

    public void onJoinChannelSuccess(String str, String str2, int i) {
    }

    public void onLeaveChannel(RtcStats rtcStats) {
    }

    public void onLocalAudioStateChanged(int i, int i2) {
    }

    public void onLocalAudioStats(LocalAudioStats localAudioStats) {
    }

    public void onLocalVideoStateChanged(int i, int i2) {
    }

    public void onLocalVideoStats(LocalVideoStats localVideoStats) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(RtcLogLevel rtcLogLevel, String str, Throwable th) {
    }

    public void onLoginCompletion(int i, ByteStream[] byteStreamArr) {
    }

    /* access modifiers changed from: package-private */
    public void onMediaDeviceStateChanged(int i, int i2) {
    }

    public void onMirrorStateChanged(boolean z) {
    }

    public void onMuteAllRemoteAudio(String str, boolean z) {
    }

    public void onMuteAllRemoteVideo(String str, boolean z) {
    }

    public void onNetworkQuality(String str, int i, int i2) {
    }

    public void onNetworkTypeChanged(int i) {
    }

    public void onPerformanceAlarms(int i, SourceWantedData sourceWantedData) {
    }

    public void onRejoinChannelSuccess(String str, String str2, int i) {
    }

    public void onRemoteAudioStateChanged(String str, int i, int i2, int i3) {
    }

    public void onRemoteAudioStats(RemoteAudioStats remoteAudioStats) {
    }

    public void onRemoteStreamSwitch(RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onRemoteUserAudioRecvModeChange(String str, RtcEngine.RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteUserAudioSendModeChange(String str, RtcEngine.RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteVideoStateChanged(String str, int i) {
    }

    public void onRemoteVideoStateChanged(String str, int i, int i2, int i3) {
    }

    public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
    }

    public void onResponse(String str) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onRoomMessageSendResult(long j, int i) {
    }

    public void onRtcStats(RtcStats rtcStats) {
    }

    public void onScreenStreamRemove(String str, String str2) {
    }

    public void onScreenVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onStreamAdd(ByteStream byteStream) {
    }

    public void onStreamPublishSucceed(String str, boolean z) {
    }

    public void onStreamPublished(String str, int i) {
    }

    public void onStreamRemove(ByteStream byteStream, RtcStreamRemoveReason rtcStreamRemoveReason) {
    }

    public void onStreamRemove(String str, String str2) {
    }

    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
    }

    public void onSubscribe(String str, boolean z) {
    }

    public void onSysStats(SysStats sysStats) {
    }

    public void onUnSubscribe(String str, boolean z) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
    }

    public void onUserJoined(String str, int i) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMessageSendResult(long j, int i) {
    }

    public void onUserMuteAudio(String str, boolean z) {
    }

    public void onUserMuteVideo(String str, boolean z) {
    }

    public void onUserOffline(String str, int i) {
    }

    public void onVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
    }

    public void onWarning(int i) {
    }

    public enum FallbackOrRecoverReason {
        Unknown(-1),
        SubscribeFallbackByBandwidth(0),
        SubscribeFallbackByPerformance(1),
        SubscribeRecoverByBandwidth(2),
        SubscribeRecoverByPerformance(3),
        PublishFallbackByBandwidth(4),
        PublishFallbackByPerformance(5),
        PublishRecoverByBandwidth(6),
        PublishRecoverByPerformance(7);
        
        int value = -1;

        public int value() {
            return this.value;
        }

        private FallbackOrRecoverReason(int i) {
            this.value = i;
        }
    }

    public enum FirstFramePlayState {
        FIRST_FRAME_PLAY_STATE_PLAYING(0),
        FIRST_FRAME_PLAY_STATE_PLAYED(1);
        
        private int state;

        public int value() {
            return this.state;
        }

        private FirstFramePlayState(int i) {
            this.state = i;
        }
    }

    public enum FirstFrameSendState {
        FIRST_FRAME_SEND_STATE_SENDING(0),
        FIRST_FRAME_SEND_STATE_SENT(1);
        
        private int state;

        public int value() {
            return this.state;
        }

        private FirstFrameSendState(int i) {
            this.state = i;
        }
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

    public static class MediaDeviceState {
        MediaDeviceState() {
        }
    }

    public static class MediaDeviceType {
        MediaDeviceType() {
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
            return "RemoteAudioStats{uid='" + this.uid + '\'' + ", audioLossRate='" + this.audioLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", playoutSampleRate='" + this.playoutSampleRate + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + ", rtt='" + this.rtt + '\'' + ", quality='" + this.quality + '\'' + ", jitterBufferDelay='" + this.jitterBufferDelay + '\'' + ", numChannels='" + this.numChannels + '\'' + ", receivedSampleRate='" + this.receivedSampleRate + '\'' + ", frozenRate='" + this.frozenRate + '\'' + ", concealedSamples='" + this.concealedSamples + '\'' + ", concealmentEvent='" + this.concealmentEvent + '\'' + ", decSampleRate='" + this.decSampleRate + '\'' + ", decDuration='" + this.decDuration + '\'' + '}';
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

    public static class RemoteStreamSwitch {
        public boolean after_enable;
        public int after_video_index;
        public boolean before_enable;
        public int before_video_index;
        public boolean isScreen;
        public FallbackOrRecoverReason reason;
        public String uid;

        public RemoteStreamSwitch() {
        }

        public String toString() {
            return "RemoteStreamSwitch{uid='" + this.uid + '\'' + ", isScreen='" + this.isScreen + '\'' + ", before_video_index='" + this.before_video_index + '\'' + ", after_video_index='" + this.after_video_index + '\'' + ", before_enable='" + this.before_enable + '\'' + ", after_enable='" + this.after_enable + '\'' + ", reason='" + this.reason + '\'' + '}';
        }

        public RemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
            this.uid = internalRemoteStreamSwitch.uid;
            this.before_video_index = internalRemoteStreamSwitch.before_video_index;
            this.after_video_index = internalRemoteStreamSwitch.after_video_index;
            this.before_enable = internalRemoteStreamSwitch.before_enable;
            this.after_enable = internalRemoteStreamSwitch.after_enable;
            this.reason = getFallbackOrRecoverReason(internalRemoteStreamSwitch.reason);
        }

        private FallbackOrRecoverReason getFallbackOrRecoverReason(int i) {
            switch (i) {
                case 0:
                    return FallbackOrRecoverReason.SubscribeFallbackByBandwidth;
                case 1:
                    return FallbackOrRecoverReason.SubscribeFallbackByPerformance;
                case 2:
                    return FallbackOrRecoverReason.SubscribeRecoverByBandwidth;
                case 3:
                    return FallbackOrRecoverReason.SubscribeRecoverByPerformance;
                case 4:
                    return FallbackOrRecoverReason.PublishFallbackByBandwidth;
                case 5:
                    return FallbackOrRecoverReason.PublishFallbackByPerformance;
                case 6:
                    return FallbackOrRecoverReason.PublishRecoverByBandwidth;
                case 7:
                    return FallbackOrRecoverReason.PublishRecoverByPerformance;
                default:
                    return FallbackOrRecoverReason.Unknown;
            }
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

    public static class SourceWantedData {
        public int frameRate;
        public int height;
        public int width;

        public SourceWantedData() {
        }

        public String toString() {
            return "SourceWantedData{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", frameRate='" + this.frameRate + '\'' + '}';
        }

        public SourceWantedData(InternalSourceWantedData internalSourceWantedData) {
            this.width = internalSourceWantedData.width;
            this.height = internalSourceWantedData.height;
            this.frameRate = internalSourceWantedData.frameRate;
        }
    }

    public static class RtcUser {
        public String metaData;
        public String userId;

        public String toString() {
            return "RemoteStreamSwitch{uid='" + this.userId + '\'' + ", metaData='" + this.metaData + '\'' + '}';
        }

        public RtcUser(InternalRtcUser internalRtcUser) {
            this.userId = internalRtcUser.userId;
            this.metaData = internalRtcUser.metaData;
        }
    }

    public class MessageSendResultCode {
        public MessageSendResultCode() {
        }
    }

    public class RtcErrorCode {
        RtcErrorCode() {
        }
    }

    public class RtcEventCode {
        RtcEventCode() {
        }
    }

    public class RtcTransCodeingErrorCode {
        RtcTransCodeingErrorCode() {
        }
    }

    public static class AudioVolumeInfo {
        public String uid;
        public int volume;

        public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
            this.uid = internalAudioVolumeInfo.uid;
            this.volume = internalAudioVolumeInfo.volume;
        }

        public AudioVolumeInfo(String str, int i) {
            this.uid = str;
            this.volume = i;
        }
    }
}
