package bytedance.p052c;

import android.util.Log;
import com.huawei.hms.common.util.Logger;

/* renamed from: bytedance.c.b */
public class C1681b {

    /* renamed from: a */
    static int f5707a = 4;

    /* renamed from: b */
    static AbstractC1682a f5708b;

    /* renamed from: bytedance.c.b$a */
    public static abstract class AbstractC1682a {
        /* renamed from: a */
        public void mo8568a(String str, String str2) {
        }
    }

    /* renamed from: a */
    public static void m7445a(String str) {
        m7447b(Logger.f57967b, str);
    }

    /* renamed from: a */
    public static void m7446a(String str, String str2) {
        if (str2 != null && f5707a <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m7447b(String str, String str2) {
        if (str2 != null) {
            if (f5707a <= 6) {
                Log.e(str, str2);
            }
            AbstractC1682a aVar = f5708b;
            if (aVar != null) {
                aVar.mo8568a(str, str2);
            }
        }
    }
}
