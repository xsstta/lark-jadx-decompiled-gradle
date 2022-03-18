package com.google.android.libraries.places.internal;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;

final class zzhc extends zzhe {
    private final char[] zzb;

    private zzhc(zzhd zzhd) {
        super(zzhd, null);
        boolean z;
        this.zzb = new char[MediaPlayer.MEDIA_PLAYER_OPTION_APPID];
        if (zzhd.zza(zzhd).length == 16) {
            z = true;
        } else {
            z = false;
        }
        zzft.zza(z);
        for (int i = 0; i < 256; i++) {
            this.zzb[i] = zzhd.zza(i >>> 4);
            this.zzb[i | DynamicModule.f58006b] = zzhd.zza(i & 15);
        }
    }

    zzhc(String str, String str2) {
        this(new zzhd(str, str2.toCharArray()));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzha, com.google.android.libraries.places.internal.zzhe
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzft.zza(appendable);
        zzft.zza(0, i2 + 0, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3 + 0] & 255;
            appendable.append(this.zzb[i4]);
            appendable.append(this.zzb[i4 | DynamicModule.f58006b]);
        }
    }
}
