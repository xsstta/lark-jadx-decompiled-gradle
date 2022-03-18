package com.ss.android.ug.bus;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ug.bus.c */
public class C60443c {

    /* renamed from: a */
    public static final ConcurrentHashMap<Type, ConcurrentHashMap<AbstractC60445a, Object>> f151026a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final Object f151027b = new Object();

    /* renamed from: c */
    private static final Handler f151028c = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ug.bus.c$a */
    public interface AbstractC60445a<T> {
    }

    /* renamed from: a */
    public static <EVENT> void m234866a(AbstractC60445a<EVENT> aVar) {
        m234865a(null, aVar);
    }

    /* renamed from: a */
    public static <EVENT> void m234865a(final LifecycleOwner lifecycleOwner, final AbstractC60445a<EVENT> aVar) {
        if (aVar != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                f151028c.post(new Runnable() {
                    /* class com.ss.android.ug.bus.C60443c.RunnableC604441 */

                    public void run() {
                        C60443c.m234865a(lifecycleOwner, aVar);
                    }
                });
                return;
            }
            Type type = ((ParameterizedType) aVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
            ConcurrentHashMap<Type, ConcurrentHashMap<AbstractC60445a, Object>> concurrentHashMap = f151026a;
            ConcurrentHashMap<AbstractC60445a, Object> concurrentHashMap2 = concurrentHashMap.get(type);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                concurrentHashMap.put(type, concurrentHashMap2);
            }
            concurrentHashMap2.put(aVar, f151027b);
            if (lifecycleOwner != null) {
                lifecycleOwner.getLifecycle().addObserver(new UgCallbackCenter$2(concurrentHashMap2, aVar, type));
            }
        }
    }
}
