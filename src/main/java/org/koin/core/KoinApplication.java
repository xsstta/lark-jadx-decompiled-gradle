package org.koin.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.p3522g.C70044a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\rJ\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001f\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0016\"\u00020\u0013¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013J\u0012\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001dJ\u0014\u0010\u001e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "()V", "koin", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "close", "", "createEagerInstances", "environmentProperties", "fileProperties", "fileName", "", "init", "init$koin_core", "loadModules", "modules", "", "Lorg/koin/core/module/Module;", "logger", "Lorg/koin/core/logger/Logger;", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "printLogger", "level", "Lorg/koin/core/logger/Level;", "properties", "values", "", "unloadModules", "module", "Companion", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.b */
public final class KoinApplication {

    /* renamed from: a */
    public static final Companion f175013a = new Companion(null);

    /* renamed from: b */
    private final Koin f175014b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "()V", "init", "Lorg/koin/core/KoinApplication;", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: org.koin.core.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final KoinApplication mo246628a() {
            KoinApplication bVar = new KoinApplication(null);
            bVar.mo246626b();
            return bVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Koin mo246625a() {
        return this.f175014b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: org.koin.core.b$b */
    static final class C70036b extends Lambda implements Function0<Unit> {
        final /* synthetic */ KoinApplication this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70036b(KoinApplication bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo246625a().mo246618c();
        }
    }

    private KoinApplication() {
        this.f175014b = new Koin();
    }

    /* renamed from: b */
    public final void mo246626b() {
        this.f175014b.mo246615a().mo246687e();
    }

    /* renamed from: c */
    public final KoinApplication mo246627c() {
        if (this.f175014b.mo246617b().mo246690a(Level.DEBUG)) {
            double a = C70044a.m268706a(new C70036b(this));
            Logger b = this.f175014b.mo246617b();
            b.mo246689a("instances started in " + a + " ms");
        } else {
            this.f175014b.mo246618c();
        }
        return this;
    }

    public /* synthetic */ KoinApplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
