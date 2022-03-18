package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IModel;", "token", "", ShareHitPoint.f121869d, "", "permType", "(Ljava/lang/String;II)V", "TAG", "checkRemoveMemberLock", "Lio/reactivex/Flowable;", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "checkSharePermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "checkUpdateMemberPermissionLock", "newPermission", "create", "", "destroy", "fetchCollaborators", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "lastLabel", "removeCollaborator", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "setCollaboratorPermission", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "transferOwner", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.h */
public final class DocCollaboratorSubModel implements DocCollaboratorSubContract.IModel {

    /* renamed from: a */
    private final String f26351a = "DocCollaboratorSubModel";

    /* renamed from: b */
    private final String f26352b;

    /* renamed from: c */
    private final int f26353c;

    /* renamed from: d */
    private final int f26354d;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: a */
    public AbstractC68307f<IDocUserPermission> mo37254a() {
        return new DocPermissionFetcher().mo38096b(this.f26352b, this.f26353c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: b */
    public AbstractC68307f<SimpleRequestResult> mo37259b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        return DocPermissionManager.m41992a(this.f26353c, this.f26352b, this.f26354d, userInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.h$a */
    static final class C9769a<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9769a f26355a = new C9769a();

        C9769a() {
        }

        /* renamed from: a */
        public final NotNotifyUserResult apply(InviteResult inviteResult) {
            Intrinsics.checkParameterIsNotNull(inviteResult, "it");
            NotNotifyUserResult notNotifyUserResult = new NotNotifyUserResult();
            notNotifyUserResult.setNotNotifyUsers(inviteResult.getNotNotifyUsers());
            return notNotifyUserResult;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: a */
    public AbstractC68307f<NotNotifyUserResult> mo37256a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        return DocPermissionManager.f27276a.mo38435a(this.f26353c, this.f26352b, userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: a */
    public AbstractC68307f<ShareUserInfoResult> mo37257a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lastLabel");
        return DocPermissionManager.m41993a(this.f26353c, this.f26352b, this.f26354d, str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: c */
    public AbstractC68307f<Boolean> mo37260c(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (this.f26354d == 1) {
            return DocPermissionManager.m41994a(this.f26353c, this.f26352b, userInfo.getId(), userInfo.getOwnerType());
        }
        AbstractC68307f<Boolean> a = AbstractC68307f.m265083a((Object) false);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(false)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo37258b(int i, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (this.f26354d == 1) {
            return DocPermissionManager.m41995a(this.f26353c, this.f26352b, userInfo.getId(), userInfo.getOwnerType(), i);
        }
        AbstractC68307f<Boolean> a = AbstractC68307f.m265083a((Object) false);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(false)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IModel
    /* renamed from: a */
    public AbstractC68307f<NotNotifyUserResult> mo37255a(int i, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (userInfo.getPermission() != 0) {
            return DocPermissionManager.m42002b(this.f26353c, this.f26352b, userInfo, i, this.f26354d);
        }
        String str = this.f26351a;
        C13479a.m54764b(str, "setCollaboratorPermission()... from not perm to " + i);
        AbstractC68307f<R> d = DocPermissionManager.f27276a.mo38436a(this.f26353c, this.f26352b, userInfo, i, this.f26354d).mo238020d(C9769a.f26355a);
        Intrinsics.checkExpressionValueIsNotNull(d, "DocPermissionManager.inv…ult\n                    }");
        return d;
    }

    public DocCollaboratorSubModel(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f26352b = str;
        this.f26353c = i;
        this.f26354d = i2;
    }
}
