package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b;
import com.bytedance.ee.bear.middleground.permission.p486f.C9920g;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManager;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.e */
public class C9841e implements C9830b.AbstractC9831a {

    /* renamed from: a */
    private final C10917c f26510a;

    /* renamed from: b */
    private final ArrayList<UserInfo> f26511b;

    /* renamed from: c */
    private final C68289a f26512c = new C68289a();

    public static /* synthetic */ Boolean lambda$3vdcGvKMarW87Uetxz6pI2XxY4g(Boolean bool) {
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public ArrayList<UserInfo> mo37398a() {
        return this.f26511b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("ShareFolderCollaboratorManageModel", "create()...");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("ShareFolderCollaboratorManageModel", "destroy()...");
        this.f26512c.mo237935a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo37393a(String str) {
        return FolderPermissionManager.f26813a.mo37743c(str).mo238020d($$Lambda$e$3vdcGvKMarW87Uetxz6pI2XxY4g.INSTANCE);
    }

    C9841e(C10917c cVar, ArrayList<UserInfo> arrayList) {
        this.f26510a = cVar;
        this.f26511b = arrayList;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public AbstractC68307f<ShareFolderPublicPermission> mo37394a(String str, FolderVersion folderVersion) {
        return FolderPermissionManagerDispatcher.m41256a(folderVersion.isShareFolderV2()).mo37735a(str, folderVersion);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo37396a(String str, UserInfo userInfo) {
        return FolderPermissionManager.m41236a(str, userInfo.getId(), userInfo.getOwnerType());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public AbstractC68307f<ShareFolderUserPermission> mo37395a(String str, FolderVersion folderVersion, boolean z) {
        return FolderPermissionManager.f26813a.mo37736a(str, folderVersion, z);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo37397a(String str, UserInfo userInfo, int i) {
        return FolderPermissionManager.m41237a(str, userInfo.getId(), userInfo.getOwnerType(), i);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: b */
    public void mo37402b(String str, UserInfo userInfo, C9830b.AbstractC9831a.AbstractC9832a<NetService.Result> aVar, FolderPermSetInfo folderPermSetInfo) {
        C13479a.m54764b("ShareFolderCollaboratorManageModel", "modifyUser()...spaceId = " + C13598b.m55197d(str));
        C68289a aVar2 = this.f26512c;
        AbstractC68307f<SimpleRequestResult> b = FolderPermissionManagerDispatcher.m41256a(folderPermSetInfo.mo38873i().isShareFolderV2()).mo37741b(FolderPermissionManagerDispatcher.m41258a(folderPermSetInfo.mo38883s(), str, folderPermSetInfo.mo38864c(), userInfo));
        aVar.getClass();
        $$Lambda$pEi43E9w0R9tfSEtraa6tBIRpQ r5 = new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$pEi43E9w0R9tfSEtraa6tBIRpQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9830b.AbstractC9831a.AbstractC9832a.this.mo37403a((SimpleRequestResult) obj);
            }
        };
        aVar.getClass();
        aVar2.mo237937a(b.mo238001b(r5, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$UYw9RS9vgjBZxVwlFf5awT4ncM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9830b.AbstractC9831a.AbstractC9832a.this.mo37404a((Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public void mo37399a(String str, UserInfo userInfo, C9830b.AbstractC9831a.AbstractC9832a<NetService.Result> aVar, FolderPermSetInfo folderPermSetInfo) {
        C68289a aVar2 = this.f26512c;
        AbstractC68307f<SimpleRequestResult> a = FolderPermissionManagerDispatcher.m41256a(folderPermSetInfo.mo38883s()).mo37738a(str, folderPermSetInfo.mo38864c(), userInfo);
        aVar.getClass();
        $$Lambda$pEi43E9w0R9tfSEtraa6tBIRpQ r4 = new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$pEi43E9w0R9tfSEtraa6tBIRpQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9830b.AbstractC9831a.AbstractC9832a.this.mo37403a((SimpleRequestResult) obj);
            }
        };
        aVar.getClass();
        aVar2.mo237937a(a.mo238001b(r4, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$UYw9RS9vgjBZxVwlFf5awT4ncM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9830b.AbstractC9831a.AbstractC9832a.this.mo37404a((Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public void mo37401a(String str, String str2, final C9830b.AbstractC9831a.AbstractC9832a<ShareUserInfoResult> aVar, FolderPermSetInfo folderPermSetInfo, String str3) {
        C13479a.m54764b("ShareFolderCollaboratorManageModel", "refreshUsers()...spaceId = " + C13598b.m55197d(str));
        new C9920g().mo37756a(str, str2, new IGetDataCallback<ShareUserInfoResult>() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9841e.C98421 */

            /* renamed from: a */
            public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
                C13479a.m54764b("ShareFolderCollaboratorManageModel", "refreshUsers()...success");
                aVar.mo37403a(shareUserInfoResult);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C13479a.m54764b("ShareFolderCollaboratorManageModel", "refreshUsers()...failed");
                aVar.mo37404a(errorResult);
            }
        }, folderPermSetInfo.mo38873i(), str3);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a
    /* renamed from: a */
    public void mo37400a(String str, UserInfo userInfo, C9830b.AbstractC9831a.AbstractC9832a<NotNotifyUserResult> aVar, FolderPermSetInfo folderPermSetInfo, boolean z, boolean z2) {
        C13479a.m54764b("ShareFolderCollaboratorManageModel", "transferOwner()...spaceId = " + C13598b.m55197d(str));
        C68289a aVar2 = this.f26512c;
        AbstractC68307f<NotNotifyUserResult> a = FolderPermissionManagerDispatcher.m41256a(folderPermSetInfo.mo38873i().isShareFolderV2()).mo37739a(folderPermSetInfo.mo38864c(), str, userInfo, z, z2);
        aVar.getClass();
        $$Lambda$AekUMxW8fq685NGFV3JHCjZYs r10 = new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$AekUMxW8fq685NGFV3JHCjZYs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9830b.AbstractC9831a.AbstractC9832a.this.mo37403a((NotNotifyUserResult) obj);
            }
        };
        aVar.getClass();
        aVar2.mo237937a(a.mo238001b(r10, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$UYw9RS9vgjBZxVwlFf5awT4ncM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9830b.AbstractC9831a.AbstractC9832a.this.mo37404a((Throwable) obj);
            }
        }));
    }
}
