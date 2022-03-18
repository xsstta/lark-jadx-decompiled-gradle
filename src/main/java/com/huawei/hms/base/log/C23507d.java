package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* renamed from: com.huawei.hms.base.log.d */
public class C23507d implements AbstractC23505b {

    /* renamed from: a */
    public AbstractC23505b f57954a;

    @Override // com.huawei.hms.base.log.AbstractC23505b
    /* renamed from: a */
    public void mo82206a(Context context, String str) {
        AbstractC23505b bVar = this.f57954a;
        if (bVar != null) {
            bVar.mo82206a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.AbstractC23505b
    /* renamed from: a */
    public void mo82207a(String str, int i, String str2, String str3) {
        Log.println(i, "HMSSDK_" + str2, str3);
        AbstractC23505b bVar = this.f57954a;
        if (bVar != null) {
            bVar.mo82207a(str, i, str2, str3);
        }
    }
}
