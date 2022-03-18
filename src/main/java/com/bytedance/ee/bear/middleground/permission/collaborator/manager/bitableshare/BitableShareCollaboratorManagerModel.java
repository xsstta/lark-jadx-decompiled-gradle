package com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract;
import com.bytedance.ee.bear.middleground.permission.permission.bitableshare.BitableSharePermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IModel;", "info", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;)V", "getInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "create", "", "destroy", "fetchCollaborators", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "loadMore", "currentShareUserInfoResult", "removeCollaborators", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.c */
public final class BitableShareCollaboratorManagerModel implements IFormCollaboratorManagerContract.IModel {

    /* renamed from: a */
    private final BitableSharePermSetInfo f26277a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IModel
    /* renamed from: a */
    public AbstractC68307f<ShareUserInfoResult> mo37155a() {
        return BitableSharePermissionManager.m41323a(this.f26277a.mo38783d(), this.f26277a.mo38785e().getShareToken(), "");
    }

    public BitableShareCollaboratorManagerModel(BitableSharePermSetInfo bitableSharePermSetInfo) {
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "info");
        this.f26277a = bitableSharePermSetInfo;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.c$a */
    static final class C9734a<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ ShareUserInfoResult f26278a;

        C9734a(ShareUserInfoResult shareUserInfoResult) {
            this.f26278a = shareUserInfoResult;
        }

        /* renamed from: a */
        public final ShareUserInfoResult apply(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, "it");
            Iterator<UserInfo> it = shareUserInfoResult.getUserInfoList().iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (!this.f26278a.getUserInfoList().contains(next)) {
                    this.f26278a.getUserInfoList().add(next);
                }
            }
            shareUserInfoResult.setUserInfoList(this.f26278a.getUserInfoList());
            return shareUserInfoResult;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IModel
    /* renamed from: a */
    public AbstractC68307f<ShareUserInfoResult> mo37156a(ShareUserInfoResult shareUserInfoResult) {
        Intrinsics.checkParameterIsNotNull(shareUserInfoResult, "currentShareUserInfoResult");
        String d = this.f26277a.mo38783d();
        String shareToken = this.f26277a.mo38785e().getShareToken();
        String lastLabel = shareUserInfoResult.getLastLabel();
        Intrinsics.checkExpressionValueIsNotNull(lastLabel, "currentShareUserInfoResult.lastLabel");
        AbstractC68307f<R> d2 = BitableSharePermissionManager.m41323a(d, shareToken, lastLabel).mo238020d(new C9734a(shareUserInfoResult));
        Intrinsics.checkExpressionValueIsNotNull(d2, "BitableSharePermissionMa…     it\n                }");
        return d2;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IModel
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37157a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        return BitableSharePermissionManager.m41321a(this.f26277a.mo38785e().getShareToken(), userInfo);
    }
}
