package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract;", "", "IModel", "IView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.g */
public interface IDepartmentContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bH&J\u0018\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0007j\b\u0012\u0004\u0012\u00020\n`\bH&J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0007j\b\u0012\u0004\u0012\u00020\f`\bH&J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\fH&J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "addSelectedUser", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "getOriginUsers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSelectedDeps", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "getSelectedTopUsers", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "loadData", "visibleDepartment", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "loadMore", "registerChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeSelectedUser", "transDepToUserInfo", "transTopUserToUserInfo", "visibleTopUserInDep", "transUserInfoToDep", "transUserInfoToTopUser", "unregisterChangeListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.g$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        VisibleDepartment mo37584a(UserInfo userInfo);

        /* renamed from: a */
        UserInfo mo37585a(VisibleDepartment visibleDepartment);

        /* renamed from: a */
        UserInfo mo37586a(VisibleTopUserInDep visibleTopUserInDep);

        /* renamed from: a */
        ArrayList<UserInfo> mo37588a();

        /* renamed from: a */
        void mo37589a(AbstractC5204e<Department> eVar);

        /* renamed from: a */
        void mo37590a(VisibleDepartment visibleDepartment, AbstractC5204e<Department> eVar);

        /* renamed from: a */
        void mo37591a(SelectedUserChangeListener cVar);

        /* renamed from: b */
        VisibleTopUserInDep mo37592b(UserInfo userInfo);

        /* renamed from: b */
        ArrayList<VisibleDepartment> mo37593b();

        /* renamed from: b */
        void mo37594b(SelectedUserChangeListener cVar);

        /* renamed from: c */
        ArrayList<VisibleTopUserInDep> mo37595c();

        /* renamed from: c */
        void mo37596c(UserInfo userInfo);

        /* renamed from: d */
        void mo37597d(UserInfo userInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&JP\u0010\u0015\u001a\u00020\u00042\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0017j\b\u0012\u0004\u0012\u00020\t`\u00192\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0017j\b\u0012\u0004\u0012\u00020\f`\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000fH&J\b\u0010\u001f\u001a\u00020\u0004H&¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView$Delegate;", "addDepartment", "", "department", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "addSelectedDep", "visibleDepartment", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "addSelectedTopUser", "visibleTopUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "canLoadMore", "enable", "", "finishLoadmore", "hideEmpty", "hideLoading", "removeSelectedDep", "removeSelectedTopUser", "setOriginUsers", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "selectedDeps", "selectedTopUsers", "showDepartment", "showEmpty", "isRoot", "showLoading", "Delegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.g$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "back", "", "onClickNextDep", "visibleDepartment", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "onLoadMore", "onNavigationNodeClick", "onSelectedDep", "onSelectedTopUser", "visibleTopUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "onUnSelectedDep", "onUnSelectedTopUser", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.g$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37608a();

            /* renamed from: a */
            void mo37609a(VisibleDepartment visibleDepartment);

            /* renamed from: a */
            void mo37610a(VisibleTopUserInDep visibleTopUserInDep);

            /* renamed from: b */
            void mo37611b();

            /* renamed from: b */
            void mo37612b(VisibleDepartment visibleDepartment);

            /* renamed from: b */
            void mo37613b(VisibleTopUserInDep visibleTopUserInDep);

            /* renamed from: c */
            void mo37614c(VisibleDepartment visibleDepartment);

            /* renamed from: d */
            void mo37615d(VisibleDepartment visibleDepartment);
        }

        /* renamed from: a */
        void mo37618a();

        /* renamed from: a */
        void mo37620a(Department department);

        /* renamed from: a */
        void mo37621a(VisibleDepartment visibleDepartment);

        /* renamed from: a */
        void mo37622a(VisibleTopUserInDep visibleTopUserInDep);

        /* renamed from: a */
        void mo37624a(ArrayList<UserInfo> arrayList, ArrayList<VisibleDepartment> arrayList2, ArrayList<VisibleTopUserInDep> arrayList3);

        /* renamed from: a */
        void mo37625a(boolean z);

        /* renamed from: b */
        void mo37626b();

        /* renamed from: b */
        void mo37627b(Department department);

        /* renamed from: b */
        void mo37628b(VisibleDepartment visibleDepartment);

        /* renamed from: b */
        void mo37629b(VisibleTopUserInDep visibleTopUserInDep);

        /* renamed from: b */
        void mo37630b(boolean z);

        /* renamed from: c */
        void mo37631c();

        /* renamed from: d */
        void mo37632d();
    }
}
