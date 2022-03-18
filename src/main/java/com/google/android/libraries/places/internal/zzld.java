package com.google.android.libraries.places.internal;

public enum zzld implements zzrb {
    UNKNOWN_MODEL_VERSION(0),
    SIMPLE_TENSOR_FLOW_TWO_PASS_V1(1),
    DEFAULT_MODEL_V1(2),
    SIMPLE_TENSOR_FLOW_TWO_PASS_V2(3);
    
    private static final zzre<zzld> zze = new zzlg();
    private final int zzf;

    public static zzrd zzb() {
        return zzlf.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrb
    public final int zza() {
        return this.zzf;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    private zzld(int i) {
        this.zzf = i;
    }
}
