package com.ss.android.lark.passport.infra.base.network.handler;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.passport.infra.base.network.manager.RequestConfig;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J+\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/UnknownCodeHandler;", "", "()V", "handleAfterLoginError", "", "context", "Landroid/content/Context;", "siginResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleBeforeLoginError", "handleCommonLoginError", "beforeLogin", "(Landroid/content/Context;Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;Ljava/lang/Boolean;)Z", "handleError", "networkErrorResult", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.m */
public final class UnknownCodeHandler {

    /* renamed from: a */
    public static final UnknownCodeHandler f123256a = new UnknownCodeHandler();

    private UnknownCodeHandler() {
    }

    @Deprecated(message = "请使用handleError")
    /* renamed from: a */
    public final boolean mo171329a(Context context, NetworkErrorResult networkErrorResult) {
        return m193434a(context, networkErrorResult, true);
    }

    @Deprecated(message = "请使用handleError")
    /* renamed from: b */
    public final boolean mo171330b(Context context, NetworkErrorResult networkErrorResult) {
        return m193434a(context, networkErrorResult, false);
    }

    /* renamed from: c */
    public final boolean mo171331c(Context context, NetworkErrorResult networkErrorResult) {
        if (ServiceFinder.m193748c().isLogin()) {
            return m193434a(context, networkErrorResult, false);
        }
        return m193434a(context, networkErrorResult, true);
    }

    /* renamed from: a */
    private final boolean m193434a(Context context, NetworkErrorResult networkErrorResult, Boolean bool) {
        if (!(networkErrorResult == null || context == null)) {
            int errorCode = networkErrorResult.getErrorCode();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(RequestConfig.f123273a.mo171352b());
            if (bool != null && bool.booleanValue()) {
                arrayList.addAll(RequestConfig.f123273a.mo171351a());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ICommonCodeHandler bVar = (ICommonCodeHandler) it.next();
                CodeHandlerHelper eVar = CodeHandlerHelper.f123246a;
                Intrinsics.checkExpressionValueIsNotNull(bVar, "handler");
                Integer a = eVar.mo171324a(bVar);
                if (a != null && errorCode == a.intValue()) {
                    return false;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(RequestConfig.f123273a.mo171353c());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ICommonCodeHandler bVar2 = (ICommonCodeHandler) it2.next();
                CodeHandlerHelper eVar2 = CodeHandlerHelper.f123246a;
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "handler");
                Integer a2 = eVar2.mo171324a(bVar2);
                if (a2 != null && errorCode == a2.intValue()) {
                    bVar2.mo171318a(context, networkErrorResult);
                    return true;
                }
            }
            ICommonService c = ServiceFinder.m193748c();
            if (c != null) {
                String a3 = C49069a.m193382a(c.getApplicationContext(), networkErrorResult);
                if (!TextUtils.isEmpty(a3)) {
                    LKUIToast.show(context, a3);
                    return true;
                }
            }
        }
        return false;
    }
}
