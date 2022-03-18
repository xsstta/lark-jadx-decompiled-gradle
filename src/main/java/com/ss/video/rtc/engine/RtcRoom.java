package com.ss.video.rtc.engine;

import android.util.Log;
import com.ss.video.rtc.engine.RtcEngine;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.adapter.VideoSinkAdapter;
import com.ss.video.rtc.engine.handler.ByteRtcRoomEventHandler;
import com.ss.video.rtc.engine.handler.IRtcRoomEventHandler;
import com.ss.video.rtc.engine.live.LiveTranscoding;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

public class RtcRoom extends IRtcRoom {
    private ByteRtcRoomEventHandler mByteRtcRoomEventHandler;
    private boolean mEnableTranscode;
    private LiveTranscoding mLiveTranscoding;
    private long mNativeRtcRoom;
    private long mNativeRtcRoomEventHandler;
    private String mRoom;
    private WeakReference<C65562RtcEngineImpl> mRtcEngine;
    private IRtcRoomEventHandler mRtcRoomHandler;
    private String mUser;

    public IRtcRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void disableLiveTranscoding() {
        LogUtil.m257129d("RtcRoom", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, disableLiveTranscoding failed.");
        } else {
            NativeRtcRoomFunctions.nativeDisableLiveTranscoding(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void leaveRoom() {
        LogUtil.m257129d("RtcRoom", "leaveChannel");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, leaveChannel failed.");
            return;
        }
        this.mRoom = "";
        this.mUser = "";
        NativeRtcRoomFunctions.nativeLeaveRoom(j);
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void muteAllRemoteAudioStreams() {
        LogUtil.m257129d("RtcRoom", "muteAllRemoteAudioStreams...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, MuteAllRemoteAudioStreams failed.");
        } else {
            NativeRtcRoomFunctions.nativeMuteAllRemoteAudioStreams(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void muteAllRemoteVideoStreams() {
        LogUtil.m257129d("RtcRoom", "MuteAllRemoteVideoStreams");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, MuteAllRemoteVideoStreams failed.");
        } else {
            NativeRtcRoomFunctions.nativeMuteAllRemoteVideoStreams(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void publish() {
        LogUtil.m257129d("RtcRoom", "Publish");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, Publish failed.");
        } else {
            NativeRtcRoomFunctions.nativePublish(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void publishScreen() {
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, publishScreen failed.");
        } else {
            NativeRtcRoomFunctions.nativePublishScreen(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unmuteAllRemoteAudioStreams() {
        LogUtil.m257129d("RtcRoom", "muteAllRemoteAudioStreams...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, UnmuteAllRemoteAudioStreams failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnmuteAllRemoteAudioStreams(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unmuteAllRemoteVideoStreams() {
        LogUtil.m257129d("RtcRoom", "UnmuteAllRemoteVideoStreams");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, UnmuteAllRemoteVideoStreams failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnmuteAllRemoteVideoStreams(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unpublish() {
        LogUtil.m257129d("RtcRoom", "Unpublish");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, Unpublish failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnpublish(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unpublishScreen() {
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, unpublishScreen failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnpublishScreen(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void destroy() {
        LogUtil.m257129d("RtcRoom", "Destroy ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, Destroy failed.");
            return;
        }
        NativeRtcRoomFunctions.nativeDestory(j);
        this.mNativeRtcRoom = 0;
        NativeRtcRoomFunctions.nativeReleaseRTCRoomEventHandler(this.mNativeRtcRoomEventHandler);
        this.mNativeRtcRoomEventHandler = 0;
    }

    /* renamed from: com.ss.video.rtc.engine.RtcRoom$1 */
    static /* synthetic */ class C655641 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$RtcEngine$CLIENT_ROLE_TYPE;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.ss.video.rtc.engine.RtcEngine$CHANNEL_PROFILE_TYPE[] r0 = com.ss.video.rtc.engine.RtcEngine.CHANNEL_PROFILE_TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.video.rtc.engine.RtcRoom.C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE = r0
                r1 = 1
                com.ss.video.rtc.engine.RtcEngine$CHANNEL_PROFILE_TYPE r2 = com.ss.video.rtc.engine.RtcEngine.CHANNEL_PROFILE_TYPE.CHANNEL_PROFILE_LIVE_BROADCASTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.video.rtc.engine.RtcRoom.C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.video.rtc.engine.RtcEngine$CHANNEL_PROFILE_TYPE r3 = com.ss.video.rtc.engine.RtcEngine.CHANNEL_PROFILE_TYPE.CHANNEL_PROFILE_COMMUNICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.ss.video.rtc.engine.RtcRoom.C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.video.rtc.engine.RtcEngine$CHANNEL_PROFILE_TYPE r3 = com.ss.video.rtc.engine.RtcEngine.CHANNEL_PROFILE_TYPE.CHANNEL_PROFILE_CLOUD_GAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = com.ss.video.rtc.engine.RtcRoom.C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.video.rtc.engine.RtcEngine$CHANNEL_PROFILE_TYPE r3 = com.ss.video.rtc.engine.RtcEngine.CHANNEL_PROFILE_TYPE.CHANNEL_PROFILE_GAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ss.video.rtc.engine.RtcEngine$CLIENT_ROLE_TYPE[] r2 = com.ss.video.rtc.engine.RtcEngine.CLIENT_ROLE_TYPE.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.ss.video.rtc.engine.RtcRoom.C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CLIENT_ROLE_TYPE = r2
                com.ss.video.rtc.engine.RtcEngine$CLIENT_ROLE_TYPE r3 = com.ss.video.rtc.engine.RtcEngine.CLIENT_ROLE_TYPE.CLIENT_ROLE_SILENT_AUDIENCE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.video.rtc.engine.RtcRoom.C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CLIENT_ROLE_TYPE     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.video.rtc.engine.RtcEngine$CLIENT_ROLE_TYPE r2 = com.ss.video.rtc.engine.RtcEngine.CLIENT_ROLE_TYPE.CLIENT_ROLE_BROADCASTER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.RtcRoom.C655641.<clinit>():void");
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void muteRemoteAudioStream(String str) {
        LogUtil.m257129d("RtcRoom", "MuteRemoteAudioStream...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, MuteRemoteAudioStream failed.");
        } else {
            NativeRtcRoomFunctions.nativeMuteRemoteAudioStream(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void sendRoomBinaryMessage(byte[] bArr) {
        LogUtil.m257129d("RtcRoom", "SendRoomBinaryMessage ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SendRoomBinaryMessage failed.");
        } else {
            NativeRtcRoomFunctions.nativeSendRoomBinaryMessage(j, bArr);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void sendRoomMessage(String str) {
        LogUtil.m257129d("RtcRoom", "SendRoomMessage ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SendRoomMessage failed.");
        } else {
            NativeRtcRoomFunctions.nativeSendRoomMessage(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setCustomUserRole(String str) {
        LogUtil.m257129d("RtcRoom", "SetCustomUserRole ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetCustomUserRole failed.");
        } else {
            NativeRtcRoomFunctions.nativeSetCustomUserRole(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unmuteRemoteAudioStream(String str) {
        LogUtil.m257129d("RtcRoom", "UnmuteRemoteAudioStream...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, UnmuteRemoteAudioStream failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnmuteRemoteAudioStream(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void enableSubscribeLocalStream(boolean z) {
        LogUtil.m257129d("RtcRoom", "enableSubscribeLocalStream: " + z);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, EnableSubscribeLocalStream failed.");
        } else {
            NativeRtcRoomFunctions.nativeEnableSubscribeLocalStream(j, z);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void muteRemoteVideoStream(String str) {
        LogUtil.m257129d("RtcRoom", "muteRemoteVideoStream, uid: " + str);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, MuteRemoteVideoStream failed.");
        } else {
            NativeRtcRoomFunctions.nativeMuteRemoteVideoStream(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void renewToken(String str) {
        LogUtil.m257129d("RtcRoom", "RenewToken. token : " + str);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, RenewToken failed.");
        } else {
            NativeRtcRoomFunctions.nativeRenewToken(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setClientRole(RtcEngine.CLIENT_ROLE_TYPE client_role_type) {
        LogUtil.m257129d("RtcRoom", "setClientRole. role : " + client_role_type);
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, setClientRole failed.");
            return;
        }
        int i = C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CLIENT_ROLE_TYPE[client_role_type.ordinal()];
        int i2 = 1;
        if (i == 1 || i != 2) {
            i2 = 3;
        }
        NativeRtcRoomFunctions.nativeSetClientRole(this.mNativeRtcRoom, i2);
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setDefaultMuteAllRemoteAudioStreams(boolean z) {
        LogUtil.m257129d("RtcRoom", "setDefaultMuteAllRemoteAudioStreams: " + z);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetDefaultMuteAllRemoteAudioStreams failed.");
        } else {
            NativeRtcRoomFunctions.nativeSetDefaultMuteAllRemoteAudioStreams(j, z);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setDefaultMuteAllRemoteVideoStreams(boolean z) {
        LogUtil.m257129d("RtcRoom", "SetDefaultMuteAllRemoteVideoStreams: " + z);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetDefaultMuteAllRemoteVideoStreams failed.");
        } else {
            NativeRtcRoomFunctions.nativeSetDefaultMuteAllRemoteVideoStreams(j, z);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setRTCRoomEventHandler(IRtcRoomEventHandler iRtcRoomEventHandler) {
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native room is invalid, setRTCRoomEventHandler failed.");
            return;
        }
        this.mRtcRoomHandler = iRtcRoomEventHandler;
        ByteRtcRoomEventHandler byteRtcRoomEventHandler = new ByteRtcRoomEventHandler(this);
        this.mByteRtcRoomEventHandler = byteRtcRoomEventHandler;
        long j = this.mNativeRtcRoomEventHandler;
        this.mNativeRtcRoomEventHandler = NativeRtcRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, byteRtcRoomEventHandler);
        if (j != 0) {
            NativeRtcRoomFunctions.nativeReleaseRTCRoomEventHandler(j);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setupRemoteScreen(VideoCanvas videoCanvas) {
        LogUtil.m257129d("RtcRoom", "SetupRemoteScreen...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetupRemoteScreen failed.");
            return;
        }
        NativeFunctions.nativeSetupRemoteVideo(j, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.uid, videoCanvas.isScreen);
        this.mRtcEngine.get();
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setupRemoteVideo(VideoCanvas videoCanvas) {
        LogUtil.m257129d("RtcRoom", "SetupRemoteVideo...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetupRemoteVideo failed.");
        } else {
            NativeFunctions.nativeSetupRemoteVideo(j, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.uid, videoCanvas.isScreen);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unmuteRemoteVideoStream(String str) {
        LogUtil.m257129d("RtcRoom", "UnmuteRemoteVideoStream, uid: " + str);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, UnmuteRemoteVideoStream failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnmuteRemoteVideoStream(j, str);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void enableLiveTranscoding(LiveTranscoding liveTranscoding) {
        LogUtil.m257129d("RtcRoom", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m257129d("RtcRoom", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
        } else if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, enableLiveTranscoding failed.");
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            liveTranscoding.setAction("started");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            LogUtil.m257129d("RtcRoom", "enableLiveTranscoding...liveTranscodeJson: " + jSONObject);
            NativeRtcRoomFunctions.nativeEnableLiveTranscoding(this.mNativeRtcRoom, jSONObject);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setChannelProfile(RtcEngine.CHANNEL_PROFILE_TYPE channel_profile_type) {
        LogUtil.m257129d("RtcRoom", "setChannelProfile. profile : " + channel_profile_type);
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, setChannelProfile failed.");
            return;
        }
        int i = C655641.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE[channel_profile_type.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        i2 = 2;
                    }
                }
            }
            i2 = 0;
        } else {
            i2 = 1;
        }
        NativeRtcRoomFunctions.nativeSetChannelProfile(this.mNativeRtcRoom, i2);
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setVideoCompositingLayout(LiveTranscoding.Layout layout) {
        LogUtil.m257129d("RtcRoom", "setVideoCompositingLayout...");
        LiveTranscoding liveTranscoding = this.mLiveTranscoding;
        if (liveTranscoding == null) {
            LogUtil.m257129d("RtcRoom", "setVideoCompositingLayout...mLiveTranscoding is null, no effect, please check.");
        } else if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, setVideoCompositingLayout failed.");
        } else {
            liveTranscoding.setLayout(layout);
            this.mLiveTranscoding.setAction("layoutChanged");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            LogUtil.m257129d("RtcRoom", "setVideoCompositingLayout...liveTranscodeJson: " + jSONObject);
            NativeRtcRoomFunctions.nativeSetVideoCompositingLayout(this.mNativeRtcRoom, jSONObject);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void subscribe(String str, SubscribeConfig subscribeConfig) {
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, Subscribe failed.");
        } else {
            NativeRtcRoomFunctions.nativeSubscribe(j, str, subscribeConfig);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void unsubscribe(String str, boolean z) {
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, Unsubscribe failed.");
        } else {
            NativeRtcRoomFunctions.nativeUnsubscribe(j, str, z);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void enableAudioVolumeIndication(int i, int i2) {
        LogUtil.m257129d("RtcRoom", "enableAudioVolumeIndication voiderval: " + i + " ,smooth: " + i2);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, EnableAudioVolumeIndication failed.");
        } else {
            NativeRtcRoomFunctions.nativeEnableAudioVolumeIndication(j, i, i2);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void sendUserBinaryMessage(String str, byte[] bArr) {
        LogUtil.m257129d("RtcRoom", "SendUserBinaryMessage. uid : " + str + ", message length:" + bArr.length);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SendUserBinaryMessage failed.");
        } else {
            NativeRtcRoomFunctions.nativeSendUserBinaryMessage(j, str, bArr);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void sendUserMessage(String str, String str2) {
        LogUtil.m257129d("RtcRoom", "SendUserMessage. uid : " + str + ", message" + str2);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SendUserMessage failed.");
        } else {
            NativeRtcRoomFunctions.nativeSendUserMessage(j, str, str2);
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void setAutoSubscribe(RtcEngine.SubscribeMode subscribeMode, RtcEngine.SubscribeMode subscribeMode2) {
        LogUtil.m257129d("RtcRoom", "SetAutoSubscribe ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetAutoSubscribe failed.");
        } else {
            NativeRtcRoomFunctions.nativeSetAutoSubscribe(j, subscribeMode.value(), subscribeMode2.value());
        }
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str) {
        LogUtil.m257129d("RtcRoom", "SetupRemoteScreenRender...");
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetupRemoteScreen failed.");
            return -1;
        }
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngine.get();
        if (rtcEngineImpl != null) {
            return NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, rtcEngineImpl.getVideoSinkTask()), str, true);
        }
        return NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, null), str, true);
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        LogUtil.m257129d("RtcRoom", "SetupRemoteScreen...");
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native rtcroom is invalid, SetupRemoteVideoRender failed.");
            return -1;
        }
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngine.get();
        if (rtcEngineImpl != null) {
            return NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, rtcEngineImpl.getVideoSinkTask()), str, false);
        }
        return NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, null), str, false);
    }

    public RtcRoom(String str, long j, C65562RtcEngineImpl rtcEngineImpl) {
        this.mNativeRtcRoom = j;
        this.mRoom = str;
        this.mRtcEngine = new WeakReference<>(rtcEngineImpl);
    }

    @Override // com.ss.video.rtc.engine.IRtcRoom
    public void joinRoom(String str, PublisherConfiguration publisherConfiguration, String str2) {
        LogUtil.m257129d("RtcRoom", "joinRoom with token: " + str + ",room" + this.mRoom + " and uid: " + str2);
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m257130e("RtcRoom", "native room is invalid, joinRoom failed.");
            return;
        }
        this.mUser = str2;
        System.currentTimeMillis();
        NativeRtcRoomFunctions.nativeJoinRoom(this.mNativeRtcRoom, str, str2, "");
        Log.d("RtcRoom", "joinroom is up");
    }
}
