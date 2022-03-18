package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

final class zzso<T> implements zzsx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zztv.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzsk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzsp zzo;
    private final zzru zzp;
    private final zztp<?, ?> zzq;
    private final zzqo<?> zzr;
    private final zzsd zzs;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.libraries.places.internal.zzsz.zza(com.google.android.libraries.places.internal.zztv.zzf(r10, r6), com.google.android.libraries.places.internal.zztv.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.libraries.places.internal.zztv.zzb(r10, r6) == com.google.android.libraries.places.internal.zztv.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.libraries.places.internal.zztv.zza(r10, r6) == com.google.android.libraries.places.internal.zztv.zza(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.libraries.places.internal.zztv.zzb(r10, r6) == com.google.android.libraries.places.internal.zztv.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.libraries.places.internal.zztv.zza(r10, r6) == com.google.android.libraries.places.internal.zztv.zza(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.libraries.places.internal.zztv.zza(r10, r6) == com.google.android.libraries.places.internal.zztv.zza(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.libraries.places.internal.zztv.zza(r10, r6) == com.google.android.libraries.places.internal.zztv.zza(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.libraries.places.internal.zzsz.zza(com.google.android.libraries.places.internal.zztv.zzf(r10, r6), com.google.android.libraries.places.internal.zztv.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.libraries.places.internal.zzsz.zza(com.google.android.libraries.places.internal.zztv.zzf(r10, r6), com.google.android.libraries.places.internal.zztv.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.libraries.places.internal.zzsz.zza(com.google.android.libraries.places.internal.zztv.zzf(r10, r6), com.google.android.libraries.places.internal.zztv.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.libraries.places.internal.zztv.zzc(r10, r6) == com.google.android.libraries.places.internal.zztv.zzc(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.libraries.places.internal.zztv.zza(r10, r6) == com.google.android.libraries.places.internal.zztv.zza(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.libraries.places.internal.zztv.zzb(r10, r6) == com.google.android.libraries.places.internal.zztv.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.libraries.places.internal.zztv.zza(r10, r6) == com.google.android.libraries.places.internal.zztv.zza(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.libraries.places.internal.zztv.zzb(r10, r6) == com.google.android.libraries.places.internal.zztv.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.libraries.places.internal.zztv.zzb(r10, r6) == com.google.android.libraries.places.internal.zztv.zzb(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zztv.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zztv.zzd(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zztv.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zztv.zze(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.libraries.places.internal.zzsz.zza(com.google.android.libraries.places.internal.zztv.zzf(r10, r6), com.google.android.libraries.places.internal.zztv.zzf(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // com.google.android.libraries.places.internal.zzsx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzso.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final int zza(T t) {
        int i;
        int i2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzc2 = zzc(i4);
            int i5 = this.zzc[i4];
            long j = (long) (1048575 & zzc2);
            int i6 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    i = zzrc.zza(Double.doubleToLongBits(zztv.zze(t, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(zztv.zzd(t, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = zzrc.zza(zztv.zzb(t, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = zzrc.zza(zztv.zzb(t, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = zztv.zza(t, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = zzrc.zza(zztv.zzb(t, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = zztv.zza(t, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = zzrc.zza(zztv.zzc(t, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) zztv.zzf(t, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object zzf2 = zztv.zzf(t, j);
                    if (zzf2 != null) {
                        i6 = zzf2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = zztv.zzf(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = zztv.zza(t, j);
                    i3 = i2 + i;
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    i2 = i3 * 53;
                    i = zztv.zza(t, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = zztv.zza(t, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = zzrc.zza(zztv.zzb(t, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = zztv.zza(t, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = zzrc.zza(zztv.zzb(t, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object zzf3 = zztv.zzf(t, j);
                    if (zzf3 != null) {
                        i6 = zzf3.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                case 26:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                case 29:
                case 30:
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    i = zztv.zzf(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                    i2 = i3 * 53;
                    i = zztv.zzf(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 51:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(Double.doubleToLongBits(zzb(t, j)));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = Float.floatToIntBits(zzc(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(zze(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(zze(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzd(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(zze(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzd(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(zzf(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) zztv.zzf(t, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zztv.zzf(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zztv.zzf(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzd(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzd(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzd(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(zze(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzd(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzrc.zza(zze(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zztv.zzf(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzq.zza(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza((Object) t).hashCode() : hashCode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    @Override // com.google.android.libraries.places.internal.zzsx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.libraries.places.internal.zzuj r15) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 2916
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzso.zza(java.lang.Object, com.google.android.libraries.places.internal.zzuj):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.libraries.places.internal.zzsx */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzsx zzsx) {
        return zzsx.zzc(zztv.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzj) {
            return zza((Object) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i, int i2) {
        return zztv.zza(t, (long) (zzd(i2) & 1048575)) == i;
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private final int zzd(int i) {
        return this.zzc[i + 2];
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzsx zza(int i) {
        int i2 = (i / 3) << 1;
        zzsx zzsx = (zzsx) this.zzd[i2];
        if (zzsx != null) {
            return zzsx;
        }
        zzsx<T> zza2 = zzsw.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final void zzb(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzc2 = (long) (zzc(this.zzl[i2]) & 1048575);
            Object zzf2 = zztv.zzf(t, zzc2);
            if (zzf2 != null) {
                zztv.zza(t, zzc2, this.zzs.zzb(zzf2));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zza(t, (long) this.zzl[i]);
            i++;
        }
        this.zzq.zzb(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.libraries.places.internal.zzsx] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.libraries.places.internal.zzsx] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.libraries.places.internal.zzsx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc(T r14) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzso.zzc(java.lang.Object):boolean");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.libraries.places.internal.zzsx
    public final int zzd(T t) {
        int i;
        int i2;
        long j;
        int i3;
        int zzb2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int zzb3;
        int i10;
        int i11;
        int i12;
        int i13 = 267386880;
        int i14 = 1;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i15 = 0;
            int i16 = 0;
            while (i15 < this.zzc.length) {
                int zzc2 = zzc(i15);
                int i17 = (zzc2 & i13) >>> 20;
                int i18 = this.zzc[i15];
                long j2 = (long) (zzc2 & 1048575);
                if (i17 < zzqu.DOUBLE_LIST_PACKED.zza() || i17 > zzqu.SINT64_LIST_PACKED.zza()) {
                    i9 = 0;
                } else {
                    i9 = this.zzc[i15 + 2] & 1048575;
                }
                switch (i17) {
                    case 0:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzb(i18, 0.0d);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 1:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzb(i18, (float) BitmapDescriptorFactory.HUE_RED);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 2:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzd(i18, zztv.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 3:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zze(i18, zztv.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 4:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzf(i18, zztv.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 5:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzg(i18, 0L);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 6:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzi(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 7:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzb(i18, true);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 8:
                        if (zza((Object) t, i15)) {
                            Object zzf2 = zztv.zzf(t, j2);
                            if (zzf2 instanceof zzpx) {
                                zzb3 = zzqk.zzc(i18, (zzpx) zzf2);
                                break;
                            } else {
                                zzb3 = zzqk.zzb(i18, (String) zzf2);
                                break;
                            }
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 9:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzsz.zza(i18, zztv.zzf(t, j2), zza(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 10:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzc(i18, (zzpx) zztv.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 11:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzg(i18, zztv.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzk(i18, zztv.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 13:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzj(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 14:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzh(i18, 0L);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 15:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzh(i18, zztv.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 16:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzf(i18, zztv.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 17:
                        if (zza((Object) t, i15)) {
                            zzb3 = zzqk.zzc(i18, (zzsk) zztv.zzf(t, j2), zza(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 18:
                        zzb3 = zzsz.zzi(i18, zza(t, j2), false);
                        break;
                    case 19:
                        zzb3 = zzsz.zzh(i18, zza(t, j2), false);
                        break;
                    case 20:
                        zzb3 = zzsz.zza(i18, (List<Long>) zza(t, j2), false);
                        break;
                    case 21:
                        zzb3 = zzsz.zzb(i18, (List<Long>) zza(t, j2), false);
                        break;
                    case 22:
                        zzb3 = zzsz.zze(i18, zza(t, j2), false);
                        break;
                    case 23:
                        zzb3 = zzsz.zzi(i18, zza(t, j2), false);
                        break;
                    case 24:
                        zzb3 = zzsz.zzh(i18, zza(t, j2), false);
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        zzb3 = zzsz.zzj(i18, zza(t, j2), false);
                        break;
                    case 26:
                        zzb3 = zzsz.zza(i18, zza(t, j2));
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                        zzb3 = zzsz.zza(i18, zza(t, j2), zza(i15));
                        break;
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        zzb3 = zzsz.zzb(i18, zza(t, j2));
                        break;
                    case 29:
                        zzb3 = zzsz.zzf(i18, zza(t, j2), false);
                        break;
                    case 30:
                        zzb3 = zzsz.zzd(i18, zza(t, j2), false);
                        break;
                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                        zzb3 = zzsz.zzh(i18, zza(t, j2), false);
                        break;
                    case 32:
                        zzb3 = zzsz.zzi(i18, zza(t, j2), false);
                        break;
                    case 33:
                        zzb3 = zzsz.zzg(i18, zza(t, j2), false);
                        break;
                    case 34:
                        zzb3 = zzsz.zzc(i18, zza(t, j2), false);
                        break;
                    case 35:
                        i11 = zzsz.zzi((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 36:
                        i11 = zzsz.zzh((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 37:
                        i11 = zzsz.zza((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 38:
                        i11 = zzsz.zzb((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 39:
                        i11 = zzsz.zze((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 40:
                        i11 = zzsz.zzi((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 41:
                        i11 = zzsz.zzh((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 42:
                        i11 = zzsz.zzj((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 43:
                        i11 = zzsz.zzf((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 44:
                        i11 = zzsz.zzd((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 45:
                        i11 = zzsz.zzh((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 46:
                        i11 = zzsz.zzi((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 47:
                        i11 = zzsz.zzg((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 48:
                        i11 = zzsz.zzc((List) unsafe.getObject(t, j2));
                        if (i11 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, (long) i9, i11);
                            }
                            i12 = zzqk.zze(i18);
                            i10 = zzqk.zzg(i11);
                            zzb3 = i12 + i10 + i11;
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 49:
                        zzb3 = zzsz.zzb(i18, (List<zzsk>) zza(t, j2), zza(i15));
                        break;
                    case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                        zzb3 = this.zzs.zza(i18, zztv.zzf(t, j2), zzb(i15));
                        break;
                    case 51:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzb(i18, 0.0d);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 52:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzb(i18, (float) BitmapDescriptorFactory.HUE_RED);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 53:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzd(i18, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 54:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zze(i18, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 55:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzf(i18, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 56:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzg(i18, 0L);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 57:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzi(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 58:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzb(i18, true);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 59:
                        if (zza(t, i18, i15)) {
                            Object zzf3 = zztv.zzf(t, j2);
                            if (zzf3 instanceof zzpx) {
                                zzb3 = zzqk.zzc(i18, (zzpx) zzf3);
                                break;
                            } else {
                                zzb3 = zzqk.zzb(i18, (String) zzf3);
                                break;
                            }
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 60:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzsz.zza(i18, zztv.zzf(t, j2), zza(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 61:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzc(i18, (zzpx) zztv.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 62:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzg(i18, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 63:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzk(i18, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 64:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzj(i18, 0);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 65:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzh(i18, 0L);
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 66:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzh(i18, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 67:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzf(i18, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    case 68:
                        if (zza(t, i18, i15)) {
                            zzb3 = zzqk.zzc(i18, (zzsk) zztv.zzf(t, j2), zza(i15));
                            break;
                        } else {
                            continue;
                            i15 += 3;
                            i13 = 267386880;
                        }
                    default:
                        i15 += 3;
                        i13 = 267386880;
                }
                i16 += zzb3;
                i15 += 3;
                i13 = 267386880;
            }
            return i16 + zza((zztp) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < this.zzc.length) {
            int zzc3 = zzc(i20);
            int[] iArr = this.zzc;
            int i23 = iArr[i20];
            int i24 = (zzc3 & 267386880) >>> 20;
            if (i24 <= 17) {
                int i25 = iArr[i20 + 2];
                int i26 = i25 & 1048575;
                i = i14 << (i25 >>> 20);
                if (i26 != i19) {
                    i22 = unsafe2.getInt(t, (long) i26);
                    i19 = i26;
                }
                i2 = i25;
            } else {
                if (!this.zzk || i24 < zzqu.DOUBLE_LIST_PACKED.zza() || i24 > zzqu.SINT64_LIST_PACKED.zza()) {
                    i2 = 0;
                } else {
                    i2 = this.zzc[i20 + 2] & 1048575;
                }
                i = 0;
            }
            long j3 = (long) (zzc3 & 1048575);
            switch (i24) {
                case 0:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i21 += zzqk.zzb(i23, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i21 += zzqk.zzb(i23, (float) BitmapDescriptorFactory.HUE_RED);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zzqk.zzd(i23, unsafe2.getLong(t, j3));
                        i21 += i3;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zzqk.zze(i23, unsafe2.getLong(t, j3));
                        i21 += i3;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zzqk.zzf(i23, unsafe2.getInt(t, j3));
                        i21 += i3;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zzqk.zzg(i23, 0L);
                        i21 += i3;
                    }
                    break;
                case 6:
                    if ((i22 & i) != 0) {
                        i21 += zzqk.zzi(i23, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i22 & i) != 0) {
                        i21 += zzqk.zzb(i23, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i22 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzpx) {
                            zzb2 = zzqk.zzc(i23, (zzpx) object);
                        } else {
                            zzb2 = zzqk.zzb(i23, (String) object);
                        }
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i22 & i) != 0) {
                        zzb2 = zzsz.zza(i23, unsafe2.getObject(t, j3), zza(i20));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzc(i23, (zzpx) unsafe2.getObject(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzg(i23, unsafe2.getInt(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzk(i23, unsafe2.getInt(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i22 & i) != 0) {
                        i4 = zzqk.zzj(i23, 0);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzh(i23, 0L);
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzh(i23, unsafe2.getInt(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzf(i23, unsafe2.getLong(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i22 & i) != 0) {
                        zzb2 = zzqk.zzc(i23, (zzsk) unsafe2.getObject(t, j3), zza(i20));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb2 = zzsz.zzi(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += zzb2;
                    j = 0;
                    break;
                case 19:
                    i5 = zzsz.zzh(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 20:
                    i5 = zzsz.zza(i23, (List<Long>) ((List) unsafe2.getObject(t, j3)), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 21:
                    i5 = zzsz.zzb(i23, (List<Long>) ((List) unsafe2.getObject(t, j3)), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 22:
                    i5 = zzsz.zze(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 23:
                    i5 = zzsz.zzi(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 24:
                    i5 = zzsz.zzh(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    i5 = zzsz.zzj(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 26:
                    zzb2 = zzsz.zza(i23, (List) unsafe2.getObject(t, j3));
                    i21 += zzb2;
                    j = 0;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                    zzb2 = zzsz.zza(i23, (List<?>) ((List) unsafe2.getObject(t, j3)), zza(i20));
                    i21 += zzb2;
                    j = 0;
                    break;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    zzb2 = zzsz.zzb(i23, (List) unsafe2.getObject(t, j3));
                    i21 += zzb2;
                    j = 0;
                    break;
                case 29:
                    zzb2 = zzsz.zzf(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += zzb2;
                    j = 0;
                    break;
                case 30:
                    i5 = zzsz.zzd(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    i5 = zzsz.zzh(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 32:
                    i5 = zzsz.zzi(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 33:
                    i5 = zzsz.zzg(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 34:
                    i5 = zzsz.zzc(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 35:
                    i8 = zzsz.zzi((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 36:
                    i8 = zzsz.zzh((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 37:
                    i8 = zzsz.zza((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 38:
                    i8 = zzsz.zzb((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 39:
                    i8 = zzsz.zze((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 40:
                    i8 = zzsz.zzi((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 41:
                    i8 = zzsz.zzh((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 42:
                    i8 = zzsz.zzj((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 43:
                    i8 = zzsz.zzf((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 44:
                    i8 = zzsz.zzd((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 45:
                    i8 = zzsz.zzh((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 46:
                    i8 = zzsz.zzi((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 47:
                    i8 = zzsz.zzg((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 48:
                    i8 = zzsz.zzc((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zzqk.zze(i23);
                        i6 = zzqk.zzg(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 49:
                    zzb2 = zzsz.zzb(i23, (List) unsafe2.getObject(t, j3), zza(i20));
                    i21 += zzb2;
                    j = 0;
                    break;
                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                    zzb2 = this.zzs.zza(i23, unsafe2.getObject(t, j3), zzb(i20));
                    i21 += zzb2;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzb(i23, 0.0d);
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i23, i20)) {
                        i4 = zzqk.zzb(i23, (float) BitmapDescriptorFactory.HUE_RED);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzd(i23, zze(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zze(i23, zze(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzf(i23, zzd(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzg(i23, 0L);
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i23, i20)) {
                        i4 = zzqk.zzi(i23, 0);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i23, i20)) {
                        i4 = zzqk.zzb(i23, true);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i23, i20)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzpx) {
                            zzb2 = zzqk.zzc(i23, (zzpx) object2);
                        } else {
                            zzb2 = zzqk.zzb(i23, (String) object2);
                        }
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzsz.zza(i23, unsafe2.getObject(t, j3), zza(i20));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzc(i23, (zzpx) unsafe2.getObject(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzg(i23, zzd(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzk(i23, zzd(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i23, i20)) {
                        i4 = zzqk.zzj(i23, 0);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzh(i23, 0L);
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzh(i23, zzd(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzf(i23, zze(t, j3));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i23, i20)) {
                        zzb2 = zzqk.zzc(i23, (zzsk) unsafe2.getObject(t, j3), zza(i20));
                        i21 += zzb2;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i20 += 3;
            i14 = 1;
        }
        int i27 = 0;
        int zza2 = i21 + zza((zztp) this.zzq, (Object) t);
        if (!this.zzh) {
            return zza2;
        }
        zzqt<?> zza3 = this.zzr.zza((Object) t);
        for (int i28 = 0; i28 < zza3.zza.zzc(); i28++) {
            Map.Entry<T, Object> zzb4 = zza3.zza.zzb(i28);
            i27 += zzqt.zza((zzqv<?>) zzb4.getKey(), zzb4.getValue());
        }
        for (Map.Entry<T, Object> entry : zza3.zza.zzd()) {
            i27 += zzqt.zza((zzqv<?>) entry.getKey(), entry.getValue());
        }
        return zza2 + i27;
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zztv.zzf(obj, j);
    }

    private static <UT, UB> int zza(zztp<UT, UB> zztp, T t) {
        return zztp.zzd(zztp.zza(t));
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zztv.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zztv.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zztv.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zztv.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zztv.zzf(t, j)).booleanValue();
    }

    private final void zzb(T t, int i) {
        if (!this.zzj) {
            int zzd2 = zzd(i);
            long j = (long) (zzd2 & 1048575);
            zztv.zza((Object) t, j, zztv.zza(t, j) | (1 << (zzd2 >>> 20)));
        }
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final void zzb(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc2 = zzc(i);
            long j = (long) (1048575 & zzc2);
            int i2 = this.zzc[i];
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    if (zza((Object) t2, i)) {
                        zztv.zza(t, j, zztv.zze(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zzd(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zzb(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zzb(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zza(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zzb(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zza(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((Object) t2, i)) {
                        zztv.zza(t, j, zztv.zzc(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((Object) t2, i)) {
                        zztv.zza(t, j, zztv.zzf(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((Object) t2, i)) {
                        zztv.zza(t, j, zztv.zzf(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zza(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zza(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zza(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zzb(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zza(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((Object) t2, i)) {
                        zztv.zza((Object) t, j, zztv.zzb(t2, j));
                        zzb((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                case 26:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                case 29:
                case 30:
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t, t2, j);
                    break;
                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                    zzsz.zza(this.zzs, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza(t2, i2, i)) {
                        zztv.zza(t, j, zztv.zzf(t2, j));
                        zzb(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(t2, i2, i)) {
                        zztv.zza(t, j, zztv.zzf(t2, j));
                        zzb(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzsz.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzsz.zza(this.zzr, t, t2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r19, com.google.android.libraries.places.internal.zzuj r20) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzso.zzb(java.lang.Object, com.google.android.libraries.places.internal.zzuj):void");
    }

    private final boolean zza(T t, int i) {
        if (this.zzj) {
            int zzc2 = zzc(i);
            long j = (long) (zzc2 & 1048575);
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    if (zztv.zze(t, j) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (zztv.zzd(t, j) != BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zztv.zzb(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zztv.zzb(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zztv.zza(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zztv.zzb(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zztv.zza(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zztv.zzc(t, j);
                case 8:
                    Object zzf2 = zztv.zzf(t, j);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzf2 instanceof zzpx)) {
                        throw new IllegalArgumentException();
                    } else if (!zzpx.zza.equals(zzf2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zztv.zzf(t, j) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzpx.zza.equals(zztv.zzf(t, j))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zztv.zza(t, j) != 0) {
                        return true;
                    }
                    return false;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    if (zztv.zza(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zztv.zza(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zztv.zzb(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zztv.zza(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zztv.zzb(t, j) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zztv.zzf(t, j) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzd2 = zzd(i);
            if ((zztv.zza(t, (long) (zzd2 & 1048575)) & (1 << (zzd2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    private static void zza(int i, Object obj, zzuj zzuj) throws IOException {
        if (obj instanceof String) {
            zzuj.zza(i, (String) obj);
        } else {
            zzuj.zza(i, (zzpx) obj);
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        if (zza((Object) t, i) == zza((Object) t2, i)) {
            return true;
        }
        return false;
    }

    private final void zzb(T t, int i, int i2) {
        zztv.zza((Object) t, (long) (zzd(i2) & 1048575), i);
    }

    private static <UT, UB> void zza(zztp<UT, UB> zztp, T t, zzuj zzuj) throws IOException {
        zztp.zza(zztp.zza(t), zzuj);
    }

    private final void zzb(T t, T t2, int i) {
        int zzc2 = zzc(i);
        int i2 = this.zzc[i];
        long j = (long) (zzc2 & 1048575);
        if (zza(t2, i2, i)) {
            Object zzf2 = zztv.zzf(t, j);
            Object zzf3 = zztv.zzf(t2, j);
            if (zzf2 != null && zzf3 != null) {
                zztv.zza(t, j, zzrc.zza(zzf2, zzf3));
                zzb(t, i2, i);
            } else if (zzf3 != null) {
                zztv.zza(t, j, zzf3);
                zzb(t, i2, i);
            }
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzc2 = (long) (zzc(i) & 1048575);
        if (zza((Object) t2, i)) {
            Object zzf2 = zztv.zzf(t, zzc2);
            Object zzf3 = zztv.zzf(t2, zzc2);
            if (zzf2 != null && zzf3 != null) {
                zztv.zza(t, zzc2, zzrc.zza(zzf2, zzf3));
                zzb((Object) t, i);
            } else if (zzf3 != null) {
                zztv.zza(t, zzc2, zzf3);
                zzb((Object) t, i);
            }
        }
    }

    private final <K, V> void zza(zzuj zzuj, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzuj.zza(i, this.zzs.zzc(zzb(i2)), this.zzs.zza(obj));
        }
    }

    static <T> zzso<T> zza(Class<T> cls, zzsi zzsi, zzsp zzsp, zzru zzru, zztp<?, ?> zztp, zzqo<?> zzqo, zzsd zzsd) {
        boolean z;
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        zzsy zzsy;
        int i11;
        Class<?> cls2;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Field field;
        int i19;
        char charAt;
        int i20;
        Field field2;
        Field field3;
        int i21;
        char charAt2;
        int i22;
        char charAt3;
        int i23;
        char charAt4;
        int i24;
        int i25;
        char charAt5;
        int i26;
        char charAt6;
        int i27;
        char charAt7;
        int i28;
        char charAt8;
        int i29;
        char charAt9;
        int i30;
        char charAt10;
        int i31;
        char charAt11;
        int i32;
        char charAt12;
        int i33;
        char charAt13;
        char charAt14;
        if (zzsi instanceof zzsy) {
            zzsy zzsy2 = (zzsy) zzsi;
            int i34 = 0;
            if (zzsy2.zza() == zzqy.zze.zzi) {
                z = true;
            } else {
                z = false;
            }
            String zzd2 = zzsy2.zzd();
            int length = zzd2.length();
            int charAt15 = zzd2.charAt(0);
            if (charAt15 >= 55296) {
                int i35 = charAt15 & 8191;
                int i36 = 1;
                int i37 = 13;
                while (true) {
                    i = i36 + 1;
                    charAt14 = zzd2.charAt(i36);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i35 |= (charAt14 & 8191) << i37;
                    i37 += 13;
                    i36 = i;
                }
                charAt15 = i35 | (charAt14 << i37);
            } else {
                i = 1;
            }
            int i38 = i + 1;
            int charAt16 = zzd2.charAt(i);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i33 = i38 + 1;
                    charAt13 = zzd2.charAt(i38);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i39 |= (charAt13 & 8191) << i40;
                    i40 += 13;
                    i38 = i33;
                }
                charAt16 = i39 | (charAt13 << i40);
                i38 = i33;
            }
            if (charAt16 == 0) {
                iArr = zza;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int i41 = i38 + 1;
                int charAt17 = zzd2.charAt(i38);
                if (charAt17 >= 55296) {
                    int i42 = charAt17 & 8191;
                    int i43 = 13;
                    while (true) {
                        i32 = i41 + 1;
                        charAt12 = zzd2.charAt(i41);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i42 |= (charAt12 & 8191) << i43;
                        i43 += 13;
                        i41 = i32;
                    }
                    charAt17 = i42 | (charAt12 << i43);
                    i41 = i32;
                }
                int i44 = i41 + 1;
                int charAt18 = zzd2.charAt(i41);
                if (charAt18 >= 55296) {
                    int i45 = charAt18 & 8191;
                    int i46 = 13;
                    while (true) {
                        i31 = i44 + 1;
                        charAt11 = zzd2.charAt(i44);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i45 |= (charAt11 & 8191) << i46;
                        i46 += 13;
                        i44 = i31;
                    }
                    charAt18 = i45 | (charAt11 << i46);
                    i44 = i31;
                }
                int i47 = i44 + 1;
                i5 = zzd2.charAt(i44);
                if (i5 >= 55296) {
                    int i48 = i5 & 8191;
                    int i49 = 13;
                    while (true) {
                        i30 = i47 + 1;
                        charAt10 = zzd2.charAt(i47);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i48 |= (charAt10 & 8191) << i49;
                        i49 += 13;
                        i47 = i30;
                    }
                    i5 = i48 | (charAt10 << i49);
                    i47 = i30;
                }
                int i50 = i47 + 1;
                int charAt19 = zzd2.charAt(i47);
                if (charAt19 >= 55296) {
                    int i51 = charAt19 & 8191;
                    int i52 = 13;
                    while (true) {
                        i29 = i50 + 1;
                        charAt9 = zzd2.charAt(i50);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i51 |= (charAt9 & 8191) << i52;
                        i52 += 13;
                        i50 = i29;
                    }
                    charAt19 = i51 | (charAt9 << i52);
                    i50 = i29;
                }
                int i53 = i50 + 1;
                i3 = zzd2.charAt(i50);
                if (i3 >= 55296) {
                    int i54 = i3 & 8191;
                    int i55 = 13;
                    while (true) {
                        i28 = i53 + 1;
                        charAt8 = zzd2.charAt(i53);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i54 |= (charAt8 & 8191) << i55;
                        i55 += 13;
                        i53 = i28;
                    }
                    i3 = i54 | (charAt8 << i55);
                    i53 = i28;
                }
                int i56 = i53 + 1;
                int charAt20 = zzd2.charAt(i53);
                if (charAt20 >= 55296) {
                    int i57 = charAt20 & 8191;
                    int i58 = 13;
                    while (true) {
                        i27 = i56 + 1;
                        charAt7 = zzd2.charAt(i56);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i57 |= (charAt7 & 8191) << i58;
                        i58 += 13;
                        i56 = i27;
                    }
                    charAt20 = i57 | (charAt7 << i58);
                    i56 = i27;
                }
                int i59 = i56 + 1;
                int charAt21 = zzd2.charAt(i56);
                if (charAt21 >= 55296) {
                    int i60 = charAt21 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i26 = i61 + 1;
                        charAt6 = zzd2.charAt(i61);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i60 |= (charAt6 & 8191) << i62;
                        i62 += 13;
                        i61 = i26;
                    }
                    charAt21 = i60 | (charAt6 << i62);
                    i24 = i26;
                } else {
                    i24 = i59;
                }
                int i63 = i24 + 1;
                int charAt22 = zzd2.charAt(i24);
                if (charAt22 >= 55296) {
                    int i64 = charAt22 & 8191;
                    int i65 = i63;
                    int i66 = 13;
                    while (true) {
                        i25 = i65 + 1;
                        charAt5 = zzd2.charAt(i65);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i64 |= (charAt5 & 8191) << i66;
                        i66 += 13;
                        i65 = i25;
                    }
                    charAt22 = i64 | (charAt5 << i66);
                    i63 = i25;
                }
                int i67 = (charAt17 << 1) + charAt18;
                i6 = charAt19;
                i4 = i67;
                i2 = charAt22;
                i34 = charAt17;
                i38 = i63;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                i7 = charAt20;
            }
            Unsafe unsafe = zzb;
            Object[] zze2 = zzsy2.zze();
            Class<?> cls3 = zzsy2.zzc().getClass();
            int[] iArr2 = new int[(i3 * 3)];
            Object[] objArr = new Object[(i3 << 1)];
            int i68 = i2 + i7;
            int i69 = i2;
            int i70 = i38;
            int i71 = i68;
            int i72 = 0;
            int i73 = 0;
            while (i70 < length) {
                int i74 = i70 + 1;
                int charAt23 = zzd2.charAt(i70);
                if (charAt23 >= 55296) {
                    int i75 = charAt23 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i23 = i76 + 1;
                        charAt4 = zzd2.charAt(i76);
                        i8 = i2;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i75 |= (charAt4 & 8191) << i77;
                        i77 += 13;
                        i76 = i23;
                        i2 = i8;
                    }
                    charAt23 = i75 | (charAt4 << i77);
                    i9 = i23;
                } else {
                    i8 = i2;
                    i9 = i74;
                }
                int i78 = i9 + 1;
                int charAt24 = zzd2.charAt(i9);
                if (charAt24 >= 55296) {
                    int i79 = charAt24 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i22 = i80 + 1;
                        charAt3 = zzd2.charAt(i80);
                        z2 = z;
                        if (charAt3 < 55296) {
                            break;
                        }
                        i79 |= (charAt3 & 8191) << i81;
                        i81 += 13;
                        i80 = i22;
                        z = z2;
                    }
                    charAt24 = i79 | (charAt3 << i81);
                    i10 = i22;
                } else {
                    z2 = z;
                    i10 = i78;
                }
                int i82 = charAt24 & 255;
                if ((charAt24 & 1024) != 0) {
                    iArr[i72] = i73;
                    i72++;
                }
                if (i82 >= 51) {
                    int i83 = i10 + 1;
                    int charAt25 = zzd2.charAt(i10);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i84 = charAt25 & 8191;
                        int i85 = 13;
                        while (true) {
                            i21 = i83 + 1;
                            charAt2 = zzd2.charAt(i83);
                            if (charAt2 < c) {
                                break;
                            }
                            i84 |= (charAt2 & 8191) << i85;
                            i85 += 13;
                            i83 = i21;
                            c = 55296;
                        }
                        charAt25 = i84 | (charAt2 << i85);
                        i83 = i21;
                    }
                    int i86 = i82 - 51;
                    if (i86 == 9 || i86 == 17) {
                        objArr[((i73 / 3) << 1) + 1] = zze2[i4];
                        i4++;
                    } else if (i86 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i73 / 3) << 1) + 1] = zze2[i4];
                        i4++;
                    }
                    int i87 = charAt25 << 1;
                    Object obj = zze2[i87];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zza(cls3, (String) obj);
                        zze2[i87] = field2;
                    }
                    zzsy = zzsy2;
                    i14 = (int) unsafe.objectFieldOffset(field2);
                    int i88 = i87 + 1;
                    Object obj2 = zze2[i88];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zza(cls3, (String) obj2);
                        zze2[i88] = field3;
                    }
                    cls2 = cls3;
                    i11 = i4;
                    i10 = i83;
                    str = zzd2;
                    i12 = 0;
                    i13 = (int) unsafe.objectFieldOffset(field3);
                    i15 = i34;
                } else {
                    zzsy = zzsy2;
                    int i89 = i4 + 1;
                    Field zza2 = zza(cls3, (String) zze2[i4]);
                    if (i82 == 9 || i82 == 17) {
                        i18 = 1;
                        objArr[((i73 / 3) << 1) + 1] = zza2.getType();
                    } else {
                        if (i82 == 27 || i82 == 49) {
                            i18 = 1;
                            i20 = i89 + 1;
                            objArr[((i73 / 3) << 1) + 1] = zze2[i89];
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            i18 = 1;
                            if ((charAt15 & 1) == 1) {
                                i20 = i89 + 1;
                                objArr[((i73 / 3) << 1) + 1] = zze2[i89];
                            }
                        } else {
                            if (i82 == 50) {
                                int i90 = i69 + 1;
                                iArr[i69] = i73;
                                int i91 = (i73 / 3) << 1;
                                int i92 = i89 + 1;
                                objArr[i91] = zze2[i89];
                                if ((charAt24 & 2048) != 0) {
                                    i89 = i92 + 1;
                                    objArr[i91 + 1] = zze2[i92];
                                    i69 = i90;
                                } else {
                                    i89 = i92;
                                    i18 = 1;
                                    i69 = i90;
                                }
                            }
                            i18 = 1;
                        }
                        i89 = i20;
                    }
                    i14 = (int) unsafe.objectFieldOffset(zza2);
                    if ((charAt15 & 1) != i18 || i82 > 17) {
                        i11 = i89;
                        i15 = i34;
                        cls2 = cls3;
                        str = zzd2;
                        i13 = 0;
                        i12 = 0;
                    } else {
                        int i93 = i10 + 1;
                        str = zzd2;
                        int charAt26 = str.charAt(i10);
                        if (charAt26 >= 55296) {
                            int i94 = charAt26 & 8191;
                            int i95 = 13;
                            while (true) {
                                i19 = i93 + 1;
                                charAt = str.charAt(i93);
                                if (charAt < 55296) {
                                    break;
                                }
                                i94 |= (charAt & 8191) << i95;
                                i95 += 13;
                                i93 = i19;
                            }
                            charAt26 = i94 | (charAt << i95);
                            i93 = i19;
                        }
                        int i96 = (i34 << 1) + (charAt26 / 32);
                        Object obj3 = zze2[i96];
                        i11 = i89;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = zza(cls3, (String) obj3);
                            zze2[i96] = field;
                        }
                        i15 = i34;
                        cls2 = cls3;
                        i13 = (int) unsafe.objectFieldOffset(field);
                        i12 = charAt26 % 32;
                        i10 = i93;
                    }
                    if (i82 >= 18 && i82 <= 49) {
                        iArr[i71] = i14;
                        i71++;
                    }
                }
                int i97 = i73 + 1;
                iArr2[i73] = charAt23;
                int i98 = i97 + 1;
                if ((charAt24 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
                    i16 = 536870912;
                } else {
                    i16 = 0;
                }
                if ((charAt24 & DynamicModule.f58006b) != 0) {
                    i17 = 268435456;
                } else {
                    i17 = 0;
                }
                iArr2[i97] = i14 | i17 | i16 | (i82 << 20);
                i73 = i98 + 1;
                iArr2[i98] = (i12 << 20) | i13;
                i34 = i15;
                zzd2 = str;
                i70 = i10;
                cls3 = cls2;
                i6 = i6;
                length = length;
                i2 = i8;
                z = z2;
                i5 = i5;
                i4 = i11;
                zzsy2 = zzsy;
            }
            return new zzso<>(iArr2, objArr, i5, i6, zzsy2.zzc(), z, false, iArr, i2, i68, zzsp, zzru, zztp, zzqo, zzsd);
        }
        ((zztm) zzsi).zza();
        int i99 = zzqy.zze.zzi;
        throw new NoSuchMethodError();
    }

    private zzso(int[] iArr, Object[] objArr, int i, int i2, zzsk zzsk, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzsp zzsp, zzru zzru, zztp<?, ?> zztp, zzqo<?> zzqo, zzsd zzsd) {
        boolean z3;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzsk instanceof zzqy;
        this.zzj = z;
        if (zzqo == null || !zzqo.zza(zzsk)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzsp;
        this.zzp = zzru;
        this.zzq = zztp;
        this.zzr = zzqo;
        this.zzg = zzsk;
        this.zzs = zzsd;
    }
}
