package com.bytedance.ee.bear.middleground.permission.setting.manager;

import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0001H\u0002J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J2\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0012\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0013\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0014\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0015\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0016\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u0017\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u0018\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u0019\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001a\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001c\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001d\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u001f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010 \u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010!\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\"\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010#\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010%\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/manager/DocPublicPermissionManager;", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/IDocPublicPermissionManager;", "isV2", "", "(Z)V", "getDocPublicPermissionManager", "updateCommentWithEdit", "", "token", "", ShareHitPoint.f121869d, "", "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateCommentWithRead", "updateExternalAccess", "externalAccess", "permType", "updateLinkShareAnyoneEdit", "updateLinkShareAnyoneRead", "updateLinkShareClose", "updateLinkShareInternalEdit", "updateLinkShareInternalRead", "updateManagerCollaboratorAnyone", "updateManagerCollaboratorInternal", "updateManagerCollaboratorWithEdit", "updateManagerCollaboratorWithFA", "updateManagerCollaboratorWithRead", "updateSecurityWithEdit", "updateSecurityWithFA", "updateSecurityWithRead", "updateShareAnyone", "updateShareExternalWithEdit", "updateShareExternalWithFA", "updateShareExternalWithRead", "updateShareInternal", "inviteExternal", "updateShareOnlyMe", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.d */
public final class DocPublicPermissionManager implements IDocPublicPermissionManager {

    /* renamed from: a */
    private final boolean f27299a;

    /* renamed from: a */
    private final IDocPublicPermissionManager m42029a() {
        IDocPublicPermissionManager gVar;
        if (this.f27299a) {
            gVar = DocPublicPermissionManagerV2.f27304a;
        } else {
            gVar = DocPublicPermissionManagerV1.f27300a;
        }
        return gVar;
    }

    public DocPublicPermissionManager(boolean z) {
        this.f27299a = z;
    }

    /* renamed from: f */
    public void mo38471f(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV1.f27300a.mo38476f(str, i, gVar);
    }

    /* renamed from: g */
    public void mo38472g(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV1.f27300a.mo38477g(str, i, gVar);
    }

    /* renamed from: h */
    public void mo38473h(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38480f(str, i, gVar);
    }

    /* renamed from: i */
    public void mo38474i(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38481g(str, i, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: b */
    public void mo38464b(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38464b(str, i, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: c */
    public void mo38466c(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38466c(str, i, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: d */
    public void mo38468d(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38468d(str, i, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: e */
    public void mo38470e(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38470e(str, i, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38460a(String str, int i, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38460a(str, i, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: b */
    public void mo38463b(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38463b(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: c */
    public void mo38465c(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38465c(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: d */
    public void mo38467d(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38467d(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: e */
    public void mo38469e(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38469e(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38459a(String str, int i, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38459a(str, i, i2, gVar);
    }

    /* renamed from: a */
    public void mo38462a(String str, int i, boolean z, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV1.f27300a.mo38475a(str, i, z, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.manager.IDocPublicPermissionManager
    /* renamed from: a */
    public void mo38461a(String str, int i, boolean z, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m42029a().mo38461a(str, i, z, i2, gVar);
    }
}
