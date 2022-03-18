package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IModel;", "token", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "checkLockState", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "create", "", "destroy", "fetchCollaboratorTotalNum", "unlock", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.c */
public final class DocCollaboratorManagerModel implements DocCollaboratorManagerContract.IModel {

    /* renamed from: a */
    private final String f26316a;

    /* renamed from: b */
    private final int f26317b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IModel
    /* renamed from: a */
    public AbstractC68307f<IDocPublicPermission> mo37218a() {
        return new DocPermissionFetcher().mo38097c(this.f26316a, this.f26317b);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IModel
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo37219b() {
        return DocPermissionManager.m41990a(this.f26317b, this.f26316a);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IModel
    /* renamed from: c */
    public AbstractC68307f<Integer> mo37220c() {
        return DocPermissionManager.f27276a.mo38438b(this.f26317b, this.f26316a);
    }

    public DocCollaboratorManagerModel(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f26316a = str;
        this.f26317b = i;
    }
}
