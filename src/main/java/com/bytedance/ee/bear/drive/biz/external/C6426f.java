package com.bytedance.ee.bear.drive.biz.external;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.external.AbstractC6412a;
import com.bytedance.ee.bear.drive.biz.permission.C6518e;
import com.bytedance.ee.bear.drive.biz.permission.model.ThirdPartyAttachmentPermission;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.external.f */
public class C6426f implements AbstractC6412a {

    /* renamed from: a */
    private C6518e f17766a = new C6518e((NetService) KoinJavaComponent.m268610a(NetService.class));

    public C6426f(C10917c cVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25817a(AbstractC6412a.AbstractC6413a aVar, ThirdPartyAttachmentPermission thirdPartyAttachmentPermission) throws Exception {
        if (thirdPartyAttachmentPermission.getExport() == 1) {
            aVar.mo25734a();
        } else {
            aVar.mo25735b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25818a(AbstractC6412a.AbstractC6413a aVar, Throwable th) throws Exception {
        aVar.mo25736c();
        C13479a.m54761a("DRIVE_PREVIEW_FLOW", th);
    }

    @Override // com.bytedance.ee.bear.drive.biz.external.AbstractC6412a
    /* renamed from: a */
    public void mo25733a(String str, String str2, String str3, AbstractC6412a.AbstractC6413a aVar) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "ThirdPartyExportPermissionChecker check");
        this.f17766a.mo26028a(str, "", str2, str3).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$f$7b3zRLrdwsMGfC9bkiMASjsBGxk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6426f.m25817a(AbstractC6412a.AbstractC6413a.this, (ThirdPartyAttachmentPermission) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$f$YRW4J6SZgiCeKSCpACu9ggWxyzY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6426f.m25818a(AbstractC6412a.AbstractC6413a.this, (Throwable) obj);
            }
        });
    }
}
