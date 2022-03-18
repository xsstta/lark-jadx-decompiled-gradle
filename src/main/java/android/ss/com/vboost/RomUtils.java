package android.ss.com.vboost;

import android.ss.com.vboost.p010a.C0081b;
import android.text.TextUtils;

public class RomUtils {

    public @interface AppRunFrom {
    }

    /* renamed from: a */
    public static boolean m162a() {
        return C0081b.m166a();
    }

    /* renamed from: b */
    public static boolean m163b() {
        String a = m161a("ro.product.brand");
        if (TextUtils.isEmpty(a) || !a.toLowerCase().contains("oppo")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[SYNTHETIC, Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[SYNTHETIC, Splitter:B:25:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m161a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.RomUtils.m161a(java.lang.String):java.lang.String");
    }
}
