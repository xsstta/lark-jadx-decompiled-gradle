package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
import java.util.List;

public final class zzcm {
    private static final zzgn<Place.Field, String> zza = new zzgm().zza(Place.Field.ADDRESS, "formatted_address").zza(Place.Field.ADDRESS_COMPONENTS, "address_components").zza(Place.Field.ID, "place_id").zza(Place.Field.LAT_LNG, "geometry/location").zza(Place.Field.NAME, "name").zza(Place.Field.OPENING_HOURS, "opening_hours").zza(Place.Field.PHONE_NUMBER, "international_phone_number").zza(Place.Field.PHOTO_METADATAS, "photos").zza(Place.Field.PLUS_CODE, "plus_code").zza(Place.Field.PRICE_LEVEL, "price_level").zza(Place.Field.RATING, "rating").zza(Place.Field.TYPES, "types").zza(Place.Field.USER_RATINGS_TOTAL, "user_ratings_total").zza(Place.Field.UTC_OFFSET, "utc_offset").zza(Place.Field.VIEWPORT, "geometry/viewport").zza(Place.Field.WEBSITE_URI, "website").zza();

    public static List<String> zza(List<Place.Field> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Place.Field field : list) {
            arrayList.add(zza.get(field));
        }
        return arrayList;
    }

    public static String zzb(List<Place.Field> list) {
        StringBuilder sb = new StringBuilder();
        for (Place.Field field : list) {
            String str = zza.get(field);
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
