package org.koin.p3512a;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.module.Module;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001b\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0002\b\t*,\u0010\n\"\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\t2\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\t¨\u0006\u000b"}, d2 = {"module", "Lorg/koin/core/module/Module;", "createdAtStart", "", "override", "moduleDeclaration", "Lkotlin/Function1;", "", "Lorg/koin/dsl/ModuleDeclaration;", "Lkotlin/ExtensionFunctionType;", "ModuleDeclaration", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.a.b */
public final class C70027b {
    /* renamed from: a */
    public static final Module m268603a(boolean z, boolean z2, Function1<? super Module, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "moduleDeclaration");
        Module aVar = new Module(z, z2);
        function1.invoke(aVar);
        return aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Module m268604a(boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return m268603a(z, z2, function1);
    }
}
