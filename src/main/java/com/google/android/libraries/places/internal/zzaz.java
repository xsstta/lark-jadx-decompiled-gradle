package com.google.android.libraries.places.internal;

final class zzaz {
    private String description;
    private Integer distanceMeters;
    private zza[] matchedSubstrings;
    private String placeId;
    private zzb structuredFormatting;
    private String[] types;

    static class zza {
        Integer length;
        Integer offset;

        zza() {
        }
    }

    static class zzb {
        private String mainText;
        private zza[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zza[] secondaryTextMatchedSubstrings;

        zzb() {
        }

        /* access modifiers changed from: package-private */
        public final String zza() {
            return this.mainText;
        }

        /* access modifiers changed from: package-private */
        public final String zzb() {
            return this.secondaryText;
        }

        /* access modifiers changed from: package-private */
        public final zzgi<zza> zzc() {
            zza[] zzaArr = this.mainTextMatchedSubstrings;
            if (zzaArr != null) {
                return zzgi.zza((Object[]) zzaArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final zzgi<zza> zzd() {
            zza[] zzaArr = this.secondaryTextMatchedSubstrings;
            if (zzaArr != null) {
                return zzgi.zza((Object[]) zzaArr);
            }
            return null;
        }
    }

    zzaz() {
    }

    /* access modifiers changed from: package-private */
    public final String zza() {
        return this.description;
    }

    /* access modifiers changed from: package-private */
    public final Integer zzb() {
        return this.distanceMeters;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.placeId;
    }

    /* access modifiers changed from: package-private */
    public final zzb zzd() {
        return this.structuredFormatting;
    }

    /* access modifiers changed from: package-private */
    public final zzgi<String> zze() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzgi.zza((Object[]) strArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final zzgi<zza> zzf() {
        zza[] zzaArr = this.matchedSubstrings;
        if (zzaArr != null) {
            return zzgi.zza((Object[]) zzaArr);
        }
        return null;
    }
}
