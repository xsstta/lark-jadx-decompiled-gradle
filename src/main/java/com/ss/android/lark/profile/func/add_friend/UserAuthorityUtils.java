package com.ss.android.lark.profile.func.add_friend;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/UserAuthorityUtils;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.add_friend.g */
public final class UserAuthorityUtils {

    /* renamed from: a */
    public static final Companion f129641a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/UserAuthorityUtils$Companion;", "", "()V", "getLoginUserAuthorityDeniedCode", "", "isUserAuthorityControled", "", "reason", "(Ljava/lang/Integer;)Z", "isUserAuthorityDenied", "errorCode", "onUserAuthenticatedDenied", "", "context", "Landroid/content/Context;", "tip", "", "processError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.g$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo179073a() {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52244a s = d.mo133589s();
            Intrinsics.checkExpressionValueIsNotNull(s, "ProfileModule.getDependency().authorityDependency");
            return s.mo133635a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo179076a(Integer num) {
            if (num == null) {
                return false;
            }
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52244a s = d.mo133589s();
            Intrinsics.checkExpressionValueIsNotNull(s, "ProfileModule.getDependency().authorityDependency");
            int b = s.mo133637b();
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52244a s2 = d2.mo133589s();
            Intrinsics.checkExpressionValueIsNotNull(s2, "ProfileModule.getDependency().authorityDependency");
            int c = s2.mo133638c();
            if (num.intValue() == b || num.intValue() == c) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo179074a(Context context, ErrorResult errorResult) {
            String str;
            Intrinsics.checkParameterIsNotNull(context, "context");
            String str2 = null;
            if (errorResult != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                IProfileModuleDependency.AbstractC52244a s = d.mo133589s();
                Intrinsics.checkExpressionValueIsNotNull(s, "ProfileModule.getDependency().authorityDependency");
                str = errorResult.getDisplayMsg(s.mo133639d());
            } else {
                str = null;
            }
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52244a s2 = d2.mo133589s();
            if (errorResult != null) {
                str2 = errorResult.getDisplayMsg(str);
            }
            s2.mo133636a(context, str2);
        }

        /* renamed from: a */
        public final void mo179075a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133589s().mo133636a(context, str);
        }
    }
}
