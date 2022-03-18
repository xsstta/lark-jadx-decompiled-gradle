package org.koin.core.p3516a;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.KoinApplication;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007\u001a-\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\fj\u0002`\r¢\u0006\u0002\b\u000e\u001a\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"loadKoinModules", "", "modules", "", "Lorg/koin/core/module/Module;", "module", "startKoin", "Lorg/koin/core/KoinApplication;", "koinContext", "Lorg/koin/core/context/KoinContext;", "koinApplication", "appDeclaration", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "stopKoin", "unloadKoinModules", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.core.a.a */
public final class C70035a {
    /* renamed from: a */
    public static final KoinApplication m268622a(KoinContext cVar, Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(cVar, "koinContext");
        Intrinsics.checkParameterIsNotNull(function1, "appDeclaration");
        KoinContextHandler.f175011a.mo246623a(cVar);
        KoinApplication a = KoinApplication.f175013a.mo246628a();
        KoinContextHandler.f175011a.mo246624a(a);
        function1.invoke(a);
        a.mo246627c();
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ KoinApplication m268623a(KoinContext cVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = new GlobalContext();
        }
        return m268622a(cVar, function1);
    }
}
