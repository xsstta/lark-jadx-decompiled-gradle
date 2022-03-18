package com.ss.android.vesdk.runtime.oauth;

import java.util.HashMap;
import java.util.Map;

public enum TEOAuthResult {
    OK(0),
    TBD(1),
    EXPIRED(2),
    FAIL(3),
    NOT_MATCH(4);
    
    private static Map<Integer, TEOAuthResult> valueMaps = new HashMap();
    private int ordinal;

    static {
        TEOAuthResult[] values = values();
        for (TEOAuthResult tEOAuthResult : values) {
            valueMaps.put(Integer.valueOf(tEOAuthResult.ordinal), tEOAuthResult);
        }
    }

    public static TEOAuthResult from(int i) {
        if (valueMaps.containsKey(Integer.valueOf(i))) {
            return valueMaps.get(Integer.valueOf(i));
        }
        return FAIL;
    }

    private TEOAuthResult(int i) {
        this.ordinal = i;
    }
}
