package com.bytedance.ee.bear.drive.biz.p326a;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.document.docmetainfo.DocMetaInfoExecutor;
import com.bytedance.ee.bear.drive.biz.p326a.C6322a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6521a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DefaultDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68314f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.a.a */
public class C6322a {

    /* renamed from: a */
    private an f17525a;

    /* renamed from: com.bytedance.ee.bear.drive.biz.a.a$a */
    public interface AbstractC6323a {
        /* renamed from: a */
        void mo25420a(C6522b bVar);

        /* renamed from: a */
        void mo25421a(Throwable th);
    }

    public C6322a(an anVar) {
        this.f17525a = anVar;
    }

    /* renamed from: b */
    public AbstractC68307f<DocMoreInfo> mo25419b(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        return AbstractC68307f.m265094a(DocMetaInfoExecutor.f15945a.mo22562a(str2, C8275a.f22375h.mo32555b()), ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36642a(str, C8275a.f22375h.mo32555b()), ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31488a(str, C8275a.f22375h.mo32555b()), new AbstractC68314f(str2) {
            /* class com.bytedance.ee.bear.drive.biz.p326a.$$Lambda$a$__kOOw3dWzGUi1R83XX8L_GMQc */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.AbstractC68314f
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return C6322a.m269318lambda$__kOOw3dWzGUi1R83XX8L_GMQc(this.f$0, (DocMetaInfo) obj, (DocPermission) obj2, (DocVersion) obj3);
            }
        }).mo238010b(new DocMoreInfo());
    }

    /* renamed from: a */
    public AbstractC68307f<C6521a> mo25416a(String str) {
        return DocMetaInfoExecutor.f15945a.mo22562a(str, C8275a.f22375h.mo32555b()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.p326a.$$Lambda$a$a44aUYZQtHCkMzcdDV34OT4_q90 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6322a.lambda$a44aUYZQtHCkMzcdDV34OT4_q90(this.f$0, (DocMetaInfo) obj);
            }
        }).mo237985a(C11678b.m48481e());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m25404b(AbstractC6323a aVar, Throwable th) throws Exception {
        if (aVar != null) {
            aVar.mo25421a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C6521a m25399a(String str, DocMetaInfo docMetaInfo) throws Exception {
        return new C6521a(str, docMetaInfo.getTitle(), docMetaInfo.getCreatorUid(), docMetaInfo.getOwnerUid(), docMetaInfo.getCreateTime(), docMetaInfo.getCreatorName(), docMetaInfo.getCreatorTenantId(), docMetaInfo.isPined(), docMetaInfo.isStared(), docMetaInfo.getOwnerName());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25403a(AbstractC6323a aVar, Throwable th) throws Exception {
        C13479a.m54761a("DocInfoDataFetchExecutor", th);
        if (aVar != null) {
            aVar.mo25421a(th);
        }
    }

    /* renamed from: a */
    public void mo25417a(String str, AbstractC6323a aVar) {
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36642a(str, C8275a.f22375h.mo32555b()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.biz.p326a.$$Lambda$a$1mhOL2ziCzr_HUDIdWA7TLXKBIc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6322a.lambda$1mhOL2ziCzr_HUDIdWA7TLXKBIc(C6322a.AbstractC6323a.this, this.f$1, (DocPermission) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.p326a.$$Lambda$a$y9FM8M1vxpVFoJojx6_4BPaPwps */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6322a.lambda$y9FM8M1vxpVFoJojx6_4BPaPwps(C6322a.AbstractC6323a.this, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25401a(AbstractC6323a aVar, String str, DocPermission docPermission) throws Exception {
        if (aVar != null) {
            aVar.mo25420a(new C6522b(str, docPermission));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25402a(AbstractC6323a aVar, String str, IDocUserPermission iDocUserPermission) throws Exception {
        if (aVar != null) {
            aVar.mo25420a(new C6522b(str, new DocPermission(iDocUserPermission, new DefaultDocPublicPermission())));
        }
    }

    /* renamed from: a */
    public void mo25418a(String str, String str2, AbstractC6323a aVar) {
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36649b(str, C8275a.f22375h.mo32555b()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.biz.p326a.$$Lambda$a$IdFpskxoUrBkJe52wd6jM133uR8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6322a.lambda$IdFpskxoUrBkJe52wd6jM133uR8(C6322a.AbstractC6323a.this, this.f$1, (IDocUserPermission) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.p326a.$$Lambda$a$tWi3Q_3su2GDa6kIfW4THr2yIdM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6322a.lambda$tWi3Q_3su2GDa6kIfW4THr2yIdM(C6322a.AbstractC6323a.this, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocMoreInfo m25400a(String str, DocMetaInfo docMetaInfo, DocPermission docPermission, DocVersion docVersion) throws Exception {
        return new DocMoreInfo(C8275a.f22375h.mo32555b(), "", str, "", false, false, docMetaInfo, new DocObjInfo(), docPermission, docVersion, false, false);
    }
}
