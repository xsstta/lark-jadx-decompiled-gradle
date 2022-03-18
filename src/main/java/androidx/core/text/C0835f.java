package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.f */
public final class C0835f {

    /* renamed from: a */
    private static final Locale f3310a = new Locale("", "");

    /* renamed from: b */
    private static int m3982b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        if (directionality == 1 || directionality == 2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m3981a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f3310a)) {
            return 0;
        }
        String a = C0823b.m3957a(locale);
        if (a == null) {
            return m3982b(locale);
        }
        if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
            return 1;
        }
        return 0;
    }
}
