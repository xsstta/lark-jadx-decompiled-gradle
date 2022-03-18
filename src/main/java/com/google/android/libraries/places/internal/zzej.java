package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class zzej {
    private static double zza(double d) {
        if (d <= 0.03928d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    private static double zza(int i) {
        return (zza(((double) Color.red(i)) / 255.0d) * 0.2126d) + (zza(((double) Color.green(i)) / 255.0d) * 0.7152d) + (zza(((double) Color.blue(i)) / 255.0d) * 0.0722d);
    }

    private static double zza(double d, double d2) {
        return ((double) Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d)) / 100.0d;
    }

    public static void zza(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(rgb, PorterDuff.Mode.SRC_ATOP);
        mutate.setAlpha(Color.alpha(i));
    }

    public static int zza(int i, int i2, int i3) {
        if (zzb(i, i2, i3)) {
            return i3;
        }
        return i2;
    }

    public static boolean zzb(int i, int i2, int i3) {
        double zza = zza(i);
        double zza2 = zza(zza(i2), zza);
        if (zza2 <= 3.0d && zza2 <= zza(zza(i3), zza)) {
            return true;
        }
        return false;
    }
}
