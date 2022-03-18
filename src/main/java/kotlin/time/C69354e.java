package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: kotlin.time.e */
public final /* synthetic */ class C69354e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f173383a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f173383a = iArr;
        iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
        iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
        iArr[TimeUnit.SECONDS.ordinal()] = 4;
        iArr[TimeUnit.MINUTES.ordinal()] = 5;
        iArr[TimeUnit.HOURS.ordinal()] = 6;
        iArr[TimeUnit.DAYS.ordinal()] = 7;
    }
}
