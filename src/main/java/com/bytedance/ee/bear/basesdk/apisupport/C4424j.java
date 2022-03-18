package com.bytedance.ee.bear.basesdk.apisupport;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.OnlineOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drivesdk.PreviewType;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.j */
final class C4424j implements AbstractC4385i {

    /* renamed from: a */
    private final AbstractC4431q f13054a;

    /* renamed from: b */
    private final AbstractC4385i f13055b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public Fragment mo17055a(LocalOpenEntity localOpenEntity) {
        C13479a.m54764b("Apisupport", "api call: getLocalPreviewFragment");
        this.f13054a.mo17158a();
        return this.f13055b.mo17055a(localOpenEntity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17059a(OnlineOpenEntity onlineOpenEntity) {
        C13479a.m54764b("Apisupport", "api call: openPreview");
        this.f13054a.mo17158a();
        this.f13055b.mo17059a(onlineOpenEntity);
    }

    C4424j(AbstractC4431q qVar, AbstractC4385i iVar) {
        this.f13054a = qVar;
        this.f13055b = iVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public PreviewType mo17056a(String str, String str2) {
        C13479a.m54764b("Apisupport", "api call: getPreviewType");
        this.f13054a.mo17158a();
        return this.f13055b.mo17056a(str, str2);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17057a(Context context, BaseOpenEntity baseOpenEntity) {
        C13479a.m54764b("Apisupport", "api call: openPreview");
        this.f13054a.mo17158a();
        this.f13055b.mo17057a(context, baseOpenEntity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17058a(Context context, LocalOpenEntity localOpenEntity) {
        C13479a.m54764b("Apisupport", "api call: openLocalPreview");
        this.f13054a.mo17158a();
        this.f13055b.mo17058a(context, localOpenEntity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17060a(String str, PreviewAction previewAction) {
        C13479a.m54764b("Apisupport", "api call: execPreviewAction");
        this.f13054a.mo17158a();
        this.f13055b.mo17060a(str, previewAction);
    }
}
