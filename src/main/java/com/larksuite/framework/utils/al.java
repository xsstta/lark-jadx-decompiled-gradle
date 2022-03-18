package com.larksuite.framework.utils;

import com.ss.android.lark.log.Log;
import java.util.HashMap;

public class al {

    /* renamed from: a */
    private HashMap<String, Object> f64851a;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.al$a */
    public static class C26261a {

        /* renamed from: a */
        public static final al f64852a = new al();
    }

    /* renamed from: a */
    public static final al m95028a() {
        return C26261a.f64852a;
    }

    private al() {
        this.f64851a = new HashMap<>();
    }

    /* renamed from: b */
    private void m95029b() {
        int size = this.f64851a.size();
        if (size > 10) {
            Log.m165383e("TransmitHelper", "Transmit Too Many items: " + size);
        } else if (size > 1) {
            Log.m165397w("TransmitHelper", "Transmit over ONE item: " + size);
        }
    }

    /* renamed from: a */
    public Object mo93365a(String str) {
        return this.f64851a.remove(str);
    }

    /* renamed from: a */
    public void mo93366a(String str, Object obj) {
        this.f64851a.put(str, obj);
        m95029b();
    }
}
