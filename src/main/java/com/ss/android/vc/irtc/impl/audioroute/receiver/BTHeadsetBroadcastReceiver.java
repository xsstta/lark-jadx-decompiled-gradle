package com.ss.android.vc.irtc.impl.audioroute.receiver;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.irtc.impl.audioroute.AudioRouteLogger;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.BluetoothHeadsetScoDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.receiver.base.BaseAudioDeviceBroadcastReceiver;

public class BTHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private BluetoothHeadsetScoDeviceManager mBTDeviceManager;

    public BTHeadsetBroadcastReceiver(BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager) {
        this.mBTDeviceManager = bluetoothHeadsetScoDeviceManager;
    }

    private void onBlueToothDeviceOffline(BluetoothDevice bluetoothDevice) {
        run(new Runnable(bluetoothDevice) {
            /* class com.ss.android.vc.irtc.impl.audioroute.receiver.$$Lambda$BTHeadsetBroadcastReceiver$60G20tb0dbbijP6Cf4w2Bjjfik */
            public final /* synthetic */ BluetoothDevice f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BTHeadsetBroadcastReceiver.this.lambda$onBlueToothDeviceOffline$1$BTHeadsetBroadcastReceiver(this.f$1);
            }
        });
    }

    private void onBlueToothDeviceOnline(BluetoothDevice bluetoothDevice) {
        run(new Runnable(bluetoothDevice) {
            /* class com.ss.android.vc.irtc.impl.audioroute.receiver.$$Lambda$BTHeadsetBroadcastReceiver$OCFliMshZehgdPnMwKu4Srdz0 */
            public final /* synthetic */ BluetoothDevice f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BTHeadsetBroadcastReceiver.this.lambda$onBlueToothDeviceOnline$0$BTHeadsetBroadcastReceiver(this.f$1);
            }
        });
    }

    private boolean isHeadsetDevice(BluetoothDevice bluetoothDevice) {
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass == null) {
            return true;
        }
        int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
        if (majorDeviceClass == 0 || majorDeviceClass == 256 || majorDeviceClass == 512 || majorDeviceClass == 768 || majorDeviceClass == 1280 || majorDeviceClass == 1536 || majorDeviceClass == 1792 || majorDeviceClass == 2048 || majorDeviceClass == 2304) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$onBlueToothDeviceOffline$1$BTHeadsetBroadcastReceiver(BluetoothDevice bluetoothDevice) {
        if (this.mBTDeviceManager.isDevicePlugged() && bluetoothDevice != null) {
            AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + "checking is device disconnected");
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && 2 != defaultAdapter.getProfileConnectionState(1)) {
                AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " disconnected");
                this.mBTDeviceManager.onDeviceOffline();
            }
        }
    }

    public /* synthetic */ void lambda$onBlueToothDeviceOnline$0$BTHeadsetBroadcastReceiver(BluetoothDevice bluetoothDevice) {
        AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " connected");
        if (!this.mBTDeviceManager.isDevicePlugged() && bluetoothDevice != null && isHeadsetDevice(bluetoothDevice)) {
            AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice.getName() + " onDeviceOnline");
            this.mBTDeviceManager.resetScoConnectionAttempts();
            this.mBTDeviceManager.onDeviceOnline();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$onReceive$2$BTHeadsetBroadcastReceiver(int r4) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.audioroute.receiver.BTHeadsetBroadcastReceiver.lambda$onReceive$2$BTHeadsetBroadcastReceiver(int):void");
    }

    public /* synthetic */ void lambda$onReceive$3$BTHeadsetBroadcastReceiver(int i, int i2) {
        AudioRouteLogger.m237436d("BTHeadsetBroadcastReceiver", "BluetoothAdapter.ACTION_STATE_CHANGED prev " + i + ", " + i2);
        if (i2 == 10) {
            this.mBTDeviceManager.onDeviceOffline();
        } else if (i2 == 12) {
            this.mBTDeviceManager.onDeviceOnline();
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
            AudioRouteLogger.m237436d("BTHeadsetBroadcastReceiver", "BT ACTION_CONNECTION_STATE_CHANGED prev " + intExtra2 + ", " + intExtra);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (intExtra == 0) {
                onBlueToothDeviceOffline(bluetoothDevice);
            } else if (intExtra == 1) {
                AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " connecting");
            } else if (intExtra == 2) {
                onBlueToothDeviceOnline(bluetoothDevice);
            } else if (intExtra != 3) {
                AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " unknown event, state=" + intExtra);
            } else {
                AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " disconnecting");
            }
        } else if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(action)) {
            int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
            int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
            AudioRouteLogger.m237436d("BTHeadsetBroadcastReceiver", "BT ACTION_AUDIO_STATE_CHANGED prev " + intExtra4 + ", " + intExtra3);
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            switch (intExtra3) {
                case 10:
                    AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth audio device " + bluetoothDevice2 + " disconnected");
                    return;
                case 11:
                    AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth audio device " + bluetoothDevice2 + " connecting");
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth audio device " + bluetoothDevice2 + " connected");
                    return;
                default:
                    AudioRouteLogger.m237438i("BTHeadsetBroadcastReceiver", "Bluetooth audio device " + bluetoothDevice2 + " event, state=" + intExtra3);
                    return;
            }
        } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
            int intExtra5 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
            int intExtra6 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99);
            AudioRouteLogger.m237436d("BTHeadsetBroadcastReceiver", "BT ACTION_SCO_AUDIO_STATE_UPDATED prev " + intExtra6 + ", " + intExtra5);
            run(new Runnable(intExtra5) {
                /* class com.ss.android.vc.irtc.impl.audioroute.receiver.$$Lambda$BTHeadsetBroadcastReceiver$jQXMquaZGzP7HwjIm150YyBpQe8 */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BTHeadsetBroadcastReceiver.this.lambda$onReceive$2$BTHeadsetBroadcastReceiver(this.f$1);
                }
            });
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            run(new Runnable(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99), intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99)) {
                /* class com.ss.android.vc.irtc.impl.audioroute.receiver.$$Lambda$BTHeadsetBroadcastReceiver$BQFqPXD283XKayjusHZg86lw6k */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    BTHeadsetBroadcastReceiver.this.lambda$onReceive$3$BTHeadsetBroadcastReceiver(this.f$1, this.f$2);
                }
            });
        } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction())) {
            int intExtra7 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
            int intExtra8 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99);
            AudioRouteLogger.m237436d("BTHeadsetBroadcastReceiver", "BluetoothDevice.ACTION_ACL_CONNECTED prev " + intExtra8 + ", " + intExtra7);
            onBlueToothDeviceOnline((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
        } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            int intExtra9 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
            int intExtra10 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99);
            AudioRouteLogger.m237436d("BTHeadsetBroadcastReceiver", "BluetoothDevice.ACTION_ACL_DISCONNECTED prev " + intExtra10 + ", " + intExtra9);
            onBlueToothDeviceOffline((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
        }
    }
}
