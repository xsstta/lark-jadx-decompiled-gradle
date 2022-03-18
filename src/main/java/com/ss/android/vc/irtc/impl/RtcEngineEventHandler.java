package com.ss.android.vc.irtc.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.irtc.RtcConstants;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import com.ss.android.vc.irtc.RtcSystemUsageInfo;
import com.ss.android.vc.irtc.RtcUserNetworkQualityInfo;
import com.ss.android.vc.irtc.StreamDescription;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.irtc.impl.widget.webrtc.VideoSinkManager;
import com.ss.video.rtc.engine.ByteStream;
import com.ss.video.rtc.engine.VideoStreamDescription;
import com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public class RtcEngineEventHandler extends IMeetingRtcEngineEventHandler {
    private AbstractC61026e callback;
    private Handler mH = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.vc.irtc.impl.RtcEngineEventHandler.HandlerC610311 */

        public void handleMessage(Message message) {
            if (message.what == 1) {
                RtcEngineEventHandler.this.onConnectionLostUser();
            }
        }
    };
    private final Map<Integer, AbstractC61058j> mListeners = new HashMap();
    private RtcConstants.Status mRtcStatus = RtcConstants.Status.NONE;
    private VideoSinkManager videoSinkManager;

    public Map<Integer, AbstractC61058j> getListeners() {
        return this.mListeners;
    }

    public RtcConstants.Status getRtcStatus() {
        return this.mRtcStatus;
    }

    private void startInteruptedTimer() {
        this.mH.removeMessages(1);
        this.mH.sendEmptyMessageDelayed(1, 30000);
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onConnectionInterrupted() {
        this.mH.post(new Runnable() {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$yxBVIXFBOvIxQmfQ3gcwsY1x6w */

            public final void run() {
                RtcEngineEventHandler.this.lambda$onConnectionInterrupted$17$RtcEngineEventHandler();
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onConnectionLost() {
        this.mH.post(new Runnable() {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$afhf0W8Aduk776rZF9RuFUIAmrc */

            public final void run() {
                RtcEngineEventHandler.this.lambda$onConnectionLost$13$RtcEngineEventHandler();
            }
        });
    }

    public void onConnectionLostUser() {
        this.mH.post(new Runnable() {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$KGuHrvh3zSBflw9MVOjcppks6bk */

            public final void run() {
                RtcEngineEventHandler.this.lambda$onConnectionLostUser$18$RtcEngineEventHandler();
            }
        });
    }

    /* renamed from: com.ss.android.vc.irtc.impl.RtcEngineEventHandler$2 */
    static /* synthetic */ class C610322 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$SubscribeState;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.video.rtc.engine.SubscribeState[] r0 = com.ss.video.rtc.engine.SubscribeState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.$SwitchMap$com$ss$video$rtc$engine$SubscribeState = r0
                com.ss.video.rtc.engine.SubscribeState r1 = com.ss.video.rtc.engine.SubscribeState.SUBSCRIBE_STATE_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.$SwitchMap$com$ss$video$rtc$engine$SubscribeState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.video.rtc.engine.SubscribeState r1 = com.ss.video.rtc.engine.SubscribeState.SUBSCRIBE_STATE_FAILED_NOT_IN_ROOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.$SwitchMap$com$ss$video$rtc$engine$SubscribeState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.video.rtc.engine.SubscribeState r1 = com.ss.video.rtc.engine.SubscribeState.SUBSCRIBE_STATE_FAILED_STREAM_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.$SwitchMap$com$ss$video$rtc$engine$SubscribeState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.video.rtc.engine.SubscribeState r1 = com.ss.video.rtc.engine.SubscribeState.SUBSCRIBE_STATE_FAILED_AUTO_MODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.$SwitchMap$com$ss$video$rtc$engine$SubscribeState     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.video.rtc.engine.SubscribeState r1 = com.ss.video.rtc.engine.SubscribeState.SUBSCRIBE_STATE_FAILED_SIGNAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$onConnectionInterrupted$17$RtcEngineEventHandler() {
        if (!(this.mRtcStatus == RtcConstants.Status.INTERRUPTED || this.mRtcStatus == RtcConstants.Status.LOSS)) {
            this.mRtcStatus = RtcConstants.Status.INTERRUPTED;
            startInteruptedTimer();
            synchronized (this.mListeners) {
                for (AbstractC61058j jVar : this.mListeners.values()) {
                    jVar.mo196964b();
                }
            }
        }
    }

    public /* synthetic */ void lambda$onConnectionLost$13$RtcEngineEventHandler() {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo196959a();
            }
        }
    }

    public /* synthetic */ void lambda$onConnectionLostUser$18$RtcEngineEventHandler() {
        this.mRtcStatus = RtcConstants.Status.LOSS;
        this.mH.removeMessages(1);
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo196965c();
            }
        }
    }

    public void setCallback(AbstractC61026e eVar) {
        this.callback = eVar;
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onFirstLocalAudioFrame(int i) {
        this.mH.post(new Runnable(i) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$PDN7xGW5SqMTSRgSFKPDPCnUvNs */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onFirstLocalAudioFrame$16$RtcEngineEventHandler(this.f$1);
            }
        });
    }

    public RtcEngineEventHandler(VideoSinkManager videoSinkManager2) {
        this.videoSinkManager = videoSinkManager2;
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onWarning(int i) {
        AbstractC61026e eVar;
        super.onWarning(i);
        if (i != 0 && (eVar = this.callback) != null) {
            eVar.logD("RtcEngineEventHandler", "[onWarning] warn = " + i);
        }
    }

    public void removeListener(int i) {
        synchronized (this.mListeners) {
            this.mListeners.remove(Integer.valueOf(i));
        }
    }

    public /* synthetic */ void lambda$onError$2$RtcEngineEventHandler(int i) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo196738a(i);
            }
        }
    }

    public /* synthetic */ void lambda$onFirstLocalAudioFrame$16$RtcEngineEventHandler(int i) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210630b(i);
            }
        }
    }

    public /* synthetic */ void lambda$onFirstRemoteAudioFrame$15$RtcEngineEventHandler(String str) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo196961a(str);
            }
        }
    }

    public /* synthetic */ void lambda$onUserJoined$0$RtcEngineEventHandler(String str) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210633b(str);
            }
        }
    }

    public /* synthetic */ void lambda$onUserOffline$5$RtcEngineEventHandler(String str) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210639c(str);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onConnectionTypeUpdated(boolean z) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onConnectionTypeUpdated] " + z);
        }
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210628a(z);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onEchoTestProgress(int i) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onEchoTestProgress] " + i);
        }
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210642d(i);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onError(int i) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logE("RtcEngineEventHandler", "[onError] err = " + i);
        }
        this.mRtcStatus = RtcConstants.Status.ERROR;
        this.mH.removeMessages(1);
        this.mH.post(new Runnable(i) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$ChkN3ZkL6b0bc0FgtVRcTy7GhYE */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onError$2$RtcEngineEventHandler(this.f$1);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onLocalAudioVolumeIndication(IMeetingRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210618a(new RtcAudioVolumeInfo(audioVolumeInfo.uid, audioVolumeInfo.volume, audioVolumeInfo.smoothVolume));
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onMaximumScreenShareFpsUpdated(int i) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210637c(i);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onRoomBinaryMessageReceived(ByteBuffer byteBuffer) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210627a(byteBuffer);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onEchoTestResult(IMeetingRtcEngineEventHandler.RtcEchoTestResult rtcEchoTestResult) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onEchoTestResult] " + rtcEchoTestResult + " xx: " + rtcEchoTestResult.name());
        }
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210643d(rtcEchoTestResult.name());
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onRtcStats(IMeetingRtcEngineEventHandler.RtcStats rtcStats) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onRtcStats] rx = " + rtcStats.rxBytes + ", tx = " + rtcStats.txBytes);
        }
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210617a(rtcStats.rxBytes, rtcStats.txBytes, rtcStats.cpuAppUsage, rtcStats.cpuTotalUsage);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onFirstRemoteAudioFrame(String str, long j) {
        this.mH.post(new Runnable(str) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$QUvQj7pXgdZHjHR4XgpSeMkWAJ8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onFirstRemoteAudioFrame$15$RtcEngineEventHandler(this.f$1);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onStreamAdd(String str, ByteStream byteStream) {
        this.mH.post(new Runnable(byteStream, str) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$xMnkzmlpzhExTW590K6uZRsU4nY */
            public final /* synthetic */ ByteStream f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onStreamAdd$19$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onStreamRemove(String str, ByteStream byteStream) {
        this.mH.post(new Runnable(byteStream, str) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$dcFR9xBUzC251ZNXQ1kbJmSs5g */
            public final /* synthetic */ ByteStream f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onStreamRemove$11$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onUserEnableLocalVideo(String str, boolean z) {
        this.mH.post(new Runnable(str, z) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$a99orjSgT7qv6aBg9JGgBM7ggs */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onUserEnableLocalVideo$10$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onUserMuteAudio(String str, boolean z) {
        this.mH.post(new Runnable(str, z) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$HOHiKdBlkRtzo2rezVNZwJYu8YY */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onUserMuteAudio$8$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onUserMuteVideo(String str, boolean z) {
        this.mH.post(new Runnable(str, z) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$ru2POwws_KGcLYsLkUplKDzqJU */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onUserMuteVideo$9$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onUserOffline(String str, int i) {
        this.mH.post(new Runnable(str) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$V17aLFRmNyX1s8WwMpqUOlgUA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onUserOffline$5$RtcEngineEventHandler(this.f$1);
            }
        });
    }

    public void addListener(int i, AbstractC61058j jVar) {
        synchronized (this.mListeners) {
            this.mListeners.put(Integer.valueOf(i), jVar);
        }
    }

    public /* synthetic */ void lambda$onFirstLocalVideoFrame$7$RtcEngineEventHandler(int i, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo208480a(i, i2);
            }
        }
    }

    public /* synthetic */ void lambda$onJoinChannelSuccess$1$RtcEngineEventHandler(String str, String str2) {
        this.mRtcStatus = RtcConstants.Status.JOINED;
        this.mH.removeMessages(1);
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo196963a(str, str2);
            }
        }
    }

    public /* synthetic */ void lambda$onRejoinChannelSuccess$12$RtcEngineEventHandler(String str, String str2) {
        this.mRtcStatus = RtcConstants.Status.JOINED;
        this.mH.removeMessages(1);
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210640c(str, str2);
            }
        }
    }

    public /* synthetic */ void lambda$onStreamRemove$11$RtcEngineEventHandler(ByteStream byteStream, String str) {
        synchronized (this.mListeners) {
            this.videoSinkManager.onStreamRemove(byteStream.userId, byteStream.isScreen);
            for (AbstractC61058j jVar : this.mListeners.values()) {
                if (byteStream.isScreen) {
                    jVar.mo210644d(byteStream.userId, str);
                } else {
                    jVar.mo210635b(byteStream.userId, str);
                }
            }
        }
    }

    public /* synthetic */ void lambda$onUserEnableLocalVideo$10$RtcEngineEventHandler(String str, boolean z) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210641c(str, z);
            }
        }
    }

    public /* synthetic */ void lambda$onUserMuteAudio$8$RtcEngineEventHandler(String str, boolean z) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210636b(str, z);
            }
        }
    }

    public /* synthetic */ void lambda$onUserMuteVideo$9$RtcEngineEventHandler(String str, boolean z) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210626a(str, z);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onAudioVolumeIndication(IMeetingRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
        RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr = new RtcAudioVolumeInfo[audioVolumeInfoArr.length];
        for (int i2 = 0; i2 < audioVolumeInfoArr.length; i2++) {
            IMeetingRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
            rtcAudioVolumeInfoArr[i2] = new RtcAudioVolumeInfo(audioVolumeInfo.uid, audioVolumeInfo.volume, audioVolumeInfo.smoothVolume);
        }
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210629a(rtcAudioVolumeInfoArr, i);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onLocalAudioStateChanged(int i, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210631b(i, i2);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onLocalVideoStateChanged(int i, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210638c(i, i2);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onLogReport(String str, JSONObject jSONObject) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo197060a(str, jSONObject);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onNetworkQuality(String str, IMeetingRtcEngineEventHandler.NetworkQualityInfo networkQualityInfo) {
        RtcNetworkQualityInfo rtcNetworkQualityInfo = new RtcNetworkQualityInfo(networkQualityInfo.fractionLost, networkQualityInfo.rtt, networkQualityInfo.totalBandwidth, networkQualityInfo.netWorkQuality, networkQualityInfo.direction);
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo196962a(str, rtcNetworkQualityInfo);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onSystemOverloaded(IMeetingRtcEngineEventHandler.SystemUsageInfo systemUsageInfo, String str) {
        super.onSystemOverloaded(systemUsageInfo, str);
        RtcSystemUsageInfo rtcSystemUsageInfo = new RtcSystemUsageInfo();
        rtcSystemUsageInfo.cpuAppUsage = systemUsageInfo.cpuAppUsage;
        rtcSystemUsageInfo.cpuTotalUsage = systemUsageInfo.cpuTotalUsage;
        rtcSystemUsageInfo.memoryAppUsage = systemUsageInfo.memoryAppUsage;
        rtcSystemUsageInfo.memoryTotalUsage = systemUsageInfo.memoryTotalUsage;
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210619a(rtcSystemUsageInfo, str);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210625a(str, byteBuffer);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onUserJoined(String str, int i) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onUserJoined] uid = " + str);
        }
        this.mH.post(new Runnable(str) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$MKis36ORI1csVdxklMV1kwYC65o */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onUserJoined$0$RtcEngineEventHandler(this.f$1);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onNetworkQuality2(IMeetingRtcEngineEventHandler.UserNetworkQualityInfo userNetworkQualityInfo, IMeetingRtcEngineEventHandler.UserNetworkQualityInfo[] userNetworkQualityInfoArr) {
        RtcUserNetworkQualityInfo rtcUserNetworkQualityInfo = new RtcUserNetworkQualityInfo(userNetworkQualityInfo.uid, userNetworkQualityInfo.fractionLost, userNetworkQualityInfo.rtt, userNetworkQualityInfo.totalBandwidth, userNetworkQualityInfo.netWorkQuality);
        int length = userNetworkQualityInfoArr.length;
        RtcUserNetworkQualityInfo[] rtcUserNetworkQualityInfoArr = new RtcUserNetworkQualityInfo[length];
        for (int i = 0; i < length; i++) {
            IMeetingRtcEngineEventHandler.UserNetworkQualityInfo userNetworkQualityInfo2 = userNetworkQualityInfoArr[i];
            rtcUserNetworkQualityInfoArr[i] = new RtcUserNetworkQualityInfo(userNetworkQualityInfo2.uid, userNetworkQualityInfo2.fractionLost, userNetworkQualityInfo2.rtt, userNetworkQualityInfo2.totalBandwidth, userNetworkQualityInfo2.netWorkQuality);
        }
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210620a(rtcUserNetworkQualityInfo, rtcUserNetworkQualityInfoArr);
            }
        }
    }

    public /* synthetic */ void lambda$onStreamAdd$19$RtcEngineEventHandler(ByteStream byteStream, String str) {
        synchronized (this.mListeners) {
            this.videoSinkManager.onStreamAdd(byteStream.userId, byteStream.isScreen);
            for (AbstractC61058j jVar : this.mListeners.values()) {
                if (byteStream.isScreen) {
                    jVar.mo210645e(byteStream.userId, str);
                } else {
                    VcByteStream vcByteStream = new VcByteStream();
                    vcByteStream.f152911e = byteStream.hasAudio;
                    vcByteStream.f152910d = byteStream.hasVideo;
                    vcByteStream.f152909c = byteStream.isScreen;
                    vcByteStream.f152907a = str;
                    vcByteStream.f152908b = byteStream.userId;
                    vcByteStream.f152912f = new LinkedList();
                    if (byteStream.videoStreamDescriptions != null) {
                        for (VideoStreamDescription videoStreamDescription : byteStream.videoStreamDescriptions) {
                            StreamDescription streamDescription = new StreamDescription();
                            streamDescription.f152900a = ((Integer) videoStreamDescription.videoSize.first).intValue();
                            streamDescription.f152901b = ((Integer) videoStreamDescription.videoSize.second).intValue();
                            streamDescription.f152902c = videoStreamDescription.frameRate;
                            streamDescription.f152903d = videoStreamDescription.maxKbps;
                            streamDescription.f152904e = videoStreamDescription.scaleMode.ordinal();
                            vcByteStream.f152912f.add(streamDescription);
                        }
                    }
                    jVar.mo210621a(vcByteStream, str);
                }
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
        this.mH.post(new Runnable(i, i2) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$73AY5aTlbcp1G7LYCcCKff8rhbs */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onFirstLocalVideoFrame$7$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onRejoinChannelSuccess(String str, String str2, int i) {
        this.mH.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$ve6phOj79DS1isZ3unypd78GIWI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onRejoinChannelSuccess$12$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$onFirstRemoteScreenFrame$14$RtcEngineEventHandler(String str, int i, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210634b(str, i, i2);
            }
        }
    }

    public /* synthetic */ void lambda$onFirstRemoteVideoFrame$6$RtcEngineEventHandler(String str, int i, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210622a(str, i, i2);
            }
        }
    }

    public /* synthetic */ void lambda$onMediaDeviceError$4$RtcEngineEventHandler(int i, String str, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo208481a(i, str, i2);
            }
        }
    }

    public /* synthetic */ void lambda$onMediaDeviceWarning$3$RtcEngineEventHandler(int i, String str, int i2) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210632b(i, str, i2);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onJoinChannelSuccess(String str, String str2, int i) {
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onJoinChannelSuccess] uid = " + str2);
        }
        this.mH.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$RvhSduEHt_CHgHfIMUeGDsWXX0 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onJoinChannelSuccess$1$RtcEngineEventHandler(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onMediaDeviceError(int i, String str, int i2) {
        super.onMediaDeviceError(i, str, i2);
        if (i2 != 0) {
            AbstractC61026e eVar = this.callback;
            if (eVar != null) {
                eVar.logE("RtcEngineEventHandler", "[onMediaDeviceError] code = " + i2);
            }
            this.mRtcStatus = RtcConstants.Status.ERROR;
            this.mH.removeMessages(1);
            this.mH.post(new Runnable(i, str, i2) {
                /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$URu94XveS9IwfGq1xU40IhrcNvM */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ int f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    RtcEngineEventHandler.this.lambda$onMediaDeviceError$4$RtcEngineEventHandler(this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onMediaDeviceWarning(int i, String str, int i2) {
        super.onMediaDeviceWarning(i, str, i2);
        if (i2 != 0) {
            AbstractC61026e eVar = this.callback;
            if (eVar != null) {
                eVar.logD("RtcEngineEventHandler", "[onMediaDeviceWarning] code = " + i2);
            }
            this.mH.post(new Runnable(i, str, i2) {
                /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$fgq6KaG9his4J4KOUgm2vi6dc */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ int f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    RtcEngineEventHandler.this.lambda$onMediaDeviceWarning$3$RtcEngineEventHandler(this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onStreamMessage(String str, int i, byte[] bArr) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210624a(str, i, bArr);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r6 != 5) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC] */
    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStreamSubscribed(com.ss.video.rtc.engine.SubscribeState r6, java.lang.String r7, com.ss.video.rtc.engine.SubscribeConfig r8) {
        /*
            r5 = this;
            int[] r0 = com.ss.android.vc.irtc.impl.RtcEngineEventHandler.C610322.$SwitchMap$com$ss$video$rtc$engine$SubscribeState
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r6 == r3) goto L_0x0018
            if (r6 == r2) goto L_0x001e
            if (r6 == r1) goto L_0x001c
            if (r6 == r0) goto L_0x001a
            r1 = 5
            if (r6 == r1) goto L_0x001f
        L_0x0018:
            r0 = 0
            goto L_0x001f
        L_0x001a:
            r0 = 3
            goto L_0x001f
        L_0x001c:
            r0 = 2
            goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            java.util.Map<java.lang.Integer, com.ss.android.vc.irtc.j> r6 = r5.mListeners
            monitor-enter(r6)
            java.util.Map<java.lang.Integer, com.ss.android.vc.irtc.j> r1 = r5.mListeners     // Catch:{ all -> 0x0042 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0042 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0042 }
        L_0x002c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0042 }
            com.ss.android.vc.irtc.j r2 = (com.ss.android.vc.irtc.AbstractC61058j) r2     // Catch:{ all -> 0x0042 }
            boolean r3 = r8.subAudio     // Catch:{ all -> 0x0042 }
            boolean r4 = r8.subVideo     // Catch:{ all -> 0x0042 }
            r2.mo210616a(r0, r7, r3, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x002c
        L_0x0040:
            monitor-exit(r6)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0042 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.RtcEngineEventHandler.onStreamSubscribed(com.ss.video.rtc.engine.SubscribeState, java.lang.String, com.ss.video.rtc.engine.SubscribeConfig):void");
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
        this.mH.post(new Runnable(str, i, i2) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$9cuCYxoK_2QO6ah21IKnJx6aHdI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onFirstRemoteScreenFrame$14$RtcEngineEventHandler(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
        this.mH.post(new Runnable(str, i, i2) {
            /* class com.ss.android.vc.irtc.impl.$$Lambda$RtcEngineEventHandler$_qwvCj9ARwPAifNfq7dl9XG_b6Q */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                RtcEngineEventHandler.this.lambda$onFirstRemoteVideoFrame$6$RtcEngineEventHandler(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
        super.onVideoSizeChanged(str, i, i2, i3);
        AbstractC61026e eVar = this.callback;
        if (eVar != null) {
            eVar.logD("RtcEngineEventHandler", "[onVideoSizeChanged] uid = " + str + ", width = " + i + ", height = " + i2 + ", rotation = " + i3);
        }
    }

    @Override // com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler
    public void onStreamMessageError(String str, int i, int i2, int i3, int i4) {
        synchronized (this.mListeners) {
            for (AbstractC61058j jVar : this.mListeners.values()) {
                jVar.mo210623a(str, i, i2, i3, i4);
            }
        }
    }
}
