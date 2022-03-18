package com.google.android.libraries.places.internal;

public abstract class zzfd {
    public abstract boolean zzb(char c);

    protected zzfd() {
    }

    public static zzfd zza(char c) {
        return new zzff('.');
    }

    /* access modifiers changed from: private */
    public static String zzd(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int zza(CharSequence charSequence, int i) {
        int length = charSequence.length();
        zzft.zza(i, length, "index");
        while (i < length) {
            if (zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
