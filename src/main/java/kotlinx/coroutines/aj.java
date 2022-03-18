package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
public final /* synthetic */ class aj {

    /* renamed from: a */
    public static final /* synthetic */ int[] f173403a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f173404b;

    static {
        int[] iArr = new int[CoroutineStart.values().length];
        f173403a = iArr;
        iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
        iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
        iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        iArr[CoroutineStart.LAZY.ordinal()] = 4;
        int[] iArr2 = new int[CoroutineStart.values().length];
        f173404b = iArr2;
        iArr2[CoroutineStart.DEFAULT.ordinal()] = 1;
        iArr2[CoroutineStart.ATOMIC.ordinal()] = 2;
        iArr2[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        iArr2[CoroutineStart.LAZY.ordinal()] = 4;
    }
}
