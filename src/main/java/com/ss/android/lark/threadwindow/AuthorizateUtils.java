package com.ss.android.lark.threadwindow;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/threadwindow/AuthorizateUtils;", "", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.a */
public final class AuthorizateUtils {

    /* renamed from: a */
    public static final Companion f138488a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m217841a(Context context, ErrorResult errorResult) {
        f138488a.mo191009a(context, errorResult);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/threadwindow/AuthorizateUtils$Companion;", "", "()V", "getUploadAuthorizationTip", "", "processError", "", "context", "Landroid/content/Context;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadwindow.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo191008a() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36473g v = b.mo134594v();
            Intrinsics.checkExpressionValueIsNotNull(v, "ChatModuleInstanceHolder…endency().auditDependency");
            String a = v.mo134494a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…cy.uploadAuthorizationTip");
            return a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo191009a(Context context, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (errorResult != null && errorResult.getErrorCode() == 321000) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134594v().mo134495a(context, errorResult.getDisplayMsg(mo191008a()));
            }
        }
    }
}
