package com.bytedance.ee.bear.list.more.itemv2;

import android.os.Bundle;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.C8370m;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.FolderMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.more.itemv2.e */
public class C8637e {

    /* renamed from: a */
    private final C10917c f23399a;

    /* renamed from: b */
    private final Document f23400b;

    /* renamed from: c */
    private final ShareFolderUserPermission f23401c;

    /* renamed from: d */
    private final Bundle f23402d;

    /* renamed from: e */
    private final C68289a f23403e = new C68289a();

    /* renamed from: a */
    public C1177w<IMoreInfo> mo33584a() {
        C1177w<IMoreInfo> wVar = new C1177w<>();
        IMoreInfo a = C8292f.m34124a(this.f23399a, this.f23400b);
        wVar.mo5929b(a);
        m36080a(wVar, a);
        return wVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36090a(FolderMoreInfo bVar, C1177w wVar, IMoreInfo dVar, ShareFolderUserPermission shareFolderUserPermission) throws Exception {
        C13479a.m54764b("MoreInfoProvider", "fetchShareFolderUserPermission()...success, permission = " + shareFolderUserPermission);
        bVar.mo39064a(shareFolderUserPermission);
        wVar.mo5929b(dVar);
        m36092a(dVar, this.f23402d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36087a(FolderMoreInfo bVar, C1177w wVar, DocumentListInfo documentListInfo) throws Exception {
        C13479a.m54764b("MoreInfoProvider", "pullFolderDetail()...success");
        if (!(documentListInfo == null || documentListInfo.getParent() == null)) {
            C13479a.m54764b("MoreInfoProvider", "pullFolderDetail()...isComplaint = " + documentListInfo.getParent().aq());
            this.f23400b.mo32474o(documentListInfo.getParent().aq());
        }
        bVar.mo39066e(false);
        wVar.mo5929b(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36091a(FolderMoreInfo bVar, C1177w wVar, Throwable th) throws Exception {
        C13479a.m54758a("MoreInfoProvider", "pullFolderDetail()...failed, throwable = " + th);
        if (C5203d.m21235a(th, 7)) {
            bVar.mo39066e(true);
            wVar.mo5929b(bVar);
        }
    }

    /* renamed from: a */
    private void m36093a(IMoreInfo dVar, C1177w<IMoreInfo> wVar, Document document) {
        this.f23403e.mo237937a(AbstractC68307f.m265092a(((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36642a(document.mo32472o(), document.mo32483t()), ((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20314a(document.mo32472o(), document.mo32483t(), false, false, true, "list_detail"), new BiFunction() {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$6KHd5QWRgLV96C4KECuQ_ggUVAw */

            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C8637e.m36079a(IMoreInfo.this, (DocPermission) obj, (DocObjInfo) obj2);
            }
        }).mo237985a(C11678b.m48479c()).mo238020d(new Function(dVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$txKpyZhOKYpXIsQ25bMxdzRVnVs */
            public final /* synthetic */ IMoreInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8637e.m36078a(Document.this, this.f$1, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(wVar, dVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$28nOduB0lnQ0t35zQLPDQAUoKo */
            public final /* synthetic */ C1177w f$1;
            public final /* synthetic */ IMoreInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.this.m36081a((C8637e) this.f$1, (C1177w) this.f$2, (IMoreInfo) ((Boolean) obj));
            }
        }, new Consumer(dVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$rwvThptUwDIMwNZOdsAvJZclNg */
            public final /* synthetic */ IMoreInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.this.m36095a((C8637e) this.f$1, (IMoreInfo) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36095a(IMoreInfo dVar, Throwable th) throws Exception {
        C13479a.m54759a("MoreInfoProvider", "getMoreLiveData updateDocSubscribed error:", th);
        m36092a(dVar, this.f23402d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36086a(DocMoreInfo aVar, C1177w wVar, Throwable th) throws Exception {
        C13479a.m54758a("MoreInfoProvider", "fetchDocPublicPermission()...failed, throwable = " + th);
        aVar.mo39034d(C5203d.m21235a(th, 1002) || C5203d.m21235a(th, 3));
        wVar.mo5929b(aVar);
    }

    /* renamed from: a */
    private void m36088a(FolderMoreInfo bVar, C1177w<IMoreInfo> wVar, Document document) {
        this.f23403e.mo237937a(m36077a(25, document.mo32475p()).mo238001b(new Consumer(wVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$Nj4D6FMqjrQbxKWsDQoNAJ9Xal8 */
            public final /* synthetic */ C1177w f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.m36089a(FolderMoreInfo.this, this.f$1, (IDocUserPermission) obj);
            }
        }, $$Lambda$e$Jg0h8v7d1BDymlCKpt3bwp7pjA4.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36089a(FolderMoreInfo bVar, C1177w wVar, IDocUserPermission iDocUserPermission) throws Exception {
        C13479a.m54764b("MoreInfoProvider", "requestFolderShortcutMoreInfo()...success, shortcut permission = " + iDocUserPermission);
        bVar.mo39063a(iDocUserPermission);
        wVar.mo5929b(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36096a(Throwable th) throws Exception {
        C13479a.m54758a("MoreInfoProvider", "requestFolderShortcutMoreInfo()...error = " + th);
    }

    /* renamed from: a */
    private void m36092a(IMoreInfo dVar, Bundle bundle) {
        String string = bundle.getString("module", "");
        String string2 = bundle.getString("sub_module", "");
        String string3 = bundle.getString("container_type", "");
        ListAnalysis.m32515a(string, string2, dVar.mo39041h(), dVar.mo39036e(), dVar.mo39038f(), bundle.getString("container_id", ""), string3, FolderVersion.isShareFolder(this.f23400b.an(), this.f23400b.ap()), dVar.mo39035d());
    }

    /* renamed from: b */
    private ShareFolderUserPermission m36097b() {
        ShareFolderUserPermission shareFolderUserPermission = new ShareFolderUserPermission();
        shareFolderUserPermission.setPermissions(2);
        return shareFolderUserPermission;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36101c(Throwable th) throws Exception {
        C13479a.m54758a("MoreInfoProvider", "fetchShortcutUserPermission()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36100b(Throwable th) throws Exception {
        C13479a.m54758a("MoreInfoProvider", "fetchDocUserPermission()...error = " + th);
    }

    /* renamed from: a */
    private AbstractC68307f<IDocUserPermission> m36077a(int i, String str) {
        return ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36649b(str, i);
    }

    /* renamed from: b */
    private AbstractC68307f<IDocPublicPermission> m36098b(int i, String str) {
        return ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36652c(str, i);
    }

    /* renamed from: a */
    private void m36080a(C1177w<IMoreInfo> wVar, IMoreInfo dVar) {
        String str;
        if (dVar instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) dVar;
            aVar.mo39022a(this.f23401c);
            if (aVar.mo39010F()) {
                m36083a(aVar, wVar, this.f23400b);
                m36092a(aVar, this.f23402d);
            } else if (!C4211a.m17514a().mo16536a("spacekit.mobile.more_subscribe_enable", false) || !(this.f23400b.mo32483t() == 2 || (this.f23400b.mo32483t() == 16 && this.f23400b.ak() == 2))) {
                Disposable b = ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36642a(this.f23400b.mo32472o(), this.f23400b.mo32483t()).mo238001b(new Consumer(wVar) {
                    /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$L5lJ2rLbBpGmzgiC0Xzx3WgzqTY */
                    public final /* synthetic */ C1177w f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C8637e.m36094a(IMoreInfo.this, this.f$1, (DocPermission) obj);
                    }
                }, $$Lambda$e$8z_hNvZqnKug8yk0YLeaasiJo4.INSTANCE);
                m36092a(aVar, this.f23402d);
                this.f23403e.mo237937a(b);
            } else {
                m36093a(dVar, wVar, this.f23400b);
            }
        } else if (dVar instanceof FolderMoreInfo) {
            FolderMoreInfo bVar = (FolderMoreInfo) dVar;
            if (this.f23400b.an() == FolderVersion.getPersonalFolderOwnerType()) {
                bVar.mo39064a(m36097b());
                wVar.mo5929b(bVar);
                m36092a(dVar, this.f23402d);
            } else {
                if (FolderVersion.isShareFolderV2(this.f23400b.an())) {
                    str = this.f23400b.mo32472o();
                } else {
                    str = this.f23400b.mo32399O();
                }
                this.f23403e.mo237937a(((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36653c(str, new FolderVersion(this.f23400b.an(), this.f23400b.mo32397M(), this.f23400b.ap()), this.f23400b.mo32402R()).mo238001b(new Consumer(bVar, wVar, dVar) {
                    /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$bNH8mX6MPWla_yBhvnZfbDOPAA */
                    public final /* synthetic */ FolderMoreInfo f$1;
                    public final /* synthetic */ C1177w f$2;
                    public final /* synthetic */ IMoreInfo f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C8637e.this.m36090a(this.f$1, this.f$2, this.f$3, (ShareFolderUserPermission) obj);
                    }
                }, new Consumer(wVar, dVar) {
                    /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$21mQ4qkwZ1PGDjXWroQxU05nfR0 */
                    public final /* synthetic */ C1177w f$1;
                    public final /* synthetic */ IMoreInfo f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C8637e.this.m36082a((C8637e) this.f$1, (C1177w) this.f$2, (IMoreInfo) ((Throwable) obj));
                    }
                }));
            }
            if (bVar.mo39010F()) {
                m36088a(bVar, wVar, this.f23400b);
            }
            this.f23403e.mo237937a(C8370m.m34649a(this.f23400b.mo32472o(), this.f23400b.an()).mo238001b(new Consumer(bVar, wVar) {
                /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$gWhpbQ3Zgmm2jXMnC6quFWHWho */
                public final /* synthetic */ FolderMoreInfo f$1;
                public final /* synthetic */ C1177w f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8637e.this.m36087a((C8637e) this.f$1, (FolderMoreInfo) this.f$2, (C1177w) ((DocumentListInfo) obj));
                }
            }, new Consumer(wVar) {
                /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$BjXJD2zPCS4ryeePh5dLOKZzU */
                public final /* synthetic */ C1177w f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8637e.m36091a(FolderMoreInfo.this, this.f$1, (Throwable) obj);
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36094a(IMoreInfo dVar, C1177w wVar, DocPermission docPermission) throws Exception {
        dVar.mo39019a(docPermission);
        wVar.mo5929b(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m36078a(Document document, IMoreInfo dVar, Boolean bool) throws Exception {
        C8153a.m32844b().mo31612c(document.mo32472o(), dVar.mo39035d());
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m36079a(IMoreInfo dVar, DocPermission docPermission, DocObjInfo docObjInfo) throws Exception {
        dVar.mo39019a(docPermission);
        dVar.mo39024a(docObjInfo.isSubscribed());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36099b(DocMoreInfo aVar, C1177w wVar, IDocUserPermission iDocUserPermission) throws Exception {
        C13479a.m54764b("MoreInfoProvider", "fetchShortcutUserPermission()...success, shortcut permission = " + iDocUserPermission);
        aVar.mo39027b(iDocUserPermission);
        wVar.mo5929b(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36081a(C1177w wVar, IMoreInfo dVar, Boolean bool) throws Exception {
        wVar.mo5929b(dVar);
        m36092a(dVar, this.f23402d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36082a(C1177w wVar, IMoreInfo dVar, Throwable th) throws Exception {
        C13479a.m54758a("MoreInfoProvider", "fetchShareFolderUserPermission()...failed, throwable = " + th);
        wVar.mo5929b(dVar);
        m36092a(dVar, this.f23402d);
    }

    /* renamed from: a */
    private void m36083a(DocMoreInfo aVar, C1177w<IMoreInfo> wVar, Document document) {
        this.f23403e.mo237937a(m36077a(25, document.mo32475p()).mo238001b(new Consumer(wVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$YzKi_SrsEOb5KovLAd4maSiqOAw */
            public final /* synthetic */ C1177w f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.m36099b(DocMoreInfo.this, this.f$1, (IDocUserPermission) obj);
            }
        }, $$Lambda$e$JA7m_z_oOZDosDplghhOIqxI8AM.INSTANCE));
        this.f23403e.mo237937a(m36077a(document.mo32483t(), document.mo32472o()).mo238001b(new Consumer(wVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$ionUetjtjULsL5iabvulLUDbroE */
            public final /* synthetic */ C1177w f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.m36085a(DocMoreInfo.this, this.f$1, (IDocUserPermission) obj);
            }
        }, $$Lambda$e$giO_JrL8XyzoU47FUg3V26c8fo.INSTANCE));
        this.f23403e.mo237937a(m36098b(document.mo32483t(), document.mo32472o()).mo238001b(new Consumer(wVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$ihblY3fJlDhcclxZD0Rxz0Uc4 */
            public final /* synthetic */ C1177w f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.m36084a(DocMoreInfo.this, this.f$1, (IDocPublicPermission) obj);
            }
        }, new Consumer(wVar) {
            /* class com.bytedance.ee.bear.list.more.itemv2.$$Lambda$e$zXHyAp37Mu96kLr0yfCTbsaEgE */
            public final /* synthetic */ C1177w f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8637e.m36086a(DocMoreInfo.this, this.f$1, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36084a(DocMoreInfo aVar, C1177w wVar, IDocPublicPermission iDocPublicPermission) throws Exception {
        C13479a.m54764b("MoreInfoProvider", "fetchDocPublicPermission()...success, docPublicPermission = " + iDocPublicPermission);
        aVar.mo39034d(false);
        aVar.mo39020a(iDocPublicPermission);
        wVar.mo5929b(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36085a(DocMoreInfo aVar, C1177w wVar, IDocUserPermission iDocUserPermission) throws Exception {
        C13479a.m54764b("MoreInfoProvider", "fetchDocUserPermission()...success, doc permission = " + iDocUserPermission);
        aVar.mo39021a(iDocUserPermission);
        wVar.mo5929b(aVar);
    }

    public C8637e(C10917c cVar, Document document, Bundle bundle, ShareFolderUserPermission shareFolderUserPermission) {
        this.f23399a = cVar;
        this.f23400b = document;
        this.f23402d = bundle;
        this.f23401c = shareFolderUserPermission;
    }
}
