package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.KoinComponent;
import org.koin.core.context.KoinContextHandler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00032\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\b¢\u0006\u0002\u0010\b\u001aB\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b*\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\b¢\u0006\u0002\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0003\u001aC\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\u0012\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b*\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\b¨\u0006\u0013"}, d2 = {"bind", "S", "P", "Landroid/content/ComponentCallbacks;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroid/content/ComponentCallbacks;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "T", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getKoin", "Lorg/koin/core/Koin;", "inject", "Lkotlin/Lazy;", "koin-android_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.android.ext.android.a */
public final class C70033a {
    /* renamed from: a */
    public static final Koin m268606a(ComponentCallbacks componentCallbacks) {
        Intrinsics.checkParameterIsNotNull(componentCallbacks, "$this$getKoin");
        if (componentCallbacks instanceof KoinComponent) {
            return ((KoinComponent) componentCallbacks).mo246610a();
        }
        return KoinContextHandler.f175011a.mo246622a();
    }
}
