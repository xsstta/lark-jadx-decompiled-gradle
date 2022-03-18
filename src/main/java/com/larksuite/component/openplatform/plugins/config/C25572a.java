package com.larksuite.component.openplatform.plugins.config;

import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.openplatform.plugins.device.ClipboardPlugin;
import com.larksuite.component.openplatform.plugins.device.GetBatteryInfoPlugin;
import com.larksuite.component.openplatform.plugins.device.MailToPlugin;
import com.larksuite.component.openplatform.plugins.device.MakePhoneCallPlugin;
import com.larksuite.component.openplatform.plugins.device.RequestSystemPermissionPlugin;
import com.larksuite.component.openplatform.plugins.device.ScreenPlugin;
import com.larksuite.component.openplatform.plugins.device.StartDeviceCredentialPlugin;
import com.larksuite.component.openplatform.plugins.device.VibratePlugin;
import com.larksuite.component.openplatform.plugins.device.compass.CompassPlugin;
import com.larksuite.component.openplatform.plugins.device.usercapture.UserCaptureScreenPlugin;
import com.larksuite.component.openplatform.plugins.device.wifi.WifiPlugin;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25555b;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.plugins.config.a */
public class C25572a implements AbstractC25555b {

    /* renamed from: a */
    private static AbstractC25555b f62211a;

    /* renamed from: b */
    private List<LKPluginConfig> f62212b = new LinkedList();

    @Override // com.larksuite.component.openplatform.plugins.p1142a.AbstractC25555b
    /* renamed from: a */
    public List<LKPluginConfig> mo88695a() {
        return this.f62212b;
    }

    private C25572a() {
        m91283c();
    }

    /* renamed from: b */
    public static AbstractC25555b m91282b() {
        if (f62211a == null) {
            synchronized (C25572a.class) {
                if (f62211a == null) {
                    f62211a = new C25572a();
                }
            }
        }
        return f62211a;
    }

    /* renamed from: c */
    private void m91283c() {
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(ClipboardPlugin.class).mo88748a(Arrays.asList("setClipboardData", "getClipboardData")).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(StartDeviceCredentialPlugin.class).mo88748a(Arrays.asList("startDeviceCredential")).mo88742a(PluginEnv.APP_ENV).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(MakePhoneCallPlugin.class).mo88748a(Arrays.asList("makePhoneCall")).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(GetBatteryInfoPlugin.class).mo88748a(Arrays.asList("getBatteryInfoSync")).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(MailToPlugin.class).mo88748a(Arrays.asList("mailto")).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(VibratePlugin.class).mo88748a(Arrays.asList("vibrateLong", "vibrateShort")).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(ScreenPlugin.class).mo88748a(Arrays.asList("getScreenBrightness", "setScreenBrightness", "setKeepScreenOn")).mo88742a(PluginEnv.APP_ENV).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(WifiPlugin.class).mo88748a(Arrays.asList("getWifiStatus", "getConnectedWifi", "getWifiList", "onGetWifiList", "offGetWifiList")).mo88742a(PluginEnv.APP_ENV).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88746a(UserCaptureScreenPlugin.class).mo88748a(Arrays.asList("onUserCaptureScreen", "offUserCaptureScreen")).mo88742a(PluginEnv.APP_ENV).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88745a(new CompassPlugin()).mo88742a(PluginEnv.APP_ENV).mo88749a());
        this.f62212b.add(new LKPluginConfig.C25571a().mo88745a(new RequestSystemPermissionPlugin()).mo88742a(PluginEnv.APP_ENV).mo88749a());
    }
}
