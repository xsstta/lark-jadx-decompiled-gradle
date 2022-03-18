package com.ss.android.lark.auditsdk.wrapper;

import com.ss.android.lark.auditsdk.IAuditService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/AuditService;", "Lcom/ss/android/lark/auditsdk/IAuditService;", "()V", "auditFileDownload", "", "key", "", "auditFileOpenBy3rdApp", "auditImageDownload", "auditLinkEvent", "url", "auditMediaDownload", "auditOpenMiniAppEvent", "appId", "auditScreenRecordingEvent", "currentPage", "auditScreenShotEvent", "initAuditSdk", "Companion", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.auditsdk.b.c */
public final class AuditService implements IAuditService {

    /* renamed from: a */
    public static final Lazy f73497a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C29400b.INSTANCE);

    /* renamed from: b */
    public static final Companion f73498b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/AuditService$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/auditsdk/wrapper/AuditService;", "getInstance", "()Lcom/ss/android/lark/auditsdk/wrapper/AuditService;", "instance$delegate", "Lkotlin/Lazy;", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.c$a */
    public static final class Companion {
        /* renamed from: a */
        public final AuditService mo104137a() {
            Lazy lazy = AuditService.f73497a;
            Companion aVar = AuditService.f73498b;
            return (AuditService) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuditService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/auditsdk/wrapper/AuditService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.c$b */
    static final class C29400b extends Lambda implements Function0<AuditService> {
        public static final C29400b INSTANCE = new C29400b();

        C29400b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AuditService invoke() {
            return new AuditService(null);
        }
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: a */
    public void mo104128a() {
        C29393b.m108086a().mo104121b();
    }

    public /* synthetic */ AuditService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: a */
    public void mo104129a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104107a(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: b */
    public void mo104130b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104108b(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: c */
    public void mo104131c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104109c(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: d */
    public void mo104132d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104110d(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: e */
    public void mo104133e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104111e(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: f */
    public void mo104134f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "appId");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104112f(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: g */
    public void mo104135g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "currentPage");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104113g(str));
    }

    @Override // com.ss.android.lark.auditsdk.IAuditService
    /* renamed from: h */
    public void mo104136h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "currentPage");
        C29393b.m108086a().mo104119a(AuditEventCreator.f73482a.mo104114h(str));
    }
}
