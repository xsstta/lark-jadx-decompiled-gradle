package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqv;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzqt<T extends zzqv<T>> {
    private static final zzqt zzd = new zzqt(true);
    final zztc<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    public static <T extends zzqv<T>> zzqt<T> zza() {
        return zzd;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    private zzqt() {
        this.zza = zztc.zza(16);
    }

    public final void zzb() {
        if (!this.zzb) {
            this.zza.zza();
            this.zzb = true;
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzrq(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzrq(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza((Map.Entry) this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            if (!zza((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            i += zzc(entry);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzqt zzqt = new zzqt();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i);
            zzqt.zzb(zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            zzqt.zzb(entry.getKey(), entry.getValue());
        }
        zzqt.zzc = this.zzc;
        return zzqt;
    }

    private zzqt(zztc<T, Object> zztc) {
        this.zza = zztc;
        zzb();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqt)) {
            return false;
        }
        return this.zza.equals(((zzqt) obj).zza);
    }

    private zzqt(boolean z) {
        this(zztc.zza(0));
        zzb();
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzrl)) {
            return obj;
        }
        zzrl zzrl = (zzrl) obj;
        return zzrl.zza();
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzuk.MESSAGE || key.zzd() || key.zze()) {
            return zza((zzqv<?>) key, value);
        }
        if (value instanceof zzrl) {
            return zzqk.zzb(entry.getKey().zza(), (zzrl) value);
        }
        return zzqk.zzb(entry.getKey().zza(), (zzsk) value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzsq) {
            return ((zzsq) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzsk zzsk;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzrl) {
            zzrl zzrl = (zzrl) value;
            value = zzrl.zza();
        }
        if (key.zzd()) {
            Object zza2 = zza((zzqv) key);
            if (zza2 == null) {
                zza2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza2).add(zza(obj));
            }
            this.zza.put(key, zza2);
        } else if (key.zzc() == zzuk.MESSAGE) {
            Object zza3 = zza((zzqv) key);
            if (zza3 == null) {
                this.zza.put(key, zza(value));
                return;
            }
            if (zza3 instanceof zzsq) {
                zzsk = key.zza((zzsq) zza3, (zzsq) value);
            } else {
                zzsk = key.zza(((zzsk) zza3).zzl(), (zzsk) value).zzf();
            }
            this.zza.put(key, zzsk);
        } else {
            this.zza.put(key, zza(value));
        }
    }

    private static <T extends zzqv<T>> boolean zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzuk.MESSAGE) {
            if (key.zzd()) {
                for (zzsk zzsk : (List) entry.getValue()) {
                    if (!zzsk.zzg()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzsk) {
                    if (!((zzsk) value).zzg()) {
                        return false;
                    }
                } else if (value instanceof zzrl) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzqt<T> zzqt) {
        for (int i = 0; i < zzqt.zza.zzc(); i++) {
            zzb(zzqt.zza.zzb(i));
        }
        for (Map.Entry<T, Object> entry : zzqt.zza.zzd()) {
            zzb(entry);
        }
    }

    public static int zza(zzqv<?> zzqv, Object obj) {
        zzud zzb2 = zzqv.zzb();
        int zza2 = zzqv.zza();
        if (!zzqv.zzd()) {
            return zza(zzb2, zza2, obj);
        }
        int i = 0;
        if (zzqv.zze()) {
            for (Object obj2 : (List) obj) {
                i += zzb(zzb2, obj2);
            }
            return zzqk.zze(zza2) + i + zzqk.zzl(i);
        }
        for (Object obj3 : (List) obj) {
            i += zza(zzb2, zza2, obj3);
        }
        return i;
    }

    private final void zzb(T t, Object obj) {
        if (!t.zzd()) {
            zza(t.zzb(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzrl) {
            this.zzc = true;
        }
        this.zza.put(t, obj);
    }

    private static int zzb(zzud zzud, Object obj) {
        switch (zzqs.zzb[zzud.ordinal()]) {
            case 1:
                return zzqk.zzb(((Double) obj).doubleValue());
            case 2:
                return zzqk.zzb(((Float) obj).floatValue());
            case 3:
                return zzqk.zzd(((Long) obj).longValue());
            case 4:
                return zzqk.zze(((Long) obj).longValue());
            case 5:
                return zzqk.zzf(((Integer) obj).intValue());
            case 6:
                return zzqk.zzg(((Long) obj).longValue());
            case 7:
                return zzqk.zzi(((Integer) obj).intValue());
            case 8:
                return zzqk.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzqk.zzc((zzsk) obj);
            case 10:
                if (obj instanceof zzrl) {
                    return zzqk.zza((zzrl) obj);
                }
                return zzqk.zzb((zzsk) obj);
            case 11:
                if (obj instanceof zzpx) {
                    return zzqk.zzb((zzpx) obj);
                }
                return zzqk.zzb((String) obj);
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                if (obj instanceof zzpx) {
                    return zzqk.zzb((zzpx) obj);
                }
                return zzqk.zzb((byte[]) obj);
            case 13:
                return zzqk.zzg(((Integer) obj).intValue());
            case 14:
                return zzqk.zzj(((Integer) obj).intValue());
            case 15:
                return zzqk.zzh(((Long) obj).longValue());
            case 16:
                return zzqk.zzh(((Integer) obj).intValue());
            case 17:
                return zzqk.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzrb) {
                    return zzqk.zzk(((zzrb) obj).zza());
                }
                return zzqk.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.libraries.places.internal.zzrb) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.libraries.places.internal.zzrl) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.libraries.places.internal.zzud r2, java.lang.Object r3) {
        /*
            com.google.android.libraries.places.internal.zzrc.zza(r3)
            int[] r0 = com.google.android.libraries.places.internal.zzqs.zza
            com.google.android.libraries.places.internal.zzuk r2 = r2.zza()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzsk
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzrl
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzrb
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzpx
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
            switch-data {1->0x0040, 2->0x003d, 3->0x003a, 4->0x0037, 5->0x0034, 6->0x0031, 7->0x0028, 8->0x001f, 9->0x0016, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqt.zza(com.google.android.libraries.places.internal.zzud, java.lang.Object):void");
    }

    static int zza(zzud zzud, int i, Object obj) {
        int zze = zzqk.zze(i);
        if (zzud == zzud.GROUP) {
            zzrc.zza((zzsk) obj);
            zze <<= 1;
        }
        return zze + zzb(zzud, obj);
    }

    static void zza(zzqk zzqk, zzud zzud, int i, Object obj) throws IOException {
        if (zzud == zzud.GROUP) {
            zzsk zzsk = (zzsk) obj;
            zzrc.zza(zzsk);
            zzqk.zza(i, 3);
            zzsk.zza(zzqk);
            zzqk.zza(i, 4);
            return;
        }
        zzqk.zza(i, zzud.zzb());
        switch (zzqs.zzb[zzud.ordinal()]) {
            case 1:
                zzqk.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzqk.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzqk.zza(((Long) obj).longValue());
                return;
            case 4:
                zzqk.zza(((Long) obj).longValue());
                return;
            case 5:
                zzqk.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzqk.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzqk.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzqk.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzsk) obj).zza(zzqk);
                return;
            case 10:
                zzqk.zza((zzsk) obj);
                return;
            case 11:
                if (obj instanceof zzpx) {
                    zzqk.zza((zzpx) obj);
                    return;
                } else {
                    zzqk.zza((String) obj);
                    return;
                }
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                if (obj instanceof zzpx) {
                    zzqk.zza((zzpx) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzqk.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzqk.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzqk.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzqk.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzqk.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzqk.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzrb) {
                    zzqk.zza(((zzrb) obj).zza());
                    return;
                } else {
                    zzqk.zza(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
