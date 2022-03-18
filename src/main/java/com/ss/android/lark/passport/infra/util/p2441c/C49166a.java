package com.ss.android.lark.passport.infra.util.p2441c;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010&\n\u0000\n\u0002\u0010%\n\u0002\u0010#\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\b2\u001e\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\t\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001a.\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u000b\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u000b\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f¨\u0006\r"}, d2 = {"copyForEach", "", "T", "", "action", "Lkotlin/Function1;", "K", "V", "", "", "toSynchronized", "", "", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.c.a */
public final class C49166a {
    /* renamed from: a */
    public static final <T> Set<T> m193877a(Set<T> set) {
        Intrinsics.checkParameterIsNotNull(set, "$this$toSynchronized");
        Set<T> synchronizedSet = Collections.synchronizedSet(set);
        Intrinsics.checkExpressionValueIsNotNull(synchronizedSet, "Collections.synchronizedSet(this)");
        return synchronizedSet;
    }
}
