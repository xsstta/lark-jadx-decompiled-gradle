package com.huawei.hms.location;

import com.huawei.hms.common.api.CommonStatusCodes;

public final class GeofenceErrorCodes extends CommonStatusCodes {
    public static final int GEOFENCE_INSUFFICIENT_PERMISSION = 10204;
    public static final int GEOFENCE_NUMBER_OVER_LIMIT = 10201;
    public static final int GEOFENCE_PENDINGINTENT_OVER_LIMIT = 10202;
    public static final int GEOFENCE_REQUEST_TOO_OFTEN = 10205;
    public static final int GEOFENCE_UNAVAILABLE = 10200;

    private GeofenceErrorCodes() {
    }

    public static String getErrorMessage(int i) {
        switch (i) {
            case GEOFENCE_UNAVAILABLE /*{ENCODED_INT: 10200}*/:
                return "GEOFENCE_UNAVAILABLE";
            case GEOFENCE_NUMBER_OVER_LIMIT /*{ENCODED_INT: 10201}*/:
                return "GEOFENCE_NUMBER_OVER_LIMIT";
            case GEOFENCE_PENDINGINTENT_OVER_LIMIT /*{ENCODED_INT: 10202}*/:
                return "GEOFENCE_PENDINGINTENT_OVER_LIMIT";
            case 10203:
            default:
                return CommonStatusCodes.getStatusCodeString(i);
            case GEOFENCE_INSUFFICIENT_PERMISSION /*{ENCODED_INT: 10204}*/:
                return "GEOFENCE_INSUFFICIENT_PERMISSION";
            case GEOFENCE_REQUEST_TOO_OFTEN /*{ENCODED_INT: 10205}*/:
                return "GEOFENCE_REQUEST_TOO_OFTEN";
        }
    }
}
