package com.bytedance.ee.bear.drive.biz.external;

import com.bytedance.ee.bear.drive.biz.external.AbstractC6412a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.external.e */
public class C6425e implements AbstractC6412a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25815a(AbstractC6412a.AbstractC6413a aVar, Throwable th) throws Exception {
        aVar.mo25736c();
        C13479a.m54761a("DRIVE_PREVIEW_FLOW", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25814a(AbstractC6412a.AbstractC6413a aVar, IDocUserPermission iDocUserPermission) throws Exception {
        if (iDocUserPermission.canExport()) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", "open external fail, no export permission!!!");
            aVar.mo25734a();
            return;
        }
        aVar.mo25735b();
    }

    @Override // com.bytedance.ee.bear.drive.biz.external.AbstractC6412a
    /* renamed from: a */
    public void mo25733a(String str, String str2, String str3, AbstractC6412a.AbstractC6413a aVar) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "SpaceKitExportPermissionChecker check");
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36649b(str, C8275a.f22375h.mo32555b()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$e$BZpsY5Ai3wTvd_MBwvLCFTsTrGc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6425e.m25814a(AbstractC6412a.AbstractC6413a.this, (IDocUserPermission) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$e$I50_4YZ_pCbQpq1iblMXddG2cc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6425e.m25815a(AbstractC6412a.AbstractC6413a.this, (Throwable) obj);
            }
        });
    }
}
