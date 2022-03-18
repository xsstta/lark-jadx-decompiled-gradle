package com.bytedance.ee.bear.document.p302c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.document.p302c.C5683b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.document.c.b */
public class C5683b {

    /* renamed from: a */
    private static Map<String, Queue<View>> f16057a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Queue<C5684a> f16058b = new LinkedBlockingDeque();

    /* renamed from: c */
    private static volatile boolean f16059c = false;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m23042a() {
        if (f16058b.size() != 0) {
            f16059c = true;
            AbstractC68307f.m265098b(3, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo237978a(new Consumer() {
                /* class com.bytedance.ee.bear.document.p302c.$$Lambda$b$7LAgQBzyNm8zKuS2371EQ12i8 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5683b.m23044a(C5683b.C5684a.this, (Long) obj);
                }
            }, $$Lambda$b$LQ54zRifQDKH1dOl_Wt0muonZlw.INSTANCE, $$Lambda$b$xJOmNRowMXNTAjguqFDfJAiOCY0.INSTANCE);
            return;
        }
        f16059c = false;
    }

    /* renamed from: b */
    public static void m23048b(Context context) {
        C13479a.m54764b("DocumentViewCache", "clearViewCache");
        f16057a.clear();
        m23043a(context);
    }

    /* renamed from: a */
    public static synchronized void m23043a(Context context) {
        synchronized (C5683b.class) {
            C13479a.m54764b("DocumentViewCache", "prepareViewCache");
            if (context != null) {
                for (Map.Entry<String, C5682a> entry : C5685c.m23052a().entrySet()) {
                    String key = entry.getKey();
                    if (!DocOpenConfig.m22765f()) {
                        m23049b(context, key);
                    } else if (TextUtils.equals(key, C8275a.f22371d.mo32553a()) || TextUtils.equals(key, C8275a.f22372e.mo32553a())) {
                        m23049b(context, key);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.c.b$a */
    public static class C5684a {

        /* renamed from: a */
        public Context f16060a;

        /* renamed from: b */
        public String f16061b;

        C5684a(Context context, String str) {
            this.f16060a = context;
            this.f16061b = str;
        }
    }

    /* renamed from: a */
    public static View m23041a(Context context, String str) {
        View view;
        C13479a.m54764b("DocumentViewCache", "popViewCache " + str);
        Queue<View> queue = f16057a.get(str);
        if (queue != null) {
            view = queue.poll();
        } else {
            view = null;
        }
        m23049b(context.getApplicationContext(), str);
        return view;
    }

    /* renamed from: b */
    private static void m23049b(Context context, String str) {
        C13479a.m54764b("DocumentViewCache", "DocumentViewCache  reCreate : " + str);
        f16058b.offer(new C5684a(context, str));
        if (!f16059c) {
            m23042a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23044a(C5684a aVar, Long l) throws Exception {
        int i;
        Queue<View> queue = f16057a.get(aVar.f16061b);
        if (queue != null) {
            i = queue.size();
        } else {
            i = 0;
        }
        int i2 = 2 - i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                m23045a(aVar.f16061b, C5685c.m23050a(aVar.f16060a, new FrameLayout(aVar.f16060a), C5685c.m23052a().get(aVar.f16061b)));
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m23045a(String str, View view) {
        Queue<View> queue = f16057a.get(str);
        if (queue == null) {
            synchronized (C5683b.class) {
                queue = f16057a.get(str);
                if (queue == null) {
                    queue = new LinkedBlockingDeque<>(2);
                    f16057a.put(str, queue);
                }
            }
        }
        if (!queue.contains(view)) {
            queue.offer(view);
        }
    }
}
