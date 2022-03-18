package com.bytedance.ee.bear.wikiv2.home.banner;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.home.C12267b;
import com.bytedance.ee.bear.wikiv2.home.WikiHomeViewModel;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.banner.b */
public class C12271b extends BaseBannerModel<C12277g> {

    /* renamed from: c */
    private int f32961c = 3;

    /* renamed from: d */
    private WikiHomeViewModel f32962d;

    /* renamed from: e */
    private boolean f32963e;

    /* renamed from: m */
    public boolean mo46839m() {
        return this.f32963e;
    }

    /* renamed from: l */
    public C12277g mo33085b() {
        return new C12277g();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: c */
    public LiveData<ArrayList<Document>> mo33086c() {
        return ((C12277g) mo33080a()).mo46847b();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: f */
    public boolean mo33089f() {
        if (mo33088e() == null || mo33088e().size() <= this.f32961c) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: g */
    public C8277e mo33090g() {
        if (C12267b.m51040a()) {
            return new WikiSpaceListParserV2();
        }
        return new WikiSpaceListParser();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: d */
    public void mo33087d() {
        mo33082a(((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(mo33090g()).mo20141a(mo33091h()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.banner.$$Lambda$b$EZ47Y6WlAxrhsQ8r9NXurgnHRJ4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12271b.this.m51056a((C12271b) ((DocumentListInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.banner.$$Lambda$b$PgWBOMgt_FSB9TZxHOKXT0Wsd4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12271b.this.m51057a((C12271b) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: h */
    public NetService.C5076e mo33091h() {
        if (!C12267b.m51040a()) {
            return new NetService.C5077f("/space/api/wiki/v2/space/get_all_space/");
        }
        NetService.C5077f fVar = new NetService.C5077f("/space/api/wiki/v2/space/get/");
        fVar.mo20145a("size", String.valueOf(40));
        fVar.mo20145a("last_label", "");
        return fVar;
    }

    /* renamed from: b */
    public void mo46837b(int i) {
        this.f32961c = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51057a(Throwable th) throws Exception {
        this.f32963e = false;
        C13479a.m54761a("WikiBannerModel", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51056a(DocumentListInfo documentListInfo) throws Exception {
        this.f32963e = true;
        ArrayList<Document> documentList = documentListInfo.getDocumentList();
        mo33083a(documentList);
        WikiHomeViewModel dVar = this.f32962d;
        if (dVar != null) {
            dVar.getBannerList().mo5926a(documentList);
        }
    }

    public C12271b(Context context, C10917c cVar) {
        super(cVar);
        mo33081a(Integer.MAX_VALUE);
        if (context instanceof FragmentActivity) {
            this.f32962d = WikiHomeViewModel.get((FragmentActivity) context);
        }
    }
}
