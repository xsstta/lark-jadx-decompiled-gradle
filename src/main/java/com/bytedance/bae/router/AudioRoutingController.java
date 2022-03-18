package com.bytedance.bae.router;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.router.controller.EventDispatcher;
import com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager;
import com.bytedance.bae.router.device.EarpieceDeviceManager;
import com.bytedance.bae.router.device.SpeakerphoneDeviceManager;
import com.bytedance.bae.router.device.WiredHeadsetDeviceManager;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.bae.webrtc.WebRtcAudioUtils;
import java.lang.ref.WeakReference;

public class AudioRoutingController extends BaseAudioRoutingController {
    private BluetoothHeadsetScoDeviceManager mBTScoDeviceManager;
    private WeakReference<Context> mContext = new WeakReference<>(ContextUtils.getApplicationContext());
    private EarpieceDeviceManager mEarpieceDeviceManager;
    private EventHandler mEventHandler;
    private int mLastAudioRouting = -1;
    private long mNativeByteRtcEngine;
    public EventDispatcher mRoutingControl;
    private SpeakerphoneDeviceManager mSpeakerphoneDeviceManager;
    private WiredHeadsetDeviceManager mWiredHeadsetDeviceManager;

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public String getAudioRouteDesc(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "HeadsetBluetooth" : "Speakerphone" : "Earpiece" : "Headset" : "Default";
    }

    public int GetCurrentRouting() {
        return queryCurrentAudioRouting();
    }

    public void startMonitoring() {
        this.mRoutingControl.changeRouteState(1);
    }

    public void stopMonitoring() {
        this.mRoutingControl.changeRouteState(2);
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public boolean isBTHeadsetPlugged() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            return bluetoothHeadsetScoDeviceManager.isDevicePlugged();
        }
        return false;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public boolean isWiredHeadsetPlugged() {
        WiredHeadsetDeviceManager wiredHeadsetDeviceManager = this.mWiredHeadsetDeviceManager;
        if (wiredHeadsetDeviceManager != null) {
            return wiredHeadsetDeviceManager.isActive();
        }
        return false;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public AudioManager getAudioManager() {
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void stopBtSco() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            bluetoothHeadsetScoDeviceManager.inactiveDevice();
            this.mBTScoDeviceManager.resetScoConnectionAttempts();
            this.mBTScoDeviceManager.cancelBluetoothSCOConnTimer();
        }
    }

