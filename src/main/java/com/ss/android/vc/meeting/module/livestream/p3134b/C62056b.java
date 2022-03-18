package com.ss.android.vc.meeting.module.livestream.p3134b;

import android.app.Activity;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.config.AbstractC28343c;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.vc.VideoChatModule;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.livestream.b.b */
public class C62056b {
    /* renamed from: a */
    private static void m242454a() {
        if (BytedCertManager.getInstance().getCertMonitorConfig() == null) {
            BytedCertManager.getInstance().setCertMonitorConfig(new AbstractC28343c() {
                /* class com.ss.android.vc.meeting.module.livestream.p3134b.C62056b.C620571 */

                @Override // com.ss.android.bytedcert.config.AbstractC28343c
                /* renamed from: a */
                public int mo100948a() {
                    return VideoChatModule.getDependency().getAppId();
                }

                @Override // com.ss.android.bytedcert.config.AbstractC28343c
                /* renamed from: b */
                public String mo100950b() {
                    return VideoChatModule.getDependency().getDeviceId();
                }

                @Override // com.ss.android.bytedcert.config.AbstractC28343c
                /* renamed from: a */
                public void mo100949a(String str, JSONObject jSONObject) {
                    C60217b.m234045a(str, jSONObject, "behavior");
                }
            });
        }
    }

    /* renamed from: a */
    private static void m242456a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", "feishu_livestream");
        hashMap.put("ticket", str);
        hashMap.put("cert_app_id", String.valueOf(2841));
        hashMap.put("mode", "0");
        BytedCertManager.getInstance().setCertInfo(hashMap);
    }

    /* renamed from: a */
    public static void m242455a(Activity activity, String str, String str2, String str3, SDKCallBack.FaceLiveCallback faceLiveCallback) {
        m242454a();
        m242456a(str);
        BytedCertManager.getInstance().doFaceLive(activity, str2, str3, faceLiveCallback);
    }
}
