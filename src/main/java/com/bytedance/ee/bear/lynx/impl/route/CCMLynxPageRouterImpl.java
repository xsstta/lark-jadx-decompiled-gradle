package com.bytedance.ee.bear.lynx.impl.route;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ee.bear.lynx.api.CCMLynxEnv;
import com.bytedance.ee.bear.lynx.api.CCMLynxPageRouter;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ies.bullet.service.base.IRouterService;
import com.bytedance.ies.bullet.service.base.impl.ServiceCenter;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\rH\u0016J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/route/CCMLynxPageRouterImpl;", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxPageRouter;", "()V", "openPage", "", "context", "Landroid/content/Context;", "pageType", "", "templateData", "Ljava/util/HashMap;", "", "Ljava/io/Serializable;", "Lkotlin/collections/HashMap;", "templateUrl", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.b.a */
public final class CCMLynxPageRouterImpl implements CCMLynxPageRouter {
    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxPageRouter
    /* renamed from: a */
    public boolean mo33879a(Context context, String str, HashMap<String, Serializable> hashMap) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "templateUrl");
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        ((CCMLynxEnv) KoinJavaComponent.m268613a(CCMLynxEnv.class, null, null, 6, null)).mo33880a(application);
        Bundle bundle = new Bundle();
        bundle.putSerializable("template-data-bundle-key", hashMap);
        IRouterService gVar = (IRouterService) ServiceCenter.f37850b.mo52643a().mo52635a("ccm-lynx-bid", IRouterService.class);
        if (gVar == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(templateUrl)");
        return IRouterService.C14416a.m58057a(gVar, context, parse, bundle, null, null, null, null, SmEvents.EVENT_NW, null);
    }
}
