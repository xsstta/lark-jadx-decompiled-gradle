package com.bytedance.ee.bear.list.share;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

public class am extends BaseBannerPresenter<IBannerContract.IModel, IBannerContract.IView<IBannerContract.IView.Delegate>, IBannerContract.IView.Delegate> {
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: g */
    public String mo33106g() {
        return "shared_folder";
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: h */
    public String mo33107h() {
        return "?from=tab_share_folder";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ IModel getModel() {
        return super.mo33112m();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ IView getView() {
        return super.mo33113n();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: i */
    public void mo33108i() {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/share/activity").mo17317a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ void setModel(IModel iModel) {
        super.mo33098a((IBannerContract.IModel) iModel);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ void setView(IView iView) {
        super.mo33099a((IBannerContract.IView) iView);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: a */
    public void mo33100a(ArrayList<Document> arrayList) {
        boolean z;
        mo33112m().mo33084a(arrayList);
        IBannerContract.IView n = mo33113n();
        if (C13657b.m55423b(mo33112m().mo33088e()) || mo33112m().mo33089f()) {
            z = true;
        } else {
            z = false;
        }
        n.mo33125b(z);
        mo33113n().mo33123a(mo33112m().mo33089f());
        mo33113n().mo33122a(arrayList);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: a */
    public void mo33097a(Document document, int i) {
        super.mo33097a(document, i);
        if (document != null) {
            ListAnalysis.m32521a("ccm_space_folder_click", "shared", mo33106g(), "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
        }
    }

    am(C7667e eVar, Context context, IBannerContract.IModel aVar, IBannerContract.IView<IBannerContract.IView.Delegate> bVar, C10917c cVar) {
        super(eVar, context, aVar, bVar, cVar);
    }
}
