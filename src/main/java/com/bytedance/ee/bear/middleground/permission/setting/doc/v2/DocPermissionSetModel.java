package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0016J \u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IModel;", "token", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "checkLock", "Lio/reactivex/Flowable;", "", "isChecked", "create", "", "destroy", "fetchPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "updateExternalAccess", "externalAccess", "permType", "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateShareExternal", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b */
public final class DocPermissionSetModel implements IDocPermissionSetContract.IModel {

    /* renamed from: a */
    private final String f26962a;

    /* renamed from: b */
    private final int f26963b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IModel
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo38175a(boolean z) {
        return DocPermissionManager.m41996a(this.f26963b, this.f26962a, z);
    }

    public DocPermissionSetModel(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f26962a = str;
        this.f26963b = i;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IModel
    /* renamed from: a */
    public void mo38177a(boolean z, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        if (z) {
            new DocPublicPermissionManager(true).mo38474i(this.f26962a, this.f26963b, gVar);
        } else {
            new DocPublicPermissionManager(true).mo38473h(this.f26962a, this.f26963b, gVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IModel
    /* renamed from: a */
    public void mo38176a(boolean z, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        new DocPublicPermissionManager(true).mo38461a(this.f26962a, this.f26963b, z, i, gVar);
    }
}
