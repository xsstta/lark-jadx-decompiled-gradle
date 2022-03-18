package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator;

import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManagerV2;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IModel;", "token", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "create", "", "destroy", "updateManagerCollaboratorAnyone", "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateManagerCollaboratorEdit", "updateManagerCollaboratorFa", "updateManagerCollaboratorInternal", "updateManagerCollaboratorRead", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.b */
public final class DocPermManagerCollaboratorModel implements IDocPermManagerCollaboratorContract.IModel {

    /* renamed from: a */
    private final String f26968a;

    /* renamed from: b */
    private final int f26969b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IModel
    /* renamed from: a */
    public void mo38180a(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38486l(this.f26968a, this.f26969b, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IModel
    /* renamed from: b */
    public void mo38181b(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38485k(this.f26968a, this.f26969b, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IModel
    /* renamed from: c */
    public void mo38182c(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38484j(this.f26968a, this.f26969b, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IModel
    /* renamed from: d */
    public void mo38183d(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38482h(this.f26968a, this.f26969b, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IModel
    /* renamed from: e */
    public void mo38184e(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38483i(this.f26968a, this.f26969b, gVar);
    }

    public DocPermManagerCollaboratorModel(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f26968a = str;
        this.f26969b = i;
    }
}
