package com.google.android.libraries.places.api.model;

import java.util.List;
import java.util.Objects;

abstract class zza extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List<String> zzc;

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public List<String> getTypes() {
        return this.zzc;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.zzc.hashCode();
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("AddressComponent{name=");
        sb.append(str);
        sb.append(", shortName=");
        sb.append(str2);
        sb.append(", types=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            if (!this.zza.equals(addressComponent.getName()) || ((str = this.zzb) != null ? !str.equals(addressComponent.getShortName()) : addressComponent.getShortName() != null) || !this.zzc.equals(addressComponent.getTypes())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zza(String str, String str2, List<String> list) {
        Objects.requireNonNull(str, "Null name");
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(list, "Null types");
        this.zzc = list;
    }
}
