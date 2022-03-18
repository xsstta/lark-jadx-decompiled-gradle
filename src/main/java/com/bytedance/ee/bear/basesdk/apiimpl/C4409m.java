package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.api.AbstractC4388l;
import com.bytedance.ee.bear.basesdk.business.follow.C4462a;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.m */
public class C4409m implements AbstractC4388l {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public void mo17070a() {
        C4462a.m18439a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public ExtensionActivityImpl mo17069a(AppCompatActivity appCompatActivity) {
        return C4462a.m18437a(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public void mo17071a(Context context) {
        C4462a.m18440a(context);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public Fragment mo17068a(Context context, String str, boolean z, AbstractC5415a aVar) {
        try {
            return C4462a.m18434a(context, str, z, aVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
