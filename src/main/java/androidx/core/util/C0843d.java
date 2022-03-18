package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: androidx.core.util.d */
public class C0843d {
    /* renamed from: a */
    public static int m3986a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m3987a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
