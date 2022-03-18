package com.ss.android.lark.monitor;

import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;

public class OkHttpUtils {
    public static void insertToOkHttpClientBuilder(List<Interceptor> list) {
        if (list != null) {
            boolean z = false;
            Iterator<Interceptor> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof OkHttpMonitorInterceptor) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                list.add(new OkHttpMonitorInterceptor());
            }
        }
    }
}
