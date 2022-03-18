package com.ss.android.lark.integrator.helpdesk;

import android.content.Context;
import android.view.View;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import com.ss.android.lark.helpdesk_api.IHelpdeskApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(IHelpdeskApi.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/integrator/helpdesk/HelpdeskApiImpl;", "Lcom/ss/android/lark/helpdesk_api/IHelpdeskApi;", "()V", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "context", "Landroid/content/Context;", "getKbTopExtendData", "", "targetId", "targetType", "", "containerTag", "getKbTopView", "Landroid/view/View;", "initRecycleViewData", "registerKbTopExtendControl", "kbTopExtendListener", "Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "registerKbTopExtendPush", "unRegisterKbTopExtendPush", "helpdesk_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class HelpdeskApiImpl implements IHelpdeskApi {
    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public void registerKbTopExtendPush() {
        C39421a.m155663a().mo141939b();
    }

    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public void unRegisterKbTopExtendPush() {
        C39421a.m155663a().mo141940c();
    }

    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context) {
        Map<String, AbstractC29186b> a = C39421a.m155663a().mo141934a(context);
        Intrinsics.checkExpressionValueIsNotNull(a, "HelpdeskModuleProvider.g…tAppLinkHandlers(context)");
        return a;
    }

    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public View getKbTopView(Context context) {
        View b = C39421a.m155663a().mo141938b(context);
        Intrinsics.checkExpressionValueIsNotNull(b, "HelpdeskModuleProvider.g…).getKbTopExtend(context)");
        return b;
    }

    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public void initRecycleViewData(Context context, String str) {
        C39421a.m155663a().mo141935a(context, str);
    }

    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public void registerKbTopExtendControl(KbTopExtendControl aVar, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C39421a.m155663a().mo141936a(aVar, context);
    }

    @Override // com.ss.android.lark.helpdesk_api.IHelpdeskApi
    public void getKbTopExtendData(String str, int i, int i2, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        C39421a.m155663a().mo141937a(str, i, i2, str2);
    }
}
