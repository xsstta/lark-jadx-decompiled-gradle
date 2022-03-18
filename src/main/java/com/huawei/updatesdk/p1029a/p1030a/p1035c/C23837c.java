package com.huawei.updatesdk.p1029a.p1030a.p1035c;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.site.ActivityC23764o;
import com.huawei.hms.site.C23766q;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.C64034n;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.a.a.c.c */
public class C23837c {

    /* renamed from: a */
    private static final Map<String, String> f59045a;

    static {
        HashMap hashMap = new HashMap();
        f59045a = hashMap;
        hashMap.put("android.hardware.audio.output", "1");
        hashMap.put("android.hardware.bluetooth", "2");
        hashMap.put("android.hardware.bluetooth_le", "3");
        hashMap.put("android.hardware.camera", "4");
        hashMap.put("android.hardware.camera.any", "5");
        hashMap.put("android.hardware.camera.autofocus", "6");
        hashMap.put("android.hardware.camera.capability.manual_post_processing", "7");
        hashMap.put("android.hardware.camera.flash", "8");
        hashMap.put("android.hardware.camera.front", "9");
        hashMap.put("android.hardware.consumerir", "A");
        hashMap.put("android.hardware.faketouch", "B");
        hashMap.put("android.hardware.fingerprint", "C");
        hashMap.put("android.hardware.location", "D");
        hashMap.put("android.hardware.location.gps", "E");
        hashMap.put("android.hardware.location.network", "F");
        hashMap.put("android.hardware.microphone", "G");
        hashMap.put("android.hardware.nfc", "H");
        hashMap.put("android.hardware.nfc.any", "I");
        hashMap.put("android.hardware.nfc.hce", "J");
        hashMap.put("android.hardware.nfc.hcef", "K");
        hashMap.put("android.hardware.opengles.aep", "L");
        hashMap.put("android.hardware.ram.normal", "M");
        hashMap.put("android.hardware.screen.landscape", "N");
        hashMap.put("android.hardware.screen.portrait", "O");
        hashMap.put("android.hardware.sensor.accelerometer", "P");
        hashMap.put("android.hardware.sensor.barometer", "Q");
        hashMap.put("android.hardware.sensor.compass", "R");
        hashMap.put("android.hardware.sensor.gyroscope", "S");
        hashMap.put("android.hardware.sensor.light", "T");
        hashMap.put("android.hardware.sensor.proximity", "U");
        hashMap.put("android.hardware.sensor.stepcounter", "V");
        hashMap.put("android.hardware.sensor.stepdetector", "W");
        hashMap.put("android.hardware.telephony", "X");
        hashMap.put("android.hardware.telephony.gsm", "Y");
        hashMap.put("android.hardware.telephony.ims", "Z");
        hashMap.put("android.hardware.touchscreen", AbstractC60044a.f149675a);
        hashMap.put("android.hardware.touchscreen.multitouch", C63954b.f161494a);
        hashMap.put("android.hardware.touchscreen.multitouch.distinct", C60375c.f150914a);
        hashMap.put("android.hardware.touchscreen.multitouch.jazzhand", C63690d.f160779a);
        hashMap.put("android.hardware.usb.accessory", "e");
        hashMap.put("android.hardware.usb.host", C13998f.f36682a);
        hashMap.put("android.hardware.vulkan.compute", "g");
        hashMap.put("android.hardware.vulkan.level", C14002h.f36692e);
        hashMap.put("android.hardware.vulkan.version", "i");
        hashMap.put("android.hardware.wifi", "j");
        hashMap.put("android.hardware.wifi.direct", "k");
        hashMap.put("android.hardware.wifi.passpoint", "l");
        hashMap.put("android.software.activities_on_secondary_displays", "m");
        hashMap.put("android.software.app_widgets", C64034n.f161683a);
        hashMap.put("android.software.autofill", ActivityC23764o.f58839a);
        hashMap.put("android.software.backup", "p");
        hashMap.put("android.software.cant_save_state", C23766q.f58841a);
        hashMap.put("android.software.companion_device_setup", "r");
        hashMap.put("android.software.connectionservice", "s");
        hashMap.put("android.software.cts", "t");
        hashMap.put("android.software.device_admin", "u");
        hashMap.put("android.software.file_based_encryption", "v");
        hashMap.put("android.software.freeform_window_management", "w");
        hashMap.put("android.software.home_screen", "x");
        hashMap.put("android.software.input_methods", "y");
        hashMap.put("android.software.ipsec_tunnels", "z");
        hashMap.put("android.software.live_wallpaper", "00");
        hashMap.put("android.software.managed_users", HiAnalyticsConstant.KeyAndValue.NUMBER_01);
        hashMap.put("android.software.midi", "02");
        hashMap.put("android.software.picture_in_picture", "03");
        hashMap.put("android.software.print", "04");
        hashMap.put("android.software.secure_lock_screen", "05");
        hashMap.put("android.software.securely_removes_users", "06");
        hashMap.put("android.software.verified_boot", "07");
        hashMap.put("android.software.voice_recognizers", "08");
        hashMap.put("android.software.webview", "09");
        hashMap.put("android.sofware.nfc.beam", "0A");
        hashMap.put("com.huawei.software.features.china", "0B");
        hashMap.put("com.huawei.software.features.full", "0C");
        hashMap.put("com.huawei.system.feature", "0D");
        hashMap.put("com.nxp.mifare", "0E");
        hashMap.put("huawei.android.hardware.stylus", "0F");
        hashMap.put("android.hardware.audio.low_latency", "0G");
        hashMap.put("android.hardware.camera.capability.raw", "0H");
        hashMap.put("android.hardware.camera.external", "0I");
        hashMap.put("android.hardware.telephony.cdma", "0J");
        hashMap.put("android.software.file_based_encryption", "0K");
        hashMap.put("android.software.sip", "0L");
        hashMap.put("android.software.sip.voip", "0M");
        hashMap.put("android.software.vr.mode", "0N");
        hashMap.put("cn.google.services", "0O");
        hashMap.put("com.google.android.feature.services_updater", "0P");
        hashMap.put("com.google.android.feature.ZERO_TOUCH", "0Q");
        hashMap.put("com.huawei.software.features.oversea", "0R");
    }

    /* renamed from: a */
    public static String m87126a(String str) {
        Map<String, String> map = f59045a;
        return map.containsKey(str) ? map.get(str) : str;
    }
}
