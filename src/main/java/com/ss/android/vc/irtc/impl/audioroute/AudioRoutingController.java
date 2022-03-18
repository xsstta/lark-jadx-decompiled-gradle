package com.ss.android.vc.irtc.impl.audioroute;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.BluetoothHeadsetScoDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.EarpieceDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.SpeakerphoneDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.WiredHeadsetDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.controllerState.EventDispatcher;
import java.lang.ref.WeakReference;

public class AudioRoutingController extends BaseAudioRoutingController {
    private BluetoothHeadsetScoDeviceManager mBTScoDeviceManager;
    private WeakReference<Context> mContext;
    private EarpieceDeviceManager mEarpieceDeviceManager;
    private EventHandler mEventHandler;
    private WeakReference<AudioRoutingListener> mListener;
    public EventDispatcher mRoutingControl;
    private SpeakerphoneDeviceManager mSpeakerphoneDeviceManager;
    private WiredHeadsetDeviceManager mWiredHeadsetDeviceManager;

    public interface AudioRoutingListener {
        void onAudioRoutingChanged(int i);

        void onAudioRoutingError(int i);
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public String getAudioRouteDesc(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 3 ? i != 5 ? "Unknown" : "HeadsetBluetooth" : "Speakerphone" : "Earpiece" : "Headset" : "Default";
    }

    public void startMonitoring() {
        this.mRoutingControl.changeRouteState(1);
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public void stopBtSco() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            bluetoothHeadsetScoDeviceManager.inactiveDevice();
        }
    }

