package ee.android.framework.manis.base;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ee.android.framework.manis.base.d */
public class C68194d {

    /* renamed from: a */
    private static Map<Class, String> f171437a = new HashMap();

    /* renamed from: a */
    private static String m264858a(Context context, String str) {
        return String.format("content://%s.IPC.%sIPCProvider/main", context.getPackageName(), str);
    }

    /* renamed from: a */
    public static String m264857a(Context context, Class<?> cls) {
        String str = f171437a.get(cls);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        synchronized (f171437a) {
            String str2 = f171437a.get(cls);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String name = cls.getName();
            String a = C68188b.m264850a(context, name);
            if (TextUtils.isEmpty(a)) {
                Log.m165389i("UriMatcher", "getUri process is empty for Main Process class:" + name);
                a = "";
            }
            String str3 = m264858a(context, a) + "?class=" + name;
            f171437a.put(cls, str3);
            return str3;
        }
    }
}
