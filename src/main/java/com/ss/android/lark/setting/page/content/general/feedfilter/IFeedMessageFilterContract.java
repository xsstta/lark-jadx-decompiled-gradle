package com.ss.android.lark.setting.page.content.general.feedfilter;

import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedTabInfoList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract;", "", "IModel", "IView", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.k */
public interface IFeedMessageFilterContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J,\u0010\t\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H'¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getFeedFilterSetting", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "forceServer", "", "updateFeedFilterSetting", "requestBuilder", "Lcom/bytedance/lark/pb/feed/v1/UpdateFeedFilterSettingsRequest$Builder;", "", "feedFilterEnabled", "myFilterSelectionsWithoutAll", "", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.k$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo186329a(UpdateFeedFilterSettingsRequest.C17242a aVar, IGetDataCallback<Long> iGetDataCallback);

        /* renamed from: a */
        void mo186330a(IGetDataCallback<FeedFilterTabInfo> iGetDataCallback, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView$Delegate;", "initFeedTypeFilter", "", "isFeedFilterEnabled", "", "feedTabInfoList", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfoList;", "Delegate", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.k$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "updateFeedFilterSetting", "", "isFeedFilterEnabled", "", "myFilterSelectionsWithoutAll", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.k$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo186334a(Boolean bool, List<String> list, IGetDataCallback<Long> iGetDataCallback);
        }

        /* renamed from: a */
        void mo186193a(boolean z, FeedTabInfoList dVar);
    }
}
