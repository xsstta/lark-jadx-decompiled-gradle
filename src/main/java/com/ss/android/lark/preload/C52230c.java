package com.ss.android.lark.preload;

import com.ss.android.lark.preload.moment.AbstractC52236a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.preload.c */
public class C52230c {

    /* renamed from: c */
    private static final Object f129574c = new Object();

    /* renamed from: a */
    public ExecutorService f129575a;

    /* renamed from: b */
    public Map<AbstractC52220a, Object> f129576b;

    /* renamed from: d */
    private AbstractC52236a f129577d;

    /* renamed from: e */
    private AbstractC52236a.AbstractC52237a f129578e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.preload.c$a */
    public static class C52234a {

        /* renamed from: a */
        static C52230c f129583a = new C52230c();
    }

    /* renamed from: a */
    public static C52230c m202604a() {
        return C52234a.f129583a;
    }

    private C52230c() {
        this.f129576b = new ConcurrentHashMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.preload.c$2 */
    public static /* synthetic */ class C522332 {

        /* renamed from: a */
        static final /* synthetic */ int[] f129582a;

        static {
            int[] iArr = new int[PreloadType.values().length];
            f129582a = iArr;
            try {
                iArr[PreloadType.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo178811a(AbstractC52220a aVar, PreloadType preloadType) {
        if (C522332.f129582a[preloadType.ordinal()] == 1) {
            this.f129576b.put(aVar, f129574c);
        }
    }

    /* renamed from: a */
    public void mo178812a(AbstractC52236a aVar, ExecutorService executorService) {
        this.f129577d = aVar;
        aVar.mo103068a();
        this.f129575a = executorService;
        C522311 r1 = new AbstractC52236a.AbstractC52237a() {
            /* class com.ss.android.lark.preload.C52230c.C522311 */

            @Override // com.ss.android.lark.preload.moment.AbstractC52236a.AbstractC52237a
            /* renamed from: a */
            public void mo178813a() {
                Iterator<Map.Entry<AbstractC52220a, Object>> it = C52230c.this.f129576b.entrySet().iterator();
                while (it.hasNext()) {
                    final Map.Entry<AbstractC52220a, Object> next = it.next();
                    C52230c.this.f129575a.execute(new Runnable() {
                        /* class com.ss.android.lark.preload.C52230c.C522311.RunnableC522321 */

                        public void run() {
                            ((AbstractC52220a) next.getKey()).doPreload();
                        }
                    });
                    it.remove();
                }
            }
        };
        this.f129578e = r1;
        this.f129577d.mo103069a(r1);
    }
}
