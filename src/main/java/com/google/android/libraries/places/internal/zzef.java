package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

public abstract class zzef {
    public abstract zzeh zza();

    public abstract String zzb();

    public abstract zzgi<AutocompletePrediction> zzc();

    public abstract Place zzd();

    public abstract AutocompletePrediction zze();

    public abstract Status zzf();

    public static zzef zzg() {
        return zza(zzeh.START).zza();
    }

    public static zzef zzh() {
        return zza(zzeh.RESET).zza();
    }

    public static zzef zzi() {
        return zza(zzeh.LOADING).zza();
    }

    public static zzef zzj() {
        return zza(zzeh.TRY_AGAIN_PROGRESS_LOADING).zza();
    }

    public static zzef zzk() {
        return zza(zzeh.FAILURE_UNRESOLVABLE).zza(new Status(16)).zza();
    }

    private static zzee zza(zzeh zzeh) {
        return new zzdz().zza(zzeh);
    }

    public static zzef zza(Status status) {
        zzft.zza(status);
        return zza(zzeh.FAILURE_UNRESOLVABLE).zza(status).zza();
    }

    public static zzef zza(Place place) {
        zzft.zza(place);
        return zza(zzeh.SUCCESS_SELECTION).zza(place).zza();
    }

    public static zzef zza(String str) {
        zzft.zza(str);
        return zza(zzeh.FAILURE_NO_PREDICTIONS).zza(str).zza();
    }

    public static zzef zza(List<AutocompletePrediction> list) {
        zzft.zza(list);
        return zza(zzeh.SUCCESS_PREDICTIONS).zza(list).zza();
    }

    public static zzef zza(AutocompletePrediction autocompletePrediction, Status status) {
        zzft.zza(autocompletePrediction);
        zzft.zza(status);
        return zza(zzeh.FAILURE_SELECTION).zza(autocompletePrediction).zza(status).zza();
    }

    public static zzef zza(String str, Status status) {
        zzft.zza(str);
        zzft.zza(status);
        return zza(zzeh.FAILURE_PREDICTIONS).zza(str).zza(status).zza();
    }
}
