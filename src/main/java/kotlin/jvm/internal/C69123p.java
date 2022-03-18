package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.KVariance;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: kotlin.jvm.internal.p */
public final /* synthetic */ class C69123p {

    /* renamed from: a */
    public static final /* synthetic */ int[] f173219a;

    static {
        int[] iArr = new int[KVariance.values().length];
        f173219a = iArr;
        iArr[KVariance.INVARIANT.ordinal()] = 1;
        iArr[KVariance.IN.ordinal()] = 2;
        iArr[KVariance.OUT.ordinal()] = 3;
    }
}
