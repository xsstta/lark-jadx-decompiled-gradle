package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.Phonenumber;
import java.util.Arrays;

/* renamed from: io.michaelrocks.libphonenumber.android.h */
public final class C68249h {

    /* renamed from: a */
    private final int f171517a;

    /* renamed from: b */
    private final String f171518b;

    /* renamed from: c */
    private final Phonenumber.PhoneNumber f171519c;

    /* renamed from: a */
    public int mo237426a() {
        return this.f171517a;
    }

    /* renamed from: b */
    public int mo237427b() {
        return this.f171517a + this.f171518b.length();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f171517a), this.f171518b, this.f171519c});
    }

    public String toString() {
        return "PhoneNumberMatch [" + mo237426a() + "," + mo237427b() + ") " + this.f171518b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68249h)) {
            return false;
        }
        C68249h hVar = (C68249h) obj;
        if (!this.f171518b.equals(hVar.f171518b) || this.f171517a != hVar.f171517a || !this.f171519c.equals(hVar.f171519c)) {
            return false;
        }
        return true;
    }

    C68249h(int i, String str, Phonenumber.PhoneNumber phoneNumber) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str == null || phoneNumber == null) {
            throw null;
        } else {
            this.f171517a = i;
            this.f171518b = str;
            this.f171519c = phoneNumber;
        }
    }
}
