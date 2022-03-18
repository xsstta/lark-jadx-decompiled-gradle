package com.bytedance.push.third.p891a;

import android.content.Context;
import com.bytedance.push.third.IPushAdapter;
import com.ss.android.message.p3002a.C59436a;

/* renamed from: com.bytedance.push.third.a.d */
public class C20543d extends C20541b {

    /* renamed from: a */
    private Context f50105a;

    public C20543d(Context context) {
        this.f50105a = context;
    }

    @Override // com.bytedance.push.third.p891a.C20541b
    /* renamed from: a */
    public boolean mo69173a(IPushAdapter iPushAdapter, int i) {
        if (iPushAdapter == null || !C59436a.m230729a(this.f50105a, "com.android.vending") || !C59436a.m230729a(this.f50105a, "com.google.android.gms")) {
            return false;
        }
        return true;
    }
}
