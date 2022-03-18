package org.koin.core;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JA\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f¢\u0006\u0002\u0010 J6\u0010\u0017\u001a\u0002H\u0018\"\u0006\b\u0000\u0010\u0018\u0018\u0001\"\u0006\b\u0001\u0010!\u0018\u00012\u0016\b\n\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001fH\b¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020$J\r\u0010%\u001a\u00020$H\u0000¢\u0006\u0002\b&J\r\u0010'\u001a\u00020$H\u0000¢\u0006\u0002\b(J\u0006\u0010)\u001a\u00020$J\u0011\u0010*\u001a\u00020+\"\u0006\b\u0000\u0010,\u0018\u0001H\bJ)\u0010*\u001a\u00020+\"\u0006\b\u0000\u0010,\u0018\u00012\n\u0010-\u001a\u00060.j\u0002`/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001H\bJ&\u0010*\u001a\u00020+2\n\u0010-\u001a\u00060.j\u0002`/2\u0006\u00101\u001a\u0002022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001JL\u00103\u001a\u00020$\"\n\b\u0000\u0010,\u0018\u0001*\u00020\u00012\u0006\u00104\u001a\u0002H,2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0012\b\u0002\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a062\b\b\u0002\u00107\u001a\u000208H\b¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020.J\u0012\u0010<\u001a\u00020$2\n\u0010-\u001a\u00060.j\u0002`/JA\u0010=\u001a\u0002H,\"\u0004\b\u0000\u0010,2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u001a2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f¢\u0006\u0002\u0010?J:\u0010=\u001a\u0002H,\"\u0006\b\u0000\u0010,\u0018\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0016\b\n\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001fH\b¢\u0006\u0002\u0010@J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u0002H,06\"\n\b\u0000\u0010,\u0018\u0001*\u00020\u0001H\bJ\u001d\u0010B\u001a\u00020+\"\u0006\b\u0000\u0010,\u0018\u00012\n\u0010-\u001a\u00060.j\u0002`/H\bJ\u001a\u0010B\u001a\u00020+2\n\u0010-\u001a\u00060.j\u0002`/2\u0006\u00101\u001a\u000202JC\u0010C\u001a\u0004\u0018\u0001H,\"\u0004\b\u0000\u0010,2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u001a2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f¢\u0006\u0002\u0010?J<\u0010C\u001a\u0004\u0018\u0001H,\"\u0006\b\u0000\u0010,\u0018\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0016\b\n\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001fH\b¢\u0006\u0002\u0010@J\u0010\u0010D\u001a\u0004\u0018\u00010.2\u0006\u0010;\u001a\u00020.J\u0016\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010E\u001a\u00020.J\u0012\u0010F\u001a\u00020+2\n\u0010-\u001a\u00060.j\u0002`/J\u0014\u0010G\u001a\u0004\u0018\u00010+2\n\u0010-\u001a\u00060.j\u0002`/J;\u0010H\u001a\b\u0012\u0004\u0012\u0002H,0I\"\u0006\b\u0000\u0010,\u0018\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0016\b\n\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001fH\bJ=\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H,0I\"\u0006\b\u0000\u0010,\u0018\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u0016\b\n\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\u0004\u0018\u0001`\u001fH\bJ\u0014\u0010K\u001a\u00020$2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b06J\u0016\u0010M\u001a\u00020$2\u0006\u0010;\u001a\u00020.2\u0006\u0010N\u001a\u00020.J\u0014\u0010O\u001a\u0002082\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b06R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006P"}, d2 = {"Lorg/koin/core/Koin;", "", "()V", "_logger", "Lorg/koin/core/logger/Logger;", "get_logger", "()Lorg/koin/core/logger/Logger;", "set_logger", "(Lorg/koin/core/logger/Logger;)V", "_modules", "Ljava/util/HashSet;", "Lorg/koin/core/module/Module;", "Lkotlin/collections/HashSet;", "get_modules", "()Ljava/util/HashSet;", "_propertyRegistry", "Lorg/koin/core/registry/PropertyRegistry;", "get_propertyRegistry", "()Lorg/koin/core/registry/PropertyRegistry;", "_scopeRegistry", "Lorg/koin/core/registry/ScopeRegistry;", "get_scopeRegistry", "()Lorg/koin/core/registry/ScopeRegistry;", "bind", "S", "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createContextIfNeeded", "createContextIfNeeded$koin_core", "createEagerInstances", "createEagerInstances$koin_core", "createRootScope", "createScope", "Lorg/koin/core/scope/Scope;", "T", "scopeId", "", "Lorg/koin/core/scope/ScopeID;", ShareHitPoint.f121868c, "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "declare", "instance", "secondaryTypes", "", "override", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "deleteProperty", "key", "deleteScope", "get", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getOrCreateScope", "getOrNull", "getProperty", "defaultValue", "getScope", "getScopeOrNull", "inject", "Lkotlin/Lazy;", "injectOrNull", "loadModules", "modules", "setProperty", "value", "unloadModules", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.a */
public final class Koin {

    /* renamed from: a */
    private final ScopeRegistry f175006a = new ScopeRegistry(this);

    /* renamed from: b */
    private final PropertyRegistry f175007b = new PropertyRegistry(this);

    /* renamed from: c */
    private Logger f175008c = new EmptyLogger();

    /* renamed from: d */
    private final HashSet<Module> f175009d = new HashSet<>();

    /* renamed from: a */
    public final ScopeRegistry mo246615a() {
        return this.f175006a;
    }

    /* renamed from: b */
    public final Logger mo246617b() {
        return this.f175008c;
    }

    /* renamed from: c */
    public final void mo246618c() {
        mo246619d();
        this.f175006a.mo246686d().mo246696a();
    }

    /* renamed from: d */
    public final void mo246619d() {
        if (this.f175006a.mo246685c() == null) {
            this.f175006a.mo246688f();
        }
    }

    /* renamed from: a */
    public final String mo246614a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.f175007b.mo246679a(str);
    }

    /* renamed from: a */
    public final void mo246616a(List<Module> list) {
        Intrinsics.checkParameterIsNotNull(list, "modules");
        synchronized (this) {
            this.f175009d.addAll(list);
            this.f175006a.mo246682a(list);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final <T> T mo246613a(KClass<?> kClass, Qualifier aVar, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        return (T) this.f175006a.mo246686d().mo246699b(kClass, aVar, function0);
    }
}
