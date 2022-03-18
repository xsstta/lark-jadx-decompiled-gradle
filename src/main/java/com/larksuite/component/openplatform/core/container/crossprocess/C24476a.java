package com.larksuite.component.openplatform.core.container.crossprocess;

import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.container.crossprocess.a */
public class C24476a {

    /* renamed from: a */
    private static C24476a f60394a;

    /* renamed from: b */
    private final Map<String, IHostProcessHandleEvent.HandleEventCallback> f60395b = new ConcurrentHashMap();

    private C24476a() {
    }

    /* renamed from: a */
    public static C24476a m89285a() {
        if (f60394a == null) {
            synchronized (C24476a.class) {
                if (f60394a == null) {
                    f60394a = new C24476a();
                }
            }
        }
        return f60394a;
    }

    /* renamed from: b */
    public void mo87341b(String str) {
        Log.m165389i("OPCrossProcessCallbackM", "remove callbackById:" + str);
        this.f60395b.remove(str);
    }

    /* renamed from: a */
    public IHostProcessHandleEvent.HandleEventCallback mo87339a(String str) {
        Log.m165389i("OPCrossProcessCallbackM", "get callbackById:" + str);
        return this.f60395b.get(str);
    }

    /* renamed from: a */
    public void mo87340a(String str, IHostProcessHandleEvent.HandleEventCallback handleEventCallback) {
        Log.m165389i("OPCrossProcessCallbackM", "put callbackById:" + str);
        this.f60395b.put(str, handleEventCallback);
    }
}
