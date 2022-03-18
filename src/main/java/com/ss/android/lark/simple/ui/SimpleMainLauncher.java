package com.ss.android.lark.simple.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.simple.SimpleModule;
import com.ss.android.lark.simple.web.SimpleModeUrlParam;
import com.ss.android.lark.simple.web.SimpleWebViewDelegate;
import com.ss.android.lark.simple.web.api.LogoutJsApiHandler;
import com.ss.android.lark.simple.web.api.OpenUrlJsApiHandler;
import com.ss.android.lark.simple.web.api.SimpleModeSwitchJsApiHandler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/simple/ui/SimpleMainLauncher;", "Lcom/ss/android/lark/simple/ui/ISimpleMainLauncher;", "()V", "launch", "", "context", "Landroid/content/Context;", "launchFromLogin", "launchSimpleWeb", "url", "", "Companion", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.simple.ui.b */
public final class SimpleMainLauncher implements ISimpleMainLauncher {

    /* renamed from: b */
    public static final Lazy f135498b = LazyKt.lazy(C54891b.INSTANCE);

    /* renamed from: c */
    public static final Companion f135499c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/simple/ui/SimpleMainLauncher$Companion;", "", "()V", "mBrowserDependency", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "getMBrowserDependency", "()Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "mBrowserDependency$delegate", "Lkotlin/Lazy;", "createUrlParam", "Lcom/ss/android/lark/simple/web/SimpleModeUrlParam;", "bundle", "Landroid/os/Bundle;", "showTitle", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f135500a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "mBrowserDependency", "getMBrowserDependency()Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SimpleModeUrlParam mo187171a(Bundle bundle, boolean z) {
            C25830a aVar = new C25830a(false);
            aVar.mo91891a("biz.basicmode.closeBasicMode", new SimpleModeSwitchJsApiHandler());
            aVar.mo91891a("biz.basicmode.openWebview", new OpenUrlJsApiHandler());
            aVar.mo91891a("biz.basicmode.logout", new LogoutJsApiHandler());
            aVar.mo91890a(new SimpleWebViewDelegate());
            return new SimpleModeUrlParam.Builder().mo187187a(aVar).mo187190b(true).mo187191c(true).mo187188a(z).mo187186a(bundle).mo187189a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.b$b */
    static final class C54891b extends Lambda implements Function0<SimpleModule.IBrowserDependency> {
        public static final C54891b INSTANCE = new C54891b();

        C54891b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleModule.IBrowserDependency invoke() {
            SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
            if (a != null) {
                return a.mo187091b();
            }
            return null;
        }
    }

    @Override // com.ss.android.lark.simple.ui.ISimpleMainLauncher
    /* renamed from: a */
    public void mo187160a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, SimpleMainActivity.class);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        intent.putExtra("key_source_from", 0);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo187170a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intent intent = new Intent(context, SimpleWebActivity.class);
        intent.putExtra("key_load_url", str);
        context.startActivity(intent);
    }
}
