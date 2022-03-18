package com.ss.android.lark.passport.infra.base.network.handler;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.passport.infra.base.network.manager.RequestConfig;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/AfterLoginUnknownCodeHandler;", "", "()V", "TAG", "", "handleError", "", "context", "Landroid/content/Context;", "sdkResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "extraBizHandler", "", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.a */
public final class AfterLoginUnknownCodeHandler {

    /* renamed from: a */
    public static final AfterLoginUnknownCodeHandler f123240a = new AfterLoginUnknownCodeHandler();

    /* renamed from: b */
    private static final String f123241b = f123241b;

    private AfterLoginUnknownCodeHandler() {
    }

    /* renamed from: a */
    public final boolean mo171317a(Context context, NetworkErrorResult networkErrorResult, List<? extends ICommonCodeHandler> list) {
        if (!(context == null || networkErrorResult == null)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(RequestConfig.f123273a.mo171352b());
            if (list != null) {
                arrayList.addAll(list);
            }
            int errorCode = networkErrorResult.getErrorCode();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ICommonCodeHandler bVar = (ICommonCodeHandler) it.next();
                if (bVar != null) {
                    CodeHandlerHelper eVar = CodeHandlerHelper.f123246a;
                    Intrinsics.checkExpressionValueIsNotNull(bVar, "it");
                    Integer a = eVar.mo171324a(bVar);
                    if (a != null && errorCode == a.intValue()) {
                        return false;
                    }
                } else {
                    PassportLog.f123351c.mo171474a().mo171465b(f123241b, "handler is null");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(RequestConfig.f123273a.mo171353c());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ICommonCodeHandler bVar2 = (ICommonCodeHandler) it2.next();
                if (bVar2 != null) {
                    CodeHandlerHelper eVar2 = CodeHandlerHelper.f123246a;
                    Intrinsics.checkExpressionValueIsNotNull(bVar2, "it");
                    Integer a2 = eVar2.mo171324a(bVar2);
                    if (a2 != null && errorCode == a2.intValue()) {
                        bVar2.mo171318a(context, networkErrorResult);
                        return true;
                    }
                } else {
                    PassportLog.f123351c.mo171474a().mo171465b(f123241b, "handler is null");
                }
                CodeHandlerHelper eVar3 = CodeHandlerHelper.f123246a;
                if (bVar2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "handler!!");
                Integer a3 = eVar3.mo171324a(bVar2);
                if (a3 != null && errorCode == a3.intValue()) {
                    bVar2.mo171318a(context, networkErrorResult);
                    return true;
                }
            }
            String a4 = C49069a.m193382a(context, networkErrorResult);
            if (!TextUtils.isEmpty(a4)) {
                LKUIToast.show(context, a4);
                return true;
            }
        }
        return false;
    }
}
