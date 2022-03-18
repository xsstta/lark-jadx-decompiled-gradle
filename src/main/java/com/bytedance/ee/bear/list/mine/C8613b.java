package com.bytedance.ee.bear.list.mine;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.mine.b */
public class C8613b extends BaseBannerPresenter<IBannerContract.IModel, IBannerContract.IView<IBannerContract.IView.Delegate>, IBannerContract.IView.Delegate> implements AbstractC8651p.AbstractC8652a {
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: g */
    public String mo33106g() {
        return "personal_folder";
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: h */
    public String mo33107h() {
        return "";
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8652a
    /* renamed from: a */
    public void mo32604a() {
        mo33103d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ IModel getModel() {
        return super.mo33112m();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ IView getView() {
        return super.mo33113n();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C8674q.m36243f().mo33642a(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C8674q.m36243f().mo33649b(this);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: i */
    public void mo33108i() {
        PostCard b = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/folder/activity");
        b.mo17314a("current_module", mo33106g());
        b.mo17314a("token", "");
        b.mo17314a("title", mo33111l().getString(R.string.Doc_List_My_Folder));
        b.mo17314a(ShareHitPoint.f121869d, String.valueOf(C8275a.f22370c.mo32555b()));
        b.mo17316a("is_personal_folder", true);
        b.mo17317a();
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
        super.mo33100a(arrayList);
        IBannerContract.IView n = mo33113n();
        boolean z = true;
        if (C13657b.m55421a(arrayList) || arrayList.size() <= 1) {
            z = false;
        }
        n.mo33123a(z);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: a */
    public void mo33097a(Document document, int i) {
        super.mo33097a(document, i);
        if (document != null) {
            ListAnalysis.m32521a("ccm_space_folder_click", "personal", mo33106g(), "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
        }
    }

    C8613b(C7667e eVar, Context context, IBannerContract.IModel aVar, IBannerContract.IView<IBannerContract.IView.Delegate> bVar, C10917c cVar) {
        super(eVar, context, aVar, bVar, cVar);
    }
}
