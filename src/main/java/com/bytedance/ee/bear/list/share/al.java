package com.bytedance.ee.bear.list.share;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.p3511d.AbstractC70020b;

public class al extends BaseBannerModel<C8712ae> implements AbstractC8737l {

    /* renamed from: c */
    private boolean f23569c;

    /* renamed from: d */
    private boolean f23570d = true;

    /* renamed from: e */
    private FolderSortStrategy f23571e;

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: g */
    public C8277e mo33090g() {
        return new C8713af();
    }

    /* renamed from: l */
    public C8712ae mo33085b() {
        return new C8712ae();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: c */
    public LiveData<ArrayList<Document>> mo33086c() {
        return ((C8712ae) mo33080a()).mo33766b();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: f */
    public boolean mo33089f() {
        if (super.mo33089f() || this.f23569c) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: d */
    public void mo33087d() {
        if (!C5084ad.m20847d().mo20038b().mo20041b()) {
            C13479a.m54764b("SharedBannerModel", "getListFromNet()...no net");
            this.f23569c = false;
            this.f23570d = true;
            return;
        }
        mo33082a(mo33092i().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$al$D6zZ6TmtxFgbz1oXsFmwZQjA4GU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                al.lambda$D6zZ6TmtxFgbz1oXsFmwZQjA4GU(al.this, (DocumentListInfo) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$al$ZB7zxVF9P47bg5Qp_YGlvb2fl8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                al.m269762lambda$ZB7zxVF9P47bg5Qp_YGlvb2fl8(al.this, (Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: h */
    public NetService.C5076e mo33091h() {
        NetService.C5077f fVar = new NetService.C5077f(C8292f.m34128a());
        fVar.mo20145a("hidden", "0");
        FolderSortStrategy folderSortStrategy = this.f23571e;
        if (!(folderSortStrategy == null || folderSortStrategy.mo31549b() == -1)) {
            fVar.mo20145a("rank", String.valueOf(this.f23571e.mo31549b()));
            fVar.mo20145a("asc", String.valueOf(this.f23571e.mo31558e()));
        }
        return fVar;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: i */
    public AbstractC68307f<DocumentListInfo> mo33092i() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$al$Vx1FpJJ1XVeFqn78MwTSaN9EHDk */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return al.lambda$Vx1FpJJ1XVeFqn78MwTSaN9EHDk(al.this, (Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$al$Sigf1KopEufKaWDP_TUWXAeDYkY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return al.lambda$Sigf1KopEufKaWDP_TUWXAeDYkY(al.this, (Boolean) obj);
            }
        });
    }

    public al(C10917c cVar) {
        super(cVar);
        mo33081a(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m36547a(Boolean bool) throws Exception {
        return super.mo33092i();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m36550b(Boolean bool) throws Exception {
        this.f23571e = ((C8712ae) mo33080a()).mo32619a();
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36548a(DocumentListInfo documentListInfo) throws Exception {
        this.f23569c = documentListInfo.isHas_hidden();
        this.f23570d = documentListInfo.isAll_visited();
        mo33083a(documentListInfo.getDocumentList());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36549a(Throwable th) throws Exception {
        C13479a.m54761a("SharedBannerModel", th);
        this.f23569c = false;
        this.f23570d = true;
    }
}
