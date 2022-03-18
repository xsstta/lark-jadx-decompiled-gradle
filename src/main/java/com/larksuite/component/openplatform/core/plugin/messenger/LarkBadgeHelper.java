package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Skip;

@Deprecated(message = "use plugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkBadgeHelper;", "", "()V", "KEY_ID", "", "KEY_UNREAD_COUNT", "TAG", "intentFilter", "Landroid/content/IntentFilter;", "receiver", "com/larksuite/component/openplatform/core/plugin/messenger/LarkBadgeHelper$receiver$1", "Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkBadgeHelper$receiver$1;", "watchSet", "Ljava/util/HashSet;", "Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkBadgeHelper$Ids;", "Lkotlin/collections/HashSet;", "getApiDependency", "Lcom/tt/refer/abs/api/IAPIService$Dependency;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getApiService", "Lcom/tt/refer/abs/api/IAPIService;", "registerBadgeChange", "", "openChatId", "chatId", "unRegisterBadgeChange", "Ids", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.x */
public final class LarkBadgeHelper {

    /* renamed from: a */
    public static final LarkBadgeHelper f61807a = new LarkBadgeHelper();

    /* renamed from: b */
    private static HashSet<Ids> f61808b = new HashSet<>();

    /* renamed from: c */
    private static final LarkBadgeHelper$receiver$1 f61809c = new LarkBadgeHelper$receiver$1();

    /* renamed from: d */
    private static final IntentFilter f61810d = new IntentFilter("com.ss.android.lark.littleapp.badgeChange");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkBadgeHelper$Ids;", "", "openChatId", "", "chatId", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "getAppContext", "()Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "setAppContext", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getOpenChatId", "setOpenChatId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.x$a */
    public static final class Ids {

        /* renamed from: a */
        private String f61811a;

        /* renamed from: b */
        private String f61812b;

        /* renamed from: c */
        private IAppContext f61813c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ids)) {
                return false;
            }
            Ids aVar = (Ids) obj;
            return Intrinsics.areEqual(this.f61811a, aVar.f61811a) && Intrinsics.areEqual(this.f61812b, aVar.f61812b) && Intrinsics.areEqual(this.f61813c, aVar.f61813c);
        }

        public int hashCode() {
            String str = this.f61811a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f61812b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            IAppContext iAppContext = this.f61813c;
            if (iAppContext != null) {
                i = iAppContext.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Ids(openChatId=" + this.f61811a + ", chatId=" + this.f61812b + ", appContext=" + this.f61813c + ")";
        }

        /* renamed from: a */
        public final String mo88428a() {
            return this.f61811a;
        }

        /* renamed from: b */
        public final String mo88429b() {
            return this.f61812b;
        }

        /* renamed from: c */
        public final IAppContext mo88430c() {
            return this.f61813c;
        }

        public Ids(String str, String str2, IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(str, "openChatId");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            this.f61811a = str;
            this.f61812b = str2;
            this.f61813c = iAppContext;
        }
    }

    private LarkBadgeHelper() {
    }

    /* renamed from: b */
    public final AbstractC67709b.AbstractC67710a mo88427b(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        return (AbstractC67709b.AbstractC67710a) mo88424a(iAppContext).mo235130i();
    }

    /* renamed from: a */
    public final AbstractC67709b mo88424a(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67709b.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…(IAPIService::class.java)");
        return (AbstractC67709b) findServiceByInterface;
    }

    /* renamed from: a */
    public final void mo88425a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "openChatId");
        for (T t : f61808b) {
            if (Intrinsics.areEqual(t.mo88428a(), str)) {
                LarkExtensionManager instance = LarkExtensionManager.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
                instance.getExtension().mo49581c(t.mo88429b());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : f61808b) {
            if (!Intrinsics.areEqual(t2.mo88428a(), str)) {
                arrayList.add(t2);
            }
        }
        HashSet<Ids> hashSet = CollectionsKt.toHashSet(arrayList);
        f61808b = hashSet;
        if (hashSet.isEmpty()) {
            AppbrandContext inst = AppbrandContext.getInst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
            inst.getApplicationContext().unregisterReceiver(f61809c);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m90801a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo88426a(String str, String str2, IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(str, "openChatId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        f61808b.add(new Ids(str, str2, iAppContext));
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        instance.getExtension().mo49580b(str2);
        AppbrandContext inst = AppbrandContext.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
        m90801a(inst.getApplicationContext(), f61809c, f61810d);
    }
}
