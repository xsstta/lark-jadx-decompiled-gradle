package com.bytedance.ee.bear.document.security;

import android.content.Context;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.util.p701d.C13616d;
import com.larksuite.framework.utils.C26284k;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/security/SecurityUtils;", "", "()V", "isDebugEnabled", "", "context", "Landroid/content/Context;", "infoProvideService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.j.a */
public final class SecurityUtils {

    /* renamed from: a */
    public static final SecurityUtils f16400a = new SecurityUtils();

    private SecurityUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m23555a(Context context, al alVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(alVar, "infoProvideService");
        boolean a = C13616d.m55262a(context);
        String n = alVar.mo17364n();
        Intrinsics.checkExpressionValueIsNotNull(n, "infoProvideService.versionName");
        if (n != null) {
            String lowerCase = n.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            String p = alVar.mo17366p();
            String str = lowerCase;
            boolean contains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "alpha", false, 2, (Object) null);
            boolean contains$default2 = StringsKt.contains$default((CharSequence) str, (CharSequence) "beta", false, 2, (Object) null);
            Intrinsics.checkExpressionValueIsNotNull(p, "packageName");
            boolean contains$default3 = StringsKt.contains$default((CharSequence) p, (CharSequence) "lark.debug", false, 2, (Object) null);
            boolean a2 = C4211a.m17514a().mo16536a("spacekit.mobile.enable_docs_debug", false);
            if (a || contains$default || contains$default2 || contains$default3 || a2 || C26284k.m95185a(context)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
