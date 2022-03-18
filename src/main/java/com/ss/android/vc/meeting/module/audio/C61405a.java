package com.ss.android.vc.meeting.module.audio;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.ttm.player.MediaPlayer;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.ss.android.vc.meeting.module.audio.a */
public class C61405a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.audio.a$1 */
    public static /* synthetic */ class C614061 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153955a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType[] r0 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.audio.C61405a.C614061.f153955a = r0
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Default     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.audio.C61405a.C614061.f153955a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.audio.C61405a.C614061.f153955a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.audio.C61405a.C614061.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static final boolean m239525b(BluetoothHeadset bluetoothHeadset) {
        BluetoothDevice a = m239519a(bluetoothHeadset);
        if (!(bluetoothHeadset == null || a == null)) {
            try {
                return bluetoothHeadset.isAudioConnected(a);
            } catch (Exception e) {
                C60700b.m235864f("MeetingAudioManager", "[isBtScoOn]", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    private static String m239520a(int i) {
        if (i == 1028) {
            return "AUDIO_VIDEO_WEARABLE_HEADSET";
        }
        if (i == 1048) {
            return "AUDIO_VIDEO_HEADPHONES";
        }
        return "0X" + Integer.toHexString(i);
    }

    /* renamed from: b */
    private static int m239524b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return -1;
        }
        try {
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("getBatteryLevel", null);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(bluetoothDevice, null)).intValue();
            if (intValue > 0) {
                return intValue;
            }
            return -1;
        } catch (Exception e) {
            C60700b.m235846a("MeetingAudioManager", "getBtDeviceBattery", e);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r4 == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084 A[Catch:{ Exception -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.bluetooth.BluetoothDevice m239519a(android.bluetooth.BluetoothHeadset r14) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.audio.C61405a.m239519a(android.bluetooth.BluetoothHeadset):android.bluetooth.BluetoothDevice");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static boolean m239523a(BluetoothDevice bluetoothDevice) {
        boolean z;
        String str;
        if (bluetoothDevice == null) {
            return false;
        }
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass != null) {
            String str2 = null;
            switch (bluetoothClass.getMajorDeviceClass()) {
                case 0:
                    str2 = "MISC";
                    z = true;
                    break;
                case DynamicModule.f58006b:
                    str2 = "COMPUTER";
                    z = true;
                    break;
                case MediaPlayer.MEDIA_PLAYER_OPTION_APPID /*{ENCODED_INT: 512}*/:
                    str2 = "PHONE";
                    z = true;
                    break;
                case 768:
                    str2 = "NETWORKING";
                    z = true;
                    break;
                case 1024:
                    str2 = "AUDIO_VIDEO";
                    z = true;
                    break;
                case 1280:
                    str2 = "PERIPHERAL";
                    z = true;
                    break;
                case 1536:
                    str2 = "IMAGING";
                    z = true;
                    break;
                case 1792:
                    str2 = "WEARABLE";
                    z = false;
                    break;
                case 2048:
                    str2 = "TOY";
                    z = true;
                    break;
                case 2304:
                    str2 = "HEALTH";
                    z = false;
                    break;
                case 7936:
                    str2 = "UNCATEGORIZED";
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            String d = MeetingAudioManager.m239471k().mo212697d();
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            objArr[0] = bluetoothDevice.getName();
            objArr[1] = str2;
            objArr[2] = m239520a(bluetoothClass.getDeviceClass());
            if (z) {
                str = "";
            } else {
                str = "not";
            }
            objArr[3] = str;
            C60700b.m235851b(d, "[isHeadsetDevice]", String.format(locale, "%s(%s-%s) is %s HeadsetDevice", objArr));
            return z;
        }
        C60700b.m235851b("MeetingAudioManager", "[isHeadsetDevice2]", String.format("device(%s) bluetoothClass = null", bluetoothDevice.getName()));
        return true;
    }

    /* renamed from: a */
    public static String m239521a(MeetingAudioManager.AudioType audioType, boolean z) {
        if (z) {
            return "speaker";
        }
        int i = C614061.f153955a[audioType.ordinal()];
        if (i == 1) {
            return "earpiece";
        }
        if (i == 2) {
            return "bluetooth";
        }
        if (i != 3) {
            return "";
        }
        return "headphone";
    }

    /* renamed from: a */
    public static String m239522a(boolean z, MeetingAudioManager.AudioType audioType, String str) {
        if (z) {
            return UIHelper.getString(R.string.View_VM_Speaker);
        }
        int i = C614061.f153955a[audioType.ordinal()];
        if (i == 1) {
            return UIHelper.getString(R.string.View_G_Receiver);
        }
        if (i != 2) {
            if (i != 3) {
                return "";
            }
            return UIHelper.getString(R.string.View_G_Headphones);
        } else if (TextUtils.isEmpty(str)) {
            return UIHelper.getString(R.string.View_G_Bluetooth);
        } else {
            return str;
        }
    }
}
