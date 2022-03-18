package com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.vc.irtc.impl.audioroute.AudioRouteLogger;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.receiver.BTHeadsetBroadcastReceiver;
import com.ss.android.vc.irtc.impl.audioroute.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;

public class BluetoothHeadsetScoDeviceManager extends BaseHotplugAudioDeviceManager {
    private final String BLUETOOTH_PERMISSION = "android.permission.BLUETOOTH";
    private final Runnable bluetoothSCOConnCheckerRunnable = new Runnable() {
        /* class com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.$$Lambda$BluetoothHeadsetScoDeviceManager$wiDDolF5DctFkIsYazOj4erhz_E */

        public final void run() {
            BluetoothHeadsetScoDeviceManager.this.bluetoothSCOConnChecker();
        }
    };
    public BluetoothAdapter mBTAdapter;
    public BluetoothHeadset mBTHeadset;
    private BluetoothProfile.ServiceListener mBTHeadsetListener;
    private OnBTScoDeviceCallback mCallback;
    private int mDynamicTimeout;
    private Handler mHandler;
    private int mScoConnectionAttempts;

    public interface OnBTScoDeviceCallback extends IAudioDeviceManager.OnHotPlugDeviceCallback {
        void onScoConnected();

        void onScoDisconnected();
    }

    public void resetScoConnectionAttempts() {
        this.mScoConnectionAttempts = 0;
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener, com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public void onDeviceOffline() {
        super.onDeviceOffline();
    }

    private BluetoothProfile.ServiceListener createBTHeadsetListener() {
        return new BluetoothProfile.ServiceListener() {
            /* class com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.BluetoothHeadsetScoDeviceManager.C610441 */

            public void onServiceDisconnected(int i) {
                AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "onServiceDisconnected " + i + " =? headset(" + 1 + ")");
                if (i == 1) {
                    AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "onServiceDisconnected : " + i);
                    BluetoothHeadsetScoDeviceManager.this.cancelBluetoothSCOConnTimer();
                    BluetoothHeadsetScoDeviceManager.this.mBTHeadset = null;
                }
            }

            public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "onServiceConnected " + i + " =? headset(" + 1 + ")");
                if (i == 1) {
                    AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "onServiceConnected on BT service connected: " + i + " " + bluetoothProfile);
                    BluetoothHeadsetScoDeviceManager.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                    BluetoothHeadsetScoDeviceManager.this.registerReceiver();
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public BaseAudioDeviceBroadcastReceiver getBroadcastReceiver() {
        return new BTHeadsetBroadcastReceiver(this);
    }

    public void onScoConnected() {
        this.mCallback.onScoConnected();
    }

    public void onScoDisconnected() {
        this.mCallback.onScoDisconnected();
    }

    public void cancelBluetoothSCOConnTimer() {
        AudioRouteLogger.m237436d("BluetoothHeadsetScoDeviceManager", "cancelBluetoothSCOConnTimer");
        this.mHandler.removeCallbacks(this.bluetoothSCOConnCheckerRunnable);
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
        if (1 == getActiveState()) {
            stopBtSco();
        }
    }

