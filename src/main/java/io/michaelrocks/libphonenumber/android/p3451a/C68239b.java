package io.michaelrocks.libphonenumber.android.p3451a;

import io.michaelrocks.libphonenumber.android.Phonemetadata;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.michaelrocks.libphonenumber.android.a.b */
public final class C68239b implements AbstractC68238a {

    /* renamed from: a */
    private final C68240c f171500a = new C68240c(100);

    /* renamed from: a */
    public static AbstractC68238a m264938a() {
        return new C68239b();
    }

    private C68239b() {
    }

    /* renamed from: a */
    private static boolean m264939a(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }

    @Override // io.michaelrocks.libphonenumber.android.p3451a.AbstractC68238a
    /* renamed from: a */
    public boolean mo237415a(CharSequence charSequence, Phonemetadata.PhoneNumberDesc phoneNumberDesc, boolean z) {
        String nationalNumberPattern = phoneNumberDesc.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        return m264939a(charSequence, this.f171500a.mo237416a(nationalNumberPattern), z);
    }
}
