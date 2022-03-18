package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security;

import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManagerV2;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IModel;", "token", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "create", "", "destroy", "updateSecurityEdit", "callback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "updateSecurityFa", "updateSecurityRead", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.b */
public final class DocPermSecurityModel implements IDocPermSecurityContract.IModel {

    /* renamed from: a */
    private final String f27017a;

    /* renamed from: b */
    private final int f27018b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IModel
    /* renamed from: a */
    public void mo38220a(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38470e(this.f27017a, this.f27018b, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IModel
    /* renamed from: b */
    public void mo38221b(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38468d(this.f27017a, this.f27018b, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IModel
    /* renamed from: c */
    public void mo38222c(AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        DocPublicPermissionManagerV2.f27304a.mo38466c(this.f27017a, this.f27018b, gVar);
    }

    public DocPermSecurityModel(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f27017a = str;
        this.f27018b = i;
    }
}