    public boolean isDevicePlugged() {
        if (2 == getOnlineState()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public void onDestroy() {
        super.onDestroy();
        cancelBluetoothSCOConnTimer();
        clearBTResource();
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener, com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public void onDeviceOnline() {
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "onDeviceOnline ");
        super.onDeviceOnline();
    }

    private void clearBTResource() {
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.closeProfileProxy(1, this.mBTHeadset);
            this.mBTAdapter = null;
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    private void startBluetoothSCOConnTimer() {
        long j;
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "startBluetoothSCOConnTimer");
        int i = this.mScoConnectionAttempts * 4000;
        this.mDynamicTimeout = i;
        Handler handler = this.mHandler;
        Runnable runnable = this.bluetoothSCOConnCheckerRunnable;
        if (i == 0) {
            j = 1000;
        } else {
            j = (long) i;
        }
        handler.postDelayed(runnable, j);
    }

    private void stopBtSco() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, "invalid context: can't get AudioManager");
            return;
        }
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "stopBtSco ");
        doStopBTSco(audioManager);
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        if (getActiveState() == 1) {
            this.mCallback.onError(IByteRtcError.BRERR_INVALID_TOKEN, "Device already active");
        } else {
            checkAndActiveSCO();
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager;
        if (getOnlineState() == 2 && (audioManager = getAudioManager()) != null && audioManager.isBluetoothScoOn()) {
            return 1;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public IntentFilter getBroadcastIntentFilter() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        return intentFilter;
    }

    private void initBluetoothHeadset() {
        Context context = getContext();
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
                AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "do not support BT monitoring on this device");
            } else if (!hasPermission(context)) {
                AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "lacks BLUETOOTH permission");
            } else if (this.mBTHeadsetListener != null) {
                AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "Bluetooth service Listener already been initialized");
            } else {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                this.mBTAdapter = defaultAdapter;
                if (defaultAdapter == null) {
                    AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "initialize: failed to get bluetooth adapter!!");
                    return;
                }
                try {
                    this.mBTHeadsetListener = createBTHeadsetListener();
                } catch (Exception e) {
                    AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "initialize failed: unable to create BluetoothProfile.ServiceListener, err=" + e.getMessage());
                }
                this.mBTAdapter.getProfileProxy(context, this.mBTHeadsetListener, 1);
                if (2 == this.mBTAdapter.getProfileConnectionState(1)) {
                    onDeviceOnline();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void bluetoothSCOConnChecker() {
        boolean z;
        String str;
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, "invalid context: can't get AudioManager");
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "bluetoothSCOConnChecker SCO connected");
            z = true;
        } else {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "bluetoothSCOConnChecker SCO is not connected");
            z = false;
        }
        if (this.mScoConnectionAttempts < 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("bluetoothSCOConnChecker attemps trying, bt sco started: ");
            sb.append(btStateAsString(getActiveState()));
            sb.append(" sco ");
            if (z) {
                str = "connected";
            } else {
                str = "disconnected";
            }
            sb.append(str);
            sb.append(",");
            sb.append(this.mScoConnectionAttempts);
            sb.append(" times");
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", sb.toString());
            if (1 != this.mOnlineState && 1 == getActiveState()) {
                startBluetoothSCOConnTimer();
                this.mScoConnectionAttempts++;
                doActiveSco(audioManager);
                return;
            }
            return;
        }
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "bluetoothSCOConnChecker timeout");
        this.mScoConnectionAttempts = 0;
        this.mCallback.onError(IByteRtcError.BRERR_JOIN_ROOM_ERROR, "Could not establish SCO link.");
    }

    private void checkAndActiveSCO() {
        String str;
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, "invalid context: can't get AudioManager");
            return;
        }
        int mode = audioManager.getMode();
        if (!audioManager.isBluetoothScoOn()) {
            StringBuilder sb = new StringBuilder();
            sb.append("checkAndActiveSCO try to opening bt sco ");
            sb.append(this.mScoConnectionAttempts);
            sb.append(" [");
            sb.append(modeAsString(mode));
            sb.append("] ");
            sb.append(getActiveState());
            sb.append("[");
            sb.append(btStateAsString(getActiveState()));
            sb.append("] sco ");
            if (audioManager.isBluetoothScoOn()) {
                str = "on";
            } else {
                str = "off";
            }
            sb.append(str);
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", sb.toString());
            AudioRouteLogger.m237436d("BluetoothHeadsetScoDeviceManager", "checkAndActiveSCO sco support = " + audioManager.isBluetoothScoAvailableOffCall());
            startBluetoothSCOConnTimer();
            this.mScoConnectionAttempts = this.mScoConnectionAttempts + 1;
            doActiveSco(audioManager);
        }
    }

    private boolean hasPermission(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0) {
            return true;
        }
        return false;
    }

    private String btStateAsString(int i) {
        if (i == 0) {
            return "SCO_CONNECTING";
        }
        if (i == 1) {
            return "SCO_ACTIVE";
        }
        if (i == 2) {
            return "SCO_INACTIVE";
        }
        return "Unknown " + i;
    }

    private void doStopBTSco(AudioManager audioManager) {
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn());
        audioManager.setBluetoothScoOn(false);
        audioManager.stopBluetoothSco();
        if (Build.VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, false);
        }
    }

    private String modeAsString(int i) {
        if (i == 0) {
            return "MODE_NORMAL";
        }
        if (i == 1) {
            return "MODE_RINGTONE";
        }
        if (i == 2) {
            return "MODE_IN_CALL";
        }
        if (i == 3) {
            return "MODE_IN_COMMUNICATION";
        }
        return "Unknown " + i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public void onStickyIntentFoundWhenRegister(Intent intent) {
        if (!TextUtils.equals(intent.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            return;
        }
        if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) != 1) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "initial Bluetooth SCO device unconnected");
            return;
        }
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "initial Bluetooth SCO device connected");
        onScoConnected();
    }

    private void doActiveSco(AudioManager audioManager) {
        String str;
        if (audioManager == null) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, "invalid context: can't get AudioManager");
            return;
        }
        int mode = audioManager.getMode();
        StringBuilder sb = new StringBuilder();
        sb.append("doActiveSco start(");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(")sco ");
        String str2 = "on";
        if (audioManager.isBluetoothScoOn()) {
            str = str2;
        } else {
            str = "off";
        }
        sb.append(str);
        sb.append("[");
        sb.append(modeAsString(mode));
        sb.append("]");
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", sb.toString());
        if (Build.VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, true);
        }
        if (isDevicePlugged()) {
            AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "doActiveSco change audio mode to NORMAL");
            try {
                audioManager.setMode(0);
                audioManager.setSpeakerphoneOn(false);
                if (!audioManager.isBluetoothScoOn()) {
                    audioManager.setBluetoothScoOn(true);
                    audioManager.startBluetoothSco();
                    AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", "doActiveSco startBluetoothSco from stop to start");
                }
            } catch (Exception e) {
                AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", e.getMessage());
            }
        } else {
            audioManager.setMode(3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("doActiveSco end sco ");
        if (!audioManager.isBluetoothScoOn()) {
            str2 = "off";
        }
        sb2.append(str2);
        sb2.append(" [");
        sb2.append(modeAsString(audioManager.getMode()));
        sb2.append("]");
        AudioRouteLogger.monitor("BluetoothHeadsetScoDeviceManager", sb2.toString());
    }

    public BluetoothHeadsetScoDeviceManager(Context context, Handler handler, OnBTScoDeviceCallback onBTScoDeviceCallback) {
        super(context, onBTScoDeviceCallback);
        this.mCallback = onBTScoDeviceCallback;
        this.mHandler = handler;
        initBluetoothHeadset();
    }
}
