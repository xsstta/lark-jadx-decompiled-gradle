package ee.android.framework.manis.base;

import android.content.Context;
import android.text.TextUtils;
import ee.android.framework.manis.p3450a.C68182c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ee.android.framework.manis.base.a */
public class C68187a {

    /* renamed from: a */
    private static Map<Integer, String> f171426a = new HashMap();

    /* renamed from: a */
    public static String m264848a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        int hashCode = applicationContext.hashCode();
        String str = f171426a.get(Integer.valueOf(hashCode));
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String c = C68182c.m264836c(applicationContext);
        if (TextUtils.isEmpty(c)) {
            c = "lark_main";
        }
        f171426a.put(Integer.valueOf(hashCode), c);
        return c;
    }
}
