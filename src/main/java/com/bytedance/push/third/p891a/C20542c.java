package com.bytedance.push.third.p891a;

import android.content.Context;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.third.IPushAdapter;

/* renamed from: com.bytedance.push.third.a.c */
public class C20542c extends C20541b {

    /* renamed from: a */
    private Context f50104a;

    public C20542c(Context context) {
        this.f50104a = context;
    }

    @Override // com.bytedance.push.third.p891a.C20541b
    /* renamed from: a */
    public boolean mo69173a(IPushAdapter iPushAdapter, int i) {
        if (iPushAdapter == null || !iPushAdapter.isPushAvailable(this.f50104a, i) || PushSupporter.thirdService().getPushConfig(i) == null) {
            return false;
        }
        return true;
    }
}
