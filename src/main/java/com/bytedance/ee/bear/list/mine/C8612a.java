package com.bytedance.ee.bear.list.mine;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.C8377p;
import com.bytedance.ee.bear.list.folder.aq;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.mine.a */
public class C8612a extends BaseBannerModel<aq> {

    /* renamed from: c */
    private FolderSortStrategy f23367c;

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: g */
    public C8277e mo33090g() {
        return new C8377p("");
    }

    /* renamed from: l */
    public aq mo33085b() {
        return new aq("");
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: c */
    public LiveData<ArrayList<Document>> mo33086c() {
        return ((aq) mo33080a()).mo32739b();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: i */
    public AbstractC68307f<DocumentListInfo> mo33092i() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$a$1T5xWGZD_X_ptFHzTPf__qscl4k */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8612a.lambda$1T5xWGZD_X_ptFHzTPf__qscl4k(C8612a.this, (Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$a$JjynWwVSpH7pHSVXcjUDn__Nhg */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8612a.m269714lambda$JjynWwVSpH7pHSVXcjUDn__Nhg(C8612a.this, (Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: h */
    public NetService.C5076e mo33091h() {
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/folder/children/");
        fVar.mo20145a("need_path", "1");
        fVar.mo20145a("need_total", "1");
        fVar.mo20145a("length", "100");
        fVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(C8275a.f22370c.mo32555b()));
        FolderSortStrategy folderSortStrategy = this.f23367c;
        if (!(folderSortStrategy == null || folderSortStrategy.mo31549b() == -1)) {
            fVar.mo20145a("rank", String.valueOf(this.f23367c.mo31549b()));
            fVar.mo20145a("asc", String.valueOf(this.f23367c.mo31558e()));
        }
        return fVar;
    }

    public C8612a(C10917c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m35978a(Boolean bool) throws Exception {
        return super.mo33092i();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m35979b(Boolean bool) throws Exception {
        this.f23367c = ((aq) mo33080a()).mo32619a();
        return bool;
    }
}
