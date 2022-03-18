package com.bytedance.ee.bear.list.homepage.banner;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.p426d.C8267k;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p702e.C13657b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "layoutResId", "", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(ILcom/bytedance/ee/bear/service/ServiceContext;)V", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mServiceContext", "convert", "", "viewHolder", "item", "onAttachedToRecyclerView", "recyclerView", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.homepage.banner.a */
public class BannerAdapter extends BaseQuickAdapter<Document, C20923c> {

    /* renamed from: a */
    private RecyclerView f22852a;

    /* renamed from: b */
    private C10917c f22853b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.chad.library.adapter.base.BaseQuickAdapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f22852a = recyclerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerAdapter(C10917c cVar) {
        super((int) R.layout.list_home_banner_item_content);
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f22853b = cVar;
    }

    /* renamed from: a */
    public final void mo33079a(List<? extends Document> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (this.f51214t == null) {
            this.f51214t = new ArrayList();
        }
        this.f51214t.clear();
        List<? extends Document> list2 = list;
        if (C13657b.m55423b(list2)) {
            this.f51214t.addAll(list2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerAdapter(int i, C10917c cVar) {
        super(i);
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f22853b = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        Intrinsics.checkParameterIsNotNull(cVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(document, "item");
        ImageView imageView = (ImageView) cVar.mo70740b(R.id.iv_icon);
        cVar.mo70737a(R.id.tv_title, C8292f.m34193g(this.f51211q, document));
        if (FolderVersion.Companion.mo32530b(document.an(), document.ap())) {
            cVar.mo70733a(R.id.iv_icon, C7713a.m30836a());
            return;
        }
        int t = document.mo32483t();
        C8275a aVar = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
        if (t == aVar.mo32555b()) {
            cVar.mo70733a(R.id.iv_icon, C7713a.m30841a(document.mo32377C()));
            return;
        }
        int t2 = document.mo32483t();
        C8275a aVar2 = C8275a.f22377j;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.WIKI");
        if (t2 == aVar2.mo32555b()) {
            new C8267k(this.f51211q, document, "", imageView).mo32360a();
            return;
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false)) {
            Document.DocumentIcon ag = document.ag();
            Intrinsics.checkExpressionValueIsNotNull(ag, "item.documentIcon");
            if (ag.mo32505b() != -1) {
                Document.DocumentIcon ag2 = document.ag();
                Intrinsics.checkExpressionValueIsNotNull(ag2, "item.documentIcon");
                if (!TextUtils.isEmpty(ag2.mo32502a())) {
                    Document.DocumentIcon ag3 = document.ag();
                    Intrinsics.checkExpressionValueIsNotNull(ag3, "item.documentIcon");
                    String a = ag3.mo32502a();
                    Document.DocumentIcon ag4 = document.ag();
                    Intrinsics.checkExpressionValueIsNotNull(ag4, "item.documentIcon");
                    ((AbstractC7588a) KoinJavaComponent.m268613a(AbstractC7588a.class, null, null, 6, null)).mo29855a(a, ag4.mo32507c(), C7713a.m30837a(document.mo32483t()), (ImageView) cVar.mo70740b(R.id.iv_icon));
                    return;
                }
            }
        }
        cVar.mo70733a(R.id.iv_icon, C7713a.m30837a(document.mo32483t()));
    }
}
