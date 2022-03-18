package com.bytedance.ee.bear.wiki.homepage.spacebanner;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.homepage.C11973d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacebanner.b */
public class C11987b extends BaseBannerModel<C11993g> {

    /* renamed from: c */
    private int f32375c = 3;

    /* renamed from: d */
    private C11973d f32376d;

    /* renamed from: e */
    private boolean f32377e;

    /* renamed from: m */
    public boolean mo45930m() {
        return this.f32377e;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: g */
    public C8277e mo33090g() {
        return new WikiSpaceListParser();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: h */
    public NetService.C5076e mo33091h() {
        return new NetService.C5077f("/api/wiki/space/get_all_space/");
    }

    /* renamed from: l */
    public C11993g mo33085b() {
        return new C11993g();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel
    /* renamed from: c */
    public LiveData<ArrayList<Document>> mo33086c() {
        return ((C11993g) mo33080a()).mo45937b();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: f */
    public boolean mo33089f() {
        if (mo33088e() == null || mo33088e().size() <= this.f32375c) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerModel, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel
    /* renamed from: d */
    public void mo33087d() {
        mo33082a(((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(mo33090g()).mo20141a(mo33091h()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacebanner.$$Lambda$b$JmwhyzKCAokS8CwbCRYM3b52hs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11987b.this.m49689a((C11987b) ((DocumentListInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacebanner.$$Lambda$b$Fn6vgY3FsUnD1SHDv09xfoyXr1Y */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11987b.this.m49690a((C11987b) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: b */
    public void mo45928b(int i) {
        this.f32375c = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49690a(Throwable th) throws Exception {
        this.f32377e = false;
        C13479a.m54761a("WikiBannerModel", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49689a(DocumentListInfo documentListInfo) throws Exception {
        this.f32377e = true;
        ArrayList<Document> documentList = documentListInfo.getDocumentList();
        mo33083a(documentList);
        C11973d dVar = this.f32376d;
        if (dVar != null) {
            dVar.getBannerList().mo5926a(documentList);
        }
    }

    public C11987b(Context context, C10917c cVar) {
        super(cVar);
        mo33081a(Integer.MAX_VALUE);
        if (context instanceof FragmentActivity) {
            this.f32376d = (C11973d) aj.m5366a((FragmentActivity) context).mo6005a(C11973d.class);
        }
    }
}
