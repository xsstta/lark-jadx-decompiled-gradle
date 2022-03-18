package com.huawei.agconnect.p1009a;

import android.content.Context;
import com.huawei.agconnect.p1009a.p1010a.C23400a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.agconnect.a.a */
public abstract class AbstractC23399a {

    /* renamed from: a */
    private static final Map<String, AbstractC23399a> f57711a = new HashMap();

    /* renamed from: b */
    private static final Object f57712b = new Object();

    /* renamed from: a */
    public static AbstractC23399a m84921a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return m84922a(context, context.getPackageName());
    }

    /* renamed from: a */
    public static AbstractC23399a m84922a(Context context, String str) {
        AbstractC23399a aVar;
        synchronized (f57712b) {
            Map<String, AbstractC23399a> map = f57711a;
            aVar = map.get(str);
            if (aVar == null) {
                aVar = new C23400a(context, str);
                map.put(str, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public abstract String mo81785a(String str);

    /* renamed from: a */
    public abstract String mo81786a(String str, String str2);

    /* renamed from: a */
    public abstract void mo81787a(InputStream inputStream);
}
