package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzgi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AutocompletePrediction implements Parcelable {
    public abstract Integer getDistanceMeters();

    public abstract String getPlaceId();

    public abstract List<Place.Type> getPlaceTypes();

    /* access modifiers changed from: package-private */
    public abstract String zza();

    /* access modifiers changed from: package-private */
    public abstract String zzb();

    /* access modifiers changed from: package-private */
    public abstract String zzc();

    /* access modifiers changed from: package-private */
    public abstract List<zza> zzd();

    /* access modifiers changed from: package-private */
    public abstract List<zza> zze();

    /* access modifiers changed from: package-private */
    public abstract List<zza> zzf();

    public static abstract class zza implements Parcelable {
        /* access modifiers changed from: package-private */
        public abstract int zza();

        /* access modifiers changed from: package-private */
        public abstract int zzb();

        public static zzba zzc() {
            return new zzf();
        }
    }

    public static abstract class Builder {
        public abstract Builder setFullText(String str);

        public abstract Builder setPlaceTypes(List<Place.Type> list);

        public abstract Builder setPrimaryText(String str);

        public abstract Builder setSecondaryText(String str);

        public abstract Builder zza(Integer num);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(String str);

        public abstract Builder zza(List<zza> list);

        /* access modifiers changed from: package-private */
        public abstract AutocompletePrediction zza();

        public abstract Builder zzb(List<zza> list);

        public abstract Builder zzc(List<zza> list);

        public AutocompletePrediction build() {
            AutocompletePrediction zza = zza();
            setPlaceTypes(zzgi.zza((Collection) zza.getPlaceTypes()));
            List<zza> zzd = zza.zzd();
            if (zzd != null) {
                zza(zzgi.zza((Collection) zzd));
            }
            List<zza> zze = zza.zze();
            if (zze != null) {
                zzb(zzgi.zza((Collection) zze));
            }
            List<zza> zzf = zza.zzf();
            if (zzf != null) {
                zzc(zzgi.zza((Collection) zzf));
            }
            return zza();
        }
    }

    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zza(zza(), zzd(), characterStyle);
    }

    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zza(zzb(), zze(), characterStyle);
    }

    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zza(zzc(), zzf(), characterStyle);
    }

    public static Builder builder(String str) {
        return new zzd().zza(str).setPlaceTypes(new ArrayList()).setFullText("").setPrimaryText("").setSecondaryText("");
    }

    private static SpannableString zza(String str, List<zza> list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (!(str.length() == 0 || characterStyle == null || list == null)) {
            for (zza zza2 : list) {
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zza2.zza(), zza2.zza() + zza2.zzb(), 0);
            }
        }
        return spannableString;
    }
}
