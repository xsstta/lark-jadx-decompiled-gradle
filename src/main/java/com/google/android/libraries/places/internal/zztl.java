package com.google.android.libraries.places.internal;

import com.huawei.hms.android.HwBuildEx;

final class zztl {
    static String zza(zzpx zzpx) {
        zzto zzto = new zzto(zzpx);
        StringBuilder sb = new StringBuilder(zzto.zza());
        for (int i = 0; i < zzto.zza(); i++) {
            byte zza = zzto.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zza);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
