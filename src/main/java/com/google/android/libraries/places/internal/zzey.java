package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

public final class zzey implements Parcelable {
    public static final Parcelable.Creator<zzey> CREATOR = new zzex();
    private final zzec zza;
    private final AutocompleteActivityMode zzb;
    private final AutocompleteSessionToken zzc;
    private boolean zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private long zzq;
    private final zzb zzr;

    public final int describeContents() {
        return 0;
    }

    public final void zzp() {
        this.zzd = true;
    }

    public final void zzt() {
        this.zzk = true;
    }

    public final void zzw() {
        this.zzo = true;
    }

    public final AutocompleteActivityMode zzb() {
        return this.zzb;
    }

    public final AutocompleteSessionToken zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzf;
    }

    public final int zzi() {
        return this.zzg;
    }

    public final int zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zzl;
    }

    public final int zzl() {
        return this.zzm;
    }

    public final int zzm() {
        return this.zzn;
    }

    public final boolean zzn() {
        return this.zzo;
    }

    public final int zzo() {
        return this.zzp;
    }

    public final zzec zza() {
        return this.zza;
    }

    public final void zzr() {
        this.zzf++;
    }

    public final void zzs() {
        this.zzg++;
    }

    public final void zzu() {
        this.zzh++;
    }

    public final void zzv() {
        this.zzn++;
    }

    private final boolean zzz() {
        if (this.zzq != -1) {
            return true;
        }
        return false;
    }

    public final void zzq() {
        if (!this.zzd && !this.zzk) {
            this.zze = true;
        }
    }

    public final void zzx() {
        if (!zzz()) {
            this.zzq = this.zzr.zza();
        }
    }

    public final void zzy() {
        if (zzz()) {
            this.zzp += (int) (this.zzr.zza() - this.zzq);
            this.zzq = -1;
        }
    }

    private static boolean zza(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public final void zza(int i) {
        this.zzj = true;
        this.zzi = i;
    }

    public final void zza(String str) {
        this.zzm++;
        this.zzl = str;
    }

    private zzey(Parcel parcel) {
        this.zza = (zzec) parcel.readParcelable(zzec.class.getClassLoader());
        this.zzb = (AutocompleteActivityMode) parcel.readParcelable(AutocompleteActivityMode.class.getClassLoader());
        this.zzc = (AutocompleteSessionToken) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader());
        this.zzj = zza(parcel);
        this.zzd = zza(parcel);
        this.zze = zza(parcel);
        this.zzi = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzk = zza(parcel);
        this.zzh = parcel.readInt();
        this.zzl = parcel.readString();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readInt();
        this.zzo = zza(parcel);
        this.zzp = parcel.readInt();
        this.zzq = parcel.readLong();
        this.zzr = new zzd();
    }

    /* synthetic */ zzey(Parcel parcel, zzex zzex) {
        this(parcel);
    }

    private static void zza(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        zza(parcel, this.zzj);
        zza(parcel, this.zzd);
        zza(parcel, this.zze);
        parcel.writeInt(this.zzi);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        zza(parcel, this.zzk);
        parcel.writeInt(this.zzh);
        parcel.writeString(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeInt(this.zzn);
        zza(parcel, this.zzo);
        parcel.writeInt(this.zzp);
        parcel.writeLong(this.zzq);
    }

    public zzey(zzec zzec, AutocompleteActivityMode autocompleteActivityMode, String str, zzb zzb2) {
        this.zza = zzec;
        this.zzb = autocompleteActivityMode;
        this.zzc = AutocompleteSessionToken.newInstance();
        this.zzl = zzfz.zza(str);
        this.zzi = -1;
        this.zzq = -1;
        this.zzr = zzb2;
    }
}
