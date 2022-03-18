package org.koin.core.p3519d;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.DefinitionParameterException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a#\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006*\u0016\u0010\u0007\"\b\u0012\u0004\u0012\u00020\u00010\b2\b\u0012\u0004\u0012\u00020\u00010\b¨\u0006\t"}, d2 = {"emptyParametersHolder", "Lorg/koin/core/parameter/DefinitionParameters;", "parametersOf", "parameters", "", "", "([Ljava/lang/Object;)Lorg/koin/core/parameter/DefinitionParameters;", "ParametersDefinition", "Lkotlin/Function0;", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.core.d.b */
public final class C70039b {
    /* renamed from: a */
    public static final DefinitionParameters m268660a() {
        return new DefinitionParameters(new Object[0]);
    }

    /* renamed from: a */
    public static final DefinitionParameters m268661a(Object... objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "parameters");
        if (objArr.length <= 5) {
            return new DefinitionParameters(Arrays.copyOf(objArr, objArr.length));
        }
        throw new DefinitionParameterException("Can't build DefinitionParameters for more than 5 arguments");
    }
}
