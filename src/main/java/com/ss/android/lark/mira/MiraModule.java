package com.ss.android.lark.mira;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mira/MiraModule;", "", "()V", "Companion", "frameworks_mira_mira-off_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.r.c */
public final class MiraModule {

    /* renamed from: a */
    public static final Companion f130883a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final Resources m205155a(Context context) {
        return f130883a.mo180971a(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Boolean m205156a(Application application, Function1<? super Resources, ? extends Resources> function1) {
        return f130883a.mo180972a(application, function1);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m205157a(Application application) {
        f130883a.mo180974a(application);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m205158a(String str) {
        f130883a.mo180976a(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m205159a(String str, IPluginInstallCallback bVar) {
        f130883a.mo180977a(str, bVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> void m205160a(String str, Class<T> cls, String str2, UIGetPluginCallback<T> dVar) {
        f130883a.mo180978a(str, cls, str2, dVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m205161a(String str, String str2) {
        return f130883a.mo180979a(str, str2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m205162b(String str) {
        f130883a.mo180980b(str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m205163c(String str) {
        return f130883a.mo180981c(str);
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m205164d(String str) {
        return f130883a.mo180982d(str);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m205165e(String str) {
        f130883a.mo180983e(str);
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m205166f(String str) {
        return f130883a.mo180984f(str);
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m205167g(String str) {
        return f130883a.mo180985g(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0007J@\u0010\u000e\u001a\u00020\b\"\b\b\u0000\u0010\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\u0015H\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010%\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0007J\u0010\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020)H\u0007J+\u0010*\u001a\u0004\u0018\u00010\r2\u0006\u0010(\u001a\u00020)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190,H\u0007¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/mira/MiraModule$Companion;", "", "()V", "TAG", "", "sDependency", "Lcom/ss/android/lark/mira/IMiraModuleDependency;", "downloadAndInstallPlugin", "", "pluginPackageName", "getDependency", "getFeatureConfigMap", "Ljava/util/HashMap;", "", "getPluginClaymoreService", "T", "pluginName", "serviceInterface", "Ljava/lang/Class;", "serviceImpl", "callback", "Lcom/ss/android/lark/mira/UIGetPluginCallback;", "getPluginNativeLibraryDir", "getSourceFile", "getSystemResource", "Landroid/content/res/Resources;", "context", "Landroid/content/Context;", "hookClassLoader", "from", "init", "dependency", "installPlugin", "Lcom/ss/android/lark/mira/IPluginInstallCallback;", "isPluginInstalled", "isPluginLoaded", "loadPlugin", "loadPluginSo", "libraryName", "replaceApplicationRes", "application", "Landroid/app/Application;", "replaceMiraAppResources", "resourcesProvider", "Lkotlin/Function1;", "(Landroid/app/Application;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "start", "frameworks_mira_mira-off_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.r.c$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final Boolean mo180972a(Application application, Function1<? super Resources, ? extends Resources> function1) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            Intrinsics.checkParameterIsNotNull(function1, "resourcesProvider");
            return null;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo180973a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo180974a(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo180975a(IMiraModuleDependency aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo180976a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo180977a(String str, IPluginInstallCallback bVar) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
        }

        @JvmStatic
        /* renamed from: a */
        public final <T> void mo180978a(String str, Class<T> cls, String str2, UIGetPluginCallback<T> dVar) {
            Intrinsics.checkParameterIsNotNull(str, "pluginName");
            Intrinsics.checkParameterIsNotNull(cls, "serviceInterface");
            Intrinsics.checkParameterIsNotNull(str2, "serviceImpl");
            Intrinsics.checkParameterIsNotNull(dVar, "callback");
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo180979a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
            Intrinsics.checkParameterIsNotNull(str2, "libraryName");
            return false;
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo180980b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
        }

        @JvmStatic
        /* renamed from: c */
        public final boolean mo180981c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
            return false;
        }

        @JvmStatic
        /* renamed from: d */
        public final boolean mo180982d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
            return false;
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo180983e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "from");
        }

        @JvmStatic
        /* renamed from: f */
        public final String mo180984f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
            return "";
        }

        @JvmStatic
        /* renamed from: g */
        public final String mo180985g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
            return "";
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Resources mo180971a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            return resources;
        }
    }
}
