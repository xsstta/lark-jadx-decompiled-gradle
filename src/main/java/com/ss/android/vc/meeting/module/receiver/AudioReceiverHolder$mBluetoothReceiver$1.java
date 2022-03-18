package com.ss.android.vc.meeting.module.receiver;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/receiver/AudioReceiverHolder$mBluetoothReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AudioReceiverHolder$mBluetoothReceiver$1 extends BroadcastReceiver {
    AudioReceiverHolder$mBluetoothReceiver$1() {
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            AudioReceiverHolder aVar = AudioReceiverHolder.f158409a;
            if (!AudioReceiverHolder.f158411c.isEmpty()) {
                if (Intrinsics.areEqual("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    String a = AudioReceiverHolder.f158409a.mo217323a(intExtra);
                    String a2 = AudioReceiverHolder.f158409a.mo217323a(intExtra2);
                    AudioReceiverHolder aVar2 = AudioReceiverHolder.f158409a;
                    C60700b.m235851b(AudioReceiverHolder.f158410b, "[ACTION_CONNECTION_STATE_CHANGED]", "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED, state=" + a + ", preStateDesc=" + a2);
                    if (intExtra == 2) {
                        AudioReceiverHolder aVar3 = AudioReceiverHolder.f158409a;
                        for (AudioReceiverHolder.IAction aVar4 : AudioReceiverHolder.f158411c) {
                            aVar4.mo212683a(200);
                        }
                    } else if (intExtra == 0) {
                        AudioReceiverHolder aVar5 = AudioReceiverHolder.f158409a;
                        for (AudioReceiverHolder.IAction aVar6 : AudioReceiverHolder.f158411c) {
                            aVar6.mo212711p();
                        }
                    }
                } else {
                    String str = null;
                    if (Intrinsics.areEqual("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", intent.getAction())) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        if (!(parcelableExtra instanceof BluetoothDevice)) {
                            parcelableExtra = null;
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelableExtra;
                        int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                        int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                        AudioReceiverHolder aVar7 = AudioReceiverHolder.f158409a;
                        String str2 = AudioReceiverHolder.f158410b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("state=");
                        sb.append(AudioReceiverHolder.f158409a.mo217326b(intExtra3));
                        sb.append(", preState=");
                        sb.append(AudioReceiverHolder.f158409a.mo217326b(intExtra4));
                        sb.append(", device=");
                        if (bluetoothDevice != null) {
                            str = bluetoothDevice.getName();
                        }
                        sb.append(str);
                        C60700b.m235851b(str2, "[ACTION_AUDIO_STATE_CHANGED]", sb.toString());
                        if (intExtra3 != 10) {
                            if (intExtra3 == 12) {
                                AudioReceiverHolder aVar8 = AudioReceiverHolder.f158409a;
                                for (AudioReceiverHolder.IAction aVar9 : AudioReceiverHolder.f158411c) {
                                    if (bluetoothDevice != null) {
                                        aVar9.mo212684a(bluetoothDevice, true);
                                    }
                                }
                            }
                        } else if (!isInitialStickyBroadcast()) {
                            AudioReceiverHolder aVar10 = AudioReceiverHolder.f158409a;
                            for (AudioReceiverHolder.IAction aVar11 : AudioReceiverHolder.f158411c) {
                                if (bluetoothDevice != null) {
                                    aVar11.mo212684a(bluetoothDevice, false);
                                }
                            }
                        }
                    } else if (Intrinsics.areEqual("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", intent.getAction())) {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        if (!(parcelableExtra2 instanceof BluetoothDevice)) {
                            parcelableExtra2 = null;
                        }
                        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) parcelableExtra2;
                        if (bluetoothDevice2 != null) {
                            AudioReceiverHolder aVar12 = AudioReceiverHolder.f158409a;
                            C60700b.m235851b(AudioReceiverHolder.f158410b, "[ACTIVE_DEVICE_CHANGED]", "active device=" + bluetoothDevice2.getName());
                            AudioReceiverHolder aVar13 = AudioReceiverHolder.f158409a;
                            for (AudioReceiverHolder.IAction aVar14 : AudioReceiverHolder.f158411c) {
                                aVar14.mo212689a(true, bluetoothDevice2);
                            }
                            return;
                        }
                        AudioReceiverHolder aVar15 = AudioReceiverHolder.f158409a;
                        C60700b.m235851b(AudioReceiverHolder.f158410b, "[ACTIVE_DEVICE_CHANGED]", "no device active");
                        AudioReceiverHolder aVar16 = AudioReceiverHolder.f158409a;
                        for (AudioReceiverHolder.IAction aVar17 : AudioReceiverHolder.f158411c) {
                            aVar17.mo212689a(false, (BluetoothDevice) null);
                        }
                    }
                }
            }
        }
    }
}
