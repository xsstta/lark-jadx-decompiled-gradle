package com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.SearchUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.a */
public interface ISearchUserResultContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "addSelectedUser", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "getSelectedUsers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "loadMore", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "registerChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeSelectedUser", "searchUsers", "keyword", "", "unregisterChangeListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        ArrayList<UserInfo> mo37448a();

        /* renamed from: a */
        void mo37449a(AbstractC5204e<SearchUserResult> eVar);

        /* renamed from: a */
        void mo37450a(SelectedUserChangeListener cVar);

        /* renamed from: a */
        void mo37451a(UserInfo userInfo);

        /* renamed from: a */
        void mo37452a(String str, AbstractC5204e<SearchUserResult> eVar);

        /* renamed from: b */
        void mo37453b(SelectedUserChangeListener cVar);

        /* renamed from: b */
        void mo37454b(UserInfo userInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J \u0010\u000f\u001a\u00020\u00042\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0011j\b\u0012\u0004\u0012\u00020\u0006`\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0014\u001a\u00020\u0004H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView$IDelegate;", "addSelectedUser", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "addUsers", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "canLoadMore", "enable", "", "finisLoadMore", "hideLoading", "initSelectedUsers", "userInfos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "removeSelectedUser", "showLoading", "showUsers", "IDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBlockUserClick", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onItemSelected", "onItemUnSelected", "onLoadMore", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37464a();

            /* renamed from: a */
            void mo37465a(UserInfo userInfo);

            /* renamed from: b */
            void mo37466b(UserInfo userInfo);

            /* renamed from: c */
            void mo37467c(UserInfo userInfo);
        }

        /* renamed from: a */
        void mo37455a();

        /* renamed from: a */
        void mo37456a(SearchUserResult searchUserResult);

        /* renamed from: a */
        void mo37457a(UserInfo userInfo);

        /* renamed from: a */
        void mo37458a(ArrayList<UserInfo> arrayList);

        /* renamed from: a */
        void mo37459a(boolean z);

        /* renamed from: b */
        void mo37460b();

        /* renamed from: b */
        void mo37461b(SearchUserResult searchUserResult);

        /* renamed from: b */
        void mo37462b(UserInfo userInfo);

        /* renamed from: c */
        void mo37463c();
    }
}
