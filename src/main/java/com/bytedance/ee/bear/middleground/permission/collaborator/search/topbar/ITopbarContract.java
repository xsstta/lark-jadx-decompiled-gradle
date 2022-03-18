package com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar;

import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.a */
public interface ITopbarContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getSelectedUser", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "registerChangeListener", "", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeSelectedUser", "userInfo", "unregisterChangeListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        ArrayList<UserInfo> mo37492a();

        /* renamed from: a */
        void mo37493a(SelectedUserChangeListener cVar);

        /* renamed from: a */
        void mo37494a(UserInfo userInfo);

        /* renamed from: b */
        void mo37495b(SelectedUserChangeListener cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eJ\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00042\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fH&J\b\u0010\r\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView$IDelegate;", "hideSelectedUser", "", "onAddSelectedUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onRemoveSelectedUser", "setSelectedUserList", "userInfos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "showSelectedUser", "IDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/ITopbarContract$IView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBackClicked", "", "onClearQueryClick", "onFocusChanged", "hasFocus", "", "onKeywordChange", "keyword", "", "onSearchClick", "onSelectedItemClicked", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37501a();

            /* renamed from: a */
            void mo37502a(UserInfo userInfo);

            /* renamed from: a */
            void mo37503a(String str);

            /* renamed from: a */
            void mo37504a(boolean z);

            /* renamed from: b */
            void mo37505b();

            /* renamed from: c */
            void mo37506c();
        }

        /* renamed from: a */
        void mo37496a();

        /* renamed from: a */
        void mo37497a(UserInfo userInfo);

        /* renamed from: a */
        void mo37498a(ArrayList<UserInfo> arrayList);

        /* renamed from: b */
        void mo37499b();

        /* renamed from: b */
        void mo37500b(UserInfo userInfo);
    }
}
