package com.ss.android.vc.meeting.module.receiver;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/receiver/AudioReceiverHolder;", "", "()V", "TAG", "", "mBluetoothReceiver", "Landroid/content/BroadcastReceiver;", "getMBluetoothReceiver", "()Landroid/content/BroadcastReceiver;", "setMBluetoothReceiver", "(Landroid/content/BroadcastReceiver;)V", "mHeadPhoneReceiver", "getMHeadPhoneReceiver", "setMHeadPhoneReceiver", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/meeting/module/receiver/AudioReceiverHolder$IAction;", "getStateDesc", "state", "", "getStateDesc2", "registerActionListener", "", "listener", "startBroadcastListener", "context", "Landroid/content/Context;", "stopBroadcastListener", "unregisterActionListener", "IAction", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.receiver.a */
public final class AudioReceiverHolder {

    /* renamed from: a */
    public static final AudioReceiverHolder f158409a = new AudioReceiverHolder();

    /* renamed from: b */
    private static final String f158410b = f158410b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<IAction> f158411c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static BroadcastReceiver f158412d = new AudioReceiverHolder$mBluetoothReceiver$1();

    /* renamed from: e */
    private static BroadcastReceiver f158413e = new AudioReceiverHolder$mHeadPhoneReceiver$1();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/receiver/AudioReceiverHolder$IAction;", "", "connectBluetooth", "", "device", "Landroid/bluetooth/BluetoothDevice;", "scoOn", "", "disconnectBluetooth", "onBluetoothActive", "active", "plugInHeadPhone", "plugOutHeadPhone", "updateAudioDevice", "delayInMs", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.receiver.a$a */
    public interface IAction {
        /* renamed from: a */
        void mo212683a(long j);

        /* renamed from: a */
        void mo212684a(BluetoothDevice bluetoothDevice, boolean z);

        /* renamed from: a */
        void mo212689a(boolean z, BluetoothDevice bluetoothDevice);

        /* renamed from: n */
        void mo212709n();

        /* renamed from: o */
        void mo212710o();

        /* renamed from: p */
        void mo212711p();
    }

    private AudioReceiverHolder() {
    }

    /* renamed from: a */
    public final void mo217325a(IAction aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        f158411c.add(aVar);
    }

    /* renamed from: b */
    public final void mo217328b(IAction aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        f158411c.remove(aVar);
    }

    /* renamed from: b */
    public final String mo217326b(int i) {
        switch (i) {
            case 10:
                return "STATE_DISCONNECTED";
            case 11:
                return "STATE_CONNECTING";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "STATE_CONNECTED";
            default:
                return "UNKOWN";
        }
    }

    /* renamed from: a */
    public final String mo217323a(int i) {
        if (i == 0) {
            return "STATE_DISCONNECTED";
        }
        if (i == 1) {
            return "STATE_CONNECTING";
        }
        if (i == 2) {
            return "STATE_CONNECTED";
        }
        if (i != 3) {
            return "UNKOWN";
        }
        return "STATE_DISCONNECTING";
    }

    /* renamed from: b */
    public final void mo217327b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        f158411c.clear();
        context.unregisterReceiver(f158413e);
        context.unregisterReceiver(f158412d);
    }

    /* renamed from: a */
    public final void mo217324a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        m246188a(context, f158413e, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter2.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter2.addAction("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED");
        m246188a(context, f158412d, intentFilter2);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m246188a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
