package com.bytedance.ee.bear.document.device;

import android.content.Context;
import android.os.Build;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;

/* renamed from: com.bytedance.ee.bear.document.device.a */
public class C5740a implements AbstractC7945d {

    /* renamed from: a */
    private Context f16198a;

    /* renamed from: a */
    private String m23216a() {
        return Build.MODEL;
    }

    /* renamed from: b */
    private String m23217b() {
        return Build.BRAND;
    }

    C5740a(Context context) {
        this.f16198a = context;
    }

    @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
    public void handle(Object obj, AbstractC7947h hVar) {
        DeviceInfo deviceInfo = new DeviceInfo(m23217b(), m23216a(), C4511g.m18594d().mo17369s(), C13653a.m55399c(this.f16198a));
        C13479a.m54764b("DeviceInfoHandler", "handle(): device = " + deviceInfo);
        hVar.mo17189a(deviceInfo);
    }
}