    public void stopMonitoring() {
        this.mRoutingControl.changeRouteState(2);
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public boolean isBTHeadsetPlugged() {
        BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager = this.mBTScoDeviceManager;
        if (bluetoothHeadsetScoDeviceManager != null) {
            return bluetoothHeadsetScoDeviceManager.isDevicePlugged();
        }
        return false;
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public boolean isWiredHeadsetPlugged() {
        WiredHeadsetDeviceManager wiredHeadsetDeviceManager = this.mWiredHeadsetDeviceManager;
        if (wiredHeadsetDeviceManager != null) {
            return wiredHeadsetDeviceManager.isActive();
        }
        return false;
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public AudioManager getAudioManager() {
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public int queryCurrentAudioRouting() {
        if (this.mSpeakerphoneDeviceManager.isActive()) {
            return 3;
        }
        if (this.mBTScoDeviceManager.isActive()) {
            return 5;
        }
        if (this.mWiredHeadsetDeviceManager.isActive()) {
            return 0;
        }
        return 1;
    }

    public void uninitialize() {
        AudioRouteLogger.m237438i("AudioRoutingController", "uninitialize");
        this.mWiredHeadsetDeviceManager.destory();
        this.mBTScoDeviceManager.destory();
    }

    public int initialize() {
        AudioRouteLogger.m237438i("AudioRoutingController", "initialize +");
        Context context = this.mContext.get();
        if (context == null) {
            AudioRouteLogger.m237437e("AudioRoutingController", "context has been GCed");
            return -1;
        } else if (getAudioManager() == null) {
            AudioRouteLogger.m237437e("AudioRoutingController", "invalid context: can't get AudioManager");
            return -1;
        } else {
            this.mEventHandler = new EventHandler(CoreThreadPool.getSerialTaskHandler().getLooper());
            this.mRoutingControl = new EventDispatcher(this);
            this.mSpeakerphoneDeviceManager = new SpeakerphoneDeviceManager(context, new IAudioDeviceManager.OnNotHotPlugableDeviceCallback() {
                /* class com.ss.android.vc.irtc.impl.audioroute.$$Lambda$AudioRoutingController$pKcza8btE7oEOMXkaWEM2XqpreI */

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public final void onError(int i, String str) {
                    AudioRoutingController.this.lambda$initialize$0$AudioRoutingController(i, str);
                }
            });
            this.mEarpieceDeviceManager = new EarpieceDeviceManager(context, new IAudioDeviceManager.OnNotHotPlugableDeviceCallback() {
                /* class com.ss.android.vc.irtc.impl.audioroute.$$Lambda$AudioRoutingController$4jWtRBSjDeSLXRs5hD8nwbh5pZ4 */

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public final void onError(int i, String str) {
                    AudioRoutingController.this.lambda$initialize$1$AudioRoutingController(i, str);
                }
            });
            this.mWiredHeadsetDeviceManager = new WiredHeadsetDeviceManager(context, new WiredHeadsetDeviceManager.OnDeviceCallback() {
                /* class com.ss.android.vc.irtc.impl.audioroute.AudioRoutingController.C610421 */

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    AudioRoutingController.this.sendEvent(1, -1);
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.WiredHeadsetDeviceManager.OnDeviceCallback
                public void reportHeadsetType(int i) {
                    if (i == 0) {
                        AudioRoutingController.this.sendEvent(1, 0);
                    } else if (i == 1) {
                        AudioRoutingController.this.sendEvent(1, 0);
                    }
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i, String str) {
                    AudioRouteLogger.m237438i("AudioRoutingController", str);
                    AudioRoutingController.this.resetAudioRouting();
                }
            });
            this.mBTScoDeviceManager = new BluetoothHeadsetScoDeviceManager(context, this.mEventHandler, new BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback() {
                /* class com.ss.android.vc.irtc.impl.audioroute.AudioRoutingController.C610432 */

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOffline() {
                    AudioRouteLogger.m237438i("AudioRoutingController", "BTHeadset disconnected");
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoConnected() {
                    AudioRouteLogger.m237438i("AudioRoutingController", "BTHeadset w/o mic connected");
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback
                public void onScoDisconnected() {
                    AudioRouteLogger.m237438i("AudioRoutingController", "BTHeadset w/o mic disconnected");
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener
                public void onDeviceOnline() {
                    AudioRouteLogger.m237438i("AudioRoutingController", "BTHeadset Device connected");
                    AudioRoutingController.this.sendEvent(2, 1);
                }

                @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback
                public void onError(int i, String str) {
                    AudioRouteLogger.m237438i("AudioRoutingController", str);
                    AudioRoutingController.this.resetAudioRouting();
                }
            });
            AudioRouteLogger.m237438i("AudioRoutingController", "initialize -");
            return 0;
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public void resetAudioRouting() {
        int i;
        int i2 = 1;
        if (getRoutingInfo().getForceSpeakerphone() == 1) {
            AudioRouteLogger.m237438i("AudioRoutingController", "reset(force) audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(3) + ", actual system routing:" + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (queryCurrentAudioRouting() != 3) {
                setAudioRouting(3);
                return;
            }
            return;
        }
        if (this.mBTScoDeviceManager.isDevicePlugged()) {
            i = 5;
        } else if (this.mWiredHeadsetDeviceManager.isDevicePlugged()) {
            i = 0;
        } else {
            if (getRoutingInfo().getForceSpeakerphone() != 0) {
                i2 = getRoutingInfo().getDefaultRouting();
            }
            i = i2;
        }
        AudioRouteLogger.m237438i("AudioRoutingController", "reset audio routing, default routing: " + getAudioRouteDesc(getRoutingInfo().getDefaultRouting()) + ", current routing: " + getAudioRouteDesc(queryCurrentAudioRouting()) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (queryCurrentAudioRouting() != i) {
            setAudioRouting(i);
        }
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

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public void notifyAudioRoutingChanged(int i) {
        AudioRoutingListener audioRoutingListener = this.mListener.get();
        if (audioRoutingListener != null) {
            audioRoutingListener.onAudioRoutingChanged(i);
        } else {
            AudioRouteLogger.m237437e("AudioRoutingController", "failed to get audio routing listener");
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public int updateBluetoothSco(int i) {
        if (i == 5 && 1 != this.mBTScoDeviceManager.getActiveState()) {
            AudioRouteLogger.m237436d("AudioRoutingController", "updateBluetoothSco activeDevice");
            this.mBTScoDeviceManager.activeDevice();
            return 0;
        } else if (5 != queryCurrentAudioRouting() || i == 5 || 1 != this.mBTScoDeviceManager.getActiveState()) {
            return 0;
        } else {
            AudioRouteLogger.m237436d("AudioRoutingController", "updateBluetoothSco inactiveDevice");
            this.mBTScoDeviceManager.inactiveDevice();
            return 0;
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public void setAudioRouting(int i) {
        AudioRouteLogger.m237438i("AudioRoutingController", "set audio output routing from " + getAudioRouteDesc(queryCurrentAudioRouting()) + " to " + getAudioRouteDesc(i));
        if (5 == i) {
            try {
                updateBluetoothSco(i);
            } catch (Exception e) {
                AudioRouteLogger.m237437e("AudioRoutingController", "set audio routing error : " + e.toString());
            }
        } else {
            updateBluetoothSco(i);
            if (i == 0) {
                this.mWiredHeadsetDeviceManager.activeDevice();
            } else if (3 == i) {
                this.mSpeakerphoneDeviceManager.activeDevice();
            } else {
                this.mEarpieceDeviceManager.activeDevice();
            }
        }
        notifyAudioRoutingChanged(i);
    }

    public /* synthetic */ void lambda$initialize$0$AudioRoutingController(int i, String str) {
        AudioRouteLogger.m237438i("AudioRoutingController", str);
        resetAudioRouting();
    }

    public /* synthetic */ void lambda$initialize$1$AudioRoutingController(int i, String str) {
        AudioRouteLogger.m237438i("AudioRoutingController", str);
        resetAudioRouting();
    }

    public AudioRoutingController(Context context, AudioRoutingListener audioRoutingListener) {
        this.mContext = new WeakReference<>(context);
        this.mListener = new WeakReference<>(audioRoutingListener);
    }

    public void sendEvent(int i, int i2) {
        AudioRouteLogger.m237436d("AudioRoutingController", "sendEvent: [" + i + "], extra arg=" + i2);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, 0));
        }
    }
}
