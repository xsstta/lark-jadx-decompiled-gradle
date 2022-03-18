package com.ss.android.lark.auditsdk.authorization;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.lark.auditsdk.p1379b.C29393b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService;", "Lcom/ss/android/lark/auditsdk/authorization/IAuthorizationService;", "()V", "checkFileOpenIn3rdAppAuthorization", "", "originKey", "", "defaultPassed", "checkFileSavedToDriveAuthorization", "checkImageDownloadAuthorization", "checkVideoDownloadAuthorization", "getAuditDisplayMsg", "actionResId", "", "getLoginUserAuthorityDeniedCode", "getLoginUserAuthorityDeniedReason", "getOtherUserAuthorityDeniedCode", "getOtherUserAuthorityDeniedReason", "getUploadAuthorizationTip", "getUserAuthorityControledTip", "onCheckedAuthorizationFailed", "", "context", "Landroid/content/Context;", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "displayMsg", "onCheckedAuthorizationFailedToast", "Companion", "UserAuthority", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AuthorizationService implements IAuthorizationService {

    /* renamed from: a */
    public static final Lazy f73470a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C29388b.INSTANCE);

    /* renamed from: b */
    public static final Companion f73471b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService$UserAuthority;", "", "Companion", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention
    public @interface UserAuthority {
        public static final Companion Companion = Companion.f73472a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService$UserAuthority$Companion;", "", "()V", "LOGIN_USER_DENIED_CODE", "", "LOGIN_USER_DENIED_REASON", "OTHER_USER_DENIED_CODE", "OTHER_USER_DENIED_REASON", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.auditsdk.authorization.AuthorizationService$UserAuthority$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f73472a = new Companion();

            private Companion() {
            }
        }
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: c */
    public int mo104075c() {
        return 260008;
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: d */
    public int mo104077d() {
        return 260009;
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: e */
    public int mo104079e() {
        return 10;
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: f */
    public int mo104080f() {
        return 11;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService;", "getInstance", "()Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService;", "instance$delegate", "Lkotlin/Lazy;", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.authorization.AuthorizationService$a */
    public static final class Companion {
        /* renamed from: a */
        public final AuthorizationService mo104081a() {
            Lazy lazy = AuthorizationService.f73470a;
            Companion aVar = AuthorizationService.f73471b;
            return (AuthorizationService) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthorizationService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/auditsdk/authorization/AuthorizationService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.authorization.AuthorizationService$b */
    static final class C29388b extends Lambda implements Function0<AuthorizationService> {
        public static final C29388b INSTANCE = new C29388b();

        C29388b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AuthorizationService invoke() {
            return new AuthorizationService(null);
        }
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: a */
    public String mo104067a() {
        C29393b a = C29393b.m108086a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AuditSdk.instance()");
        String d = a.mo104123d();
        Intrinsics.checkExpressionValueIsNotNull(d, "AuditSdk.instance().uploadAuthorizationTip");
        return d;
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: b */
    public String mo104073b() {
        C29393b a = C29393b.m108086a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AuditSdk.instance()");
        String c = a.mo104122c();
        Intrinsics.checkExpressionValueIsNotNull(c, "AuditSdk.instance().userAuthorityControledTip");
        return c;
    }

    public /* synthetic */ AuthorizationService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: a */
    public String mo104068a(int i) {
        String a = C29393b.m108086a().mo104115a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "AuditSdk.instance().getA…itDisplayMsg(actionResId)");
        return a;
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: c */
    public boolean mo104076c(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "originKey");
        return C29393b.m108086a().mo104120a(AuthorizationEventCreator.f73481a.mo104088d(str, z));
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: d */
    public boolean mo104078d(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "originKey");
        return C29393b.m108086a().mo104120a(AuthorizationEventCreator.f73481a.mo104087c(str, z));
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: a */
    public void mo104069a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C29393b.m108086a().mo104116a(context, i);
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: b */
    public boolean mo104074b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "originKey");
        return C29393b.m108086a().mo104120a(AuthorizationEventCreator.f73481a.mo104086b(str, z));
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: a */
    public boolean mo104072a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "originKey");
        return C29393b.m108086a().mo104120a(AuthorizationEventCreator.f73481a.mo104085a(str, z));
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: a */
    public void mo104070a(Context context, int i, DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C29393b.m108086a().mo104117a(context, i, onDismissListener);
    }

    @Override // com.ss.android.lark.auditsdk.authorization.IAuthorizationService
    /* renamed from: a */
    public void mo104071a(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C29393b.m108086a().mo104118a(context, str, onDismissListener);
    }
}
