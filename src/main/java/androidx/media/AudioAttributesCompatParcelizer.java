package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4361a = (AbstractC1224a) versionedParcel.mo8090b(audioAttributesCompat.f4361a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo8084a(false, false);
        versionedParcel.mo8076a(audioAttributesCompat.f4361a, 1);
    }
}
