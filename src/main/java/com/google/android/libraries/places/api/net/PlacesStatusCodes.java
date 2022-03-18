package com.google.android.libraries.places.api.net;

import com.google.android.gms.common.api.C21627b;

public final class PlacesStatusCodes extends C21627b {
    public static final int INVALID_REQUEST = 9012;
    public static final int NOT_FOUND = 9013;
    public static final int OVER_QUERY_LIMIT = 9010;
    public static final int REQUEST_DENIED = 9011;

    public static boolean isError(int i) {
        return i > 0;
    }

    public static String getStatusCodeString(int i) {
        switch (i) {
            case OVER_QUERY_LIMIT /*{ENCODED_INT: 9010}*/:
                return "OVER_QUERY_LIMIT";
            case REQUEST_DENIED /*{ENCODED_INT: 9011}*/:
                return "REQUEST_DENIED";
            case INVALID_REQUEST /*{ENCODED_INT: 9012}*/:
                return "INVALID_REQUEST";
            case NOT_FOUND /*{ENCODED_INT: 9013}*/:
                return "NOT_FOUND";
            default:
                return C21627b.getStatusCodeString(i);
        }
    }
}
