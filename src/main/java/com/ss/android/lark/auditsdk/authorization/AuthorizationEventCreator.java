package com.ss.android.lark.auditsdk.authorization;

import com.ss.android.lark.auditsdk.p1378a.C29387b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/AuthorizationEventCreator;", "", "()V", "Companion", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.auditsdk.authorization.b */
public final class AuthorizationEventCreator {

    /* renamed from: a */
    public static final Companion f73481a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/AuthorizationEventCreator$Companion;", "", "()V", "createAuthorizationEventBuilder", "Lcom/ss/android/lark/auditsdk/entity/AuthorizationEventBuilder;", "originKey", "", "defaultPassed", "", "createFileOpenBy3rdAppAuthorizationEvent", "createFileSavedToDriveAuthorizationEvent", "createImageDownloadAuthorizationEvent", "createVideoDownloadAuthorizationEvent", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.authorization.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C29387b mo104085a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            C29387b b = mo104089e(str, z).mo104063a(3).mo104066b(3);
            Intrinsics.checkExpressionValueIsNotNull(b, "createAuthorizationEvent…ager.EntityType.IM_IMAGE)");
            return b;
        }

        @JvmStatic
        /* renamed from: b */
        public final C29387b mo104086b(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            C29387b b = mo104089e(str, z).mo104063a(3).mo104066b(4);
            Intrinsics.checkExpressionValueIsNotNull(b, "createAuthorizationEvent…ager.EntityType.IM_VIDEO)");
            return b;
        }

        @JvmStatic
        /* renamed from: c */
        public final C29387b mo104087c(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            C29387b b = mo104089e(str, z).mo104063a(6).mo104066b(5);
            Intrinsics.checkExpressionValueIsNotNull(b, "createAuthorizationEvent…nager.EntityType.IM_FILE)");
            return b;
        }

        @JvmStatic
        /* renamed from: d */
        public final C29387b mo104088d(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            C29387b b = mo104089e(str, z).mo104063a(11).mo104066b(5);
            Intrinsics.checkExpressionValueIsNotNull(b, "createAuthorizationEvent…nager.EntityType.IM_FILE)");
            return b;
        }

        @JvmStatic
        /* renamed from: e */
        public final C29387b mo104089e(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "originKey");
            C29387b a = new C29387b().mo104064a(str).mo104065a(z);
            Intrinsics.checkExpressionValueIsNotNull(a, "AuthorizationEventBuilde…tionPassed(defaultPassed)");
            return a;
        }
    }
}
