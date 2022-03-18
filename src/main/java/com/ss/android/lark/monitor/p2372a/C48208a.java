package com.ss.android.lark.monitor.p2372a;

import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.a.a */
public final class C48208a {

    /* renamed from: a */
    private String f121317a = "unknown";

    /* renamed from: b */
    private long f121318b = -1;

    /* renamed from: c */
    private int f121319c = -1;

    /* renamed from: d */
    private int f121320d = -1;

    /* renamed from: e */
    private final ConcurrentLinkedQueue<C48210a> f121321e = new ConcurrentLinkedQueue<>();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.monitor.a.a$a */
    public static final class C48210a {

        /* renamed from: a */
        public String f121322a;

        /* renamed from: b */
        public long f121323b;

        /* renamed from: c */
        public int f121324c;

        /* renamed from: d */
        public String f121325d;

        private C48210a() {
            this.f121322a = "unknown";
            this.f121323b = -1;
            this.f121324c = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo168680a() {
        this.f121319c = ((int) (System.nanoTime() - this.f121318b)) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo168682b() {
        this.f121320d = ((int) (System.nanoTime() - this.f121318b)) / 1000000;
    }

    C48208a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final JSONObject mo168684c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_name", this.f121317a);
            jSONObject.put("page_show", this.f121319c);
            jSONObject.put("page_complete", this.f121320d);
            JSONArray jSONArray = new JSONArray();
            while (!this.f121321e.isEmpty()) {
                C48210a remove = this.f121321e.remove();
                if (remove.f121324c != -1) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("span_name", remove.f121322a);
                    jSONObject2.put("span_time", remove.f121324c);
                    jSONObject2.put("span_thread", remove.f121325d);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("span", jSONArray.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo168681a(String str) {
        this.f121318b = System.nanoTime();
        this.f121317a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo168683b(String str) {
        Iterator<C48210a> it = this.f121321e.iterator();
        while (it.hasNext()) {
            if (it.next().f121322a.equals(str)) {
                return;
            }
        }
        C48210a aVar = new C48210a();
        aVar.f121322a = str;
        aVar.f121323b = System.nanoTime();
        aVar.f121325d = Thread.currentThread().getName();
        this.f121321e.offer(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo168685c(String str) {
        C48210a aVar;
        Iterator<C48210a> it = this.f121321e.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f121322a.equals(str)) {
                break;
            }
        }
        if (aVar == null) {
            Log.m165379d("PageLoadMonitor", "Trying to end a span which not started: " + this.f121317a + "/" + str);
            return;
        }
        aVar.f121324c = ((int) (System.nanoTime() - aVar.f121323b)) / 1000000;
        if (!aVar.f121325d.equals(Thread.currentThread().getName())) {
            Log.m165379d("PageLoadMonitor", "Trying to end a span in different thread against pageSpanStart: " + Thread.currentThread().getName() + "/" + aVar.f121325d);
        }
    }
}
