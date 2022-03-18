package com.bytedance.bae.router.receiver;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.huawei.hms.android.HwBuildEx;

public class BTHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private BluetoothHeadsetScoDeviceManager mBTDeviceManager;

    private String getBTAdapterState(int i) {
        return i != 10 ? i != 12 ? "adapter_known" : "adapter_on" : "adapter_off";
    }

    private String getBTHeadsetAudioStateName(int i) {
        switch (i) {
            case 10:
                return "audio_disconnected";
            case 11:
                return "audio_connecting";
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return "audio_connected";
            default:
                return "unknown_audio_state";
        }
    }

    private String getBTProfileStateName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown_state" : "disconnecting" : "connected" : "connecting" : "disconnected";
    }

    private String getScoAudioStateName(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "sco_audio_unknown" : "sco_audio_connecting" : "sco_audio_connected" : "sco_audio_disconnected" : "sco_audio_error";
    }

    public BTHeadsetBroadcastReceiver(BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager) {
        this.mBTDeviceManager = bluetoothHeadsetScoDeviceManager;
    }

    private void onBlueToothDeviceOnline(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null && bluetoothDevice.getBluetoothClass() != null) {
            bluetoothDevice.getBluetoothClass().getMajorDeviceClass();
            if (this.mBTDeviceManager.mBTHeadset != null) {
                this.mBTDeviceManager.resetScoConnectionAttempts();
                this.mBTDeviceManager.onDeviceOnline();
            }
        }
    }

    private void onBlueToothDeviceOffline(BluetoothDevice bluetoothDevice) {
        if (this.mBTDeviceManager.isDevicePlugged() && bluetoothDevice != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            RXLogging.m14765w("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + "checking is device disconnected btAdapter:" + defaultAdapter.toString());
            if (defaultAdapter != null) {
                RXLogging.m14765w("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " disconnected, state:" + defaultAdapter.getProfileConnectionState(1));
                this.mBTDeviceManager.onDeviceOffline();
            }
        }
    }

    private String getBTDeviceInfo(BluetoothDevice bluetoothDevice) {
        String str;
        if (bluetoothDevice == null) {
            RXLogging.m14762e("BTHeadsetBroadcastReceiver", "getBTDeviceInfo device is null");
            return "";
        }
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass == null) {
            str = "null";
        } else {
            str = "" + bluetoothClass.toString() + " major_class: " + bluetoothClass.getMajorDeviceClass() + " service: [ audio=" + bluetoothClass.hasService(2097152) + " capture=" + bluetoothClass.hasService(524288) + " information=" + bluetoothClass.hasService(8388608) + " limited_discoverability=" + bluetoothClass.hasService(8192) + " networking=" + bluetoothClass.hasService(131072) + " object_transfer=" + bluetoothClass.hasService(1048576) + " positioning=" + bluetoothClass.hasService(65536) + " render=" + bluetoothClass.hasService(262144) + " telephony=" + bluetoothClass.hasService(4194304) + " ]";
        }
        return "" + "name: " + bluetoothDevice.getName() + " class: " + str;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            RXLogging.m14765w("BTHeadsetBroadcastReceiver", "BT ACTION_CONNECTION_STATE_CHANGED from " + getBTProfileStateName(intExtra2) + " to " + getBTProfileStateName(intExtra) + " bt_device_info: " + getBTDeviceInfo(bluetoothDevice) + " mBTHeadset: " + this.mBTDeviceManager.mBTHeadset);
            if (intExtra == 0) {
                onBlueToothDeviceOffline(bluetoothDevice);
            } else if (intExtra == 2) {
                onBlueToothDeviceOnline(bluetoothDevice);
            }
        } else if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(action)) {
            int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
            int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
            RXLogging.m14765w("BTHeadsetBroadcastReceiver", "BT ACTION_AUDIO_STATE_CHANGED from " + getBTHeadsetAudioStateName(intExtra4) + " to " + getBTHeadsetAudioStateName(intExtra3) + " bt_device_info: " + getBTDeviceInfo((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) + " mBTHeadset: " + this.mBTDeviceManager.mBTHeadset);
        } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
            int intExtra5 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
            int intExtra6 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99);
            RXLogging.m14765w("BTHeadsetBroadcastReceiver", "BT ACTION_SCO_AUDIO_STATE_UPDATED from " + getScoAudioStateName(intExtra6) + " to " + getScoAudioStateName(intExtra5) + " mBTHeadset: " + this.mBTDeviceManager.mBTHeadset);
            if (intExtra5 == 0) {
                this.mBTDeviceManager.onScoDisconnected();
            } else if (intExtra5 == 1 && this.mBTDeviceManager.mBTAdapter != null && this.mBTDeviceManager.mBTAdapter.getProfileConnectionState(1) == 2) {
                RXLogging.m14765w("BTHeadsetBroadcastReceiver", "Bluetooth SCO device connected");
                this.mBTDeviceManager.cancelBluetoothSCOConnTimer();
                this.mBTDeviceManager.onScoConnected();
            }
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra7 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
            int intExtra8 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99);
            RXLogging.m14765w("BTHeadsetBroadcastReceiver", "BT BluetoothAdapter.ACTION_STATE_CHANGED from " + getBTAdapterState(intExtra8) + " to " + getBTAdapterState(intExtra7));
            if (intExtra7 == 10) {
                this.mBTDeviceManager.onDeviceOffline();
            } else if (intExtra7 == 12) {
                if (this.mBTDeviceManager.mBTAdapter == null) {
                    RXLogging.m14765w("BTHeadsetBroadcastReceiver", "BT BluetoothAdapter state on, mBTAdapter is null");
                    return;
                }
                int profileConnectionState = this.mBTDeviceManager.mBTAdapter.getProfileConnectionState(2);
                int profileConnectionState2 = this.mBTDeviceManager.mBTAdapter.getProfileConnectionState(1);
                if (profileConnectionState == 2 || profileConnectionState2 == 2) {
                    RXLogging.m14765w("BTHeadsetBroadcastReceiver", "BT BluetoothAdapter state on and trigger BT onDeviceOnline, a2dp_state:" + profileConnectionState + " headset_state:" + profileConnectionState2);
                    this.mBTDeviceManager.onDeviceOnline();
                }
            }
        }
    }
}
