package com.bytedance.ee.bear.integrator.di;

import android.content.Context;
import com.bytedance.ee.bear.integrator.DynamicModuleLoader;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.android.ext.p3513a.C70028a;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.KoinContextHandler;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.p3516a.C70035a;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/integrator/di/KoinSetupTask;", "", "()V", "TAG", "", "initedKoin", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initedModule", "onSetupKoin", "", "context", "Landroid/content/Context;", "onSetupModules", "setupDynamicModule", "setupKoin", "setupKoinModules", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.b.g */
public final class KoinSetupTask {

    /* renamed from: a */
    public static final KoinSetupTask f21300a = new KoinSetupTask();

    /* renamed from: b */
    private static final AtomicBoolean f21301b = new AtomicBoolean();

    /* renamed from: c */
    private static final AtomicBoolean f21302c = new AtomicBoolean();

    private KoinSetupTask() {
    }

    /* renamed from: b */
    private final void m31647b() {
        Module aVar;
        Koin a = KoinContextHandler.f175011a.mo246622a();
        String a2 = a.mo246614a("DynamicModuleLoader");
        C13479a.m54764b("KoinInit", "setupDynamicModule:" + a2);
        if (a2 == null) {
            aVar = C70027b.m268604a(false, false, C7913b.INSTANCE, 3, null);
        } else {
            aVar = C70027b.m268604a(false, false, new C7915c(a2), 3, null);
        }
        a.mo246616a(CollectionsKt.listOf(aVar));
        a.mo246616a(((DynamicModuleLoader) a.mo246615a().mo246686d().mo246699b(Reflection.getOrCreateKotlinClass(DynamicModuleLoader.class), null, null)).mo30699a());
    }

    /* renamed from: a */
    private final void m31645a() {
        C13479a.m54764b("KoinInit", "onSetupModules Start");
        try {
            Koin a = KoinContextHandler.f175011a.mo246622a();
            try {
                a.mo246616a(CollectionsKt.listOf(C7897c.m31641a()));
            } catch (Throwable th) {
                C13479a.m54759a("KoinInit", "load CommonModule", th);
            }
            C13479a.m54764b("KoinInit", "load CommonModule success");
            int i = 0;
            int i2 = 0;
            for (T t : C7896b.m31639a()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                a.mo246616a(CollectionsKt.listOf(t));
                i2 = i3;
            }
            int i4 = 0;
            for (T t2 : C7896b.m31640b()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                a.mo246616a(CollectionsKt.listOf(t2));
                i4 = i5;
            }
            for (T t3 : C7910d.m31643a()) {
                int i6 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                a.mo246616a(CollectionsKt.listOf(t3));
                i = i6;
            }
            m31647b();
        } catch (Throwable th2) {
            C13606d.m55246b("KoinInit", th2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/KoinApplication;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.g$a */
    public static final class C7912a extends Lambda implements Function1<KoinApplication, Unit> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7912a(Context context) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KoinApplication bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(KoinApplication bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            new KoinLogger();
            C70028a.m268605a(bVar, this.$context);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.g$b */
    public static final class C7913b extends Lambda implements Function1<Module, Unit> {
        public static final C7913b INSTANCE = new C7913b();

        C7913b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(Module aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a = aVar.mo246637a();
            Options a2 = aVar.mo246636a(false, false);
            List emptyList = CollectionsKt.emptyList();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DynamicModuleLoader.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, C79141.INSTANCE, Kind.Single, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.g$c */
    public static final class C7915c extends Lambda implements Function1<Module, Unit> {
        final /* synthetic */ String $dynamicModuleLoaderClass;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7915c(String str) {
            super(1);
            this.$dynamicModuleLoaderClass = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(Module aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a = aVar.mo246637a();
            Options a2 = aVar.mo246636a(false, false);
            List emptyList = CollectionsKt.emptyList();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DynamicModuleLoader.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, new Function2<Scope, DefinitionParameters, DynamicModuleLoader>(this) {
                /* class com.bytedance.ee.bear.integrator.di.KoinSetupTask.C7915c.C79161 */
                final /* synthetic */ C7915c this$0;

                {
                    this.this$0 = r1;
                }

                public final DynamicModuleLoader invoke(Scope aVar, DefinitionParameters aVar2) {
                    Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                    Intrinsics.checkParameterIsNotNull(aVar2, "it");
                    Object newInstance = Class.forName(this.this$0.$dynamicModuleLoaderClass).newInstance();
                    if (newInstance != null) {
                        return (DynamicModuleLoader) newInstance;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.integrator.DynamicModuleLoader");
                }
            }, Kind.Single, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m31646a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (f21301b.compareAndSet(false, true)) {
            f21300a.m31649c(context);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m31648b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (f21302c.compareAndSet(false, true)) {
            f21300a.m31645a();
        }
    }

    /* renamed from: c */
    private final void m31649c(Context context) {
        try {
            C13479a.m54764b("KoinInit", "onSetupKoin Start");
            C70035a.m268623a(null, new C7912a(context), 1, null);
            C13479a.m54764b("KoinInit", "onSetupKoin End");
        } catch (Throwable th) {
            C13606d.m55246b("KoinInit", th);
        }
    }
}
