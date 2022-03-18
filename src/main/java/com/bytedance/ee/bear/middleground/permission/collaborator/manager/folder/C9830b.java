package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.b */
class C9830b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.b$a */
    public interface AbstractC9831a extends IModel {

        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.b$a$a */
        public interface AbstractC9832a<T extends NetService.Result> {
            /* renamed from: a */
            void mo37403a(T t);

            /* renamed from: a */
            void mo37404a(Throwable th);
        }

        /* renamed from: a */
        AbstractC68307f<Boolean> mo37393a(String str);

        /* renamed from: a */
        AbstractC68307f<ShareFolderPublicPermission> mo37394a(String str, FolderVersion folderVersion);

        /* renamed from: a */
        AbstractC68307f<ShareFolderUserPermission> mo37395a(String str, FolderVersion folderVersion, boolean z);

        /* renamed from: a */
        AbstractC68307f<Boolean> mo37396a(String str, UserInfo userInfo);

        /* renamed from: a */
        AbstractC68307f<Boolean> mo37397a(String str, UserInfo userInfo, int i);

        /* renamed from: a */
        ArrayList<UserInfo> mo37398a();

        /* renamed from: a */
        void mo37399a(String str, UserInfo userInfo, AbstractC9832a<NetService.Result> aVar, FolderPermSetInfo folderPermSetInfo);

        /* renamed from: a */
        void mo37400a(String str, UserInfo userInfo, AbstractC9832a<NotNotifyUserResult> aVar, FolderPermSetInfo folderPermSetInfo, boolean z, boolean z2);

        /* renamed from: a */
        void mo37401a(String str, String str2, AbstractC9832a<ShareUserInfoResult> aVar, FolderPermSetInfo folderPermSetInfo, String str3);

        /* renamed from: b */
        void mo37402b(String str, UserInfo userInfo, AbstractC9832a<NetService.Result> aVar, FolderPermSetInfo folderPermSetInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.b$b */
    public interface AbstractC9833b extends IView<AbstractC9834a> {

        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.b$b$a */
        public interface AbstractC9834a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo37414a();

            /* renamed from: a */
            void mo37415a(int i, UserInfo userInfo);

            /* renamed from: a */
            void mo37416a(int i, UserInfo userInfo, boolean z, boolean z2);

            /* renamed from: a */
            void mo37417a(AbstractC27129h hVar);

            /* renamed from: b */
            void mo37418b();

            /* renamed from: b */
            void mo37419b(int i, UserInfo userInfo);

            /* renamed from: c */
            void mo37420c(int i, UserInfo userInfo);

            /* renamed from: d */
            void mo37421d(int i, UserInfo userInfo);
        }

        /* renamed from: a */
        void mo37405a();

        /* renamed from: a */
        void mo37406a(int i, UserInfo userInfo);

        /* renamed from: a */
        void mo37407a(Runnable runnable, Runnable runnable2);

        /* renamed from: a */
        void mo37408a(List<UserInfo> list);

        /* renamed from: a */
        void mo37409a(boolean z);

        /* renamed from: a */
        void mo37410a(boolean z, Runnable runnable, Runnable runnable2);

        /* renamed from: b */
        void mo37411b();

        /* renamed from: b */
        void mo37412b(int i, UserInfo userInfo);

        /* renamed from: c */
        void mo37413c();
    }
}
