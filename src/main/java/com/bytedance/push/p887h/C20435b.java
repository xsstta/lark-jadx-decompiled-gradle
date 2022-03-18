package com.bytedance.push.p887h;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.push.PushBody;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.h.b */
public class C20435b implements AbstractC20434a {

    /* renamed from: a */
    private final Map<Long, Pair<PushBody, Integer>> f49932a = new ConcurrentHashMap();

    @Override // com.bytedance.push.p887h.AbstractC20434a
    /* renamed from: a */
    public int mo68894a(PushBody pushBody) {
        Pair<PushBody, Integer> pair;
        if (pushBody == null || (pair = this.f49932a.get(Long.valueOf(pushBody.f49734b))) == null) {
            return 0;
        }
        return ((Integer) pair.second).intValue();
    }

    @Override // com.bytedance.push.p887h.AbstractC20434a
    /* renamed from: a */
    public PushBody mo68895a(long j) {
        Pair<PushBody, Integer> pair = this.f49932a.get(Long.valueOf(j));
        if (pair != null) {
            return (PushBody) pair.first;
        }
        return null;
    }

    @Override // com.bytedance.push.p887h.AbstractC20434a
    /* renamed from: a */
    public boolean mo68897a(String str) {
        for (Map.Entry<Long, Pair<PushBody, Integer>> entry : this.f49932a.entrySet()) {
            Pair<PushBody, Integer> value = entry.getValue();
            if (!(value == null || value.first == null || !TextUtils.equals(((PushBody) value.first).f49743k.toString(), str))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.push.p887h.AbstractC20434a
    /* renamed from: a */
    public void mo68896a(PushBody pushBody, int i) {
        this.f49932a.put(Long.valueOf(pushBody.f49734b), new Pair<>(pushBody, Integer.valueOf(i)));
    }
}
