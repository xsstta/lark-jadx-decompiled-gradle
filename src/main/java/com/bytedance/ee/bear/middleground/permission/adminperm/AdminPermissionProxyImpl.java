package com.bytedance.ee.bear.middleground.permission.adminperm;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J&\u0010\u001c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/adminperm/AdminPermissionProxyImpl;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/IAdminPermissionProxy;", "()V", "canShowInDebug", "", "getCanShowInDebug", "()Z", "canShowInDebug$delegate", "Lkotlin/Lazy;", "adminCanCopy", ShareHitPoint.f121869d, "", "id", "", "adminCanDownload", "adminCanDownloadAsync", "Lio/reactivex/Flowable;", "adminCanExport", "adminCanExternalShare", "adminCanImport", "adminCanOtherAppOpen", "adminCanPrint", "adminCanUpload", "adminCheckAuthorityForDriveSdk", "permissionType", "entityType", "asyncCheckAuthority", "entityId", "syncCheckAuthority", "transDocTypeToEntityType", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.a.a */
public final class AdminPermissionProxyImpl implements IAdminPermissionProxy {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25619a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AdminPermissionProxyImpl.class), "canShowInDebug", "getCanShowInDebug()Z"))};

    /* renamed from: b */
    public static final Companion f25620b = new Companion(null);

    /* renamed from: c */
    private final Lazy f25621c = LazyKt.lazy(new C9548b(this));

    /* renamed from: c */
    private final boolean m39449c() {
        Lazy lazy = this.f25621c;
        KProperty kProperty = f25619a[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/adminperm/AdminPermissionProxyImpl$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.a.a$b */
    static final class C9548b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AdminPermissionProxyImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9548b(AdminPermissionProxyImpl aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.mo36542b();
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: a */
    public boolean mo36539a() {
        return m39448b(1, 1, "");
    }

    /* renamed from: b */
    public final boolean mo36542b() {
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        if (!C13616d.m55261a() || !((Boolean) aVar.mo34038b("admin_permission_mock", false)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final int m39447a(int i) {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        if (i == aVar.mo32555b()) {
            return 6;
        }
        C8275a aVar2 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
        if (i == aVar2.mo32555b()) {
            return 7;
        }
        C8275a aVar3 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
        if (i == aVar3.mo32555b()) {
            return 9;
        }
        C8275a aVar4 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.FILE");
        if (i == aVar4.mo32555b()) {
            return 10;
        }
        C8275a aVar5 = C8275a.f22376i;
        Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.SLIDE");
        if (i == aVar5.mo32555b()) {
            return 11;
        }
        C8275a aVar6 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar6, "DocumentType.BITABLE");
        if (i == aVar6.mo32555b()) {
            return 8;
        }
        return 1;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: b */
    public boolean mo36543b(int i, String str) {
        return m39448b(3, m39447a(i), str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: c */
    public boolean mo36544c(int i, String str) {
        return m39448b(4, m39447a(i), str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: d */
    public boolean mo36545d(int i, String str) {
        return m39448b(11, m39447a(i), str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: e */
    public boolean mo36546e(int i, String str) {
        return m39448b(6, m39447a(i), str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: f */
    public boolean mo36547f(int i, String str) {
        return m39448b(13, m39447a(i), str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: a */
    public boolean mo36541a(int i, String str) {
        return m39448b(1, m39447a(i), str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy
    /* renamed from: a */
    public boolean mo36540a(int i, int i2, String str) {
        return m39448b(i2, i2, str);
    }

    /* renamed from: b */
    private final boolean m39448b(int i, int i2, String str) {
        AbstractC9901d dVar;
        boolean z;
        if (m39449c()) {
            return false;
        }
        Integer num = null;
        try {
            dVar = (AbstractC9901d) KoinJavaComponent.m268613a(AbstractC9901d.class, null, null, 6, null);
        } catch (Throwable th) {
            C13479a.m54759a("AdminPermissionProxyImpl", "getAuditManagerFailed", th);
            dVar = null;
        }
        if (dVar != null) {
            num = Integer.valueOf(dVar.mo37704a(i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("syncCheckAuthority, auditManager is null = ");
        if (dVar == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(',');
        sb.append("permissionType =");
        sb.append(i);
        sb.append(", ");
        sb.append("result");
        sb.append(" = ");
        sb.append(num);
        C13479a.m54764b("AdminPermissionProxyImpl", sb.toString());
        if (num == null || num.intValue() != 0) {
            if (num != null && num.intValue() == 1) {
                return false;
            }
            if ((num == null || num.intValue() != 2) && num != null) {
                num.intValue();
            }
        }
        return true;
    }
}
