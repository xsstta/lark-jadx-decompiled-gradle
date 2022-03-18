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
import com.ss.video.rtc.engine.device.DeviceError;
import com.ss.video.rtc.engine.device.DeviceState;
import com.ss.video.rtc.engine.device.DeviceType;
import com.ss.video.rtc.engine.device.MediaDeviceInfo;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

public class MeetingRtcEngineEventHandler {
    private WeakReference<MeetingRtcEngineImpl> mRtcEngineImpl;

    public void onAudioMixingFinished() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioMixingFinished...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onAudioMixingFinished();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioMixingFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onCameraReady() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onCameraReady...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onCameraReady();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onCameraReady callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionBanned() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionBanned...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onConnectionBanned();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionBanned callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionInterrupted() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionInterrupt...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onConnectionInterrupted();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionInterrupted callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionLost() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionLost...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onConnectionLost();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionLost callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMediaEngineLoadSuccess() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaEngineLoadSuccess...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onMediaEngineLoadSuccess();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaEngineLoadSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMediaEngineStartCallSuccess() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaEngineStartCallSuccess...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onMediaEngineStartCallSuccess();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaEngineStartCallSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRequestToken() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRequestToken...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRequestToken();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onRequestToken callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoStopped() {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoStopped...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onVideoStopped();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoStopped callback catch exception.\n" + e.getMessage());
        }
    }

    public void onWebsocketDisconnect() {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onWebsocketDisconnect();
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onWebsocketDisconnect callback catch exception.\n" + e.getMessage());
        }
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onLeaveChannel(InternalRtcStats internalRtcStats) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLeaveChannel...");
    }

    public MeetingRtcEngineEventHandler(MeetingRtcEngineImpl meetingRtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(meetingRtcEngineImpl);
    }

    public void onActiveSpeaker(String str) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onActiveSpeaker...uid: " + str);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onActiveSpeaker(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onActiveSpeaker callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioDumpStatus(int i) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onAudioDumpStatus(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioDumpStatus callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioEffectFinished(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioEffectFinished...soundId: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onAudioEffectFinished(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioEffectFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onDynamicLayoutPerfEnable(boolean z) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onDynamicLayoutPerfEnable(z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onDynamicLayoutPerfEnable callback catch exception.\n" + e.getMessage());
        }
    }

    public void onEchoTestProgress(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onEchoTestProgress, percentage: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onEchoTestProgress(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onEchoTestProgress callback catch exception.\n" + e.getMessage());
        }
    }

    public void onError(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onError...errorNum: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onError(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalAudioFrame(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalAudioFrame...elapsed: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstLocalAudioFrame(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLastmileQuality(int i) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onLastmileQuality(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLastmileQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioStats...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onLocalAudioStats(new IMeetingRtcEngineEventHandler.LocalAudioStats(internalLocalAudioStats));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioVolumeIndication(InternalAudioVolumeInfo internalAudioVolumeInfo) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioVolumeIndication...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onLocalAudioVolumeIndication(new IMeetingRtcEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfo));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onLocalVideoStats(new IMeetingRtcEngineEventHandler.LocalVideoStats(internalLocalVideoStats));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMaximumScreenShareFpsUpdated(int i) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onMaximumScreenShareFpsUpdated(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onMaximumScreenShareFpsUpdated callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNeedAvatar(String str) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onNeedAvatar(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onNeedAvatar callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetStateChanged(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onNetStateChanged...time: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onNetStateChanged(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onNetStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRemoteAudioStats(new IMeetingRtcEngineEventHandler.RemoteAudioStats(internalRemoteAudioStats));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteAudioStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteVideoStats...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRemoteVideoStats(new IMeetingRtcEngineEventHandler.RemoteVideoStats(internalRemoteVideoStats));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onRemoteVideoStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onResponse(String str) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onResponse, res: " + str);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onResponse(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onResponse callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageReceived(String str) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onCustomMessage: " + str);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRoomMessageReceived(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onCustomMessage callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRtcStats(InternalRtcStats internalRtcStats) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRtcStats(new IMeetingRtcEngineEventHandler.RtcStats(internalRtcStats));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamPublishSucceed(String str) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamPublishSucceed...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onStreamPublishSucceed(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamPublishSucceed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onWarning(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onWarning, warnNum: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onWarning(i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void uploadLogFinished(boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "uploadLogFinished...uploadLogResult: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().uploadLogFinished(z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "uploadLogFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionTypeUpdated(boolean z) {
        LogUtil.m257132i("ByteRtcEngineEventHandler", "onConnectionTypeUpdated... is_p2p: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onConnectionTypeUpdated(z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onConnectionTypeUpdated callback catch exception.\n" + e.getMessage() + ", is_p2p: " + z);
        }
    }

    public void onRoomBinaryMessageReceived(ByteBuffer byteBuffer) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onCustomBinaryMessage, length: " + byteBuffer.capacity());
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRoomBinaryMessageReceived(byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onCustomBinaryMessage callback catch exception.\n" + e.getMessage());
        }
    }

    public void onEchoTestResult(int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onEchoTestResult, state: " + i);
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            try {
                                if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                                    MeetingRtcEngineImpl.getRtcEngineHandler().onEchoTestResult(IMeetingRtcEngineEventHandler.RtcEchoTestResult.ECHO_POOR);
                                }
                            } catch (Exception e) {
                                LogUtil.m257129d("ByteRtcEngineEventHandler", "onEchoTestResult callback catch exception.\n" + e.getMessage());
                            }
                        }
                    } else if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                        MeetingRtcEngineImpl.getRtcEngineHandler().onEchoTestResult(IMeetingRtcEngineEventHandler.RtcEchoTestResult.ECHO_BAD);
                    }
                } else if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                    MeetingRtcEngineImpl.getRtcEngineHandler().onEchoTestResult(IMeetingRtcEngineEventHandler.RtcEchoTestResult.ECHO_NORMAL);
                }
            } else if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onEchoTestResult(IMeetingRtcEngineEventHandler.RtcEchoTestResult.ECHO_EXCELLENT);
            }
        } else if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
            MeetingRtcEngineImpl.getRtcEngineHandler().onEchoTestResult(IMeetingRtcEngineEventHandler.RtcEchoTestResult.ECHO_UNKNOW);
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i) {
        IMeetingRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IMeetingRtcEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
        for (int i2 = 0; i2 < internalAudioVolumeInfoArr.length; i2++) {
            audioVolumeInfoArr[i2] = new IMeetingRtcEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i2]);
        }
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onAudioVolumeIndication(audioVolumeInfoArr, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioStateChanged(int i, int i2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioStateChanged...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onLocalAudioStateChanged(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStateChanged(int i, int i2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalVideoStateChanged...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onLocalVideoStateChanged(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkQuality(String str, InternalNetworkQualityInfo internalNetworkQualityInfo) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onNetworkQuality(str, new IMeetingRtcEngineEventHandler.NetworkQualityInfo(internalNetworkQualityInfo));
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onNetworkQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMessageReceived: " + str2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserMessageReceived(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onApiCallExecuted(String str, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onApiCallExecuted, api: " + str + ", error: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onApiCallExecuted(str, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onApiCallExecuted callback catch exception.\n" + e.getMessage());
        }
    }

    public void onApplyEffectResponse(int i, String str) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onApplyEffectResponse..." + i + " " + str);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onApplyEffectResponse(i, str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onApplyEffectResponse callback catch exception.\n" + e.getMessage());
        }
    }

    public void onClientRoleChanged(int i, int i2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onClientRoleChanged...oldRole: " + i + ", newRole: " + i2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onClientRoleChanged(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onClientRoleChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteAudioFrame(String str, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteAudioFrame...uid: " + str + ", elapsed: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstRemoteAudioFrame(str, (long) i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onInviteAcceptedByPeer(String str, String str2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteAcceptedByPeer...roomid: " + str + ", phoneNumber: " + str2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onInviteAcceptedByPeer(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteAcceptedByPeer callback catch exception.\n" + e.getMessage());
        }
    }

    public void onInviteEndByMyself(String str, String str2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteEndByMyself...roomid: " + str + ", phoneNumber: " + str2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onInviteEndByMyself(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteEndByMyself callback catch exception.\n" + e.getMessage());
        }
    }

    public void onInviteEndByPeer(String str, String str2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteEndByPeer...roomid: " + str + ", phoneNumber: " + str2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onInviteEndByPeer(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteEndByPeer callback catch exception.\n" + e.getMessage());
        }
    }

    public void onInviteReceivedByPeer(String str, String str2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteReceivedByPeer...roomid: " + str + ", phoneNumber: " + str2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onInviteReceivedByPeer(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteReceivedByPeer callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLogReport(String str, String str2) {
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                        MeetingRtcEngineImpl.getRtcEngineHandler().onLogReport(str, jSONObject);
                    }
                } catch (JSONException e) {
                    LogUtil.m257129d("ByteRtcEngineEventHandler", "onLogReport...parse json catch exception: " + e.getMessage());
                }
            } else {
                LogUtil.m257132i(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onLogReport callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSetupVideoError(String str, String str2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onSetupVideoError...uid: " + str + ", errorInfo: " + str2);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onSetupVideoError(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onSetupVideoError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamAdd(String str, ByteStream byteStream) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamAdd, uid: " + byteStream.userId + "stream_id: " + str);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onStreamAdd(str, byteStream);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamAdd callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamRemove(String str, ByteStream byteStream) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamRemove, uid: " + byteStream.userId + "stream_id: " + str);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onStreamRemove(str, byteStream);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableAudio(String str, boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableAudio... uid: " + str + ", enabled: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserEnableAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserEnableLocalAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableLocalVideo... uid: " + str + ", enabled: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserEnableLocalVideo(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableLocalVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableVideo(String str, boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableVideo... uid: " + str + ", enabled: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserEnableVideo(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserEnableVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserJoined(String str, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserJoined... uid: " + str + ", elapsed: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserJoined(str, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteAudio(String str, boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMuteAudio... uid: " + str + ", muted: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserMuteAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMuteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteVideo(String str, boolean z) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserMuteVideo(str, z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserMuteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserOffline(String str, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserOffline... uid: " + str + ", reason: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onUserOffline(str, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onUserOffline callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkQuality2(InternalNetworkQualityInfo internalNetworkQualityInfo, InternalNetworkQualityInfo[] internalNetworkQualityInfoArr) {
        LogUtil.m257132i("ByteRtcEngineEventHandler", "Local onNetworkQuality2, uid: " + internalNetworkQualityInfo.uid + ", info: " + internalNetworkQualityInfo.toString2());
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                IMeetingRtcEngineEventHandler.UserNetworkQualityInfo[] userNetworkQualityInfoArr = new IMeetingRtcEngineEventHandler.UserNetworkQualityInfo[internalNetworkQualityInfoArr.length];
                for (int i = 0; i < internalNetworkQualityInfoArr.length; i++) {
                    LogUtil.m257132i("ByteRtcEngineEventHandler", "Remote onNetworkQuality2, uid: " + internalNetworkQualityInfoArr[i].uid + ", info: " + internalNetworkQualityInfoArr[i].toString2());
                    userNetworkQualityInfoArr[i] = new IMeetingRtcEngineEventHandler.UserNetworkQualityInfo(internalNetworkQualityInfoArr[i]);
                }
                MeetingRtcEngineImpl.getRtcEngineHandler().onNetworkQuality2(new IMeetingRtcEngineEventHandler.UserNetworkQualityInfo(internalNetworkQualityInfo), userNetworkQualityInfoArr);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onNetworkQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onJoinChannelSuccess(String str, String str2, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onJoinChannelSuccess...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onJoinChannelSuccess(str, str2, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onJoinChannelSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMediaDeviceError(int i, String str, int i2) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onMediaDeviceError(i, str, i2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaDeviceError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMediaDeviceWarning(int i, String str, int i2) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onMediaDeviceWarning(i, str, i2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaDeviceWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRejoinChannelSuccess(String str, String str2, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onRejoinChannelSuccess...");
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onRejoinChannelSuccess(str, str2, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onRejoinChannelSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onStreamSubscribed(SubscribeState.values()[i], str, subscribeConfig);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamSubscribed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalScreenFrame...width: " + i + ", height: " + i2 + ", elapsed:" + i3);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstLocalScreenFrame(i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalScreenFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalVideoFrame...width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstLocalVideoFrame(i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onInviteFailed(String str, String str2, int i) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteFailed...roomid: " + str + ", phoneNumber: " + str2 + ", errorcode: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onInviteFailed(str, str2, i);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onInviteFailed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamMessage(String str, int i, byte[] bArr) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamMessage...uid: " + str + ", streamId: " + i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onStreamMessage(str, i, bArr);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamMessage callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstMergeFrame(String str, int i, int i2, int i3) {
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstMergeFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstMergeFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioQuality...uid: " + str + ", quality: " + i + ", delay: " + ((int) s) + ", lost: " + ((int) s2));
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onAudioQuality(str, i, s, s2);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onAudioQuality callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteScreenFrame...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstRemoteScreenFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteScreenFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteVideoDecoded...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstRemoteVideoDecoded(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteVideoDecoded callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteVideoFrame...udi: " + str + ", width: " + i + ", height: " + i2 + ", elapsed: " + i3);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onFirstRemoteVideoFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onFirstRemoteVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMediaDeviceChanged(int i, int i2, int i3, String str) {
        DeviceState fromId = DeviceState.fromId(i2);
        DeviceType fromId2 = DeviceType.fromId(i);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onMediaDeviceChanged(new MediaDeviceInfo(fromId2, fromId, DeviceError.get(i3), str));
            }
            if (MeetingRtcEngineImpl.getRtcEngineAudioDeviceEventHandler() == null) {
                return;
            }
            if (fromId2 == DeviceType.MICROPHONE) {
                if (fromId == DeviceState.START) {
                    MeetingRtcEngineImpl.getRtcEngineAudioDeviceEventHandler().onAudioDeviceRecordStart();
                } else if (fromId == DeviceState.STOP) {
                    MeetingRtcEngineImpl.getRtcEngineAudioDeviceEventHandler().onAudioDeviceRecordStop();
                }
            } else if (fromId2 != DeviceType.SPEAKER) {
            } else {
                if (fromId == DeviceState.START) {
                    MeetingRtcEngineImpl.getRtcEngineAudioDeviceEventHandler().onAudioDevicePlayoutStart();
                } else if (fromId == DeviceState.STOP) {
                    MeetingRtcEngineImpl.getRtcEngineAudioDeviceEventHandler().onAudioDeviceRecordStop();
                }
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onMediaDeviceChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoSizeChanged, uid: " + str + ", width: " + i + ", height: " + i2 + ", rotation: " + i3);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onVideoSizeChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamMessageError(String str, int i, int i2, int i3, int i4) {
        LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamMessageError...uid: " + str + ", streamId: " + i + ", error: " + i2 + ", missed: " + i3 + ", cached: " + i4);
        try {
            if (MeetingRtcEngineImpl.getRtcEngineHandler() != null) {
                MeetingRtcEngineImpl.getRtcEngineHandler().onStreamMessageError(str, i, i2, i3, i4);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEventHandler", "onStreamMessageError callback catch exception.\n" + e.getMessage());
        }
    }
}
