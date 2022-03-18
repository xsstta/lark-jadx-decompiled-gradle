package io.michaelrocks.libphonenumber.android;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ShortNumberInfo {

    /* renamed from: a */
    private static final Logger f171498a = Logger.getLogger(ShortNumberInfo.class.getName());

    /* renamed from: b */
    private static final Set<String> f171499b;

    public enum ShortNumberCost {
        TOLL_FREE,
        STANDARD_RATE,
        PREMIUM_RATE,
        UNKNOWN_COST
    }

    static {
        HashSet hashSet = new HashSet();
        f171499b = hashSet;
        hashSet.add("BR");
        hashSet.add("CL");
        hashSet.add("NI");
    }
}
