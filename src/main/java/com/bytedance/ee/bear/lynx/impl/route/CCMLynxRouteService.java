package com.bytedance.ee.bear.lynx.impl.route;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ee.bear.lynx.impl.page.CCMLynxPageActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ies.bullet.service.base.IRouterService;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J¡\u0001\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172%\u0010\u001a\u001a!\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u001bj\u0002`\u001e2:\u0010\u001f\u001a6\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00100 j\u0002`\"H\u0016¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/route/CCMLynxRouteService;", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/IRouterService;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "close", "", "containerId", "", "getTargetActivityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "gotoPage", "", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "open", "packageNames", "", "hooks", "Lcom/bytedance/ies/bullet/service/base/IConvertHook;", "onPreOpen", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/bytedance/ies/bullet/service/base/PreOpenHook;", "onPostOpen", "Lkotlin/Function2;", "success", "Lcom/bytedance/ies/bullet/service/base/PostOpenHook;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.b.b */
public final class CCMLynxRouteService extends BaseBulletService implements IRouterService {

    /* renamed from: a */
    public static final Companion f23749a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/route/CCMLynxRouteService$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final Class<? extends Activity> m36998a(Uri uri) {
        return CCMLynxPageActivity.class;
    }

    public CCMLynxRouteService(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        RouteStackManager.f23751c.mo33898a().mo33895a(application);
    }

    /* renamed from: a */
    private final void m36999a(Context context, Uri uri, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, m36998a(uri)));
        intent.setData(uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override // com.bytedance.ies.bullet.service.base.IRouterService
    /* renamed from: a */
    public boolean mo33894a(Context context, Uri uri, Bundle bundle, List<String> list, List<? extends Object> list2, Function1<? super Uri, Unit> function1, Function2<? super Uri, ? super Boolean, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        Intrinsics.checkParameterIsNotNull(list, "packageNames");
        Intrinsics.checkParameterIsNotNull(function1, "onPreOpen");
        Intrinsics.checkParameterIsNotNull(kVar, "onPostOpen");
        if (TemplateUrlUtils.f23758a.mo33908a(uri) || TemplateUrlUtils.f23758a.mo33910b(uri)) {
            function1.invoke(uri);
            m36999a(context, uri, bundle);
            kVar.invoke(uri, true);
            return true;
        }
        C13479a.m54775e("CCMLynxRouteService", "uri is invalid : " + uri);
        return false;
    }
}
