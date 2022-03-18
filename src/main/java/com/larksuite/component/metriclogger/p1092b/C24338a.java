package com.larksuite.component.metriclogger.p1092b;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.site.ActivityC23764o;
import com.huawei.hms.site.C23766q;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.C64034n;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.UUID;

/* renamed from: com.larksuite.component.metriclogger.b.a */
public class C24338a {

    /* renamed from: a */
    private static final String[] f60029a = {AbstractC60044a.f149675a, C63954b.f161494a, C60375c.f150914a, C63690d.f160779a, "e", C13998f.f36682a, "g", C14002h.f36692e, "i", "j", "k", "l", "m", C64034n.f161683a, ActivityC23764o.f58839a, "p", C23766q.f58841a, "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /* renamed from: a */
    public static String m88841a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static String m88842b() {
        String replace = m88841a().replace("-", "");
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                int i2 = i * 4;
                sb.append(f60029a[Integer.parseInt(replace.substring(i2, i2 + 4), 16) % 62]);
            }
            return sb.toString();
        } catch (Exception unused) {
            return replace.substring(0, 8);
        }
    }
}
