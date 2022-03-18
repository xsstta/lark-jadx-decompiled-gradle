package com.ss.android.lark.main.app.tab;

import android.content.Context;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44325i;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.maincore.dto.TabInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/main/app/tab/TabPreloadController;", "", "()V", "TAG", "", "preload", "", "context", "Landroid/content/Context;", "preloadFunc", "Lkotlin/Function1;", "Lcom/ss/android/lark/main/dependency/IMainModuleDependency$TabPageItem$ITabPagePreloader;", "fallbackFunc", "preloadTabPageData", "preloadTabPageView", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.u */
public final class TabPreloadController {

    /* renamed from: a */
    public static final TabPreloadController f112609a = new TabPreloadController();

    private TabPreloadController() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "preloader", "Lcom/ss/android/lark/main/dependency/IMainModuleDependency$TabPageItem$ITabPagePreloader;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.u$a */
    public static final class C44385a extends Lambda implements Function1<AbstractC44136a.C44142ac.AbstractC44144b, Unit> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44385a(Context context) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC44136a.C44142ac.AbstractC44144b bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(AbstractC44136a.C44142ac.AbstractC44144b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "preloader");
            bVar.mo133368a(this.$context);
            Log.m165389i("MainModule_TabPreloadController", "preloadData");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tabKey", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.u$b */
    public static final class C44386b extends Lambda implements Function1<String, Unit> {
        public static final C44386b INSTANCE = new C44386b();

        C44386b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tabKey");
            C44325i.m175831a().mo157442a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "preloader", "Lcom/ss/android/lark/main/dependency/IMainModuleDependency$TabPageItem$ITabPagePreloader;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.u$c */
    public static final class C44387c extends Lambda implements Function1<AbstractC44136a.C44142ac.AbstractC44144b, Unit> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44387c(Context context) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC44136a.C44142ac.AbstractC44144b bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(AbstractC44136a.C44142ac.AbstractC44144b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "preloader");
            bVar.mo133369b(this.$context);
            Log.m165389i("MainModule_TabPreloadController", "preloadView");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tabKey", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.u$d */
    public static final class C44388d extends Lambda implements Function1<String, Unit> {
        public static final C44388d INSTANCE = new C44388d();

        C44388d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(final String str) {
            Intrinsics.checkParameterIsNotNull(str, "tabKey");
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.tab.TabPreloadController.C44388d.RunnableC443891 */

                public final void run() {
                    C44325i.m175831a().mo157445b(str);
                    C44325i.m175831a().mo157448c(str);
                }
            });
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m176133a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!C44373s.m176069a().mo157641c()) {
            AbstractC44136a a = C44134a.m174959a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
            a.mo133240c().mo133276b();
            Log.m165383e("MainModule_TabPreloadController", "preloadData hasLocalTabInfos false");
            return;
        }
        m176134a(context, new C44385a(context), C44386b.INSTANCE);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m176135b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!C44373s.m176069a().mo157641c()) {
            Log.m165383e("MainModule_TabPreloadController", "preloadView hasLocalTabInfos false");
        } else {
            m176134a(context, new C44387c(context), C44388d.INSTANCE);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m176134a(Context context, Function1<? super AbstractC44136a.C44142ac.AbstractC44144b, Unit> function1, Function1<? super String, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(function1, "preloadFunc");
        Intrinsics.checkParameterIsNotNull(function12, "fallbackFunc");
        String str = null;
        String str2 = null;
        C44373s a = C44373s.m176069a();
        Intrinsics.checkExpressionValueIsNotNull(a, "TabController.inst()");
        TabInfo b = a.mo157637b();
        Intrinsics.checkExpressionValueIsNotNull(b, "TabController.inst().tabInfos");
        boolean z = false;
        if (!CollectionUtils.isEmpty(b.getMainApps())) {
            Map<String, AbstractC44136a.C44142ac> b2 = C44134a.m174959a().mo133232b(context);
            TabAppInfo tabAppInfo = b.getMainApps().get(0);
            if (tabAppInfo != null) {
                str = tabAppInfo.getKey();
            }
            AbstractC44136a.C44142ac acVar = b2.get(str);
            if (acVar != null) {
                AbstractC44136a.C44142ac.AbstractC44144b e = acVar.mo157132e();
                if (e != null) {
                    function1.invoke(e);
                    z = true;
                    Log.m165389i("MainModule_TabPreloadController", "Do preload " + str2);
                }
                str2 = acVar.mo157127a();
            }
        }
        if (!z && str2 != null) {
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            function12.invoke(str2);
            Log.m165383e("MainModule_TabPreloadController", "Cannot preload " + str2);
        }
    }
}
