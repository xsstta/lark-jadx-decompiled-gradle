package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzcf {
    private String zza;
    private String zzb;
    private Locale zzc;
    private Map<String, String> zzd = new HashMap();

    public final String zza() {
        String str;
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(this.zza);
        buildUpon.appendQueryParameter("key", this.zzb);
        Locale locale = this.zzc;
        if (locale != null) {
            if (Build.VERSION.SDK_INT < 21) {
                StringBuilder sb = new StringBuilder();
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    sb.append(language);
                    String country = locale.getCountry();
                    if (!TextUtils.isEmpty(country)) {
                        sb.append("-");
                        sb.append(country);
                    }
                }
                str = sb.toString();
            } else {
                str = locale.toLanguageTag();
            }
            if (!TextUtils.isEmpty(str)) {
                buildUpon.appendQueryParameter("language", str);
            }
        }
        Map<String, String> map = this.zzd;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    /* access modifiers changed from: package-private */
    public final zzcf zza(Locale locale) {
        this.zzc = locale;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzcf zza(Map<String, String> map) {
        this.zzd = new HashMap(map);
        return this;
    }

    zzcf(String str, String str2) {
        this.zza = str;
        zzft.zza(!TextUtils.isEmpty(str2), "API key cannot be empty.");
        this.zzb = str2;
    }
}
