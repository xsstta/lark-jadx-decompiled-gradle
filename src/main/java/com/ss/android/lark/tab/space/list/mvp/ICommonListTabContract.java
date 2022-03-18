package com.ss.android.lark.tab.space.list.mvp;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.entity.CommonListResponse;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract;", "", "IModel", "IView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.a */
public interface ICommonListTabContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J$\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00112\u0006\u0010\u0018\u001a\u00020\tH&J\b\u0010\u0019\u001a\u00020\u000fH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/larksuite/framework/mvp/IModel;", "chatId", "", "getChatId", "()Ljava/lang/String;", "hasMore", "", "getHasMore", "()Z", "buildSearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "loadTimeFormat", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "parseToSearchViewData", "Lcom/ss/android/lark/tab/space/list/entity/CommonListResponse;", "searchResponse", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "pull", "", "loadMore", "reset", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.a$a */
    public interface IModel<T extends BaseListViewData> extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        SearchContext mo188479a(String str);

        /* renamed from: a */
        CommonListResponse<T> mo188480a(SearchResponse searchResponse);

        /* renamed from: a */
        String mo188481a();

        /* renamed from: a */
        void mo188482a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo188483a(IGetDataCallback<List<T>> iGetDataCallback, boolean z);

        /* renamed from: b */
        void mo188484b();

        /* renamed from: c */
        boolean mo188485c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u0018J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0006H&J\u001e\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0013\u001a\u00020\u0010H&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "addOnListScrollListener", "", "listener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getContext", "Landroid/content/Context;", "hideLoading", "pullData", "removeOnListScrollListener", "setIs24HourFormat", "is24Hour", "", "showEmptyResultView", "showFailedView", "loadMore", "showLoading", "showResult", "resultList", "", "Delegate", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.a$b */
    public interface IView<T extends BaseListViewData> extends com.larksuite.framework.mvp.IView<Delegate<T>> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "canLoadMore", "", "onItemClick", "", "viewData", "position", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;I)V", "onItemPartialClick", "onLoadMore", "onPull", "reset", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.space.list.mvp.a$b$a */
        public interface Delegate<T extends BaseListViewData> extends IView.IViewDelegate {
            /* renamed from: a */
            void mo188493a();

            /* renamed from: a */
            void mo188494a(T t, int i);

            /* renamed from: a */
            void mo188495a(boolean z);

            /* renamed from: b */
            void mo188496b(T t, int i);

            /* renamed from: b */
            boolean mo188497b();
        }

        /* renamed from: a */
        void mo188486a();

        /* renamed from: a */
        void mo188487a(RecyclerView.OnScrollListener onScrollListener);

        /* renamed from: a */
        void mo188488a(List<? extends T> list, boolean z);

        /* renamed from: a */
        void mo188489a(boolean z);

        /* renamed from: b */
        Context mo188490b();

        /* renamed from: b */
        void mo188491b(boolean z);

        /* renamed from: c */
        void mo188492c();
    }
}
