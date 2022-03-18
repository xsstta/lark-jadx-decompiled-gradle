package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.a */
public class C9829a {

    /* renamed from: a */
    private NetService f26491a;

    /* renamed from: b */
    private C68289a f26492b = new C68289a();

    /* renamed from: a */
    public void mo37388a() {
        this.f26492b.mo237935a();
    }

    public C9829a(NetService netService) {
        this.f26491a = netService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m40635a(AbstractC10169g gVar, Throwable th) throws Exception {
        C13479a.m54761a("FolderPublicPermissionManager", th);
        gVar.mo17112a(th);
    }

    /* renamed from: b */
    public void mo37390b(String str, AbstractC10169g gVar, boolean z) {
        m40636a(str, false, ShareFolderPublicPermission.getLinkShareInternalReadPerm(), z, gVar);
    }

    /* renamed from: c */
    public void mo37391c(String str, AbstractC10169g gVar, boolean z) {
        m40636a(str, false, ShareFolderPublicPermission.getLinkShareInternalEditPerm(), z, gVar);
    }

    /* renamed from: d */
    public void mo37392d(String str, AbstractC10169g gVar, boolean z) {
        m40636a(str, true, ShareFolderPublicPermission.getLinkShareAnyonePerm(z), z, gVar);
    }

    /* renamed from: a */
    public void mo37389a(String str, AbstractC10169g gVar, boolean z) {
        m40636a(str, false, ShareFolderPublicPermission.getLinkShareClosePerm(), z, gVar);
    }

    /* renamed from: a */
    private void m40636a(String str, boolean z, int i, boolean z2, AbstractC10169g gVar) {
        String a = FolderPermissionManagerDispatcher.m41257a(str, i, z, z2);
        gVar.mo17110a();
        this.f26492b.mo237937a(FolderPermissionManagerDispatcher.m41256a(z2).mo37733a(a).mo238001b(new Consumer(i) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$a$3tRB17ZBrbkzZa9aRRb3189CYPQ */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9829a.lambda$3tRB17ZBrbkzZa9aRRb3189CYPQ(AbstractC10169g.this, this.f$1, (SimpleRequestResult) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$a$8GXSkMaPDvN8qU50Pn7f0_dLAxQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9829a.lambda$8GXSkMaPDvN8qU50Pn7f0_dLAxQ(AbstractC10169g.this, (Throwable) obj);
            }
        }));
    }
}
