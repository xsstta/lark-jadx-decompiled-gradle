package org.koin.android.ext.p3513a;

import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"androidContext", "Lorg/koin/core/KoinApplication;", "Landroid/content/Context;", "androidFileProperties", "koinPropertyFile", "", "androidLogger", "level", "Lorg/koin/core/logger/Level;", "koin-android_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.android.ext.a.a */
public final class C70028a {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: org.koin.android.ext.a.a$a */
    public static final class C70029a extends Lambda implements Function1<Module, Unit> {
        final /* synthetic */ Context $androidContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70029a(Context context) {
            super(1);
            this.$androidContext = context;
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
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Application.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, new Function2<Scope, DefinitionParameters, Application>(this) {
                /* class org.koin.android.ext.p3513a.C70028a.C70029a.C700301 */
                final /* synthetic */ C70029a this$0;

                {
                    this.this$0 = r1;
                }

                public final Application invoke(Scope aVar, DefinitionParameters aVar2) {
                    Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                    Intrinsics.checkParameterIsNotNull(aVar2, "it");
                    return (Application) this.this$0.$androidContext;
                }
            }, Kind.Single, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: org.koin.android.ext.a.a$b */
    public static final class C70031b extends Lambda implements Function1<Module, Unit> {
        final /* synthetic */ Context $androidContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70031b(Context context) {
            super(1);
            this.$androidContext = context;
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
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Context.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, new Function2<Scope, DefinitionParameters, Context>(this) {
                /* class org.koin.android.ext.p3513a.C70028a.C70031b.C700321 */
                final /* synthetic */ C70031b this$0;

                {
                    this.this$0 = r1;
                }

                public final Context invoke(Scope aVar, DefinitionParameters aVar2) {
                    Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                    Intrinsics.checkParameterIsNotNull(aVar2, "it");
                    return this.this$0.$androidContext;
                }
            }, Kind.Single, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }

    /* renamed from: a */
    public static final KoinApplication m268605a(KoinApplication bVar, Context context) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$androidContext");
        Intrinsics.checkParameterIsNotNull(context, "androidContext");
        if (bVar.mo246625a().mo246617b().mo246690a(Level.INFO)) {
            bVar.mo246625a().mo246617b().mo246691b("[init] declare Android Context");
        }
        if (context instanceof Application) {
            bVar.mo246625a().mo246616a(CollectionsKt.listOf(C70027b.m268604a(false, false, new C70029a(context), 3, null)));
        }
        bVar.mo246625a().mo246616a(CollectionsKt.listOf(C70027b.m268604a(false, false, new C70031b(context), 3, null)));
        return bVar;
    }
}
