package com.bytedance.ee.bear.middleground.permission.p486f;

import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.permission.folder.ShareFolderPermissionFetcher;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.middleground.permission.f.g */
public class C9920g {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41287a(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        iGetDataCallback.onError(new ErrorResult("fetchOldShareMember()...failed"));
        C13479a.m54759a("ShareFolderExecutor", "accept: ", th);
    }

    /* renamed from: a */
    public AbstractC68307f<ShareFolderUserPermission> mo37754a(String str, FolderVersion folderVersion, boolean z) {
        return new ShareFolderPermissionFetcher().mo37774a(str, folderVersion, z);
    }

    /* renamed from: a */
    public AbstractC68307f<ShareUserInfoResult> mo37755a(String str, String str2, FolderVersion folderVersion, String str3) {
        if (folderVersion.isShareFolderV2()) {
            str = str2;
        }
        return FolderPermissionManagerDispatcher.m41256a(folderVersion.isShareFolderV2()).mo37737a(str, str3);
    }

    /* renamed from: a */
    public void mo37756a(String str, String str2, IGetDataCallback<ShareUserInfoResult> iGetDataCallback, FolderVersion folderVersion, String str3) {
        if (!folderVersion.isPersonalFolder() || !folderVersion.isFolderV1()) {
            AbstractC68307f<ShareUserInfoResult> a = mo37755a(str, str2, folderVersion, str3);
            iGetDataCallback.getClass();
            a.mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.middleground.permission.p486f.$$Lambda$7L1xFLvfVb9Ox_VBxtAvHuaYbI */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IGetDataCallback.this.onSuccess((ShareUserInfoResult) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.middleground.permission.p486f.$$Lambda$g$ZG7UKhBdUUKHvKZGYRBUy6vcRR8 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9920g.m41287a(IGetDataCallback.this, (Throwable) obj);
                }
            });
            return;
        }
        iGetDataCallback.onSuccess(new ShareUserInfoResult());
    }
}
