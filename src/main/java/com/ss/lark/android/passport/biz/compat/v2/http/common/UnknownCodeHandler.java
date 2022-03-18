package com.ss.lark.android.passport.biz.compat.v2.http.common;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "老模型使用，新账号请使用 infra中的 UnknownCodeHandler")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ+\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/UnknownCodeHandler;", "", "()V", "handleAfterLoginError", "", "context", "Landroid/content/Context;", "siginResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleBeforeLoginError", "handleCommonLoginError", "beforeLogin", "(Landroid/content/Context;Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;Ljava/lang/Boolean;)Z", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.j */
public final class UnknownCodeHandler {

    /* renamed from: a */
    public static final UnknownCodeHandler f162912a = new UnknownCodeHandler();

    private UnknownCodeHandler() {
    }

    /* renamed from: a */
    public final boolean mo223191a(Context context, NetworkErrorResult networkErrorResult) {
        return m253518a(context, networkErrorResult, true);
    }

    /* renamed from: a */
    private final boolean m253518a(Context context, NetworkErrorResult networkErrorResult, Boolean bool) {
        if (!(networkErrorResult == null || context == null)) {
            int errorCode = networkErrorResult.getErrorCode();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C64524d.m253498b());
            if (bool != null && bool.booleanValue()) {
                arrayList.addAll(C64524d.m253497a());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC64511a aVar = (AbstractC64511a) it.next();
                CodeHandlerHelper cVar = CodeHandlerHelper.f162907a;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "handler");
                Integer a = cVar.mo223186a(aVar);
                if (a != null && errorCode == a.intValue()) {
                    return false;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(C64524d.m253499c());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC64511a aVar2 = (AbstractC64511a) it2.next();
                CodeHandlerHelper cVar2 = CodeHandlerHelper.f162907a;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "handler");
                Integer a2 = cVar2.mo223186a(aVar2);
                if (a2 != null && errorCode == a2.intValue()) {
                    aVar2.mo223175a(context, networkErrorResult);
                    return true;
                }
            }
            C64340b a3 = C64340b.m252955a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "SigninManager.getInstance()");
            Context b = a3.mo222860b();
            if (b != null) {
                String a4 = C49069a.m193382a(b, networkErrorResult);
                if (!TextUtils.isEmpty(a4)) {
                    LKUIToast.show(b, a4);
                    return true;
                }
            }
        }
        return false;
    }
}
