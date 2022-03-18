package com.bytedance.ee.bear.service.callback;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.service.base.C10916c;
import com.bytedance.ee.bear.service.callback.ProcessLifecycle;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.service.callback.a */
public class C10918a {

    /* renamed from: a */
    public static final Map<Class<?>, List<C10925a>> f29386a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Map<String, IBinder> f29387b = new ConcurrentHashMap();

    /* renamed from: c */
    public static AbstractC10926b f29388c;

    /* renamed from: d */
    public static final Map<Class<?>, List<Object>> f29389d = new ConcurrentHashMap();

    /* renamed from: e */
    private static Application f29390e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.service.callback.a$a */
    public static class C10925a {

        /* renamed from: a */
        public AbstractC10927c f29408a;

        /* renamed from: b */
        boolean f29409b;

        /* renamed from: c */
        boolean f29410c;

        private C10925a() {
        }

        /* synthetic */ C10925a(RunnableC109191 r1) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.service.callback.a$1 */
    public static class RunnableC109191 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f29391a;

        /* renamed from: b */
        final /* synthetic */ String f29392b;

        /* renamed from: c */
        final /* synthetic */ Class[] f29393c;

        /* renamed from: d */
        final /* synthetic */ Object[] f29394d;

        public void run() {
            try {
                C10918a.m45425a(C10918a.f29389d, this.f29391a, this.f29392b, this.f29393c, this.f29394d);
            } catch (Exception e) {
                if (C10918a.f29388c != null) {
                    C10918a.f29388c.handlerError("CallbackManager", e);
                } else {
                    C13479a.m54761a("CallbackManager", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> void m45418a(Class<T> cls, AbstractC10927c<T> cVar) {
        m45419a((Class) cls, (AbstractC10927c) cVar, false, false);
    }

    /* renamed from: a */
    public static void m45420a(Class<?> cls, Object obj) {
        m45421a(cls, JSON.toJSONString(obj));
    }

    /* renamed from: b */
    private static void m45427b(final Class<?> cls, final String str) {
        BearExecutors.m48469d().execute(new Runnable() {
            /* class com.bytedance.ee.bear.service.callback.C10918a.RunnableC109202 */

            public void run() {
                try {
                    C10918a.m45424a(C10918a.f29386a, cls, str);
                } catch (Exception e) {
                    if (C10918a.f29388c != null) {
                        C10918a.f29388c.handlerError("CallbackManager", e);
                    } else {
                        C13479a.m54761a("CallbackManager", e);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m45417a(Application application, final AbstractC10926b bVar) {
        f29390e = application;
        f29388c = bVar;
        m45416a(application, new BroadcastReceiver() {
            /* class com.bytedance.ee.bear.service.callback.C10918a.C109213 */

            public void onReceive(Context context, final Intent intent) {
                final String stringExtra = intent.getStringExtra("com.bytedance.ee.bear.service.event_process");
                final int intExtra = intent.getIntExtra("com.bytedance.ee.bear.service.event_process.id", -1);
                if (C10916c.m45409b(null).equals(stringExtra)) {
                    C13479a.m54764b("CallbackManager", "event from same process");
                } else {
                    BearExecutors.m48469d().execute(new Runnable() {
                        /* class com.bytedance.ee.bear.service.callback.C10918a.C109213.RunnableC109221 */

                        public void run() {
                            try {
                                Class<?> cls = Class.forName(intent.getStringExtra("com.bytedance.ee.bear.service.callback.class"));
                                String stringExtra = intent.getStringExtra("com.bytedance.ee.bear.service.callback.old.method");
                                C13479a.m54764b("CallbackManager", "get event:" + cls.getName() + " method:" + stringExtra);
                                if (stringExtra == null) {
                                    String stringExtra2 = intent.getStringExtra("com.bytedance.ee.bear.service.callback.key");
                                    C10918a.m45422a(cls, stringExtra, intExtra, intent);
                                    C10918a.m45424a(C10918a.f29386a, cls, stringExtra2);
                                    return;
                                }
                                String[] stringArrayExtra = intent.getStringArrayExtra("com.bytedance.ee.bear.service.callback.old.params");
                                int length = stringArrayExtra.length;
                                Class[] clsArr = new Class[length];
                                Bundle extras = intent.getExtras();
                                Object[] objArr = new Object[length];
                                if (extras != null) {
                                    for (int i = 0; i < stringArrayExtra.length; i++) {
                                        clsArr[i] = Class.forName(stringArrayExtra[i]);
                                        objArr[i] = extras.get("com.bytedance.ee.bear.service.callback.old.params_" + i);
                                    }
                                }
                                C10918a.m45425a(C10918a.f29389d, cls, stringExtra, clsArr, objArr);
                            } catch (Exception e) {
                                if (bVar != null) {
                                    bVar.handlerError("CallbackManager", e);
                                } else {
                                    C13479a.m54761a("CallbackManager", e);
                                }
                            }
                        }
                    });
                }
            }
        }, new IntentFilter("com.bytedance.ee.bear.service.action"));
        m45423a(C10916c.m45409b(null), Process.myPid(), ProcessLifecycle.ProcessSate.START);
    }

    /* renamed from: b */
    public static <T> void m45426b(Class<T> cls, AbstractC10927c<T> cVar) {
        List<C10925a> list = f29386a.get(cls);
        if (list != null) {
            C10925a aVar = null;
            Iterator<C10925a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10925a next = it.next();
                if (next.f29408a == cVar) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m45421a(Class<?> cls, String str) {
        m45427b(cls, str);
        Intent intent = new Intent("com.bytedance.ee.bear.service.action");
        intent.setPackage(f29390e.getPackageName());
        intent.putExtra("com.bytedance.ee.bear.service.event_process", C10916c.m45409b(null));
        intent.putExtra("com.bytedance.ee.bear.service.event_process.id", Process.myPid());
        if (cls == ProcessLifecycle.class && Build.VERSION.SDK_INT >= 18) {
            Bundle bundle = new Bundle();
            bundle.putBinder("com.bytedance.ee.bear.service.event_process.binder", new Binder());
            intent.putExtras(bundle);
        }
        intent.putExtra("com.bytedance.ee.bear.service.callback.class", cls.getName());
        intent.putExtra("com.bytedance.ee.bear.service.callback.key", str);
        f29390e.sendBroadcast(intent);
        C13479a.m54764b("CallbackManager", "send event:" + cls.getName());
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m45416a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static void m45423a(String str, int i, ProcessLifecycle.ProcessSate processSate) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("processName", str);
            jSONObject.put("processID", i);
            jSONObject.put("processSate", processSate);
            if (processSate == ProcessLifecycle.ProcessSate.DIED) {
                m45427b(ProcessLifecycle.class, jSONObject.toString());
            } else {
                m45421a((Class<?>) ProcessLifecycle.class, jSONObject.toString());
            }
        } catch (Exception e) {
            AbstractC10926b bVar = f29388c;
            if (bVar != null) {
                bVar.handlerError("CallbackManager", e);
            } else {
                C13479a.m54761a("CallbackManager", e);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.bytedance.ee.bear.service.callback.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> void m45424a(Map<Class<?>, List<C10925a>> map, final Class<T> cls, String str) {
        List<C10925a> list = map.get(cls);
        if (list != null) {
            for (final C10925a aVar : list) {
                final Object parseObject = JSON.parseObject(str, cls);
                if (parseObject == null) {
                    AbstractC10926b bVar = f29388c;
                    if (bVar != null) {
                        bVar.handlerError("CallbackManager", new Throwable("callback error:" + cls + " value:" + str));
                        return;
                    }
                    C13479a.m54758a("CallbackManager", "callback error:" + cls + " value:" + str);
                    return;
                }
                if (aVar.f29409b) {
                    BearExecutors.m48468c().execute(new Runnable() {
                        /* class com.bytedance.ee.bear.service.callback.C10918a.RunnableC109245 */

                        public void run() {
                            aVar.f29408a.callback(cls, parseObject);
                        }
                    });
                } else {
                    aVar.f29408a.callback(cls, parseObject);
                }
                if (aVar.f29410c) {
                    m45426b(cls, aVar.f29408a);
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> void m45419a(Class<T> cls, AbstractC10927c<T> cVar, boolean z, boolean z2) {
        synchronized (cls) {
            Map<Class<?>, List<C10925a>> map = f29386a;
            List<C10925a> list = map.get(cls);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                map.put(cls, list);
            }
            for (C10925a aVar : list) {
                if (aVar.f29408a == cVar) {
                    return;
                }
            }
            C10925a aVar2 = new C10925a(null);
            aVar2.f29408a = cVar;
            aVar2.f29409b = z;
            aVar2.f29410c = z2;
            list.add(aVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r3 = r3.getBinder("com.bytedance.ee.bear.service.event_process.binder");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45422a(java.lang.Class<?> r3, final java.lang.String r4, final int r5, android.content.Intent r6) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.service.callback.C10918a.m45422a(java.lang.Class, java.lang.String, int, android.content.Intent):void");
    }

    /* renamed from: a */
    public static void m45425a(Map<Class<?>, List<Object>> map, Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) throws Exception {
        List<Object> list = map.get(cls);
        if (list != null) {
            for (Object obj : list) {
                Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, objArr);
            }
        }
    }
}
