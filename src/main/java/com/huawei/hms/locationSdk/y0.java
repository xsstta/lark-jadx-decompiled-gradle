package com.huawei.hms.locationSdk;

import com.huawei.hms.common.api.CommonStatusCodes;
import com.huawei.hms.location.GeofenceErrorCodes;

public class y0 extends CommonStatusCodes {
    public static String getStatusCodeString(int i) {
        if (i == 10000) {
            return "INTERNAL_ERROR";
        }
        if (i == 10204) {
            return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
        }
        if (i == 10205) {
            return "GEOFENCE_REQUEST_TOO_FREQUENT";
        }
        switch (i) {
            case GeofenceErrorCodes.GEOFENCE_UNAVAILABLE:
                return "GEOFENCE_NOT_AVAILABLE";
            case GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                switch (i) {
                    case 10801:
                        return "PARAM_ERROR_EMPTY";
                    case 10802:
                        return "PARAM_ERROR_INVALID";
                    case 10803:
                        return "PERMISSION_DENIED";
                    case 10804:
                        return "NO_MATCHED_CALLBACK";
                    case 10805:
                        return "NO_MATCHED_INTENT";
                    case 10806:
                        return "NOT_YET_SUPPORTED";
                    default:
                        return CommonStatusCodes.getStatusCodeString(i);
                }
        }
    }
}