    public void uninitialize() {
        RXLogging.m14765w("AudioRoutingController", "uninitialize");
        this.mWiredHeadsetDeviceManager.destory();
        this.mBTScoDeviceManager.destory();
        this.mLastAudioRouting = -1;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public int queryCurrentAudioRouting() {
        if (this.mSpeakerphoneDeviceManager.isActive()) {
            return 3;
        }
        if (this.mBTScoDeviceManager.isActive() || this.mBTScoDeviceManager.isDevicePlugged()) {
            return 4;
        }
        if (this.mWiredHeadsetDeviceManager.isActive()) {
            return 1;
        }
        if (this.mEarpieceDeviceManager.isActive()) {
            return 2;
        }
        return 0;
    }

    public int initialize() {
        Log.w("AudioRoutingController", "initialize begin");
        Context context = this.mContext.get();
        if (context == null) {
            Log.e("AudioRoutingController", "context has been GCed");
            return -1;
        } else if (getAudioManager() == null) {
            Log.e("AudioRoutingController", "invalid context: can't get AudioManager");
            return -1;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mEventHandler = new EventHandler(myLooper);
                Log.w("AudioRoutingController", "looper of mEventHandler is Looper.myLooper");
            } else {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    this.mEventHandler = new EventHandler(mainLooper);
                    Log.w("AudioRoutingController", "looper of mEventHandler is Looper.getMainLooper");
                } else {
                    this.mEventHandler = null;
                    Log.w("AudioRoutingController", "mEventHandler is null");
                }
            }
            this.mRoutingControl = new EventDispatcher(this);
            this.mSpeakerphoneDeviceManager = new SpeakerphoneDeviceManager(context, new IAudioDeviceManager.OnNotHotPlugableDeviceCallback() {
                /* class com.bytedance.bae.router.$$Lambda$AudioRoutingController$gyghe6mR8jeVjrTHfdSLjF1tTg */

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public final void onError(int i, String str) {
                    AudioRoutingController.this.lambda$initialize$0$AudioRoutingController(i, str);
                }
            });
            this.mEarpieceDeviceManager = new EarpieceDeviceManager(context, new IAudioDeviceManager.OnNotHotPlugableDeviceCallback() {
                /* class com.bytedance.bae.router.$$Lambda$AudioRoutingController$RmvF2HOijqtAmI74cEvd66gLA */

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public final void onError(int i, String str) {
                    AudioRoutingController.this.lambda$initialize$1$AudioRoutingController(i, str);
                }
            });
            this.mWiredHeadsetDeviceManager = new WiredHeadsetDeviceManager(context, new WiredHeadsetDeviceManager.OnDeviceCallback() {
                /* class com.bytedance.bae.router.AudioRoutingController.C35061 */

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    AudioRoutingController.this.sendEvent(1, 0);
                }

                @Override // com.bytedance.bae.router.device.WiredHeadsetDeviceManager.OnDeviceCallback
                public void reportHeadsetType(int i) {
                    if (i == 0 || i == 1) {
                        AudioRoutingController.this.sendEvent(1, 1);
                    }
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i, String str) {
                    RXLogging.m14765w("AudioRoutingController", "WiredHeadset error:" + i + " msg:" + str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            this.mBTScoDeviceManager = new BluetoothHeadsetScoDeviceManager(context, this.mEventHandler, new BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback() {
                /* class com.bytedance.bae.router.AudioRoutingController.C35072 */

                @Override // com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoConnected() {
                    RXLogging.m14765w("AudioRoutingController", "BTHeadset w/o mic connected");
                }

                @Override // com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoDisconnected() {
                    RXLogging.m14765w("AudioRoutingController", "BTHeadset w/o mic disconnected");
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    RXLogging.m14765w("AudioRoutingController", "BTHeadset disconnected");
                    AudioRoutingController.this.sendEvent(2, 0);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                    RXLogging.m14765w("AudioRoutingController", "BTHeadset Device connected");
                    AudioRoutingController.this.sendEvent(2, 1);
                }

                @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i, String str) {
                    RXLogging.m14765w("AudioRoutingController", "BTHeadset error:" + i + " msg:" + str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            Log.w("AudioRoutingController", "initialize end");
            return 0;
        }
    }

    private static AudioRoutingController create(long j) {
        return new AudioRoutingController(j);
    }

    /* access modifiers changed from: private */
    public class EventHandler extends Handler {
        public void handleMessage(Message message) {
            AudioRoutingController.this.mRoutingControl.onEvent(message.what, message.arg1);
        }

        EventHandler(Looper looper) {
            super(looper);
        }
    }

    public AudioRoutingController(long j) {
        this.mNativeByteRtcEngine = j;
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void setAudioRouting(int i) {
        RXLogging.m14765w("AudioRoutingController", "set audio output routing from " + getAudioRouteDesc(queryCurrentAudioRouting()) + " to " + getAudioRouteDesc(i));
        if (4 == i) {
            try {
                updateBluetoothSco(i);
            } catch (Exception e) {
                RXLogging.m14762e("AudioRoutingController", "set audio routing error : " + e.toString());
            }
        } else {
            updateBluetoothSco(i);
            if (1 == i) {
                this.mWiredHeadsetDeviceManager.activeDevice();
            } else if (3 == i) {
                this.mSpeakerphoneDeviceManager.activeDevice();
            } else {
                this.mEarpieceDeviceManager.activeDevice();
            }
        }
        int i2 = this.mLastAudioRouting;
        this.mLastAudioRouting = i;
        notifyAudioRoutingChanged(i, i2, "setAudioRouting");
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public int updateBluetoothSco(int i) {
        RXLogging.m14765w("AudioRoutingController", "updateBluetoothSco sco targetRouting:" + getAudioRouteDesc(i) + " scoEnabled:" + getRoutingInfo().getBTScoEnabled());
        if (i != 4) {
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        } else if (!getRoutingInfo().getBTScoEnabled()) {
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        } else if (1 == this.mBTScoDeviceManager.getActiveState()) {
            return 0;
        } else {
            this.mBTScoDeviceManager.activeDevice();
            return 0;
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void resetAudioRouting(boolean z) {
        int i = 1;
        if (getRoutingInfo().getForceSpeakerphone() != 1 || !z) {
            if (this.mBTScoDeviceManager.isDevicePlugged()) {
                i = 4;
            } else if (!this.mWiredHeadsetDeviceManager.isDevicePlugged()) {
                if (getRoutingInfo().getForceSpeakerphone() == 0) {
                    i = 2;
                } else {
                    i = getRoutingInfo().getDefaultRouting();
                }
            }
            RXLogging.m14765w("AudioRoutingController", "reset audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (queryCurrentAudioRouting() != i || this.mLastAudioRouting != i || i == 4) {
                setAudioRouting(i);
                return;
            }
            return;
        }
        RXLogging.m14765w("AudioRoutingController", "reset(force) audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(3) + ", actual system routing:" + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (queryCurrentAudioRouting() != 3) {
            setAudioRouting(3);
        }
    }

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public void notifyAudioRoutingChanged(int i, String str) {
        notifyAudioRoutingChanged(i, this.mLastAudioRouting, str);
    }

    public /* synthetic */ void lambda$initialize$0$AudioRoutingController(int i, String str) {
        RXLogging.m14765w("AudioRoutingController", "SpeakerphoneDevice error:" + i + " msg:" + str);
        resetAudioRouting(true);
    }

    public /* synthetic */ void lambda$initialize$1$AudioRoutingController(int i, String str) {
        RXLogging.m14765w("AudioRoutingController", "EarpieceDevice error:" + i + " msg:" + str);
        resetAudioRouting(true);
    }

    public void sendEvent(int i, int i2) {
        RXLogging.m14765w("AudioRoutingController", "sendEvent: [" + i + "], extra arg: " + i2 + "... " + this.mEventHandler);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, 0));
        }
    }

    public void notifyAudioRoutingChanged(int i, int i2, String str) {
        AudioManager audioManager = getAudioManager();
        ByteAudioRouterNativeFunctions.nativeOnAudioRoutingChanged(this.mNativeByteRtcEngine, i, i2, str, "{ Audio State: audio_mode:" + WebRtcAudioUtils.modeToString(audioManager.getMode()) + ", has_mic:" + WebRtcAudioUtils.hasMicrophone() + ", mic_muted:" + audioManager.isMicrophoneMute() + ", music_active:" + audioManager.isMusicActive() + ", speakerphone:" + audioManager.isSpeakerphoneOn() + ", headset:" + audioManager.isWiredHeadsetOn() + ", bt_sco:" + audioManager.isBluetoothScoOn() + ", music_actived:" + audioManager.isMusicActive() + ", permission:" + WebRtcAudioUtils.isPermissionGranted() + " }");
    }
}
