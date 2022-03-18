package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class zzcn {
    private static final zzgn<zzp, String> zza = new zzgm().zza(zzp.NONE, "NONE").zza(zzp.PSK, "WPA_PSK").zza(zzp.EAP, "WPA_EAP").zza(zzp.OTHER, "SECURED_NONE").zza();

    public static String zza(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zza(latLng.f53577a, latLng.f53578b);
    }

    public static String zzb(Location location) {
        if (location == null) {
            return null;
        }
        return zza(location.getLatitude(), location.getLongitude());
    }

    public static Integer zza(Location location) {
        if (location == null) {
            return null;
        }
        float accuracy = location.getAccuracy();
        if (!location.hasAccuracy() || accuracy <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return Integer.valueOf(Math.round(accuracy * 100.0f));
    }

    public static String zza(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zza((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zza(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zza((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    private static String zza(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d = southwest.f53577a;
        double d2 = southwest.f53578b;
        LatLng northeast = rectangularBounds.getNortheast();
        double d3 = northeast.f53577a;
        double d4 = northeast.f53578b;
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
    }

    public static String zza(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                String valueOf = String.valueOf(next.toLowerCase(Locale.US));
                if (valueOf.length() != 0) {
                    str = "country:".concat(valueOf);
                } else {
                    str = new String("country:");
                }
            }
            if (str != null) {
                if (sb.length() != 0) {
                    sb.append('|');
                }
                sb.append(str);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    private static String zza(double d, double d2) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2));
    }

    public static String zza(zzgi<zzq> zzgi, int i) {
        String str;
        String str2;
        zzft.zza(true, (Object) "maxLength must not be negative");
        StringBuilder sb = new StringBuilder();
        zzgi<zzq> zzgi2 = zzgi;
        int size = zzgi2.size();
        int i2 = 0;
        while (i2 < size) {
            zzq zzq = zzgi2.get(i2);
            i2++;
            zzq zzq2 = zzq;
            if (sb.length() > 0) {
                str = "|";
            } else {
                str = "";
            }
            zzgn zza2 = new zzgm().zza("mac", zzq2.zza()).zza("strength_dbm", Integer.valueOf(zzq2.zzb())).zza("wifi_auth_type", zza.get(zzq2.zzc())).zza("is_connected", Boolean.valueOf(zzq2.zzd())).zza("frequency_mhz", Integer.valueOf(zzq2.zze())).zza();
            String valueOf = String.valueOf(zzfj.zza(",").zzb(ContainerUtils.KEY_VALUE_DELIMITER).zza(new StringBuilder(), zza2.entrySet().iterator()).toString());
            if (valueOf.length() != 0) {
                str2 = str.concat(valueOf);
            } else {
                str2 = new String(str);
            }
            if (4000 < sb.length() + str2.length()) {
                break;
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
