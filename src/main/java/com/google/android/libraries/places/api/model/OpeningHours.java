package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzft;
import com.google.android.libraries.places.internal.zzgi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class OpeningHours implements Parcelable {
    public abstract List<Period> getPeriods();

    public abstract List<String> getWeekdayText();

    public static Builder builder() {
        return new zzm().setPeriods(new ArrayList()).setWeekdayText(new ArrayList());
    }

    public static abstract class Builder {
        public abstract Builder setPeriods(List<Period> list);

        public abstract Builder setWeekdayText(List<String> list);

        /* access modifiers changed from: package-private */
        public abstract OpeningHours zza();

        public OpeningHours build() {
            OpeningHours zza = zza();
            for (String str : zza.getWeekdayText()) {
                zzft.zzb(!TextUtils.isEmpty(str), "WeekdayText must not contain null or empty values.");
            }
            setPeriods(zzgi.zza((Collection) zza.getPeriods()));
            setWeekdayText(zzgi.zza((Collection) zza.getWeekdayText()));
            return zza();
        }
    }
}
