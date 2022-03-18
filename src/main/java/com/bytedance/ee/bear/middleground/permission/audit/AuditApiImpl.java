package com.bytedance.ee.bear.middleground.permission.audit;

import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.audit.C29282a;
import com.ss.android.lark.audit.model.Env;
import com.ss.android.lark.audit.model.Extend;
import com.ss.android.lark.audit.model.ObjectDetail;
import com.ss.android.lark.audit.model.ObjectEntity;
import com.ss.android.lark.audit.model.OperatorEntity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J8\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016JC\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u001aR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/audit/AuditApiImpl;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/IAuditApi;", "()V", "infoService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "getInfoService", "()Lcom/bytedance/ee/bear/contract/InfoProvideService;", "infoService$delegate", "Lkotlin/Lazy;", "doAudit", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "operationType", "", "token", "", "appDetail", "containerType", "containerId", "moduleType", "appFileId", "appId", "localFile", "", "thirdPartyAppID", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.d.a */
public final class AuditApiImpl implements IAuditApi {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26788a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AuditApiImpl.class), "infoService", "getInfoService()Lcom/bytedance/ee/bear/contract/InfoProvideService;"))};

    /* renamed from: b */
    public static final Companion f26789b = new Companion(null);

    /* renamed from: c */
    private final Lazy f26790c = LazyKt.lazy(C9898b.INSTANCE);

    /* renamed from: a */
    private final al m41200a() {
        Lazy lazy = this.f26790c;
        KProperty kProperty = f26788a[0];
        return (al) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/audit/AuditApiImpl$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.d.a$b */
    static final class C9898b extends Lambda implements Function0<al> {
        public static final C9898b INSTANCE = new C9898b();

        C9898b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final al invoke() {
            return C4511g.m18594d();
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi
    /* renamed from: a */
    public void mo37701a(int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "appFileId");
        mo37702a(i, i2, (String) null, str, (Boolean) false, (String) null);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi
    /* renamed from: a */
    public void mo37702a(int i, int i2, String str, String str2, Boolean bool, String str3) {
        ObjectDetail objectDetail;
        Intrinsics.checkParameterIsNotNull(str2, "appFileId");
        C13479a.m54772d("AuditApiImpl", "do audit for drive. moduleType: " + i + ", operationType: " + i2 + ", " + "appId: " + str + ", appFileId: " + str2 + ", localFile: " + bool + ", thirdPartyAppID:" + str3);
        AbstractC9901d a = AuditUtils.f26792a.mo37711a();
        if (a != null) {
            C29282a b = new C29282a().mo103796a(i).mo103804b(i2);
            ObjectEntity[] objectEntityArr = new ObjectEntity[1];
            int a2 = AuditUtils.f26792a.mo37710a(str, str2, bool);
            String b2 = AuditUtils.f26792a.mo37713b(str, str2, bool);
            if (str3 != null) {
                objectDetail = new ObjectDetail(null, null, null, str3, 0);
            } else {
                objectDetail = null;
            }
            objectEntityArr[0] = new ObjectEntity(a2, b2, objectDetail);
            a.mo37706a(b.mo103802a(CollectionsKt.mutableListOf(objectEntityArr)).mo103801a(m41200a().mo17354O()).mo103800a(new OperatorEntity(1, m41200a().mo17356e(), null)).mo103798a(new Env(2, m41200a().mo17369s(), "", m41200a().mo17352M(), "", 0)).mo103797a(System.currentTimeMillis()).mo103803a());
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi
    /* renamed from: a */
    public void mo37703a(C8275a aVar, int i, String str, int i2, int i3, String str2) {
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "containerId");
        AbstractC9901d a = AuditUtils.f26792a.mo37711a();
        if (a != null) {
            C29282a b = new C29282a().mo103796a(AuditUtils.f26792a.mo37712b(aVar)).mo103804b(i);
            int a2 = AuditUtils.f26792a.mo37709a(aVar);
            ObjectDetail objectDetail = new ObjectDetail();
            objectDetail.containerType = i3;
            objectDetail.containerID = str2;
            C29282a a3 = b.mo103802a(CollectionsKt.mutableListOf(new ObjectEntity(a2, str, objectDetail))).mo103801a(m41200a().mo17354O()).mo103800a(new OperatorEntity(1, m41200a().mo17356e(), null)).mo103798a(new Env(2, m41200a().mo17369s(), "", m41200a().mo17352M(), "", 0)).mo103797a(System.currentTimeMillis());
            Extend extend = new Extend();
            extend.appDetail = i2;
            a.mo37706a(a3.mo103799a(extend).mo103803a());
        }
    }
}
