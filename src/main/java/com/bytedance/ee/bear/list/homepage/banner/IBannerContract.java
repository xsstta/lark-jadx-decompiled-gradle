package com.bytedance.ee.bear.list.homepage.banner;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.list.dto.Document;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract;", "", "IModel", "IView", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.homepage.banner.f */
public interface IBannerContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u001e\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "clearListLiveData", "", "getList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "getListFromNet", "getListLiveData", "Landroidx/lifecycle/LiveData;", "getSize", "", "hasMore", "", "setList", "list", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.f$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo33084a(List<? extends Document> list);

        /* renamed from: d */
        void mo33087d();

        /* renamed from: e */
        ArrayList<Document> mo33088e();

        /* renamed from: f */
        boolean mo33089f();

        /* renamed from: j */
        LiveData<ArrayList<Document>> mo33093j();

        /* renamed from: k */
        void mo33094k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000fJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView;", "setBannerVisible", "", "visible", "", "showList", "list", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "showMore", "show", "Delegate", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.f$b */
    public interface IView<VD extends Delegate> extends com.larksuite.framework.mvp.IView<VD> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBtnMoreClick", "", "onItemClick", "item", "Lcom/bytedance/ee/bear/list/dto/Document;", "position", "", "onScrollStateChanged", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.list.homepage.banner.f$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo33114a();

            /* renamed from: a */
            void mo33115a(Document document, int i);
        }

        /* renamed from: a */
        void mo33122a(ArrayList<Document> arrayList);

        /* renamed from: a */
        void mo33123a(boolean z);

        /* renamed from: b */
        void mo33125b(boolean z);
    }
}
