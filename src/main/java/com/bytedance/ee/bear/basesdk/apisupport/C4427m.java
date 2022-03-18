package com.bytedance.ee.bear.basesdk.apisupport;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.api.AbstractC4388l;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.m */
final class C4427m implements AbstractC4388l {

    /* renamed from: a */
    private final AbstractC4431q f13060a;

    /* renamed from: b */
    private final AbstractC4388l f13061b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public void mo17070a() {
        C13479a.m54764b("Apisupport", "api call: destroy");
        this.f13061b.mo17070a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public ExtensionActivityImpl mo17069a(AppCompatActivity appCompatActivity) {
        C13479a.m54764b("Apisupport", "api call: createDocumentActivityExtensions");
        return this.f13061b.mo17069a(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public void mo17071a(Context context) {
        C13479a.m54764b("Apisupport", "api call: preload");
        this.f13061b.mo17071a(context);
    }

    C4427m(AbstractC4431q qVar, AbstractC4388l lVar) {
        this.f13060a = qVar;
        this.f13061b = lVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4388l
    /* renamed from: a */
    public Fragment mo17068a(Context context, String str, boolean z, AbstractC5415a aVar) {
        C13479a.m54764b("Apisupport", "api call: createFollowableFragment");
        return this.f13061b.mo17068a(context, str, z, aVar);
    }
}
