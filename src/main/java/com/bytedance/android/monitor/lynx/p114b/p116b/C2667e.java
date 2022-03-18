package com.bytedance.android.monitor.lynx.p114b.p116b;

import android.text.TextUtils;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitor.lynx.b.b.e */
public class C2667e {

    /* renamed from: a */
    private Map<View, Map<String, Boolean>> f8498a = new WeakHashMap();

    /* renamed from: a */
    public void mo11541a(View view, String str) {
        if (view != null && !TextUtils.isEmpty(str)) {
            Map<String, Boolean> map = this.f8498a.get(view);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.f8498a.put(view, map);
            }
            map.put(str, true);
        }
    }

    /* renamed from: b */
    public boolean mo11542b(View view, String str) {
        Map<String, Boolean> map;
        Boolean bool;
        if (view == null || TextUtils.isEmpty(str) || (map = this.f8498a.get(view)) == null || (bool = map.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
