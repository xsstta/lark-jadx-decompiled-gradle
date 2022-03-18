package com.bytedance.push.third.p891a;

import android.content.Context;
import com.bytedance.push.third.IPushAdapter;

/* renamed from: com.bytedance.push.third.a.a */
public class C20540a extends C20541b {

    /* renamed from: a */
    private Context f50103a;

    public C20540a(Context context) {
        this.f50103a = context;
    }

    @Override // com.bytedance.push.third.p891a.C20541b
    /* renamed from: a */
    public boolean mo69173a(IPushAdapter iPushAdapter, int i) {
        if (iPushAdapter == null || !iPushAdapter.isPushAvailable(this.f50103a, i)) {
            return false;
        }
        return true;
    }
}
