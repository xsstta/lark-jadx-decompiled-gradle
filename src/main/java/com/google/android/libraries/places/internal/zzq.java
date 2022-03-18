package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;

public final class zzq {
    private final String zza;
    private final int zzb;
    private final zzp zzc;
    private final boolean zzd;
    private final int zze;

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzp zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }

    public zzq(WifiInfo wifiInfo, ScanResult scanResult) {
        this(wifiInfo, scanResult.BSSID, scanResult.capabilities, scanResult.level, scanResult.frequency);
    }

    private zzq(String str, int i, zzp zzp, boolean z, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzp;
        this.zzd = z;
        this.zze = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzq(android.net.wifi.WifiInfo r7, java.lang.String r8, java.lang.String r9, int r10, int r11) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0034
            java.lang.String r9 = r9.toUpperCase()
            java.lang.String r0 = "[ESS]"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "[IBSS]"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x001b
            goto L_0x0031
        L_0x001b:
            java.lang.String r0 = ".*WPA[0-9]*-PSK.*"
            boolean r0 = r9.matches(r0)
            if (r0 == 0) goto L_0x0026
            com.google.android.libraries.places.internal.zzp r9 = com.google.android.libraries.places.internal.zzp.PSK
            goto L_0x0036
        L_0x0026:
            java.lang.String r0 = ".*WPA[0-9]*-EAP.*"
            boolean r9 = r9.matches(r0)
            if (r9 == 0) goto L_0x0034
            com.google.android.libraries.places.internal.zzp r9 = com.google.android.libraries.places.internal.zzp.EAP
            goto L_0x0036
        L_0x0031:
            com.google.android.libraries.places.internal.zzp r9 = com.google.android.libraries.places.internal.zzp.NONE
            goto L_0x0036
        L_0x0034:
            com.google.android.libraries.places.internal.zzp r9 = com.google.android.libraries.places.internal.zzp.OTHER
        L_0x0036:
            r3 = r9
            if (r7 == 0) goto L_0x004c
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x004c
            java.lang.String r7 = r7.getBSSID()
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x004c
            r7 = 1
            r4 = 1
            goto L_0x004e
        L_0x004c:
            r7 = 0
            r4 = 0
        L_0x004e:
            r0 = r6
            r1 = r8
            r2 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzq.<init>(android.net.wifi.WifiInfo, java.lang.String, java.lang.String, int, int):void");
    }
}
