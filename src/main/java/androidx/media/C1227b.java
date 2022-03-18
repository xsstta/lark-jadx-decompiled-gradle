package androidx.media;

import android.media.AudioAttributes;

/* renamed from: androidx.media.b */
class C1227b implements AbstractC1224a {

    /* renamed from: a */
    AudioAttributes f4445a;

    /* renamed from: b */
    int f4446b = -1;

    C1227b() {
    }

    public int hashCode() {
        return this.f4445a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4445a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1227b)) {
            return false;
        }
        return this.f4445a.equals(((C1227b) obj).f4445a);
    }
}
