package com.bytedance.ee.bear.list.folderselect.search;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.list.dto.Document;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.mvp.IView;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract;", "", "IModel", "IView", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folderselect.search.a */
public interface ISearchFolderContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getIsHasMore", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchResult", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "loadData", "", SearchIntents.EXTRA_QUERY, "", "loadMore", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo33006a();

        /* renamed from: a */
        void mo33007a(String str);

        /* renamed from: b */
        C1177w<List<Document>> mo33008b();

        /* renamed from: c */
        C1177w<Boolean> mo33009c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView$Delegate;", "refreshNetworkState", "", "isConnect", "", "setHasMoreState", "isHasMore", "setTitle", "title", "", "showEmpty", "showLoading", "showResult", "documents", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "Delegate", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "doSearch", "", SearchIntents.EXTRA_QUERY, "", "loadMore", "onBackClicked", "onItemClick", "doc", "Lcom/bytedance/ee/bear/list/dto/Document;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.list.folderselect.search.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo33014a();

            /* renamed from: a */
            void mo33015a(Document document);

            /* renamed from: a */
            void mo33016a(String str);

            /* renamed from: b */
            void mo33017b();
        }

        /* renamed from: a */
        void mo33010a();

        /* renamed from: a */
        void mo33011a(List<? extends Document> list);

        /* renamed from: a */
        void mo33012a(boolean z);

        /* renamed from: b */
        void mo33013b();
    }
}
