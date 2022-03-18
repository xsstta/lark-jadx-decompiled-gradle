package com.bytedance.ee.bear.templates.banner;

import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract;", "", "IModel", "IView", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.banner.b */
public interface TemplateBannerContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "fetchBannerData", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/templates/banner/BannerDataResult;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.b$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AbstractC68307f<BannerDataResult> mo43974a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u0007\u001a\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH&J\b\u0010\f\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView$IViewDelegate;", "setVisiable", "", "visiable", "", "showBanner", "banners", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "Lkotlin/collections/ArrayList;", "showLoading", "IViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.b$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBannerClicked", "", "banner", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.banner.b$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo43975a(ArrayList<BannerData> arrayList);

        /* renamed from: a */
        void mo43976a(boolean z);
    }
}
